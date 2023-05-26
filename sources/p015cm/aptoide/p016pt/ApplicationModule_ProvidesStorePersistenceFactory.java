package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p015cm.aptoide.p016pt.store.StorePersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesStorePersistenceFactory */
public final class ApplicationModule_ProvidesStorePersistenceFactory implements C10824b<StorePersistence> {
    private final Provider<AptoideDatabase> aptoideDatabaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesStorePersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.aptoideDatabaseProvider = provider;
    }

    public static ApplicationModule_ProvidesStorePersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesStorePersistenceFactory(applicationModule, provider);
    }

    public static StorePersistence providesStorePersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        StorePersistence providesStorePersistence = applicationModule.providesStorePersistence(aptoideDatabase);
        C10825c.m36718a(providesStorePersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesStorePersistence;
    }

    public StorePersistence get() {
        return providesStorePersistence(this.module, this.aptoideDatabaseProvider.get());
    }
}
