package androidx.lifecycle;

import androidx.lifecycle.C0514f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p050l.p059b.p060a.p062b.C4840a;
import p050l.p059b.p060a.p062b.C4841b;

/* renamed from: androidx.lifecycle.k */
/* compiled from: LifecycleRegistry */
public class C0522k extends C0514f {

    /* renamed from: a */
    private C4840a<C0520i, C0524b> f2173a = new C4840a<>();

    /* renamed from: b */
    private C0514f.C0516b f2174b;

    /* renamed from: c */
    private final WeakReference<C0521j> f2175c;

    /* renamed from: d */
    private int f2176d = 0;

    /* renamed from: e */
    private boolean f2177e = false;

    /* renamed from: f */
    private boolean f2178f = false;

    /* renamed from: g */
    private ArrayList<C0514f.C0516b> f2179g = new ArrayList<>();

    /* renamed from: androidx.lifecycle.k$a */
    /* compiled from: LifecycleRegistry */
    static /* synthetic */ class C0523a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2180a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2181b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                androidx.lifecycle.f$b[] r0 = androidx.lifecycle.C0514f.C0516b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2181b = r0
                r1 = 1
                androidx.lifecycle.f$b r2 = androidx.lifecycle.C0514f.C0516b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2181b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.f$b r3 = androidx.lifecycle.C0514f.C0516b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2181b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.f$b r4 = androidx.lifecycle.C0514f.C0516b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2181b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.f$b r5 = androidx.lifecycle.C0514f.C0516b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f2181b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.f$b r6 = androidx.lifecycle.C0514f.C0516b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.lifecycle.f$a[] r5 = androidx.lifecycle.C0514f.C0515a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f2180a = r5
                androidx.lifecycle.f$a r6 = androidx.lifecycle.C0514f.C0515a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f2180a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.f$a r5 = androidx.lifecycle.C0514f.C0515a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f2180a     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f2180a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f2180a     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f2180a     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f2180a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0522k.C0523a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.k$b */
    /* compiled from: LifecycleRegistry */
    static class C0524b {

        /* renamed from: a */
        C0514f.C0516b f2182a;

        /* renamed from: b */
        C0519h f2183b;

        C0524b(C0520i iVar, C0514f.C0516b bVar) {
            this.f2183b = C0527n.m2596a((Object) iVar);
            this.f2182a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3045a(C0521j jVar, C0514f.C0515a aVar) {
            C0514f.C0516b b = C0522k.m2578b(aVar);
            this.f2182a = C0522k.m2576a(this.f2182a, b);
            this.f2183b.mo136a(jVar, aVar);
            this.f2182a = b;
        }
    }

    public C0522k(C0521j jVar) {
        this.f2175c = new WeakReference<>(jVar);
        this.f2174b = C0514f.C0516b.INITIALIZED;
    }

