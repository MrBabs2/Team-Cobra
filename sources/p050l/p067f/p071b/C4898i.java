package p050l.p067f.p071b;

import java.util.Arrays;

/* renamed from: l.f.b.i */
/* compiled from: SolverVariable */
public class C4898i {

    /* renamed from: q */
    private static int f8478q = 1;

    /* renamed from: a */
    public boolean f8479a;

    /* renamed from: b */
    private String f8480b;

    /* renamed from: c */
    public int f8481c = -1;

    /* renamed from: d */
    int f8482d = -1;

    /* renamed from: e */
    public int f8483e = 0;

    /* renamed from: f */
    public float f8484f;

    /* renamed from: g */
    public boolean f8485g = false;

    /* renamed from: h */
    float[] f8486h = new float[9];

    /* renamed from: i */
    float[] f8487i = new float[9];

    /* renamed from: j */
    C4899a f8488j;

    /* renamed from: k */
    C4886b[] f8489k = new C4886b[16];

    /* renamed from: l */
    int f8490l = 0;

    /* renamed from: m */
    public int f8491m = 0;

    /* renamed from: n */
    boolean f8492n = false;

    /* renamed from: o */
    int f8493o = -1;

    /* renamed from: p */
    float f8494p = 0.0f;

    /* renamed from: l.f.b.i$a */
    /* compiled from: SolverVariable */
    public enum C4899a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C4898i(C4899a aVar, String str) {
        this.f8488j = aVar;
    }

    /* renamed from: b */
    static void m8359b() {
        f8478q++;
    }

    /* renamed from: a */
    public final void mo17135a(C4886b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f8490l;
            if (i >= i2) {
                C4886b[] bVarArr = this.f8489k;
                if (i2 >= bVarArr.length) {
                    this.f8489k = (C4886b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C4886b[] bVarArr2 = this.f8489k;
                int i3 = this.f8490l;
                bVarArr2[i3] = bVar;
                this.f8490l = i3 + 1;
                return;
            } else if (this.f8489k[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        if (this.f8480b != null) {
            return "" + this.f8480b;
        }
        return "" + this.f8481c;
    }

    /* renamed from: b */
    public final void mo17139b(C4886b bVar) {
        int i = this.f8490l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f8489k[i2] == bVar) {
                while (i2 < i - 1) {
                    C4886b[] bVarArr = this.f8489k;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f8490l--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo17137a(C4889d dVar, C4886b bVar) {
        int i = this.f8490l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8489k[i2].mo17080a(dVar, bVar, false);
        }
        this.f8490l = 0;
    }

    /* renamed from: a */
    public void mo17136a(C4889d dVar, float f) {
        this.f8484f = f;
        this.f8485g = true;
        this.f8492n = false;
        this.f8493o = -1;
        this.f8494p = 0.0f;
        int i = this.f8490l;
        this.f8482d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8489k[i2].mo17081a(dVar, this, false);
        }
        this.f8490l = 0;
    }

    /* renamed from: a */
    public void mo17134a() {
        this.f8480b = null;
        this.f8488j = C4899a.UNKNOWN;
        this.f8483e = 0;
        this.f8481c = -1;
        this.f8482d = -1;
        this.f8484f = 0.0f;
        this.f8485g = false;
        this.f8492n = false;
        this.f8493o = -1;
        this.f8494p = 0.0f;
        int i = this.f8490l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8489k[i2] = null;
        }
        this.f8490l = 0;
        this.f8491m = 0;
        this.f8479a = false;
        Arrays.fill(this.f8487i, 0.0f);
    }

    /* renamed from: a */
    public void mo17138a(C4899a aVar, String str) {
        this.f8488j = aVar;
    }
}
