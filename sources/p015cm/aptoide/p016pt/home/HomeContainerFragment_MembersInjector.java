package p015cm.aptoide.p016pt.home;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.home.HomeContainerFragment_MembersInjector */
public final class HomeContainerFragment_MembersInjector implements C10822a<HomeContainerFragment> {
    private final Provider<HomeContainerPresenter> presenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public HomeContainerFragment_MembersInjector(Provider<HomeContainerPresenter> provider, Provider<ThemeManager> provider2) {
        this.presenterProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static C10822a<HomeContainerFragment> create(Provider<HomeContainerPresenter> provider, Provider<ThemeManager> provider2) {
        return new HomeContainerFragment_MembersInjector(provider, provider2);
    }

    public static void injectPresenter(HomeContainerFragment homeContainerFragment, HomeContainerPresenter homeContainerPresenter) {
        homeContainerFragment.presenter = homeContainerPresenter;
    }

    public static void injectThemeManager(HomeContainerFragment homeContainerFragment, ThemeManager themeManager) {
        homeContainerFragment.themeManager = themeManager;
    }

    public void injectMembers(HomeContainerFragment homeContainerFragment) {
        injectPresenter(homeContainerFragment, this.presenterProvider.get());
        injectThemeManager(homeContainerFragment, this.themeManagerProvider.get());
    }
}
