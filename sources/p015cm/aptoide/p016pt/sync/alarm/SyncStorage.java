package p015cm.aptoide.p016pt.sync.alarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.p016pt.notification.LocalNotificationSyncPersistence;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSync;
import p015cm.aptoide.p016pt.sync.Sync;
import p123rx.C5328b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.sync.alarm.SyncStorage */
public class SyncStorage {
    private final LocalNotificationSyncPersistence persistence;
    private final Map<String, Sync> syncs;

    public SyncStorage(Map<String, Sync> map, LocalNotificationSyncPersistence localNotificationSyncPersistence) {
        this.syncs = map;
        this.persistence = localNotificationSyncPersistence;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14857a(Sync sync) {
        if (sync instanceof LocalNotificationSync) {
            this.persistence.save((LocalNotificationSync) sync);
        }
        this.syncs.put(sync.getId(), sync);
    }

    public Sync get(String str) {
        if (str.equals(LocalNotificationSync.APPC_CAMPAIGN_NOTIFICATION) || str.equals(LocalNotificationSync.NEW_FEATURE)) {
            return this.persistence.get(str).mo18695j().mo41034a();
        }
        return this.syncs.get(str);
    }

    public List<Sync> getAll() {
        return new ArrayList(this.syncs.values());
    }

    public void remove(String str) {
        C5328b.m10169d(new C4390b(this, str)).mo18600b(Schedulers.m10352io()).mo18609d();
    }

    public void save(Sync sync) {
        C5328b.m10169d(new C4389a(this, sync)).mo18600b(Schedulers.m10352io()).mo18609d();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14858a(String str) {
        if (str.equals(LocalNotificationSync.APPC_CAMPAIGN_NOTIFICATION)) {
            this.persistence.remove(str);
        }
        this.syncs.remove(str);
    }
}
