package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.downloadmanager.DownloadStatusMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_DownloadStatusMapperFactory */
public final class ApplicationModule_DownloadStatusMapperFactory implements C10824b<DownloadStatusMapper> {
    private final ApplicationModule module;

    public ApplicationModule_DownloadStatusMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_DownloadStatusMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_DownloadStatusMapperFactory(applicationModule);
    }

    public static DownloadStatusMapper downloadStatusMapper(ApplicationModule applicationModule) {
        DownloadStatusMapper downloadStatusMapper = applicationModule.downloadStatusMapper();
        C10825c.m36718a(downloadStatusMapper, "Cannot return null from a non-@Nullable @Provides method");
        return downloadStatusMapper;
    }

    public DownloadStatusMapper get() {
        return downloadStatusMapper(this.module);
    }
}
