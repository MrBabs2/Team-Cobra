package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.DatabaseStoreDataPersist;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDatabaseStoreDataPersistFactory */
public final class ApplicationModule_ProvidesDatabaseStoreDataPersistFactory implements C10824b<DatabaseStoreDataPersist> {
    private final ApplicationModule module;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;

    public ApplicationModule_ProvidesDatabaseStoreDataPersistFactory(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider) {
        this.module = applicationModule;
        this.storeRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesDatabaseStoreDataPersistFactory create(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider) {
        return new ApplicationModule_ProvidesDatabaseStoreDataPersistFactory(applicationModule, provider);
    }

    public static DatabaseStoreDataPersist providesDatabaseStoreDataPersist(ApplicationModule applicationModule, RoomStoreRepository roomStoreRepository) {
        DatabaseStoreDataPersist providesDatabaseStoreDataPersist = applicationModule.providesDatabaseStoreDataPersist(roomStoreRepository);
        C10825c.m36718a(providesDatabaseStoreDataPersist, "Cannot return null from a non-@Nullable @Provides method");
        return providesDatabaseStoreDataPersist;
    }

    public DatabaseStoreDataPersist get() {
        return providesDatabaseStoreDataPersist(this.module, this.storeRepositoryProvider.get());
    }
}
