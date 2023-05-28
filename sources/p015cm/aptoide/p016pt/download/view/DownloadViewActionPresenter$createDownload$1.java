package p015cm.aptoide.p016pt.download.view;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.aab.DynamicSplit;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/database/room/RoomDownload;", "kotlin.jvm.PlatformType", "it", "", "Lcm/aptoide/pt/aab/DynamicSplit;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$createDownload$1 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$createDownload$1<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ Download $download;
    final /* synthetic */ List $dynamicSplitsList;
    final /* synthetic */ DownloadViewActionPresenter this$0;

    DownloadViewActionPresenter$createDownload$1(DownloadViewActionPresenter downloadViewActionPresenter, Download download, List list) {
        this.this$0 = downloadViewActionPresenter;
        this.$download = download;
        this.$dynamicSplitsList = list;
    }

    public final C5368e<RoomDownload> call(List<DynamicSplit> list) {
        DownloadFactory access$getDownloadFactory$p = this.this$0.downloadFactory;
        DownloadViewActionPresenter downloadViewActionPresenter = this.this$0;
        DownloadStatusModel downloadModel = this.$download.getDownloadModel();
        if (downloadModel != null) {
            return C5368e.m10257c(access$getDownloadFactory$p.create(downloadViewActionPresenter.parseDownloadAction(downloadModel.getAction()), this.$download.getAppName(), this.$download.getPackageName(), this.$download.getMd5(), this.$download.getIcon(), this.$download.getVersionName(), this.$download.getVersionCode(), this.$download.getPath(), this.$download.getPathAlt(), this.$download.getObb(), this.$download.getHasAdvertising() || this.$download.getHasBilling(), this.$download.getSize(), this.$download.getSplits(), this.$download.getRequiredSplits(), this.$download.getMalware().getRank().toString(), this.$download.getStoreName(), this.$download.getOemId(), this.$dynamicSplitsList));
        }
        C10202j.m34172a();
        throw null;
    }
}
