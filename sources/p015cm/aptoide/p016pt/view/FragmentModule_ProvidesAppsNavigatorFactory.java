package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.home.apps.AppsNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppsNavigatorFactory */
public final class FragmentModule_ProvidesAppsNavigatorFactory implements C10824b<AppsNavigator> {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesAppsNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2, Provider<AppNavigator> provider3) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationMapperProvider = provider2;
        this.appNavigatorProvider = provider3;
    }

    public static FragmentModule_ProvidesAppsNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2, Provider<AppNavigator> provider3) {
        return new FragmentModule_ProvidesAppsNavigatorFactory(fragmentModule, provider, provider2, provider3);
    }

    public static AppsNavigator providesAppsNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator) {
        AppsNavigator providesAppsNavigator = fragmentModule.providesAppsNavigator(fragmentNavigator, bottomNavigationMapper, appNavigator);
        C10825c.m36718a(providesAppsNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppsNavigator;
    }

    public AppsNavigator get() {
        return providesAppsNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationMapperProvider.get(), this.appNavigatorProvider.get());
    }
}
