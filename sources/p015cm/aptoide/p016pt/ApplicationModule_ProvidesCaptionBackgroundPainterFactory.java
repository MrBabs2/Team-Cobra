package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesCaptionBackgroundPainterFactory */
public final class ApplicationModule_ProvidesCaptionBackgroundPainterFactory implements C10824b<CaptionBackgroundPainter> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCaptionBackgroundPainterFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesCaptionBackgroundPainterFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesCaptionBackgroundPainterFactory(applicationModule);
    }

    public static CaptionBackgroundPainter providesCaptionBackgroundPainter(ApplicationModule applicationModule) {
        CaptionBackgroundPainter providesCaptionBackgroundPainter = applicationModule.providesCaptionBackgroundPainter();
        C10825c.m36718a(providesCaptionBackgroundPainter, "Cannot return null from a non-@Nullable @Provides method");
        return providesCaptionBackgroundPainter;
    }

    public CaptionBackgroundPainter get() {
        return providesCaptionBackgroundPainter(this.module);
    }
}
