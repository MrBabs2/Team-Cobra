package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesStoreCredentialsProviderFactory */
public final class ApplicationModule_ProvidesStoreCredentialsProviderFactory implements C10824b<StoreCredentialsProvider> {
    private final ApplicationModule module;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;

    public ApplicationModule_ProvidesStoreCredentialsProviderFactory(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider) {
        this.module = applicationModule;
        this.storeRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesStoreCredentialsProviderFactory create(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider) {
        return new ApplicationModule_ProvidesStoreCredentialsProviderFactory(applicationModule, provider);
    }

    public static StoreCredentialsProvider providesStoreCredentialsProvider(ApplicationModule applicationModule, RoomStoreRepository roomStoreRepository) {
        StoreCredentialsProvider providesStoreCredentialsProvider = applicationModule.providesStoreCredentialsProvider(roomStoreRepository);
        C10825c.m36718a(providesStoreCredentialsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesStoreCredentialsProvider;
    }

    public StoreCredentialsProvider get() {
        return providesStoreCredentialsProvider(this.module, this.storeRepositoryProvider.get());
    }
}
