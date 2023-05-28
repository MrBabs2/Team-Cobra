package p015cm.aptoide.p016pt;

import p015cm.aptoide.analytics.implementation.utils.MapToJsonMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesMapToJsonMapperFactory */
public final class ApplicationModule_ProvidesMapToJsonMapperFactory implements C10824b<MapToJsonMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMapToJsonMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesMapToJsonMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesMapToJsonMapperFactory(applicationModule);
    }

    public static MapToJsonMapper providesMapToJsonMapper(ApplicationModule applicationModule) {
        MapToJsonMapper providesMapToJsonMapper = applicationModule.providesMapToJsonMapper();
        C10825c.m36718a(providesMapToJsonMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesMapToJsonMapper;
    }

    public MapToJsonMapper get() {
        return providesMapToJsonMapper(this.module);
    }
}
