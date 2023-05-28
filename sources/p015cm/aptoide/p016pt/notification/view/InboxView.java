package p015cm.aptoide.p016pt.notification.view;

import java.util.List;
import p015cm.aptoide.p016pt.notification.AptoideNotification;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.notification.view.InboxView */
public interface InboxView extends View {
    C5368e<AptoideNotification> notificationSelection();

    void showEmptyState();

    void showNotifications(List<AptoideNotification> list);
}
