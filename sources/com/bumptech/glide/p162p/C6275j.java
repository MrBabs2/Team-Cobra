package com.bumptech.glide.p162p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C5876e;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.engine.C5969k;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.p152o.p155e.C6197a;
import com.bumptech.glide.p162p.p163l.C6286h;
import com.bumptech.glide.p162p.p163l.C6287i;
import com.bumptech.glide.p162p.p164m.C6298e;
import com.bumptech.glide.p166r.C6316k;
import com.bumptech.glide.p166r.p167l.C6318a;
import com.bumptech.glide.p166r.p167l.C6327c;
import java.util.List;
import java.util.concurrent.Executor;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.p.j */
/* compiled from: SingleRequest */
public final class C6275j<R> implements C6268d, C6286h, C6274i, C6318a.C6324f {

    /* renamed from: H */
    private static final C5005e<C6275j<?>> f11476H = C6318a.m13006a(150, new C6276a());

    /* renamed from: I */
    private static final boolean f11477I = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private C6277b f11478A;

    /* renamed from: B */
    private Drawable f11479B;

    /* renamed from: C */
    private Drawable f11480C;

    /* renamed from: D */
    private Drawable f11481D;

    /* renamed from: E */
    private int f11482E;

    /* renamed from: F */
    private int f11483F;

    /* renamed from: G */
    private RuntimeException f11484G;

    /* renamed from: f */
    private boolean f11485f;

    /* renamed from: g */
    private final String f11486g;

    /* renamed from: h */
    private final C6327c f11487h;

    /* renamed from: i */
    private C6272g<R> f11488i;

    /* renamed from: j */
    private C6269e f11489j;

    /* renamed from: k */
    private Context f11490k;

    /* renamed from: l */
    private C5876e f11491l;

    /* renamed from: m */
    private Object f11492m;

    /* renamed from: n */
    private Class<R> f11493n;

    /* renamed from: o */
    private C6265a<?> f11494o;

    /* renamed from: p */
    private int f11495p;

    /* renamed from: q */
    private int f11496q;

    /* renamed from: r */
    private C5878g f11497r;

    /* renamed from: s */
    private C6287i<R> f11498s;

    /* renamed from: t */
    private List<C6272g<R>> f11499t;

    /* renamed from: u */
    private C5969k f11500u;

    /* renamed from: v */
    private C6298e<? super R> f11501v;

    /* renamed from: w */
    private Executor f11502w;

    /* renamed from: x */
    private C5992u<R> f11503x;

    /* renamed from: y */
    private C5969k.C5975d f11504y;

    /* renamed from: z */
    private long f11505z;

    /* renamed from: com.bumptech.glide.p.j$a */
    /* compiled from: SingleRequest */
    class C6276a implements C6318a.C6322d<C6275j<?>> {
        C6276a() {
        }

        /* renamed from: a */
        public C6275j<?> m12883a() {
            return new C6275j<>();
        }
    }

    /* renamed from: com.bumptech.glide.p.j$b */
    /* compiled from: SingleRequest */
    private enum C6277b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    C6275j() {
        this.f11486g = f11477I ? String.valueOf(super.hashCode()) : null;
        this.f11487h = C6327c.m13024b();
    }

