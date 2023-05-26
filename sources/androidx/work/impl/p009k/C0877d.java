package androidx.work.impl.p009k;

import android.content.Context;
import androidx.work.C0834i;
import androidx.work.impl.p009k.p010e.C0878a;
import androidx.work.impl.p009k.p010e.C0879b;
import androidx.work.impl.p009k.p010e.C0880c;
import androidx.work.impl.p009k.p010e.C0882d;
import androidx.work.impl.p009k.p010e.C0883e;
import androidx.work.impl.p009k.p010e.C0884f;
import androidx.work.impl.p009k.p010e.C0885g;
import androidx.work.impl.p009k.p010e.C0886h;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.utils.p014k.C0956a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.k.d */
/* compiled from: WorkConstraintsTracker */
public class C0877d implements C0880c.C0881a {

    /* renamed from: d */
    private static final String f3155d = C0834i.m3721a("WorkConstraintsTracker");

    /* renamed from: a */
    private final C0876c f3156a;

    /* renamed from: b */
    private final C0880c<?>[] f3157b;

    /* renamed from: c */
    private final Object f3158c = new Object();

    public C0877d(Context context, C0956a aVar, C0876c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3156a = cVar;
        this.f3157b = new C0880c[]{new C0878a(applicationContext, aVar), new C0879b(applicationContext, aVar), new C0886h(applicationContext, aVar), new C0882d(applicationContext, aVar), new C0885g(applicationContext, aVar), new C0884f(applicationContext, aVar), new C0883e(applicationContext, aVar)};
    }

    /* renamed from: a */
    public void mo4830a() {
        synchronized (this.f3158c) {
            for (C0880c<?> a : this.f3157b) {
                a.mo4839a();
            }
        }
    }

    /* renamed from: b */
    public void mo4833b(List<String> list) {
        synchronized (this.f3158c) {
            if (this.f3156a != null) {
                this.f3156a.mo4748a(list);
            }
        }
    }

    /* renamed from: c */
    public void mo4834c(List<C0911j> list) {
        synchronized (this.f3158c) {
            for (C0880c<?> a : this.f3157b) {
                a.mo4840a((C0880c.C0881a) null);
            }
            for (C0880c<?> a2 : this.f3157b) {
                a2.mo4841a(list);
            }
            for (C0880c<?> a3 : this.f3157b) {
                a3.mo4840a((C0880c.C0881a) this);
            }
        }
    }

    /* renamed from: a */
    public boolean mo4832a(String str) {
        synchronized (this.f3158c) {
            for (C0880c<?> cVar : this.f3157b) {
                if (cVar.mo4842a(str)) {
                    C0834i.m3720a().mo4726a(f3155d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo4831a(List<String> list) {
        synchronized (this.f3158c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (mo4832a(next)) {
                    C0834i.m3720a().mo4726a(f3155d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            if (this.f3156a != null) {
                this.f3156a.mo4749b(arrayList);
            }
        }
    }
}
