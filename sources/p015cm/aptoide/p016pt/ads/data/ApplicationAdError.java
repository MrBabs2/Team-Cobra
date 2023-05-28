package p015cm.aptoide.p016pt.ads.data;

import p015cm.aptoide.p016pt.view.app.AppsList;

/* renamed from: cm.aptoide.pt.ads.data.ApplicationAdError */
public class ApplicationAdError {
    private final AppsList.Error minimalAdError;

    public ApplicationAdError(AppsList.Error error) {
        this.minimalAdError = error;
    }

    public String getErrorMessage() {
        AppsList.Error error = this.minimalAdError;
        if (error != null) {
            return error.name();
        }
        return null;
    }

    public boolean hasError() {
        return this.minimalAdError != null;
    }
}
