package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionDialogPresenter;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionsManager;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionsNavigator;
import p015cm.aptoide.p016pt.promotions.PromotionsAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesClaimPromotionDialogPresenterFactory */
public final class FragmentModule_ProvidesClaimPromotionDialogPresenterFactory implements C10824b<ClaimPromotionDialogPresenter> {
    private final Provider<ClaimPromotionsManager> claimPromotionsManagerProvider;
    private final FragmentModule module;
    private final Provider<ClaimPromotionsNavigator> navigatorProvider;
    private final Provider<PromotionsAnalytics> promotionsAnalyticsProvider;

    public FragmentModule_ProvidesClaimPromotionDialogPresenterFactory(FragmentModule fragmentModule, Provider<ClaimPromotionsManager> provider, Provider<PromotionsAnalytics> provider2, Provider<ClaimPromotionsNavigator> provider3) {
        this.module = fragmentModule;
        this.claimPromotionsManagerProvider = provider;
        this.promotionsAnalyticsProvider = provider2;
        this.navigatorProvider = provider3;
    }

    public static FragmentModule_ProvidesClaimPromotionDialogPresenterFactory create(FragmentModule fragmentModule, Provider<ClaimPromotionsManager> provider, Provider<PromotionsAnalytics> provider2, Provider<ClaimPromotionsNavigator> provider3) {
        return new FragmentModule_ProvidesClaimPromotionDialogPresenterFactory(fragmentModule, provider, provider2, provider3);
    }

    public static ClaimPromotionDialogPresenter providesClaimPromotionDialogPresenter(FragmentModule fragmentModule, ClaimPromotionsManager claimPromotionsManager, PromotionsAnalytics promotionsAnalytics, ClaimPromotionsNavigator claimPromotionsNavigator) {
        ClaimPromotionDialogPresenter providesClaimPromotionDialogPresenter = fragmentModule.providesClaimPromotionDialogPresenter(claimPromotionsManager, promotionsAnalytics, claimPromotionsNavigator);
        C10825c.m36718a(providesClaimPromotionDialogPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesClaimPromotionDialogPresenter;
    }

    public ClaimPromotionDialogPresenter get() {
        return providesClaimPromotionDialogPresenter(this.module, this.claimPromotionsManagerProvider.get(), this.promotionsAnalyticsProvider.get(), this.navigatorProvider.get());
    }
}
