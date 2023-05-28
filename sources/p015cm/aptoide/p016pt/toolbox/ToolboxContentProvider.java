package p015cm.aptoide.p016pt.toolbox;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.account.AndroidAccountManagerPersistence;
import p015cm.aptoide.p016pt.account.FacebookSignUpAdapter;
import p015cm.aptoide.p016pt.account.GoogleSignUpAdapter;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.networking.Authentication;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p015cm.aptoide.p016pt.notification.PullingContentService;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxKeys;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.toolbox.ToolboxContentProvider */
public class ToolboxContentProvider extends ContentProvider {
    private static final String BACKUP_PACKAGE = "pt.aptoide.backupapps";
    private static final int CHANGE_PREFERENCE = 6;
    private static final int LOGIN_AVATAR = 9;
    private static final int LOGIN_NAME = 5;
    private static final int LOGIN_NICKNAME = 8;
    private static final int LOGIN_TYPE = 4;
    private static final int PASSHASH = 3;
    private static final int REFRESH_TOKEN = 7;
    private static final int REPO = 2;
    private static final int TOKEN = 1;
    private static final String UPLOADER_PACKAGE = "pt.caixamagica.aptoide.uploader";
    @Inject
    AptoideAccountManager accountManager;
    @Inject
    AuthenticationPersistence authenticationPersistence;
    private ToolboxSecurityManager securityManager;
    @Inject
    @Named
    SharedPreferences sharedPreferences;
    private UriMatcher uriMatcher;

    private MatrixCursor create(String str, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{str}, 1);
        matrixCursor.addRow(new String[]{str2});
        return matrixCursor;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.securityManager = new ToolboxSecurityManager(getContext().getPackageManager());
        UriMatcher uriMatcher2 = new UriMatcher(-1);
        this.uriMatcher = uriMatcher2;
        uriMatcher2.addURI(BuildConfig.CONTENT_AUTHORITY, "token", 1);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "refreshToken", 7);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "repo", 2);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "loginType", 4);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "passHash", 3);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "loginName", 5);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "changePreference", 6);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "loginNickname", 8);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "loginAvatar", 9);
        ((AptoideApplication) getContext().getApplicationContext()).getApplicationComponent().inject(this);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (this.securityManager.checkSignature(Binder.getCallingUid(), BuildConfig.SIGNATURE_BACKUP, BACKUP_PACKAGE) || this.securityManager.checkSignature(Binder.getCallingUid(), BuildConfig.SIGNATURE_UPLOADER, UPLOADER_PACKAGE)) {
            Authentication a = this.authenticationPersistence.getAuthentication().mo18571f((C5379n) null).mo18562a().mo41082a();
            Account a2 = this.accountManager.accountStatus().mo18695j().mo41034a();
            if (a == null || a2 == null) {
                throw new IllegalStateException("User not logged in.");
            }
            switch (this.uriMatcher.match(uri)) {
                case 1:
                    return create("userToken", a.getAccessToken());
                case 2:
                    return create(AndroidAccountManagerPersistence.ACCOUNT_STORE_NAME, a2.getStore().getName());
                case 3:
                    if (AptoideAccountManager.APTOIDE_SIGN_UP_TYPE.equals(a.getType())) {
                        return create("userPass", AptoideUtils.AlgorithmU.computeSha1(a.getPassword()));
                    }
                    if (FacebookSignUpAdapter.TYPE.equals(a.getType()) || GoogleSignUpAdapter.TYPE.equals(a.getType())) {
                        return create("userPass", a.getPassword());
                    }
                case 4:
                    break;
                case 5:
                    return create("loginName", a.getEmail());
                case 7:
                    return create("userRefreshToken", a.getRefreshToken());
                case 8:
                    return create("loginNickname", a2.getNickname());
                case 9:
                    return create("loginAvatar", a2.getAvatar());
                default:
                    throw new IllegalArgumentException("Only /token, /refreshToken, /repo, /passHash, /loginType, /loginName, loginNickname and loginAvatar supported.");
            }
            return create("loginType", a.getType().toLowerCase(Locale.US));
        }
        throw new SecurityException("Package not authorized to access provider.");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i = 0;
        try {
            int callingUid = Binder.getCallingUid();
            Context context = getContext();
            PackageManager packageManager = context.getPackageManager();
            String str2 = packageManager.getPackagesForUid(callingUid)[0];
            Log.d("AptoideDebug", "Someone is trying to update preferences");
            if (packageManager.checkSignatures(str2, context.getPackageName()) == 0) {
                if (this.uriMatcher.match(uri) != 6) {
                    return 0;
                }
                SharedPreferences.Editor edit = this.sharedPreferences.edit();
                for (Map.Entry next : contentValues.valueSet()) {
                    Object value = next.getValue();
                    if (value instanceof String) {
                        if (!ToolboxManager.isDebug(this.sharedPreferences)) {
                            AptoideUtils.ThreadU.runOnUiThread(new C4407a(context));
                        }
                        if (((String) next.getKey()).equals(ToolboxKeys.FORCE_COUNTRY)) {
                            ToolboxManager.setForceCountry((String) value, this.sharedPreferences);
                        } else if (((String) next.getKey()).equals("notificationtype")) {
                            ToolboxManager.setNotificationType((String) value, this.sharedPreferences);
                        } else if (((String) next.getKey()).equals("pullNotificationAction")) {
                            Intent intent = new Intent(context, PullingContentService.class);
                            intent.setAction(PullingContentService.PUSH_NOTIFICATIONS_ACTION);
                            context.startService(intent);
                        } else {
                            if (((String) next.getKey()).equals("UpdatesAction")) {
                                Intent intent2 = new Intent(context, PullingContentService.class);
                                intent2.setAction(PullingContentService.UPDATES_ACTION);
                                context.startService(intent2);
                            }
                            if (i > 0 && !TextUtils.isEmpty(next.getValue().toString())) {
                                AptoideUtils.ThreadU.runOnUiThread(new C4408b(context, next));
                            }
                        }
                    } else if (value instanceof Boolean) {
                        if (((String) next.getKey()).equals("debugmode")) {
                            ToolboxManager.setDebug(((Boolean) next.getValue()).booleanValue(), this.sharedPreferences);
                            Logger.setDBG(((Boolean) next.getValue()).booleanValue());
                            i++;
                        }
                        if (((String) next.getKey()).equals(ToolboxKeys.TOOLBOX_ENABLE_HTTP_SCHEME)) {
                            ToolboxManager.setToolboxEnableHttpScheme(((Boolean) next.getValue()).booleanValue(), this.sharedPreferences);
                            i++;
                        }
                        if (((String) next.getKey()).equals(ToolboxKeys.TOOLBOX_RETROFIT_LOGS)) {
                            ToolboxManager.setToolboxEnableRetrofitLogs(((Boolean) next.getValue()).booleanValue(), this.sharedPreferences);
                        }
                        AptoideUtils.ThreadU.runOnUiThread(new C4408b(context, next));
                    } else {
                        if ((value instanceof Long) && ((String) next.getKey()).equals(ToolboxKeys.PUSH_NOTIFICATION_PULL_INTERVAL)) {
                            ToolboxManager.setPushNotificationPullingInterval(((Long) value).longValue(), this.sharedPreferences);
                        }
                        AptoideUtils.ThreadU.runOnUiThread(new C4408b(context, next));
                    }
                    i++;
                    AptoideUtils.ThreadU.runOnUiThread(new C4408b(context, next));
                }
                edit.apply();
            }
        } catch (NullPointerException unused) {
        }
        return i;
    }
}
