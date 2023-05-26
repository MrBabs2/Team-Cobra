package p015cm.aptoide.p016pt.install.installer;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.notification.SystemNotificationShower;
import p112n.p118g.p119b.C5305c;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.install.installer.RootInstallationRetryHandler */
public class RootInstallationRetryHandler {
    private static final String TAG = "RootInstallationRetryHandler";
    private Context context;
    private int count;
    private final C5305c<List<Install>> handler;
    private final InstallManager installManager;
    private final int notificationId;
    private RootInstallErrorNotificationFactory rootInstallErrorNotificationFactory;
    private C5375k subscription;
    private final SystemNotificationShower systemNotificationShower;

    public RootInstallationRetryHandler(int i, SystemNotificationShower systemNotificationShower2, InstallManager installManager2, C5305c<List<Install>> cVar, int i2, Context context2, RootInstallErrorNotificationFactory rootInstallErrorNotificationFactory2) {
        this.notificationId = i;
        this.systemNotificationShower = systemNotificationShower2;
        this.installManager = installManager2;
        this.handler = cVar;
        this.count = i2;
        this.context = context2;
        this.rootInstallErrorNotificationFactory = rootInstallErrorNotificationFactory2;
    }

    /* renamed from: b */
    static /* synthetic */ void m6500b(List list) {
    }

    private void dismissNotifications() {
        this.systemNotificationShower.dismissNotification(this.notificationId);
        this.handler.call(Collections.emptyList());
    }

    private void showNotification(List<Install> list) {
        if (this.count == 0) {
            showSystemNotification(list);
        } else {
            this.handler.call(list);
        }
    }

    private void showSystemNotification(List<Install> list) {
        SystemNotificationShower systemNotificationShower2 = this.systemNotificationShower;
        Context context2 = this.context;
        systemNotificationShower2.showNotification(context2, this.rootInstallErrorNotificationFactory.create(context2, list));
    }

    /* renamed from: a */
    public /* synthetic */ void mo12904a(List list) {
        if (list.isEmpty()) {
            dismissNotifications();
        } else {
            showNotification(list);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo12905b() {
        this.count--;
    }

    public C5368e<List<Install>> retries() {
        return this.handler.mo18663b((C5377a) new C3325p0(this)).mo18680d((C5377a) new C3321n0(this));
    }

    public void start() {
        this.subscription = this.installManager.getTimedOutInstallations().mo18644a(C5376a.m10346b()).mo18664b(new C3327q0(this)).mo18655a(C3323o0.f6274f, (C5378b<Throwable>) C3329r0.f6280f);
    }

    public void stop() {
        if (!this.subscription.isUnsubscribed()) {
            this.subscription.unsubscribe();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6499a(Throwable th) {
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12979e(str, "start: " + th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12903a() {
        this.count++;
    }
}
