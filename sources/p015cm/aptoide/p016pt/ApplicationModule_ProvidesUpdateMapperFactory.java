package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.updates.UpdateMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUpdateMapperFactory */
public final class ApplicationModule_ProvidesUpdateMapperFactory implements C10824b<UpdateMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesUpdateMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesUpdateMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesUpdateMapperFactory(applicationModule);
    }

    public static UpdateMapper providesUpdateMapper(ApplicationModule applicationModule) {
        UpdateMapper providesUpdateMapper = applicationModule.providesUpdateMapper();
        C10825c.m36718a(providesUpdateMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesUpdateMapper;
    }

    public UpdateMapper get() {
        return providesUpdateMapper(this.module);
    }
}
