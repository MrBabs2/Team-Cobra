package p015cm.aptoide.p016pt.view.app;

import java.util.Collections;
import java.util.List;

/* renamed from: cm.aptoide.pt.view.app.AppsList */
public class AppsList {
    private final Error error;
    private final List<Application> list;
    private final boolean loading;
    private final int offset;

    /* renamed from: cm.aptoide.pt.view.app.AppsList$Error */
    public enum Error {
        NETWORK,
        GENERIC
    }

    public AppsList(Error error2) {
        this.error = error2;
        this.loading = false;
        this.list = Collections.emptyList();
        this.offset = -1;
    }

    public Error getError() {
        return this.error;
    }

    public List<Application> getList() {
        return this.list;
    }

    public int getOffset() {
        return this.offset;
    }

    public boolean hasErrors() {
        return this.error != null;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public AppsList(List<Application> list2, boolean z, int i) {
        this.list = list2;
        this.loading = z;
        this.offset = i;
        this.error = null;
    }

    public AppsList(boolean z) {
        this.loading = z;
        this.list = Collections.emptyList();
        this.error = null;
        this.offset = -1;
    }
}
