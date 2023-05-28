package p015cm.aptoide.p016pt.view.app;

/* renamed from: cm.aptoide.pt.view.app.AppScreenshot */
public class AppScreenshot {
    private final int height;
    private final String orientation;
    private final String url;
    private final int width;

    public AppScreenshot(int i, int i2, String str, String str2) {
        this.height = i;
        this.width = i2;
        this.orientation = str;
        this.url = str2;
    }

    public int getHeight() {
        return this.height;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }
}
