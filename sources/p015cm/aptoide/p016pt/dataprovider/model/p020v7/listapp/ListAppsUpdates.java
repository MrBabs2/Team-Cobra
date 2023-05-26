package p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.listapp.ListAppsUpdates */
public class ListAppsUpdates extends BaseV7Response {
    private List<App> list;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof ListAppsUpdates;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListAppsUpdates)) {
            return false;
        }
        ListAppsUpdates listAppsUpdates = (ListAppsUpdates) obj;
        if (!listAppsUpdates.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<App> list2 = getList();
        List<App> list3 = listAppsUpdates.getList();
        return list2 != null ? list2.equals(list3) : list3 == null;
    }

    public List<App> getList() {
        return this.list;
    }

    public int hashCode() {
        int i;
        List<App> list2 = getList();
        int hashCode = (super.hashCode() + 59) * 59;
        if (list2 == null) {
            i = 43;
        } else {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public boolean isOk() {
        return super.isOk() || this.list != null;
    }

    public void setList(List<App> list2) {
        this.list = list2;
    }

    public String toString() {
        return "ListAppsUpdates(list=" + getList() + ")";
    }
}
