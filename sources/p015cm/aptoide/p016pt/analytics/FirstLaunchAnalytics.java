package p015cm.aptoide.p016pt.analytics;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.C6371i;
import com.facebook.GraphRequest;
import com.facebook.p032t.C4728g;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.GmsStatusValueProvider;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferences;
import p036io.rakam.api.C4759f;
import p112n.p113d.p114a.C10562b;
import p112n.p115f.p116a.p117a.C5299a;
import p123rx.C5328b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.analytics.FirstLaunchAnalytics */
public class FirstLaunchAnalytics {
    private static final String APTOIDE_PACKAGE = "aptoide_package";
    private static final String CATEGORY = "category";
    private static final String CONTEXT = "APPLICATION";
    private static final String ENTRY_POINT = "Entry Point";
    private static final String ENTRY_POINT_RAKAM = "entry_point";
    public static final String FIRST_LAUNCH = "Aptoide_First_Launch";
    public static final String FIRST_LAUNCH_BI = "FIRST_LAUNCH";
    public static final String FIRST_LAUNCH_RAKAM = "aptoide_first_launch";
    private static final String FLAGGED = "flagged";
    private static final String GMS = "GMS";
    private static final String GMS_RAKAM = "gms";
    private static final String IS_ACTIVE = "is_active";
    public static final String PLAY_PROTECT_EVENT = "Google_Play_Protect";
    private static final String TAG = "FirstLaunchAnalytics";
    private static final String UNKNOWN = "unknown";
    private static final String UTM_CAMPAIGN = "UTM Campaign";
    private static final String UTM_CAMPAIGN_RAKAM = "utm_campaign";
    private static final String UTM_CONTENT = "UTM Content";
    private static final String UTM_CONTENT_RAKAM = "utm_content";
    private static final String UTM_MEDIUM = "UTM Medium";
    private static final String UTM_MEDIUM_RAKAM = "utm_medium";
    private static final String UTM_SOURCE = "UTM Source";
    private static final String UTM_SOURCE_RAKAM = "utm_source";
    private static final String VERSION_CODE = "version_code";
    private final AnalyticsManager analyticsManager;
    private String entryPoint = UNKNOWN;
    private final GmsStatusValueProvider gmsStatusValueProvider;
    private final AnalyticsLogger logger;
    private final String packageName;
    private final SafetyNetClient safetyNetClient;
    private String utmCampaign = UNKNOWN;
    private String utmContent = UNKNOWN;
    private String utmMedium = UNKNOWN;
    private String utmSource = UNKNOWN;
    private final int versionCode;

    public FirstLaunchAnalytics(AnalyticsManager analyticsManager2, AnalyticsLogger analyticsLogger, SafetyNetClient safetyNetClient2, String str, GmsStatusValueProvider gmsStatusValueProvider2, int i) {
        this.analyticsManager = analyticsManager2;
        this.logger = analyticsLogger;
        this.safetyNetClient = safetyNetClient2;
        this.packageName = str;
        this.gmsStatusValueProvider = gmsStatusValueProvider2;
        this.versionCode = i;
    }

