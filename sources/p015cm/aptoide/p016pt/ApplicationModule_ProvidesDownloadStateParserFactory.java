package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDownloadStateParserFactory */
public final class ApplicationModule_ProvidesDownloadStateParserFactory implements C10824b<DownloadStateParser> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDownloadStateParserFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDownloadStateParserFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDownloadStateParserFactory(applicationModule);
    }

    public static DownloadStateParser providesDownloadStateParser(ApplicationModule applicationModule) {
        DownloadStateParser providesDownloadStateParser = applicationModule.providesDownloadStateParser();
        C10825c.m36718a(providesDownloadStateParser, "Cannot return null from a non-@Nullable @Provides method");
        return providesDownloadStateParser;
    }

    public DownloadStateParser get() {
        return providesDownloadStateParser(this.module);
    }
}
