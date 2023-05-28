package p015cm.aptoide.p016pt;

import android.app.NotificationManager;
import com.trello.rxlifecycle.C4749b;
import com.trello.rxlifecycle.C4750c;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.notification.NotificationIdsMapper;
import p015cm.aptoide.p016pt.notification.NotificationInfo;
import p015cm.aptoide.p016pt.notification.SystemNotificationShower;
import p015cm.aptoide.p016pt.presenter.NotificationView;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;
import p123rx.p127s.C5380a;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.NotificationApplicationView */
public class NotificationApplicationView extends AptoideApplication implements NotificationView {
    private C5380a<View.LifecycleEvent> lifecycleEventBehaviorSubject;
    private SystemNotificationShower systemNotificationShower;

    public void attachPresenter(Presenter presenter) {
        presenter.present();
    }

    public <T> C4749b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return C4750c.m7795a(getLifecycleEvent(), lifecycleEvent);
    }

    public C5368e<NotificationInfo> getActionBootCompleted() {
        return getNotificationsPublishRelay().mo18681d(C2029d0.f4679f);
    }

    public C5368e<View.LifecycleEvent> getLifecycleEvent() {
        return this.lifecycleEventBehaviorSubject;
    }

    public C5368e<NotificationInfo> getNotificationClick() {
        return getNotificationsPublishRelay().mo18681d(C2694f0.f5530f);
    }

    public C5368e<NotificationInfo> getNotificationDismissed() {
        return getNotificationsPublishRelay().mo18681d(C2382e0.f5113f);
    }

    /* access modifiers changed from: protected */
    public SystemNotificationShower getSystemNotificationShower() {
        if (this.systemNotificationShower == null) {
            this.systemNotificationShower = new SystemNotificationShower(this, (NotificationManager) getSystemService("notification"), new NotificationIdsMapper(), getNotificationCenter(), getNotificationAnalytics(), CrashReport.getInstance(), getNotificationProvider(), this, new C5383b(), getNavigationTracker(), getNewFeatureManager(), getThemeAnalytics(), getReadyToInstallNotificationManager());
        }
        return this.systemNotificationShower;
    }

    public void onCreate() {
        super.onCreate();
        C5380a<View.LifecycleEvent> p = C5380a.m10348p();
        this.lifecycleEventBehaviorSubject = p;
        p.onNext(View.LifecycleEvent.CREATE);
        attachPresenter(getSystemNotificationShower());
    }
}
