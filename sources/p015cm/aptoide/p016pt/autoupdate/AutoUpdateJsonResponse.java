package p015cm.aptoide.p016pt.autoupdate;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateJsonResponse */
public class AutoUpdateJsonResponse {
    private String md5;
    @JsonProperty("minSdk")
    private String minSdk;
    private String uri;
    private int versioncode;

    public String getMd5() {
        return this.md5;
    }

    public String getMinSdk() {
        return this.minSdk;
    }

    public String getUri() {
        return this.uri;
    }

    public int getVersioncode() {
        return this.versioncode;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMinSdk(String str) {
        this.minSdk = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setVersioncode(int i) {
        this.versioncode = i;
    }
}
