package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesMoPubAdsManagerFactory */
public final class ApplicationModule_ProvidesMoPubAdsManagerFactory implements C10824b<MoPubAdsManager> {
    private final ApplicationModule module;
    private final Provider<WalletAdsOfferManager> walletAdsOfferManagerProvider;

    public ApplicationModule_ProvidesMoPubAdsManagerFactory(ApplicationModule applicationModule, Provider<WalletAdsOfferManager> provider) {
        this.module = applicationModule;
        this.walletAdsOfferManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesMoPubAdsManagerFactory create(ApplicationModule applicationModule, Provider<WalletAdsOfferManager> provider) {
        return new ApplicationModule_ProvidesMoPubAdsManagerFactory(applicationModule, provider);
    }

    public static MoPubAdsManager providesMoPubAdsManager(ApplicationModule applicationModule, WalletAdsOfferManager walletAdsOfferManager) {
        MoPubAdsManager providesMoPubAdsManager = applicationModule.providesMoPubAdsManager(walletAdsOfferManager);
        C10825c.m36718a(providesMoPubAdsManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesMoPubAdsManager;
    }

    public MoPubAdsManager get() {
        return providesMoPubAdsManager(this.module, this.walletAdsOfferManagerProvider.get());
    }
}
