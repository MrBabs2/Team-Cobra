package p015cm.aptoide.p016pt.view.app;

import java.util.List;

/* renamed from: cm.aptoide.pt.view.app.AppMedia */
public class AppMedia {
    private final List<AppScreenshot> appScreenshots;
    private final List<AppVideo> appVideos;
    private final String description;
    private final List<String> keywords;
    private final String news;

    public AppMedia(String str, List<String> list, String str2, List<AppScreenshot> list2, List<AppVideo> list3) {
        this.description = str;
        this.keywords = list;
        this.news = str2;
        this.appScreenshots = list2;
        this.appVideos = list3;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getKeywords() {
        return this.keywords;
    }

    public String getNews() {
        return this.news;
    }

    public List<AppScreenshot> getScreenshots() {
        return this.appScreenshots;
    }

    public List<AppVideo> getVideos() {
        return this.appVideos;
    }
}
