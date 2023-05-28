package p015cm.aptoide.p016pt.notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.BaseService;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.notification.PullingContentService */
public class PullingContentService extends BaseService {
    public static final String BOOT_COMPLETED_ACTION = "BOOT_COMPLETED_ACTION";
    public static final String PUSH_NOTIFICATIONS_ACTION = "PUSH_NOTIFICATIONS_ACTION";
    public static final String UPDATES_ACTION = "UPDATES_ACTION";
    public static final long UPDATES_INTERVAL = 86400000;
    private AptoideApplication application;
    @Inject
    DownloadFactory downloadFactory;
    private InstallManager installManager;
    @Inject
    @Named
    String marketName;
    private SharedPreferences sharedPreferences;
    private C5383b subscriptions;
    @Inject
    UpdateRepository updateRepository;

    private C5368e<Boolean> autoUpdate(List<RoomUpdate> list) {
        return C5368e.m10257c(Boolean.valueOf(ManagerPreferences.isAutoUpdateEnable(this.sharedPreferences) && ManagerPreferences.allowRootInstallation(this.sharedPreferences))).mo18687f(new C3500n0(this, list));
    }

    /* renamed from: d */
    static /* synthetic */ void m6587d(List list) {
    }

    private long getElapsedRealtimeTrigger(long j) {
        return SystemClock.elapsedRealtime() + j;
    }

    private boolean isAlarmUp(Context context, String str) {
        Intent intent = new Intent(context, PullingContentService.class);
        intent.setAction(str);
        if (PendingIntent.getService(context, 0, intent, 536870912) != null) {
            return true;
        }
        return false;
    }

    private void setUpdatesAction(int i) {
        this.subscriptions.mo18721a(this.updateRepository.getAll(false).mo18669c().mo18644a(Schedulers.computation()).mo18687f(new C3511q0(this)).mo18681d(new C3506p0(this)).mo18644a(Schedulers.m10352io()).mo18664b(new C3521t0(this, i)).mo18655a(C3494l0.f6486f, (C5378b<Throwable>) C3497m0.f6489f));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13210a(int i, List list) {
        stopSelf(i);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo13211b(List list) {
        return autoUpdate(list).mo18687f(new C3517s0(list));
    }

    /* renamed from: c */
    public /* synthetic */ Boolean mo13212c(List list) {
        return Boolean.valueOf(ManagerPreferences.isUpdateNotificationEnable(this.sharedPreferences));
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        getApplicationComponent().inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getApplicationContext();
        this.application = aptoideApplication;
        this.sharedPreferences = aptoideApplication.getDefaultSharedPreferences();
        this.installManager = this.application.getInstallManager();
        this.subscriptions = new C5383b();
        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
        if (!isAlarmUp(this, UPDATES_ACTION)) {
            setAlarm(alarmManager, this, UPDATES_ACTION, UPDATES_INTERVAL);
        }
    }

    public void onDestroy() {
        this.subscriptions.mo18720a();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action = intent == null ? null : intent.getAction();
        if (action == null) {
            return 2;
        }
        char c = 65535;
        int hashCode = action.hashCode();
        if (hashCode != 307586167) {
            if (hashCode == 1100369771 && action.equals(UPDATES_ACTION)) {
                c = 0;
            }
        } else if (action.equals(BOOT_COMPLETED_ACTION)) {
            c = 1;
        }
        if (c != 0 && c != 1) {
            return 2;
        }
        setUpdatesAction(i2);
        return 2;
    }

    public void setAlarm(AlarmManager alarmManager, Context context, String str, long j) {
        Intent intent = new Intent(context, PullingContentService.class);
        intent.setAction(str);
        AlarmManager alarmManager2 = alarmManager;
        alarmManager2.setInexactRepeating(3, getElapsedRealtimeTrigger(j), getElapsedRealtimeTrigger(j), PendingIntent.getService(context, 0, intent, 134217728));
    }

    /* renamed from: a */
    static /* synthetic */ void m6585a(Throwable th) {
        th.printStackTrace();
        CrashReport.getInstance().log(th);
    }

    /* renamed from: b */
    static /* synthetic */ C5368e m6586b(List list, Boolean bool) {
        if (bool.booleanValue()) {
            return C5368e.m10265n();
        }
        return C5368e.m10257c(list);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13209a(List list, Boolean bool) {
        if (bool.booleanValue()) {
            return C5368e.m10257c(list).mo18644a(Schedulers.m10352io()).mo18694j(new C3503o0(this)).mo18687f(new C3514r0(this));
        }
        return C5368e.m10257c(false);
    }

    /* renamed from: a */
    public /* synthetic */ ArrayList mo13207a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.downloadFactory.create((RoomUpdate) it.next(), false, Collections.emptyList()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13208a(ArrayList arrayList) {
        return this.installManager.startInstalls(arrayList);
    }
}
