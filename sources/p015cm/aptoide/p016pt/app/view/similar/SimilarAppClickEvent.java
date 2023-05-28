package p015cm.aptoide.p016pt.app.view.similar;

import p015cm.aptoide.p016pt.app.AppViewSimilarApp;
import p015cm.aptoide.p016pt.app.view.AppViewSimilarAppsAdapter;

/* renamed from: cm.aptoide.pt.app.view.similar.SimilarAppClickEvent */
public class SimilarAppClickEvent {
    private int position;
    private AppViewSimilarApp similar;
    private AppViewSimilarAppsAdapter.SimilarAppType type;

    public SimilarAppClickEvent(AppViewSimilarApp appViewSimilarApp, AppViewSimilarAppsAdapter.SimilarAppType similarAppType, int i) {
        this.similar = appViewSimilarApp;
        this.type = similarAppType;
        this.position = i;
    }

    public int getPosition() {
        return this.position;
    }

    public AppViewSimilarApp getSimilar() {
        return this.similar;
    }

    public AppViewSimilarAppsAdapter.SimilarAppType getType() {
        return this.type;
    }
}
