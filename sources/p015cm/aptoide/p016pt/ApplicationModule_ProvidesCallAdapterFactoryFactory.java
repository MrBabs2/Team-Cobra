package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.CallAdapter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesCallAdapterFactoryFactory */
public final class ApplicationModule_ProvidesCallAdapterFactoryFactory implements C10824b<CallAdapter.Factory> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCallAdapterFactoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesCallAdapterFactoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesCallAdapterFactoryFactory(applicationModule);
    }

    public static CallAdapter.Factory providesCallAdapterFactory(ApplicationModule applicationModule) {
        CallAdapter.Factory providesCallAdapterFactory = applicationModule.providesCallAdapterFactory();
        C10825c.m36718a(providesCallAdapterFactory, "Cannot return null from a non-@Nullable @Provides method");
        return providesCallAdapterFactory;
    }

    public CallAdapter.Factory get() {
        return providesCallAdapterFactory(this.module);
    }
}
