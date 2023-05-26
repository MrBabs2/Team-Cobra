package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionsManager;
import p015cm.aptoide.p016pt.promotions.PromotionsManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesClaimPromotionsManagerFactory */
public final class FragmentModule_ProvidesClaimPromotionsManagerFactory implements C10824b<ClaimPromotionsManager> {
    private final FragmentModule module;
    private final Provider<PromotionsManager> promotionsManagerProvider;

    public FragmentModule_ProvidesClaimPromotionsManagerFactory(FragmentModule fragmentModule, Provider<PromotionsManager> provider) {
        this.module = fragmentModule;
        this.promotionsManagerProvider = provider;
    }

    public static FragmentModule_ProvidesClaimPromotionsManagerFactory create(FragmentModule fragmentModule, Provider<PromotionsManager> provider) {
        return new FragmentModule_ProvidesClaimPromotionsManagerFactory(fragmentModule, provider);
    }

    public static ClaimPromotionsManager providesClaimPromotionsManager(FragmentModule fragmentModule, PromotionsManager promotionsManager) {
        ClaimPromotionsManager providesClaimPromotionsManager = fragmentModule.providesClaimPromotionsManager(promotionsManager);
        C10825c.m36718a(providesClaimPromotionsManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesClaimPromotionsManager;
    }

    public ClaimPromotionsManager get() {
        return providesClaimPromotionsManager(this.module, this.promotionsManagerProvider.get());
    }
}
