package androidx.work.impl.p012l;

import android.database.Cursor;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.p006t.C0777c;
import java.util.ArrayList;
import java.util.List;
import p050l.p103q.p104a.C5173f;

/* renamed from: androidx.work.impl.l.o */
/* compiled from: WorkTagDao_Impl */
public final class C0927o implements C0926n {

    /* renamed from: a */
    private final C0753j f3233a;

    /* renamed from: b */
    private final C0731c f3234b;

    /* renamed from: androidx.work.impl.l.o$a */
    /* compiled from: WorkTagDao_Impl */
    class C0928a extends C0731c<C0925m> {
        C0928a(C0927o oVar, C0753j jVar) {
            super(jVar);
        }

        /* renamed from: a */
        public void bind(C5173f fVar, C0925m mVar) {
            String str = mVar.f3231a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = mVar.f3232b;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C0927o(C0753j jVar) {
        this.f3233a = jVar;
        this.f3234b = new C0928a(this, jVar);
    }

    /* renamed from: a */
    public void mo4911a(C0925m mVar) {
        this.f3233a.assertNotSuspendingTransaction();
        this.f3233a.beginTransaction();
        try {
            this.f3234b.insert(mVar);
            this.f3233a.setTransactionSuccessful();
        } finally {
            this.f3233a.endTransaction();
        }
    }

    /* renamed from: a */
    public List<String> mo4910a(String str) {
        C0762m b = C0762m.m3511b("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        this.f3233a.assertNotSuspendingTransaction();
        Cursor a = C0777c.m3538a(this.f3233a, b, false);
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
