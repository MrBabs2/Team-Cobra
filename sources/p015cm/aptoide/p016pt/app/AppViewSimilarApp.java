package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.view.app.Application;

/* renamed from: cm.aptoide.pt.app.AppViewSimilarApp */
public class AppViewSimilarApp {

    /* renamed from: ad */
    private ApplicationAd f3851ad;
    private Application app;

    public AppViewSimilarApp(Application application, ApplicationAd applicationAd) {
        this.app = application;
        this.f3851ad = applicationAd;
    }

    public ApplicationAd getAd() {
        return this.f3851ad;
    }

    public Application getApp() {
        return this.app;
    }

    public int getNetworkAdType() {
        ApplicationAd applicationAd = this.f3851ad;
        if (applicationAd == null) {
            return 0;
        }
        return applicationAd.getNetwork().ordinal();
    }

    public boolean isAd() {
        return this.app == null && this.f3851ad != null;
    }
}
