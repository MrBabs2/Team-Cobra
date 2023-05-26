package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.downloadmanager.AppDownloaderProvider;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.downloadmanager.DownloadAppMapper;
import p015cm.aptoide.p016pt.downloadmanager.DownloadStatusMapper;
import p015cm.aptoide.p016pt.downloadmanager.DownloadsRepository;
import p015cm.aptoide.p016pt.install.FilePathProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAptoideDownloadManagerFactory */
public final class ApplicationModule_ProvideAptoideDownloadManagerFactory implements C10824b<AptoideDownloadManager> {
    private final Provider<String> apkPathProvider;
    private final Provider<AppDownloaderProvider> appDownloaderProvider;
    private final Provider<String> cachePathProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<DownloadAppMapper> downloadAppMapperProvider;
    private final Provider<DownloadStatusMapper> downloadStatusMapperProvider;
    private final Provider<DownloadsRepository> downloadsRepositoryProvider;
    private final Provider<FilePathProvider> filePathProvider;
    private final ApplicationModule module;
    private final Provider<String> obbPathProvider;

    public ApplicationModule_ProvideAptoideDownloadManagerFactory(ApplicationModule applicationModule, Provider<DownloadsRepository> provider, Provider<DownloadStatusMapper> provider2, Provider<String> provider3, Provider<DownloadAppMapper> provider4, Provider<AppDownloaderProvider> provider5, Provider<String> provider6, Provider<String> provider7, Provider<DownloadAnalytics> provider8, Provider<FilePathProvider> provider9) {
        this.module = applicationModule;
        this.downloadsRepositoryProvider = provider;
        this.downloadStatusMapperProvider = provider2;
        this.cachePathProvider = provider3;
        this.downloadAppMapperProvider = provider4;
        this.appDownloaderProvider = provider5;
        this.apkPathProvider = provider6;
        this.obbPathProvider = provider7;
        this.downloadAnalyticsProvider = provider8;
        this.filePathProvider = provider9;
    }

    public static ApplicationModule_ProvideAptoideDownloadManagerFactory create(ApplicationModule applicationModule, Provider<DownloadsRepository> provider, Provider<DownloadStatusMapper> provider2, Provider<String> provider3, Provider<DownloadAppMapper> provider4, Provider<AppDownloaderProvider> provider5, Provider<String> provider6, Provider<String> provider7, Provider<DownloadAnalytics> provider8, Provider<FilePathProvider> provider9) {
        return new ApplicationModule_ProvideAptoideDownloadManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static AptoideDownloadManager provideAptoideDownloadManager(ApplicationModule applicationModule, DownloadsRepository downloadsRepository, DownloadStatusMapper downloadStatusMapper, String str, DownloadAppMapper downloadAppMapper, AppDownloaderProvider appDownloaderProvider2, String str2, String str3, DownloadAnalytics downloadAnalytics, FilePathProvider filePathProvider2) {
        AptoideDownloadManager provideAptoideDownloadManager = applicationModule.provideAptoideDownloadManager(downloadsRepository, downloadStatusMapper, str, downloadAppMapper, appDownloaderProvider2, str2, str3, downloadAnalytics, filePathProvider2);
        C10825c.m36718a(provideAptoideDownloadManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideAptoideDownloadManager;
    }

    public AptoideDownloadManager get() {
        return provideAptoideDownloadManager(this.module, this.downloadsRepositoryProvider.get(), this.downloadStatusMapperProvider.get(), this.cachePathProvider.get(), this.downloadAppMapperProvider.get(), this.appDownloaderProvider.get(), this.apkPathProvider.get(), this.obbPathProvider.get(), this.downloadAnalyticsProvider.get(), this.filePathProvider.get());
    }
}
