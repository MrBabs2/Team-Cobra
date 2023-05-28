package androidx.work.impl;

import android.os.Build;
import androidx.room.C0729a;
import androidx.room.C0739g;
import androidx.room.C0753j;
import androidx.room.C0759l;
import androidx.room.p006t.C0777c;
import androidx.room.p006t.C0781g;
import androidx.work.impl.p012l.C0899b;
import androidx.work.impl.p012l.C0900c;
import androidx.work.impl.p012l.C0903e;
import androidx.work.impl.p012l.C0904f;
import androidx.work.impl.p012l.C0908h;
import androidx.work.impl.p012l.C0909i;
import androidx.work.impl.p012l.C0914k;
import androidx.work.impl.p012l.C0915l;
import androidx.work.impl.p012l.C0926n;
import androidx.work.impl.p012l.C0927o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p050l.p103q.p104a.C5165b;
import p050l.p103q.p104a.C5166c;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b */
    private volatile C0914k f2997b;

    /* renamed from: c */
    private volatile C0899b f2998c;

    /* renamed from: d */
    private volatile C0926n f2999d;

    /* renamed from: e */
    private volatile C0903e f3000e;

    /* renamed from: f */
    private volatile C0908h f3001f;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C0837a extends C0759l.C0760a {
        C0837a(int i) {
            super(i);
        }

        public void createAllTables(C5165b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.execSQL("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.execSQL("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
        }

        public void dropAllTables(C5165b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `Dependency`");
            bVar.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            bVar.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.execSQL("DROP TABLE IF EXISTS `WorkName`");
        }

        /* access modifiers changed from: protected */
        public void onCreate(C5165b bVar) {
            if (WorkDatabase_Impl.this.mCallbacks != null) {
                int size = WorkDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((C0753j.C0755b) WorkDatabase_Impl.this.mCallbacks.get(i)).mo4409a(bVar);
                }
            }
        }

        public void onOpen(C5165b bVar) {
            C5165b unused = WorkDatabase_Impl.this.mDatabase = bVar;
            bVar.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(bVar);
            if (WorkDatabase_Impl.this.mCallbacks != null) {
                int size = WorkDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((C0753j.C0755b) WorkDatabase_Impl.this.mCallbacks.get(i)).mo4411c(bVar);
                }
            }
        }

        public void onPostMigrate(C5165b bVar) {
        }

        public void onPreMigrate(C5165b bVar) {
            C0777c.m3540a(bVar);
        }

        /* access modifiers changed from: protected */
        public void validateMigration(C5165b bVar) {
            C5165b bVar2 = bVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C0781g.C0782a("work_spec_id", "TEXT", true, 1));
            hashMap.put("prerequisite_id", new C0781g.C0782a("prerequisite_id", "TEXT", true, 2));
            HashSet hashSet = new HashSet(2);
            List asList = Arrays.asList(new String[]{"work_spec_id"});
            List asList2 = Arrays.asList(new String[]{DeepLinkIntentReceiver.DeepLinksKeys.f3452ID});
            String str = DeepLinkIntentReceiver.DeepLinksKeys.f3452ID;
            hashSet.add(new C0781g.C0783b("WorkSpec", "CASCADE", "CASCADE", asList, asList2));
            hashSet.add(new C0781g.C0783b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{str})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C0781g.C0785d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new C0781g.C0785d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            C0781g gVar = new C0781g("Dependency", hashMap, hashSet, hashSet2);
            C0781g a = C0781g.m3547a(bVar2, "Dependency");
            if (gVar.equals(a)) {
                HashMap hashMap2 = new HashMap(23);
                hashMap2.put(str, new C0781g.C0782a(str, "TEXT", true, 1));
                hashMap2.put("state", new C0781g.C0782a("state", "INTEGER", true, 0));
                hashMap2.put("worker_class_name", new C0781g.C0782a("worker_class_name", "TEXT", true, 0));
                hashMap2.put("input_merger_class_name", new C0781g.C0782a("input_merger_class_name", "TEXT", false, 0));
                hashMap2.put("input", new C0781g.C0782a("input", "BLOB", true, 0));
                hashMap2.put("output", new C0781g.C0782a("output", "BLOB", true, 0));
                hashMap2.put("initial_delay", new C0781g.C0782a("initial_delay", "INTEGER", true, 0));
                hashMap2.put("interval_duration", new C0781g.C0782a("interval_duration", "INTEGER", true, 0));
                hashMap2.put("flex_duration", new C0781g.C0782a("flex_duration", "INTEGER", true, 0));
                hashMap2.put("run_attempt_count", new C0781g.C0782a("run_attempt_count", "INTEGER", true, 0));
                hashMap2.put("backoff_policy", new C0781g.C0782a("backoff_policy", "INTEGER", true, 0));
                hashMap2.put("backoff_delay_duration", new C0781g.C0782a("backoff_delay_duration", "INTEGER", true, 0));
                hashMap2.put("period_start_time", new C0781g.C0782a("period_start_time", "INTEGER", true, 0));
                hashMap2.put("minimum_retention_duration", new C0781g.C0782a("minimum_retention_duration", "INTEGER", true, 0));
                hashMap2.put("schedule_requested_at", new C0781g.C0782a("schedule_requested_at", "INTEGER", true, 0));
                hashMap2.put("required_network_type", new C0781g.C0782a("required_network_type", "INTEGER", false, 0));
                hashMap2.put("requires_charging", new C0781g.C0782a("requires_charging", "INTEGER", true, 0));
                hashMap2.put("requires_device_idle", new C0781g.C0782a("requires_device_idle", "INTEGER", true, 0));
                hashMap2.put("requires_battery_not_low", new C0781g.C0782a("requires_battery_not_low", "INTEGER", true, 0));
                hashMap2.put("requires_storage_not_low", new C0781g.C0782a("requires_storage_not_low", "INTEGER", true, 0));
                hashMap2.put("trigger_content_update_delay", new C0781g.C0782a("trigger_content_update_delay", "INTEGER", true, 0));
                hashMap2.put("trigger_max_content_delay", new C0781g.C0782a("trigger_max_content_delay", "INTEGER", true, 0));
                hashMap2.put("content_uri_triggers", new C0781g.C0782a("content_uri_triggers", "BLOB", false, 0));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new C0781g.C0785d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
                C0781g gVar2 = new C0781g("WorkSpec", hashMap2, hashSet3, hashSet4);
                C0781g a2 = C0781g.m3547a(bVar2, "WorkSpec");
                if (gVar2.equals(a2)) {
                    HashMap hashMap3 = new HashMap(2);
                    hashMap3.put(StoreTabGridRecyclerFragment.BundleCons.TAG, new C0781g.C0782a(StoreTabGridRecyclerFragment.BundleCons.TAG, "TEXT", true, 1));
                    hashMap3.put("work_spec_id", new C0781g.C0782a("work_spec_id", "TEXT", true, 2));
                    HashSet hashSet5 = new HashSet(1);
                    hashSet5.add(new C0781g.C0783b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{str})));
                    HashSet hashSet6 = new HashSet(1);
                    hashSet6.add(new C0781g.C0785d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                    C0781g gVar3 = new C0781g("WorkTag", hashMap3, hashSet5, hashSet6);
                    C0781g a3 = C0781g.m3547a(bVar2, "WorkTag");
                    if (gVar3.equals(a3)) {
                        HashMap hashMap4 = new HashMap(2);
                        hashMap4.put("work_spec_id", new C0781g.C0782a("work_spec_id", "TEXT", true, 1));
                        hashMap4.put("system_id", new C0781g.C0782a("system_id", "INTEGER", true, 0));
                        HashSet hashSet7 = new HashSet(1);
                        hashSet7.add(new C0781g.C0783b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{str})));
                        C0781g gVar4 = new C0781g("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                        C0781g a4 = C0781g.m3547a(bVar2, "SystemIdInfo");
                        if (gVar4.equals(a4)) {
                            HashMap hashMap5 = new HashMap(2);
                            hashMap5.put("name", new C0781g.C0782a("name", "TEXT", true, 1));
                            hashMap5.put("work_spec_id", new C0781g.C0782a("work_spec_id", "TEXT", true, 2));
                            HashSet hashSet8 = new HashSet(1);
                            hashSet8.add(new C0781g.C0783b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{str})));
                            HashSet hashSet9 = new HashSet(1);
                            hashSet9.add(new C0781g.C0785d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                            C0781g gVar5 = new C0781g("WorkName", hashMap5, hashSet8, hashSet9);
                            C0781g a5 = C0781g.m3547a(bVar2, "WorkName");
                            if (!gVar5.equals(a5)) {
                                throw new IllegalStateException("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar5 + "\n Found:\n" + a5);
                            }
                            return;
                        }
                        throw new IllegalStateException("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar4 + "\n Found:\n" + a4);
                    }
                    throw new IllegalStateException("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar3 + "\n Found:\n" + a3);
                }
                throw new IllegalStateException("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar2 + "\n Found:\n" + a2);
            }
            throw new IllegalStateException("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + a);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        C5165b a = super.getOpenHelper().mo4442a();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                a.execSQL("PRAGMA foreign_keys = FALSE");
            } catch (Throwable th) {
                super.endTransaction();
                if (!z) {
                    a.execSQL("PRAGMA foreign_keys = TRUE");
                }
                a.mo17852c("PRAGMA wal_checkpoint(FULL)").close();
                if (!a.inTransaction()) {
                    a.execSQL("VACUUM");
                }
                throw th;
            }
        }
        super.beginTransaction();
        if (z) {
            a.execSQL("PRAGMA defer_foreign_keys = TRUE");
        }
        a.execSQL("DELETE FROM `Dependency`");
        a.execSQL("DELETE FROM `WorkSpec`");
        a.execSQL("DELETE FROM `WorkTag`");
        a.execSQL("DELETE FROM `SystemIdInfo`");
        a.execSQL("DELETE FROM `WorkName`");
        super.setTransactionSuccessful();
        super.endTransaction();
        if (!z) {
            a.execSQL("PRAGMA foreign_keys = TRUE");
        }
        a.mo17852c("PRAGMA wal_checkpoint(FULL)").close();
        if (!a.inTransaction()) {
            a.execSQL("VACUUM");
        }
    }

    /* access modifiers changed from: protected */
    public C0739g createInvalidationTracker() {
        return new C0739g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    /* access modifiers changed from: protected */
    public C5166c createOpenHelper(C0729a aVar) {
        C0759l lVar = new C0759l(aVar, new C0837a(6), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        C5166c.C5168b.C5169a a = C5166c.C5168b.m9607a(aVar.f2732b);
        a.mo17862a(aVar.f2733c);
        a.mo17863a((C5166c.C5167a) lVar);
        return aVar.f2731a.mo4447a(a.mo17864a());
    }

    /* renamed from: c */
    public C0908h mo4733c() {
        C0908h hVar;
        if (this.f3001f != null) {
            return this.f3001f;
        }
        synchronized (this) {
            if (this.f3001f == null) {
                this.f3001f = new C0909i(this);
            }
            hVar = this.f3001f;
        }
        return hVar;
    }

    /* renamed from: d */
    public C0914k mo4734d() {
        C0914k kVar;
        if (this.f2997b != null) {
            return this.f2997b;
        }
        synchronized (this) {
            if (this.f2997b == null) {
                this.f2997b = new C0915l(this);
            }
            kVar = this.f2997b;
        }
        return kVar;
    }

    /* renamed from: e */
    public C0926n mo4735e() {
        C0926n nVar;
        if (this.f2999d != null) {
            return this.f2999d;
        }
        synchronized (this) {
            if (this.f2999d == null) {
                this.f2999d = new C0927o(this);
            }
            nVar = this.f2999d;
        }
        return nVar;
    }

    /* renamed from: a */
    public C0899b mo4731a() {
        C0899b bVar;
        if (this.f2998c != null) {
            return this.f2998c;
        }
        synchronized (this) {
            if (this.f2998c == null) {
                this.f2998c = new C0900c(this);
            }
            bVar = this.f2998c;
        }
        return bVar;
    }

    /* renamed from: b */
    public C0903e mo4732b() {
        C0903e eVar;
        if (this.f3000e != null) {
            return this.f3000e;
        }
        synchronized (this) {
            if (this.f3000e == null) {
                this.f3000e = new C0904f(this);
            }
            eVar = this.f3000e;
        }
        return eVar;
    }
}
