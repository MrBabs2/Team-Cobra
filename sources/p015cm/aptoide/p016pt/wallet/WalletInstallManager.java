package p015cm.aptoide.p016pt.wallet;

import android.content.pm.PackageManager;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5328b;
import p123rx.C5368e;
import p322p.p323a.p324a.p325a.C10832d;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u0002002\u0006\u00104\u001a\u000202J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000207062\b\u00108\u001a\u0004\u0018\u000107J\f\u00109\u001a\b\u0012\u0004\u0012\u00020206J\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;062\u0006\u00104\u001a\u000202J\f\u0010<\u001a\b\u0012\u0004\u0012\u00020.06J\f\u0010=\u001a\b\u0012\u0004\u0012\u00020.06J\u000e\u0010>\u001a\u0002002\u0006\u00101\u001a\u000202J\u0010\u0010?\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u000202J\u000e\u0010@\u001a\u0002002\u0006\u00101\u001a\u000202J\u0006\u0010A\u001a\u00020,J:\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u00108\u001a\u0002072\u0006\u0010K\u001a\u000207H\u0002J\u0006\u0010L\u001a\u00020.R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006M"}, mo16641d2 = {"Lcm/aptoide/pt/wallet/WalletInstallManager;", "", "packageManager", "Landroid/content/pm/PackageManager;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "downloadFactory", "Lcm/aptoide/pt/download/DownloadFactory;", "downloadStateParser", "Lcm/aptoide/pt/app/DownloadStateParser;", "moPubAdsManager", "Lcm/aptoide/pt/ads/MoPubAdsManager;", "walletInstallAnalytics", "Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "aptoideInstalledAppsRepository", "Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "walletAppProvider", "Lcm/aptoide/pt/wallet/WalletAppProvider;", "appInstallerStatusReceiver", "Lcm/aptoide/pt/install/AppInstallerStatusReceiver;", "dynamicSplitsManager", "Lcm/aptoide/pt/aab/DynamicSplitsManager;", "(Landroid/content/pm/PackageManager;Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/download/DownloadFactory;Lcm/aptoide/pt/app/DownloadStateParser;Lcm/aptoide/pt/ads/MoPubAdsManager;Lcm/aptoide/pt/wallet/WalletInstallAnalytics;Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;Lcm/aptoide/pt/wallet/WalletAppProvider;Lcm/aptoide/pt/install/AppInstallerStatusReceiver;Lcm/aptoide/pt/aab/DynamicSplitsManager;)V", "getAppInstallerStatusReceiver", "()Lcm/aptoide/pt/install/AppInstallerStatusReceiver;", "getAptoideInstalledAppsRepository", "()Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "getDownloadFactory", "()Lcm/aptoide/pt/download/DownloadFactory;", "getDownloadStateParser", "()Lcm/aptoide/pt/app/DownloadStateParser;", "getDynamicSplitsManager", "()Lcm/aptoide/pt/aab/DynamicSplitsManager;", "getInstallManager", "()Lcm/aptoide/pt/install/InstallManager;", "getMoPubAdsManager", "()Lcm/aptoide/pt/ads/MoPubAdsManager;", "getPackageManager", "()Landroid/content/pm/PackageManager;", "getWalletAppProvider", "()Lcm/aptoide/pt/wallet/WalletAppProvider;", "getWalletInstallAnalytics", "()Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "allowRootInstall", "", "answer", "", "cancelDownload", "Lrx/Completable;", "app", "Lcm/aptoide/pt/promotions/WalletApp;", "downloadApp", "walletApp", "getAppIcon", "Lrx/Observable;", "", "packageName", "getWallet", "loadDownloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "onWalletInstallationCanceled", "onWalletInstalled", "pauseDownload", "removeDownload", "resumeDownload", "setupAnalyticsHistoryTracker", "setupDownloadEvents", "download", "Lcm/aptoide/pt/database/room/RoomDownload;", "downloadAction", "Lcm/aptoide/pt/app/DownloadModel$Action;", "appId", "", "offerResponseStatus", "Lcm/aptoide/pt/ads/WalletAdsOfferManager$OfferResponseStatus;", "developer", "shouldShowRootInstallWarningPopup", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallManager */
/* compiled from: WalletInstallManager.kt */
public final class WalletInstallManager {
    private final AppInstallerStatusReceiver appInstallerStatusReceiver;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final DownloadFactory downloadFactory;
    private final DownloadStateParser downloadStateParser;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final InstallManager installManager;
    private final MoPubAdsManager moPubAdsManager;
    private final PackageManager packageManager;
    private final WalletAppProvider walletAppProvider;
    private final WalletInstallAnalytics walletInstallAnalytics;

