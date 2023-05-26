package p015cm.aptoide.p016pt.notification;

import androidx.work.C0975q;
import kotlin.C4789l;
import p123rx.p126m.C5377a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.ComingSoonNotificationManager$cancelScheduledNotification$1 */
/* compiled from: ComingSoonNotificationManager.kt */
final class ComingSoonNotificationManager$cancelScheduledNotification$1 implements C5377a {
    final /* synthetic */ String $packageName;
    final /* synthetic */ ComingSoonNotificationManager this$0;

    ComingSoonNotificationManager$cancelScheduledNotification$1(ComingSoonNotificationManager comingSoonNotificationManager, String str) {
        this.this$0 = comingSoonNotificationManager;
        this.$packageName = str;
    }

    public final void call() {
        C0975q a = C0975q.m4144a(this.this$0.context);
        a.mo4795a(ComingSoonNotificationManager.WORKER_TAG + this.$packageName);
    }
}
