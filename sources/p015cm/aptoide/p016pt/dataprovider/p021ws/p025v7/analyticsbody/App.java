package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.analyticsbody;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.analyticsbody.App */
public class App {
    private String mirror;
    @JsonProperty("package")
    private String packageName;
    private String url;

    public String getMirror() {
        return this.mirror;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getUrl() {
        return this.url;
    }

    public void setMirror(String str) {
        this.mirror = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
