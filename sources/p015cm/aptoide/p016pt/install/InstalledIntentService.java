package p015cm.aptoide.p016pt.install;

import android.app.IntentService;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.ads.MinimalAdMapper;
import p015cm.aptoide.p016pt.app.CampaignAnalytics;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.database.room.RoomStoredMinimalAd;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p015cm.aptoide.p016pt.util.ReferrerUtils;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p123rx.C5328b;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.install.InstalledIntentService */
public class InstalledIntentService extends IntentService {
    private static final String TAG = InstalledIntentService.class.getName();
    private MinimalAdMapper adMapper;
    @Inject
    AppcMigrationManager appcMigrationManager;
    @Inject
    AptoideInstallManager aptoideInstallManager;
    @Inject
    CampaignAnalytics campaignAnalytics;
    @Inject
    FileUtils fileUtils;
    @Inject
    InstallAnalytics installAnalytics;
    private InstallManager installManager;
    private PackageManager packageManager;
    @Inject
    RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence;
    private RootAvailabilityManager rootAvailabilityManager;
    private SharedPreferences sharedPreferences;
    private C5383b subscriptions;
    @Inject
    UpdateRepository updatesRepository;

    public InstalledIntentService() {
        super("InstalledIntentService");
    }

    /* renamed from: a */
    static /* synthetic */ void m6430a() {
    }

    /* renamed from: a */
    static /* synthetic */ void m6431a(RoomStoredMinimalAd roomStoredMinimalAd) {
    }

    private void checkAndBroadcastReferrer(String str) {
        this.subscriptions.mo18721a(this.roomStoredMinimalAdPersistence.get(str).mo18644a(Schedulers.m10352io()).mo18689g(new C3286h2(this, str)).mo18655a(C3271e2.f6200f, (C5378b<Throwable>) C3281g2.f6211f));
    }

    private boolean checkAndLogNullPackageInfo(PackageInfo packageInfo, String str) {
        if (packageInfo != null) {
            return false;
        }
        CrashReport instance = CrashReport.getInstance();
        instance.log(new IllegalArgumentException("PackageName null for package " + str));
        return true;
    }

    private PackageInfo databaseOnPackageAdded(String str) {
        PackageInfo packageInfo = AptoideUtils.SystemU.getPackageInfo(str, getPackageManager());
        if (checkAndLogNullPackageInfo(packageInfo, str)) {
            return packageInfo;
        }
        this.installManager.onAppInstalled(new RoomInstalled(packageInfo, this.packageManager, this.fileUtils)).mo18594a((C5377a) C3251a2.f6178f, (C5378b<? super Throwable>) C3261c2.f6189f);
        return packageInfo;
    }

    private void databaseOnPackageRemoved(String str) {
        this.installManager.onAppRemoved(str).mo18587a(this.updatesRepository.remove(str)).mo18594a((C5377a) new C3266d2(str), (C5378b<? super Throwable>) C3276f2.f6205f);
    }

    private PackageInfo databaseOnPackageReplaced(String str) {
        PackageInfo packageInfo = AptoideUtils.SystemU.getPackageInfo(str, getPackageManager());
        if (checkAndLogNullPackageInfo(packageInfo, str)) {
            return packageInfo;
        }
        this.installManager.onUpdateConfirmed(new RoomInstalled(packageInfo, this.packageManager, this.fileUtils)).mo18587a(this.updatesRepository.remove(str)).mo18594a((C5377a) new C3256b2(str), (C5378b<? super Throwable>) C3417z1.f6386f);
        return packageInfo;
    }

    private C5328b knockCpi(String str, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence2, RoomStoredMinimalAd roomStoredMinimalAd) {
        return C5328b.m10157a((Callable<?>) new C3290i2(this, str, roomStoredMinimalAd, roomStoredMinimalAdPersistence2));
    }

    private void reportPackageInfoNullEvent() {
        CrashReport.getInstance().log(new NullPointerException("PackageInfo is null."));
    }

    private void sendCampaignConversion(String str, PackageInfo packageInfo) {
        if (packageInfo != null) {
            this.campaignAnalytics.convertCampaignEvent(str, packageInfo.versionCode);
        } else {
            reportPackageInfoNullEvent();
        }
    }

    private void sendInstallEvent(String str, PackageInfo packageInfo) {
        if (packageInfo != null) {
            this.installAnalytics.installCompleted(str, packageInfo.versionCode, this.rootAvailabilityManager.isRootAvailable().mo18562a().mo41082a().booleanValue(), ManagerPreferences.allowRootInstallation(this.sharedPreferences));
        } else {
            reportPackageInfoNullEvent();
        }
    }

