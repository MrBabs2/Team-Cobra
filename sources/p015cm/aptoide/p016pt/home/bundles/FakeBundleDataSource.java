package p015cm.aptoide.p016pt.home.bundles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.home.bundles.ads.AdBundle;
import p015cm.aptoide.p016pt.home.bundles.ads.AdsTagWrapper;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.view.app.Application;
import p015cm.aptoide.p016pt.view.app.FeatureGraphicApplication;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.home.bundles.FakeBundleDataSource */
public class FakeBundleDataSource implements BundleDataSource {
    private C5368e<HomeBundlesModel> getHomeBundles() {
        return C5368e.m10257c(new HomeBundlesModel(getFakeBundles(), false, 0, true));
    }

    public List<HomeBundle> getFakeBundles() {
        ArrayList arrayList = new ArrayList();
        String str = "https://placeimg.com/640/480/any";
        Application application = new Application(BuildConfig.MARKET_NAME, str, 0.0f, 1000, "cm.aptoide.pt", 300, "", false);
        arrayList.add(application);
        Application application2 = new Application("Facebook", str, 4.2f, 1000, "katana.facebook.com", 30, "", false);
        arrayList.add(application2);
        arrayList.add(application);
        arrayList.add(application2);
        arrayList.add(application);
        arrayList.add(application2);
        arrayList.add(application);
        arrayList.add(application2);
        ArrayList arrayList2 = new ArrayList();
        String str2 = "https://placeimg.com/640/480/any";
        FeatureGraphicApplication featureGraphicApplication = new FeatureGraphicApplication(BuildConfig.MARKET_NAME, str, 0.0f, 1000, "cm.aptoide.pt", 300, str2, "", false, false);
        arrayList.add(featureGraphicApplication);
        FeatureGraphicApplication featureGraphicApplication2 = new FeatureGraphicApplication("Facebook", str, 4.2f, 1000, "katana.facebook.com", 30, str2, "", false, false);
        arrayList2.add(featureGraphicApplication2);
        arrayList2.add(featureGraphicApplication);
        arrayList2.add(featureGraphicApplication2);
        arrayList2.add(featureGraphicApplication);
        arrayList2.add(featureGraphicApplication2);
        arrayList2.add(featureGraphicApplication);
        arrayList2.add(featureGraphicApplication2);
        arrayList2.add(featureGraphicApplication);
        arrayList2.add(featureGraphicApplication2);
        AppBundle appBundle = new AppBundle("As escolhas do filipe", arrayList2, HomeBundle.BundleType.EDITORS, (Event) null, "", "As escolhas do filipe-more");
        ArrayList arrayList3 = arrayList;
        AppBundle appBundle2 = new AppBundle("piores apps locais", arrayList3, HomeBundle.BundleType.APPS, (Event) null, "", "piores apps locais-more");
        AppBundle appBundle3 = new AppBundle("um pouco melhor apps", arrayList3, HomeBundle.BundleType.APPS, (Event) null, "", "um pouco melhor apps-more");
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(appBundle);
        arrayList4.add(appBundle2);
        arrayList4.add(appBundle3);
        arrayList4.add(new AdBundle("Highlighted", new AdsTagWrapper(Collections.emptyList(), ""), (Event) null, ""));
        new ArrayList().add(new Application("asf wallet", "http://pool.img.aptoide.com/asf-store/ace60f6352f6dd9289843b5b0b2ab3d4_icon.png", 5.0f, 1000000, "asf.wallet.android.com", 36057221, "", false));
        return arrayList4;
    }

    public boolean hasMore(Integer num, String str) {
        return true;
    }

    public Single<HomeBundlesModel> loadFreshBundleForEvent(String str, String str2) {
        return getHomeBundles().mo18700m();
    }

    public C5368e<HomeBundlesModel> loadFreshHomeBundles(String str) {
        return getHomeBundles();
    }

    public Single<HomeBundlesModel> loadNextBundleForEvent(String str, int i, String str2, int i2) {
        return getHomeBundles().mo18700m();
    }

    public C5368e<HomeBundlesModel> loadNextHomeBundles(int i, int i2, String str, boolean z) {
        return loadFreshHomeBundles(str);
    }
}
