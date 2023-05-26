package p050l.p067f.p071b.p072k.p073m;

import java.util.ArrayList;
import java.util.List;

/* renamed from: l.f.b.k.m.f */
/* compiled from: DependencyNode */
public class C4925f implements C4923d {

    /* renamed from: a */
    public C4923d f8690a = null;

    /* renamed from: b */
    public boolean f8691b = false;

    /* renamed from: c */
    public boolean f8692c = false;

    /* renamed from: d */
    C4939p f8693d;

    /* renamed from: e */
    C4926a f8694e = C4926a.UNKNOWN;

    /* renamed from: f */
    int f8695f;

    /* renamed from: g */
    public int f8696g;

    /* renamed from: h */
    int f8697h = 1;

    /* renamed from: i */
    C4927g f8698i = null;

    /* renamed from: j */
    public boolean f8699j = false;

    /* renamed from: k */
    List<C4923d> f8700k = new ArrayList();

    /* renamed from: l */
    List<C4925f> f8701l = new ArrayList();

    /* renamed from: l.f.b.k.m.f$a */
    /* compiled from: DependencyNode */
    enum C4926a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C4925f(C4939p pVar) {
        this.f8693d = pVar;
    }

    /* renamed from: a */
    public void mo17332a(int i) {
        if (!this.f8699j) {
            this.f8699j = true;
            this.f8696g = i;
            for (C4923d next : this.f8700k) {
                next.mo17316a(next);
            }
        }
    }

    /* renamed from: b */
    public void mo17333b(C4923d dVar) {
        this.f8700k.add(dVar);
        if (this.f8699j) {
            dVar.mo17316a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8693d.f8729b.mo17238h());
        sb.append(":");
        sb.append(this.f8694e);
        sb.append("(");
        sb.append(this.f8699j ? Integer.valueOf(this.f8696g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f8701l.size());
        sb.append(":d=");
        sb.append(this.f8700k.size());
        sb.append(">");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo17316a(C4923d dVar) {
        for (C4925f fVar : this.f8701l) {
            if (!fVar.f8699j) {
                return;
            }
        }
        this.f8692c = true;
        C4923d dVar2 = this.f8690a;
        if (dVar2 != null) {
            dVar2.mo17316a(this);
        }
        if (this.f8691b) {
            this.f8693d.mo17316a((C4923d) this);
            return;
        }
        C4925f fVar2 = null;
        int i = 0;
        for (C4925f next : this.f8701l) {
            if (!(next instanceof C4927g)) {
                i++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f8699j) {
            C4927g gVar = this.f8698i;
            if (gVar != null) {
                if (gVar.f8699j) {
                    this.f8695f = this.f8697h * gVar.f8696g;
                } else {
                    return;
                }
            }
            mo17332a(fVar2.f8696g + this.f8695f);
        }
        C4923d dVar3 = this.f8690a;
        if (dVar3 != null) {
            dVar3.mo17316a(this);
        }
    }

    /* renamed from: a */
    public void mo17331a() {
        this.f8701l.clear();
        this.f8700k.clear();
        this.f8699j = false;
        this.f8696g = 0;
        this.f8692c = false;
        this.f8691b = false;
    }
}
