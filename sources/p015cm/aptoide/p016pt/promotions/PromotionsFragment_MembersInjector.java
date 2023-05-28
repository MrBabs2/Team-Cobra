package p015cm.aptoide.p016pt.promotions;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.promotions.PromotionsFragment_MembersInjector */
public final class PromotionsFragment_MembersInjector implements C10822a<PromotionsFragment> {
    private final Provider<PromotionsPresenter> promotionsPresenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public PromotionsFragment_MembersInjector(Provider<PromotionsPresenter> provider, Provider<ThemeManager> provider2) {
        this.promotionsPresenterProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static C10822a<PromotionsFragment> create(Provider<PromotionsPresenter> provider, Provider<ThemeManager> provider2) {
        return new PromotionsFragment_MembersInjector(provider, provider2);
    }

    public static void injectPromotionsPresenter(PromotionsFragment promotionsFragment, PromotionsPresenter promotionsPresenter) {
        promotionsFragment.promotionsPresenter = promotionsPresenter;
    }

    public static void injectThemeManager(PromotionsFragment promotionsFragment, ThemeManager themeManager) {
        promotionsFragment.themeManager = themeManager;
    }

    public void injectMembers(PromotionsFragment promotionsFragment) {
        injectPromotionsPresenter(promotionsFragment, this.promotionsPresenterProvider.get());
        injectThemeManager(promotionsFragment, this.themeManagerProvider.get());
    }
}
