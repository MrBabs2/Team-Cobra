package androidx.work.impl.p012l;

/* renamed from: androidx.work.impl.l.d */
/* compiled from: SystemIdInfo */
public class C0902d {

    /* renamed from: a */
    public final String f3194a;

    /* renamed from: b */
    public final int f3195b;

    public C0902d(String str, int i) {
        this.f3194a = str;
        this.f3195b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0902d.class != obj.getClass()) {
            return false;
        }
        C0902d dVar = (C0902d) obj;
        if (this.f3195b != dVar.f3195b) {
            return false;
        }
        return this.f3194a.equals(dVar.f3194a);
    }

    public int hashCode() {
        return (this.f3194a.hashCode() * 31) + this.f3195b;
    }
}
