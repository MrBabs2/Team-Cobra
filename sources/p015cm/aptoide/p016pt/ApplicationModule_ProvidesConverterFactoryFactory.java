package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesConverterFactoryFactory */
public final class ApplicationModule_ProvidesConverterFactoryFactory implements C10824b<Converter.Factory> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesConverterFactoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesConverterFactoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesConverterFactoryFactory(applicationModule);
    }

    public static Converter.Factory providesConverterFactory(ApplicationModule applicationModule) {
        Converter.Factory providesConverterFactory = applicationModule.providesConverterFactory();
        C10825c.m36718a(providesConverterFactory, "Cannot return null from a non-@Nullable @Provides method");
        return providesConverterFactory;
    }

    public Converter.Factory get() {
        return providesConverterFactory(this.module);
    }
}
