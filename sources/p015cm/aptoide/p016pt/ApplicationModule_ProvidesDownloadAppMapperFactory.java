package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.downloadmanager.DownloadAppFileMapper;
import p015cm.aptoide.p016pt.downloadmanager.DownloadAppMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDownloadAppMapperFactory */
public final class ApplicationModule_ProvidesDownloadAppMapperFactory implements C10824b<DownloadAppMapper> {
    private final Provider<DownloadAppFileMapper> downloadAppFileMapperProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDownloadAppMapperFactory(ApplicationModule applicationModule, Provider<DownloadAppFileMapper> provider) {
        this.module = applicationModule;
        this.downloadAppFileMapperProvider = provider;
    }

    public static ApplicationModule_ProvidesDownloadAppMapperFactory create(ApplicationModule applicationModule, Provider<DownloadAppFileMapper> provider) {
        return new ApplicationModule_ProvidesDownloadAppMapperFactory(applicationModule, provider);
    }

    public static DownloadAppMapper providesDownloadAppMapper(ApplicationModule applicationModule, DownloadAppFileMapper downloadAppFileMapper) {
        DownloadAppMapper providesDownloadAppMapper = applicationModule.providesDownloadAppMapper(downloadAppFileMapper);
        C10825c.m36718a(providesDownloadAppMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesDownloadAppMapper;
    }

    public DownloadAppMapper get() {
        return providesDownloadAppMapper(this.module, this.downloadAppFileMapperProvider.get());
    }
}
