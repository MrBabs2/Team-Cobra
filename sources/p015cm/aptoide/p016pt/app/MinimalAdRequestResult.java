package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.ads.data.ApplicationAdError;
import p015cm.aptoide.p016pt.ads.data.AptoideNativeAd;
import p015cm.aptoide.p016pt.view.app.AppsList;

/* renamed from: cm.aptoide.pt.app.MinimalAdRequestResult */
public class MinimalAdRequestResult implements ApplicationAdResult {
    private final AppsList.Error error;
    private final MinimalAd minimalAd;

    public MinimalAdRequestResult(MinimalAd minimalAd2) {
        this.minimalAd = minimalAd2;
        this.error = null;
    }

    public ApplicationAd getAd() {
        MinimalAd minimalAd2 = this.minimalAd;
        if (minimalAd2 == null) {
            return null;
        }
        return new AptoideNativeAd(minimalAd2);
    }

    public ApplicationAdError getError() {
        AppsList.Error error2 = this.error;
        if (error2 == null) {
            return null;
        }
        return new ApplicationAdError(error2);
    }

    public MinimalAd getMinimalAd() {
        return this.minimalAd;
    }

    public MinimalAdRequestResult(AppsList.Error error2) {
        this.minimalAd = null;
        this.error = error2;
    }
}
