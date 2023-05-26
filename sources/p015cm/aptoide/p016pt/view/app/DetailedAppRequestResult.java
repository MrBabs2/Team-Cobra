package p015cm.aptoide.p016pt.view.app;

/* renamed from: cm.aptoide.pt.view.app.DetailedAppRequestResult */
public class DetailedAppRequestResult {
    private final DetailedApp detailedApp;
    private final Error error;
    private final boolean loading;

    /* renamed from: cm.aptoide.pt.view.app.DetailedAppRequestResult$Error */
    public enum Error {
        NETWORK,
        GENERIC
    }

    public DetailedAppRequestResult(Error error2) {
        this.detailedApp = null;
        this.loading = false;
        this.error = error2;
    }

    public DetailedApp getDetailedApp() {
        return this.detailedApp;
    }

    public Error getError() {
        return this.error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public DetailedAppRequestResult(DetailedApp detailedApp2) {
        this.detailedApp = detailedApp2;
        this.loading = false;
        this.error = null;
    }

    public DetailedAppRequestResult(boolean z) {
        this.detailedApp = null;
        this.loading = z;
        this.error = null;
    }
}
