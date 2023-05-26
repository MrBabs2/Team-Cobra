package p015cm.aptoide.p016pt.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.work.C0829e;
import androidx.work.C0831f;
import androidx.work.C0970m;
import androidx.work.C0975q;
import androidx.work.C0976r;
import java.util.concurrent.TimeUnit;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationManager;
import p123rx.C5328b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo16641d2 = {"Lcm/aptoide/pt/notification/ComingSoonNotificationManager;", "", "context", "Landroid/content/Context;", "appComingSoonPreferencesManager", "Lcm/aptoide/pt/home/AppComingSoonRegistrationManager;", "(Landroid/content/Context;Lcm/aptoide/pt/home/AppComingSoonRegistrationManager;)V", "comingSoonWorkRequest", "Landroidx/work/PeriodicWorkRequest;", "cancelScheduledNotification", "Lrx/Completable;", "packageName", "", "setUpChannel", "", "setUpWorkRequest", "url", "setupNotification", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.ComingSoonNotificationManager */
/* compiled from: ComingSoonNotificationManager.kt */
public final class ComingSoonNotificationManager {
    public static final String CHANNEL_ID = "coming_soon_notification_channel";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int NOTIFICATION_ID = 1994;
    public static final String PACKAGE_NAME = "package_name";
    public static final String WORKER_TAG = "ComingSoonNotificationWorker";
    private final AppComingSoonRegistrationManager appComingSoonPreferencesManager;
    private C0970m comingSoonWorkRequest;
    /* access modifiers changed from: private */
    public final Context context;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/pt/notification/ComingSoonNotificationManager$Companion;", "", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "PACKAGE_NAME", "WORKER_TAG", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.notification.ComingSoonNotificationManager$Companion */
    /* compiled from: ComingSoonNotificationManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ComingSoonNotificationManager(Context context2, AppComingSoonRegistrationManager appComingSoonRegistrationManager) {
        C10202j.m34178b(context2, "context");
        C10202j.m34178b(appComingSoonRegistrationManager, "appComingSoonPreferencesManager");
        this.context = context2;
        this.appComingSoonPreferencesManager = appComingSoonRegistrationManager;
    }

    /* access modifiers changed from: private */
    public final void setUpChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Coming Soon notifications", 3);
            notificationChannel.setDescription("Coming Soon");
            Object systemService = this.context.getSystemService("notification");
            if (systemService != null) {
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    /* access modifiers changed from: private */
    public final void setUpWorkRequest(String str) {
        C0829e.C0830a aVar = new C0829e.C0830a();
        aVar.mo4722a("package_name", str);
        C0976r a = ((C0970m.C0971a) ((C0970m.C0971a) new C0970m.C0971a(ComingSoonNotificationWorker.class, 1, TimeUnit.DAYS).mo4985a(WORKER_TAG + str)).mo4984a(aVar.mo4725a())).mo4986a();
        C10202j.m34174a((Object) a, "PeriodicWorkRequestBuild…build())\n        .build()");
        this.comingSoonWorkRequest = (C0970m) a;
        C0975q a2 = C0975q.m4144a(this.context);
        String str2 = WORKER_TAG + str;
        C0831f fVar = C0831f.KEEP;
        C0970m mVar = this.comingSoonWorkRequest;
        if (mVar != null) {
            a2.mo4796a(str2, fVar, mVar);
        } else {
            C10202j.m34181d("comingSoonWorkRequest");
            throw null;
        }
    }

    public final C5328b cancelScheduledNotification(String str) {
        C10202j.m34178b(str, "packageName");
        C5328b a = C5328b.m10169d(new ComingSoonNotificationManager$cancelScheduledNotification$1(this, str)).mo18587a(this.appComingSoonPreferencesManager.cancelScheduledNotification(str));
        C10202j.m34174a((Object) a, "Completable.fromAction {…otification(packageName))");
        return a;
    }

    public final C5328b setupNotification(String str) {
        C10202j.m34178b(str, "url");
        C5328b a = C5328b.m10169d(new ComingSoonNotificationManager$setupNotification$1(this, str)).mo18587a(this.appComingSoonPreferencesManager.registerUserNotification(str));
        C10202j.m34174a((Object) a, "Completable.fromAction {…terUserNotification(url))");
        return a;
    }
}
