package p015cm.aptoide.p016pt;

import java.util.HashMap;
import p015cm.aptoide.p016pt.abtesting.ExperimentModel;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAbTestLocalCacheFactory */
public final class ApplicationModule_ProvidesAbTestLocalCacheFactory implements C10824b<HashMap<String, ExperimentModel>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAbTestLocalCacheFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAbTestLocalCacheFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAbTestLocalCacheFactory(applicationModule);
    }

    public static HashMap<String, ExperimentModel> providesAbTestLocalCache(ApplicationModule applicationModule) {
        HashMap<String, ExperimentModel> providesAbTestLocalCache = applicationModule.providesAbTestLocalCache();
        C10825c.m36718a(providesAbTestLocalCache, "Cannot return null from a non-@Nullable @Provides method");
        return providesAbTestLocalCache;
    }

    public HashMap<String, ExperimentModel> get() {
        return providesAbTestLocalCache(this.module);
    }
}
