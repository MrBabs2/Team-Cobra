package p015cm.aptoide.p016pt.dataprovider.model.p020v7.store;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessDataListResponse;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.ListStores */
public class ListStores extends BaseV7EndlessDataListResponse<Store> {
    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof ListStores;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListStores) && ((ListStores) obj).canEqual(this) && super.equals(obj);
    }

    public int hashCode() {
        return 59 + super.hashCode();
    }
}
