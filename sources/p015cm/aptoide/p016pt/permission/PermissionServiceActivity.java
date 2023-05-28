package p015cm.aptoide.p016pt.permission;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Bundle;
import androidx.core.app.C0352a;
import androidx.core.content.C0394a;
import com.facebook.C4716f;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.utils.SimpleSubscriber;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p123rx.p126m.C5377a;

@Deprecated
/* renamed from: cm.aptoide.pt.permission.PermissionServiceActivity */
public abstract class PermissionServiceActivity extends ActivityResultNavigator implements PermissionService {
    private static final int ACCESS_TO_ACCOUNTS_REQUEST_ID = 62;
    private static final int ACCESS_TO_EXTERNAL_FS_REQUEST_ID = 61;
    private static final int PERMISSIONS_REQUEST_ACCESS_CAMERA = 101;
    private static final String TAG = PermissionServiceActivity.class.getName();
    private ConnectivityManager connectivityManager;
    private SharedPreferences sharedPreferences;
    /* access modifiers changed from: private */
    public C5377a toRunWhenAccessToAccountsIsDenied;
    private C5377a toRunWhenAccessToAccountsIsGranted;
    /* access modifiers changed from: private */
    public C5377a toRunWhenAccessToFileSystemIsDenied;
    private C5377a toRunWhenAccessToFileSystemIsGranted;

    private void showBypassWifiMessage(long j, SimpleSubscriber<GenericDialogs.EResponse> simpleSubscriber) {
        GenericDialogs.createGenericOkCancelMessageWithColorButton(this, "", getString(C1086R.string.general_downloads_dialog_only_wifi_message), getString(C1086R.string.general_downloads_dialog_only_wifi_install_button, new Object[]{AptoideUtils.StringU.formatBytes(j, false)}), getString(C1086R.string.cancel)).mo18654a(simpleSubscriber);
    }

    private void showMessageOKCancel(int i, SimpleSubscriber<GenericDialogs.EResponse> simpleSubscriber) {
        showMessageOKCancel(getString(i), simpleSubscriber);
    }

    @TargetApi(23)
    public void hasDownloadAccess(C5377a aVar, C5377a aVar2) {
        if (C0394a.m1910a((Context) this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || (AptoideUtils.SystemU.getConnectionType(this.connectivityManager).equals("mobile") && !ManagerPreferences.getDownloadsWifiOnly(this.sharedPreferences))) {
            if (aVar2 != null) {
                aVar2.call();
            }
        } else if (aVar != null) {
            aVar.call();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        this.sharedPreferences = ((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences();
        if (!C4716f.m7713v()) {
            C4716f.m7694c(getApplicationContext());
        }
    }

    @TargetApi(23)
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
        if (i != 61) {
            if (i != 62) {
                super.onRequestPermissionsResult(i, strArr, iArr);
            } else if (iArr[0] == 0) {
                Logger.getInstance().mo12985v(TAG, "access to get accounts was granted");
                C5377a aVar = this.toRunWhenAccessToAccountsIsGranted;
                if (aVar != null) {
                    aVar.call();
                }
            } else {
                C5377a aVar2 = this.toRunWhenAccessToAccountsIsDenied;
                if (aVar2 != null) {
                    aVar2.call();
                }
                ShowMessage.asSnack(findViewById(16908290), "access to get accounts was denied");
            }
        } else if (iArr[0] == 0) {
            Logger.getInstance().mo12985v(TAG, "access to read and write to external storage was granted");
            C5377a aVar3 = this.toRunWhenAccessToFileSystemIsGranted;
            if (aVar3 != null) {
                aVar3.call();
            }
        } else {
            C5377a aVar4 = this.toRunWhenAccessToFileSystemIsDenied;
            if (aVar4 != null) {
                aVar4.call();
            }
            ShowMessage.asSnack(findViewById(16908290), "access to read and write to external storage was denied");
        }
    }

    @TargetApi(23)
    public void requestAccessToAccounts(C5377a aVar, C5377a aVar2) {
        requestAccessToAccounts(true, aVar, aVar2);
    }

    public void requestAccessToCamera(C5377a aVar, C5377a aVar2) {
        if (C0394a.m1910a((Context) this, "android.permission.CAMERA") != 0) {
            this.toRunWhenAccessToFileSystemIsGranted = aVar;
            this.toRunWhenAccessToFileSystemIsDenied = aVar2;
            if (C0352a.m1774a((Activity) this, "android.permission.CAMERA")) {
                Logger.getInstance().mo12985v(TAG, "showing rationale and requesting permission to access camera");
                showMessageOKCancel((int) C1086R.string.camera_access_permission_request_message, (SimpleSubscriber<GenericDialogs.EResponse>) new SimpleSubscriber<GenericDialogs.EResponse>() {
                    public void onNext(GenericDialogs.EResponse eResponse) {
                        super.onNext(eResponse);
                        if (eResponse == GenericDialogs.EResponse.YES) {
                            C0352a.m1773a(PermissionServiceActivity.this, new String[]{"android.permission.CAMERA"}, 101);
                        } else if (PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied != null) {
                            PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied.call();
                        }
                    }
                });
                return;
            }
            C0352a.m1773a(this, new String[]{"android.permission.CAMERA"}, 101);
            Logger.getInstance().mo12985v(TAG, "requesting permission to access camera");
            return;
        }
        Logger.getInstance().mo12985v(TAG, "already has permission to access camera");
        if (aVar != null) {
            aVar.call();
        }
    }

    @TargetApi(23)
    public void requestAccessToExternalFileSystem(C5377a aVar, C5377a aVar2) {
        requestAccessToExternalFileSystem(true, aVar, aVar2);
    }

    public void requestDownloadAccess(final C5377a aVar, final C5377a aVar2, boolean z, boolean z2, long j) {
        if (z || !AptoideUtils.SystemU.getConnectionType(this.connectivityManager).equals("mobile") || ManagerPreferences.getDownloadsWifiOnly(this.sharedPreferences)) {
            if (aVar != null) {
                aVar.call();
            }
        } else if (z2) {
            showBypassWifiMessage(j, new SimpleSubscriber<GenericDialogs.EResponse>() {
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext(eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        C5377a aVar = aVar;
                        if (aVar != null) {
                            aVar.call();
                            return;
                        }
                        return;
                    }
                    C5377a aVar2 = aVar2;
                    if (aVar2 != null) {
                        aVar2.call();
                    }
                }
            });
        } else {
            showMessageOKCancel((int) C1086R.string.general_downloads_dialog_only_wifi_message, (SimpleSubscriber<GenericDialogs.EResponse>) new SimpleSubscriber<GenericDialogs.EResponse>() {
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext(eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        PermissionServiceActivity.this.getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newSettingsFragment(), true);
                        return;
                    }
                    C5377a aVar = aVar2;
                    if (aVar != null) {
                        aVar.call();
                    }
                }
            });
        }
    }

