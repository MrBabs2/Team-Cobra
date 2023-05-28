package p015cm.aptoide.p016pt.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C0373i;
import androidx.core.app.C0381l;
import androidx.work.C0975q;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.app.aptoideinstall.ComingSoonApp;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.ActivityProvider;
import p015cm.aptoide.p016pt.view.app.AppCenter;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/pt/notification/ComingSoonNotificationWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "appCenter", "Lcm/aptoide/pt/view/app/AppCenter;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcm/aptoide/pt/view/app/AppCenter;)V", "cancelComingSoonVerification", "", "packageName", "", "doWork", "Landroidx/work/ListenableWorker$Result;", "handleAppArrived", "comingSoonApp", "Lcm/aptoide/pt/app/aptoideinstall/ComingSoonApp;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.ComingSoonNotificationWorker */
/* compiled from: ComingSoonNotificationWorker.kt */
public final class ComingSoonNotificationWorker extends Worker {
    private final AppCenter appCenter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComingSoonNotificationWorker(Context context, WorkerParameters workerParameters, AppCenter appCenter2) {
        super(context, workerParameters);
        C10202j.m34178b(context, "context");
        C10202j.m34178b(workerParameters, "workerParameters");
        C10202j.m34178b(appCenter2, "appCenter");
        this.appCenter = appCenter2;
    }

    /* access modifiers changed from: private */
    public final void cancelComingSoonVerification(String str) {
        if (str != null) {
            C0975q a = C0975q.m4144a(getApplicationContext());
            a.mo4795a(ComingSoonNotificationManager.WORKER_TAG + str);
        }
    }

    /* access modifiers changed from: private */
    public final void handleAppArrived(ComingSoonApp comingSoonApp) {
        Context applicationContext = getApplicationContext();
        ActivityProvider activityProvider = AptoideApplication.getActivityProvider();
        C10202j.m34174a((Object) activityProvider, "AptoideApplication.getActivityProvider()");
        Intent intent = new Intent(applicationContext, activityProvider.getMainActivityFragmentClass());
        intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra("md5", comingSoonApp.getMd5());
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 134217728);
        String string = getApplicationContext().getString(C1086R.string.promotional_new_notification_body, new Object[]{comingSoonApp.getAppName()});
        C10202j.m34174a((Object) string, "applicationContext.getSt…   comingSoonApp.appName)");
        C0373i.C0377d dVar = new C0373i.C0377d(getApplicationContext(), ComingSoonNotificationManager.CHANNEL_ID);
        dVar.mo2242a(activity);
        dVar.mo2256c(false);
        dVar.mo2254c((int) C1086R.C1087drawable.ic_stat_aptoide_notification);
        dVar.mo2243a(ImageLoader.with(getApplicationContext()).loadBitmap(comingSoonApp.getAppIcon()));
        dVar.mo2252b((CharSequence) getApplicationContext().getString(C1086R.string.promotional_new_notification_title));
        dVar.mo2246a((CharSequence) string);
        dVar.mo2248a(true);
        C0381l.m1863a(getApplicationContext()).mo2265a(1994, dVar.mo2237a());
    }

    public ListenableWorker.C0815a doWork() {
        String a = getInputData().mo4714a("package_name");
        this.appCenter.loadDetailedApp(a, "catappult").mo18564b(new ComingSoonNotificationWorker$doWork$1(this, a)).mo18562a().mo41082a();
        ListenableWorker.C0815a c = ListenableWorker.C0815a.m3650c();
        C10202j.m34174a((Object) c, "Result.success()");
        return c;
    }
}
