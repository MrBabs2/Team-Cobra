package p015cm.aptoide.p016pt.home.apps;

/* renamed from: cm.aptoide.pt.home.apps.AppClick */
public class AppClick {
    private App app;
    private ClickType clickType;

    /* renamed from: cm.aptoide.pt.home.apps.AppClick$ClickType */
    public enum ClickType {
        CARD_CLICK,
        CARD_LONG_CLICK,
        DOWNLOAD_ACTION_CLICK,
        APPC_ACTION_CLICK,
        PAUSE_CLICK,
        CANCEL_CLICK,
        RESUME_CLICK,
        INSTALL_CLICK,
        APPC_UPGRADE_APP,
        APPC_UPGRADE_RESUME,
        APPC_UPGRADE_RETRY,
        APPC_UPGRADE_CANCEL,
        APPC_UPGRADE_PAUSE
    }

    public AppClick(App app2, ClickType clickType2) {
        this.app = app2;
        this.clickType = clickType2;
    }

    public App getApp() {
        return this.app;
    }

    public ClickType getClickType() {
        return this.clickType;
    }
}
