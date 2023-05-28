package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo16641d2 = {"<anonymous>", "", "offerResponseStatus", "Lcm/aptoide/pt/ads/WalletAdsOfferManager$OfferResponseStatus;", "call", "cm/aptoide/pt/home/more/appcoins/EarnAppcListPresenter$verifyNotEnoughSpaceError$1$1"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter$verifyNotEnoughSpaceError$$inlined$let$lambda$1 */
/* compiled from: EarnAppcListPresenter.kt */
final class C3074x57c4922e<T> implements C5378b<WalletAdsOfferManager.OfferResponseStatus> {
    final /* synthetic */ DownloadModel $downloadModel;
    final /* synthetic */ WalletApp $walletApp$inlined;
    final /* synthetic */ EarnAppcListPresenter this$0;

    C3074x57c4922e(DownloadModel downloadModel, EarnAppcListPresenter earnAppcListPresenter, WalletApp walletApp) {
        this.$downloadModel = downloadModel;
        this.this$0 = earnAppcListPresenter;
        this.$walletApp$inlined = walletApp;
    }

    public final void call(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.$downloadModel.getAction();
        this.this$0.earnAppcListAnalytics.sendNotEnoughSpaceErrorEvent(this.$walletApp$inlined.getMd5sum());
    }
}
