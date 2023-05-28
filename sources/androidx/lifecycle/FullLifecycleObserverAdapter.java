package androidx.lifecycle;

import androidx.lifecycle.C0514f;

class FullLifecycleObserverAdapter implements C0519h {

    /* renamed from: a */
    private final C0511c f2135a;

    /* renamed from: b */
    private final C0519h f2136b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C0504a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2137a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.f$a[] r0 = androidx.lifecycle.C0514f.C0515a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2137a = r0
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2137a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2137a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2137a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2137a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2137a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2137a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0514f.C0515a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C0504a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(C0511c cVar, C0519h hVar) {
        this.f2135a = cVar;
        this.f2136b = hVar;
    }

    /* renamed from: a */
    public void mo136a(C0521j jVar, C0514f.C0515a aVar) {
        switch (C0504a.f2137a[aVar.ordinal()]) {
            case 1:
                this.f2135a.mo3032b(jVar);
                break;
            case 2:
                this.f2135a.mo3036f(jVar);
                break;
            case 3:
                this.f2135a.mo3031a(jVar);
                break;
            case 4:
                this.f2135a.mo3033c(jVar);
                break;
            case 5:
                this.f2135a.mo3034d(jVar);
                break;
            case 6:
                this.f2135a.mo3035e(jVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0519h hVar = this.f2136b;
        if (hVar != null) {
            hVar.mo136a(jVar, aVar);
        }
    }
}
