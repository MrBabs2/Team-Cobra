package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ReadPost */
public class ReadPost {
    @JsonProperty("uid")
    private final String postId;
    @JsonProperty("type")
    private final String postType;

    public ReadPost(String str, String str2) {
        this.postId = str;
        this.postType = str2;
    }
}
