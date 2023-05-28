package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.notification.NotificationInfo;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.d0 */
/* compiled from: lambda */
public final /* synthetic */ class C2029d0 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2029d0 f4679f = new C2029d0();

    private /* synthetic */ C2029d0() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((NotificationInfo) obj).getAction().equals("android.intent.action.BOOT_COMPLETED"));
    }
}
