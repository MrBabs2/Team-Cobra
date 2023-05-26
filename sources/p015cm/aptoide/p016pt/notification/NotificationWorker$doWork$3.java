package p015cm.aptoide.p016pt.notification;

import kotlin.C4789l;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "", "throwable", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.NotificationWorker$doWork$3 */
/* compiled from: NotificationWorker.kt */
final class NotificationWorker$doWork$3<T> implements C5378b<Throwable> {
    final /* synthetic */ NotificationWorker this$0;

    NotificationWorker$doWork$3(NotificationWorker notificationWorker) {
        this.this$0 = notificationWorker;
    }

    public final void call(Throwable th) {
        this.this$0.crashReport.log(th);
    }
}
