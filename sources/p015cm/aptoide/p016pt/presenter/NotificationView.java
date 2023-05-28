package p015cm.aptoide.p016pt.presenter;

import p015cm.aptoide.p016pt.notification.NotificationInfo;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.presenter.NotificationView */
public interface NotificationView extends View {
    C5368e<NotificationInfo> getActionBootCompleted();

    C5368e<NotificationInfo> getNotificationClick();

    C5368e<NotificationInfo> getNotificationDismissed();
}
