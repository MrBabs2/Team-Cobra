package p015cm.aptoide.p016pt;

import java.util.HashMap;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.abtesting.AbTestCacheValidator;
import p015cm.aptoide.p016pt.abtesting.ExperimentModel;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAbTestCacheValidatorFactory */
public final class ApplicationModule_ProvidesAbTestCacheValidatorFactory implements C10824b<AbTestCacheValidator> {
    private final Provider<HashMap<String, ExperimentModel>> localCacheProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAbTestCacheValidatorFactory(ApplicationModule applicationModule, Provider<HashMap<String, ExperimentModel>> provider) {
        this.module = applicationModule;
        this.localCacheProvider = provider;
    }

    public static ApplicationModule_ProvidesAbTestCacheValidatorFactory create(ApplicationModule applicationModule, Provider<HashMap<String, ExperimentModel>> provider) {
        return new ApplicationModule_ProvidesAbTestCacheValidatorFactory(applicationModule, provider);
    }

    public static AbTestCacheValidator providesAbTestCacheValidator(ApplicationModule applicationModule, HashMap<String, ExperimentModel> hashMap) {
        AbTestCacheValidator providesAbTestCacheValidator = applicationModule.providesAbTestCacheValidator(hashMap);
        C10825c.m36718a(providesAbTestCacheValidator, "Cannot return null from a non-@Nullable @Provides method");
        return providesAbTestCacheValidator;
    }

    public AbTestCacheValidator get() {
        return providesAbTestCacheValidator(this.module, this.localCacheProvider.get());
    }
}
