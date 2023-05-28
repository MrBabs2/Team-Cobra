package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.home.more.base.ListAppsView;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListView;", "Lcm/aptoide/pt/home/more/base/ListAppsView;", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "cancelDownload", "Lrx/Observable;", "Ljava/lang/Void;", "hideWalletArea", "", "onWalletInstallClick", "pauseDownload", "resumeDownload", "setupWallet", "walletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "showDownloadError", "showRootInstallWarningPopup", "", "updateState", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListView */
/* compiled from: EarnAppcListView.kt */
public interface EarnAppcListView extends ListAppsView<RewardApp> {
    C5368e<Void> cancelDownload();

    void hideWalletArea();

    C5368e<Void> onWalletInstallClick();

    C5368e<Void> pauseDownload();

    C5368e<Void> resumeDownload();

    void setupWallet(WalletApp walletApp);

    void showDownloadError(WalletApp walletApp);

    C5368e<Boolean> showRootInstallWarningPopup();

    void updateState(WalletApp walletApp);
}
