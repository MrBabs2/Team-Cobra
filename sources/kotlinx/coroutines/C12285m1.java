package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.m1 */
/* compiled from: JobSupport.kt */
public class C12285m1 extends C12299q1 implements C12297q {

    /* renamed from: g */
    private final boolean f32097g = m40503o();

    public C12285m1(C12277k1 k1Var) {
        super(true);
        mo39004a(k1Var);
    }

    /* renamed from: o */
    private final boolean m40503o() {
        C12299q1 q1Var;
        C12283m g = mo39012g();
        if (!(g instanceof C12286n)) {
            g = null;
        }
        C12286n nVar = (C12286n) g;
        if (!(nVar == null || (q1Var = (C12299q1) nVar.f32112i) == null)) {
            while (!q1Var.mo38988e()) {
                C12283m g2 = q1Var.mo39012g();
                if (!(g2 instanceof C12286n)) {
                    g2 = null;
                }
                C12286n nVar2 = (C12286n) g2;
                if (nVar2 != null) {
                    q1Var = (C12299q1) nVar2.f32112i;
                    if (q1Var == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo38988e() {
        return this.f32097g;
    }

    /* renamed from: f */
    public boolean mo38989f() {
        return true;
    }
}
