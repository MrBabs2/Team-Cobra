package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Single;", "Lcm/aptoide/pt/database/room/RoomDownload;", "kotlin.jvm.PlatformType", "download", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallManager$downloadApp$2 */
/* compiled from: WalletInstallManager.kt */
final class WalletInstallManager$downloadApp$2<T, R> implements C5379n<T, Single<? extends R>> {
    final /* synthetic */ WalletApp $walletApp;
    final /* synthetic */ WalletInstallManager this$0;

    WalletInstallManager$downloadApp$2(WalletInstallManager walletInstallManager, WalletApp walletApp) {
        this.this$0 = walletInstallManager;
        this.$walletApp = walletApp;
    }

    public final Single<RoomDownload> call(final RoomDownload roomDownload) {
        return this.this$0.getMoPubAdsManager().getAdsVisibilityStatus().mo18564b(new C5378b<WalletAdsOfferManager.OfferResponseStatus>(this) {
            final /* synthetic */ WalletInstallManager$downloadApp$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void call(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
                WalletInstallManager walletInstallManager = this.this$0.this$0;
                RoomDownload roomDownload = roomDownload;
                C10202j.m34174a((Object) roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
                DownloadModel.Action action = DownloadModel.Action.INSTALL;
                long id = this.this$0.$walletApp.getId();
                C10202j.m34174a((Object) offerResponseStatus, "responseStatus");
                walletInstallManager.setupDownloadEvents(roomDownload, action, id, offerResponseStatus, this.this$0.$walletApp.getPackageName(), this.this$0.$walletApp.getDeveloper());
            }
        }).mo18569d(new C5379n<T, R>() {
            public final RoomDownload call(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
                return roomDownload;
            }
        });
    }
}
