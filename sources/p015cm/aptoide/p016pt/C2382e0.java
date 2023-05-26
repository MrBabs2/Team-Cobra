package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.notification.NotificationInfo;
import p015cm.aptoide.p016pt.notification.NotificationReceiver;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.e0 */
/* compiled from: lambda */
public final /* synthetic */ class C2382e0 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2382e0 f5113f = new C2382e0();

    private /* synthetic */ C2382e0() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((NotificationInfo) obj).getAction().equals(NotificationReceiver.NOTIFICATION_DISMISSED_ACTION));
    }
}
