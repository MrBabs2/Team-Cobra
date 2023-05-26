package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.donations.DonationsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDonationsServiceFactory */
public final class ApplicationModule_ProvidesDonationsServiceFactory implements C10824b<DonationsService> {
    private final ApplicationModule module;
    private final Provider<DonationsService.ServiceV8> serviceProvider;

    public ApplicationModule_ProvidesDonationsServiceFactory(ApplicationModule applicationModule, Provider<DonationsService.ServiceV8> provider) {
        this.module = applicationModule;
        this.serviceProvider = provider;
    }

    public static ApplicationModule_ProvidesDonationsServiceFactory create(ApplicationModule applicationModule, Provider<DonationsService.ServiceV8> provider) {
        return new ApplicationModule_ProvidesDonationsServiceFactory(applicationModule, provider);
    }

    public static DonationsService providesDonationsService(ApplicationModule applicationModule, DonationsService.ServiceV8 serviceV8) {
        DonationsService providesDonationsService = applicationModule.providesDonationsService(serviceV8);
        C10825c.m36718a(providesDonationsService, "Cannot return null from a non-@Nullable @Provides method");
        return providesDonationsService;
    }

    public DonationsService get() {
        return providesDonationsService(this.module, this.serviceProvider.get());
    }
}
