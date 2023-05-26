package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.CatappultNavigator;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesAppViewNavigatorFactory */
public final class ActivityModule_ProvidesAppViewNavigatorFactory implements C10824b<AppViewNavigator> {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<CatappultNavigator> catappultNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesAppViewNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2, Provider<CatappultNavigator> provider3) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.appNavigatorProvider = provider2;
        this.catappultNavigatorProvider = provider3;
    }

    public static ActivityModule_ProvidesAppViewNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2, Provider<CatappultNavigator> provider3) {
        return new ActivityModule_ProvidesAppViewNavigatorFactory(activityModule, provider, provider2, provider3);
    }

    public static AppViewNavigator providesAppViewNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AppNavigator appNavigator, CatappultNavigator catappultNavigator) {
        AppViewNavigator providesAppViewNavigator = activityModule.providesAppViewNavigator(fragmentNavigator, appNavigator, catappultNavigator);
        C10825c.m36718a(providesAppViewNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppViewNavigator;
    }

    public AppViewNavigator get() {
        return providesAppViewNavigator(this.module, this.fragmentNavigatorProvider.get(), this.appNavigatorProvider.get(), this.catappultNavigatorProvider.get());
    }
}
