package p015cm.aptoide.p016pt.app;

import java.util.List;
import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.ads.data.ApplicationAdError;
import p015cm.aptoide.p016pt.view.app.Application;
import p015cm.aptoide.p016pt.view.app.AppsList;

/* renamed from: cm.aptoide.pt.app.SimilarAppsViewModel */
public class SimilarAppsViewModel {

    /* renamed from: ad */
    private final ApplicationAd f3853ad;
    private final ApplicationAdError adError;
    private boolean hasRecordedAdImpression;
    private final boolean loading;
    private final List<Application> recommendedApps;
    private final AppsList.Error recommendedAppsError;

    public SimilarAppsViewModel(ApplicationAd applicationAd, List<Application> list, boolean z, AppsList.Error error, ApplicationAdError applicationAdError) {
        this.f3853ad = applicationAd;
        this.recommendedApps = list;
        this.loading = z;
        this.recommendedAppsError = error;
        this.adError = applicationAdError;
    }

    public ApplicationAd getAd() {
        return this.f3853ad;
    }

    public ApplicationAdError getAdError() {
        return this.adError;
    }

    public List<Application> getRecommendedApps() {
        return this.recommendedApps;
    }

    public AppsList.Error getRecommendedAppsError() {
        return this.recommendedAppsError;
    }

    public boolean hasAd() {
        return this.f3853ad != null;
    }

    public boolean hasAdError() {
        return this.adError != null || this.f3853ad == null;
    }

    public boolean hasError() {
        return (this.recommendedAppsError == null && this.adError == null && this.f3853ad != null) ? false : true;
    }

    public boolean hasRecommendedAppsError() {
        return this.recommendedAppsError != null;
    }

    public boolean hasRecordedAdImpression() {
        return this.hasRecordedAdImpression;
    }

    public boolean hasSimilarApps() {
        return !hasRecommendedAppsError() && !this.recommendedApps.isEmpty();
    }

    public boolean isLoading() {
        return this.loading;
    }

    public void setHasRecordedAdImpression(boolean z) {
        this.hasRecordedAdImpression = z;
    }
}
