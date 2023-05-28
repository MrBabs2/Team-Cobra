package p015cm.aptoide.p016pt.download.view;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.InvalidAppException;
import p015cm.aptoide.p016pt.download.view.DownloadStatusModel;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$createDownload$2 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$createDownload$2<T> implements C5378b<Throwable> {
    final /* synthetic */ Download $download;
    final /* synthetic */ List $dynamicSplitsList;
    final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus $offerResponseStatus;
    final /* synthetic */ DownloadViewActionPresenter this$0;

    DownloadViewActionPresenter$createDownload$2(DownloadViewActionPresenter downloadViewActionPresenter, Download download, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, List list) {
        this.this$0 = downloadViewActionPresenter;
        this.$download = download;
        this.$offerResponseStatus = offerResponseStatus;
        this.$dynamicSplitsList = list;
    }

    public final void call(Throwable th) {
        if (th instanceof InvalidAppException) {
            DownloadAnalytics access$getDownloadAnalytics$p = this.this$0.downloadAnalytics;
            String packageName = this.$download.getPackageName();
            int versionCode = this.$download.getVersionCode();
            DownloadViewActionPresenter downloadViewActionPresenter = this.this$0;
            DownloadStatusModel downloadModel = this.$download.getDownloadModel();
            if (downloadModel != null) {
                access$getDownloadAnalytics$p.sendAppNotValidError(packageName, versionCode, downloadViewActionPresenter.mapDownloadAction(downloadModel.getAction()), this.$offerResponseStatus, this.$download.getDownloadModel().getAction() == DownloadStatusModel.Action.MIGRATE, !this.$download.getSplits().isEmpty(), this.$download.getHasAdvertising() || this.$download.getHasBilling(), this.$download.getMalware().getRank().toString(), this.$download.getStoreName(), this.this$0.isInApkfyContext, th, this.$download.getObb() != null, this.this$0.splitAnalyticsMapper.getSplitTypesAsString(!this.$download.getSplits().isEmpty(), this.$dynamicSplitsList));
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
    }
}
