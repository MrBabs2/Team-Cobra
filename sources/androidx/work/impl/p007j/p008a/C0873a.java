package androidx.work.impl.p007j.p008a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C0834i;
import androidx.work.C0974p;
import androidx.work.impl.C0838a;
import androidx.work.impl.C0860d;
import androidx.work.impl.C0868h;
import androidx.work.impl.p009k.C0876c;
import androidx.work.impl.p009k.C0877d;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.utils.p014k.C0956a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.j.a.a */
/* compiled from: GreedyScheduler */
public class C0873a implements C0860d, C0876c, C0838a {

    /* renamed from: k */
    private static final String f3145k = C0834i.m3721a("GreedyScheduler");

    /* renamed from: f */
    private C0868h f3146f;

    /* renamed from: g */
    private C0877d f3147g;

    /* renamed from: h */
    private List<C0911j> f3148h = new ArrayList();

    /* renamed from: i */
    private boolean f3149i;

    /* renamed from: j */
    private final Object f3150j;

    public C0873a(Context context, C0956a aVar, C0868h hVar) {
        this.f3146f = hVar;
        this.f3147g = new C0877d(context, aVar, this);
        this.f3150j = new Object();
    }

    /* renamed from: a */
    public void mo4762a(C0911j... jVarArr) {
        m3887a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C0911j jVar : jVarArr) {
            if (jVar.f3205b == C0974p.ENQUEUED && !jVar.mo4884d() && jVar.f3210g == 0 && !jVar.mo4883c()) {
                if (!jVar.mo4882b()) {
                    C0834i.m3720a().mo4726a(f3145k, String.format("Starting work for %s", new Object[]{jVar.f3204a}), new Throwable[0]);
                    this.f3146f.mo4804c(jVar.f3204a);
                } else if (Build.VERSION.SDK_INT < 24 || !jVar.f3213j.mo4696e()) {
                    arrayList.add(jVar);
                    arrayList2.add(jVar.f3204a);
                }
            }
        }
        synchronized (this.f3150j) {
            if (!arrayList.isEmpty()) {
                C0834i.m3720a().mo4726a(f3145k, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)}), new Throwable[0]);
                this.f3148h.addAll(arrayList);
                this.f3147g.mo4834c(this.f3148h);
            }
        }
    }

    /* renamed from: b */
    public void mo4749b(List<String> list) {
        for (String next : list) {
            C0834i.m3720a().mo4726a(f3145k, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f3146f.mo4804c(next);
        }
    }

    public void cancel(String str) {
        m3887a();
        C0834i.m3720a().mo4726a(f3145k, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        this.f3146f.mo4806d(str);
    }

    /* renamed from: a */
    public void mo4748a(List<String> list) {
        for (String next : list) {
            C0834i.m3720a().mo4726a(f3145k, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f3146f.mo4806d(next);
        }
    }

    /* renamed from: a */
    public void mo4736a(String str, boolean z) {
        m3888a(str);
    }

    /* renamed from: a */
    private void m3888a(String str) {
        synchronized (this.f3150j) {
            int size = this.f3148h.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f3148h.get(i).f3204a.equals(str)) {
                    C0834i.m3720a().mo4726a(f3145k, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f3148h.remove(i);
                    this.f3147g.mo4834c(this.f3148h);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private void m3887a() {
        if (!this.f3149i) {
            this.f3146f.mo4805d().mo4775a((C0838a) this);
            this.f3149i = true;
        }
    }
}
