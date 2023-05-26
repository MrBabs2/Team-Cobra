package androidx.work.impl.p012l;

import android.database.Cursor;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.p006t.C0777c;
import java.util.ArrayList;
import java.util.List;
import p050l.p103q.p104a.C5173f;

/* renamed from: androidx.work.impl.l.c */
/* compiled from: DependencyDao_Impl */
public final class C0900c implements C0899b {

    /* renamed from: a */
    private final C0753j f3192a;

    /* renamed from: b */
    private final C0731c f3193b;

    /* renamed from: androidx.work.impl.l.c$a */
    /* compiled from: DependencyDao_Impl */
    class C0901a extends C0731c<C0898a> {
        C0901a(C0900c cVar, C0753j jVar) {
            super(jVar);
        }

        /* renamed from: a */
        public void bind(C5173f fVar, C0898a aVar) {
            String str = aVar.f3190a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = aVar.f3191b;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public C0900c(C0753j jVar) {
        this.f3192a = jVar;
        this.f3193b = new C0901a(this, jVar);
    }

    /* renamed from: a */
    public void mo4867a(C0898a aVar) {
        this.f3192a.assertNotSuspendingTransaction();
        this.f3192a.beginTransaction();
        try {
            this.f3193b.insert(aVar);
            this.f3192a.setTransactionSuccessful();
        } finally {
            this.f3192a.endTransaction();
        }
    }

    /* renamed from: b */
    public boolean mo4868b(String str) {
        boolean z = true;
        C0762m b = C0762m.m3511b("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3192a.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor a = C0777c.m3538a(this.f3192a, b, false);
        try {
            if (a.moveToFirst()) {
                if (a.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            a.close();
            b.mo4431b();
        }
    }

    /* renamed from: c */
    public boolean mo4869c(String str) {
        boolean z = true;
        C0762m b = C0762m.m3511b("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3192a.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor a = C0777c.m3538a(this.f3192a, b, false);
        try {
            if (a.moveToFirst()) {
                if (a.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            a.close();
            b.mo4431b();
        }
    }

    /* renamed from: a */
    public List<String> mo4866a(String str) {
        C0762m b = C0762m.m3511b("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3192a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3192a, b, false);
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
}
