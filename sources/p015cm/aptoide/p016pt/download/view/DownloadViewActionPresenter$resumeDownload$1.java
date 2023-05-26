package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Single;", "Lcm/aptoide/pt/database/room/RoomDownload;", "kotlin.jvm.PlatformType", "download", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$resumeDownload$1 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$resumeDownload$1<T, R> implements C5379n<T, Single<? extends R>> {
    final /* synthetic */ DownloadClick $downloadClick;
    final /* synthetic */ DownloadViewActionPresenter this$0;

    DownloadViewActionPresenter$resumeDownload$1(DownloadViewActionPresenter downloadViewActionPresenter, DownloadClick downloadClick) {
        this.this$0 = downloadViewActionPresenter;
        this.$downloadClick = downloadClick;
    }

    public final Single<RoomDownload> call(final RoomDownload roomDownload) {
        return this.this$0.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C5378b<WalletAdsOfferManager.OfferResponseStatus>(this) {
            final /* synthetic */ DownloadViewActionPresenter$resumeDownload$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void call(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
                Download download = this.this$0.$downloadClick.getDownload();
                DownloadViewActionPresenter downloadViewActionPresenter = this.this$0.this$0;
                RoomDownload roomDownload = roomDownload;
                C10202j.m34174a((Object) roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
                long appId = download.getAppId();
                DownloadStatusModel downloadModel = download.getDownloadModel();
                if (downloadModel != null) {
                    downloadViewActionPresenter.setupDownloadEvents(roomDownload, appId, downloadModel.getAction(), offerResponseStatus, download.getStoreName(), download.getMalware().getRank().name());
                    return;
                }
                C10202j.m34172a();
                throw null;
            }
        }).mo18569d(new C5379n<T, R>() {
            public final RoomDownload call(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
                return roomDownload;
            }
        });
    }
}
