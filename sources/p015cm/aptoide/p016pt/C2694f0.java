package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.notification.NotificationInfo;
import p015cm.aptoide.p016pt.notification.NotificationReceiver;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.f0 */
/* compiled from: lambda */
public final /* synthetic */ class C2694f0 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2694f0 f5530f = new C2694f0();

    private /* synthetic */ C2694f0() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((NotificationInfo) obj).getAction().equals(NotificationReceiver.NOTIFICATION_PRESSED_ACTION));
    }
}
