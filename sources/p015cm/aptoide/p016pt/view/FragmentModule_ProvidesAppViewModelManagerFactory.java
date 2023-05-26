package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.account.view.store.StoreManager;
import p015cm.aptoide.p016pt.app.AppCoinsAdvertisingManager;
import p015cm.aptoide.p016pt.app.AppViewModelManager;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppViewModelManagerFactory */
public final class FragmentModule_ProvidesAppViewModelManagerFactory implements C10824b<AppViewModelManager> {
    private final Provider<AppCenter> appCenterProvider;
    private final Provider<AppCoinsAdvertisingManager> appCoinsAdvertisingManagerProvider;
    private final Provider<AppCoinsManager> appCoinsManagerProvider;
    private final Provider<AppViewConfiguration> appViewConfigurationProvider;
    private final Provider<AppcMigrationManager> appcMigrationManagerProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<String> marketNameProvider;
    private final FragmentModule module;
    private final Provider<StoreManager> storeManagerProvider;

    public FragmentModule_ProvidesAppViewModelManagerFactory(FragmentModule fragmentModule, Provider<AppViewConfiguration> provider, Provider<StoreManager> provider2, Provider<String> provider3, Provider<AppCenter> provider4, Provider<DownloadStateParser> provider5, Provider<InstallManager> provider6, Provider<AppcMigrationManager> provider7, Provider<AppCoinsAdvertisingManager> provider8, Provider<AppCoinsManager> provider9) {
        this.module = fragmentModule;
        this.appViewConfigurationProvider = provider;
        this.storeManagerProvider = provider2;
        this.marketNameProvider = provider3;
        this.appCenterProvider = provider4;
        this.downloadStateParserProvider = provider5;
        this.installManagerProvider = provider6;
        this.appcMigrationManagerProvider = provider7;
        this.appCoinsAdvertisingManagerProvider = provider8;
        this.appCoinsManagerProvider = provider9;
    }

    public static FragmentModule_ProvidesAppViewModelManagerFactory create(FragmentModule fragmentModule, Provider<AppViewConfiguration> provider, Provider<StoreManager> provider2, Provider<String> provider3, Provider<AppCenter> provider4, Provider<DownloadStateParser> provider5, Provider<InstallManager> provider6, Provider<AppcMigrationManager> provider7, Provider<AppCoinsAdvertisingManager> provider8, Provider<AppCoinsManager> provider9) {
        return new FragmentModule_ProvidesAppViewModelManagerFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static AppViewModelManager providesAppViewModelManager(FragmentModule fragmentModule, AppViewConfiguration appViewConfiguration, StoreManager storeManager, String str, AppCenter appCenter, DownloadStateParser downloadStateParser, InstallManager installManager, AppcMigrationManager appcMigrationManager, AppCoinsAdvertisingManager appCoinsAdvertisingManager, AppCoinsManager appCoinsManager) {
        AppViewModelManager providesAppViewModelManager = fragmentModule.providesAppViewModelManager(appViewConfiguration, storeManager, str, appCenter, downloadStateParser, installManager, appcMigrationManager, appCoinsAdvertisingManager, appCoinsManager);
        C10825c.m36718a(providesAppViewModelManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppViewModelManager;
    }

    public AppViewModelManager get() {
        return providesAppViewModelManager(this.module, this.appViewConfigurationProvider.get(), this.storeManagerProvider.get(), this.marketNameProvider.get(), this.appCenterProvider.get(), this.downloadStateParserProvider.get(), this.installManagerProvider.get(), this.appcMigrationManagerProvider.get(), this.appCoinsAdvertisingManagerProvider.get(), this.appCoinsManagerProvider.get());
    }
}