    /* renamed from: c */
    private C0514f.C0516b m2582c(C0520i iVar) {
        Map.Entry<C0520i, C0524b> b = this.f2173a.mo16848b(iVar);
        C0514f.C0516b bVar = null;
        C0514f.C0516b bVar2 = b != null ? b.getValue().f2182a : null;
        if (!this.f2179g.isEmpty()) {
            ArrayList<C0514f.C0516b> arrayList = this.f2179g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m2576a(m2576a(this.f2174b, bVar2), bVar);
    }

    /* renamed from: d */
    private void m2585d(C0514f.C0516b bVar) {
        if (this.f2174b != bVar) {
            this.f2174b = bVar;
            if (this.f2177e || this.f2176d != 0) {
                this.f2178f = true;
                return;
            }
            this.f2177e = true;
            m2584d();
            this.f2177e = false;
        }
    }

    /* renamed from: e */
    private void m2586e(C0514f.C0516b bVar) {
        this.f2179g.add(bVar);
    }

    /* renamed from: f */
    private static C0514f.C0515a m2587f(C0514f.C0516b bVar) {
        int i = C0523a.f2181b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0514f.C0515a.ON_START;
            }
            if (i == 3) {
                return C0514f.C0515a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return C0514f.C0515a.ON_CREATE;
    }

    @Deprecated
    /* renamed from: a */
    public void mo3043a(C0514f.C0516b bVar) {
        mo3044b(bVar);
    }

    /* renamed from: b */
    public void mo3044b(C0514f.C0516b bVar) {
        m2585d(bVar);
    }

    /* renamed from: b */
    private boolean m2580b() {
        if (this.f2173a.size() == 0) {
            return true;
        }
        C0514f.C0516b bVar = this.f2173a.mo16851a().getValue().f2182a;
        C0514f.C0516b bVar2 = this.f2173a.mo16854c().getValue().f2182a;
        if (bVar == bVar2 && this.f2174b == bVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo3042a(C0514f.C0515a aVar) {
        m2585d(m2578b(aVar));
    }

    /* renamed from: a */
    public void mo3039a(C0520i iVar) {
        C0521j jVar;
        C0514f.C0516b bVar = this.f2174b;
        C0514f.C0516b bVar2 = C0514f.C0516b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0514f.C0516b.INITIALIZED;
        }
        C0524b bVar3 = new C0524b(iVar, bVar2);
        if (this.f2173a.mo16847b(iVar, bVar3) == null && (jVar = (C0521j) this.f2175c.get()) != null) {
            boolean z = this.f2176d != 0 || this.f2177e;
            C0514f.C0516b c = m2582c(iVar);
            this.f2176d++;
            while (bVar3.f2182a.compareTo(c) < 0 && this.f2173a.contains(iVar)) {
                m2586e(bVar3.f2182a);
                bVar3.mo3045a(jVar, m2587f(bVar3.f2182a));
                m2583c();
                c = m2582c(iVar);
            }
            if (!z) {
                m2584d();
            }
            this.f2176d--;
        }
    }

    /* renamed from: c */
    private void m2583c() {
        ArrayList<C0514f.C0516b> arrayList = this.f2179g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: c */
    private static C0514f.C0515a m2581c(C0514f.C0516b bVar) {
        int i = C0523a.f2181b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0514f.C0515a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0514f.C0515a.ON_STOP;
            }
            if (i == 4) {
                return C0514f.C0515a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public void mo3040b(C0520i iVar) {
        this.f2173a.remove(iVar);
    }

    /* renamed from: b */
    static C0514f.C0516b m2578b(C0514f.C0515a aVar) {
        switch (C0523a.f2180a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0514f.C0516b.CREATED;
            case 3:
            case 4:
                return C0514f.C0516b.STARTED;
            case 5:
                return C0514f.C0516b.RESUMED;
            case 6:
                return C0514f.C0516b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: d */
    private void m2584d() {
        C0521j jVar = (C0521j) this.f2175c.get();
        if (jVar != null) {
            while (!m2580b()) {
                this.f2178f = false;
                if (this.f2174b.compareTo(this.f2173a.mo16851a().getValue().f2182a) < 0) {
                    m2577a(jVar);
                }
                Map.Entry<C0520i, C0524b> c = this.f2173a.mo16854c();
                if (!this.f2178f && c != null && this.f2174b.compareTo(c.getValue().f2182a) > 0) {
                    m2579b(jVar);
                }
            }
            this.f2178f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: b */
    private void m2579b(C0521j jVar) {
        C4841b<K, V>.C4753d b = this.f2173a.mo16853b();
        while (b.hasNext() && !this.f2178f) {
            Map.Entry entry = (Map.Entry) b.next();
            C0524b bVar = (C0524b) entry.getValue();
            while (bVar.f2182a.compareTo(this.f2174b) < 0 && !this.f2178f && this.f2173a.contains(entry.getKey())) {
                m2586e(bVar.f2182a);
                bVar.mo3045a(jVar, m2587f(bVar.f2182a));
                m2583c();
            }
        }
    }

    /* renamed from: a */
    public C0514f.C0516b mo3038a() {
        return this.f2174b;
    }

    /* renamed from: a */
    private void m2577a(C0521j jVar) {
        Iterator<Map.Entry<C0520i, C0524b>> descendingIterator = this.f2173a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f2178f) {
            Map.Entry next = descendingIterator.next();
            C0524b bVar = (C0524b) next.getValue();
            while (bVar.f2182a.compareTo(this.f2174b) > 0 && !this.f2178f && this.f2173a.contains(next.getKey())) {
                C0514f.C0515a c = m2581c(bVar.f2182a);
                m2586e(m2578b(c));
                bVar.mo3045a(jVar, c);
                m2583c();
            }
        }
    }

    /* renamed from: a */
    static C0514f.C0516b m2576a(C0514f.C0516b bVar, C0514f.C0516b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }
}
