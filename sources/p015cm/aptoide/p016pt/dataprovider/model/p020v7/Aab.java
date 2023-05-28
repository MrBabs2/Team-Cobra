package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.Aab */
public class Aab {
    @JsonProperty("required_split_types")
    private List<String> requiredSplits;
    private List<Split> splits;

    public List<String> getRequiredSplits() {
        return this.requiredSplits;
    }

    public List<Split> getSplits() {
        return this.splits;
    }

    public void setRequiredSplits(List<String> list) {
        this.requiredSplits = list;
    }

    public void setSplits(List<Split> list) {
        this.splits = list;
    }
}
