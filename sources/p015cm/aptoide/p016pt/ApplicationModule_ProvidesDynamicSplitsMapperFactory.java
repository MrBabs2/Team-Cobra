package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.aab.DynamicSplitsMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDynamicSplitsMapperFactory */
public final class ApplicationModule_ProvidesDynamicSplitsMapperFactory implements C10824b<DynamicSplitsMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDynamicSplitsMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDynamicSplitsMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDynamicSplitsMapperFactory(applicationModule);
    }

    public static DynamicSplitsMapper providesDynamicSplitsMapper(ApplicationModule applicationModule) {
        DynamicSplitsMapper providesDynamicSplitsMapper = applicationModule.providesDynamicSplitsMapper();
        C10825c.m36718a(providesDynamicSplitsMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesDynamicSplitsMapper;
    }

    public DynamicSplitsMapper get() {
        return providesDynamicSplitsMapper(this.module);
    }
}
