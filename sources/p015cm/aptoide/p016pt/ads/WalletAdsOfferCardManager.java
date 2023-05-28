package p015cm.aptoide.p016pt.ads;

import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.install.PackageRepository;

/* renamed from: cm.aptoide.pt.ads.WalletAdsOfferCardManager */
public class WalletAdsOfferCardManager {
    private final BlacklistManager blacklistManager;
    private final PackageRepository packageRepository;

    public WalletAdsOfferCardManager(BlacklistManager blacklistManager2, PackageRepository packageRepository2) {
        this.blacklistManager = blacklistManager2;
        this.packageRepository = packageRepository2;
    }

    public boolean shouldShowWalletOfferCard(String str, String str2) {
        return !this.blacklistManager.isBlacklisted(str, str2) && !this.packageRepository.isAppInstalled("com.appcoins.wallet");
    }
}
