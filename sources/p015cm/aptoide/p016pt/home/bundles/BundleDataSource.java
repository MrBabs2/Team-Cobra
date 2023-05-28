package p015cm.aptoide.p016pt.home.bundles;

import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.home.bundles.BundleDataSource */
public interface BundleDataSource {
    boolean hasMore(Integer num, String str);

    Single<HomeBundlesModel> loadFreshBundleForEvent(String str, String str2);

    C5368e<HomeBundlesModel> loadFreshHomeBundles(String str);

    Single<HomeBundlesModel> loadNextBundleForEvent(String str, int i, String str2, int i2);

    C5368e<HomeBundlesModel> loadNextHomeBundles(int i, int i2, String str, boolean z);
}
