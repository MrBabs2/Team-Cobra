package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.p031rx.RxAlertDialog;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.home.apps.AppsFragmentView */
public interface AppsFragmentView extends View {
    C5368e<App> cancelDownload();

    C5368e<App> cardClick();

    void hidePullToRefresh();

    C5368e<Void> imageClick();

    C5368e<App> installApp();

    C5368e<App> pauseDownload();

    C5368e<Void> refreshApps();

    C5368e<App> resumeDownload();

    void scrollToTop();

    void setDefaultUserImage();

    void setUserImage(String str);

    void showAvatar();

    Single<RxAlertDialog.Result> showIgnoreUpdateDialog();

    void showModel(AppsModel appsModel);

    C5368e<Boolean> showRootWarning();

    void showUnknownErrorMessage();

    C5368e<App> startDownload();

    C5368e<Void> updateAll();

    C5368e<App> updateLongClick();
}
