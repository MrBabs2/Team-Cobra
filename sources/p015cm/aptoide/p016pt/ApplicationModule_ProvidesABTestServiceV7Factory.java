package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.abtesting.ABTestService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesABTestServiceV7Factory */
public final class ApplicationModule_ProvidesABTestServiceV7Factory implements C10824b<ABTestService.ABTestingService> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesABTestServiceV7Factory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesABTestServiceV7Factory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesABTestServiceV7Factory(applicationModule, provider);
    }

    public static ABTestService.ABTestingService providesABTestServiceV7(ApplicationModule applicationModule, Retrofit retrofit) {
        ABTestService.ABTestingService providesABTestServiceV7 = applicationModule.providesABTestServiceV7(retrofit);
        C10825c.m36718a(providesABTestServiceV7, "Cannot return null from a non-@Nullable @Provides method");
        return providesABTestServiceV7;
    }

    public ABTestService.ABTestingService get() {
        return providesABTestServiceV7(this.module, this.retrofitProvider.get());
    }
}
