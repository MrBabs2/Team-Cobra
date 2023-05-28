package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C5876e;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6029k;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.C5949f;
import com.bumptech.glide.load.engine.C5961i;
import com.bumptech.glide.load.engine.p144a0.C5913a;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p148m.C6036e;
import com.bumptech.glide.load.p152o.p153c.C6167l;
import com.bumptech.glide.p166r.C6311f;
import com.bumptech.glide.p166r.p167l.C6318a;
import com.bumptech.glide.p166r.p167l.C6326b;
import com.bumptech.glide.p166r.p167l.C6327c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.engine.h */
/* compiled from: DecodeJob */
class C5952h<R> implements C5949f.C5950a, Runnable, Comparable<C5952h<?>>, C6318a.C6324f {

    /* renamed from: A */
    private Object f10880A;

    /* renamed from: B */
    private Thread f10881B;

    /* renamed from: C */
    private C6022f f10882C;

    /* renamed from: D */
    private C6022f f10883D;

    /* renamed from: E */
    private Object f10884E;

    /* renamed from: F */
    private C5901a f10885F;

    /* renamed from: G */
    private C6034d<?> f10886G;

    /* renamed from: H */
    private volatile C5949f f10887H;

    /* renamed from: I */
    private volatile boolean f10888I;

    /* renamed from: J */
    private volatile boolean f10889J;

    /* renamed from: f */
    private final C5951g<R> f10890f = new C5951g<>();

    /* renamed from: g */
    private final List<Throwable> f10891g = new ArrayList();

    /* renamed from: h */
    private final C6327c f10892h = C6327c.m13024b();

    /* renamed from: i */
    private final C5957e f10893i;

    /* renamed from: j */
    private final C5005e<C5952h<?>> f10894j;

    /* renamed from: k */
    private final C5956d<?> f10895k = new C5956d<>();

    /* renamed from: l */
    private final C5958f f10896l = new C5958f();

    /* renamed from: m */
    private C5876e f10897m;

    /* renamed from: n */
    private C6022f f10898n;

    /* renamed from: o */
    private C5878g f10899o;

    /* renamed from: p */
    private C5983n f10900p;

    /* renamed from: q */
    private int f10901q;

    /* renamed from: r */
    private int f10902r;

    /* renamed from: s */
    private C5963j f10903s;

    /* renamed from: t */
    private C6027i f10904t;

    /* renamed from: u */
    private C5954b<R> f10905u;

    /* renamed from: v */
    private int f10906v;

    /* renamed from: w */
    private C5960h f10907w;

    /* renamed from: x */
    private C5959g f10908x;

    /* renamed from: y */
    private long f10909y;

    /* renamed from: z */
    private boolean f10910z;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    /* compiled from: DecodeJob */
    static /* synthetic */ class C5953a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10911a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10912b;

        /* renamed from: c */
        static final /* synthetic */ int[] f10913c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.c[] r0 = com.bumptech.glide.load.C5903c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10913c = r0
                r1 = 1
                com.bumptech.glide.load.c r2 = com.bumptech.glide.load.C5903c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10913c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.c r3 = com.bumptech.glide.load.C5903c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.h$h[] r2 = com.bumptech.glide.load.engine.C5952h.C5960h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10912b = r2
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.C5952h.C5960h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f10912b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.C5952h.C5960h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f10912b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C5952h.C5960h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f10912b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C5952h.C5960h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f10912b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C5952h.C5960h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.h$g[] r3 = com.bumptech.glide.load.engine.C5952h.C5959g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f10911a = r3
                com.bumptech.glide.load.engine.h$g r4 = com.bumptech.glide.load.engine.C5952h.C5959g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f10911a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.h$g r3 = com.bumptech.glide.load.engine.C5952h.C5959g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f10911a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.h$g r1 = com.bumptech.glide.load.engine.C5952h.C5959g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5952h.C5953a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$b */
    /* compiled from: DecodeJob */
    interface C5954b<R> {
        /* renamed from: a */
        void mo20181a(GlideException glideException);

