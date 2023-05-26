package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.RequestBodyFactory;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideRequestBodyFactoryFactory */
public final class ApplicationModule_ProvideRequestBodyFactoryFactory implements C10824b<RequestBodyFactory> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideRequestBodyFactoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideRequestBodyFactoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideRequestBodyFactoryFactory(applicationModule);
    }

    public static RequestBodyFactory provideRequestBodyFactory(ApplicationModule applicationModule) {
        RequestBodyFactory provideRequestBodyFactory = applicationModule.provideRequestBodyFactory();
        C10825c.m36718a(provideRequestBodyFactory, "Cannot return null from a non-@Nullable @Provides method");
        return provideRequestBodyFactory;
    }

    public RequestBodyFactory get() {
        return provideRequestBodyFactory(this.module);
    }
}
