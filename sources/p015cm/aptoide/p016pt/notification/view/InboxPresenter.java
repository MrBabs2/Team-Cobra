package p015cm.aptoide.p016pt.notification.view;

import java.util.List;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.notification.AptoideNotification;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.notification.NotificationCenter;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.notification.view.InboxPresenter */
public class InboxPresenter implements Presenter {
    private final int NUMBER_OF_NOTIFICATIONS = 50;
    private final NotificationAnalytics analytics;
    private final CrashReport crashReport;
    private final NavigationTracker navigationTracker;
    private final NotificationCenter notificationCenter;
    private final InboxView view;
    private final C5373h viewScheduler;

    public InboxPresenter(InboxView inboxView, NotificationCenter notificationCenter2, CrashReport crashReport2, NavigationTracker navigationTracker2, NotificationAnalytics notificationAnalytics, C5373h hVar) {
        this.view = inboxView;
        this.notificationCenter = notificationCenter2;
        this.crashReport = crashReport2;
        this.navigationTracker = navigationTracker2;
        this.analytics = notificationAnalytics;
        this.viewScheduler = hVar;
    }

    /* renamed from: b */
    static /* synthetic */ void m6631b(AptoideNotification aptoideNotification) {
    }

    /* renamed from: b */
    static /* synthetic */ void m6632b(List list) {
    }

    /* renamed from: f */
    static /* synthetic */ void m6635f(View.LifecycleEvent lifecycleEvent) {
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13284a(View.LifecycleEvent lifecycleEvent) {
        return this.notificationCenter.getInboxNotifications(50);
    }

    /* renamed from: b */
    public /* synthetic */ void mo13289b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo13290c(View.LifecycleEvent lifecycleEvent) {
        return this.view.notificationSelection();
    }

    public void present() {
        this.view.getLifecycleEvent().mo18681d(C3539k.f6546f).mo18687f(new C3532d(this)).mo18644a(this.viewScheduler).mo18664b(new C3541m(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3533e.f6540f, (C5378b<Throwable>) new C3530b(this));
        this.view.getLifecycleEvent().mo18681d(C3534f.f6541f).mo18687f(new C3538j(this)).mo18664b(new C3537i(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3536h.f6543f, (C5378b<Throwable>) new C3531c(this));
        this.view.getLifecycleEvent().mo18681d(C3540l.f6547f).mo18689g(new C3535g(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3529a.f6536f, (C5378b<Throwable>) new C3542n(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13287a(List list) {
        if (list.isEmpty()) {
            this.view.showEmptyState();
        } else {
            this.view.showNotifications(list);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo13288b(View.LifecycleEvent lifecycleEvent) {
        return this.notificationCenter.setAllNotificationsRead();
    }

    /* renamed from: c */
    public /* synthetic */ void mo13291c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13285a(AptoideNotification aptoideNotification) {
        this.analytics.sendNotificationTouchEvent(aptoideNotification.getNotificationCenterUrlTrack());
        this.navigationTracker.registerScreen(ScreenTagHistory.Builder.build(InboxPresenter.class.getSimpleName()));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13286a(Throwable th) {
        this.crashReport.log(th);
    }
}
