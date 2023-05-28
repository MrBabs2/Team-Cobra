package p015cm.aptoide.p016pt.editorial;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.editorial.EditorialFragment_MembersInjector */
public final class EditorialFragment_MembersInjector implements C10822a<EditorialFragment> {
    private final Provider<CaptionBackgroundPainter> captionBackgroundPainterProvider;
    private final Provider<EditorialPresenter> presenterProvider;
    private final Provider<Float> screenHeightProvider;
    private final Provider<Float> screenWidthProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public EditorialFragment_MembersInjector(Provider<EditorialPresenter> provider, Provider<Float> provider2, Provider<Float> provider3, Provider<ThemeManager> provider4, Provider<CaptionBackgroundPainter> provider5) {
        this.presenterProvider = provider;
        this.screenWidthProvider = provider2;
        this.screenHeightProvider = provider3;
        this.themeManagerProvider = provider4;
        this.captionBackgroundPainterProvider = provider5;
    }

    public static C10822a<EditorialFragment> create(Provider<EditorialPresenter> provider, Provider<Float> provider2, Provider<Float> provider3, Provider<ThemeManager> provider4, Provider<CaptionBackgroundPainter> provider5) {
        return new EditorialFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectCaptionBackgroundPainter(EditorialFragment editorialFragment, CaptionBackgroundPainter captionBackgroundPainter) {
        editorialFragment.captionBackgroundPainter = captionBackgroundPainter;
    }

    public static void injectPresenter(EditorialFragment editorialFragment, EditorialPresenter editorialPresenter) {
        editorialFragment.presenter = editorialPresenter;
    }

    public static void injectScreenHeight(EditorialFragment editorialFragment, float f) {
        editorialFragment.screenHeight = f;
    }

    public static void injectScreenWidth(EditorialFragment editorialFragment, float f) {
        editorialFragment.screenWidth = f;
    }

    public static void injectThemeManager(EditorialFragment editorialFragment, ThemeManager themeManager) {
        editorialFragment.themeManager = themeManager;
    }

    public void injectMembers(EditorialFragment editorialFragment) {
        injectPresenter(editorialFragment, this.presenterProvider.get());
        injectScreenWidth(editorialFragment, this.screenWidthProvider.get().floatValue());
        injectScreenHeight(editorialFragment, this.screenHeightProvider.get().floatValue());
        injectThemeManager(editorialFragment, this.themeManagerProvider.get());
        injectCaptionBackgroundPainter(editorialFragment, this.captionBackgroundPainterProvider.get());
    }
}
