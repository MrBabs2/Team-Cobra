package p015cm.aptoide.p016pt.view.app;

import java.util.List;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.view.app.ListStoreAppsView */
public interface ListStoreAppsView extends View {
    void addApps(List<Application> list);

    C5368e<Application> getAppClick();

    C12871b<Void> getRefreshEvent();

    C5368e<Void> getRetryEvent();

    void hideLoading();

    void hideRefreshLoading();

    C5368e<Object> reachesBottom();

    void setApps(List<Application> list);

    void showGenericError();

    void showLoading();

    void showNetworkError();

    void showStartingLoading();
}
