package p015cm.aptoide.p016pt;

import com.fasterxml.jackson.databind.ObjectMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideNonNullObjectMapperFactory */
public final class ApplicationModule_ProvideNonNullObjectMapperFactory implements C10824b<ObjectMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideNonNullObjectMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideNonNullObjectMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideNonNullObjectMapperFactory(applicationModule);
    }

    public static ObjectMapper provideNonNullObjectMapper(ApplicationModule applicationModule) {
        ObjectMapper provideNonNullObjectMapper = applicationModule.provideNonNullObjectMapper();
        C10825c.m36718a(provideNonNullObjectMapper, "Cannot return null from a non-@Nullable @Provides method");
        return provideNonNullObjectMapper;
    }

    public ObjectMapper get() {
        return provideNonNullObjectMapper(this.module);
    }
}