    /* renamed from: a */
    private synchronized void m12852a(Context context, C5876e eVar, Object obj, Class<R> cls, C6265a<?> aVar, int i, int i2, C5878g gVar, C6287i<R> iVar, C6272g<R> gVar2, List<C6272g<R>> list, C6269e eVar2, C5969k kVar, C6298e<? super R> eVar3, Executor executor) {
        this.f11490k = context;
        this.f11491l = eVar;
        this.f11492m = obj;
        this.f11493n = cls;
        this.f11494o = aVar;
        this.f11495p = i;
        this.f11496q = i2;
        this.f11497r = gVar;
        this.f11498s = iVar;
        this.f11488i = gVar2;
        this.f11499t = list;
        this.f11489j = eVar2;
        this.f11500u = kVar;
        this.f11501v = eVar3;
        this.f11502w = executor;
        this.f11478A = C6277b.PENDING;
        if (this.f11484G == null && eVar.mo19980g()) {
            this.f11484G = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: b */
    public static <R> C6275j<R> m12858b(Context context, C5876e eVar, Object obj, Class<R> cls, C6265a<?> aVar, int i, int i2, C5878g gVar, C6287i<R> iVar, C6272g<R> gVar2, List<C6272g<R>> list, C6269e eVar2, C5969k kVar, C6298e<? super R> eVar3, Executor executor) {
        C6275j<R> a = f11476H.mo17456a();
        if (a == null) {
            a = new C6275j<>();
        }
        a.m12852a(context, eVar, obj, cls, aVar, i, i2, gVar, iVar, gVar2, list, eVar2, kVar, eVar3, executor);
        return a;
    }

    /* renamed from: c */
    private void m12859c() {
        if (this.f11485f) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: h */
    private boolean m12860h() {
        C6269e eVar = this.f11489j;
        return eVar == null || eVar.mo20691f(this);
    }

    /* renamed from: j */
    private boolean m12861j() {
        C6269e eVar = this.f11489j;
        return eVar == null || eVar.mo20684c(this);
    }

    /* renamed from: k */
    private boolean m12862k() {
        C6269e eVar = this.f11489j;
        return eVar == null || eVar.mo20687d(this);
    }

    /* renamed from: l */
    private void m12863l() {
        m12859c();
        this.f11487h.mo20774a();
        this.f11498s.removeCallback(this);
        C5969k.C5975d dVar = this.f11504y;
        if (dVar != null) {
            dVar.mo20207a();
            this.f11504y = null;
        }
    }

    /* renamed from: m */
    private Drawable m12864m() {
        if (this.f11479B == null) {
            Drawable h = this.f11494o.mo20662h();
            this.f11479B = h;
            if (h == null && this.f11494o.mo20661g() > 0) {
                this.f11479B = m12851a(this.f11494o.mo20661g());
            }
        }
        return this.f11479B;
    }

    /* renamed from: n */
    private Drawable m12865n() {
        if (this.f11481D == null) {
            Drawable i = this.f11494o.mo20664i();
            this.f11481D = i;
            if (i == null && this.f11494o.mo20665j() > 0) {
                this.f11481D = m12851a(this.f11494o.mo20665j());
            }
        }
        return this.f11481D;
    }

    /* renamed from: o */
    private Drawable m12866o() {
        if (this.f11480C == null) {
            Drawable q = this.f11494o.mo20670q();
            this.f11480C = q;
            if (q == null && this.f11494o.mo20671r() > 0) {
                this.f11480C = m12851a(this.f11494o.mo20671r());
            }
        }
        return this.f11480C;
    }

    /* renamed from: p */
    private boolean m12867p() {
        C6269e eVar = this.f11489j;
        return eVar == null || !eVar.mo20683c();
    }

    /* renamed from: q */
    private void m12868q() {
        C6269e eVar = this.f11489j;
        if (eVar != null) {
            eVar.mo20679a(this);
        }
    }

    /* renamed from: r */
    private void m12869r() {
        C6269e eVar = this.f11489j;
        if (eVar != null) {
            eVar.mo20688e(this);
        }
    }

    /* renamed from: s */
    private synchronized void m12870s() {
        if (m12861j()) {
            Drawable drawable = null;
            if (this.f11492m == null) {
                drawable = m12865n();
            }
            if (drawable == null) {
                drawable = m12864m();
            }
            if (drawable == null) {
                drawable = m12866o();
            }
            this.f11498s.onLoadFailed(drawable);
        }
    }

    public synchronized void clear() {
        m12859c();
        this.f11487h.mo20774a();
        if (this.f11478A != C6277b.CLEARED) {
            m12863l();
            if (this.f11503x != null) {
                m12854a((C5992u<?>) this.f11503x);
            }
            if (m12860h()) {
                this.f11498s.onLoadCleared(m12866o());
            }
            this.f11478A = C6277b.CLEARED;
        }
    }

    /* renamed from: d */
    public synchronized boolean mo20686d() {
        return mo20692g();
    }

    /* renamed from: e */
    public synchronized boolean mo20689e() {
        return this.f11478A == C6277b.FAILED;
    }

    /* renamed from: f */
    public synchronized boolean mo20690f() {
        return this.f11478A == C6277b.CLEARED;
    }

    /* renamed from: g */
    public synchronized boolean mo20692g() {
        return this.f11478A == C6277b.COMPLETE;
    }

    /* renamed from: i */
    public C6327c mo20121i() {
        return this.f11487h;
    }

    public synchronized boolean isRunning() {
        return this.f11478A == C6277b.RUNNING || this.f11478A == C6277b.WAITING_FOR_SIZE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo20681b() {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m12859c()     // Catch:{ all -> 0x00ad }
            com.bumptech.glide.r.l.c r0 = r3.f11487h     // Catch:{ all -> 0x00ad }
            r0.mo20774a()     // Catch:{ all -> 0x00ad }
            long r0 = com.bumptech.glide.p166r.C6311f.m12965a()     // Catch:{ all -> 0x00ad }
            r3.f11505z = r0     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r3.f11492m     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x003a
            int r0 = r3.f11495p     // Catch:{ all -> 0x00ad }
            int r1 = r3.f11496q     // Catch:{ all -> 0x00ad }
            boolean r0 = com.bumptech.glide.p166r.C6316k.m12999b((int) r0, (int) r1)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0025
            int r0 = r3.f11495p     // Catch:{ all -> 0x00ad }
            r3.f11482E = r0     // Catch:{ all -> 0x00ad }
            int r0 = r3.f11496q     // Catch:{ all -> 0x00ad }
            r3.f11483F = r0     // Catch:{ all -> 0x00ad }
        L_0x0025:
            android.graphics.drawable.Drawable r0 = r3.m12865n()     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x002d
            r0 = 5
            goto L_0x002e
        L_0x002d:
            r0 = 3
        L_0x002e:
            com.bumptech.glide.load.engine.GlideException r1 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = "Received null model"
            r1.<init>(r2)     // Catch:{ all -> 0x00ad }
            r3.m12853a((com.bumptech.glide.load.engine.GlideException) r1, (int) r0)     // Catch:{ all -> 0x00ad }
            monitor-exit(r3)
            return
        L_0x003a:
            com.bumptech.glide.p.j$b r0 = r3.f11478A     // Catch:{ all -> 0x00ad }
            com.bumptech.glide.p.j$b r1 = com.bumptech.glide.p162p.C6275j.C6277b.RUNNING     // Catch:{ all -> 0x00ad }
            if (r0 == r1) goto L_0x00a5
            com.bumptech.glide.p.j$b r0 = r3.f11478A     // Catch:{ all -> 0x00ad }
            com.bumptech.glide.p.j$b r1 = com.bumptech.glide.p162p.C6275j.C6277b.COMPLETE     // Catch:{ all -> 0x00ad }
            if (r0 != r1) goto L_0x004f
            com.bumptech.glide.load.engine.u<R> r0 = r3.f11503x     // Catch:{ all -> 0x00ad }
            com.bumptech.glide.load.a r1 = com.bumptech.glide.load.C5901a.MEMORY_CACHE     // Catch:{ all -> 0x00ad }
            r3.mo20709a((com.bumptech.glide.load.engine.C5992u<?>) r0, (com.bumptech.glide.load.C5901a) r1)     // Catch:{ all -> 0x00ad }
            monitor-exit(r3)
            return
        L_0x004f:
            com.bumptech.glide.p.j$b r0 = com.bumptech.glide.p162p.C6275j.C6277b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00ad }
            r3.f11478A = r0     // Catch:{ all -> 0x00ad }
            int r0 = r3.f11495p     // Catch:{ all -> 0x00ad }
            int r1 = r3.f11496q     // Catch:{ all -> 0x00ad }
            boolean r0 = com.bumptech.glide.p166r.C6316k.m12999b((int) r0, (int) r1)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0065
            int r0 = r3.f11495p     // Catch:{ all -> 0x00ad }
            int r1 = r3.f11496q     // Catch:{ all -> 0x00ad }
            r3.mo20710a((int) r0, (int) r1)     // Catch:{ all -> 0x00ad }
            goto L_0x006a
        L_0x0065:
            com.bumptech.glide.p.l.i<R> r0 = r3.f11498s     // Catch:{ all -> 0x00ad }
            r0.getSize(r3)     // Catch:{ all -> 0x00ad }
        L_0x006a:
            com.bumptech.glide.p.j$b r0 = r3.f11478A     // Catch:{ all -> 0x00ad }
            com.bumptech.glide.p.j$b r1 = com.bumptech.glide.p162p.C6275j.C6277b.RUNNING     // Catch:{ all -> 0x00ad }
            if (r0 == r1) goto L_0x0076
            com.bumptech.glide.p.j$b r0 = r3.f11478A     // Catch:{ all -> 0x00ad }
            com.bumptech.glide.p.j$b r1 = com.bumptech.glide.p162p.C6275j.C6277b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00ad }
            if (r0 != r1) goto L_0x0085
        L_0x0076:
            boolean r0 = r3.m12861j()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0085
            com.bumptech.glide.p.l.i<R> r0 = r3.f11498s     // Catch:{ all -> 0x00ad }
            android.graphics.drawable.Drawable r1 = r3.m12866o()     // Catch:{ all -> 0x00ad }
            r0.onLoadStarted(r1)     // Catch:{ all -> 0x00ad }
        L_0x0085:
            boolean r0 = f11477I     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r0.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "finished run method in "
            r0.append(r1)     // Catch:{ all -> 0x00ad }
            long r1 = r3.f11505z     // Catch:{ all -> 0x00ad }
            double r1 = com.bumptech.glide.p166r.C6311f.m12964a(r1)     // Catch:{ all -> 0x00ad }
            r0.append(r1)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ad }
            r3.m12856a((java.lang.String) r0)     // Catch:{ all -> 0x00ad }
        L_0x00a3:
            monitor-exit(r3)
            return
        L_0x00a5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "Cannot restart a running request"
            r0.<init>(r1)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6275j.mo20681b():void");
    }

    /* renamed from: a */
    public synchronized void mo20678a() {
        m12859c();
        this.f11490k = null;
        this.f11491l = null;
        this.f11492m = null;
        this.f11493n = null;
        this.f11494o = null;
        this.f11495p = -1;
        this.f11496q = -1;
        this.f11498s = null;
        this.f11499t = null;
        this.f11488i = null;
        this.f11489j = null;
        this.f11501v = null;
        this.f11504y = null;
        this.f11479B = null;
        this.f11480C = null;
        this.f11481D = null;
        this.f11482E = -1;
        this.f11483F = -1;
        this.f11484G = null;
        f11476H.mo17457a(this);
    }

    /* renamed from: b */
    public synchronized boolean mo20682b(C6268d dVar) {
        boolean z = false;
        if (!(dVar instanceof C6275j)) {
            return false;
        }
        C6275j jVar = (C6275j) dVar;
        synchronized (jVar) {
            if (this.f11495p == jVar.f11495p && this.f11496q == jVar.f11496q && C6316k.m12996a(this.f11492m, jVar.f11492m) && this.f11493n.equals(jVar.f11493n) && this.f11494o.equals(jVar.f11494o) && this.f11497r == jVar.f11497r && m12857a((C6275j<?>) jVar)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m12854a(C5992u<?> uVar) {
        this.f11500u.mo20204b(uVar);
        this.f11503x = null;
    }

    /* renamed from: a */
    private Drawable m12851a(int i) {
        return C6197a.m12551a((Context) this.f11491l, i, this.f11494o.mo20676y() != null ? this.f11494o.mo20676y() : this.f11490k.getTheme());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f0, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo20710a(int r22, int r23) {
        /*
            r21 = this;
            r15 = r21
            monitor-enter(r21)
            com.bumptech.glide.r.l.c r0 = r15.f11487h     // Catch:{ all -> 0x00f7 }
            r0.mo20774a()     // Catch:{ all -> 0x00f7 }
            boolean r0 = f11477I     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "Got onSizeReady in "
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            long r1 = r15.f11505z     // Catch:{ all -> 0x00f7 }
            double r1 = com.bumptech.glide.p166r.C6311f.m12964a(r1)     // Catch:{ all -> 0x00f7 }
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f7 }
            r15.m12856a((java.lang.String) r0)     // Catch:{ all -> 0x00f7 }
        L_0x0026:
            com.bumptech.glide.p.j$b r0 = r15.f11478A     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.j$b r1 = com.bumptech.glide.p162p.C6275j.C6277b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00f7 }
            if (r0 == r1) goto L_0x002e
            monitor-exit(r21)
            return
        L_0x002e:
            com.bumptech.glide.p.j$b r0 = com.bumptech.glide.p162p.C6275j.C6277b.RUNNING     // Catch:{ all -> 0x00f7 }
            r15.f11478A = r0     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            float r0 = r0.mo20675x()     // Catch:{ all -> 0x00f7 }
            r1 = r22
            int r1 = m12850a((int) r1, (float) r0)     // Catch:{ all -> 0x00f7 }
            r15.f11482E = r1     // Catch:{ all -> 0x00f7 }
            r1 = r23
            int r0 = m12850a((int) r1, (float) r0)     // Catch:{ all -> 0x00f7 }
            r15.f11483F = r0     // Catch:{ all -> 0x00f7 }
            boolean r0 = f11477I     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0066
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "finished setup for calling load in "
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            long r1 = r15.f11505z     // Catch:{ all -> 0x00f7 }
            double r1 = com.bumptech.glide.p166r.C6311f.m12964a(r1)     // Catch:{ all -> 0x00f7 }
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f7 }
            r15.m12856a((java.lang.String) r0)     // Catch:{ all -> 0x00f7 }
        L_0x0066:
            com.bumptech.glide.load.engine.k r1 = r15.f11500u     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.e r2 = r15.f11491l     // Catch:{ all -> 0x00f7 }
            java.lang.Object r3 = r15.f11492m     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.load.f r4 = r0.mo20674w()     // Catch:{ all -> 0x00f7 }
            int r5 = r15.f11482E     // Catch:{ all -> 0x00f7 }
            int r6 = r15.f11483F     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            java.lang.Class r7 = r0.mo20673u()     // Catch:{ all -> 0x00f7 }
            java.lang.Class<R> r8 = r15.f11493n     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.g r9 = r15.f11497r     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.load.engine.j r10 = r0.mo20660f()     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            java.util.Map r11 = r0.mo20677z()     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            boolean r12 = r0.mo20630H()     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            boolean r13 = r0.mo20628F()     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.load.i r14 = r0.mo20667l()     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0.mo20626C()     // Catch:{ all -> 0x00f7 }
            r22 = r0
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            boolean r16 = r0.mo20625B()     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            boolean r17 = r0.mo20624A()     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.p.a<?> r0 = r15.f11494o     // Catch:{ all -> 0x00f7 }
            boolean r18 = r0.mo20666k()     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.Executor r0 = r15.f11502w     // Catch:{ all -> 0x00f7 }
            r15 = r22
            r19 = r21
            r20 = r0
            com.bumptech.glide.load.engine.k$d r0 = r1.mo20200a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00f3 }
            r1 = r21
            r1.f11504y = r0     // Catch:{ all -> 0x00f1 }
            com.bumptech.glide.p.j$b r0 = r1.f11478A     // Catch:{ all -> 0x00f1 }
            com.bumptech.glide.p.j$b r2 = com.bumptech.glide.p162p.C6275j.C6277b.RUNNING     // Catch:{ all -> 0x00f1 }
            if (r0 == r2) goto L_0x00d1
            r0 = 0
            r1.f11504y = r0     // Catch:{ all -> 0x00f1 }
        L_0x00d1:
            boolean r0 = f11477I     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00ef
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "finished onSizeReady in "
            r0.append(r2)     // Catch:{ all -> 0x00f1 }
            long r2 = r1.f11505z     // Catch:{ all -> 0x00f1 }
            double r2 = com.bumptech.glide.p166r.C6311f.m12964a(r2)     // Catch:{ all -> 0x00f1 }
            r0.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f1 }
            r1.m12856a((java.lang.String) r0)     // Catch:{ all -> 0x00f1 }
        L_0x00ef:
            monitor-exit(r21)
            return
        L_0x00f1:
            r0 = move-exception
            goto L_0x00f9
        L_0x00f3:
            r0 = move-exception
            r1 = r21
            goto L_0x00f9
        L_0x00f7:
            r0 = move-exception
            r1 = r15
        L_0x00f9:
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6275j.mo20710a(int, int):void");
    }

    /* renamed from: a */
    private static int m12850a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: a */
    public synchronized void mo20709a(C5992u<?> uVar, C5901a aVar) {
        this.f11487h.mo20774a();
        this.f11504y = null;
        if (uVar == null) {
            mo20708a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f11493n + " inside, but instead got null."));
            return;
        }
        Object obj = uVar.get();
        if (obj != null) {
            if (this.f11493n.isAssignableFrom(obj.getClass())) {
                if (!m12862k()) {
                    m12854a(uVar);
                    this.f11478A = C6277b.COMPLETE;
                    return;
                }
                m12855a(uVar, obj, aVar);
                return;
            }
        }
        m12854a(uVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.f11493n);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(uVar);
        sb.append("}.");
        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        mo20708a(new GlideException(sb.toString()));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac A[Catch:{ all -> 0x00be }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m12855a(com.bumptech.glide.load.engine.C5992u<R> r11, R r12, com.bumptech.glide.load.C5901a r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r6 = r10.m12867p()     // Catch:{ all -> 0x00c2 }
            com.bumptech.glide.p.j$b r0 = com.bumptech.glide.p162p.C6275j.C6277b.COMPLETE     // Catch:{ all -> 0x00c2 }
            r10.f11478A = r0     // Catch:{ all -> 0x00c2 }
            r10.f11503x = r11     // Catch:{ all -> 0x00c2 }
            com.bumptech.glide.e r11 = r10.f11491l     // Catch:{ all -> 0x00c2 }
            int r11 = r11.mo19978e()     // Catch:{ all -> 0x00c2 }
            r0 = 3
            if (r11 > r0) goto L_0x006b
            java.lang.String r11 = "Glide"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r0.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "Finished loading "
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.Class r1 = r12.getClass()     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " from "
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            r0.append(r13)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " for "
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.Object r1 = r10.f11492m     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " with size ["
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            int r1 = r10.f11482E     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "x"
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            int r1 = r10.f11483F     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "] in "
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            long r1 = r10.f11505z     // Catch:{ all -> 0x00c2 }
            double r1 = com.bumptech.glide.p166r.C6311f.m12964a(r1)     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " ms"
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c2 }
            android.util.Log.d(r11, r0)     // Catch:{ all -> 0x00c2 }
        L_0x006b:
            r11 = 1
            r10.f11485f = r11     // Catch:{ all -> 0x00c2 }
            r7 = 0
            java.util.List<com.bumptech.glide.p.g<R>> r0 = r10.f11499t     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0093
            java.util.List<com.bumptech.glide.p.g<R>> r0 = r10.f11499t     // Catch:{ all -> 0x00be }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00be }
            r9 = 0
        L_0x007a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00be }
            com.bumptech.glide.p.g r0 = (com.bumptech.glide.p162p.C6272g) r0     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r10.f11492m     // Catch:{ all -> 0x00be }
            com.bumptech.glide.p.l.i<R> r3 = r10.f11498s     // Catch:{ all -> 0x00be }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00be }
            r9 = r9 | r0
            goto L_0x007a
        L_0x0093:
            r9 = 0
        L_0x0094:
            com.bumptech.glide.p.g<R> r0 = r10.f11488i     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00a8
            com.bumptech.glide.p.g<R> r0 = r10.f11488i     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r10.f11492m     // Catch:{ all -> 0x00be }
            com.bumptech.glide.p.l.i<R> r3 = r10.f11498s     // Catch:{ all -> 0x00be }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r11 = 0
        L_0x00a9:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b7
            com.bumptech.glide.p.m.e<? super R> r11 = r10.f11501v     // Catch:{ all -> 0x00be }
            com.bumptech.glide.p.m.d r11 = r11.mo20725a(r13, r6)     // Catch:{ all -> 0x00be }
            com.bumptech.glide.p.l.i<R> r13 = r10.f11498s     // Catch:{ all -> 0x00be }
            r13.onResourceReady(r12, r11)     // Catch:{ all -> 0x00be }
        L_0x00b7:
            r10.f11485f = r7     // Catch:{ all -> 0x00c2 }
            r10.m12869r()     // Catch:{ all -> 0x00c2 }
            monitor-exit(r10)
            return
        L_0x00be:
            r11 = move-exception
            r10.f11485f = r7     // Catch:{ all -> 0x00c2 }
            throw r11     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x00c6
        L_0x00c5:
            throw r11
        L_0x00c6:
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6275j.m12855a(com.bumptech.glide.load.engine.u, java.lang.Object, com.bumptech.glide.load.a):void");
    }

    /* renamed from: a */
    public synchronized void mo20708a(GlideException glideException) {
        m12853a(glideException, 5);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private synchronized void m12853a(GlideException glideException, int i) {
        boolean z;
        this.f11487h.mo20774a();
        glideException.mo20072a((Exception) this.f11484G);
        int e = this.f11491l.mo19978e();
        if (e <= i) {
            Log.w("Glide", "Load failed for " + this.f11492m + " with size [" + this.f11482E + "x" + this.f11483F + "]", glideException);
            if (e <= 4) {
                glideException.mo20073a("Glide");
            }
        }
        this.f11504y = null;
        this.f11478A = C6277b.FAILED;
        boolean z2 = true;
        this.f11485f = true;
        try {
            if (this.f11499t != null) {
                z = false;
                for (C6272g<R> onLoadFailed : this.f11499t) {
                    z |= onLoadFailed.onLoadFailed(glideException, this.f11492m, this.f11498s, m12867p());
                }
            } else {
                z = false;
            }
            if (this.f11488i == null || !this.f11488i.onLoadFailed(glideException, this.f11492m, this.f11498s, m12867p())) {
                z2 = false;
            }
            if (!z && !z2) {
                m12870s();
            }
            this.f11485f = false;
            m12868q();
        } catch (Throwable th) {
            this.f11485f = false;
            throw th;
        }
    }

    /* renamed from: a */
    private synchronized boolean m12857a(C6275j<?> jVar) {
        boolean z;
        synchronized (jVar) {
            z = false;
            if ((this.f11499t == null ? 0 : this.f11499t.size()) == (jVar.f11499t == null ? 0 : jVar.f11499t.size())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m12856a(String str) {
        Log.v("Request", str + " this: " + this.f11486g);
    }
}
