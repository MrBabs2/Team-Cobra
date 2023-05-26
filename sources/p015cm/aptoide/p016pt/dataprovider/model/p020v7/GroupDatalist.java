package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.GroupDatalist */
public class GroupDatalist extends BaseV7EndlessDataListResponse<Group> {
    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GroupDatalist;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GroupDatalist) && ((GroupDatalist) obj).canEqual(this) && super.equals(obj);
    }

    public int hashCode() {
        return 59 + super.hashCode();
    }
}
