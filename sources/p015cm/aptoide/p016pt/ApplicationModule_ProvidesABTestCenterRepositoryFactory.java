package p015cm.aptoide.p016pt;

import java.util.HashMap;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.abtesting.ABTestCenterRepository;
import p015cm.aptoide.p016pt.abtesting.ABTestService;
import p015cm.aptoide.p016pt.abtesting.AbTestCacheValidator;
import p015cm.aptoide.p016pt.abtesting.ExperimentModel;
import p015cm.aptoide.p016pt.database.RoomExperimentPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesABTestCenterRepositoryFactory */
public final class ApplicationModule_ProvidesABTestCenterRepositoryFactory implements C10824b<ABTestCenterRepository> {
    private final Provider<ABTestService> abTestServiceProvider;
    private final Provider<AbTestCacheValidator> cacheValidatorProvider;
    private final Provider<HashMap<String, ExperimentModel>> localCacheProvider;
    private final ApplicationModule module;
    private final Provider<RoomExperimentPersistence> persistenceProvider;

    public ApplicationModule_ProvidesABTestCenterRepositoryFactory(ApplicationModule applicationModule, Provider<ABTestService> provider, Provider<RoomExperimentPersistence> provider2, Provider<HashMap<String, ExperimentModel>> provider3, Provider<AbTestCacheValidator> provider4) {
        this.module = applicationModule;
        this.abTestServiceProvider = provider;
        this.persistenceProvider = provider2;
        this.localCacheProvider = provider3;
        this.cacheValidatorProvider = provider4;
    }

    public static ApplicationModule_ProvidesABTestCenterRepositoryFactory create(ApplicationModule applicationModule, Provider<ABTestService> provider, Provider<RoomExperimentPersistence> provider2, Provider<HashMap<String, ExperimentModel>> provider3, Provider<AbTestCacheValidator> provider4) {
        return new ApplicationModule_ProvidesABTestCenterRepositoryFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static ABTestCenterRepository providesABTestCenterRepository(ApplicationModule applicationModule, ABTestService aBTestService, RoomExperimentPersistence roomExperimentPersistence, HashMap<String, ExperimentModel> hashMap, AbTestCacheValidator abTestCacheValidator) {
        ABTestCenterRepository providesABTestCenterRepository = applicationModule.providesABTestCenterRepository(aBTestService, roomExperimentPersistence, hashMap, abTestCacheValidator);
        C10825c.m36718a(providesABTestCenterRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesABTestCenterRepository;
    }

    public ABTestCenterRepository get() {
        return providesABTestCenterRepository(this.module, this.abTestServiceProvider.get(), this.persistenceProvider.get(), this.localCacheProvider.get(), this.cacheValidatorProvider.get());
    }
}
