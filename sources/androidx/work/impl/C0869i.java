package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C0822b;
import androidx.work.C0829e;
import androidx.work.C0833h;
import androidx.work.C0834i;
import androidx.work.C0974p;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.p012l.C0899b;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.p012l.C0914k;
import androidx.work.impl.p012l.C0926n;
import androidx.work.impl.utils.p013j.C0955c;
import androidx.work.impl.utils.p014k.C0956a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p112n.p277e.p298c.p299a.p300a.C10661a;

/* renamed from: androidx.work.impl.i */
/* compiled from: WorkerWrapper */
public class C0869i implements Runnable {

    /* renamed from: x */
    static final String f3113x = C0834i.m3721a("WorkerWrapper");

    /* renamed from: f */
    private Context f3114f;

    /* renamed from: g */
    private String f3115g;

    /* renamed from: h */
    private List<C0860d> f3116h;

    /* renamed from: i */
    private WorkerParameters.C0820a f3117i;

    /* renamed from: j */
    C0911j f3118j;

    /* renamed from: k */
    ListenableWorker f3119k;

    /* renamed from: l */
    ListenableWorker.C0815a f3120l = ListenableWorker.C0815a.m3647a();

    /* renamed from: m */
    private C0822b f3121m;

    /* renamed from: n */
    private C0956a f3122n;

    /* renamed from: o */
    private WorkDatabase f3123o;

    /* renamed from: p */
    private C0914k f3124p;

    /* renamed from: q */
    private C0899b f3125q;

    /* renamed from: r */
    private C0926n f3126r;

    /* renamed from: s */
    private List<String> f3127s;

    /* renamed from: t */
    private String f3128t;

    /* renamed from: u */
    private C0955c<Boolean> f3129u = C0955c.m4117d();

    /* renamed from: v */
    C10661a<ListenableWorker.C0815a> f3130v = null;

    /* renamed from: w */
    private volatile boolean f3131w;

    /* renamed from: androidx.work.impl.i$a */
    /* compiled from: WorkerWrapper */
    class C0870a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0955c f3132f;

        C0870a(C0955c cVar) {
            this.f3132f = cVar;
        }

