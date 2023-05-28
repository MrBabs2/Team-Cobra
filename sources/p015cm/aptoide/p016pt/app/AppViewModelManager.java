package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.account.view.store.StoreManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.app.view.AppCoinsViewModel;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.view.AppViewConfiguration;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p015cm.aptoide.p016pt.view.app.AppStats;
import p015cm.aptoide.p016pt.view.app.DetailedApp;
import p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult;
import p123rx.C5368e;
import p123rx.Single;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.app.AppViewModelManager */
public class AppViewModelManager {
    private final AppCenter appCenter;
    private final AppCoinsAdvertisingManager appCoinsAdvertisingManager;
    private final AppCoinsManager appCoinsManager;
    private final AppViewConfiguration appViewConfiguration;
    private final AppcMigrationManager appcMigrationManager;
    private AppModel cachedApp;
    private AppCoinsViewModel cachedAppCoinsViewModel;
    private final DownloadStateParser downloadStateParser;
    private final InstallManager installManager;
    private final String marketName;
    private final StoreManager storeManager;

    public AppViewModelManager(AppViewConfiguration appViewConfiguration2, StoreManager storeManager2, String str, AppCenter appCenter2, DownloadStateParser downloadStateParser2, InstallManager installManager2, AppcMigrationManager appcMigrationManager2, AppCoinsAdvertisingManager appCoinsAdvertisingManager2, AppCoinsManager appCoinsManager2) {
        this.appViewConfiguration = appViewConfiguration2;
        this.storeManager = storeManager2;
        this.marketName = str;
        this.appCenter = appCenter2;
        this.downloadStateParser = downloadStateParser2;
        this.installManager = installManager2;
        this.appcMigrationManager = appcMigrationManager2;
        this.appCoinsAdvertisingManager = appCoinsAdvertisingManager2;
        this.appCoinsManager = appCoinsManager2;
    }

    private Single<AppModel> createAppViewViewModel(DetailedApp detailedApp) {
        return isStoreFollowed(detailedApp.getStore().getId()).mo18569d(new C1415o0(this, detailedApp, detailedApp.getStats()));
    }

    private C5368e<AppCoinsViewModel> getAppCoinsViewModel(AppModel appModel) {
        AppCoinsViewModel appCoinsViewModel = this.cachedAppCoinsViewModel;
        if (appCoinsViewModel != null) {
            return C5368e.m10257c(appCoinsViewModel);
        }
        Single<BonusAppcModel> a = Single.m10119a(new BonusAppcModel(false, 0));
        Single<AppCoinsAdvertisingModel> a2 = Single.m10119a(new AppCoinsAdvertisingModel());
        if (appModel.hasBilling()) {
            a = C10832d.m36727a(this.appCoinsManager.getBonusAppc());
        }
        if (appModel.hasAdvertising()) {
            a2 = this.appCoinsAdvertisingManager.getAdvertising(appModel.getPackageName(), appModel.getVersionCode());
        }
        return Single.m10124a(a2, a, new C1421r0(this, appModel)).mo18567c();
    }

    private C5368e<DownloadModel> getDownloadModel(AppModel appModel) {
        return loadDownloadModel(appModel.getMd5(), appModel.getPackageName(), appModel.getVersionCode(), appModel.getSignature(), appModel.getStore().getId(), appModel.hasAdvertising() || appModel.hasBilling());
    }

    private C5368e<MigrationModel> getMigrationModel(AppModel appModel) {
        return this.appcMigrationManager.isAppMigrated(appModel.getPackageName()).mo18694j(C1946z0.f4558f);
    }

    private Single<Boolean> isStoreFollowed(long j) {
        return this.storeManager.isSubscribed(j).mo18669c().mo18700m();
    }

    private Single<AppModel> loadAppModel(long j, String str, String str2) {
        AppModel appModel = this.cachedApp;
        if (appModel != null) {
            return Single.m10119a(appModel);
        }
        return this.appCenter.loadDetailedApp(j, str, str2).mo18559a(new C1423s0(this));
    }

    private Single<AppModel> loadAppModelFromMd5(String str) {
        AppModel appModel = this.cachedApp;
        if (appModel == null || !appModel.getMd5().equals(str)) {
            return this.appCenter.loadDetailedAppFromMd5(str).mo18559a(new C1408l0(this));
        }
        return Single.m10119a(this.cachedApp);
    }

    private Single<AppModel> loadAppViewViewModelFromUniqueName(String str) {
        AppModel appModel = this.cachedApp;
        if (appModel == null || !appModel.getUniqueName().equals(str)) {
            return this.appCenter.loadDetailedAppFromUniqueName(str).mo18559a(new C1408l0(this));
        }
        return Single.m10119a(this.cachedApp);
    }

