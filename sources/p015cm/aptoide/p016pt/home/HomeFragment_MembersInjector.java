package p015cm.aptoide.p016pt.home;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.home.HomeFragment_MembersInjector */
public final class HomeFragment_MembersInjector implements C10822a<HomeFragment> {
    private final Provider<CaptionBackgroundPainter> captionBackgroundPainterProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<HomePresenter> presenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public HomeFragment_MembersInjector(Provider<HomePresenter> provider, Provider<String> provider2, Provider<CaptionBackgroundPainter> provider3, Provider<ThemeManager> provider4) {
        this.presenterProvider = provider;
        this.marketNameProvider = provider2;
        this.captionBackgroundPainterProvider = provider3;
        this.themeManagerProvider = provider4;
    }

    public static C10822a<HomeFragment> create(Provider<HomePresenter> provider, Provider<String> provider2, Provider<CaptionBackgroundPainter> provider3, Provider<ThemeManager> provider4) {
        return new HomeFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectCaptionBackgroundPainter(HomeFragment homeFragment, CaptionBackgroundPainter captionBackgroundPainter) {
        homeFragment.captionBackgroundPainter = captionBackgroundPainter;
    }

    public static void injectMarketName(HomeFragment homeFragment, String str) {
        homeFragment.marketName = str;
    }

    public static void injectPresenter(HomeFragment homeFragment, HomePresenter homePresenter) {
        homeFragment.presenter = homePresenter;
    }

    public static void injectThemeManager(HomeFragment homeFragment, ThemeManager themeManager) {
        homeFragment.themeManager = themeManager;
    }

    public void injectMembers(HomeFragment homeFragment) {
        injectPresenter(homeFragment, this.presenterProvider.get());
        injectMarketName(homeFragment, this.marketNameProvider.get());
        injectCaptionBackgroundPainter(homeFragment, this.captionBackgroundPainterProvider.get());
        injectThemeManager(homeFragment, this.themeManagerProvider.get());
    }
}
