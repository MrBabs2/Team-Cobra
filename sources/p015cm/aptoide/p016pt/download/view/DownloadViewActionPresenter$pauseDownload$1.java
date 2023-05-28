package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import p123rx.p126m.C5377a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$pauseDownload$1 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$pauseDownload$1 implements C5377a {
    final /* synthetic */ DownloadClick $downloadClick;
    final /* synthetic */ DownloadViewActionPresenter this$0;

    DownloadViewActionPresenter$pauseDownload$1(DownloadViewActionPresenter downloadViewActionPresenter, DownloadClick downloadClick) {
        this.this$0 = downloadViewActionPresenter;
        this.$downloadClick = downloadClick;
    }

    public final void call() {
        this.this$0.downloadAnalytics.downloadInteractEvent(this.$downloadClick.getDownload().getPackageName(), "pause");
    }
}
