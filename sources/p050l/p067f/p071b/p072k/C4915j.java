package p050l.p067f.p071b.p072k;

import p050l.p067f.p071b.C4889d;
import p050l.p067f.p071b.p072k.C4907e;

/* renamed from: l.f.b.k.j */
/* compiled from: Optimizer */
public class C4915j {

    /* renamed from: a */
    static boolean[] f8661a = new boolean[3];

    /* renamed from: a */
    static void m8579a(C4910f fVar, C4889d dVar, C4907e eVar) {
        eVar.f8607l = -1;
        eVar.f8609m = -1;
        if (fVar.f8575Q[0] != C4907e.C4909b.WRAP_CONTENT && eVar.f8575Q[0] == C4907e.C4909b.MATCH_PARENT) {
            int i = eVar.f8564F.f8544g;
            int C = fVar.mo17180C() - eVar.f8566H.f8544g;
            C4904d dVar2 = eVar.f8564F;
            dVar2.f8546i = dVar.mo17104a((Object) dVar2);
            C4904d dVar3 = eVar.f8566H;
            dVar3.f8546i = dVar.mo17104a((Object) dVar3);
            dVar.mo17108a(eVar.f8564F.f8546i, i);
            dVar.mo17108a(eVar.f8566H.f8546i, C);
            eVar.f8607l = 2;
            eVar.mo17223c(i, C);
        }
        if (fVar.f8575Q[1] != C4907e.C4909b.WRAP_CONTENT && eVar.f8575Q[1] == C4907e.C4909b.MATCH_PARENT) {
            int i2 = eVar.f8565G.f8544g;
            int k = fVar.mo17244k() - eVar.f8567I.f8544g;
            C4904d dVar4 = eVar.f8565G;
            dVar4.f8546i = dVar.mo17104a((Object) dVar4);
            C4904d dVar5 = eVar.f8567I;
            dVar5.f8546i = dVar.mo17104a((Object) dVar5);
            dVar.mo17108a(eVar.f8565G.f8546i, i2);
            dVar.mo17108a(eVar.f8567I.f8546i, k);
            if (eVar.f8583Y > 0 || eVar.mo17179B() == 8) {
                C4904d dVar6 = eVar.f8568J;
                dVar6.f8546i = dVar.mo17104a((Object) dVar6);
                dVar.mo17108a(eVar.f8568J.f8546i, eVar.f8583Y + i2);
            }
            eVar.f8609m = 2;
            eVar.mo17235f(i2, k);
        }
    }

    /* renamed from: a */
    public static final boolean m8580a(int i, int i2) {
        return (i & i2) == i2;
    }
}
