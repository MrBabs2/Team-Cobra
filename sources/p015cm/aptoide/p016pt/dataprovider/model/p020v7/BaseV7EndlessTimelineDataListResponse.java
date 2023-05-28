package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessTimelineDataListResponse */
public class BaseV7EndlessTimelineDataListResponse<T> extends BaseV7EndlessResponse {
    @JsonProperty("data")
    private TimelineData data;
    @JsonProperty("datalist")
    private DataList<T> dataList;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof BaseV7EndlessDataListResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseV7EndlessDataListResponse)) {
            return false;
        }
        BaseV7EndlessDataListResponse baseV7EndlessDataListResponse = (BaseV7EndlessDataListResponse) obj;
        if (!baseV7EndlessDataListResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        DataList dataList2 = getDataList();
        DataList dataList3 = baseV7EndlessDataListResponse.getDataList();
        return dataList2 != null ? dataList2.equals(dataList3) : dataList3 == null;
    }

    public TimelineData getData() {
        return this.data;
    }

    public DataList<T> getDataList() {
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
        DataList<T> dataList2 = this.dataList;
        return (dataList2 == null || dataList2.getList() == null) ? false : true;
    }

    public int hashCode() {
        int i;
        DataList dataList2 = getDataList();
        int hashCode = (super.hashCode() + 59) * 59;
        if (dataList2 == null) {
            i = 43;
        } else {
            i = dataList2.hashCode();
        }
        return hashCode + i;
    }

    public void setData(TimelineData timelineData) {
        this.data = timelineData;
    }

    public void setDataList(DataList<T> dataList2) {
        this.dataList = dataList2;
    }

    public String toString() {
        return "BaseV7EndlessTimelineDataListResponse(dataList=" + getDataList() + ")";
    }
}
