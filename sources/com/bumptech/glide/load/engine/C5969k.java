package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.C5876e;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.C5952h;
import com.bumptech.glide.load.engine.C5985p;
import com.bumptech.glide.load.engine.p144a0.C5913a;
import com.bumptech.glide.load.engine.p144a0.C5916b;
import com.bumptech.glide.load.engine.p144a0.C5926h;
import com.bumptech.glide.load.engine.p145b0.C5936a;
import com.bumptech.glide.p162p.C6274i;
import com.bumptech.glide.p166r.C6311f;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.p167l.C6318a;
import java.util.Map;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.engine.k */
/* compiled from: Engine */
public class C5969k implements C5982m, C5926h.C5927a, C5985p.C5986a {

    /* renamed from: i */
    private static final boolean f10942i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C5988r f10943a;

    /* renamed from: b */
    private final C5984o f10944b;

    /* renamed from: c */
    private final C5926h f10945c;

    /* renamed from: d */
    private final C5972b f10946d;

    /* renamed from: e */
    private final C5995x f10947e;

    /* renamed from: f */
    private final C5974c f10948f;

    /* renamed from: g */
    private final C5970a f10949g;

    /* renamed from: h */
    private final C5907a f10950h;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    /* compiled from: Engine */
    static class C5970a {

        /* renamed from: a */
        final C5952h.C5957e f10951a;

        /* renamed from: b */
        final C5005e<C5952h<?>> f10952b = C6318a.m13006a(150, new C5971a());

        /* renamed from: c */
        private int f10953c;

        /* renamed from: com.bumptech.glide.load.engine.k$a$a */
        /* compiled from: Engine */
        class C5971a implements C6318a.C6322d<C5952h<?>> {
            C5971a() {
            }

            /* renamed from: a */
            public C5952h<?> m11873a() {
                C5970a aVar = C5970a.this;
                return new C5952h<>(aVar.f10951a, aVar.f10952b);
            }
        }

