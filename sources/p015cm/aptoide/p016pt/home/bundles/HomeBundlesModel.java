package p015cm.aptoide.p016pt.home.bundles;

import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;

/* renamed from: cm.aptoide.pt.home.bundles.HomeBundlesModel */
public class HomeBundlesModel {
    private final boolean complete;
    private final Error error;
    private final List<HomeBundle> list;
    private final boolean loading;
    private final int offset;

    /* renamed from: cm.aptoide.pt.home.bundles.HomeBundlesModel$Error */
    public enum Error {
        NETWORK,
        GENERIC
    }

    public HomeBundlesModel(Error error2) {
        this.error = error2;
        this.loading = false;
        this.list = Collections.emptyList();
        this.offset = -1;
        this.complete = true;
    }

    public Error getError() {
        return this.error;
    }

    public List<HomeBundle> getList() {
        return this.list;
    }

    public int getOffset() {
        return this.offset;
    }

    public boolean hasErrors() {
        return this.error != null;
    }

    public boolean isComplete() {
        return this.complete;
    }

    public boolean isListEmpty() {
        return this.list.isEmpty();
    }

    public boolean isLoading() {
        return this.loading;
    }

    public HomeBundlesModel(List<HomeBundle> list2, boolean z, int i, boolean z2) {
        this.list = list2;
        this.loading = z;
        this.offset = i;
        this.error = null;
        this.complete = z2;
    }

    public HomeBundlesModel(boolean z) {
        this.loading = z;
        this.list = Collections.emptyList();
        this.error = null;
        this.offset = -1;
        this.complete = false;
    }
}
