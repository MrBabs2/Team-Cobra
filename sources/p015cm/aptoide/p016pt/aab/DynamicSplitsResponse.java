package p015cm.aptoide.p016pt.aab;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Split;

/* renamed from: cm.aptoide.pt.aab.DynamicSplitsResponse */
public class DynamicSplitsResponse extends BaseV7Response {
    @JsonProperty("list")
    private List<DynamicSplit> dynamicSplitList;

    /* renamed from: cm.aptoide.pt.aab.DynamicSplitsResponse$DynamicSplit */
    public static class DynamicSplit {
        @JsonProperty("delivery_types")
        List<String> deliveryTypes;
        private Long filesize;
        private String md5sum;
        private String name;
        private String path;
        private List<Split> splits;
        private String type;

        public List<String> getDeliveryTypes() {
            return this.deliveryTypes;
        }

        public Long getFilesize() {
            return this.filesize;
        }

        public String getMd5sum() {
            return this.md5sum;
        }

        public String getName() {
            return this.name;
        }

        public String getPath() {
            return this.path;
        }

        public List<Split> getSplits() {
            return this.splits;
        }

        public String getType() {
            return this.type;
        }

        public void setDeliveryTypes(List<String> list) {
            this.deliveryTypes = list;
        }

        public void setFilesize(Long l) {
            this.filesize = l;
        }

        public void setMd5sum(String str) {
            this.md5sum = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public void setSplits(List<Split> list) {
            this.splits = list;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public List<DynamicSplit> getDynamicSplitList() {
        return this.dynamicSplitList;
    }

    public void setDynamicSplitList(List<DynamicSplit> list) {
        this.dynamicSplitList = list;
    }
}
