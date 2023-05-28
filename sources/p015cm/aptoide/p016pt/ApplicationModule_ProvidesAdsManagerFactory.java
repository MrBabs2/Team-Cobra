package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.app.AdsManager;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAdsManagerFactory */
public final class ApplicationModule_ProvidesAdsManagerFactory implements C10824b<AdsManager> {
    private final Provider<AdsRepository> adsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<RoomStoredMinimalAdPersistence> roomStoredMinimalAdPersistenceProvider;

    public ApplicationModule_ProvidesAdsManagerFactory(ApplicationModule applicationModule, Provider<AdsRepository> provider, Provider<RoomStoredMinimalAdPersistence> provider2) {
        this.module = applicationModule;
        this.adsRepositoryProvider = provider;
        this.roomStoredMinimalAdPersistenceProvider = provider2;
    }

    public static ApplicationModule_ProvidesAdsManagerFactory create(ApplicationModule applicationModule, Provider<AdsRepository> provider, Provider<RoomStoredMinimalAdPersistence> provider2) {
        return new ApplicationModule_ProvidesAdsManagerFactory(applicationModule, provider, provider2);
    }

    public static AdsManager providesAdsManager(ApplicationModule applicationModule, AdsRepository adsRepository, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        AdsManager providesAdsManager = applicationModule.providesAdsManager(adsRepository, roomStoredMinimalAdPersistence);
        C10825c.m36718a(providesAdsManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAdsManager;
    }

    public AdsManager get() {
        return providesAdsManager(this.module, this.adsRepositoryProvider.get(), this.roomStoredMinimalAdPersistenceProvider.get());
    }
}