    public WalletInstallManager(PackageManager packageManager2, InstallManager installManager2, DownloadFactory downloadFactory2, DownloadStateParser downloadStateParser2, MoPubAdsManager moPubAdsManager2, WalletInstallAnalytics walletInstallAnalytics2, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2, WalletAppProvider walletAppProvider2, AppInstallerStatusReceiver appInstallerStatusReceiver2, DynamicSplitsManager dynamicSplitsManager2) {
        C10202j.m34178b(packageManager2, "packageManager");
        C10202j.m34178b(installManager2, "installManager");
        C10202j.m34178b(downloadFactory2, "downloadFactory");
        C10202j.m34178b(downloadStateParser2, "downloadStateParser");
        C10202j.m34178b(moPubAdsManager2, "moPubAdsManager");
        C10202j.m34178b(walletInstallAnalytics2, "walletInstallAnalytics");
        C10202j.m34178b(aptoideInstalledAppsRepository2, "aptoideInstalledAppsRepository");
        C10202j.m34178b(walletAppProvider2, "walletAppProvider");
        C10202j.m34178b(appInstallerStatusReceiver2, "appInstallerStatusReceiver");
        C10202j.m34178b(dynamicSplitsManager2, "dynamicSplitsManager");
        this.packageManager = packageManager2;
        this.installManager = installManager2;
        this.downloadFactory = downloadFactory2;
        this.downloadStateParser = downloadStateParser2;
        this.moPubAdsManager = moPubAdsManager2;
        this.walletInstallAnalytics = walletInstallAnalytics2;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
        this.walletAppProvider = walletAppProvider2;
        this.appInstallerStatusReceiver = appInstallerStatusReceiver2;
        this.dynamicSplitsManager = dynamicSplitsManager2;
    }

    /* access modifiers changed from: private */
    public final void setupDownloadEvents(RoomDownload roomDownload, DownloadModel.Action action, long j, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, String str, String str2) {
        this.walletInstallAnalytics.setupDownloadEvents(roomDownload, action, j, offerResponseStatus);
        this.walletInstallAnalytics.sendClickOnInstallButtonEvent(str, str2, roomDownload.hasSplits());
    }

    public final void allowRootInstall(boolean z) {
        this.installManager.rootInstallAllowed(z);
    }

    public final C5328b cancelDownload(WalletApp walletApp) {
        C10202j.m34178b(walletApp, "app");
        C5328b d = C5328b.m10169d(new WalletInstallManager$cancelDownload$1(this, walletApp));
        C10202j.m34174a((Object) d, "Completable.fromAction { removeDownload(app) }");
        return d;
    }

    public final C5328b downloadApp(WalletApp walletApp) {
        C10202j.m34178b(walletApp, "walletApp");
        DynamicSplitsManager dynamicSplitsManager2 = this.dynamicSplitsManager;
        String md5sum = walletApp.getMd5sum();
        if (md5sum != null) {
            C5328b k = C10832d.m36727a(dynamicSplitsManager2.getAppSplitsByMd5(md5sum)).mo18568c(new WalletInstallManager$downloadApp$1(this, walletApp)).mo18692i(new WalletInstallManager$downloadApp$2(this, walletApp)).mo18689g(new WalletInstallManager$downloadApp$3(this)).mo18696k();
            C10202j.m34174a((Object) k, "RxJavaInterop.toV1Single… }\n      .toCompletable()");
            return k;
        }
        C10202j.m34172a();
        throw null;
    }

