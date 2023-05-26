package p015cm.aptoide.p016pt.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.C0373i;
import androidx.core.app.C0381l;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.home.apps.AppMapper;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.ActivityProvider;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u001eH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo16641d2 = {"Lcm/aptoide/pt/notification/UpdatesNotificationWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "updateRepository", "Lcm/aptoide/pt/updates/UpdateRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "aptoideInstallManager", "Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;", "appMapper", "Lcm/aptoide/pt/home/apps/AppMapper;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcm/aptoide/pt/updates/UpdateRepository;Landroid/content/SharedPreferences;Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;Lcm/aptoide/pt/home/apps/AppMapper;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "getNotificationDefaultDesign", "Landroid/app/Notification;", "updates", "", "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "resultPendingIntent", "Landroid/app/PendingIntent;", "tickerText", "", "handleNotification", "", "shouldShowNotification", "", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.UpdatesNotificationWorker */
/* compiled from: UpdatesNotificationWorker.kt */
public final class UpdatesNotificationWorker extends Worker {
    /* access modifiers changed from: private */
    public final AppMapper appMapper;
    /* access modifiers changed from: private */
    public final AptoideInstallManager aptoideInstallManager;
    private final Context context;
    private final SharedPreferences sharedPreferences;
    private final UpdateRepository updateRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesNotificationWorker(Context context2, WorkerParameters workerParameters, UpdateRepository updateRepository2, SharedPreferences sharedPreferences2, AptoideInstallManager aptoideInstallManager2, AppMapper appMapper2) {
        super(context2, workerParameters);
        C10202j.m34178b(context2, "context");
        C10202j.m34178b(workerParameters, "workerParameters");
        C10202j.m34178b(updateRepository2, "updateRepository");
        C10202j.m34178b(sharedPreferences2, "sharedPreferences");
        C10202j.m34178b(aptoideInstallManager2, "aptoideInstallManager");
        C10202j.m34178b(appMapper2, "appMapper");
        this.context = context2;
        this.updateRepository = updateRepository2;
        this.sharedPreferences = sharedPreferences2;
        this.aptoideInstallManager = aptoideInstallManager2;
        this.appMapper = appMapper2;
    }

    private final Notification getNotificationDefaultDesign(List<UpdateApp> list, PendingIntent pendingIntent, String str) {
        String string = getApplicationContext().getString(C1086R.string.app_name);
        Context applicationContext = getApplicationContext();
        C10202j.m34174a((Object) applicationContext, "applicationContext");
        String formattedString = AptoideUtils.StringU.getFormattedString(C1086R.string.new_updates, applicationContext.getResources(), Integer.valueOf(list.size()));
        if (list.size() == 1) {
            Context applicationContext2 = getApplicationContext();
            C10202j.m34174a((Object) applicationContext2, "applicationContext");
            formattedString = AptoideUtils.StringU.getFormattedString(C1086R.string.one_new_update, applicationContext2.getResources(), Integer.valueOf(list.size()));
        }
        C0373i.C0377d dVar = new C0373i.C0377d(this.context, UpdatesNotificationManager.CHANNEL_ID);
        dVar.mo2242a(pendingIntent);
        dVar.mo2256c(false);
        dVar.mo2254c((int) C1086R.C1087drawable.ic_stat_aptoide_notification);
        dVar.mo2252b((CharSequence) string);
        dVar.mo2246a((CharSequence) formattedString);
        dVar.mo2255c((CharSequence) str);
        dVar.mo2248a(true);
        Notification a = dVar.mo2237a();
        C10202j.m34174a((Object) a, "builder.build()");
        return a;
    }

    /* access modifiers changed from: private */
    public final void handleNotification(List<UpdateApp> list) {
        if (shouldShowNotification(list.size())) {
            Context applicationContext = getApplicationContext();
            ActivityProvider activityProvider = AptoideApplication.getActivityProvider();
            C10202j.m34174a((Object) activityProvider, "AptoideApplication.getActivityProvider()");
            Intent intent = new Intent(applicationContext, activityProvider.getMainActivityFragmentClass());
            intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.NEW_UPDATES, true);
            PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 134217728);
            Context applicationContext2 = getApplicationContext();
            C10202j.m34174a((Object) applicationContext2, "applicationContext");
            String formattedString = AptoideUtils.StringU.getFormattedString(C1086R.string.has_updates, applicationContext2.getResources(), getApplicationContext().getString(C1086R.string.app_name));
            C10202j.m34174a((Object) activity, "resultPendingIntent");
            C10202j.m34174a((Object) formattedString, "tickerText");
            C0381l.m1863a(this.context).mo2265a(123, getNotificationDefaultDesign(list, activity, formattedString));
            ManagerPreferences.setLastUpdates(list.size(), this.sharedPreferences);
        }
    }

    private final boolean shouldShowNotification(int i) {
        return ManagerPreferences.isUpdateNotificationEnable(this.sharedPreferences) && i > 0 && i != ManagerPreferences.getLastUpdates(this.sharedPreferences);
    }

    public ListenableWorker.C0815a doWork() {
        this.updateRepository.sync(true, false, false).mo18593a(this.updateRepository.getAll(false)).mo18669c().mo18687f(new UpdatesNotificationWorker$doWork$1(this)).mo18695j().mo41034a();
        ListenableWorker.C0815a c = ListenableWorker.C0815a.m3650c();
        C10202j.m34174a((Object) c, "Result.success()");
        return c;
    }
}
