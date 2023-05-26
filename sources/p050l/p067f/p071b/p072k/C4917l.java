package p050l.p067f.p071b.p072k;

import java.util.ArrayList;
import p050l.p067f.p071b.C4888c;

/* renamed from: l.f.b.k.l */
/* compiled from: WidgetContainer */
public class C4917l extends C4907e {

    /* renamed from: p0 */
    public ArrayList<C4907e> f8663p0 = new ArrayList<>();

    /* renamed from: P */
    public void mo17191P() {
        this.f8663p0.clear();
        super.mo17191P();
    }

    /* renamed from: R */
    public ArrayList<C4907e> mo17145R() {
        return this.f8663p0;
    }

    /* renamed from: S */
    public void mo17272S() {
        ArrayList<C4907e> arrayList = this.f8663p0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C4907e eVar = this.f8663p0.get(i);
                if (eVar instanceof C4917l) {
                    ((C4917l) eVar).mo17272S();
                }
            }
        }
    }

    /* renamed from: T */
    public void mo17310T() {
        this.f8663p0.clear();
    }

    /* renamed from: a */
    public void mo17311a(C4907e eVar) {
        this.f8663p0.add(eVar);
        if (eVar.mo17266v() != null) {
            ((C4917l) eVar.mo17266v()).mo17312c(eVar);
        }
        eVar.mo17218b((C4907e) this);
    }

    /* renamed from: c */
    public void mo17312c(C4907e eVar) {
        this.f8663p0.remove(eVar);
        eVar.mo17191P();
    }

    /* renamed from: a */
    public void mo17202a(C4888c cVar) {
        super.mo17202a(cVar);
        int size = this.f8663p0.size();
        for (int i = 0; i < size; i++) {
            this.f8663p0.get(i).mo17202a(cVar);
        }
    }
}
