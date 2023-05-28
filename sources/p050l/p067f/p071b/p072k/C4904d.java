package p050l.p067f.p071b.p072k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p050l.p067f.p071b.C4888c;
import p050l.p067f.p071b.C4898i;
import p050l.p067f.p071b.p072k.p073m.C4929i;
import p050l.p067f.p071b.p072k.p073m.C4937o;

/* renamed from: l.f.b.k.d */
/* compiled from: ConstraintAnchor */
public class C4904d {

    /* renamed from: a */
    private HashSet<C4904d> f8538a = null;

    /* renamed from: b */
    private int f8539b;

    /* renamed from: c */
    private boolean f8540c;

    /* renamed from: d */
    public final C4907e f8541d;

    /* renamed from: e */
    public final C4906b f8542e;

    /* renamed from: f */
    public C4904d f8543f;

    /* renamed from: g */
    public int f8544g = 0;

    /* renamed from: h */
    int f8545h = -1;

    /* renamed from: i */
    C4898i f8546i;

    /* renamed from: l.f.b.k.d$a */
    /* compiled from: ConstraintAnchor */
    static /* synthetic */ class C4905a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8547a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l.f.b.k.d$b[] r0 = p050l.p067f.p071b.p072k.C4904d.C4906b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8547a = r0
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8547a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8547a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8547a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8547a     // Catch:{ NoSuchFieldError -> 0x003e }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8547a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8547a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8547a     // Catch:{ NoSuchFieldError -> 0x0060 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8547a     // Catch:{ NoSuchFieldError -> 0x006c }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.C4904d.C4905a.<clinit>():void");
        }
    }

    /* renamed from: l.f.b.k.d$b */
    /* compiled from: ConstraintAnchor */
    public enum C4906b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C4904d(C4907e eVar, C4906b bVar) {
        this.f8541d = eVar;
        this.f8542e = bVar;
    }

    /* renamed from: a */
    public void mo17160a(int i, ArrayList<C4937o> arrayList, C4937o oVar) {
        HashSet<C4904d> hashSet = this.f8538a;
        if (hashSet != null) {
            Iterator<C4904d> it = hashSet.iterator();
            while (it.hasNext()) {
                C4929i.m8637a(it.next().f8541d, i, arrayList, oVar);
            }
        }
    }

    /* renamed from: b */
    public int mo17164b() {
        if (!this.f8540c) {
            return 0;
        }
        return this.f8539b;
    }

    /* renamed from: c */
    public int mo17165c() {
        C4904d dVar;
        if (this.f8541d.mo17179B() == 8) {
            return 0;
        }
        if (this.f8545h <= -1 || (dVar = this.f8543f) == null || dVar.f8541d.mo17179B() != 8) {
            return this.f8544g;
        }
        return this.f8545h;
    }

    /* renamed from: d */
    public final C4904d mo17166d() {
        switch (C4905a.f8547a[this.f8542e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f8541d.f8566H;
            case 3:
                return this.f8541d.f8564F;
            case 4:
                return this.f8541d.f8567I;
            case 5:
                return this.f8541d.f8565G;
            default:
                throw new AssertionError(this.f8542e.name());
        }
    }

    /* renamed from: e */
    public C4907e mo17167e() {
        return this.f8541d;
    }

    /* renamed from: f */
    public C4898i mo17168f() {
        return this.f8546i;
    }

    /* renamed from: g */
    public C4904d mo17169g() {
        return this.f8543f;
    }

    /* renamed from: h */
    public C4906b mo17170h() {
        return this.f8542e;
    }

    /* renamed from: i */
    public boolean mo17171i() {
        HashSet<C4904d> hashSet = this.f8538a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C4904d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo17166d().mo17174l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo17172j() {
        HashSet<C4904d> hashSet = this.f8538a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo17173k() {
        return this.f8540c;
    }

    /* renamed from: l */
    public boolean mo17174l() {
        return this.f8543f != null;
    }

    /* renamed from: m */
    public void mo17175m() {
        HashSet<C4904d> hashSet;
        C4904d dVar = this.f8543f;
        if (!(dVar == null || (hashSet = dVar.f8538a) == null)) {
            hashSet.remove(this);
            if (this.f8543f.f8538a.size() == 0) {
                this.f8543f.f8538a = null;
            }
        }
        this.f8538a = null;
        this.f8543f = null;
        this.f8544g = 0;
        this.f8545h = -1;
        this.f8540c = false;
        this.f8539b = 0;
    }

    /* renamed from: n */
    public void mo17176n() {
        this.f8540c = false;
        this.f8539b = 0;
    }

    public String toString() {
        return this.f8541d.mo17238h() + ":" + this.f8542e.toString();
    }

    /* renamed from: a */
    public HashSet<C4904d> mo17158a() {
        return this.f8538a;
    }

    /* renamed from: a */
    public void mo17159a(int i) {
        this.f8539b = i;
        this.f8540c = true;
    }

    /* renamed from: a */
    public void mo17161a(C4888c cVar) {
        C4898i iVar = this.f8546i;
        if (iVar == null) {
            this.f8546i = new C4898i(C4898i.C4899a.UNRESTRICTED, (String) null);
        } else {
            iVar.mo17134a();
        }
    }

    /* renamed from: a */
    public boolean mo17163a(C4904d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            mo17175m();
            return true;
        } else if (!z && !mo17162a(dVar)) {
            return false;
        } else {
            this.f8543f = dVar;
            if (dVar.f8538a == null) {
                dVar.f8538a = new HashSet<>();
            }
            HashSet<C4904d> hashSet = this.f8543f.f8538a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.f8544g = i;
            } else {
                this.f8544g = 0;
            }
            this.f8545h = i2;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo17162a(C4904d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        C4906b h = dVar.mo17170h();
        C4906b bVar = this.f8542e;
        if (h != bVar) {
            switch (C4905a.f8547a[bVar.ordinal()]) {
                case 1:
                    if (h == C4906b.BASELINE || h == C4906b.CENTER_X || h == C4906b.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    boolean z2 = h == C4906b.LEFT || h == C4906b.RIGHT;
                    if (!(dVar.mo17167e() instanceof C4911g)) {
                        return z2;
                    }
                    if (z2 || h == C4906b.CENTER_X) {
                        z = true;
                    }
                    return z;
                case 4:
                case 5:
                    boolean z3 = h == C4906b.TOP || h == C4906b.BOTTOM;
                    if (!(dVar.mo17167e() instanceof C4911g)) {
                        return z3;
                    }
                    if (z3 || h == C4906b.CENTER_Y) {
                        z = true;
                    }
                    return z;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f8542e.name());
            }
        } else if (bVar != C4906b.BASELINE || (dVar.mo17167e().mo17183F() && mo17167e().mo17183F())) {
            return true;
        } else {
            return false;
        }
    }
}
