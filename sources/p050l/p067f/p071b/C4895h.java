package p050l.p067f.p071b;

import java.util.Arrays;
import java.util.Comparator;
import p050l.p067f.p071b.C4886b;

/* renamed from: l.f.b.h */
/* compiled from: PriorityGoalRow */
public class C4895h extends C4886b {

    /* renamed from: g */
    private int f8471g = 128;

    /* renamed from: h */
    private C4898i[] f8472h = new C4898i[128];

    /* renamed from: i */
    private C4898i[] f8473i = new C4898i[128];

    /* renamed from: j */
    private int f8474j = 0;

    /* renamed from: k */
    C4897b f8475k = new C4897b(this);

    /* renamed from: l.f.b.h$a */
    /* compiled from: PriorityGoalRow */
    class C4896a implements Comparator<C4898i> {
        C4896a(C4895h hVar) {
        }

        /* renamed from: a */
        public int compare(C4898i iVar, C4898i iVar2) {
            return iVar.f8481c - iVar2.f8481c;
        }
    }

    /* renamed from: l.f.b.h$b */
    /* compiled from: PriorityGoalRow */
    class C4897b implements Comparable {

        /* renamed from: f */
        C4898i f8476f;

        public C4897b(C4895h hVar) {
        }

        /* renamed from: a */
        public void mo17127a(C4898i iVar) {
            this.f8476f = iVar;
        }

        /* renamed from: b */
        public final boolean mo17130b(C4898i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.f8487i[i];
                float f2 = this.f8476f.f8487i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public int compareTo(Object obj) {
            return this.f8476f.f8481c - ((C4898i) obj).f8481c;
        }

        /* renamed from: d */
        public void mo17132d() {
            Arrays.fill(this.f8476f.f8487i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f8476f != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f8476f.f8487i[i] + " ";
                }
            }
            return str + "] " + this.f8476f;
        }

        /* renamed from: a */
        public boolean mo17129a(C4898i iVar, float f) {
            boolean z = true;
            if (this.f8476f.f8479a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f8476f.f8487i;
                    fArr[i] = fArr[i] + (iVar.f8487i[i] * f);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.f8476f.f8487i[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C4895h.this.m8349f(this.f8476f);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = iVar.f8487i[i2];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.f8476f.f8487i[i2] = f3;
                } else {
                    this.f8476f.f8487i[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo17128a() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f8476f.f8487i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }
    }

    public C4895h(C4888c cVar) {
        super(cVar);
    }

    /* renamed from: e */
    private final void m8348e(C4898i iVar) {
        int i;
        int i2 = this.f8474j + 1;
        C4898i[] iVarArr = this.f8472h;
        if (i2 > iVarArr.length) {
            C4898i[] iVarArr2 = (C4898i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f8472h = iVarArr2;
            this.f8473i = (C4898i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        C4898i[] iVarArr3 = this.f8472h;
        int i3 = this.f8474j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f8474j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f8481c > iVar.f8481c) {
            int i5 = 0;
            while (true) {
                i = this.f8474j;
                if (i5 >= i) {
                    break;
                }
                this.f8473i[i5] = this.f8472h[i5];
                i5++;
            }
            Arrays.sort(this.f8473i, 0, i, new C4896a(this));
            for (int i6 = 0; i6 < this.f8474j; i6++) {
                this.f8472h[i6] = this.f8473i[i6];
            }
        }
        iVar.f8479a = true;
        iVar.mo17135a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m8349f(C4898i iVar) {
        int i = 0;
        while (i < this.f8474j) {
            if (this.f8472h[i] == iVar) {
                while (true) {
                    int i2 = this.f8474j;
                    if (i < i2 - 1) {
                        C4898i[] iVarArr = this.f8472h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f8474j = i2 - 1;
                        iVar.f8479a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    public void clear() {
        this.f8474j = 0;
        this.f8407b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f8474j == 0;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f8407b + ") : ";
        for (int i = 0; i < this.f8474j; i++) {
            this.f8475k.mo17127a(this.f8472h[i]);
            str = str + this.f8475k + " ";
        }
        return str;
    }

    /* renamed from: a */
    public C4898i mo17077a(C4889d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f8474j; i2++) {
            C4898i iVar = this.f8472h[i2];
            if (!zArr[iVar.f8481c]) {
                this.f8475k.mo17127a(iVar);
                if (i == -1) {
                    if (!this.f8475k.mo17128a()) {
                    }
                } else if (!this.f8475k.mo17130b(this.f8472h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f8472h[i];
    }

    /* renamed from: a */
    public void mo17082a(C4898i iVar) {
        this.f8475k.mo17127a(iVar);
        this.f8475k.mo17132d();
        iVar.f8487i[iVar.f8483e] = 1.0f;
        m8348e(iVar);
    }

    /* renamed from: a */
    public void mo17080a(C4889d dVar, C4886b bVar, boolean z) {
        C4898i iVar = bVar.f8406a;
        if (iVar != null) {
            C4886b.C4887a aVar = bVar.f8410e;
            int a = aVar.mo17059a();
            for (int i = 0; i < a; i++) {
                C4898i a2 = aVar.mo17060a(i);
                float b = aVar.mo17064b(i);
                this.f8475k.mo17127a(a2);
                if (this.f8475k.mo17129a(iVar, b)) {
                    m8348e(a2);
                }
                this.f8407b += bVar.f8407b * b;
            }
            m8349f(iVar);
        }
    }
}
