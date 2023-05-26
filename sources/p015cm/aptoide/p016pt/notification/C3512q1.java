package p015cm.aptoide.p016pt.notification;

import android.app.PendingIntent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.notification.q1 */
/* compiled from: lambda */
public final /* synthetic */ class C3512q1 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ SystemNotificationShower f6512f;

    /* renamed from: g */
    private final /* synthetic */ AptoideNotification f6513g;

    /* renamed from: h */
    private final /* synthetic */ int f6514h;

    public /* synthetic */ C3512q1(SystemNotificationShower systemNotificationShower, AptoideNotification aptoideNotification, int i) {
        this.f6512f = systemNotificationShower;
        this.f6513g = aptoideNotification;
        this.f6514h = i;
    }

    public final Object call(Object obj) {
        return this.f6512f.mo13230a(this.f6513g, this.f6514h, (PendingIntent) obj);
    }
}
