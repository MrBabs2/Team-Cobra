package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.home.bundles.BundlesRepository;
import p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.app.view.MoreBundleManager */
public class MoreBundleManager {
    private final BundlesRepository bundlesRepository;

    public MoreBundleManager(BundlesRepository bundlesRepository2) {
        this.bundlesRepository = bundlesRepository2;
    }

    /* access modifiers changed from: private */
    /* renamed from: handleEmptyBundles */
    public Single<HomeBundlesModel> mo7564b(String str, String str2, HomeBundlesModel homeBundlesModel) {
        if (isOnlyEmptyBundles(homeBundlesModel)) {
            return loadNextBundles(str, str2);
        }
        return Single.m10119a(homeBundlesModel);
    }

    private boolean isOnlyEmptyBundles(HomeBundlesModel homeBundlesModel) {
        return !homeBundlesModel.hasErrors() && !homeBundlesModel.isLoading() && homeBundlesModel.getList().isEmpty();
    }

    public boolean hasMore(String str) {
        return this.bundlesRepository.hasMore(str);
    }

    public Single<HomeBundlesModel> loadBundle(String str, String str2) {
        return this.bundlesRepository.loadBundles(str, str2).mo18559a(new C1806se(this, str, str2));
    }

    public Single<HomeBundlesModel> loadFreshBundles(String str, String str2) {
        return this.bundlesRepository.loadFreshBundles(str, str2);
    }

    public Single<HomeBundlesModel> loadNextBundles(String str, String str2) {
        return this.bundlesRepository.loadNextBundles(str, str2).mo18559a(new C1826te(this, str, str2));
    }
}
