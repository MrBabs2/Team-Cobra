package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.MyStore */
public class MyStore extends BaseV7Response {
    GetStoreWidgets widgets;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof MyStore;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyStore)) {
            return false;
        }
        MyStore myStore = (MyStore) obj;
        if (!myStore.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        GetStoreWidgets widgets2 = getWidgets();
        GetStoreWidgets widgets3 = myStore.getWidgets();
        return widgets2 != null ? widgets2.equals(widgets3) : widgets3 == null;
    }

    public GetStoreWidgets getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int i;
        GetStoreWidgets widgets2 = getWidgets();
        int hashCode = (super.hashCode() + 59) * 59;
        if (widgets2 == null) {
            i = 43;
        } else {
            i = widgets2.hashCode();
        }
        return hashCode + i;
    }

    public void setWidgets(GetStoreWidgets getStoreWidgets) {
        this.widgets = getStoreWidgets;
    }

    public String toString() {
        return "MyStore(widgets=" + getWidgets() + ")";
    }
}
