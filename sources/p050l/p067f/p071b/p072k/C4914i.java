package p050l.p067f.p071b.p072k;

import java.util.ArrayList;
import java.util.Arrays;
import p050l.p067f.p071b.p072k.p073m.C4929i;
import p050l.p067f.p071b.p072k.p073m.C4937o;

/* renamed from: l.f.b.k.i */
/* compiled from: HelperWidget */
public class C4914i extends C4907e implements C4913h {

    /* renamed from: p0 */
    public C4907e[] f8659p0 = new C4907e[4];

    /* renamed from: q0 */
    public int f8660q0 = 0;

    /* renamed from: a */
    public void mo17306a(C4907e eVar) {
        if (eVar != this && eVar != null) {
            int i = this.f8660q0 + 1;
            C4907e[] eVarArr = this.f8659p0;
            if (i > eVarArr.length) {
                this.f8659p0 = (C4907e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            C4907e[] eVarArr2 = this.f8659p0;
            int i2 = this.f8660q0;
            eVarArr2[i2] = eVar;
            this.f8660q0 = i2 + 1;
        }
    }

    /* renamed from: a */
    public void mo17307a(C4910f fVar) {
    }

    /* renamed from: w */
    public int mo17295w(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f8660q0; i4++) {
            C4907e eVar = this.f8659p0[i4];
            if (i == 0 && (i3 = eVar.f8610m0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = eVar.f8612n0) != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo17305a() {
        this.f8660q0 = 0;
        Arrays.fill(this.f8659p0, (Object) null);
    }

    /* renamed from: a */
    public void mo17308a(ArrayList<C4937o> arrayList, int i, C4937o oVar) {
        for (int i2 = 0; i2 < this.f8660q0; i2++) {
            oVar.mo17347a(this.f8659p0[i2]);
        }
        for (int i3 = 0; i3 < this.f8660q0; i3++) {
            C4929i.m8637a(this.f8659p0[i3], i, arrayList, oVar);
        }
    }
}