        C5970a(C5952h.C5957e eVar) {
            this.f10951a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C5952h<R> mo20205a(C5876e eVar, Object obj, C5983n nVar, C6022f fVar, int i, int i2, Class<?> cls, Class<R> cls2, C5878g gVar, C5963j jVar, Map<Class<?>, C6030l<?>> map, boolean z, boolean z2, boolean z3, C6027i iVar, C5952h.C5954b<R> bVar) {
            C5952h<R> a = this.f10952b.mo17456a();
            C6315j.m12978a(a);
            C5952h<R> hVar = a;
            int i3 = this.f10953c;
            int i4 = i3;
            this.f10953c = i3 + 1;
            hVar.mo20174a(eVar, obj, nVar, fVar, i, i2, cls, cls2, gVar, jVar, map, z, z2, z3, iVar, bVar, i4);
            return hVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$b */
    /* compiled from: Engine */
    static class C5972b {

        /* renamed from: a */
        final C5936a f10955a;

        /* renamed from: b */
        final C5936a f10956b;

        /* renamed from: c */
        final C5936a f10957c;

        /* renamed from: d */
        final C5936a f10958d;

        /* renamed from: e */
        final C5982m f10959e;

        /* renamed from: f */
        final C5005e<C5976l<?>> f10960f = C6318a.m13006a(150, new C5973a());

        /* renamed from: com.bumptech.glide.load.engine.k$b$a */
        /* compiled from: Engine */
        class C5973a implements C6318a.C6322d<C5976l<?>> {
            C5973a() {
            }

            /* renamed from: a */
            public C5976l<?> m11876a() {
                C5972b bVar = C5972b.this;
                return new C5976l(bVar.f10955a, bVar.f10956b, bVar.f10957c, bVar.f10958d, bVar.f10959e, bVar.f10960f);
            }
        }

        C5972b(C5936a aVar, C5936a aVar2, C5936a aVar3, C5936a aVar4, C5982m mVar) {
            this.f10955a = aVar;
            this.f10956b = aVar2;
            this.f10957c = aVar3;
            this.f10958d = aVar4;
            this.f10959e = mVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C5976l<R> mo20206a(C6022f fVar, boolean z, boolean z2, boolean z3, boolean z4) {
            C5976l<R> a = this.f10960f.mo17456a();
            C6315j.m12978a(a);
            C5976l<R> lVar = a;
            lVar.mo20208a(fVar, z, z2, z3, z4);
            return lVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$c */
    /* compiled from: Engine */
    private static class C5974c implements C5952h.C5957e {

        /* renamed from: a */
        private final C5913a.C5914a f10962a;

        /* renamed from: b */
        private volatile C5913a f10963b;

        C5974c(C5913a.C5914a aVar) {
            this.f10962a = aVar;
        }

        /* renamed from: a */
        public C5913a mo20189a() {
            if (this.f10963b == null) {
                synchronized (this) {
                    if (this.f10963b == null) {
                        this.f10963b = this.f10962a.mo20096a();
                    }
                    if (this.f10963b == null) {
                        this.f10963b = new C5916b();
                    }
                }
            }
            return this.f10963b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$d */
    /* compiled from: Engine */
    public class C5975d {

        /* renamed from: a */
        private final C5976l<?> f10964a;

        /* renamed from: b */
        private final C6274i f10965b;

        C5975d(C6274i iVar, C5976l<?> lVar) {
            this.f10965b = iVar;
            this.f10964a = lVar;
        }

        /* renamed from: a */
        public void mo20207a() {
            synchronized (C5969k.this) {
                this.f10964a.mo20217c(this.f10965b);
            }
        }
    }

    public C5969k(C5926h hVar, C5913a.C5914a aVar, C5936a aVar2, C5936a aVar3, C5936a aVar4, C5936a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (C5988r) null, (C5984o) null, (C5907a) null, (C5972b) null, (C5970a) null, (C5995x) null, z);
    }

    /* renamed from: b */
    private C5985p<?> m11864b(C6022f fVar, boolean z) {
        if (!z) {
            return null;
        }
        C5985p<?> a = m11861a(fVar);
        if (a != null) {
            a.mo20237b();
            this.f10950h.mo20087a(fVar, a);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <R> com.bumptech.glide.load.engine.C5969k.C5975d mo20200a(com.bumptech.glide.C5876e r31, java.lang.Object r32, com.bumptech.glide.load.C6022f r33, int r34, int r35, java.lang.Class<?> r36, java.lang.Class<R> r37, com.bumptech.glide.C5878g r38, com.bumptech.glide.load.engine.C5963j r39, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.C6030l<?>> r40, boolean r41, boolean r42, com.bumptech.glide.load.C6027i r43, boolean r44, boolean r45, boolean r46, boolean r47, com.bumptech.glide.p162p.C6274i r48, java.util.concurrent.Executor r49) {
        /*
            r30 = this;
            r1 = r30
            r0 = r44
            r8 = r48
            r9 = r49
            monitor-enter(r30)
            boolean r2 = f10942i     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0012
            long r2 = com.bumptech.glide.p166r.C6311f.m12965a()     // Catch:{ all -> 0x00c5 }
            goto L_0x0014
        L_0x0012:
            r2 = 0
        L_0x0014:
            r10 = r2
            com.bumptech.glide.load.engine.o r12 = r1.f10944b     // Catch:{ all -> 0x00c5 }
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r40
            r18 = r36
            r19 = r37
            r20 = r43
            com.bumptech.glide.load.engine.n r12 = r12.mo20234a(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00c5 }
            com.bumptech.glide.load.engine.p r2 = r1.m11862a((com.bumptech.glide.load.C6022f) r12, (boolean) r0)     // Catch:{ all -> 0x00c5 }
            r3 = 0
            if (r2 == 0) goto L_0x0042
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C5901a.MEMORY_CACHE     // Catch:{ all -> 0x00c5 }
            r8.mo20709a(r2, r0)     // Catch:{ all -> 0x00c5 }
            boolean r0 = f10942i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "Loaded resource from active resources"
            m11863a((java.lang.String) r0, (long) r10, (com.bumptech.glide.load.C6022f) r12)     // Catch:{ all -> 0x00c5 }
        L_0x0040:
            monitor-exit(r30)
            return r3
        L_0x0042:
            com.bumptech.glide.load.engine.p r2 = r1.m11864b(r12, r0)     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0058
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C5901a.MEMORY_CACHE     // Catch:{ all -> 0x00c5 }
            r8.mo20709a(r2, r0)     // Catch:{ all -> 0x00c5 }
            boolean r0 = f10942i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "Loaded resource from cache"
            m11863a((java.lang.String) r0, (long) r10, (com.bumptech.glide.load.C6022f) r12)     // Catch:{ all -> 0x00c5 }
        L_0x0056:
            monitor-exit(r30)
            return r3
        L_0x0058:
            com.bumptech.glide.load.engine.r r2 = r1.f10943a     // Catch:{ all -> 0x00c5 }
            r15 = r47
            com.bumptech.glide.load.engine.l r2 = r2.mo20246a((com.bumptech.glide.load.C6022f) r12, (boolean) r15)     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0075
            r2.mo20212a((com.bumptech.glide.p162p.C6274i) r8, (java.util.concurrent.Executor) r9)     // Catch:{ all -> 0x00c5 }
            boolean r0 = f10942i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "Added to existing load"
            m11863a((java.lang.String) r0, (long) r10, (com.bumptech.glide.load.C6022f) r12)     // Catch:{ all -> 0x00c5 }
        L_0x006e:
            com.bumptech.glide.load.engine.k$d r0 = new com.bumptech.glide.load.engine.k$d     // Catch:{ all -> 0x00c5 }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r30)
            return r0
        L_0x0075:
            com.bumptech.glide.load.engine.k$b r2 = r1.f10946d     // Catch:{ all -> 0x00c5 }
            r3 = r12
            r4 = r44
            r5 = r45
            r6 = r46
            r7 = r47
            com.bumptech.glide.load.engine.l r0 = r2.mo20206a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c5 }
            com.bumptech.glide.load.engine.k$a r13 = r1.f10949g     // Catch:{ all -> 0x00c5 }
            r14 = r31
            r15 = r32
            r16 = r12
            r17 = r33
            r18 = r34
            r19 = r35
            r20 = r36
            r21 = r37
            r22 = r38
            r23 = r39
            r24 = r40
            r25 = r41
            r26 = r42
            r27 = r47
            r28 = r43
            r29 = r0
            com.bumptech.glide.load.engine.h r2 = r13.mo20205a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x00c5 }
            com.bumptech.glide.load.engine.r r3 = r1.f10943a     // Catch:{ all -> 0x00c5 }
            r3.mo20247a((com.bumptech.glide.load.C6022f) r12, (com.bumptech.glide.load.engine.C5976l<?>) r0)     // Catch:{ all -> 0x00c5 }
            r0.mo20212a((com.bumptech.glide.p162p.C6274i) r8, (java.util.concurrent.Executor) r9)     // Catch:{ all -> 0x00c5 }
            r0.mo20214b(r2)     // Catch:{ all -> 0x00c5 }
            boolean r2 = f10942i     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = "Started new load"
            m11863a((java.lang.String) r2, (long) r10, (com.bumptech.glide.load.C6022f) r12)     // Catch:{ all -> 0x00c5 }
        L_0x00be:
            com.bumptech.glide.load.engine.k$d r2 = new com.bumptech.glide.load.engine.k$d     // Catch:{ all -> 0x00c5 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r30)
            return r2
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r30)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5969k.mo20200a(com.bumptech.glide.e, java.lang.Object, com.bumptech.glide.load.f, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.g, com.bumptech.glide.load.engine.j, java.util.Map, boolean, boolean, com.bumptech.glide.load.i, boolean, boolean, boolean, boolean, com.bumptech.glide.p.i, java.util.concurrent.Executor):com.bumptech.glide.load.engine.k$d");
    }

    C5969k(C5926h hVar, C5913a.C5914a aVar, C5936a aVar2, C5936a aVar3, C5936a aVar4, C5936a aVar5, C5988r rVar, C5984o oVar, C5907a aVar6, C5972b bVar, C5970a aVar7, C5995x xVar, boolean z) {
        this.f10945c = hVar;
        C5913a.C5914a aVar8 = aVar;
        this.f10948f = new C5974c(aVar);
        C5907a aVar9 = aVar6 == null ? new C5907a(z) : aVar6;
        this.f10950h = aVar9;
        aVar9.mo20085a((C5985p.C5986a) this);
        this.f10944b = oVar == null ? new C5984o() : oVar;
        this.f10943a = rVar == null ? new C5988r() : rVar;
        this.f10946d = bVar == null ? new C5972b(aVar2, aVar3, aVar4, aVar5, this) : bVar;
        this.f10949g = aVar7 == null ? new C5970a(this.f10948f) : aVar7;
        this.f10947e = xVar == null ? new C5995x() : xVar;
        hVar.mo20107a((C5926h.C5927a) this);
    }

    /* renamed from: b */
    public void mo20204b(C5992u<?> uVar) {
        if (uVar instanceof C5985p) {
            ((C5985p) uVar).mo20242g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: a */
    private static void m11863a(String str, long j, C6022f fVar) {
        Log.v("Engine", str + " in " + C6311f.m12964a(j) + "ms, key: " + fVar);
    }

    /* renamed from: a */
    private C5985p<?> m11862a(C6022f fVar, boolean z) {
        if (!z) {
            return null;
        }
        C5985p<?> b = this.f10950h.mo20088b(fVar);
        if (b != null) {
            b.mo20237b();
        }
        return b;
    }

    /* renamed from: a */
    private C5985p<?> m11861a(C6022f fVar) {
        C5992u<?> a = this.f10945c.mo20104a(fVar);
        if (a == null) {
            return null;
        }
        if (a instanceof C5985p) {
            return (C5985p) a;
        }
        return new C5985p<>(a, true, true);
    }

    /* renamed from: a */
    public synchronized void mo20202a(C5976l<?> lVar, C6022f fVar, C5985p<?> pVar) {
        if (pVar != null) {
            pVar.mo20236a(fVar, this);
            if (pVar.mo20241f()) {
                this.f10950h.mo20087a(fVar, pVar);
            }
        }
        this.f10943a.mo20248b(fVar, lVar);
    }

    /* renamed from: a */
    public synchronized void mo20201a(C5976l<?> lVar, C6022f fVar) {
        this.f10943a.mo20248b(fVar, lVar);
    }

    /* renamed from: a */
    public void mo20112a(C5992u<?> uVar) {
        this.f10947e.mo20253a(uVar);
    }

    /* renamed from: a */
    public synchronized void mo20203a(C6022f fVar, C5985p<?> pVar) {
        this.f10950h.mo20086a(fVar);
        if (pVar.mo20241f()) {
            this.f10945c.mo20105a(fVar, pVar);
        } else {
            this.f10947e.mo20253a(pVar);
        }
    }
}
