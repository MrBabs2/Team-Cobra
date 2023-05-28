package p015cm.aptoide.p016pt.view;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AgentPersistence;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateManager;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.home.apps.UpdatesManager;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.install.installer.RootInstallationRetryHandler;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p015cm.aptoide.p016pt.util.ApkFyManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideMainPresenterFactory */
public final class ActivityModule_ProvideMainPresenterFactory implements C10824b<Presenter> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AgentPersistence> agentPersistenceProvider;
    private final Provider<ApkFyManager> apkFyManagerProvider;
    private final Provider<AutoUpdateManager> autoUpdateManagerProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<DeepLinkManager> deepLinkManagerProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final ActivityModule module;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<RootInstallationRetryHandler> rootInstallationRetryHandlerProvider;
    private final Provider<SharedPreferences> secureSharedPreferencesProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<UpdatesManager> updatesManagerProvider;

    public ActivityModule_ProvideMainPresenterFactory(ActivityModule activityModule, Provider<RootInstallationRetryHandler> provider, Provider<ApkFyManager> provider2, Provider<InstallManager> provider3, Provider<SharedPreferences> provider4, Provider<SharedPreferences> provider5, Provider<FragmentNavigator> provider6, Provider<DeepLinkManager> provider7, Provider<BottomNavigationNavigator> provider8, Provider<UpdatesManager> provider9, Provider<AutoUpdateManager> provider10, Provider<RootAvailabilityManager> provider11, Provider<BottomNavigationMapper> provider12, Provider<AptoideAccountManager> provider13, Provider<AccountNavigator> provider14, Provider<AgentPersistence> provider15) {
        this.module = activityModule;
        this.rootInstallationRetryHandlerProvider = provider;
        this.apkFyManagerProvider = provider2;
        this.installManagerProvider = provider3;
        this.sharedPreferencesProvider = provider4;
        this.secureSharedPreferencesProvider = provider5;
        this.fragmentNavigatorProvider = provider6;
        this.deepLinkManagerProvider = provider7;
        this.bottomNavigationNavigatorProvider = provider8;
        this.updatesManagerProvider = provider9;
        this.autoUpdateManagerProvider = provider10;
        this.rootAvailabilityManagerProvider = provider11;
        this.bottomNavigationMapperProvider = provider12;
        this.accountManagerProvider = provider13;
        this.accountNavigatorProvider = provider14;
        this.agentPersistenceProvider = provider15;
    }

    public static ActivityModule_ProvideMainPresenterFactory create(ActivityModule activityModule, Provider<RootInstallationRetryHandler> provider, Provider<ApkFyManager> provider2, Provider<InstallManager> provider3, Provider<SharedPreferences> provider4, Provider<SharedPreferences> provider5, Provider<FragmentNavigator> provider6, Provider<DeepLinkManager> provider7, Provider<BottomNavigationNavigator> provider8, Provider<UpdatesManager> provider9, Provider<AutoUpdateManager> provider10, Provider<RootAvailabilityManager> provider11, Provider<BottomNavigationMapper> provider12, Provider<AptoideAccountManager> provider13, Provider<AccountNavigator> provider14, Provider<AgentPersistence> provider15) {
        return new ActivityModule_ProvideMainPresenterFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static Presenter provideMainPresenter(ActivityModule activityModule, RootInstallationRetryHandler rootInstallationRetryHandler, ApkFyManager apkFyManager, InstallManager installManager, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, FragmentNavigator fragmentNavigator, DeepLinkManager deepLinkManager, BottomNavigationNavigator bottomNavigationNavigator, UpdatesManager updatesManager, AutoUpdateManager autoUpdateManager, RootAvailabilityManager rootAvailabilityManager, BottomNavigationMapper bottomNavigationMapper, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AgentPersistence agentPersistence) {
        Presenter provideMainPresenter = activityModule.provideMainPresenter(rootInstallationRetryHandler, apkFyManager, installManager, sharedPreferences, sharedPreferences2, fragmentNavigator, deepLinkManager, bottomNavigationNavigator, updatesManager, autoUpdateManager, rootAvailabilityManager, bottomNavigationMapper, aptoideAccountManager, accountNavigator, agentPersistence);
        C10825c.m36718a(provideMainPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return provideMainPresenter;
    }

    public Presenter get() {
        return provideMainPresenter(this.module, this.rootInstallationRetryHandlerProvider.get(), this.apkFyManagerProvider.get(), this.installManagerProvider.get(), this.sharedPreferencesProvider.get(), this.secureSharedPreferencesProvider.get(), this.fragmentNavigatorProvider.get(), this.deepLinkManagerProvider.get(), this.bottomNavigationNavigatorProvider.get(), this.updatesManagerProvider.get(), this.autoUpdateManagerProvider.get(), this.rootAvailabilityManagerProvider.get(), this.bottomNavigationMapperProvider.get(), this.accountManagerProvider.get(), this.accountNavigatorProvider.get(), this.agentPersistenceProvider.get());
    }
}
