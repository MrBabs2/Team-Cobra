package p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessListResponse;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.listapp.ListAppVersions */
public class ListAppVersions extends BaseV7EndlessListResponse<App> {
    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof ListAppVersions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListAppVersions) && ((ListAppVersions) obj).canEqual(this) && super.equals(obj);
    }

    public int hashCode() {
        return 59 + super.hashCode();
    }
}
