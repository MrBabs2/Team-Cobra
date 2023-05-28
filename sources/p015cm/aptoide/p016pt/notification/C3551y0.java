package p015cm.aptoide.p016pt.notification;

import p015cm.aptoide.p016pt.database.room.RoomNotification;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.notification.y0 */
/* compiled from: lambda */
public final /* synthetic */ class C3551y0 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ SystemNotificationShower f6564f;

    /* renamed from: g */
    private final /* synthetic */ NotificationInfo f6565g;

    public /* synthetic */ C3551y0(SystemNotificationShower systemNotificationShower, NotificationInfo notificationInfo) {
        this.f6564f = systemNotificationShower;
        this.f6565g = notificationInfo;
    }

    public final void call(Object obj) {
        this.f6564f.mo13237a(this.f6565g, (RoomNotification) obj);
    }
}
