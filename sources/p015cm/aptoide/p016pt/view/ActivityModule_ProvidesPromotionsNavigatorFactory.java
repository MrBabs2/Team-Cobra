package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.promotions.PromotionsNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesPromotionsNavigatorFactory */
public final class ActivityModule_ProvidesPromotionsNavigatorFactory implements C10824b<PromotionsNavigator> {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesPromotionsNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.appNavigatorProvider = provider2;
    }

    public static ActivityModule_ProvidesPromotionsNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        return new ActivityModule_ProvidesPromotionsNavigatorFactory(activityModule, provider, provider2);
    }

    public static PromotionsNavigator providesPromotionsNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        PromotionsNavigator providesPromotionsNavigator = activityModule.providesPromotionsNavigator(fragmentNavigator, appNavigator);
        C10825c.m36718a(providesPromotionsNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesPromotionsNavigator;
    }

    public PromotionsNavigator get() {
        return providesPromotionsNavigator(this.module, this.fragmentNavigatorProvider.get(), this.appNavigatorProvider.get());
    }
}
