package p015cm.aptoide.p016pt.notification;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.C0978s;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.apps.AppMapper;
import p015cm.aptoide.p016pt.sync.SyncScheduler;
import p015cm.aptoide.p016pt.sync.alarm.SyncStorage;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p015cm.aptoide.p016pt.view.app.AppCenter;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo16641d2 = {"Lcm/aptoide/pt/notification/AptoideWorkerFactory;", "Landroidx/work/WorkerFactory;", "updateRepository", "Lcm/aptoide/pt/updates/UpdateRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "aptoideInstallManager", "Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;", "appMapper", "Lcm/aptoide/pt/home/apps/AppMapper;", "syncScheduler", "Lcm/aptoide/pt/sync/SyncScheduler;", "syncStorage", "Lcm/aptoide/pt/sync/alarm/SyncStorage;", "crashReport", "Lcm/aptoide/pt/crashreports/CrashReport;", "appCenter", "Lcm/aptoide/pt/view/app/AppCenter;", "(Lcm/aptoide/pt/updates/UpdateRepository;Landroid/content/SharedPreferences;Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;Lcm/aptoide/pt/home/apps/AppMapper;Lcm/aptoide/pt/sync/SyncScheduler;Lcm/aptoide/pt/sync/alarm/SyncStorage;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/view/app/AppCenter;)V", "createWorker", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "workerClassName", "", "workerParameters", "Landroidx/work/WorkerParameters;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.AptoideWorkerFactory */
/* compiled from: AptoideWorkerFactory.kt */
public final class AptoideWorkerFactory extends C0978s {
    private final AppCenter appCenter;
    private final AppMapper appMapper;
    private final AptoideInstallManager aptoideInstallManager;
    private final CrashReport crashReport;
    private final SharedPreferences sharedPreferences;
    private final SyncScheduler syncScheduler;
    private final SyncStorage syncStorage;
    private final UpdateRepository updateRepository;

    public AptoideWorkerFactory(UpdateRepository updateRepository2, SharedPreferences sharedPreferences2, AptoideInstallManager aptoideInstallManager2, AppMapper appMapper2, SyncScheduler syncScheduler2, SyncStorage syncStorage2, CrashReport crashReport2, AppCenter appCenter2) {
        C10202j.m34178b(updateRepository2, "updateRepository");
        C10202j.m34178b(sharedPreferences2, "sharedPreferences");
        C10202j.m34178b(aptoideInstallManager2, "aptoideInstallManager");
        C10202j.m34178b(appMapper2, "appMapper");
        C10202j.m34178b(syncScheduler2, "syncScheduler");
        C10202j.m34178b(syncStorage2, "syncStorage");
        C10202j.m34178b(crashReport2, "crashReport");
        C10202j.m34178b(appCenter2, "appCenter");
        this.updateRepository = updateRepository2;
        this.sharedPreferences = sharedPreferences2;
        this.aptoideInstallManager = aptoideInstallManager2;
        this.appMapper = appMapper2;
        this.syncScheduler = syncScheduler2;
        this.syncStorage = syncStorage2;
        this.crashReport = crashReport2;
        this.appCenter = appCenter2;
    }

    public ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        C10202j.m34178b(context, "appContext");
        C10202j.m34178b(str, "workerClassName");
        C10202j.m34178b(workerParameters, "workerParameters");
        if (C10202j.m34176a((Object) str, (Object) UpdatesNotificationWorker.class.getName())) {
            return new UpdatesNotificationWorker(context, workerParameters, this.updateRepository, this.sharedPreferences, this.aptoideInstallManager, this.appMapper);
        } else if (C10202j.m34176a((Object) str, (Object) NotificationWorker.class.getName())) {
            return new NotificationWorker(context, workerParameters, this.syncScheduler, this.syncStorage, this.crashReport);
        } else if (C10202j.m34176a((Object) str, (Object) ComingSoonNotificationWorker.class.getName())) {
            return new ComingSoonNotificationWorker(context, workerParameters, this.appCenter);
        } else {
            return null;
        }
    }
}
