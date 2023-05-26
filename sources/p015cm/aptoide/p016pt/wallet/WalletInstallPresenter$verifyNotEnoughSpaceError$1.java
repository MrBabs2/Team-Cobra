package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "", "offerResponseStatus", "Lcm/aptoide/pt/ads/WalletAdsOfferManager$OfferResponseStatus;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallPresenter$verifyNotEnoughSpaceError$1 */
/* compiled from: WalletInstallPresenter.kt */
final class WalletInstallPresenter$verifyNotEnoughSpaceError$1<T> implements C5378b<WalletAdsOfferManager.OfferResponseStatus> {
    final /* synthetic */ DownloadModel $downloadModel;
    final /* synthetic */ WalletApp $walletApp;
    final /* synthetic */ WalletInstallPresenter this$0;

    WalletInstallPresenter$verifyNotEnoughSpaceError$1(WalletInstallPresenter walletInstallPresenter, DownloadModel downloadModel, WalletApp walletApp) {
        this.this$0 = walletInstallPresenter;
        this.$downloadModel = downloadModel;
        this.$walletApp = walletApp;
    }

    public final void call(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.$downloadModel.getAction();
        this.this$0.getWalletInstallAnalytics().sendNotEnoughSpaceErrorEvent(this.$walletApp.getMd5sum());
    }
}
