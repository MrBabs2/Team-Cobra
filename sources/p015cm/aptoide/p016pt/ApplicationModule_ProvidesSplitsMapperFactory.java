package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.aab.SplitsMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSplitsMapperFactory */
public final class ApplicationModule_ProvidesSplitsMapperFactory implements C10824b<SplitsMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesSplitsMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesSplitsMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesSplitsMapperFactory(applicationModule);
    }

    public static SplitsMapper providesSplitsMapper(ApplicationModule applicationModule) {
        SplitsMapper providesSplitsMapper = applicationModule.providesSplitsMapper();
        C10825c.m36718a(providesSplitsMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesSplitsMapper;
    }

    public SplitsMapper get() {
        return providesSplitsMapper(this.module);
    }
}
