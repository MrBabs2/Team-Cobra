package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import java.util.regex.Matcher;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.V7Url */
public class V7Url {
    private String url;

    public V7Url(String str) {
        this.url = str;
    }

    public boolean containsLimit() {
        return this.url.contains("limit=");
    }

    public String get() {
        return this.url;
    }

    public Long getStoreId() {
        Matcher matcher = AptoideUtils.RegexU.getStoreIdFromGetUrlPattern().matcher(this.url);
        if (matcher.find()) {
            return Long.valueOf(Long.parseLong(matcher.group(1)));
        }
        return null;
    }

    public String getStoreName() {
        Matcher matcher = AptoideUtils.RegexU.getStoreNameFromGetUrlPattern().matcher(this.url);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public V7Url remove(String str) {
        this.url = this.url.replace(str, "");
        return this;
    }
}
