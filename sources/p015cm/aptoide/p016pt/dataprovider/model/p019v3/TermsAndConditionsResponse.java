package p015cm.aptoide.p016pt.dataprovider.model.p019v3;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cm.aptoide.pt.dataprovider.model.v3.TermsAndConditionsResponse */
public class TermsAndConditionsResponse extends BaseV3Response {
    @JsonProperty("privacy")
    private boolean privacy;
    @JsonProperty("tos")
    private boolean tos;

    public boolean isPrivacy() {
        return this.privacy;
    }

    public boolean isTos() {
        return this.tos;
    }

    public void setPrivacy(boolean z) {
        this.privacy = z;
    }

    public void setTos(boolean z) {
        this.tos = z;
    }
}
