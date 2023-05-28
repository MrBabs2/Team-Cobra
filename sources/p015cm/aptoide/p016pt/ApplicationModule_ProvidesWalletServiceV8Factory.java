package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.view.donations.WalletService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesWalletServiceV8Factory */
public final class ApplicationModule_ProvidesWalletServiceV8Factory implements C10824b<WalletService.ServiceV7> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesWalletServiceV8Factory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesWalletServiceV8Factory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesWalletServiceV8Factory(applicationModule, provider);
    }

    public static WalletService.ServiceV7 providesWalletServiceV8(ApplicationModule applicationModule, Retrofit retrofit) {
        WalletService.ServiceV7 providesWalletServiceV8 = applicationModule.providesWalletServiceV8(retrofit);
        C10825c.m36718a(providesWalletServiceV8, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletServiceV8;
    }

    public WalletService.ServiceV7 get() {
        return providesWalletServiceV8(this.module, this.retrofitProvider.get());
    }
}
