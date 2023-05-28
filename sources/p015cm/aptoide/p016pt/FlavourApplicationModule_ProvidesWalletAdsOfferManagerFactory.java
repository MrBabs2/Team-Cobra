package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory */
public final class FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory implements C10824b<WalletAdsOfferManager> {
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory(FlavourApplicationModule flavourApplicationModule) {
        this.module = flavourApplicationModule;
    }

    public static FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory create(FlavourApplicationModule flavourApplicationModule) {
        return new FlavourApplicationModule_ProvidesWalletAdsOfferManagerFactory(flavourApplicationModule);
    }

    public static WalletAdsOfferManager providesWalletAdsOfferManager(FlavourApplicationModule flavourApplicationModule) {
        WalletAdsOfferManager providesWalletAdsOfferManager = flavourApplicationModule.providesWalletAdsOfferManager();
        C10825c.m36718a(providesWalletAdsOfferManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletAdsOfferManager;
    }

    public WalletAdsOfferManager get() {
        return providesWalletAdsOfferManager(this.module);
    }
}
