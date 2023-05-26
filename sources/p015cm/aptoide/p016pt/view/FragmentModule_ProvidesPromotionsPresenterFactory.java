package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.promotions.PromotionsAnalytics;
import p015cm.aptoide.p016pt.promotions.PromotionsManager;
import p015cm.aptoide.p016pt.promotions.PromotionsNavigator;
import p015cm.aptoide.p016pt.promotions.PromotionsPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesPromotionsPresenterFactory */
public final class FragmentModule_ProvidesPromotionsPresenterFactory implements C10824b<PromotionsPresenter> {
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<PromotionsAnalytics> promotionsAnalyticsProvider;
    private final Provider<PromotionsManager> promotionsManagerProvider;
    private final Provider<PromotionsNavigator> promotionsNavigatorProvider;
    private final Provider<String> promotionsTypeProvider;

    public FragmentModule_ProvidesPromotionsPresenterFactory(FragmentModule fragmentModule, Provider<PromotionsManager> provider, Provider<PromotionsAnalytics> provider2, Provider<PromotionsNavigator> provider3, Provider<String> provider4, Provider<MoPubAdsManager> provider5) {
        this.module = fragmentModule;
        this.promotionsManagerProvider = provider;
        this.promotionsAnalyticsProvider = provider2;
        this.promotionsNavigatorProvider = provider3;
        this.promotionsTypeProvider = provider4;
        this.moPubAdsManagerProvider = provider5;
    }

    public static FragmentModule_ProvidesPromotionsPresenterFactory create(FragmentModule fragmentModule, Provider<PromotionsManager> provider, Provider<PromotionsAnalytics> provider2, Provider<PromotionsNavigator> provider3, Provider<String> provider4, Provider<MoPubAdsManager> provider5) {
        return new FragmentModule_ProvidesPromotionsPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static PromotionsPresenter providesPromotionsPresenter(FragmentModule fragmentModule, PromotionsManager promotionsManager, PromotionsAnalytics promotionsAnalytics, PromotionsNavigator promotionsNavigator, String str, MoPubAdsManager moPubAdsManager) {
        PromotionsPresenter providesPromotionsPresenter = fragmentModule.providesPromotionsPresenter(promotionsManager, promotionsAnalytics, promotionsNavigator, str, moPubAdsManager);
        C10825c.m36718a(providesPromotionsPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesPromotionsPresenter;
    }

    public PromotionsPresenter get() {
        return providesPromotionsPresenter(this.module, this.promotionsManagerProvider.get(), this.promotionsAnalyticsProvider.get(), this.promotionsNavigatorProvider.get(), this.promotionsTypeProvider.get(), this.moPubAdsManagerProvider.get());
    }
}
