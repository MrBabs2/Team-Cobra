package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.home.HomeNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesHomeNavigatorFactory */
public final class FragmentModule_ProvidesHomeNavigatorFactory implements C10824b<HomeNavigator> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public FragmentModule_ProvidesHomeNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2, Provider<AppNavigator> provider3, Provider<AccountNavigator> provider4, Provider<ThemeManager> provider5) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationMapperProvider = provider2;
        this.appNavigatorProvider = provider3;
        this.accountNavigatorProvider = provider4;
        this.themeManagerProvider = provider5;
    }

    public static FragmentModule_ProvidesHomeNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2, Provider<AppNavigator> provider3, Provider<AccountNavigator> provider4, Provider<ThemeManager> provider5) {
        return new FragmentModule_ProvidesHomeNavigatorFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static HomeNavigator providesHomeNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator, AccountNavigator accountNavigator, ThemeManager themeManager) {
        HomeNavigator providesHomeNavigator = fragmentModule.providesHomeNavigator(fragmentNavigator, bottomNavigationMapper, appNavigator, accountNavigator, themeManager);
        C10825c.m36718a(providesHomeNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesHomeNavigator;
    }

    public HomeNavigator get() {
        return providesHomeNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationMapperProvider.get(), this.appNavigatorProvider.get(), this.accountNavigatorProvider.get(), this.themeManagerProvider.get());
    }
}
