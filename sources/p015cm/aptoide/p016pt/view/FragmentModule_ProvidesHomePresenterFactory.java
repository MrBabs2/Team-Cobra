package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.home.Home;
import p015cm.aptoide.p016pt.home.HomeAnalytics;
import p015cm.aptoide.p016pt.home.HomeNavigator;
import p015cm.aptoide.p016pt.home.HomePresenter;
import p015cm.aptoide.p016pt.home.bundles.ads.AdMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesHomePresenterFactory */
public final class FragmentModule_ProvidesHomePresenterFactory implements C10824b<HomePresenter> {
    private final Provider<AdMapper> adMapperProvider;
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<HomeAnalytics> homeAnalyticsProvider;
    private final Provider<HomeNavigator> homeNavigatorProvider;
    private final Provider<Home> homeProvider;
    private final FragmentModule module;
    private final Provider<UserFeedbackAnalytics> userFeedbackAnalyticsProvider;

    public FragmentModule_ProvidesHomePresenterFactory(FragmentModule fragmentModule, Provider<Home> provider, Provider<HomeNavigator> provider2, Provider<AdMapper> provider3, Provider<AptoideAccountManager> provider4, Provider<HomeAnalytics> provider5, Provider<UserFeedbackAnalytics> provider6) {
        this.module = fragmentModule;
        this.homeProvider = provider;
        this.homeNavigatorProvider = provider2;
        this.adMapperProvider = provider3;
        this.aptoideAccountManagerProvider = provider4;
        this.homeAnalyticsProvider = provider5;
        this.userFeedbackAnalyticsProvider = provider6;
    }

    public static FragmentModule_ProvidesHomePresenterFactory create(FragmentModule fragmentModule, Provider<Home> provider, Provider<HomeNavigator> provider2, Provider<AdMapper> provider3, Provider<AptoideAccountManager> provider4, Provider<HomeAnalytics> provider5, Provider<UserFeedbackAnalytics> provider6) {
        return new FragmentModule_ProvidesHomePresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static HomePresenter providesHomePresenter(FragmentModule fragmentModule, Home home, HomeNavigator homeNavigator, AdMapper adMapper, AptoideAccountManager aptoideAccountManager, HomeAnalytics homeAnalytics, UserFeedbackAnalytics userFeedbackAnalytics) {
        HomePresenter providesHomePresenter = fragmentModule.providesHomePresenter(home, homeNavigator, adMapper, aptoideAccountManager, homeAnalytics, userFeedbackAnalytics);
        C10825c.m36718a(providesHomePresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesHomePresenter;
    }

    public HomePresenter get() {
        return providesHomePresenter(this.module, this.homeProvider.get(), this.homeNavigatorProvider.get(), this.adMapperProvider.get(), this.aptoideAccountManagerProvider.get(), this.homeAnalyticsProvider.get(), this.userFeedbackAnalyticsProvider.get());
    }
}