    private void sendUninstallEvent(String str) {
        this.installAnalytics.uninstallCompleted(str);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo12793a(String str, RoomStoredMinimalAd roomStoredMinimalAd) {
        if (roomStoredMinimalAd != null) {
            return knockCpi(str, this.roomStoredMinimalAdPersistence, roomStoredMinimalAd);
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        ((AptoideApplication) getApplicationContext()).getApplicationComponent().inject(this);
        this.adMapper = new MinimalAdMapper();
        this.sharedPreferences = ((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences();
        ((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences();
        this.subscriptions = new C5383b();
        this.installManager = ((AptoideApplication) getApplicationContext()).getInstallManager();
        this.rootAvailabilityManager = ((AptoideApplication) getApplicationContext()).getRootAvailabilityManager();
        this.packageManager = getPackageManager();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r0.equals("android.intent.action.PACKAGE_ADDED") == false) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0065
            java.lang.String r0 = r9.getAction()
            android.net.Uri r1 = r9.getData()
            java.lang.String r1 = r1.getEncodedSchemeSpecificPart()
            java.lang.String r2 = "android.intent.action.PACKAGE_REPLACED"
            boolean r3 = android.text.TextUtils.equals(r0, r2)
            r4 = 0
            if (r3 != 0) goto L_0x0020
            java.lang.String r3 = "android.intent.extra.REPLACING"
            boolean r9 = r9.getBooleanExtra(r3, r4)
            if (r9 == 0) goto L_0x0020
            return
        L_0x0020:
            r9 = -1
            int r3 = r0.hashCode()
            r5 = -810471698(0xffffffffcfb12eee, float:-5.9452856E9)
            r6 = 2
            r7 = 1
            if (r3 == r5) goto L_0x004a
            r2 = 525384130(0x1f50b9c2, float:4.419937E-20)
            if (r3 == r2) goto L_0x0040
            r2 = 1544582882(0x5c1076e2, float:1.62652439E17)
            if (r3 == r2) goto L_0x0037
            goto L_0x0052
        L_0x0037:
            java.lang.String r2 = "android.intent.action.PACKAGE_ADDED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0040:
            java.lang.String r2 = "android.intent.action.PACKAGE_REMOVED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0052
            r4 = 2
            goto L_0x0053
        L_0x004a:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0052
            r4 = 1
            goto L_0x0053
        L_0x0052:
            r4 = -1
        L_0x0053:
            if (r4 == 0) goto L_0x0062
            if (r4 == r7) goto L_0x005e
            if (r4 == r6) goto L_0x005a
            goto L_0x0065
        L_0x005a:
            r8.onPackageRemoved(r1)
            goto L_0x0065
        L_0x005e:
            r8.onPackageReplaced(r1)
            goto L_0x0065
        L_0x0062:
            r8.onPackageAdded(r1)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.install.InstalledIntentService.onHandleIntent(android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public void onPackageAdded(String str) {
        Logger instance = Logger.getInstance();
        String str2 = TAG;
        instance.mo12975d(str2, "Package added: " + str);
        PackageInfo databaseOnPackageAdded = databaseOnPackageAdded(str);
        checkAndBroadcastReferrer(str);
        sendInstallEvent(str, databaseOnPackageAdded);
        sendCampaignConversion(str, databaseOnPackageAdded);
        this.appcMigrationManager.persistCandidate(str);
        this.aptoideInstallManager.persistCandidate(str);
    }

    /* access modifiers changed from: protected */
    public void onPackageRemoved(String str) {
        Logger instance = Logger.getInstance();
        String str2 = TAG;
        instance.mo12975d(str2, "Packaged removed: " + str);
        sendUninstallEvent(str);
        databaseOnPackageRemoved(str);
    }

    /* access modifiers changed from: protected */
    public void onPackageReplaced(String str) {
        Logger instance = Logger.getInstance();
        String str2 = TAG;
        instance.mo12975d(str2, "Packaged replaced: " + str);
        PackageInfo databaseOnPackageReplaced = databaseOnPackageReplaced(str);
        sendInstallEvent(str, databaseOnPackageReplaced);
        sendCampaignConversion(str, databaseOnPackageReplaced);
        this.aptoideInstallManager.persistCandidate(str);
    }

    /* renamed from: b */
    static /* synthetic */ void m6434b(String str) {
        Logger instance = Logger.getInstance();
        String str2 = TAG;
        instance.mo12975d(str2, "databaseOnPackageReplaced: " + str);
    }

    /* renamed from: a */
    static /* synthetic */ void m6432a(String str) {
        Logger instance = Logger.getInstance();
        String str2 = TAG;
        instance.mo12975d(str2, "databaseOnPackageRemoved: " + str);
    }

    /* renamed from: a */
    public /* synthetic */ Object mo12792a(String str, RoomStoredMinimalAd roomStoredMinimalAd, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence2) throws Exception {
        ReferrerUtils.broadcastReferrer(str, roomStoredMinimalAd.getReferrer(), getApplicationContext());
        AdNetworkUtils.knockCpi(this.adMapper.map(roomStoredMinimalAd));
        roomStoredMinimalAdPersistence2.remove(roomStoredMinimalAd);
        return null;
    }
}
