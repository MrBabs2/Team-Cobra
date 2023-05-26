package p015cm.aptoide.p016pt.dataprovider.model.p020v7.store;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.GetStoreMeta */
public class GetStoreMeta extends BaseV7Response {
    private Store data;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetStoreMeta;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStoreMeta)) {
            return false;
        }
        GetStoreMeta getStoreMeta = (GetStoreMeta) obj;
        if (!getStoreMeta.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Store data2 = getData();
        Store data3 = getStoreMeta.getData();
        return data2 != null ? data2.equals(data3) : data3 == null;
    }

    public Store getData() {
        return this.data;
    }

    public int hashCode() {
        int i;
        Store data2 = getData();
        int hashCode = (super.hashCode() + 59) * 59;
        if (data2 == null) {
            i = 43;
        } else {
            i = data2.hashCode();
        }
        return hashCode + i;
    }

    public void setData(Store store) {
        this.data = store;
    }

    public String toString() {
        return "GetStoreMeta(data=" + getData() + ")";
    }
}
