package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.dataprovider.cache.L2Cache;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p015cm.aptoide.p016pt.file.FileManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesFileManagerFactory */
public final class ApplicationModule_ProvidesFileManagerFactory implements C10824b<FileManager> {
    private final Provider<AptoideDownloadManager> aptoideDownloadManagerProvider;
    private final Provider<CacheHelper> cacheHelperProvider;
    private final Provider<String> cachePathProvider;
    private final Provider<L2Cache> httpClientCacheProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFileManagerFactory(ApplicationModule applicationModule, Provider<CacheHelper> provider, Provider<String> provider2, Provider<AptoideDownloadManager> provider3, Provider<L2Cache> provider4) {
        this.module = applicationModule;
        this.cacheHelperProvider = provider;
        this.cachePathProvider = provider2;
        this.aptoideDownloadManagerProvider = provider3;
        this.httpClientCacheProvider = provider4;
    }

    public static ApplicationModule_ProvidesFileManagerFactory create(ApplicationModule applicationModule, Provider<CacheHelper> provider, Provider<String> provider2, Provider<AptoideDownloadManager> provider3, Provider<L2Cache> provider4) {
        return new ApplicationModule_ProvidesFileManagerFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static FileManager providesFileManager(ApplicationModule applicationModule, CacheHelper cacheHelper, String str, AptoideDownloadManager aptoideDownloadManager, L2Cache l2Cache) {
        FileManager providesFileManager = applicationModule.providesFileManager(cacheHelper, str, aptoideDownloadManager, l2Cache);
        C10825c.m36718a(providesFileManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesFileManager;
    }

    public FileManager get() {
        return providesFileManager(this.module, this.cacheHelperProvider.get(), this.cachePathProvider.get(), this.aptoideDownloadManagerProvider.get(), this.httpClientCacheProvider.get());
    }
}
