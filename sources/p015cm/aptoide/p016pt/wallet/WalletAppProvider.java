package p015cm.aptoide.p016pt.wallet;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p015cm.aptoide.p016pt.view.app.AppDeveloper;
import p015cm.aptoide.p016pt.view.app.AppRating;
import p015cm.aptoide.p016pt.view.app.AppStats;
import p015cm.aptoide.p016pt.view.app.DetailedApp;
import p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, mo16641d2 = {"Lcm/aptoide/pt/wallet/WalletAppProvider;", "", "appCenter", "Lcm/aptoide/pt/view/app/AppCenter;", "aptoideInstalledAppsRepository", "Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "downloadStateParser", "Lcm/aptoide/pt/app/DownloadStateParser;", "(Lcm/aptoide/pt/view/app/AppCenter;Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/app/DownloadStateParser;)V", "getAppCenter", "()Lcm/aptoide/pt/view/app/AppCenter;", "getAptoideInstalledAppsRepository", "()Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "getDownloadStateParser", "()Lcm/aptoide/pt/app/DownloadStateParser;", "getInstallManager", "()Lcm/aptoide/pt/install/InstallManager;", "getWalletApp", "Lrx/Observable;", "Lcm/aptoide/pt/promotions/WalletApp;", "mapToDownloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "type", "Lcm/aptoide/pt/install/Install$InstallationType;", "progress", "", "state", "Lcm/aptoide/pt/install/Install$InstallationStatus;", "isIndeterminate", "", "appSize", "", "mapToWalletApp", "result", "Lcm/aptoide/pt/view/app/DetailedAppRequestResult;", "mergeToWalletApp", "walletApp", "isInstalled", "walletDownload", "Lcm/aptoide/pt/install/Install;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletAppProvider */
/* compiled from: WalletAppProvider.kt */
public final class WalletAppProvider {
    private final AppCenter appCenter;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final DownloadStateParser downloadStateParser;
    private final InstallManager installManager;

    public WalletAppProvider(AppCenter appCenter2, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2, InstallManager installManager2, DownloadStateParser downloadStateParser2) {
        C10202j.m34178b(appCenter2, "appCenter");
        C10202j.m34178b(aptoideInstalledAppsRepository2, "aptoideInstalledAppsRepository");
        C10202j.m34178b(installManager2, "installManager");
        C10202j.m34178b(downloadStateParser2, "downloadStateParser");
        this.appCenter = appCenter2;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
        this.installManager = installManager2;
        this.downloadStateParser = downloadStateParser2;
    }

    private final DownloadModel mapToDownloadModel(Install.InstallationType installationType, int i, Install.InstallationStatus installationStatus, boolean z, long j) {
        return new DownloadModel(this.downloadStateParser.parseDownloadType(installationType, false), i, this.downloadStateParser.parseDownloadState(installationStatus, z), j);
    }

    /* access modifiers changed from: private */
    public final WalletApp mapToWalletApp(DetailedAppRequestResult detailedAppRequestResult) {
        if (detailedAppRequestResult.hasError() || detailedAppRequestResult.isLoading()) {
            return new WalletApp((DownloadModel) null, false, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (Obb) null, 0, (String) null, 0.0f, (List) null, (List) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
        }
        DetailedApp detailedApp = detailedAppRequestResult.getDetailedApp();
        C10202j.m34174a((Object) detailedApp, "app");
        String name = detailedApp.getName();
        String str = name;
        C10202j.m34174a((Object) name, "app.name");
        String icon = detailedApp.getIcon();
        String str2 = icon;
        C10202j.m34174a((Object) icon, "app.icon");
        long id = detailedApp.getId();
        String packageName = detailedApp.getPackageName();
        String str3 = packageName;
        C10202j.m34174a((Object) packageName, "app.packageName");
        String md5 = detailedApp.getMd5();
        int versionCode = detailedApp.getVersionCode();
        String versionName = detailedApp.getVersionName();
        String path = detailedApp.getPath();
        String pathAlt = detailedApp.getPathAlt();
        Obb obb = detailedApp.getObb();
        long size = detailedApp.getSize();
        AppDeveloper developer = detailedApp.getDeveloper();
        C10202j.m34174a((Object) developer, "app.developer");
        String name2 = developer.getName();
        String str4 = name2;
        C10202j.m34174a((Object) name2, "app.developer.name");
        AppStats stats = detailedApp.getStats();
        C10202j.m34174a((Object) stats, "app.stats");
        AppRating rating = stats.getRating();
        C10202j.m34174a((Object) rating, "app.stats.rating");
        float average = rating.getAverage();
        List<Split> splits = detailedApp.getSplits();
        C10202j.m34174a((Object) splits, "app.splits");
        List<String> requiredSplits = detailedApp.getRequiredSplits();
        C10202j.m34174a((Object) requiredSplits, "app.requiredSplits");
        return new WalletApp((DownloadModel) null, false, str, str2, id, str3, md5, versionCode, versionName, path, pathAlt, obb, size, str4, average, splits, requiredSplits, (String) null, (String) null, 393216, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final WalletApp mergeToWalletApp(WalletApp walletApp, boolean z, Install install) {
        Install.InstallationType type = install.getType();
        C10202j.m34174a((Object) type, "walletDownload.type");
        int progress = install.getProgress();
        Install.InstallationStatus state = install.getState();
        C10202j.m34174a((Object) state, "walletDownload.state");
        walletApp.setDownloadModel(mapToDownloadModel(type, progress, state, install.isIndeterminate(), install.getAppSize()));
        walletApp.setInstalled(z);
        return walletApp;
    }

    public final AppCenter getAppCenter() {
        return this.appCenter;
    }

    public final AptoideInstalledAppsRepository getAptoideInstalledAppsRepository() {
        return this.aptoideInstalledAppsRepository;
    }

    public final DownloadStateParser getDownloadStateParser() {
        return this.downloadStateParser;
    }

    public final InstallManager getInstallManager() {
        return this.installManager;
    }

    public final C5368e<WalletApp> getWalletApp() {
        C5368e<R> f = this.appCenter.loadDetailedApp("com.appcoins.wallet", "catappult").mo18567c().mo18694j(new WalletAppProvider$getWalletApp$1(this)).mo18687f(new WalletAppProvider$getWalletApp$2(this));
        C10202j.m34174a((Object) f, "appCenter.loadDetailedAp…wnload)\n        }\n      }");
        return f;
    }
}
