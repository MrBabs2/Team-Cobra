package p015cm.aptoide.p016pt.promotions;

/* renamed from: cm.aptoide.pt.promotions.PromotionAppClick */
public class PromotionAppClick {
    private PromotionViewApp app;
    private ClickType clickType;

    /* renamed from: cm.aptoide.pt.promotions.PromotionAppClick$ClickType */
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
        NAVIGATE
    }

    public PromotionAppClick(PromotionViewApp promotionViewApp, ClickType clickType2) {
        this.app = promotionViewApp;
        this.clickType = clickType2;
    }

    public PromotionViewApp getApp() {
        return this.app;
    }

    public ClickType getClickType() {
        return this.clickType;
    }
}
