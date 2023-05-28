package p050l.p067f.p071b.p072k.p073m;

import java.util.ArrayList;
import p050l.p067f.p071b.p072k.C4910f;

/* renamed from: l.f.b.k.m.m */
/* compiled from: RunGroup */
class C4934m {

    /* renamed from: d */
    public static int f8715d;

    /* renamed from: a */
    public boolean f8716a;

    /* renamed from: b */
    C4939p f8717b = null;

    /* renamed from: c */
    ArrayList<C4939p> f8718c = new ArrayList<>();

    public C4934m(C4939p pVar, int i) {
        f8715d++;
        this.f8717b = pVar;
    }

    /* renamed from: b */
    private long m8660b(C4925f fVar, long j) {
        C4939p pVar = fVar.f8693d;
        if (pVar instanceof C4931k) {
            return j;
        }
        int size = fVar.f8700k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C4923d dVar = fVar.f8700k.get(i);
            if (dVar instanceof C4925f) {
                C4925f fVar2 = (C4925f) dVar;
                if (fVar2.f8693d != pVar) {
                    j2 = Math.max(j2, m8660b(fVar2, ((long) fVar2.f8695f) + j));
                }
            }
        }
        if (fVar != pVar.f8735h) {
            return j2;
        }
        long d = j + pVar.mo17319d();
        return Math.max(Math.max(j2, m8660b(pVar.f8736i, d)), d - ((long) pVar.f8736i.f8695f));
    }

    /* renamed from: a */
    public void mo17338a(C4939p pVar) {
        this.f8718c.add(pVar);
    }

    /* renamed from: a */
    private long m8659a(C4925f fVar, long j) {
        C4939p pVar = fVar.f8693d;
        if (pVar instanceof C4931k) {
            return j;
        }
        int size = fVar.f8700k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C4923d dVar = fVar.f8700k.get(i);
            if (dVar instanceof C4925f) {
                C4925f fVar2 = (C4925f) dVar;
                if (fVar2.f8693d != pVar) {
                    j2 = Math.min(j2, m8659a(fVar2, ((long) fVar2.f8695f) + j));
                }
            }
        }
        if (fVar != pVar.f8736i) {
            return j2;
        }
        long d = j - pVar.mo17319d();
        return Math.min(Math.min(j2, m8659a(pVar.f8735h, d)), d - ((long) pVar.f8735h.f8695f));
    }

    /* renamed from: a */
    public long mo17337a(C4910f fVar, int i) {
        int i2;
        long j;
        C4939p pVar = this.f8717b;
        long j2 = 0;
        if (pVar instanceof C4922c) {
            if (((C4922c) pVar).f8733f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(pVar instanceof C4932l)) {
                return 0;
            }
        } else if (!(pVar instanceof C4935n)) {
            return 0;
        }
        C4925f fVar2 = (i == 0 ? fVar.f8591d : fVar.f8593e).f8735h;
        C4925f fVar3 = (i == 0 ? fVar.f8591d : fVar.f8593e).f8736i;
        boolean contains = this.f8717b.f8735h.f8701l.contains(fVar2);
        boolean contains2 = this.f8717b.f8736i.f8701l.contains(fVar3);
        long d = this.f8717b.mo17319d();
        if (contains && contains2) {
            long b = m8660b(this.f8717b.f8735h, 0);
            long a = m8659a(this.f8717b.f8736i, 0);
            long j3 = b - d;
            int i3 = this.f8717b.f8736i.f8695f;
            if (j3 >= ((long) (-i3))) {
                j3 += (long) i3;
            }
            int i4 = this.f8717b.f8735h.f8695f;
            long j4 = ((-a) - d) - ((long) i4);
            if (j4 >= ((long) i4)) {
                j4 -= (long) i4;
            }
            float a2 = this.f8717b.f8729b.mo17193a(i);
            if (a2 > 0.0f) {
                j2 = (long) ((((float) j4) / a2) + (((float) j3) / (1.0f - a2)));
            }
            float f = (float) j2;
            long j5 = ((long) ((f * a2) + 0.5f)) + d + ((long) ((f * (1.0f - a2)) + 0.5f));
            C4939p pVar2 = this.f8717b;
            j = ((long) pVar2.f8735h.f8695f) + j5;
            i2 = pVar2.f8736i.f8695f;
        } else if (contains) {
            C4925f fVar4 = this.f8717b.f8735h;
            return Math.max(m8660b(fVar4, (long) fVar4.f8695f), ((long) this.f8717b.f8735h.f8695f) + d);
        } else if (contains2) {
            C4925f fVar5 = this.f8717b.f8736i;
            return Math.max(-m8659a(fVar5, (long) fVar5.f8695f), ((long) (-this.f8717b.f8736i.f8695f)) + d);
        } else {
            C4939p pVar3 = this.f8717b;
            j = ((long) pVar3.f8735h.f8695f) + pVar3.mo17319d();
            i2 = this.f8717b.f8736i.f8695f;
        }
        return j - ((long) i2);
    }
}
