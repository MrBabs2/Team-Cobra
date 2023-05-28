package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import java.util.List;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessListResponse */
public class BaseV7EndlessListResponse<T> extends BaseV7EndlessResponse {
    private List<T> list;

    public BaseV7EndlessListResponse() {
        super(false);
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof BaseV7EndlessListResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseV7EndlessListResponse)) {
            return false;
        }
        BaseV7EndlessListResponse baseV7EndlessListResponse = (BaseV7EndlessListResponse) obj;
        if (!baseV7EndlessListResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List list2 = getList();
        List list3 = baseV7EndlessListResponse.getList();
        return list2 != null ? list2.equals(list3) : list3 == null;
    }

    public List<T> getList() {
        return this.list;
    }

    public int getNextSize() {
        return this.list != null ? 10 : 0;
    }

    public int getTotal() {
        List<T> list2 = this.list;
        if (list2 != null) {
            return list2.size();
        }
        return 0;
    }

    public boolean hasData() {
        return this.list != null;
    }

    public int hashCode() {
        int i;
        List list2 = getList();
        int hashCode = (super.hashCode() + 59) * 59;
        if (list2 == null) {
            i = 43;
        } else {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public void setList(List<T> list2) {
        this.list = list2;
    }

    public String toString() {
        return "BaseV7EndlessListResponse(list=" + getList() + ")";
    }
}
