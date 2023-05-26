package androidx.work.impl.p012l;

import android.database.Cursor;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.C0771q;
import androidx.room.p006t.C0776b;
import androidx.room.p006t.C0777c;
import p050l.p103q.p104a.C5173f;

/* renamed from: androidx.work.impl.l.f */
/* compiled from: SystemIdInfoDao_Impl */
public final class C0904f implements C0903e {

    /* renamed from: a */
    private final C0753j f3196a;

    /* renamed from: b */
    private final C0731c f3197b;

    /* renamed from: c */
    private final C0771q f3198c;

    /* renamed from: androidx.work.impl.l.f$a */
    /* compiled from: SystemIdInfoDao_Impl */
    class C0905a extends C0731c<C0902d> {
        C0905a(C0904f fVar, C0753j jVar) {
            super(jVar);
        }

        /* renamed from: a */
        public void bind(C5173f fVar, C0902d dVar) {
            String str = dVar.f3194a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            fVar.bindLong(2, (long) dVar.f3195b);
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* renamed from: androidx.work.impl.l.f$b */
    /* compiled from: SystemIdInfoDao_Impl */
    class C0906b extends C0771q {
        C0906b(C0904f fVar, C0753j jVar) {
            super(jVar);
        }

        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C0904f(C0753j jVar) {
        this.f3196a = jVar;
        this.f3197b = new C0905a(this, jVar);
        this.f3198c = new C0906b(this, jVar);
    }

    /* renamed from: a */
    public void mo4874a(C0902d dVar) {
        this.f3196a.assertNotSuspendingTransaction();
        this.f3196a.beginTransaction();
        try {
            this.f3197b.insert(dVar);
            this.f3196a.setTransactionSuccessful();
        } finally {
            this.f3196a.endTransaction();
        }
    }

    /* renamed from: b */
    public void mo4875b(String str) {
        this.f3196a.assertNotSuspendingTransaction();
        C5173f acquire = this.f3198c.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f3196a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f3196a.setTransactionSuccessful();
        } finally {
            this.f3196a.endTransaction();
            this.f3198c.release(acquire);
        }
    }

    /* renamed from: a */
    public C0902d mo4873a(String str) {
        C0762m b = C0762m.m3511b("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3196a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3196a, b, false);
        try {
            return a.moveToFirst() ? new C0902d(a.getString(C0776b.m3535a(a, "work_spec_id")), a.getInt(C0776b.m3535a(a, "system_id"))) : null;
        } finally {
            a.close();
            b.mo4431b();
        }
    }
}
