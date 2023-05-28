package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.donations.DonationsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDonationsServiceV8Factory */
public final class ApplicationModule_ProvidesDonationsServiceV8Factory implements C10824b<DonationsService.ServiceV8> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesDonationsServiceV8Factory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesDonationsServiceV8Factory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesDonationsServiceV8Factory(applicationModule, provider);
    }

    public static DonationsService.ServiceV8 providesDonationsServiceV8(ApplicationModule applicationModule, Retrofit retrofit) {
        DonationsService.ServiceV8 providesDonationsServiceV8 = applicationModule.providesDonationsServiceV8(retrofit);
        C10825c.m36718a(providesDonationsServiceV8, "Cannot return null from a non-@Nullable @Provides method");
        return providesDonationsServiceV8;
    }

    public DonationsService.ServiceV8 get() {
        return providesDonationsServiceV8(this.module, this.retrofitProvider.get());
    }
}
