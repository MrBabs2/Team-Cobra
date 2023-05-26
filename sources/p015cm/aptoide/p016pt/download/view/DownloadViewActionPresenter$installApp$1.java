package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p123rx.C5328b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Completable;", "status", "Lcm/aptoide/pt/ads/WalletAdsOfferManager$OfferResponseStatus;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$installApp$1 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$installApp$1<T, R> implements C5379n<WalletAdsOfferManager.OfferResponseStatus, C5328b> {
    final /* synthetic */ DownloadClick $downloadClick;
    final /* synthetic */ DownloadViewActionPresenter this$0;

    DownloadViewActionPresenter$installApp$1(DownloadViewActionPresenter downloadViewActionPresenter, DownloadClick downloadClick) {
        this.this$0 = downloadViewActionPresenter;
        this.$downloadClick = downloadClick;
    }

    public final C5328b call(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        DownloadViewActionPresenter downloadViewActionPresenter = this.this$0;
        Download download = this.$downloadClick.getDownload();
        C10202j.m34174a((Object) offerResponseStatus, "status");
        return downloadViewActionPresenter.downloadApp(download, offerResponseStatus);
    }
}
