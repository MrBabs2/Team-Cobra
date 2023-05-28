package p050l.p075h.p084l;

/* renamed from: l.h.l.c */
/* compiled from: DisplayCutoutCompat */
public final class C5017c {

    /* renamed from: a */
    private final Object f8874a;

    private C5017c(Object obj) {
        this.f8874a = obj;
    }

    /* renamed from: a */
    static C5017c m8931a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C5017c(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5017c.class != obj.getClass()) {
            return false;
        }
        C5017c cVar = (C5017c) obj;
        Object obj2 = this.f8874a;
        if (obj2 != null) {
            return obj2.equals(cVar.f8874a);
        }
        if (cVar.f8874a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f8874a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f8874a + "}";
    }
}
