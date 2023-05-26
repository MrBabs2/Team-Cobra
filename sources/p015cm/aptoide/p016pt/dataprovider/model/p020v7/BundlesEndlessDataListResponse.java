package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.BundlesEndlessDataListResponse */
public class BundlesEndlessDataListResponse<T> extends BaseV7EndlessResponse {
    @JsonProperty("datalist")
    private BundlesDataList dataList;

    public BundlesDataList getDataList() {
        return this.dataList;
    }

    public int getNextSize() {
        if (hasData()) {
            return this.dataList.getNext();
        }
        return 0;
    }

    public int getTotal() {
        if (hasData()) {
            return this.dataList.getTotal();
        }
        return 0;
    }

    public boolean hasData() {
        BundlesDataList bundlesDataList = this.dataList;
        return (bundlesDataList == null || bundlesDataList.getList() == null) ? false : true;
    }

    public void setDataList(BundlesDataList bundlesDataList) {
        this.dataList = bundlesDataList;
    }
}
