package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.view.donations.WalletService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesWalletServiceFactory */
public final class ApplicationModule_ProvidesWalletServiceFactory implements C10824b<WalletService> {
    private final ApplicationModule module;
    private final Provider<WalletService.ServiceV7> serviceProvider;

    public ApplicationModule_ProvidesWalletServiceFactory(ApplicationModule applicationModule, Provider<WalletService.ServiceV7> provider) {
        this.module = applicationModule;
        this.serviceProvider = provider;
    }

    public static ApplicationModule_ProvidesWalletServiceFactory create(ApplicationModule applicationModule, Provider<WalletService.ServiceV7> provider) {
        return new ApplicationModule_ProvidesWalletServiceFactory(applicationModule, provider);
    }

    public static WalletService providesWalletService(ApplicationModule applicationModule, WalletService.ServiceV7 serviceV7) {
        WalletService providesWalletService = applicationModule.providesWalletService(serviceV7);
        C10825c.m36718a(providesWalletService, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletService;
    }

    public WalletService get() {
        return providesWalletService(this.module, this.serviceProvider.get());
    }
}
