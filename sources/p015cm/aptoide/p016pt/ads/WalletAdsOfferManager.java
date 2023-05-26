package p015cm.aptoide.p016pt.ads;

import android.content.pm.PackageManager;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.ads.WalletAdsOfferManager */
public class WalletAdsOfferManager {
    private static final String WALLET_PACKAGE_NAME = "com.appcoins.wallet";
    private final PackageManager packageManager;

    /* renamed from: cm.aptoide.pt.ads.WalletAdsOfferManager$OfferResponseStatus */
    public enum OfferResponseStatus {
        NO_ADS,
        ADS_SHOW,
        ADS_HIDE
    }

    public WalletAdsOfferManager(PackageManager packageManager2) {
        this.packageManager = packageManager2;
    }

    private boolean isWalletInstalled() {
        try {
            return this.packageManager.getPackageInfo(WALLET_PACKAGE_NAME, 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public Single<Boolean> shouldRequestMoPubAd() {
        return Single.m10119a(Boolean.valueOf(!isWalletInstalled()));
    }
}
