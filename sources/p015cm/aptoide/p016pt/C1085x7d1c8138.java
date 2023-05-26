package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferCardManager;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.install.PackageRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule_ProvidesWalletAdsOfferCardManagerFactory */
public final class C1085x7d1c8138 implements C10824b<WalletAdsOfferCardManager> {
    private final Provider<BlacklistManager> blacklistManagerProvider;
    private final FlavourApplicationModule module;
    private final Provider<PackageRepository> packageRepositoryProvider;

    public C1085x7d1c8138(FlavourApplicationModule flavourApplicationModule, Provider<BlacklistManager> provider, Provider<PackageRepository> provider2) {
        this.module = flavourApplicationModule;
        this.blacklistManagerProvider = provider;
        this.packageRepositoryProvider = provider2;
    }

    public static C1085x7d1c8138 create(FlavourApplicationModule flavourApplicationModule, Provider<BlacklistManager> provider, Provider<PackageRepository> provider2) {
        return new C1085x7d1c8138(flavourApplicationModule, provider, provider2);
    }

    public static WalletAdsOfferCardManager providesWalletAdsOfferCardManager(FlavourApplicationModule flavourApplicationModule, BlacklistManager blacklistManager, PackageRepository packageRepository) {
        WalletAdsOfferCardManager providesWalletAdsOfferCardManager = flavourApplicationModule.providesWalletAdsOfferCardManager(blacklistManager, packageRepository);
        C10825c.m36718a(providesWalletAdsOfferCardManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletAdsOfferCardManager;
    }

    public WalletAdsOfferCardManager get() {
        return providesWalletAdsOfferCardManager(this.module, this.blacklistManagerProvider.get(), this.packageRepositoryProvider.get());
    }
}
