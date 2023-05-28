package p015cm.aptoide.p016pt.appview;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.view.AppCoinsViewModel;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.appview.InstallAppView */
public interface InstallAppView extends View {
    C5368e<Void> cancelDownload();

    C5368e<DownloadModel.Action> installAppClick();

    void openApp(String str);

    C5368e<Void> pauseDownload();

    C5368e<DownloadModel.Action> resumeDownload();

    C5368e<Boolean> showDowngradeMessage();

    void showDowngradingMessage();

    void showDownloadAppModel(DownloadModel downloadModel, AppCoinsViewModel appCoinsViewModel, boolean z);

    void showGenericErrorDialog();

    void showInvalidAppInfoErrorDialog();

    C5368e<Boolean> showRootInstallWarningPopup();
}
