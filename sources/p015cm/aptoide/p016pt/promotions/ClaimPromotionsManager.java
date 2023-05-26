package p015cm.aptoide.p016pt.promotions;

import p123rx.Single;

/* renamed from: cm.aptoide.pt.promotions.ClaimPromotionsManager */
public class ClaimPromotionsManager {
    private final String promotionId;
    private PromotionsManager promotionsManager;
    private final String unclaimedAppPackageName;

    public ClaimPromotionsManager(PromotionsManager promotionsManager2, String str, String str2) {
        this.promotionsManager = promotionsManager2;
        this.unclaimedAppPackageName = str;
        this.promotionId = str2;
    }

    public Single<ClaimStatusWrapper> claimPromotion() {
        PromotionsManager promotionsManager2 = this.promotionsManager;
        return promotionsManager2.claimPromotion(promotionsManager2.getWalletAddress(), this.unclaimedAppPackageName, this.promotionId);
    }

    public void saveWalletAddress(String str) {
        this.promotionsManager.saveWalletAddress(str);
    }
}
