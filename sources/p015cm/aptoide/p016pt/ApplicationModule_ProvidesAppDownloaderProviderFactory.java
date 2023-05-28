package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.downloadmanager.AppDownloaderProvider;
import p015cm.aptoide.p016pt.downloadmanager.RetryFileDownloaderProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppDownloaderProviderFactory */
public final class ApplicationModule_ProvidesAppDownloaderProviderFactory implements C10824b<AppDownloaderProvider> {
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<RetryFileDownloaderProvider> fileDownloaderProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppDownloaderProviderFactory(ApplicationModule applicationModule, Provider<RetryFileDownloaderProvider> provider, Provider<DownloadAnalytics> provider2) {
        this.module = applicationModule;
        this.fileDownloaderProvider = provider;
        this.downloadAnalyticsProvider = provider2;
    }

    public static ApplicationModule_ProvidesAppDownloaderProviderFactory create(ApplicationModule applicationModule, Provider<RetryFileDownloaderProvider> provider, Provider<DownloadAnalytics> provider2) {
        return new ApplicationModule_ProvidesAppDownloaderProviderFactory(applicationModule, provider, provider2);
    }

    public static AppDownloaderProvider providesAppDownloaderProvider(ApplicationModule applicationModule, RetryFileDownloaderProvider retryFileDownloaderProvider, DownloadAnalytics downloadAnalytics) {
        AppDownloaderProvider providesAppDownloaderProvider = applicationModule.providesAppDownloaderProvider(retryFileDownloaderProvider, downloadAnalytics);
        C10825c.m36718a(providesAppDownloaderProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppDownloaderProvider;
    }

    public AppDownloaderProvider get() {
        return providesAppDownloaderProvider(this.module, this.fileDownloaderProvider.get(), this.downloadAnalyticsProvider.get());
    }
}
