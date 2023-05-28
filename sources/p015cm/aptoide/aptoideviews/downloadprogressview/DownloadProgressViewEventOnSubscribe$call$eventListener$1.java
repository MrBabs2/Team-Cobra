package p015cm.aptoide.aptoideviews.downloadprogressview;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import p123rx.C12475j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo16641d2 = {"cm/aptoide/aptoideviews/downloadprogressview/DownloadProgressViewEventOnSubscribe$call$eventListener$1", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener;", "onActionClick", "", "action", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressViewEventOnSubscribe$call$eventListener$1 */
/* compiled from: EventObservable.kt */
public final class DownloadProgressViewEventOnSubscribe$call$eventListener$1 implements DownloadEventListener {
    final /* synthetic */ C12475j $subscriber;

    DownloadProgressViewEventOnSubscribe$call$eventListener$1(C12475j jVar) {
        this.$subscriber = jVar;
    }

    public void onActionClick(DownloadEventListener.Action action) {
        C10202j.m34178b(action, "action");
        if (!this.$subscriber.isUnsubscribed()) {
            this.$subscriber.onNext(action);
        }
    }
}
