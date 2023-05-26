package p015cm.aptoide.p016pt.dataprovider.model.p020v7.search;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.search.SearchApp */
public class SearchApp extends App {
    private boolean hasVersions;
    private Obb obb;

    public Obb getObb() {
        return this.obb;
    }

    public boolean hasVersions() {
        return this.hasVersions;
    }

    public void setHasVersions(boolean z) {
        this.hasVersions = z;
    }

    public void setObb(Obb obb2) {
        this.obb = obb2;
    }
}