    private void showMessageOKCancel(String str, SimpleSubscriber<GenericDialogs.EResponse> simpleSubscriber) {
        GenericDialogs.createGenericOkCancelMessage(this, "", str, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18654a(simpleSubscriber);
    }

    @TargetApi(23)
    public void requestAccessToAccounts(boolean z, C5377a aVar, C5377a aVar2) {
        if (C0394a.m1910a((Context) this, "android.permission.GET_ACCOUNTS") != 0) {
            this.toRunWhenAccessToAccountsIsGranted = aVar;
            this.toRunWhenAccessToAccountsIsDenied = aVar2;
            if (z || C0352a.m1774a((Activity) this, "android.permission.GET_ACCOUNTS")) {
                Logger.getInstance().mo12985v(TAG, "showing rationale and requesting permission to access accounts");
                showMessageOKCancel((int) C1086R.string.access_to_get_accounts_rationale, (SimpleSubscriber<GenericDialogs.EResponse>) new SimpleSubscriber<GenericDialogs.EResponse>() {
                    public void onNext(GenericDialogs.EResponse eResponse) {
                        super.onNext(eResponse);
                        if (eResponse == GenericDialogs.EResponse.YES) {
                            C0352a.m1773a(PermissionServiceActivity.this, new String[]{"android.permission.GET_ACCOUNTS"}, 62);
                        } else if (PermissionServiceActivity.this.toRunWhenAccessToAccountsIsDenied != null) {
                            PermissionServiceActivity.this.toRunWhenAccessToAccountsIsDenied.call();
                        }
                    }
                });
                return;
            }
            C0352a.m1773a(this, new String[]{"android.permission.GET_ACCOUNTS"}, 62);
            Logger.getInstance().mo12985v(TAG, "requesting permission to access accounts");
            return;
        }
        Logger.getInstance().mo12985v(TAG, "already has permission to access accounts");
        if (aVar != null) {
            aVar.call();
        }
    }

    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, C5377a aVar, C5377a aVar2) {
        requestAccessToExternalFileSystem(z, C1086R.string.storage_access_permission_request_message, aVar, aVar2);
    }

    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, int i, C5377a aVar, C5377a aVar2) {
        if (C0394a.m1910a((Context) this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.toRunWhenAccessToFileSystemIsGranted = aVar;
            this.toRunWhenAccessToFileSystemIsDenied = aVar2;
            if (z || C0352a.m1774a((Activity) this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                Logger.getInstance().mo12985v(TAG, "showing rationale and requesting permission to access external storage");
                showMessageOKCancel(i, (SimpleSubscriber<GenericDialogs.EResponse>) new SimpleSubscriber<GenericDialogs.EResponse>() {
                    public void onNext(GenericDialogs.EResponse eResponse) {
                        super.onNext(eResponse);
                        if (eResponse == GenericDialogs.EResponse.YES) {
                            C0352a.m1773a(PermissionServiceActivity.this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 61);
                        } else if (PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied != null) {
                            PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied.call();
                        }
                    }
                });
                return;
            }
            C0352a.m1773a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 61);
            Logger.getInstance().mo12985v(TAG, "requesting permission to access external storage");
            return;
        }
        Logger.getInstance().mo12985v(TAG, "already has permission to access external storage");
        if (aVar != null) {
            aVar.call();
        }
    }
}