        public void run() {
            try {
                C0834i.m3720a().mo4726a(C0869i.f3113x, String.format("Starting work for %s", new Object[]{C0869i.this.f3118j.f3206c}), new Throwable[0]);
                C0869i.this.f3130v = C0869i.this.f3119k.startWork();
                this.f3132f.mo4940a(C0869i.this.f3130v);
            } catch (Throwable th) {
                this.f3132f.mo4939a(th);
            }
        }
    }

    /* renamed from: androidx.work.impl.i$b */
    /* compiled from: WorkerWrapper */
    class C0871b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0955c f3134f;

        /* renamed from: g */
        final /* synthetic */ String f3135g;

        C0871b(C0955c cVar, String str) {
            this.f3134f = cVar;
            this.f3135g = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                ListenableWorker.C0815a aVar = (ListenableWorker.C0815a) this.f3134f.get();
                if (aVar == null) {
                    C0834i.m3720a().mo4727b(C0869i.f3113x, String.format("%s returned a null result. Treating it as a failure.", new Object[]{C0869i.this.f3118j.f3206c}), new Throwable[0]);
                } else {
                    C0834i.m3720a().mo4726a(C0869i.f3113x, String.format("%s returned a %s result.", new Object[]{C0869i.this.f3118j.f3206c, aVar}), new Throwable[0]);
                    C0869i.this.f3120l = aVar;
                }
            } catch (CancellationException e) {
                C0834i.m3720a().mo4728c(C0869i.f3113x, String.format("%s was cancelled", new Object[]{this.f3135g}), e);
            } catch (InterruptedException | ExecutionException e2) {
                C0834i.m3720a().mo4727b(C0869i.f3113x, String.format("%s failed because it threw an exception/error", new Object[]{this.f3135g}), e2);
            } catch (Throwable th) {
                C0869i.this.mo4814b();
                throw th;
            }
            C0869i.this.mo4814b();
        }
    }

    /* renamed from: androidx.work.impl.i$c */
    /* compiled from: WorkerWrapper */
    public static class C0872c {

        /* renamed from: a */
        Context f3137a;

        /* renamed from: b */
        ListenableWorker f3138b;

        /* renamed from: c */
        C0956a f3139c;

        /* renamed from: d */
        C0822b f3140d;

        /* renamed from: e */
        WorkDatabase f3141e;

        /* renamed from: f */
        String f3142f;

        /* renamed from: g */
        List<C0860d> f3143g;

        /* renamed from: h */
        WorkerParameters.C0820a f3144h = new WorkerParameters.C0820a();

        public C0872c(Context context, C0822b bVar, C0956a aVar, WorkDatabase workDatabase, String str) {
            this.f3137a = context.getApplicationContext();
            this.f3139c = aVar;
            this.f3140d = bVar;
            this.f3141e = workDatabase;
            this.f3142f = str;
        }

        /* renamed from: a */
        public C0872c mo4820a(List<C0860d> list) {
            this.f3143g = list;
            return this;
        }

        /* renamed from: a */
        public C0872c mo4819a(WorkerParameters.C0820a aVar) {
            if (aVar != null) {
                this.f3144h = aVar;
            }
            return this;
        }

        /* renamed from: a */
        public C0869i mo4821a() {
            return new C0869i(this);
        }
    }

    C0869i(C0872c cVar) {
        this.f3114f = cVar.f3137a;
        this.f3122n = cVar.f3139c;
        this.f3115g = cVar.f3142f;
        this.f3116h = cVar.f3143g;
        this.f3117i = cVar.f3144h;
        this.f3119k = cVar.f3138b;
        this.f3121m = cVar.f3140d;
        WorkDatabase workDatabase = cVar.f3141e;
        this.f3123o = workDatabase;
        this.f3124p = workDatabase.mo4734d();
        this.f3125q = this.f3123o.mo4731a();
        this.f3126r = this.f3123o.mo4735e();
    }

    /* renamed from: d */
    private void m3873d() {
        this.f3123o.beginTransaction();
        try {
            this.f3124p.mo4890a(C0974p.ENQUEUED, this.f3115g);
            this.f3124p.mo4899b(this.f3115g, System.currentTimeMillis());
            this.f3124p.mo4891a(this.f3115g, -1);
            this.f3123o.setTransactionSuccessful();
        } finally {
            this.f3123o.endTransaction();
            m3872b(true);
        }
    }

    /* renamed from: e */
    private void m3874e() {
        this.f3123o.beginTransaction();
        try {
            this.f3124p.mo4899b(this.f3115g, System.currentTimeMillis());
            this.f3124p.mo4890a(C0974p.ENQUEUED, this.f3115g);
            this.f3124p.mo4905e(this.f3115g);
            this.f3124p.mo4891a(this.f3115g, -1);
            this.f3123o.setTransactionSuccessful();
        } finally {
            this.f3123o.endTransaction();
            m3872b(false);
        }
    }

    /* renamed from: f */
    private void m3875f() {
        C0974p c = this.f3124p.mo4900c(this.f3115g);
        if (c == C0974p.RUNNING) {
            C0834i.m3720a().mo4726a(f3113x, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f3115g}), new Throwable[0]);
            m3872b(true);
            return;
        }
        C0834i.m3720a().mo4726a(f3113x, String.format("Status for %s is %s; not doing any work", new Object[]{this.f3115g, c}), new Throwable[0]);
        m3872b(false);
    }

    /* renamed from: g */
    private void m3876g() {
        C0829e a;
        if (!m3878i()) {
            this.f3123o.beginTransaction();
            try {
                C0911j d = this.f3124p.mo4903d(this.f3115g);
                this.f3118j = d;
                if (d == null) {
                    C0834i.m3720a().mo4727b(f3113x, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f3115g}), new Throwable[0]);
                    m3872b(false);
                } else if (d.f3205b != C0974p.ENQUEUED) {
                    m3875f();
                    this.f3123o.setTransactionSuccessful();
                    C0834i.m3720a().mo4726a(f3113x, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f3118j.f3206c}), new Throwable[0]);
                    this.f3123o.endTransaction();
                } else {
                    if (d.mo4884d() || this.f3118j.mo4883c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(this.f3118j.f3217n == 0) && currentTimeMillis < this.f3118j.mo4879a()) {
                            C0834i.m3720a().mo4726a(f3113x, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f3118j.f3206c}), new Throwable[0]);
                            m3872b(true);
                            this.f3123o.endTransaction();
                            return;
                        }
                    }
                    this.f3123o.setTransactionSuccessful();
                    this.f3123o.endTransaction();
                    if (this.f3118j.mo4884d()) {
                        a = this.f3118j.f3208e;
                    } else {
                        C0833h a2 = C0833h.m3718a(this.f3118j.f3207d);
                        if (a2 == null) {
                            C0834i.m3720a().mo4727b(f3113x, String.format("Could not create Input Merger %s", new Object[]{this.f3118j.f3207d}), new Throwable[0]);
                            mo4815c();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f3118j.f3208e);
                        arrayList.addAll(this.f3124p.mo4907g(this.f3115g));
                        a = a2.mo4624a((List<C0829e>) arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f3115g), a, this.f3127s, this.f3117i, this.f3118j.f3214k, this.f3121m.mo4673a(), this.f3122n, this.f3121m.mo4679g());
                    if (this.f3119k == null) {
                        this.f3119k = this.f3121m.mo4679g().createWorkerWithDefaultFallback(this.f3114f, this.f3118j.f3206c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f3119k;
                    if (listenableWorker == null) {
                        C0834i.m3720a().mo4727b(f3113x, String.format("Could not create Worker %s", new Object[]{this.f3118j.f3206c}), new Throwable[0]);
                        mo4815c();
                    } else if (listenableWorker.isUsed()) {
                        C0834i.m3720a().mo4727b(f3113x, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f3118j.f3206c}), new Throwable[0]);
                        mo4815c();
                    } else {
                        this.f3119k.setUsed();
                        if (!m3879j()) {
                            m3875f();
                        } else if (!m3878i()) {
                            C0955c d2 = C0955c.m4117d();
                            this.f3122n.mo4960a().execute(new C0870a(d2));
                            d2.mo4937a((Runnable) new C0871b(d2, this.f3128t), this.f3122n.mo4962b());
                        }
                    }
                }
            } finally {
                this.f3123o.endTransaction();
            }
        }
    }

    /* renamed from: h */
    private void m3877h() {
        this.f3123o.beginTransaction();
        try {
            this.f3124p.mo4890a(C0974p.SUCCEEDED, this.f3115g);
            this.f3124p.mo4896a(this.f3115g, ((ListenableWorker.C0815a.C0818c) this.f3120l).mo4657d());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f3125q.mo4866a(this.f3115g)) {
                if (this.f3124p.mo4900c(next) == C0974p.BLOCKED && this.f3125q.mo4868b(next)) {
                    C0834i.m3720a().mo4728c(f3113x, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.f3124p.mo4890a(C0974p.ENQUEUED, next);
                    this.f3124p.mo4899b(next, currentTimeMillis);
                }
            }
            this.f3123o.setTransactionSuccessful();
        } finally {
            this.f3123o.endTransaction();
            m3872b(false);
        }
    }

    /* renamed from: i */
    private boolean m3878i() {
        if (!this.f3131w) {
            return false;
        }
        C0834i.m3720a().mo4726a(f3113x, String.format("Work interrupted for %s", new Object[]{this.f3128t}), new Throwable[0]);
        C0974p c = this.f3124p.mo4900c(this.f3115g);
        if (c == null) {
            m3872b(false);
        } else {
            m3872b(!c.mo4977a());
        }
        return true;
    }

    /* renamed from: j */
    private boolean m3879j() {
        this.f3123o.beginTransaction();
        try {
            boolean z = true;
            if (this.f3124p.mo4900c(this.f3115g) == C0974p.ENQUEUED) {
                this.f3124p.mo4890a(C0974p.RUNNING, this.f3115g);
                this.f3124p.mo4908h(this.f3115g);
            } else {
                z = false;
            }
            this.f3123o.setTransactionSuccessful();
            return z;
        } finally {
            this.f3123o.endTransaction();
        }
    }

    /* renamed from: a */
    public C10661a<Boolean> mo4812a() {
        return this.f3129u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4814b() {
        boolean z = false;
        if (!m3878i()) {
            this.f3123o.beginTransaction();
            try {
                C0974p c = this.f3124p.mo4900c(this.f3115g);
                if (c == null) {
                    m3872b(false);
                    z = true;
                } else if (c == C0974p.RUNNING) {
                    m3870a(this.f3120l);
                    z = this.f3124p.mo4900c(this.f3115g).mo4977a();
                } else if (!c.mo4977a()) {
                    m3873d();
                }
                this.f3123o.setTransactionSuccessful();
            } finally {
                this.f3123o.endTransaction();
            }
        }
        List<C0860d> list = this.f3116h;
        if (list != null) {
            if (z) {
                for (C0860d cancel : list) {
                    cancel.cancel(this.f3115g);
                }
            }
            C0861e.m3833a(this.f3121m, this.f3123o, this.f3116h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4815c() {
        this.f3123o.beginTransaction();
        try {
            m3871a(this.f3115g);
            this.f3124p.mo4896a(this.f3115g, ((ListenableWorker.C0815a.C0816a) this.f3120l).mo4650d());
            this.f3123o.setTransactionSuccessful();
        } finally {
            this.f3123o.endTransaction();
            m3872b(false);
        }
    }

    public void run() {
        List<String> a = this.f3126r.mo4910a(this.f3115g);
        this.f3127s = a;
        this.f3128t = m3869a(a);
        m3876g();
    }

    /* renamed from: a */
    public void mo4813a(boolean z) {
        this.f3131w = true;
        m3878i();
        C10661a<ListenableWorker.C0815a> aVar = this.f3130v;
        if (aVar != null) {
            aVar.cancel(true);
        }
        ListenableWorker listenableWorker = this.f3119k;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    /* renamed from: a */
    private void m3870a(ListenableWorker.C0815a aVar) {
        if (aVar instanceof ListenableWorker.C0815a.C0818c) {
            C0834i.m3720a().mo4728c(f3113x, String.format("Worker result SUCCESS for %s", new Object[]{this.f3128t}), new Throwable[0]);
            if (this.f3118j.mo4884d()) {
                m3874e();
            } else {
                m3877h();
            }
        } else if (aVar instanceof ListenableWorker.C0815a.C0817b) {
            C0834i.m3720a().mo4728c(f3113x, String.format("Worker result RETRY for %s", new Object[]{this.f3128t}), new Throwable[0]);
            m3873d();
        } else {
            C0834i.m3720a().mo4728c(f3113x, String.format("Worker result FAILURE for %s", new Object[]{this.f3128t}), new Throwable[0]);
            if (this.f3118j.mo4884d()) {
                m3874e();
            } else {
                mo4815c();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ all -> 0x0039 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3872b(boolean r4) {
        /*
            r3 = this;
            androidx.work.impl.WorkDatabase r0 = r3.f3123o
            r0.beginTransaction()
            androidx.work.impl.WorkDatabase r0 = r3.f3123o     // Catch:{ all -> 0x0039 }
            androidx.work.impl.l.k r0 = r0.mo4734d()     // Catch:{ all -> 0x0039 }
            java.util.List r0 = r0.mo4901c()     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0025
            android.content.Context r0 = r3.f3114f     // Catch:{ all -> 0x0039 }
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            androidx.work.impl.utils.C0936d.m4074a(r0, r2, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            androidx.work.impl.WorkDatabase r0 = r3.f3123o     // Catch:{ all -> 0x0039 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0039 }
            androidx.work.impl.WorkDatabase r0 = r3.f3123o
            r0.endTransaction()
            androidx.work.impl.utils.j.c<java.lang.Boolean> r0 = r3.f3129u
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.mo4938a(r4)
            return
        L_0x0039:
            r4 = move-exception
            androidx.work.impl.WorkDatabase r0 = r3.f3123o
            r0.endTransaction()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C0869i.m3872b(boolean):void");
    }

    /* renamed from: a */
    private void m3871a(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f3124p.mo4900c(str2) != C0974p.CANCELLED) {
                this.f3124p.mo4890a(C0974p.FAILED, str2);
            }
            linkedList.addAll(this.f3125q.mo4866a(str2));
        }
    }

    /* renamed from: a */
    private String m3869a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f3115g);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }
}
