package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.dataprovider.cache.L2Cache;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideL2CacheFactory */
public final class ApplicationModule_ProvideL2CacheFactory implements C10824b<L2Cache> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideL2CacheFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideL2CacheFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideL2CacheFactory(applicationModule);
    }

    public static L2Cache provideL2Cache(ApplicationModule applicationModule) {
        L2Cache provideL2Cache = applicationModule.provideL2Cache();
        C10825c.m36718a(provideL2Cache, "Cannot return null from a non-@Nullable @Provides method");
        return provideL2Cache;
    }

    public L2Cache get() {
        return provideL2Cache(this.module);
    }
}
