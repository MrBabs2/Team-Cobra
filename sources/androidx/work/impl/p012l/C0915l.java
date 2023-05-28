package androidx.work.impl.p012l;

import android.database.Cursor;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.C0771q;
import androidx.room.p006t.C0776b;
import androidx.room.p006t.C0777c;
import androidx.room.p006t.C0780f;
import androidx.work.C0825c;
import androidx.work.C0829e;
import androidx.work.C0974p;
import androidx.work.impl.p012l.C0911j;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p050l.p103q.p104a.C5173f;

/* renamed from: androidx.work.impl.l.l */
/* compiled from: WorkSpecDao_Impl */
public final class C0915l implements C0914k {

    /* renamed from: a */
    private final C0753j f3222a;

    /* renamed from: b */
    private final C0731c f3223b;

    /* renamed from: c */
    private final C0771q f3224c;

    /* renamed from: d */
    private final C0771q f3225d;

    /* renamed from: e */
    private final C0771q f3226e;

    /* renamed from: f */
    private final C0771q f3227f;

    /* renamed from: g */
    private final C0771q f3228g;

    /* renamed from: h */
    private final C0771q f3229h;

    /* renamed from: i */
    private final C0771q f3230i;

    /* renamed from: androidx.work.impl.l.l$a */
    /* compiled from: WorkSpecDao_Impl */
    class C0916a extends C0731c<C0911j> {
        C0916a(C0915l lVar, C0753j jVar) {
            super(jVar);
        }

