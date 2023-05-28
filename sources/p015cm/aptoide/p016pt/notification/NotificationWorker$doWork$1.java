package p015cm.aptoide.p016pt.notification;

import android.util.Log;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.sync.Sync;
import p123rx.p126m.C5377a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.NotificationWorker$doWork$1 */
/* compiled from: NotificationWorker.kt */
final class NotificationWorker$doWork$1 implements C5377a {
    final /* synthetic */ boolean $reschedule;
    final /* synthetic */ Sync $sync;
    final /* synthetic */ String $syncId;
    final /* synthetic */ NotificationWorker this$0;

    NotificationWorker$doWork$1(NotificationWorker notificationWorker, String str, boolean z, Sync sync) {
        this.this$0 = notificationWorker;
        this.$syncId = str;
        this.$reschedule = z;
        this.$sync = sync;
    }

    public final void call() {
        Log.d("CampaignWorker", "Got notification from " + this.$syncId);
        if (this.$reschedule) {
            this.this$0.scheduler.reschedule(this.$sync);
        }
    }
}
