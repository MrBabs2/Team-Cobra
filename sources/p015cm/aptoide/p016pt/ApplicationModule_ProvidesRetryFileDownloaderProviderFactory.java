package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloaderProvider;
import p015cm.aptoide.p016pt.downloadmanager.RetryFileDownloaderProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRetryFileDownloaderProviderFactory */
public final class ApplicationModule_ProvidesRetryFileDownloaderProviderFactory implements C10824b<RetryFileDownloaderProvider> {
    private final Provider<FileDownloaderProvider> fileDownloaderProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRetryFileDownloaderProviderFactory(ApplicationModule applicationModule, Provider<FileDownloaderProvider> provider) {
        this.module = applicationModule;
        this.fileDownloaderProvider = provider;
    }

    public static ApplicationModule_ProvidesRetryFileDownloaderProviderFactory create(ApplicationModule applicationModule, Provider<FileDownloaderProvider> provider) {
        return new ApplicationModule_ProvidesRetryFileDownloaderProviderFactory(applicationModule, provider);
    }

    public static RetryFileDownloaderProvider providesRetryFileDownloaderProvider(ApplicationModule applicationModule, FileDownloaderProvider fileDownloaderProvider2) {
        RetryFileDownloaderProvider providesRetryFileDownloaderProvider = applicationModule.providesRetryFileDownloaderProvider(fileDownloaderProvider2);
        C10825c.m36718a(providesRetryFileDownloaderProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesRetryFileDownloaderProvider;
    }

    public RetryFileDownloaderProvider get() {
        return providesRetryFileDownloaderProvider(this.module, this.fileDownloaderProvider.get());
    }
}