        /* renamed from: a */
        public void bind(C5173f fVar, C0911j jVar) {
            String str = jVar.f3204a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            fVar.bindLong(2, (long) C0929p.m4040a(jVar.f3205b));
            String str2 = jVar.f3206c;
            if (str2 == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, str2);
            }
            String str3 = jVar.f3207d;
            if (str3 == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, str3);
            }
            byte[] a = C0829e.m3700a(jVar.f3208e);
            if (a == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindBlob(5, a);
            }
            byte[] a2 = C0829e.m3700a(jVar.f3209f);
            if (a2 == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindBlob(6, a2);
            }
            fVar.bindLong(7, jVar.f3210g);
            fVar.bindLong(8, jVar.f3211h);
            fVar.bindLong(9, jVar.f3212i);
            fVar.bindLong(10, (long) jVar.f3214k);
            fVar.bindLong(11, (long) C0929p.m4038a(jVar.f3215l));
            fVar.bindLong(12, jVar.f3216m);
            fVar.bindLong(13, jVar.f3217n);
            fVar.bindLong(14, jVar.f3218o);
            fVar.bindLong(15, jVar.f3219p);
            C0825c cVar = jVar.f3213j;
            if (cVar != null) {
                fVar.bindLong(16, (long) C0929p.m4039a(cVar.mo4689b()));
                fVar.bindLong(17, cVar.mo4699g() ? 1 : 0);
                fVar.bindLong(18, cVar.mo4700h() ? 1 : 0);
                fVar.bindLong(19, cVar.mo4698f() ? 1 : 0);
                fVar.bindLong(20, cVar.mo4702i() ? 1 : 0);
                fVar.bindLong(21, cVar.mo4692c());
                fVar.bindLong(22, cVar.mo4694d());
                byte[] a3 = C0929p.m4043a(cVar.mo4684a());
                if (a3 == null) {
                    fVar.bindNull(23);
                } else {
                    fVar.bindBlob(23, a3);
                }
            } else {
                fVar.bindNull(16);
                fVar.bindNull(17);
                fVar.bindNull(18);
                fVar.bindNull(19);
                fVar.bindNull(20);
                fVar.bindNull(21);
                fVar.bindNull(22);
                fVar.bindNull(23);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: androidx.work.impl.l.l$b */
    /* compiled from: WorkSpecDao_Impl */
    class C0917b extends C0771q {
        C0917b(C0915l lVar, C0753j jVar) {
            super(jVar);
        }

        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.l.l$c */
    /* compiled from: WorkSpecDao_Impl */
    class C0918c extends C0771q {
        C0918c(C0915l lVar, C0753j jVar) {
            super(jVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.l.l$d */
    /* compiled from: WorkSpecDao_Impl */
    class C0919d extends C0771q {
        C0919d(C0915l lVar, C0753j jVar) {
            super(jVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.l.l$e */
    /* compiled from: WorkSpecDao_Impl */
    class C0920e extends C0771q {
        C0920e(C0915l lVar, C0753j jVar) {
            super(jVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.l.l$f */
    /* compiled from: WorkSpecDao_Impl */
    class C0921f extends C0771q {
        C0921f(C0915l lVar, C0753j jVar) {
            super(jVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.l.l$g */
    /* compiled from: WorkSpecDao_Impl */
    class C0922g extends C0771q {
        C0922g(C0915l lVar, C0753j jVar) {
            super(jVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.l.l$h */
    /* compiled from: WorkSpecDao_Impl */
    class C0923h extends C0771q {
        C0923h(C0915l lVar, C0753j jVar) {
            super(jVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: androidx.work.impl.l.l$i */
    /* compiled from: WorkSpecDao_Impl */
    class C0924i extends C0771q {
        C0924i(C0915l lVar, C0753j jVar) {
            super(jVar);
        }

        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C0915l(C0753j jVar) {
        this.f3222a = jVar;
        this.f3223b = new C0916a(this, jVar);
        this.f3224c = new C0917b(this, jVar);
        this.f3225d = new C0918c(this, jVar);
        this.f3226e = new C0919d(this, jVar);
        this.f3227f = new C0920e(this, jVar);
        this.f3228g = new C0921f(this, jVar);
        this.f3229h = new C0922g(this, jVar);
        this.f3230i = new C0923h(this, jVar);
        new C0924i(this, jVar);
    }

    /* renamed from: a */
    public void mo4895a(C0911j jVar) {
        this.f3222a.assertNotSuspendingTransaction();
        this.f3222a.beginTransaction();
        try {
            this.f3223b.insert(jVar);
            this.f3222a.setTransactionSuccessful();
        } finally {
            this.f3222a.endTransaction();
        }
    }

    /* renamed from: b */
    public void mo4899b(String str, long j) {
        this.f3222a.assertNotSuspendingTransaction();
        C5173f acquire = this.f3226e.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f3222a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f3222a.setTransactionSuccessful();
        } finally {
            this.f3222a.endTransaction();
            this.f3226e.release(acquire);
        }
    }

    /* renamed from: c */
    public C0974p mo4900c(String str) {
        C0762m b = C0762m.m3511b("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            return a.moveToFirst() ? C0929p.m4045c(a.getInt(0)) : null;
        } finally {
            a.close();
            b.mo4431b();
        }
    }

    /* renamed from: d */
    public int mo4902d() {
        this.f3222a.assertNotSuspendingTransaction();
        C5173f acquire = this.f3230i.acquire();
        this.f3222a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f3222a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f3222a.endTransaction();
            this.f3230i.release(acquire);
        }
    }

    public void delete(String str) {
        this.f3222a.assertNotSuspendingTransaction();
        C5173f acquire = this.f3224c.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f3222a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f3222a.setTransactionSuccessful();
        } finally {
            this.f3222a.endTransaction();
            this.f3224c.release(acquire);
        }
    }

    /* renamed from: e */
    public int mo4905e(String str) {
        this.f3222a.assertNotSuspendingTransaction();
        C5173f acquire = this.f3228g.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f3222a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f3222a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f3222a.endTransaction();
            this.f3228g.release(acquire);
        }
    }

    /* renamed from: f */
    public List<String> mo4906f(String str) {
        C0762m b = C0762m.m3511b("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arrayList.add(a.getString(0));
            }
            return arrayList;
        } finally {
            a.close();
            b.mo4431b();
        }
    }

    /* renamed from: g */
    public List<C0829e> mo4907g(String str) {
        C0762m b = C0762m.m3511b("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arrayList.add(C0829e.m3707b(a.getBlob(0)));
            }
            return arrayList;
        } finally {
            a.close();
            b.mo4431b();
        }
    }

    /* renamed from: h */
    public int mo4908h(String str) {
        this.f3222a.assertNotSuspendingTransaction();
        C5173f acquire = this.f3227f.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f3222a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f3222a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f3222a.endTransaction();
            this.f3227f.release(acquire);
        }
    }

    /* renamed from: a */
    public void mo4896a(String str, C0829e eVar) {
        this.f3222a.assertNotSuspendingTransaction();
        C5173f acquire = this.f3225d.acquire();
        byte[] a = C0829e.m3700a(eVar);
        if (a == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindBlob(1, a);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f3222a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f3222a.setTransactionSuccessful();
        } finally {
            this.f3222a.endTransaction();
            this.f3225d.release(acquire);
        }
    }

    /* renamed from: d */
    public C0911j mo4903d(String str) {
        C0762m mVar;
        C0911j jVar;
        String str2 = str;
        C0762m b = C0762m.m3511b("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str2);
        }
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            int a2 = C0776b.m3535a(a, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
            int a3 = C0776b.m3535a(a, "state");
            int a4 = C0776b.m3535a(a, "worker_class_name");
            int a5 = C0776b.m3535a(a, "input_merger_class_name");
            int a6 = C0776b.m3535a(a, "input");
            int a7 = C0776b.m3535a(a, "output");
            int a8 = C0776b.m3535a(a, "initial_delay");
            int a9 = C0776b.m3535a(a, "interval_duration");
            int a10 = C0776b.m3535a(a, "flex_duration");
            int a11 = C0776b.m3535a(a, "run_attempt_count");
            int a12 = C0776b.m3535a(a, "backoff_policy");
            int a13 = C0776b.m3535a(a, "backoff_delay_duration");
            int a14 = C0776b.m3535a(a, "period_start_time");
            int a15 = C0776b.m3535a(a, "minimum_retention_duration");
            mVar = b;
            try {
                int a16 = C0776b.m3535a(a, "schedule_requested_at");
                int a17 = C0776b.m3535a(a, "required_network_type");
                int i = a15;
                int a18 = C0776b.m3535a(a, "requires_charging");
                int i2 = a14;
                int a19 = C0776b.m3535a(a, "requires_device_idle");
                int i3 = a13;
                int a20 = C0776b.m3535a(a, "requires_battery_not_low");
                int i4 = a12;
                int a21 = C0776b.m3535a(a, "requires_storage_not_low");
                int i5 = a11;
                int a22 = C0776b.m3535a(a, "trigger_content_update_delay");
                int i6 = a10;
                int a23 = C0776b.m3535a(a, "trigger_max_content_delay");
                int i7 = a9;
                int a24 = C0776b.m3535a(a, "content_uri_triggers");
                if (a.moveToFirst()) {
                    String string = a.getString(a2);
                    String string2 = a.getString(a4);
                    int i8 = a8;
                    C0825c cVar = new C0825c();
                    cVar.mo4687a(C0929p.m4044b(a.getInt(a17)));
                    cVar.mo4691b(a.getInt(a18) != 0);
                    cVar.mo4693c(a.getInt(a19) != 0);
                    cVar.mo4688a(a.getInt(a20) != 0);
                    cVar.mo4695d(a.getInt(a21) != 0);
                    cVar.mo4685a(a.getLong(a22));
                    cVar.mo4690b(a.getLong(a23));
                    cVar.mo4686a(C0929p.m4042a(a.getBlob(a24)));
                    jVar = new C0911j(string, string2);
                    jVar.f3205b = C0929p.m4045c(a.getInt(a3));
                    jVar.f3207d = a.getString(a5);
                    jVar.f3208e = C0829e.m3707b(a.getBlob(a6));
                    jVar.f3209f = C0829e.m3707b(a.getBlob(a7));
                    jVar.f3210g = a.getLong(i8);
                    jVar.f3211h = a.getLong(i7);
                    jVar.f3212i = a.getLong(i6);
                    jVar.f3214k = a.getInt(i5);
                    jVar.f3215l = C0929p.m4041a(a.getInt(i4));
                    jVar.f3216m = a.getLong(i3);
                    jVar.f3217n = a.getLong(i2);
                    jVar.f3218o = a.getLong(i);
                    jVar.f3219p = a.getLong(a16);
                    jVar.f3213j = cVar;
                } else {
                    jVar = null;
                }
                a.close();
                mVar.mo4431b();
                return jVar;
            } catch (Throwable th) {
                th = th;
                a.close();
                mVar.mo4431b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = b;
            a.close();
            mVar.mo4431b();
            throw th;
        }
    }

    /* renamed from: b */
    public List<String> mo4898b(String str) {
        C0762m b = C0762m.m3511b("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arrayList.add(a.getString(0));
            }
            return arrayList;
        } finally {
            a.close();
            b.mo4431b();
        }
    }

    /* renamed from: c */
    public List<String> mo4901c() {
        C0762m b = C0762m.m3511b("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arrayList.add(a.getString(0));
            }
            return arrayList;
        } finally {
            a.close();
            b.mo4431b();
        }
    }

    /* renamed from: a */
    public int mo4891a(String str, long j) {
        this.f3222a.assertNotSuspendingTransaction();
        C5173f acquire = this.f3229h.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f3222a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f3222a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f3222a.endTransaction();
            this.f3229h.release(acquire);
        }
    }

    /* renamed from: b */
    public List<C0911j> mo4897b() {
        C0762m mVar;
        C0762m b = C0762m.m3511b("SELECT * FROM workspec WHERE state=1", 0);
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            int a2 = C0776b.m3535a(a, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
            int a3 = C0776b.m3535a(a, "state");
            int a4 = C0776b.m3535a(a, "worker_class_name");
            int a5 = C0776b.m3535a(a, "input_merger_class_name");
            int a6 = C0776b.m3535a(a, "input");
            int a7 = C0776b.m3535a(a, "output");
            int a8 = C0776b.m3535a(a, "initial_delay");
            int a9 = C0776b.m3535a(a, "interval_duration");
            int a10 = C0776b.m3535a(a, "flex_duration");
            int a11 = C0776b.m3535a(a, "run_attempt_count");
            int a12 = C0776b.m3535a(a, "backoff_policy");
            int a13 = C0776b.m3535a(a, "backoff_delay_duration");
            int a14 = C0776b.m3535a(a, "period_start_time");
            int a15 = C0776b.m3535a(a, "minimum_retention_duration");
            mVar = b;
            try {
                int a16 = C0776b.m3535a(a, "schedule_requested_at");
                int a17 = C0776b.m3535a(a, "required_network_type");
                int i = a15;
                int a18 = C0776b.m3535a(a, "requires_charging");
                int i2 = a14;
                int a19 = C0776b.m3535a(a, "requires_device_idle");
                int i3 = a13;
                int a20 = C0776b.m3535a(a, "requires_battery_not_low");
                int i4 = a12;
                int a21 = C0776b.m3535a(a, "requires_storage_not_low");
                int i5 = a11;
                int a22 = C0776b.m3535a(a, "trigger_content_update_delay");
                int i6 = a10;
                int a23 = C0776b.m3535a(a, "trigger_max_content_delay");
                int i7 = a9;
                int a24 = C0776b.m3535a(a, "content_uri_triggers");
                int i8 = a8;
                int i9 = a7;
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string = a.getString(a2);
                    int i10 = a2;
                    String string2 = a.getString(a4);
                    int i11 = a4;
                    C0825c cVar = new C0825c();
                    int i12 = a17;
                    cVar.mo4687a(C0929p.m4044b(a.getInt(a17)));
                    cVar.mo4691b(a.getInt(a18) != 0);
                    cVar.mo4693c(a.getInt(a19) != 0);
                    cVar.mo4688a(a.getInt(a20) != 0);
                    cVar.mo4695d(a.getInt(a21) != 0);
                    int i13 = a19;
                    int i14 = a18;
                    cVar.mo4685a(a.getLong(a22));
                    cVar.mo4690b(a.getLong(a23));
                    cVar.mo4686a(C0929p.m4042a(a.getBlob(a24)));
                    C0911j jVar = new C0911j(string, string2);
                    jVar.f3205b = C0929p.m4045c(a.getInt(a3));
                    jVar.f3207d = a.getString(a5);
                    jVar.f3208e = C0829e.m3707b(a.getBlob(a6));
                    int i15 = i9;
                    jVar.f3209f = C0829e.m3707b(a.getBlob(i15));
                    i9 = i15;
                    int i16 = i14;
                    int i17 = i8;
                    jVar.f3210g = a.getLong(i17);
                    i8 = i17;
                    int i18 = i7;
                    jVar.f3211h = a.getLong(i18);
                    i7 = i18;
                    int i19 = i6;
                    jVar.f3212i = a.getLong(i19);
                    int i20 = i5;
                    jVar.f3214k = a.getInt(i20);
                    int i21 = i4;
                    i5 = i20;
                    jVar.f3215l = C0929p.m4041a(a.getInt(i21));
                    i6 = i19;
                    int i22 = i3;
                    int i23 = a3;
                    jVar.f3216m = a.getLong(i22);
                    int i24 = i22;
                    i4 = i21;
                    int i25 = i2;
                    jVar.f3217n = a.getLong(i25);
                    i2 = i25;
                    int i26 = i;
                    jVar.f3218o = a.getLong(i26);
                    i = i26;
                    int i27 = i24;
                    int i28 = a16;
                    jVar.f3219p = a.getLong(i28);
                    jVar.f3213j = cVar;
                    arrayList.add(jVar);
                    a16 = i28;
                    a18 = i16;
                    a2 = i10;
                    a4 = i11;
                    a19 = i13;
                    a17 = i12;
                    int i29 = i23;
                    i3 = i27;
                    a3 = i29;
                }
                a.close();
                mVar.mo4431b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a.close();
                mVar.mo4431b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = b;
            a.close();
            mVar.mo4431b();
            throw th;
        }
    }

    /* renamed from: a */
    public List<C0911j.C0913b> mo4894a(String str) {
        C0762m b = C0762m.m3511b("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            int a2 = C0776b.m3535a(a, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
            int a3 = C0776b.m3535a(a, "state");
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                C0911j.C0913b bVar = new C0911j.C0913b();
                bVar.f3220a = a.getString(a2);
                bVar.f3221b = C0929p.m4045c(a.getInt(a3));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            a.close();
            b.mo4431b();
        }
    }

    /* renamed from: a */
    public List<C0911j> mo4893a(int i) {
        C0762m mVar;
        C0762m b = C0762m.m3511b("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        b.bindLong(1, (long) i);
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            int a2 = C0776b.m3535a(a, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
            int a3 = C0776b.m3535a(a, "state");
            int a4 = C0776b.m3535a(a, "worker_class_name");
            int a5 = C0776b.m3535a(a, "input_merger_class_name");
            int a6 = C0776b.m3535a(a, "input");
            int a7 = C0776b.m3535a(a, "output");
            int a8 = C0776b.m3535a(a, "initial_delay");
            int a9 = C0776b.m3535a(a, "interval_duration");
            int a10 = C0776b.m3535a(a, "flex_duration");
            int a11 = C0776b.m3535a(a, "run_attempt_count");
            int a12 = C0776b.m3535a(a, "backoff_policy");
            int a13 = C0776b.m3535a(a, "backoff_delay_duration");
            int a14 = C0776b.m3535a(a, "period_start_time");
            int a15 = C0776b.m3535a(a, "minimum_retention_duration");
            mVar = b;
            try {
                int a16 = C0776b.m3535a(a, "schedule_requested_at");
                int a17 = C0776b.m3535a(a, "required_network_type");
                int i2 = a15;
                int a18 = C0776b.m3535a(a, "requires_charging");
                int i3 = a14;
                int a19 = C0776b.m3535a(a, "requires_device_idle");
                int i4 = a13;
                int a20 = C0776b.m3535a(a, "requires_battery_not_low");
                int i5 = a12;
                int a21 = C0776b.m3535a(a, "requires_storage_not_low");
                int i6 = a11;
                int a22 = C0776b.m3535a(a, "trigger_content_update_delay");
                int i7 = a10;
                int a23 = C0776b.m3535a(a, "trigger_max_content_delay");
                int i8 = a9;
                int a24 = C0776b.m3535a(a, "content_uri_triggers");
                int i9 = a8;
                int i10 = a7;
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string = a.getString(a2);
                    int i11 = a2;
                    String string2 = a.getString(a4);
                    int i12 = a4;
                    C0825c cVar = new C0825c();
                    int i13 = a17;
                    cVar.mo4687a(C0929p.m4044b(a.getInt(a17)));
                    cVar.mo4691b(a.getInt(a18) != 0);
                    cVar.mo4693c(a.getInt(a19) != 0);
                    cVar.mo4688a(a.getInt(a20) != 0);
                    cVar.mo4695d(a.getInt(a21) != 0);
                    int i14 = a20;
                    int i15 = a18;
                    cVar.mo4685a(a.getLong(a22));
                    cVar.mo4690b(a.getLong(a23));
                    cVar.mo4686a(C0929p.m4042a(a.getBlob(a24)));
                    C0911j jVar = new C0911j(string, string2);
                    jVar.f3205b = C0929p.m4045c(a.getInt(a3));
                    jVar.f3207d = a.getString(a5);
                    jVar.f3208e = C0829e.m3707b(a.getBlob(a6));
                    int i16 = i10;
                    jVar.f3209f = C0829e.m3707b(a.getBlob(i16));
                    i10 = i16;
                    int i17 = i15;
                    int i18 = i9;
                    jVar.f3210g = a.getLong(i18);
                    i9 = i18;
                    int i19 = i8;
                    jVar.f3211h = a.getLong(i19);
                    i8 = i19;
                    int i20 = a19;
                    int i21 = i7;
                    jVar.f3212i = a.getLong(i21);
                    int i22 = i6;
                    jVar.f3214k = a.getInt(i22);
                    int i23 = i5;
                    i6 = i22;
                    jVar.f3215l = C0929p.m4041a(a.getInt(i23));
                    i7 = i21;
                    int i24 = i4;
                    int i25 = i20;
                    jVar.f3216m = a.getLong(i24);
                    int i26 = i24;
                    i5 = i23;
                    int i27 = i3;
                    jVar.f3217n = a.getLong(i27);
                    i3 = i27;
                    int i28 = i2;
                    jVar.f3218o = a.getLong(i28);
                    i2 = i28;
                    int i29 = i26;
                    int i30 = a16;
                    jVar.f3219p = a.getLong(i30);
                    jVar.f3213j = cVar;
                    arrayList.add(jVar);
                    a16 = i30;
                    a18 = i17;
                    a19 = i25;
                    a4 = i12;
                    a20 = i14;
                    a17 = i13;
                    i4 = i29;
                    a2 = i11;
                }
                a.close();
                mVar.mo4431b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a.close();
                mVar.mo4431b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = b;
            a.close();
            mVar.mo4431b();
            throw th;
        }
    }

    /* renamed from: a */
    public List<C0911j> mo4892a() {
        C0762m mVar;
        C0762m b = C0762m.m3511b("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f3222a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3222a, b, false);
        try {
            int a2 = C0776b.m3535a(a, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
            int a3 = C0776b.m3535a(a, "state");
            int a4 = C0776b.m3535a(a, "worker_class_name");
            int a5 = C0776b.m3535a(a, "input_merger_class_name");
            int a6 = C0776b.m3535a(a, "input");
            int a7 = C0776b.m3535a(a, "output");
            int a8 = C0776b.m3535a(a, "initial_delay");
            int a9 = C0776b.m3535a(a, "interval_duration");
            int a10 = C0776b.m3535a(a, "flex_duration");
            int a11 = C0776b.m3535a(a, "run_attempt_count");
            int a12 = C0776b.m3535a(a, "backoff_policy");
            int a13 = C0776b.m3535a(a, "backoff_delay_duration");
            int a14 = C0776b.m3535a(a, "period_start_time");
            int a15 = C0776b.m3535a(a, "minimum_retention_duration");
            mVar = b;
            try {
                int a16 = C0776b.m3535a(a, "schedule_requested_at");
                int a17 = C0776b.m3535a(a, "required_network_type");
                int i = a15;
                int a18 = C0776b.m3535a(a, "requires_charging");
                int i2 = a14;
                int a19 = C0776b.m3535a(a, "requires_device_idle");
                int i3 = a13;
                int a20 = C0776b.m3535a(a, "requires_battery_not_low");
                int i4 = a12;
                int a21 = C0776b.m3535a(a, "requires_storage_not_low");
                int i5 = a11;
                int a22 = C0776b.m3535a(a, "trigger_content_update_delay");
                int i6 = a10;
                int a23 = C0776b.m3535a(a, "trigger_max_content_delay");
                int i7 = a9;
                int a24 = C0776b.m3535a(a, "content_uri_triggers");
                int i8 = a8;
                int i9 = a7;
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string = a.getString(a2);
                    int i10 = a2;
                    String string2 = a.getString(a4);
                    int i11 = a4;
                    C0825c cVar = new C0825c();
                    int i12 = a17;
                    cVar.mo4687a(C0929p.m4044b(a.getInt(a17)));
                    cVar.mo4691b(a.getInt(a18) != 0);
                    cVar.mo4693c(a.getInt(a19) != 0);
                    cVar.mo4688a(a.getInt(a20) != 0);
                    cVar.mo4695d(a.getInt(a21) != 0);
                    int i13 = a19;
                    int i14 = a18;
                    cVar.mo4685a(a.getLong(a22));
                    cVar.mo4690b(a.getLong(a23));
                    cVar.mo4686a(C0929p.m4042a(a.getBlob(a24)));
                    C0911j jVar = new C0911j(string, string2);
                    jVar.f3205b = C0929p.m4045c(a.getInt(a3));
                    jVar.f3207d = a.getString(a5);
                    jVar.f3208e = C0829e.m3707b(a.getBlob(a6));
                    int i15 = i9;
                    jVar.f3209f = C0829e.m3707b(a.getBlob(i15));
                    i9 = i15;
                    int i16 = i14;
                    int i17 = i8;
                    jVar.f3210g = a.getLong(i17);
                    i8 = i17;
                    int i18 = i7;
                    jVar.f3211h = a.getLong(i18);
                    i7 = i18;
                    int i19 = i6;
                    jVar.f3212i = a.getLong(i19);
                    int i20 = i5;
                    jVar.f3214k = a.getInt(i20);
                    int i21 = i4;
                    i5 = i20;
                    jVar.f3215l = C0929p.m4041a(a.getInt(i21));
                    i6 = i19;
                    int i22 = i3;
                    int i23 = a3;
                    jVar.f3216m = a.getLong(i22);
                    int i24 = i22;
                    i4 = i21;
                    int i25 = i2;
                    jVar.f3217n = a.getLong(i25);
                    i2 = i25;
                    int i26 = i;
                    jVar.f3218o = a.getLong(i26);
                    i = i26;
                    int i27 = i24;
                    int i28 = a16;
                    jVar.f3219p = a.getLong(i28);
                    jVar.f3213j = cVar;
                    arrayList.add(jVar);
                    a16 = i28;
                    a18 = i16;
                    a2 = i10;
                    a4 = i11;
                    a19 = i13;
                    a17 = i12;
                    int i29 = i23;
                    i3 = i27;
                    a3 = i29;
                }
                a.close();
                mVar.mo4431b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a.close();
                mVar.mo4431b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = b;
            a.close();
            mVar.mo4431b();
            throw th;
        }
    }

    /* renamed from: a */
    public int mo4890a(C0974p pVar, String... strArr) {
        this.f3222a.assertNotSuspendingTransaction();
        StringBuilder a = C0780f.m3544a();
        a.append("UPDATE workspec SET state=");
        a.append("?");
        a.append(" WHERE id IN (");
        C0780f.m3545a(a, strArr.length);
        a.append(")");
        C5173f compileStatement = this.f3222a.compileStatement(a.toString());
        compileStatement.bindLong(1, (long) C0929p.m4040a(pVar));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, str);
            }
            i++;
        }
        this.f3222a.beginTransaction();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            this.f3222a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f3222a.endTransaction();
        }
    }
}
