package p015cm.aptoide.p016pt.notification;

import p015cm.aptoide.p016pt.database.room.RoomNotification;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.notification.m1 */
/* compiled from: lambda */
public final /* synthetic */ class C3498m1 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ NotificationInfo f6490f;

    public /* synthetic */ C3498m1(NotificationInfo notificationInfo) {
        this.f6490f = notificationInfo;
    }

    public final Object call(Object obj) {
        NotificationInfo notificationInfo = this.f6490f;
        SystemNotificationShower.m6601b(notificationInfo, (RoomNotification) obj);
        return notificationInfo;
    }
}
