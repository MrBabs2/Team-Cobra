package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesAppNavigatorFactory */
public final class ActivityModule_ProvidesAppNavigatorFactory implements C10824b<AppNavigator> {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesAppNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static ActivityModule_ProvidesAppNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider) {
        return new ActivityModule_ProvidesAppNavigatorFactory(activityModule, provider);
    }

    public static AppNavigator providesAppNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator) {
        AppNavigator providesAppNavigator = activityModule.providesAppNavigator(fragmentNavigator);
        C10825c.m36718a(providesAppNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppNavigator;
    }

    public AppNavigator get() {
        return providesAppNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
