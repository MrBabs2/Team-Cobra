package p015cm.aptoide.aptoideviews.downloadprogressview;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressViewEventOnSubscribe;", "Lrx/Observable$OnSubscribe;", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "view", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "(Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;)V", "getView", "()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "call", "", "subscriber", "Lrx/Subscriber;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressViewEventOnSubscribe */
/* compiled from: EventObservable.kt */
public final class DownloadProgressViewEventOnSubscribe implements C5368e.C5370a<DownloadEventListener.Action> {
    private final DownloadProgressView view;

    public DownloadProgressViewEventOnSubscribe(DownloadProgressView downloadProgressView) {
        C10202j.m34178b(downloadProgressView, "view");
        this.view = downloadProgressView;
    }

    public final DownloadProgressView getView() {
        return this.view;
    }

    public void call(C12475j<? super DownloadEventListener.Action> jVar) {
        C10202j.m34178b(jVar, "subscriber");
        C12476a.verifyMainThread();
        DownloadProgressViewEventOnSubscribe$call$eventListener$1 downloadProgressViewEventOnSubscribe$call$eventListener$1 = new DownloadProgressViewEventOnSubscribe$call$eventListener$1(jVar);
        jVar.add(new DownloadProgressViewEventOnSubscribe$call$1(this));
        this.view.setEventListener(downloadProgressViewEventOnSubscribe$call$eventListener$1);
    }
}
