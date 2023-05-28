package p015cm.aptoide.p016pt.home.bundles;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.misc.ErrorHomeBundle;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C12495m;

/* renamed from: cm.aptoide.pt.home.bundles.BundlesRepository */
public class BundlesRepository {
    private static final String HOME_BUNDLE_KEY = "Home_Bundle";
    private Map<String, List<HomeBundle>> cachedBundles;
    private int limit;
    private Map<String, Integer> offset;
    private final BundleDataSource remoteBundleDataSource;

    public BundlesRepository(BundleDataSource bundleDataSource, Map<String, List<HomeBundle>> map, Map<String, Integer> map2, int i) {
        this.remoteBundleDataSource = bundleDataSource;
        this.cachedBundles = map;
        this.offset = map2;
        this.limit = i;
    }

    /* access modifiers changed from: private */
    public HomeBundlesModel cloneList(HomeBundlesModel homeBundlesModel) {
        return (homeBundlesModel.hasErrors() || homeBundlesModel.isLoading()) ? homeBundlesModel : new HomeBundlesModel(new ArrayList(homeBundlesModel.getList()), homeBundlesModel.isLoading(), homeBundlesModel.getOffset(), homeBundlesModel.isComplete());
    }

    private int getOffset(String str) {
        if (!this.offset.containsKey(str)) {
            return 0;
        }
        return this.offset.get(str).intValue();
    }

    private void updateCache(HomeBundlesModel homeBundlesModel, boolean z, String str) {
        if (!homeBundlesModel.hasErrors() && !homeBundlesModel.isLoading() && homeBundlesModel.isComplete()) {
            this.offset.put(str, Integer.valueOf(homeBundlesModel.getOffset()));
            if (z || !this.cachedBundles.containsKey(str)) {
                this.cachedBundles.put(str, new ArrayList(homeBundlesModel.getList()));
                return;
            }
            List list = this.cachedBundles.get(str);
            if (list.get(list.size() - 1) instanceof ErrorHomeBundle) {
                list.remove(list.size() - 1);
            }
            list.addAll(homeBundlesModel.getList());
            this.cachedBundles.put(str, list);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo12185a(HomeBundlesModel homeBundlesModel) {
        updateCache(homeBundlesModel, true, HOME_BUNDLE_KEY);
    }

    /* renamed from: b */
    public /* synthetic */ void mo12187b(HomeBundlesModel homeBundlesModel) {
        updateCache(homeBundlesModel, false, HOME_BUNDLE_KEY);
    }

    public boolean hasMore() {
        return this.remoteBundleDataSource.hasMore(Integer.valueOf(getOffset(HOME_BUNDLE_KEY)), HOME_BUNDLE_KEY);
    }

    public Single<HomeBundlesModel> loadBundles(String str, String str2) {
        if (!this.cachedBundles.containsKey(str)) {
            return loadNextBundles(str, str2);
        }
        return Single.m10119a(new HomeBundlesModel(this.cachedBundles.put(str, new ArrayList(this.cachedBundles.get(str))), false, getOffset(str), true));
    }

    public Single<HomeBundlesModel> loadFreshBundles(String str, String str2) {
        return this.remoteBundleDataSource.loadFreshBundleForEvent(str2, str).mo18564b(new C2894c(this, str)).mo18569d(new C2896e(this));
    }

    public C5368e<HomeBundlesModel> loadFreshHomeBundles() {
        return this.remoteBundleDataSource.loadFreshHomeBundles(HOME_BUNDLE_KEY).mo18664b(new C2874a(this)).mo18694j(new C2896e(this));
    }

    public C5368e<HomeBundlesModel> loadHomeBundles() {
        if (!this.cachedBundles.containsKey(HOME_BUNDLE_KEY)) {
            return loadNextHomeBundles(true);
        }
        return C5368e.m10257c(new HomeBundlesModel(this.cachedBundles.put(HOME_BUNDLE_KEY, new ArrayList(this.cachedBundles.get(HOME_BUNDLE_KEY))), false, getOffset(HOME_BUNDLE_KEY), true));
    }

    public Single<HomeBundlesModel> loadNextBundles(String str, String str2) {
        return this.remoteBundleDataSource.loadNextBundleForEvent(str2, getOffset(str), str, this.limit).mo18564b(new C2906f(this, str)).mo18569d(new C2896e(this));
    }

    public C5368e<HomeBundlesModel> loadNextHomeBundles(boolean z) {
        return this.remoteBundleDataSource.loadNextHomeBundles(getOffset(HOME_BUNDLE_KEY), this.limit, HOME_BUNDLE_KEY, z).mo18664b(new C2895d(this)).mo18694j(new C2896e(this));
    }

    public C5328b remove(HomeBundle homeBundle) {
        return C5328b.m10166b((C12495m<? extends C5328b>) new C2893b(this, homeBundle));
    }

    public void setHomeLoadMoreError() {
        List list = this.cachedBundles.get(HOME_BUNDLE_KEY);
        if (!list.isEmpty() && !(list.get(list.size() - 1) instanceof ErrorHomeBundle)) {
            list.add(new ErrorHomeBundle());
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo12186a(String str, HomeBundlesModel homeBundlesModel) {
        updateCache(homeBundlesModel, true, str);
    }

    /* renamed from: b */
    public /* synthetic */ void mo12188b(String str, HomeBundlesModel homeBundlesModel) {
        updateCache(homeBundlesModel, false, str);
    }

    public boolean hasMore(String str) {
        return this.remoteBundleDataSource.hasMore(Integer.valueOf(getOffset(str)), str);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo12184a(HomeBundle homeBundle) {
        this.cachedBundles.get(HOME_BUNDLE_KEY).remove(homeBundle);
        return C5328b.m10170f();
    }
}
