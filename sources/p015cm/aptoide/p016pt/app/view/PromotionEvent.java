package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

/* renamed from: cm.aptoide.pt.app.view.PromotionEvent */
public class PromotionEvent {
    private ClickType clickType;
    private Promotion promotion;
    private WalletApp walletApp;

    /* renamed from: cm.aptoide.pt.app.view.PromotionEvent$ClickType */
    enum ClickType {
        PAUSE_DOWNLOAD,
        CANCEL_DOWNLOAD,
        RESUME_DOWNLOAD,
        INSTALL_APP,
        DOWNLOAD,
        RETRY_DOWNLOAD,
        CLAIM,
        UPDATE,
        DOWNGRADE,
        DISMISS
    }

    public PromotionEvent(Promotion promotion2, WalletApp walletApp2, ClickType clickType2) {
        this.walletApp = walletApp2;
        this.clickType = clickType2;
        this.promotion = promotion2;
    }

    public ClickType getClickType() {
        return this.clickType;
    }

    public Promotion getPromotion() {
        return this.promotion;
    }

    public WalletApp getWallet() {
        return this.walletApp;
    }
}
