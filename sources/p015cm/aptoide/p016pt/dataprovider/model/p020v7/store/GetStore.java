package p015cm.aptoide.p016pt.dataprovider.model.p020v7.store;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.GetStore */
public class GetStore extends StoreUserAbstraction<GetStoreMeta> {
    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetStore;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetStore) && ((GetStore) obj).canEqual(this) && super.equals(obj);
    }

    public int hashCode() {
        return 59 + super.hashCode();
    }

    public String toString() {
        return "GetStore()";
    }
}