    private JSONObject addFirstLaunchProperties(boolean z, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("first_session", z);
            jSONObject.put(VERSION_CODE, this.versionCode);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject addFirstLaunchSourceUserProperties(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(GMS_RAKAM, this.gmsStatusValueProvider.getGmsValue());
            jSONObject.put(UTM_CONTENT_RAKAM, str);
            jSONObject.put(UTM_SOURCE_RAKAM, str2);
            jSONObject.put(UTM_CAMPAIGN_RAKAM, str3);
            jSONObject.put(UTM_MEDIUM_RAKAM, str4);
            jSONObject.put(ENTRY_POINT_RAKAM, str5);
            jSONObject.put(APTOIDE_PACKAGE, str6);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        r5.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        r4.logger.logDebug(TAG, "No utm file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r4.logger.logDebug(TAG, "No package name utm file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r4.logger.logDebug(TAG, "problem parsing utm/no utm file");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005d, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0062 A[SYNTHETIC, Splitter:B:10:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: NameNotFoundException (unused android.content.pm.PackageManager$NameNotFoundException), SYNTHETIC, Splitter:B:1:0x0002] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:1:0x0002] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean checkForUTMFileInMetaINF(android.app.Application r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r5.getApplicationContext()     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005f }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005f }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005f }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005f }
            android.content.pm.PackageInfo r5 = r2.getPackageInfo(r5, r0)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005f }
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005f }
            java.lang.String r5 = r5.sourceDir     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005f }
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005f }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005f }
            java.lang.String r5 = "META-INF/utm"
            java.util.zip.ZipEntry r5 = r2.getEntry(r5)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            java.io.InputStream r5 = r2.getInputStream(r5)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            cm.aptoide.pt.analytics.UTMTrackingFileParser r1 = new cm.aptoide.pt.analytics.UTMTrackingFileParser     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            r2.close()     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            java.lang.String r3 = "utm_source"
            java.lang.String r3 = r1.valueExtracter(r3)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            r4.utmSource = r3     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            java.lang.String r3 = "utm_medium"
            java.lang.String r3 = r1.valueExtracter(r3)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            r4.utmMedium = r3     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            java.lang.String r3 = "utm_campaign"
            java.lang.String r3 = r1.valueExtracter(r3)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            r4.utmCampaign = r3     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            java.lang.String r3 = "utm_content"
            java.lang.String r3 = r1.valueExtracter(r3)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            r4.utmContent = r3     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            java.lang.String r3 = "entry_point"
            java.lang.String r1 = r1.valueExtracter(r3)     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            r4.entryPoint = r1     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            r5.close()     // Catch:{ IOException -> 0x0080, NameNotFoundException -> 0x0076, NullPointerException -> 0x005d }
            goto L_0x0074
        L_0x005d:
            r1 = r2
            goto L_0x0060
        L_0x005f:
        L_0x0060:
            if (r1 == 0) goto L_0x006b
            r1.close()     // Catch:{ IOException -> 0x0066 }
            return r0
        L_0x0066:
            r5 = move-exception
            r5.printStackTrace()
            return r0
        L_0x006b:
            cm.aptoide.analytics.AnalyticsLogger r5 = r4.logger
            java.lang.String r0 = TAG
            java.lang.String r1 = "No utm file."
            r5.logDebug(r0, r1)
        L_0x0074:
            r5 = 1
            return r5
        L_0x0076:
            cm.aptoide.analytics.AnalyticsLogger r5 = r4.logger
            java.lang.String r1 = TAG
            java.lang.String r2 = "No package name utm file."
            r5.logDebug(r1, r2)
            return r0
        L_0x0080:
            cm.aptoide.analytics.AnalyticsLogger r5 = r4.logger
            java.lang.String r1 = TAG
            java.lang.String r2 = "problem parsing utm/no utm file"
            r5.logDebug(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics.checkForUTMFileInMetaINF(android.app.Application):boolean");
    }

    private Map<String, Object> createFacebookFirstLaunchDataMap(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put(UTM_SOURCE, str);
        hashMap.put(UTM_MEDIUM, str2);
        hashMap.put(UTM_CAMPAIGN, str3);
        hashMap.put(UTM_CONTENT, str4);
        hashMap.put(ENTRY_POINT, str5);
        return hashMap;
    }

    private Bundle createUserPropertiesBundle(String str, String str2, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString(UTM_SOURCE, str);
        bundle.putString(UTM_MEDIUM, str2);
        bundle.putString(UTM_CAMPAIGN, str3);
        bundle.putString(UTM_CONTENT, str4);
        bundle.putString(ENTRY_POINT, str5);
        return bundle;
    }

    private String getCategoryFlaggedByPlayProtect(List<HarmfulAppsData> list) {
        for (HarmfulAppsData next : list) {
            if (next.f23656f.equals(this.packageName)) {
                return getPlayProtectCategoryName(next.f23658h);
            }
        }
        return null;
    }

    private String getPlayProtectCategoryName(int i) {
        switch (i) {
            case 1:
                return "RANSOMWARE";
            case 2:
                return "PHISHING";
            case 3:
                return "TROJAN";
            case 4:
                return "UNCOMMON";
            case 5:
                return "FRAUDWARE";
            case 6:
                return "TOLL_FRAUD";
            case 7:
                return "WAP_FRAUD";
            case 8:
                return "CALL_FRAUD";
            case 9:
                return "BACKDOOR";
            case 10:
                return "SPYWARE";
            case 11:
                return "GENERIC_MALWARE";
            case 12:
                return "HARMFUL_SITE";
            case 13:
                return "WINDOWS_MALWARE";
            case 14:
                return "HOSTILE_DOWNLOADER";
            case 15:
                return "NON_ANDROID_THREAT";
            case 16:
                return "ROOTING";
            case 17:
                return "PRIVILEGE_ESCALATION";
            case 18:
                return "TRACKING";
            case 19:
                return "SPAM";
            case 20:
                return "DENIAL_OF_SERVICE";
            case 21:
                return "DATA_COLLECTION";
            default:
                return "UNKNOWN_CATEGORY";
        }
    }

    private void sendFirstLaunchEvent(String str, String str2, String str3, String str4, String str5) {
        this.analyticsManager.logEvent(createFacebookFirstLaunchDataMap(str, str2, str3, str4, str5), FIRST_LAUNCH, AnalyticsManager.Action.OPEN, CONTEXT);
        this.analyticsManager.logEvent(createFacebookFirstLaunchDataMap(str, str2, str3, str4, str5), FIRST_LAUNCH_BI, AnalyticsManager.Action.OPEN, CONTEXT);
        this.analyticsManager.logEvent(new HashMap(), FIRST_LAUNCH_RAKAM, AnalyticsManager.Action.OPEN, CONTEXT);
    }

    private void sendFirstLaunchSourceUserProperties(String str, String str2, String str3, String str4, String str5, String str6) {
        C4759f.m7803a().mo16567a(addFirstLaunchSourceUserProperties(str, str2, str3, str4, str5, str6, C4759f.m7803a().mo16579b()));
        HashMap hashMap = new HashMap();
        hashMap.put(GMS_RAKAM, this.gmsStatusValueProvider.getGmsValue());
        String str7 = str;
        hashMap.put(UTM_CONTENT_RAKAM, str);
        String str8 = str2;
        hashMap.put(UTM_SOURCE_RAKAM, str2);
        String str9 = str3;
        hashMap.put(UTM_CAMPAIGN_RAKAM, str3);
        String str10 = str4;
        hashMap.put(UTM_MEDIUM_RAKAM, str4);
        String str11 = str5;
        hashMap.put(ENTRY_POINT_RAKAM, str5);
        hashMap.put(APTOIDE_PACKAGE, str6);
        C5299a.m10024a((Map<String, Object>) hashMap);
    }

    private void sendPlayProtectEvent() {
        this.safetyNetClient.mo30657h().mo30704a(new C1380g(this));
    }

    private void setUTMDimensionsToUnknown() {
        Bundle bundle = new Bundle();
        bundle.putString(UTM_SOURCE, UNKNOWN);
        bundle.putString(UTM_MEDIUM, UNKNOWN);
        bundle.putString(UTM_CAMPAIGN, UNKNOWN);
        bundle.putString(UTM_CONTENT, UNKNOWN);
        bundle.putString(ENTRY_POINT, UNKNOWN);
        setUserPropertiesWithBundle(bundle);
        C10562b.C10563b.m35860a(UTM_SOURCE, UNKNOWN);
        C10562b.C10563b.m35860a(UTM_MEDIUM, UNKNOWN);
        C10562b.C10563b.m35860a(UTM_CAMPAIGN, UNKNOWN);
        C10562b.C10563b.m35860a(UTM_CONTENT, UNKNOWN);
        C10562b.C10563b.m35860a(ENTRY_POINT, UNKNOWN);
    }

    private void setUserProperties(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        C4728g.m7727a(bundle, (GraphRequest.C6344f) new C1376c(this));
        C10562b.C10563b.m35860a(str, str2);
    }

    private void setUserPropertiesWithBundle(Bundle bundle) {
        C4728g.m7727a(bundle, (GraphRequest.C6344f) new C1381h(this));
    }

    private void setupDimensions(Application application) {
        if (!checkForUTMFileInMetaINF(application)) {
            setUTMDimensionsToUnknown();
            sendFirstLaunchSourceUserProperties(UNKNOWN, UNKNOWN, UNKNOWN, UNKNOWN, UNKNOWN, application.getPackageName());
            return;
        }
        setUserProperties(this.utmSource, this.utmMedium, this.utmCampaign, this.utmContent, this.entryPoint);
        sendFirstLaunchSourceUserProperties(this.utmContent, this.utmSource, this.utmCampaign, this.utmMedium, this.entryPoint, application.getPackageName());
    }

    private void setupFirstLaunchSuperProperty(boolean z) {
        C4759f.m7803a().mo16567a(addFirstLaunchProperties(z, C4759f.m7803a().mo16579b()));
        HashMap hashMap = new HashMap();
        hashMap.put("first_session", Boolean.valueOf(z));
        hashMap.put(VERSION_CODE, Integer.valueOf(this.versionCode));
        C5299a.m10024a((Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6785a(Task task) {
        String str;
        boolean z = true;
        boolean z2 = false;
        if (task.mo30709d()) {
            str = getCategoryFlaggedByPlayProtect(((SafetyNetApi.HarmfulAppsResponse) task.mo30707b()).mo30656c());
            if (str != null) {
                z2 = true;
            }
        } else {
            str = null;
            z = false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "true";
        hashMap.put(IS_ACTIVE, z ? str2 : AdultContentAnalytics.UNLOCK);
        if (!z2) {
            str2 = AdultContentAnalytics.UNLOCK;
        }
        hashMap.put(FLAGGED, str2);
        hashMap.put(CATEGORY, str);
        this.analyticsManager.logEvent(hashMap, PLAY_PROTECT_EVENT, AnalyticsManager.Action.OPEN, CONTEXT);
    }

    public C5328b sendAppStart(Application application, SharedPreferences sharedPreferences, IdsRepository idsRepository) {
        return idsRepository.getUniqueIdentifier().mo18564b(C1372a.f3834f).mo18567c().mo18664b(new C1378e(this, sharedPreferences)).mo18664b(new C1377d(this)).mo18664b(new C1379f(this, application)).mo18681d(new C1375b(sharedPreferences)).mo18664b(new C1382i(this)).mo18696k().mo18600b(Schedulers.m10352io());
    }

    public void setGmsPresent() {
        setUserProperties(GMS, this.gmsStatusValueProvider.getGmsValue());
    }

    /* renamed from: b */
    public /* synthetic */ void mo6788b(String str) {
        sendFirstLaunchEvent(this.utmSource, this.utmMedium, this.utmCampaign, this.utmContent, this.entryPoint);
    }

    /* renamed from: b */
    public /* synthetic */ void mo6787b(C6371i iVar) {
        this.logger.logDebug("Facebook Analytics: ", iVar.toString());
    }

    private void setUserProperties(String str, String str2, String str3, String str4, String str5) {
        setUserPropertiesWithBundle(createUserPropertiesBundle(str, str2, str3, str4, str5));
        C10562b.C10563b.m35860a(UTM_SOURCE, str);
        C10562b.C10563b.m35860a(UTM_MEDIUM, str2);
        C10562b.C10563b.m35860a(UTM_CAMPAIGN, str3);
        C10562b.C10563b.m35860a(UTM_CONTENT, str4);
        C10562b.C10563b.m35860a(ENTRY_POINT, str5);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6783a(SharedPreferences sharedPreferences, String str) {
        setupFirstLaunchSuperProperty(SecurePreferences.isFirstRun(sharedPreferences));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6786a(String str) {
        sendPlayProtectEvent();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6782a(Application application, String str) {
        setupDimensions(application);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6784a(C6371i iVar) {
        this.logger.logDebug("Facebook Analytics: ", iVar.toString());
    }
}
