package androidx.work.impl.p012l;

import androidx.room.C0731c;
import androidx.room.C0753j;
import p050l.p103q.p104a.C5173f;

/* renamed from: androidx.work.impl.l.i */
/* compiled from: WorkNameDao_Impl */
public final class C0909i implements C0908h {

    /* renamed from: a */
    private final C0753j f3201a;

    /* renamed from: b */
    private final C0731c f3202b;

    /* renamed from: androidx.work.impl.l.i$a */
    /* compiled from: WorkNameDao_Impl */
    class C0910a extends C0731c<C0907g> {
        C0910a(C0909i iVar, C0753j jVar) {
            super(jVar);
        }

        /* renamed from: a */
        public void bind(C5173f fVar, C0907g gVar) {
            String str = gVar.f3199a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = gVar.f3200b;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C0909i(C0753j jVar) {
        this.f3201a = jVar;
        this.f3202b = new C0910a(this, jVar);
    }

    /* renamed from: a */
    public void mo4877a(C0907g gVar) {
        this.f3201a.assertNotSuspendingTransaction();
        this.f3201a.beginTransaction();
        try {
            this.f3202b.insert(gVar);
            this.f3201a.setTransactionSuccessful();
        } finally {
            this.f3201a.endTransaction();
        }
    }
}
