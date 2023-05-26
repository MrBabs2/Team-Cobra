package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import p015cm.aptoide.p016pt.download.view.DownloadViewStatusHelper;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo16641d2 = {"cm/aptoide/pt/download/view/DownloadViewStatusHelper$setupListeners$2", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener;", "onActionClick", "", "action", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewStatusHelper$setupListeners$2 */
/* compiled from: DownloadViewStatusHelper.kt */
public final class DownloadViewStatusHelper$setupListeners$2 implements DownloadEventListener {
    final /* synthetic */ Download $download;
    final /* synthetic */ C12871b $downloadClickSubject;

    DownloadViewStatusHelper$setupListeners$2(C12871b bVar, Download download) {
        this.$downloadClickSubject = bVar;
        this.$download = download;
    }

    public void onActionClick(DownloadEventListener.Action action) {
        C10202j.m34178b(action, "action");
        int i = DownloadViewStatusHelper.WhenMappings.$EnumSwitchMapping$0[action.getType().ordinal()];
        if (i == 1) {
            this.$downloadClickSubject.onNext(new DownloadClick(this.$download, DownloadEvent.CANCEL));
        } else if (i == 2) {
            this.$downloadClickSubject.onNext(new DownloadClick(this.$download, DownloadEvent.RESUME));
        } else if (i == 3) {
            this.$downloadClickSubject.onNext(new DownloadClick(this.$download, DownloadEvent.PAUSE));
        }
    }
}
