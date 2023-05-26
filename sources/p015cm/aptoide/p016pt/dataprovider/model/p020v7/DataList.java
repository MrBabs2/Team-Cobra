package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import java.util.List;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.DataList */
public class DataList<T> {
    private int count;
    private int hidden;
    private Integer limit;
    private List<T> list;
    private boolean loaded;
    private int next;
    private int offset;
    private int total;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof DataList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataList)) {
            return false;
        }
        DataList dataList = (DataList) obj;
        if (!dataList.canEqual(this) || getTotal() != dataList.getTotal() || getCount() != dataList.getCount() || getOffset() != dataList.getOffset()) {
            return false;
        }
        Integer limit2 = getLimit();
        Integer limit3 = dataList.getLimit();
        if (limit2 != null ? !limit2.equals(limit3) : limit3 != null) {
            return false;
        }
        if (getNext() != dataList.getNext() || getHidden() != dataList.getHidden() || isLoaded() != dataList.isLoaded()) {
            return false;
        }
        List list2 = getList();
        List list3 = dataList.getList();
        return list2 != null ? list2.equals(list3) : list3 == null;
    }

    public int getCount() {
        return this.count;
    }

    public int getHidden() {
        return this.hidden;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public List<T> getList() {
        return this.list;
    }

    public int getNext() {
        return this.next;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int i;
        int total2 = ((((getTotal() + 59) * 59) + getCount()) * 59) + getOffset();
        Integer limit2 = getLimit();
        int i2 = total2 * 59;
        int i3 = 43;
        if (limit2 == null) {
            i = 43;
        } else {
            i = limit2.hashCode();
        }
        int next2 = ((((((i2 + i) * 59) + getNext()) * 59) + getHidden()) * 59) + (isLoaded() ? 79 : 97);
        List list2 = getList();
        int i4 = next2 * 59;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        return i4 + i3;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setHidden(int i) {
        this.hidden = i;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setList(List<T> list2) {
        this.list = list2;
    }

    public void setLoaded(boolean z) {
        this.loaded = z;
    }

    public void setNext(int i) {
        this.next = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public String toString() {
        return "DataList(total=" + getTotal() + ", count=" + getCount() + ", offset=" + getOffset() + ", limit=" + getLimit() + ", next=" + getNext() + ", hidden=" + getHidden() + ", loaded=" + isLoaded() + ", list=" + getList() + ")";
    }
}
