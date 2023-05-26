package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.view.app.ListStoreAppsNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideListStoreAppsNavigatorFactory */
public final class ActivityModule_ProvideListStoreAppsNavigatorFactory implements C10824b<ListStoreAppsNavigator> {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvideListStoreAppsNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.appNavigatorProvider = provider2;
    }

    public static ActivityModule_ProvideListStoreAppsNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        return new ActivityModule_ProvideListStoreAppsNavigatorFactory(activityModule, provider, provider2);
    }

    public static ListStoreAppsNavigator provideListStoreAppsNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        ListStoreAppsNavigator provideListStoreAppsNavigator = activityModule.provideListStoreAppsNavigator(fragmentNavigator, appNavigator);
        C10825c.m36718a(provideListStoreAppsNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideListStoreAppsNavigator;
    }

    public ListStoreAppsNavigator get() {
        return provideListStoreAppsNavigator(this.module, this.fragmentNavigatorProvider.get(), this.appNavigatorProvider.get());
    }
}
