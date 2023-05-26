package p015cm.aptoide.p016pt.networking;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.security.SecureRandom;
import java.util.UUID;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.Single;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.networking.IdsRepository */
public class IdsRepository {
    private static final String ADVERTISING_ID_CLIENT = "advertisingIdClient";
    private static final String ANDROID_ID_CLIENT = "androidId";
    private static final String APTOIDE_CLIENT_UUID = "aptoide_client_uuid";
    private static final String GOOGLE_ADVERTISING_ID_CLIENT = "googleAdvertisingId";
    private static final String GOOGLE_ADVERTISING_ID_CLIENT_SET = "googleAdvertisingIdSet";
    private static final String TAG = "IdsRepository";
    private final String androidId;
    private final Context context;
    private final SharedPreferences sharedPreferences;

    public IdsRepository(SharedPreferences sharedPreferences2, Context context2, String str) {
        this.sharedPreferences = sharedPreferences2;
        this.context = context2;
        this.androidId = str;
    }

    /* renamed from: e */
    static /* synthetic */ String m6533e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return UUID.randomUUID().toString();
    }

    private String generateRandomAdvertisingId() {
        byte[] bArr = new byte[16];
        String str = this.androidId;
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed((long) str.hashCode());
        secureRandom.nextBytes(bArr);
        return UUID.nameUUIDFromBytes(bArr).toString();
    }

    /* renamed from: a */
    public /* synthetic */ String mo13053a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return generateRandomAdvertisingId();
    }

    /* renamed from: b */
    public /* synthetic */ String mo13055b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (AptoideUtils.ThreadU.isUiThread()) {
            throw new IllegalStateException("You cannot run this method from the main thread");
        } else if (!AdNetworkUtils.isGooglePlayServicesAvailable(this.context)) {
            return "";
        } else {
            try {
                return AdvertisingIdClient.getAdvertisingIdInfo(this.context).getId();
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo13056c(String str) {
        if (!str.equals("")) {
            this.sharedPreferences.edit().putString(GOOGLE_ADVERTISING_ID_CLIENT, str).apply();
            this.sharedPreferences.edit().putBoolean(GOOGLE_ADVERTISING_ID_CLIENT_SET, true).apply();
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo13057d(String str) {
        this.sharedPreferences.edit().putString(APTOIDE_CLIENT_UUID, str).apply();
    }

    public synchronized Single<String> getAdvertisingId() {
        String string = this.sharedPreferences.getString(ADVERTISING_ID_CLIENT, (String) null);
        if (!TextUtils.isEmpty(string)) {
            return Single.m10119a(string);
        }
        return getGoogleAdvertisingId().mo18569d(new C3442l(this)).mo18564b(new C3444n(this, string));
    }

    public synchronized String getAndroidId() {
        String string = this.sharedPreferences.getString(ANDROID_ID_CLIENT, (String) null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String str = this.androidId;
        if (this.sharedPreferences.getString(ANDROID_ID_CLIENT, (String) null) == null) {
            this.sharedPreferences.edit().putString(ANDROID_ID_CLIENT, str).apply();
            return str;
        }
        throw new RuntimeException("Android ID already set!");
    }

    public synchronized Single<String> getGoogleAdvertisingId() {
        return Single.m10119a(this.sharedPreferences.getString(GOOGLE_ADVERTISING_ID_CLIENT, (String) null)).mo18569d(new C3441k(this)).mo18564b(new C3438i(this)).mo18563b(Schedulers.newThread());
    }

    public synchronized Single<String> getUniqueIdentifier() {
        String string = this.sharedPreferences.getString(APTOIDE_CLIENT_UUID, (String) null);
        if (!TextUtils.isEmpty(string)) {
            Logger instance = Logger.getInstance();
            String str = TAG;
            instance.mo12985v(str, "getUniqueIdentifier: in sharedPreferences: " + string);
            return Single.m10119a(string);
        }
        return getGoogleAdvertisingId().mo18569d(C3443m.f6428f).mo18564b(new C3440j(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13054a(String str, String str2) {
        this.sharedPreferences.edit().putString(ADVERTISING_ID_CLIENT, str).apply();
    }
}
