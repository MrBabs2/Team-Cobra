package p015cm.aptoide.p016pt.view.app;

/* renamed from: cm.aptoide.pt.view.app.Application */
public class Application {
    private final long appId;
    private final int downloads;
    private final boolean hasBilling;
    private final String icon;
    private final String name;
    private final String packageName;
    private final float rating;
    private final String tag;

    public Application(String str, String str2, float f, int i, String str3, long j, String str4, boolean z) {
        this.name = str;
        this.icon = str2;
        this.rating = f;
        this.downloads = i;
        this.appId = j;
        this.packageName = str3;
        this.tag = str4;
        this.hasBilling = z;
    }

    public long getAppId() {
        return this.appId;
    }

    public int getDownloads() {
        return this.downloads;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public float getRating() {
        return this.rating;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean hasAppcBilling() {
        return this.hasBilling;
    }

    public Application() {
        this.name = null;
        this.icon = null;
        this.rating = -1.0f;
        this.downloads = -1;
        this.appId = -1;
        this.packageName = null;
        this.tag = "";
        this.hasBilling = false;
    }
}
