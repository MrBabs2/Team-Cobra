package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p015cm.aptoide.p016pt.downloadmanager.DownloadPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideDownloadPersistenceFactory */
public final class ApplicationModule_ProvideDownloadPersistenceFactory implements C10824b<DownloadPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideDownloadPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvideDownloadPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvideDownloadPersistenceFactory(applicationModule, provider);
    }

    public static DownloadPersistence provideDownloadPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        DownloadPersistence provideDownloadPersistence = applicationModule.provideDownloadPersistence(aptoideDatabase);
        C10825c.m36718a(provideDownloadPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return provideDownloadPersistence;
    }

    public DownloadPersistence get() {
        return provideDownloadPersistence(this.module, this.databaseProvider.get());
    }
}
