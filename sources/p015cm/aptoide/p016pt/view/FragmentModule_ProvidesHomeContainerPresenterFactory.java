package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.home.ChipManager;
import p015cm.aptoide.p016pt.home.EskillsPreferencesManager;
import p015cm.aptoide.p016pt.home.Home;
import p015cm.aptoide.p016pt.home.HomeAnalytics;
import p015cm.aptoide.p016pt.home.HomeContainerNavigator;
import p015cm.aptoide.p016pt.home.HomeContainerPresenter;
import p015cm.aptoide.p016pt.home.HomeNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesHomeContainerPresenterFactory */
public final class FragmentModule_ProvidesHomeContainerPresenterFactory implements C10824b<HomeContainerPresenter> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<ChipManager> chipManagerProvider;
    private final Provider<EskillsPreferencesManager> eskillsPreferencesManagerProvider;
    private final Provider<HomeAnalytics> homeAnalyticsProvider;
    private final Provider<HomeContainerNavigator> homeContainerNavigatorProvider;
    private final Provider<HomeNavigator> homeNavigatorProvider;
    private final Provider<Home> homeProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesHomeContainerPresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<HomeContainerNavigator> provider2, Provider<HomeNavigator> provider3, Provider<HomeAnalytics> provider4, Provider<Home> provider5, Provider<ChipManager> provider6, Provider<EskillsPreferencesManager> provider7) {
        this.module = fragmentModule;
        this.accountManagerProvider = provider;
        this.homeContainerNavigatorProvider = provider2;
        this.homeNavigatorProvider = provider3;
        this.homeAnalyticsProvider = provider4;
        this.homeProvider = provider5;
        this.chipManagerProvider = provider6;
        this.eskillsPreferencesManagerProvider = provider7;
    }

    public static FragmentModule_ProvidesHomeContainerPresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<HomeContainerNavigator> provider2, Provider<HomeNavigator> provider3, Provider<HomeAnalytics> provider4, Provider<Home> provider5, Provider<ChipManager> provider6, Provider<EskillsPreferencesManager> provider7) {
        return new FragmentModule_ProvidesHomeContainerPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static HomeContainerPresenter providesHomeContainerPresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, HomeContainerNavigator homeContainerNavigator, HomeNavigator homeNavigator, HomeAnalytics homeAnalytics, Home home, ChipManager chipManager, EskillsPreferencesManager eskillsPreferencesManager) {
        HomeContainerPresenter providesHomeContainerPresenter = fragmentModule.providesHomeContainerPresenter(aptoideAccountManager, homeContainerNavigator, homeNavigator, homeAnalytics, home, chipManager, eskillsPreferencesManager);
        C10825c.m36718a(providesHomeContainerPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesHomeContainerPresenter;
    }

    public HomeContainerPresenter get() {
        return providesHomeContainerPresenter(this.module, this.accountManagerProvider.get(), this.homeContainerNavigatorProvider.get(), this.homeNavigatorProvider.get(), this.homeAnalyticsProvider.get(), this.homeProvider.get(), this.chipManagerProvider.get(), this.eskillsPreferencesManagerProvider.get());
    }
}
