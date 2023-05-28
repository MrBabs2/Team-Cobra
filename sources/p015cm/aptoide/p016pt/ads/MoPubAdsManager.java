package p015cm.aptoide.p016pt.ads;

import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.ads.MoPubAdsManager */
public class MoPubAdsManager {
    private final WalletAdsOfferManager walletAdsOfferManager;

    public MoPubAdsManager(WalletAdsOfferManager walletAdsOfferManager2) {
        this.walletAdsOfferManager = walletAdsOfferManager2;
    }

    /* renamed from: a */
    static /* synthetic */ Single m4534a(Boolean bool) {
        if (bool.booleanValue()) {
            return Single.m10119a(WalletAdsOfferManager.OfferResponseStatus.NO_ADS);
        }
        return Single.m10119a(WalletAdsOfferManager.OfferResponseStatus.ADS_HIDE);
    }

    public Single<WalletAdsOfferManager.OfferResponseStatus> getAdsVisibilityStatus() {
        return shouldRequestAds().mo18559a(C1344d0.f3789f);
    }

    public Single<Boolean> shouldRequestAds() {
        return this.walletAdsOfferManager.shouldRequestMoPubAd();
    }
}
