package p015cm.aptoide.p016pt.home.apps;

import java.util.List;
import p015cm.aptoide.p016pt.home.bundles.ads.AdHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.home.apps.BundleView */
public interface BundleView extends View {
    C5368e<AdHomeEvent> adClicked();

    C5368e<AppHomeEvent> appClicked();

    C5368e<HomeEvent> bundleScrolled();

    void hideLoading();

    void hideRefresh();

    void hideShowMore();

    C5368e<HomeEvent> moreClicked();

    C5368e<Object> reachesBottom();

    C5368e<Void> refreshes();

    C5368e<Void> retryClicked();

    void showBundles(List<HomeBundle> list);

    void showGenericError();

    void showLoadMore();

    void showLoading();

    void showMoreHomeBundles(List<HomeBundle> list);

    void showNetworkError();

    void updateEditorialCards();

    C5368e<HomeEvent> visibleBundles();
}
