package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.search.SearchNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesSearchNavigatorFactory */
public final class ActivityModule_ProvidesSearchNavigatorFactory implements C10824b<SearchNavigator> {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesSearchNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.appNavigatorProvider = provider2;
    }

    public static ActivityModule_ProvidesSearchNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        return new ActivityModule_ProvidesSearchNavigatorFactory(activityModule, provider, provider2);
    }

    public static SearchNavigator providesSearchNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        SearchNavigator providesSearchNavigator = activityModule.providesSearchNavigator(fragmentNavigator, appNavigator);
        C10825c.m36718a(providesSearchNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesSearchNavigator;
    }

    public SearchNavigator get() {
        return providesSearchNavigator(this.module, this.fragmentNavigatorProvider.get(), this.appNavigatorProvider.get());
    }
}
