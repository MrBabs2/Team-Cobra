package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.home.ActionItemData */
public class ActionItemData {
    private Appearance appearance;
    private String caption;
    private String date;
    private String flair;
    private String graphic;
    private String icon;

    /* renamed from: id */
    private String f4906id;
    @JsonProperty("package")
    private String packageName;
    private String summary;
    private String title;
    private String type;
    private String url;
    private String views;

    public Appearance getAppearance() {
        return this.appearance;
    }

    public String getCaption() {
        return this.caption;
    }

    public String getDate() {
        return this.date;
    }

    public String getFlair() {
        return this.flair;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f4906id;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getViews() {
        return this.views;
    }

    public void setAppearance(Appearance appearance2) {
        this.appearance = appearance2;
    }

    public void setCaption(String str) {
        this.caption = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setFlair(String str) {
        this.flair = str;
    }

    public void setGraphic(String str) {
        this.graphic = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(String str) {
        this.f4906id = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setViews(String str) {
        this.views = str;
    }
}
