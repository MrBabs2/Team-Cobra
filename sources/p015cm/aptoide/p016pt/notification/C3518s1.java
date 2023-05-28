package p015cm.aptoide.p016pt.notification;

import android.app.PendingIntent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.notification.s1 */
/* compiled from: lambda */
public final /* synthetic */ class C3518s1 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ SystemNotificationShower f6520f;

    /* renamed from: g */
    private final /* synthetic */ AptoideNotification f6521g;

    /* renamed from: h */
    private final /* synthetic */ int f6522h;

    public /* synthetic */ C3518s1(SystemNotificationShower systemNotificationShower, AptoideNotification aptoideNotification, int i) {
        this.f6520f = systemNotificationShower;
        this.f6521g = aptoideNotification;
        this.f6522h = i;
    }

    public final Object call(Object obj) {
        return this.f6520f.mo13239b(this.f6521g, this.f6522h, (PendingIntent) obj);
    }
}
