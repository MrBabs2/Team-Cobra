package p015cm.aptoide.p016pt.home.apps;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.home.apps.AppsFragment_MembersInjector */
public final class AppsFragment_MembersInjector implements C10822a<AppsFragment> {
    private final Provider<AppsPresenter> appsPresenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public AppsFragment_MembersInjector(Provider<AppsPresenter> provider, Provider<ThemeManager> provider2) {
        this.appsPresenterProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static C10822a<AppsFragment> create(Provider<AppsPresenter> provider, Provider<ThemeManager> provider2) {
        return new AppsFragment_MembersInjector(provider, provider2);
    }

    public static void injectAppsPresenter(AppsFragment appsFragment, AppsPresenter appsPresenter) {
        appsFragment.appsPresenter = appsPresenter;
    }

    public static void injectThemeManager(AppsFragment appsFragment, ThemeManager themeManager) {
        appsFragment.themeManager = themeManager;
    }

    public void injectMembers(AppsFragment appsFragment) {
        injectAppsPresenter(appsFragment, this.appsPresenterProvider.get());
        injectThemeManager(appsFragment, this.themeManagerProvider.get());
    }
}
