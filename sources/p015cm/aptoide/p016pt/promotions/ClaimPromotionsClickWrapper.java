package p015cm.aptoide.p016pt.promotions;

/* renamed from: cm.aptoide.pt.promotions.ClaimPromotionsClickWrapper */
public class ClaimPromotionsClickWrapper extends ClaimPromotionsWrapper {
    private String walletAddress;

    public ClaimPromotionsClickWrapper(String str, String str2) {
        super(str2);
        this.walletAddress = str;
    }

    public String getWalletAddress() {
        return this.walletAddress;
    }
}
