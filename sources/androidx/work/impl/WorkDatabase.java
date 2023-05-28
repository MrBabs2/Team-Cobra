package androidx.work.impl;

import android.content.Context;
import androidx.room.C0752i;
import androidx.room.C0753j;
import androidx.work.impl.C0863g;
import androidx.work.impl.p012l.C0899b;
import androidx.work.impl.p012l.C0903e;
import androidx.work.impl.p012l.C0908h;
import androidx.work.impl.p012l.C0914k;
import androidx.work.impl.p012l.C0926n;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p050l.p103q.p104a.C5165b;

public abstract class WorkDatabase extends C0753j {

    /* renamed from: a */
    private static final long f2996a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    static class C0836a extends C0753j.C0755b {
        C0836a() {
        }

        /* renamed from: c */
        public void mo4411c(C5165b bVar) {
            super.mo4411c(bVar);
            bVar.beginTransaction();
            try {
                bVar.execSQL(WorkDatabase.m3736h());
                bVar.setTransactionSuccessful();
            } finally {
                bVar.endTransaction();
            }
        }
    }

    /* renamed from: a */
    public static WorkDatabase m3733a(Context context, Executor executor, boolean z) {
        C0753j.C0754a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = C0752i.m3481a(context, cls);
            aVar.mo4402a();
        } else {
            C0753j.C0754a<WorkDatabase> a = C0752i.m3482a(context, cls, "androidx.work.workdb");
            a.mo4404a(executor);
            aVar = a;
        }
        aVar.mo4403a(m3734f());
        aVar.mo4406a(C0863g.f3097a);
        aVar.mo4406a(new C0863g.C0867d(context, 2, 3));
        aVar.mo4406a(C0863g.f3098b);
        aVar.mo4406a(C0863g.f3099c);
        aVar.mo4406a(new C0863g.C0867d(context, 5, 6));
        aVar.mo4408c();
        return aVar.mo4407b();
    }

    /* renamed from: f */
    static C0753j.C0755b m3734f() {
        return new C0836a();
    }

    /* renamed from: g */
    static long m3735g() {
        return System.currentTimeMillis() - f2996a;
    }

    /* renamed from: h */
    static String m3736h() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m3735g() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: a */
    public abstract C0899b mo4731a();

    /* renamed from: b */
    public abstract C0903e mo4732b();

    /* renamed from: c */
    public abstract C0908h mo4733c();

    /* renamed from: d */
    public abstract C0914k mo4734d();

    /* renamed from: e */
    public abstract C0926n mo4735e();
}
