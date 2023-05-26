package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionsNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesClaimPromotionsNavigatorFactory */
public final class ActivityModule_ProvidesClaimPromotionsNavigatorFactory implements C10824b<ClaimPromotionsNavigator> {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesClaimPromotionsNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.appNavigatorProvider = provider2;
    }

    public static ActivityModule_ProvidesClaimPromotionsNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        return new ActivityModule_ProvidesClaimPromotionsNavigatorFactory(activityModule, provider, provider2);
    }

    public static ClaimPromotionsNavigator providesClaimPromotionsNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        ClaimPromotionsNavigator providesClaimPromotionsNavigator = activityModule.providesClaimPromotionsNavigator(fragmentNavigator, appNavigator);
        C10825c.m36718a(providesClaimPromotionsNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesClaimPromotionsNavigator;
    }

    public ClaimPromotionsNavigator get() {
        return providesClaimPromotionsNavigator(this.module, this.fragmentNavigatorProvider.get(), this.appNavigatorProvider.get());
    }
}
