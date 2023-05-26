package p015cm.aptoide.p016pt.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.work.C0825c;
import androidx.work.C0831f;
import androidx.work.C0961j;
import androidx.work.C0970m;
import androidx.work.C0975q;
import androidx.work.C0976r;
import java.util.concurrent.TimeUnit;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.updates.UpdatesAnalytics;
import p123rx.C5328b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/notification/UpdatesNotificationManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "updatesWorkRequest", "Landroidx/work/PeriodicWorkRequest;", "setUpChannel", "", "setUpNotification", "Lrx/Completable;", "setUpWorkRequest", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.UpdatesNotificationManager */
/* compiled from: UpdatesNotificationManager.kt */
public final class UpdatesNotificationManager {
    public static final String CHANNEL_ID = "updates_notification_channel";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int UPDATE_NOTIFICATION_ID = 123;
    private static final String WORKER_TAG = "UpdatesNotificationWorker";
    private final Context context;
    private C0970m updatesWorkRequest;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo16641d2 = {"Lcm/aptoide/pt/notification/UpdatesNotificationManager$Companion;", "", "()V", "CHANNEL_ID", "", "UPDATE_NOTIFICATION_ID", "", "WORKER_TAG", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.notification.UpdatesNotificationManager$Companion */
    /* compiled from: UpdatesNotificationManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UpdatesNotificationManager(Context context2) {
        C10202j.m34178b(context2, "context");
        this.context = context2;
    }

    /* access modifiers changed from: private */
    public final void setUpChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Updates notifications", 3);
            notificationChannel.setDescription(UpdatesAnalytics.UPDATE_EVENT);
            Object systemService = this.context.getSystemService("notification");
            if (systemService != null) {
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    /* access modifiers changed from: private */
    public final void setUpWorkRequest() {
        C0970m.C0971a aVar = new C0970m.C0971a(UpdatesNotificationWorker.class, 1, TimeUnit.DAYS);
        C0825c.C0826a aVar2 = new C0825c.C0826a();
        aVar2.mo4703a(C0961j.UNMETERED);
        C0976r a = ((C0970m.C0971a) aVar.mo4983a(aVar2.mo4704a())).mo4986a();
        C10202j.m34174a((Object) a, "PeriodicWorkRequestBuild…build())\n        .build()");
        this.updatesWorkRequest = (C0970m) a;
        C0975q a2 = C0975q.m4144a(this.context);
        C0831f fVar = C0831f.KEEP;
        C0970m mVar = this.updatesWorkRequest;
        if (mVar != null) {
            a2.mo4796a(WORKER_TAG, fVar, mVar);
        } else {
            C10202j.m34181d("updatesWorkRequest");
            throw null;
        }
    }

    public final C5328b setUpNotification() {
        C5328b d = C5328b.m10169d(new UpdatesNotificationManager$setUpNotification$1(this));
        C10202j.m34174a((Object) d, "Completable.fromAction {… setUpWorkRequest()\n    }");
        return d;
    }
}
