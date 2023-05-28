package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StorePersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomStoreRepositoryFactory */
public final class ApplicationModule_ProvidesRoomStoreRepositoryFactory implements C10824b<RoomStoreRepository> {
    private final ApplicationModule module;
    private final Provider<StorePersistence> storePersistenceProvider;

    public ApplicationModule_ProvidesRoomStoreRepositoryFactory(ApplicationModule applicationModule, Provider<StorePersistence> provider) {
        this.module = applicationModule;
        this.storePersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesRoomStoreRepositoryFactory create(ApplicationModule applicationModule, Provider<StorePersistence> provider) {
        return new ApplicationModule_ProvidesRoomStoreRepositoryFactory(applicationModule, provider);
    }

    public static RoomStoreRepository providesRoomStoreRepository(ApplicationModule applicationModule, StorePersistence storePersistence) {
        RoomStoreRepository providesRoomStoreRepository = applicationModule.providesRoomStoreRepository(storePersistence);
        C10825c.m36718a(providesRoomStoreRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesRoomStoreRepository;
    }

    public RoomStoreRepository get() {
        return providesRoomStoreRepository(this.module, this.storePersistenceProvider.get());
    }
}