    private C5368e<DownloadModel> loadDownloadModel(String str, String str2, int i, String str3, long j, boolean z) {
        return C5368e.m10247a(this.installManager.getInstall(str, str2, i), this.appcMigrationManager.isMigrationApp(str2, str3, i, j, z), new C1419q0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: map */
    public Single<AppModel> mo7017b(DetailedAppRequestResult detailedAppRequestResult) {
        if (detailedAppRequestResult.getDetailedApp() != null) {
            return createAppViewViewModel(detailedAppRequestResult.getDetailedApp());
        }
        if (detailedAppRequestResult.isLoading()) {
            return Single.m10119a(new AppModel(detailedAppRequestResult.isLoading()));
        }
        if (detailedAppRequestResult.hasError()) {
            return Single.m10119a(new AppModel(detailedAppRequestResult.getError()));
        }
        return Single.m10119a(new AppModel(DetailedAppRequestResult.Error.GENERIC));
    }

    /* access modifiers changed from: private */
    /* renamed from: mergeToAppViewModel */
    public AppViewModel mo7012a(AppModel appModel, DownloadModel downloadModel, AppCoinsViewModel appCoinsViewModel, MigrationModel migrationModel) {
        return new AppViewModel(appModel, downloadModel, appCoinsViewModel, migrationModel);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7016a(AppModel appModel) {
        return C5368e.m10246a(getDownloadModel(appModel), getAppCoinsViewModel(appModel), getMigrationModel(appModel), new C1413n0(this, appModel));
    }

    public Single<AppModel> getAppModel() {
        if (this.appViewConfiguration.getAppId() >= 0) {
            return loadAppModel(this.appViewConfiguration.getAppId(), this.appViewConfiguration.getStoreName(), this.appViewConfiguration.getPackageName());
        }
        if (this.appViewConfiguration.hasMd5()) {
            return loadAppModelFromMd5(this.appViewConfiguration.getMd5());
        }
        if (this.appViewConfiguration.hasUniqueName()) {
            return loadAppViewViewModelFromUniqueName(this.appViewConfiguration.getUniqueName());
        }
        return loadAppModel(this.appViewConfiguration.getPackageName(), this.appViewConfiguration.getStoreName());
    }

    public Single<AppViewModel> getAppViewModel() {
        return observeAppViewModel().mo18669c().mo18700m();
    }

    public C5368e<AppViewModel> observeAppViewModel() {
        return getAppModel().mo18567c().mo18687f(new C1417p0(this));
    }

    private Single<AppModel> loadAppModel(String str, String str2) {
        AppModel appModel = this.cachedApp;
        if (appModel == null || !appModel.getPackageName().equals(str)) {
            return this.appCenter.loadDetailedApp(str, str2).mo18559a(new C1410m0(this));
        }
        return Single.m10119a(this.cachedApp);
    }

    /* renamed from: a */
    public /* synthetic */ AppCoinsViewModel mo7014a(AppModel appModel, AppCoinsAdvertisingModel appCoinsAdvertisingModel, BonusAppcModel bonusAppcModel) {
        AppCoinsViewModel appCoinsViewModel = new AppCoinsViewModel(false, appModel.hasBilling(), appCoinsAdvertisingModel, bonusAppcModel);
        this.cachedAppCoinsViewModel = appCoinsViewModel;
        return appCoinsViewModel;
    }

    /* renamed from: a */
    public /* synthetic */ DownloadModel mo7013a(Install install, Boolean bool) {
        return new DownloadModel(this.downloadStateParser.parseDownloadType(install.getType(), bool.booleanValue()), install.getProgress(), this.downloadStateParser.parseDownloadState(install.getState(), install.isIndeterminate()), install.getAppSize());
    }

    /* renamed from: a */
    public /* synthetic */ AppModel mo7011a(DetailedApp detailedApp, AppStats appStats, Boolean bool) {
        AppModel appModel = r1;
        AppModel appModel2 = new AppModel(detailedApp.getId(), detailedApp.getName(), detailedApp.getStore(), this.appViewConfiguration.getStoreTheme(), detailedApp.isGoodApp(), detailedApp.getMalware(), detailedApp.getAppFlags(), detailedApp.getTags(), detailedApp.getUsedFeatures(), detailedApp.getUsedPermissions(), detailedApp.getFileSize(), detailedApp.getMd5(), detailedApp.getPath(), detailedApp.getPathAlt(), detailedApp.getVersionCode(), detailedApp.getVersionName(), detailedApp.getPackageName(), detailedApp.getSize(), appStats.getDownloads(), appStats.getGlobalRating(), appStats.getPackageDownloads(), appStats.getRating(), detailedApp.getDeveloper(), detailedApp.getGraphic(), detailedApp.getIcon(), detailedApp.getMedia(), detailedApp.getModified(), detailedApp.getAdded(), detailedApp.getObb(), detailedApp.getWebUrls(), detailedApp.isLatestTrustedVersion(), detailedApp.getUniqueName(), this.appViewConfiguration.shouldInstall(), this.appViewConfiguration.getAppc(), this.appViewConfiguration.getMinimalAd(), this.appViewConfiguration.getEditorsChoice(), this.appViewConfiguration.getOriginTag(), bool.booleanValue(), this.marketName, detailedApp.hasBilling(), detailedApp.hasAdvertising(), detailedApp.getBdsFlags(), this.appViewConfiguration.getCampaignUrl(), detailedApp.getSignature(), detailedApp.isMature(), detailedApp.getSplits(), detailedApp.getRequiredSplits(), this.appViewConfiguration.getOemId(), detailedApp.isBeta(), this.appViewConfiguration.isEskillsAppView());
        AppModel appModel3 = appModel;
        this.cachedApp = appModel3;
        return appModel3;
    }
}
