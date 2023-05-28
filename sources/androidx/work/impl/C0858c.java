package androidx.work.impl;

import android.content.Context;
import androidx.work.C0822b;
import androidx.work.C0834i;
import androidx.work.WorkerParameters;
import androidx.work.impl.C0869i;
import androidx.work.impl.utils.p014k.C0956a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p112n.p277e.p298c.p299a.p300a.C10661a;

/* renamed from: androidx.work.impl.c */
/* compiled from: Processor */
public class C0858c implements C0838a {

    /* renamed from: o */
    private static final String f3073o = C0834i.m3721a("Processor");

    /* renamed from: f */
    private Context f3074f;

    /* renamed from: g */
    private C0822b f3075g;

    /* renamed from: h */
    private C0956a f3076h;

    /* renamed from: i */
    private WorkDatabase f3077i;

    /* renamed from: j */
    private Map<String, C0869i> f3078j = new HashMap();

    /* renamed from: k */
    private List<C0860d> f3079k;

    /* renamed from: l */
    private Set<String> f3080l;

    /* renamed from: m */
    private final List<C0838a> f3081m;

    /* renamed from: n */
    private final Object f3082n;

    /* renamed from: androidx.work.impl.c$a */
    /* compiled from: Processor */
    private static class C0859a implements Runnable {

        /* renamed from: f */
        private C0838a f3083f;

        /* renamed from: g */
        private String f3084g;

        /* renamed from: h */
        private C10661a<Boolean> f3085h;

        C0859a(C0838a aVar, String str, C10661a<Boolean> aVar2) {
            this.f3083f = aVar;
            this.f3084g = str;
            this.f3085h = aVar2;
        }

        public void run() {
            boolean z;
            try {
                z = this.f3085h.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f3083f.mo4736a(this.f3084g, z);
        }
    }

    public C0858c(Context context, C0822b bVar, C0956a aVar, WorkDatabase workDatabase, List<C0860d> list) {
        this.f3074f = context;
        this.f3075g = bVar;
        this.f3076h = aVar;
        this.f3077i = workDatabase;
        this.f3079k = list;
        this.f3080l = new HashSet();
        this.f3081m = new ArrayList();
        this.f3082n = new Object();
    }

    /* renamed from: a */
    public boolean mo4777a(String str, WorkerParameters.C0820a aVar) {
        synchronized (this.f3082n) {
            if (this.f3078j.containsKey(str)) {
                C0834i.m3720a().mo4726a(f3073o, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            C0869i.C0872c cVar = new C0869i.C0872c(this.f3074f, this.f3075g, this.f3076h, this.f3077i, str);
            cVar.mo4820a(this.f3079k);
            cVar.mo4819a(aVar);
            C0869i a = cVar.mo4821a();
            C10661a<Boolean> a2 = a.mo4812a();
            a2.mo4937a(new C0859a(this, str, a2), this.f3076h.mo4960a());
            this.f3078j.put(str, a);
            this.f3076h.mo4962b().execute(a);
            C0834i.m3720a().mo4726a(f3073o, String.format("%s: processing %s", new Object[]{C0858c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo4779b(String str) {
        boolean containsKey;
        synchronized (this.f3082n) {
            containsKey = this.f3078j.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: c */
    public boolean mo4780c(String str) {
        return mo4777a(str, (WorkerParameters.C0820a) null);
    }

    /* renamed from: d */
    public boolean mo4781d(String str) {
        synchronized (this.f3082n) {
            C0834i.m3720a().mo4726a(f3073o, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f3080l.add(str);
            C0869i remove = this.f3078j.remove(str);
            if (remove != null) {
                remove.mo4813a(true);
                C0834i.m3720a().mo4726a(f3073o, String.format("WorkerWrapper cancelled for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            C0834i.m3720a().mo4726a(f3073o, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo4782e(String str) {
        synchronized (this.f3082n) {
            C0834i.m3720a().mo4726a(f3073o, String.format("Processor stopping %s", new Object[]{str}), new Throwable[0]);
            C0869i remove = this.f3078j.remove(str);
            if (remove != null) {
                remove.mo4813a(false);
                C0834i.m3720a().mo4726a(f3073o, String.format("WorkerWrapper stopped for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            C0834i.m3720a().mo4726a(f3073o, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    /* renamed from: b */
    public void mo4778b(C0838a aVar) {
        synchronized (this.f3082n) {
            this.f3081m.remove(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo4776a(String str) {
        boolean contains;
        synchronized (this.f3082n) {
            contains = this.f3080l.contains(str);
        }
        return contains;
    }

    /* renamed from: a */
    public void mo4775a(C0838a aVar) {
        synchronized (this.f3082n) {
            this.f3081m.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo4736a(String str, boolean z) {
        synchronized (this.f3082n) {
            this.f3078j.remove(str);
            C0834i.m3720a().mo4726a(f3073o, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (C0838a a : this.f3081m) {
                a.mo4736a(str, z);
            }
        }
    }
}
