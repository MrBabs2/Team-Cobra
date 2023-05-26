package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.download.SplitTypeSubFileTypeMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory */
public final class ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory implements C10824b<SplitTypeSubFileTypeMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory(applicationModule);
    }

    public static SplitTypeSubFileTypeMapper provideSplitTypeSubFileTypeMapper(ApplicationModule applicationModule) {
        SplitTypeSubFileTypeMapper provideSplitTypeSubFileTypeMapper = applicationModule.provideSplitTypeSubFileTypeMapper();
        C10825c.m36718a(provideSplitTypeSubFileTypeMapper, "Cannot return null from a non-@Nullable @Provides method");
        return provideSplitTypeSubFileTypeMapper;
    }

    public SplitTypeSubFileTypeMapper get() {
        return provideSplitTypeSubFileTypeMapper(this.module);
    }
}
