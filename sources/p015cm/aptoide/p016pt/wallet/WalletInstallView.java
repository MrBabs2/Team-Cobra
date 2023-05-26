package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H&J\b\u0010\u000f\u001a\u00020\u0007H&J\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0007H&¨\u0006\u0016"}, mo16641d2 = {"Lcm/aptoide/pt/wallet/WalletInstallView;", "Lcm/aptoide/pt/presenter/View;", "cancelDownloadButtonClicked", "Lrx/Observable;", "Ljava/lang/Void;", "closeButtonClicked", "dismissDialog", "", "showDownloadState", "downloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "showIndeterminateDownload", "showInstallationSuccessView", "showRootInstallWarningPopup", "", "showSdkErrorView", "showWalletInstallationView", "appIcon", "", "walletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "showWalletInstalledAlreadyView", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallView */
/* compiled from: WalletInstallView.kt */
public interface WalletInstallView extends View {
    C5368e<Void> cancelDownloadButtonClicked();

    C5368e<Void> closeButtonClicked();

    void dismissDialog();

    void showDownloadState(DownloadModel downloadModel);

    void showIndeterminateDownload();

    void showInstallationSuccessView();

    C5368e<Boolean> showRootInstallWarningPopup();

    void showSdkErrorView();

    void showWalletInstallationView(String str, WalletApp walletApp);

    void showWalletInstalledAlreadyView();
}
