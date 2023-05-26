package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.downloadmanager.DownloadAppFileMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDownloadAppFileMapperFactory */
public final class ApplicationModule_ProvidesDownloadAppFileMapperFactory implements C10824b<DownloadAppFileMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDownloadAppFileMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDownloadAppFileMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDownloadAppFileMapperFactory(applicationModule);
    }

    public static DownloadAppFileMapper providesDownloadAppFileMapper(ApplicationModule applicationModule) {
        DownloadAppFileMapper providesDownloadAppFileMapper = applicationModule.providesDownloadAppFileMapper();
        C10825c.m36718a(providesDownloadAppFileMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesDownloadAppFileMapper;
    }

    public DownloadAppFileMapper get() {
        return providesDownloadAppFileMapper(this.module);
    }
}
