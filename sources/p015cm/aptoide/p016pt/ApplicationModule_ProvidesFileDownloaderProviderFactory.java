package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.Interceptor;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.Md5Comparator;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloaderProvider;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesFileDownloaderProviderFactory */
public final class ApplicationModule_ProvidesFileDownloaderProviderFactory implements C10824b<FileDownloaderProvider> {
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<String> cachePathProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final Provider<Md5Comparator> md5ComparatorProvider;
    private final ApplicationModule module;
    private final Provider<Interceptor> userAgentInterceptorProvider;

    public ApplicationModule_ProvidesFileDownloaderProviderFactory(ApplicationModule applicationModule, Provider<String> provider, Provider<Interceptor> provider2, Provider<AuthenticationPersistence> provider3, Provider<DownloadAnalytics> provider4, Provider<InstallAnalytics> provider5, Provider<Md5Comparator> provider6) {
        this.module = applicationModule;
        this.cachePathProvider = provider;
        this.userAgentInterceptorProvider = provider2;
        this.authenticationPersistenceProvider = provider3;
        this.downloadAnalyticsProvider = provider4;
        this.installAnalyticsProvider = provider5;
        this.md5ComparatorProvider = provider6;
    }

    public static ApplicationModule_ProvidesFileDownloaderProviderFactory create(ApplicationModule applicationModule, Provider<String> provider, Provider<Interceptor> provider2, Provider<AuthenticationPersistence> provider3, Provider<DownloadAnalytics> provider4, Provider<InstallAnalytics> provider5, Provider<Md5Comparator> provider6) {
        return new ApplicationModule_ProvidesFileDownloaderProviderFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static FileDownloaderProvider providesFileDownloaderProvider(ApplicationModule applicationModule, String str, Interceptor interceptor, AuthenticationPersistence authenticationPersistence, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, Md5Comparator md5Comparator) {
        FileDownloaderProvider providesFileDownloaderProvider = applicationModule.providesFileDownloaderProvider(str, interceptor, authenticationPersistence, downloadAnalytics, installAnalytics, md5Comparator);
        C10825c.m36718a(providesFileDownloaderProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesFileDownloaderProvider;
    }

    public FileDownloaderProvider get() {
        return providesFileDownloaderProvider(this.module, this.cachePathProvider.get(), this.userAgentInterceptorProvider.get(), this.authenticationPersistenceProvider.get(), this.downloadAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.md5ComparatorProvider.get());
    }
}
