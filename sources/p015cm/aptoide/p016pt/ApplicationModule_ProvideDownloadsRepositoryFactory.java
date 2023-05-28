package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.downloadmanager.DownloadPersistence;
import p015cm.aptoide.p016pt.downloadmanager.DownloadsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideDownloadsRepositoryFactory */
public final class ApplicationModule_ProvideDownloadsRepositoryFactory implements C10824b<DownloadsRepository> {
    private final Provider<DownloadPersistence> downloadPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideDownloadsRepositoryFactory(ApplicationModule applicationModule, Provider<DownloadPersistence> provider) {
        this.module = applicationModule;
        this.downloadPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvideDownloadsRepositoryFactory create(ApplicationModule applicationModule, Provider<DownloadPersistence> provider) {
        return new ApplicationModule_ProvideDownloadsRepositoryFactory(applicationModule, provider);
    }

    public static DownloadsRepository provideDownloadsRepository(ApplicationModule applicationModule, DownloadPersistence downloadPersistence) {
        DownloadsRepository provideDownloadsRepository = applicationModule.provideDownloadsRepository(downloadPersistence);
        C10825c.m36718a(provideDownloadsRepository, "Cannot return null from a non-@Nullable @Provides method");
        return provideDownloadsRepository;
    }

    public DownloadsRepository get() {
        return provideDownloadsRepository(this.module, this.downloadPersistenceProvider.get());
    }
}