        /* renamed from: a */
        void mo20182a(C5952h<?> hVar);

        /* renamed from: a */
        void mo20183a(C5992u<R> uVar, C5901a aVar);
    }

    /* renamed from: com.bumptech.glide.load.engine.h$c */
    /* compiled from: DecodeJob */
    private final class C5955c<Z> implements C5961i.C5962a<Z> {

        /* renamed from: a */
        private final C5901a f10914a;

        C5955c(C5901a aVar) {
            this.f10914a = aVar;
        }

        /* renamed from: a */
        public C5992u<Z> mo20184a(C5992u<Z> uVar) {
            return C5952h.this.mo20175a(this.f10914a, uVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$e */
    /* compiled from: DecodeJob */
    interface C5957e {
        /* renamed from: a */
        C5913a mo20189a();
    }

    /* renamed from: com.bumptech.glide.load.engine.h$g */
    /* compiled from: DecodeJob */
    private enum C5959g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.h$h */
    /* compiled from: DecodeJob */
    private enum C5960h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C5952h(C5957e eVar, C5005e<C5952h<?>> eVar2) {
        this.f10893i = eVar;
        this.f10894j = eVar2;
    }

    /* renamed from: b */
    private void m11798b(C5992u<R> uVar, C5901a aVar) {
        if (uVar instanceof C5987q) {
            ((C5987q) uVar).mo20245b();
        }
        C5990t<R> tVar = null;
        C5990t<R> tVar2 = uVar;
        if (this.f10895k.mo20188b()) {
            C5990t<R> b = C5990t.m11924b(uVar);
            tVar = b;
            tVar2 = b;
        }
        m11795a(tVar2, aVar);
        this.f10907w = C5960h.ENCODE;
        try {
            if (this.f10895k.mo20188b()) {
                this.f10895k.mo20186a(this.f10893i, this.f10904t);
            }
            m11803q();
        } finally {
            if (tVar != null) {
                tVar.mo20251b();
            }
        }
    }

    /* renamed from: l */
    private void m11799l() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f10909y;
            m11797a("Retrieved data", j, "data: " + this.f10884E + ", cache key: " + this.f10882C + ", fetcher: " + this.f10886G);
        }
        C5992u<R> uVar = null;
        try {
            uVar = m11791a(this.f10886G, this.f10884E, this.f10885F);
        } catch (GlideException e) {
            e.mo20070a(this.f10883D, this.f10885F);
            this.f10891g.add(e);
        }
        if (uVar != null) {
            m11798b(uVar, this.f10885F);
        } else {
            m11806t();
        }
    }

    /* renamed from: m */
    private C5949f m11800m() {
        int i = C5953a.f10912b[this.f10907w.ordinal()];
        if (i == 1) {
            return new C5993v(this.f10890f, this);
        }
        if (i == 2) {
            return new C5945c(this.f10890f, this);
        }
        if (i == 3) {
            return new C5997y(this.f10890f, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f10907w);
    }

    /* renamed from: o */
    private int m11801o() {
        return this.f10899o.ordinal();
    }

    /* renamed from: p */
    private void m11802p() {
        m11808w();
        this.f10905u.mo20181a(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f10891g)));
        m11804r();
    }

    /* renamed from: q */
    private void m11803q() {
        if (this.f10896l.mo20190a()) {
            m11805s();
        }
    }

    /* renamed from: r */
    private void m11804r() {
        if (this.f10896l.mo20192b()) {
            m11805s();
        }
    }

    /* renamed from: s */
    private void m11805s() {
        this.f10896l.mo20193c();
        this.f10895k.mo20185a();
        this.f10890f.mo20153a();
        this.f10888I = false;
        this.f10897m = null;
        this.f10898n = null;
        this.f10904t = null;
        this.f10899o = null;
        this.f10900p = null;
        this.f10905u = null;
        this.f10907w = null;
        this.f10887H = null;
        this.f10881B = null;
        this.f10882C = null;
        this.f10884E = null;
        this.f10885F = null;
        this.f10886G = null;
        this.f10909y = 0;
        this.f10889J = false;
        this.f10880A = null;
        this.f10891g.clear();
        this.f10894j.mo17457a(this);
    }

