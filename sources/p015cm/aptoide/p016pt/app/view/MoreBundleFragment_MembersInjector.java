package p015cm.aptoide.p016pt.app.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.app.view.MoreBundleFragment_MembersInjector */
public final class MoreBundleFragment_MembersInjector implements C10822a<MoreBundleFragment> {
    private final Provider<CaptionBackgroundPainter> captionBackgroundPainterProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MoreBundlePresenter> presenterProvider;
    private final Provider<ThemeManager> themeAttributeProvider;

    public MoreBundleFragment_MembersInjector(Provider<MoreBundlePresenter> provider, Provider<String> provider2, Provider<CaptionBackgroundPainter> provider3, Provider<ThemeManager> provider4) {
        this.presenterProvider = provider;
        this.marketNameProvider = provider2;
        this.captionBackgroundPainterProvider = provider3;
        this.themeAttributeProvider = provider4;
    }

    public static C10822a<MoreBundleFragment> create(Provider<MoreBundlePresenter> provider, Provider<String> provider2, Provider<CaptionBackgroundPainter> provider3, Provider<ThemeManager> provider4) {
        return new MoreBundleFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectCaptionBackgroundPainter(MoreBundleFragment moreBundleFragment, CaptionBackgroundPainter captionBackgroundPainter) {
        moreBundleFragment.captionBackgroundPainter = captionBackgroundPainter;
    }

    public static void injectMarketName(MoreBundleFragment moreBundleFragment, String str) {
        moreBundleFragment.marketName = str;
    }

    public static void injectPresenter(MoreBundleFragment moreBundleFragment, MoreBundlePresenter moreBundlePresenter) {
        moreBundleFragment.presenter = moreBundlePresenter;
    }

    public static void injectThemeAttributeProvider(MoreBundleFragment moreBundleFragment, ThemeManager themeManager) {
        moreBundleFragment.themeAttributeProvider = themeManager;
    }

    public void injectMembers(MoreBundleFragment moreBundleFragment) {
        injectPresenter(moreBundleFragment, this.presenterProvider.get());
        injectMarketName(moreBundleFragment, this.marketNameProvider.get());
        injectCaptionBackgroundPainter(moreBundleFragment, this.captionBackgroundPainterProvider.get());
        injectThemeAttributeProvider(moreBundleFragment, this.themeAttributeProvider.get());
    }
}
