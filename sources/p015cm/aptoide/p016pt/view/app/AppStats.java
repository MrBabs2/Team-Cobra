package p015cm.aptoide.p016pt.view.app;

/* renamed from: cm.aptoide.pt.view.app.AppStats */
public class AppStats {
    private final int downloads;
    private final AppRating globalRating;
    private final int packageDownloads;
    private final AppRating rating;

    public AppStats(AppRating appRating, AppRating appRating2, int i, int i2) {
        this.rating = appRating;
        this.globalRating = appRating2;
        this.downloads = i;
        this.packageDownloads = i2;
    }

    public int getDownloads() {
        return this.downloads;
    }

    public AppRating getGlobalRating() {
        return this.globalRating;
    }

    public int getPackageDownloads() {
        return this.packageDownloads;
    }

    public AppRating getRating() {
        return this.rating;
    }
}