    /* renamed from: t */
    private void m11806t() {
        this.f10881B = Thread.currentThread();
        this.f10909y = C6311f.m12965a();
        boolean z = false;
        while (!this.f10889J && this.f10887H != null && !(z = this.f10887H.mo20142a())) {
            this.f10907w = m11790a(this.f10907w);
            this.f10887H = m11800m();
            if (this.f10907w == C5960h.SOURCE) {
                mo20148d();
                return;
            }
        }
        if ((this.f10907w == C5960h.FINISHED || this.f10889J) && !z) {
            m11802p();
        }
    }

    /* renamed from: v */
    private void m11807v() {
        int i = C5953a.f10911a[this.f10908x.ordinal()];
        if (i == 1) {
            this.f10907w = m11790a(C5960h.INITIALIZE);
            this.f10887H = m11800m();
            m11806t();
        } else if (i == 2) {
            m11806t();
        } else if (i == 3) {
            m11799l();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f10908x);
        }
    }

    /* renamed from: w */
    private void m11808w() {
        Throwable th;
        this.f10892h.mo20774a();
        if (this.f10888I) {
            if (this.f10891g.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f10891g;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f10888I = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5952h<R> mo20174a(C5876e eVar, Object obj, C5983n nVar, C6022f fVar, int i, int i2, Class<?> cls, Class<R> cls2, C5878g gVar, C5963j jVar, Map<Class<?>, C6030l<?>> map, boolean z, boolean z2, boolean z3, C6027i iVar, C5954b<R> bVar, int i3) {
        this.f10890f.mo20154a(eVar, obj, fVar, i, i2, jVar, cls, cls2, gVar, iVar, map, z, z2, this.f10893i);
        this.f10897m = eVar;
        this.f10898n = fVar;
        this.f10899o = gVar;
        this.f10900p = nVar;
        this.f10901q = i;
        this.f10902r = i2;
        this.f10903s = jVar;
        this.f10910z = z3;
        this.f10904t = iVar;
        this.f10905u = bVar;
        this.f10906v = i3;
        this.f10908x = C5959g.INITIALIZE;
        this.f10880A = obj;
        return this;
    }

    /* renamed from: d */
    public void mo20148d() {
        this.f10908x = C5959g.SWITCH_TO_SOURCE_SERVICE;
        this.f10905u.mo20182a((C5952h<?>) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo20179e() {
        C5960h a = m11790a(C5960h.INITIALIZE);
        return a == C5960h.RESOURCE_CACHE || a == C5960h.DATA_CACHE;
    }

    /* renamed from: i */
    public C6327c mo20121i() {
        return this.f10892h;
    }

    public void run() {
        C6326b.m13022a("DecodeJob#run(model=%s)", this.f10880A);
        C6034d<?> dVar = this.f10886G;
        try {
            if (this.f10889J) {
                m11802p();
                if (dVar != null) {
                    dVar.mo20329b();
                }
                C6326b.m13020a();
                return;
            }
            m11807v();
            if (dVar != null) {
                dVar.mo20329b();
            }
            C6326b.m13020a();
        } catch (C5935b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo20329b();
            }
            C6326b.m13020a();
            throw th;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$f */
    /* compiled from: DecodeJob */
    private static class C5958f {

        /* renamed from: a */
        private boolean f10919a;

        /* renamed from: b */
        private boolean f10920b;

        /* renamed from: c */
        private boolean f10921c;

        C5958f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo20191a(boolean z) {
            this.f10919a = true;
            return m11828b(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo20192b() {
            this.f10921c = true;
            return m11828b(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized void mo20193c() {
            this.f10920b = false;
            this.f10919a = false;
            this.f10921c = false;
        }

        /* renamed from: b */
        private boolean m11828b(boolean z) {
            return (this.f10921c || z || this.f10920b) && this.f10919a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo20190a() {
            this.f10920b = true;
            return m11828b(false);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$d */
    /* compiled from: DecodeJob */
    private static class C5956d<Z> {

        /* renamed from: a */
        private C6022f f10916a;

        /* renamed from: b */
        private C6029k<Z> f10917b;

        /* renamed from: c */
        private C5990t<Z> f10918c;

        C5956d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <X> void mo20187a(C6022f fVar, C6029k<X> kVar, C5990t<X> tVar) {
            this.f10916a = fVar;
            this.f10917b = kVar;
            this.f10918c = tVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo20188b() {
            return this.f10918c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20186a(C5957e eVar, C6027i iVar) {
            C6326b.m13021a("DecodeJob.encode");
            try {
                eVar.mo20189a().mo20095a(this.f10916a, new C5948e(this.f10917b, this.f10918c, iVar));
            } finally {
                this.f10918c.mo20251b();
                C6326b.m13020a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20185a() {
            this.f10916a = null;
            this.f10917b = null;
            this.f10918c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20177a(boolean z) {
        if (this.f10896l.mo20191a(z)) {
            m11805s();
        }
    }

    /* renamed from: a */
    public int compareTo(C5952h<?> hVar) {
        int o = m11801o() - hVar.m11801o();
        return o == 0 ? this.f10906v - hVar.f10906v : o;
    }

    /* renamed from: a */
    public void mo20176a() {
        this.f10889J = true;
        C5949f fVar = this.f10887H;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: a */
    private void m11795a(C5992u<R> uVar, C5901a aVar) {
        m11808w();
        this.f10905u.mo20183a(uVar, aVar);
    }

    /* renamed from: a */
    private C5960h m11790a(C5960h hVar) {
        int i = C5953a.f10912b[hVar.ordinal()];
        if (i == 1) {
            return this.f10903s.mo20196a() ? C5960h.DATA_CACHE : m11790a(C5960h.DATA_CACHE);
        }
        if (i == 2) {
            return this.f10910z ? C5960h.FINISHED : C5960h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return C5960h.FINISHED;
        }
        if (i == 5) {
            return this.f10903s.mo20199b() ? C5960h.RESOURCE_CACHE : m11790a(C5960h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    /* renamed from: a */
    public void mo20147a(C6022f fVar, Object obj, C6034d<?> dVar, C5901a aVar, C6022f fVar2) {
        this.f10882C = fVar;
        this.f10884E = obj;
        this.f10886G = dVar;
        this.f10885F = aVar;
        this.f10883D = fVar2;
        if (Thread.currentThread() != this.f10881B) {
            this.f10908x = C5959g.DECODE_DATA;
            this.f10905u.mo20182a((C5952h<?>) this);
            return;
        }
        C6326b.m13021a("DecodeJob.decodeFromRetrievedData");
        try {
            m11799l();
        } finally {
            C6326b.m13020a();
        }
    }

    /* renamed from: a */
    public void mo20146a(C6022f fVar, Exception exc, C6034d<?> dVar, C5901a aVar) {
        dVar.mo20329b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.mo20071a(fVar, aVar, dVar.mo20323a());
        this.f10891g.add(glideException);
        if (Thread.currentThread() != this.f10881B) {
            this.f10908x = C5959g.SWITCH_TO_SOURCE_SERVICE;
            this.f10905u.mo20182a((C5952h<?>) this);
            return;
        }
        m11806t();
    }

    /* renamed from: a */
    private <Data> C5992u<R> m11791a(C6034d<?> dVar, Data data, C5901a aVar) throws GlideException {
        if (data == null) {
            dVar.mo20329b();
            return null;
        }
        try {
            long a = C6311f.m12965a();
            C5992u<R> a2 = m11792a(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m11796a("Decoded result " + a2, a);
            }
            return a2;
        } finally {
            dVar.mo20329b();
        }
    }

    /* renamed from: a */
    private <Data> C5992u<R> m11792a(Data data, C5901a aVar) throws GlideException {
        return m11793a(data, aVar, this.f10890f.mo20150a(data.getClass()));
    }

    /* renamed from: a */
    private C6027i m11794a(C5901a aVar) {
        C6027i iVar = this.f10904t;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == C5901a.RESOURCE_DISK_CACHE || this.f10890f.mo20172o();
        Boolean bool = (Boolean) iVar.mo20316a(C6167l.f11272h);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        C6027i iVar2 = new C6027i();
        iVar2.mo20317a(this.f10904t);
        iVar2.mo20315a(C6167l.f11272h, Boolean.valueOf(z));
        return iVar2;
    }

    /* renamed from: a */
    private <Data, ResourceType> C5992u<R> m11793a(Data data, C5901a aVar, C5989s<Data, ResourceType, R> sVar) throws GlideException {
        C6027i a = m11794a(aVar);
        C6036e b = this.f10897m.mo19979f().mo19946b(data);
        try {
            return sVar.mo20249a(b, a, this.f10901q, this.f10902r, new C5955c(aVar));
        } finally {
            b.mo20338b();
        }
    }

    /* renamed from: a */
    private void m11796a(String str, long j) {
        m11797a(str, j, (String) null);
    }

    /* renamed from: a */
    private void m11797a(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C6311f.m12964a(j));
        sb.append(", load key: ");
        sb.append(this.f10900p);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.bumptech.glide.load.engine.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.engine.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.bumptech.glide.load.engine.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.bumptech.glide.load.engine.w} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.engine.C5992u<Z> mo20175a(com.bumptech.glide.load.C5901a r12, com.bumptech.glide.load.engine.C5992u<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C5901a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.g<R> r0 = r11.f10890f
            com.bumptech.glide.load.l r0 = r0.mo20157b(r8)
            com.bumptech.glide.e r2 = r11.f10897m
            int r3 = r11.f10901q
            int r4 = r11.f10902r
            com.bumptech.glide.load.engine.u r2 = r0.transform(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo20235a()
        L_0x002b:
            com.bumptech.glide.load.engine.g<R> r13 = r11.f10890f
            boolean r13 = r13.mo20158b((com.bumptech.glide.load.engine.C5992u<?>) r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.engine.g<R> r13 = r11.f10890f
            com.bumptech.glide.load.k r1 = r13.mo20151a(r0)
            com.bumptech.glide.load.i r13 = r11.f10904t
            com.bumptech.glide.load.c r13 = r1.mo20321a(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.c r13 = com.bumptech.glide.load.C5903c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.engine.g<R> r1 = r11.f10890f
            com.bumptech.glide.load.f r2 = r11.f10882C
            boolean r1 = r1.mo20155a((com.bumptech.glide.load.C6022f) r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.engine.j r3 = r11.f10903s
            boolean r12 = r3.mo20198a(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.engine.C5952h.C5953a.f10913c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.engine.w r12 = new com.bumptech.glide.load.engine.w
            com.bumptech.glide.load.engine.g<R> r13 = r11.f10890f
            com.bumptech.glide.load.engine.z.b r2 = r13.mo20156b()
            com.bumptech.glide.load.f r3 = r11.f10882C
            com.bumptech.glide.load.f r4 = r11.f10898n
            int r5 = r11.f10901q
            int r6 = r11.f10902r
            com.bumptech.glide.load.i r9 = r11.f10904t
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.engine.d r12 = new com.bumptech.glide.load.engine.d
            com.bumptech.glide.load.f r13 = r11.f10882C
            com.bumptech.glide.load.f r1 = r11.f10898n
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.engine.t r0 = com.bumptech.glide.load.engine.C5990t.m11924b(r0)
            com.bumptech.glide.load.engine.h$d<?> r13 = r11.f10895k
            r13.mo20187a(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5952h.mo20175a(com.bumptech.glide.load.a, com.bumptech.glide.load.engine.u):com.bumptech.glide.load.engine.u");
    }
}
