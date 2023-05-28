package p015cm.aptoide.p016pt.app.view.similar;

import p015cm.aptoide.p016pt.app.SimilarAppsViewModel;

/* renamed from: cm.aptoide.pt.app.view.similar.SimilarAppsBundle */
public class SimilarAppsBundle {
    private final BundleType bundleType;
    private final SimilarAppsViewModel model;

    /* renamed from: cm.aptoide.pt.app.view.similar.SimilarAppsBundle$BundleType */
    public enum BundleType {
        APPS,
        APPC_APPS
    }

    public SimilarAppsBundle(SimilarAppsViewModel similarAppsViewModel, BundleType bundleType2) {
        this.model = similarAppsViewModel;
        this.bundleType = bundleType2;
    }

    public SimilarAppsViewModel getContent() {
        return this.model;
    }

    public BundleType getType() {
        return this.bundleType;
    }
}
