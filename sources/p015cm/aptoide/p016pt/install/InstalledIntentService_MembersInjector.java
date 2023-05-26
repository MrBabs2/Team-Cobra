package p015cm.aptoide.p016pt.install;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.CampaignAnalytics;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.install.InstalledIntentService_MembersInjector */
public final class InstalledIntentService_MembersInjector implements C10822a<InstalledIntentService> {
    private final Provider<AppcMigrationManager> appcMigrationManagerProvider;
    private final Provider<AptoideInstallManager> aptoideInstallManagerProvider;
    private final Provider<CampaignAnalytics> campaignAnalyticsProvider;
    private final Provider<FileUtils> fileUtilsProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final Provider<RoomStoredMinimalAdPersistence> roomStoredMinimalAdPersistenceProvider;
    private final Provider<UpdateRepository> updatesRepositoryProvider;

    public InstalledIntentService_MembersInjector(Provider<InstallAnalytics> provider, Provider<CampaignAnalytics> provider2, Provider<AppcMigrationManager> provider3, Provider<RoomStoredMinimalAdPersistence> provider4, Provider<UpdateRepository> provider5, Provider<AptoideInstallManager> provider6, Provider<FileUtils> provider7) {
        this.installAnalyticsProvider = provider;
        this.campaignAnalyticsProvider = provider2;
        this.appcMigrationManagerProvider = provider3;
        this.roomStoredMinimalAdPersistenceProvider = provider4;
        this.updatesRepositoryProvider = provider5;
        this.aptoideInstallManagerProvider = provider6;
        this.fileUtilsProvider = provider7;
    }

    public static C10822a<InstalledIntentService> create(Provider<InstallAnalytics> provider, Provider<CampaignAnalytics> provider2, Provider<AppcMigrationManager> provider3, Provider<RoomStoredMinimalAdPersistence> provider4, Provider<UpdateRepository> provider5, Provider<AptoideInstallManager> provider6, Provider<FileUtils> provider7) {
        return new InstalledIntentService_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectAppcMigrationManager(InstalledIntentService installedIntentService, AppcMigrationManager appcMigrationManager) {
        installedIntentService.appcMigrationManager = appcMigrationManager;
    }

    public static void injectAptoideInstallManager(InstalledIntentService installedIntentService, AptoideInstallManager aptoideInstallManager) {
        installedIntentService.aptoideInstallManager = aptoideInstallManager;
    }

    public static void injectCampaignAnalytics(InstalledIntentService installedIntentService, CampaignAnalytics campaignAnalytics) {
        installedIntentService.campaignAnalytics = campaignAnalytics;
    }

    public static void injectFileUtils(InstalledIntentService installedIntentService, FileUtils fileUtils) {
        installedIntentService.fileUtils = fileUtils;
    }

    public static void injectInstallAnalytics(InstalledIntentService installedIntentService, InstallAnalytics installAnalytics) {
        installedIntentService.installAnalytics = installAnalytics;
    }

    public static void injectRoomStoredMinimalAdPersistence(InstalledIntentService installedIntentService, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        installedIntentService.roomStoredMinimalAdPersistence = roomStoredMinimalAdPersistence;
    }

    public static void injectUpdatesRepository(InstalledIntentService installedIntentService, UpdateRepository updateRepository) {
        installedIntentService.updatesRepository = updateRepository;
    }

    public void injectMembers(InstalledIntentService installedIntentService) {
        injectInstallAnalytics(installedIntentService, this.installAnalyticsProvider.get());
        injectCampaignAnalytics(installedIntentService, this.campaignAnalyticsProvider.get());
        injectAppcMigrationManager(installedIntentService, this.appcMigrationManagerProvider.get());
        injectRoomStoredMinimalAdPersistence(installedIntentService, this.roomStoredMinimalAdPersistenceProvider.get());
        injectUpdatesRepository(installedIntentService, this.updatesRepositoryProvider.get());
        injectAptoideInstallManager(installedIntentService, this.aptoideInstallManagerProvider.get());
        injectFileUtils(installedIntentService, this.fileUtilsProvider.get());
    }
}
