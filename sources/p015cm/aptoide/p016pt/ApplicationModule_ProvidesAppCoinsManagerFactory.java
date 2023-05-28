package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.bonus.BonusAppcService;
import p015cm.aptoide.p016pt.donations.DonationsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppCoinsManagerFactory */
public final class ApplicationModule_ProvidesAppCoinsManagerFactory implements C10824b<AppCoinsManager> {
    private final Provider<BonusAppcService> bonusAppcServiceProvider;
    private final Provider<DonationsService> donationsServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppCoinsManagerFactory(ApplicationModule applicationModule, Provider<DonationsService> provider, Provider<BonusAppcService> provider2) {
        this.module = applicationModule;
        this.donationsServiceProvider = provider;
        this.bonusAppcServiceProvider = provider2;
    }

    public static ApplicationModule_ProvidesAppCoinsManagerFactory create(ApplicationModule applicationModule, Provider<DonationsService> provider, Provider<BonusAppcService> provider2) {
        return new ApplicationModule_ProvidesAppCoinsManagerFactory(applicationModule, provider, provider2);
    }

    public static AppCoinsManager providesAppCoinsManager(ApplicationModule applicationModule, DonationsService donationsService, BonusAppcService bonusAppcService) {
        AppCoinsManager providesAppCoinsManager = applicationModule.providesAppCoinsManager(donationsService, bonusAppcService);
        C10825c.m36718a(providesAppCoinsManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppCoinsManager;
    }

    public AppCoinsManager get() {
        return providesAppCoinsManager(this.module, this.donationsServiceProvider.get(), this.bonusAppcServiceProvider.get());
    }
}
