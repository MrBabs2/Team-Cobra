package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.blacklist.BlacklistUnitMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory */
public final class ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory implements C10824b<BlacklistUnitMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory(applicationModule);
    }

    public static BlacklistUnitMapper providesBundleToBlacklistUnitMapper(ApplicationModule applicationModule) {
        BlacklistUnitMapper providesBundleToBlacklistUnitMapper = applicationModule.providesBundleToBlacklistUnitMapper();
        C10825c.m36718a(providesBundleToBlacklistUnitMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesBundleToBlacklistUnitMapper;
    }

    public BlacklistUnitMapper get() {
        return providesBundleToBlacklistUnitMapper(this.module);
    }
}
