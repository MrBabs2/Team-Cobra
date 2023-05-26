package p015cm.aptoide.p016pt.home.apps;

/* renamed from: cm.aptoide.pt.home.apps.AppClickEventWrapper */
public class AppClickEventWrapper {
    private App app;
    private boolean isAppcUpgrade;

    public AppClickEventWrapper(boolean z, App app2) {
        this.isAppcUpgrade = z;
        this.app = app2;
    }

    public App getApp() {
        return this.app;
    }

    public boolean isAppcUpgrade() {
        return this.isAppcUpgrade;
    }
}