    public final C5368e<String> getAppIcon(String str) {
        C5368e<String> l = C5368e.m10240a(new WalletInstallManager$getAppIcon$1(this, str)).mo18699l(WalletInstallManager$getAppIcon$2.INSTANCE);
        C10202j.m34174a((Object) l, "Observable.fromCallable … }.onErrorReturn { null }");
        return l;
    }

    public final AppInstallerStatusReceiver getAppInstallerStatusReceiver() {
        return this.appInstallerStatusReceiver;
    }

    public final AptoideInstalledAppsRepository getAptoideInstalledAppsRepository() {
        return this.aptoideInstalledAppsRepository;
    }

    public final DownloadFactory getDownloadFactory() {
        return this.downloadFactory;
    }

    public final DownloadStateParser getDownloadStateParser() {
        return this.downloadStateParser;
    }

    public final DynamicSplitsManager getDynamicSplitsManager() {
        return this.dynamicSplitsManager;
    }

    public final InstallManager getInstallManager() {
        return this.installManager;
    }

    public final MoPubAdsManager getMoPubAdsManager() {
        return this.moPubAdsManager;
    }

    public final PackageManager getPackageManager() {
        return this.packageManager;
    }

    public final C5368e<WalletApp> getWallet() {
        return this.walletAppProvider.getWalletApp();
    }

    public final WalletAppProvider getWalletAppProvider() {
        return this.walletAppProvider;
    }

    public final WalletInstallAnalytics getWalletInstallAnalytics() {
        return this.walletInstallAnalytics;
    }

    public final C5368e<DownloadModel> loadDownloadModel(WalletApp walletApp) {
        C10202j.m34178b(walletApp, "walletApp");
        C5368e<R> j = this.installManager.getInstall(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode()).mo18694j(new WalletInstallManager$loadDownloadModel$1(this));
        C10202j.m34174a((Object) j, "installManager.getInstal…appSize\n        )\n      }");
        return j;
    }

    public final C5368e<Boolean> onWalletInstallationCanceled() {
        C5368e<R> d = this.appInstallerStatusReceiver.getInstallerInstallStatus().mo18694j(WalletInstallManager$onWalletInstallationCanceled$1.INSTANCE).mo18681d(WalletInstallManager$onWalletInstallationCanceled$2.INSTANCE);
        C10202j.m34174a((Object) d, "appInstallerStatusReceiv…sCanceled -> isCanceled }");
        return d;
    }

    public final C5368e<Boolean> onWalletInstalled() {
        C5368e<Boolean> d = this.aptoideInstalledAppsRepository.isInstalled("com.appcoins.wallet").mo18681d(WalletInstallManager$onWalletInstalled$1.INSTANCE);
        C10202j.m34174a((Object) d, "aptoideInstalledAppsRepo…>\n      isInstalled\n    }");
        return d;
    }

    public final C5328b pauseDownload(WalletApp walletApp) {
        C10202j.m34178b(walletApp, "app");
        C5328b pauseInstall = this.installManager.pauseInstall(walletApp.getMd5sum());
        C10202j.m34174a((Object) pauseInstall, "installManager.pauseInstall(app.md5sum)");
        return pauseInstall;
    }

    public final C5328b removeDownload(WalletApp walletApp) {
        C10202j.m34178b(walletApp, "app");
        return this.installManager.cancelInstall(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode());
    }

    public final C5328b resumeDownload(WalletApp walletApp) {
        C10202j.m34178b(walletApp, "app");
        C5328b b = this.installManager.getDownload(walletApp.getMd5sum()).mo18559a(new WalletInstallManager$resumeDownload$1(this, walletApp)).mo18566b(new WalletInstallManager$resumeDownload$2(this));
        C10202j.m34174a((Object) b, "installManager.getDownlo…Install(download)\n      }");
        return b;
    }

    public final void setupAnalyticsHistoryTracker() {
        this.walletInstallAnalytics.setupHistoryTracker();
    }

    public final boolean shouldShowRootInstallWarningPopup() {
        return this.installManager.showWarning();
    }
}
