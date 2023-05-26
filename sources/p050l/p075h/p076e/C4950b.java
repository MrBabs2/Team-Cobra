package p050l.p075h.p076e;

import android.graphics.Insets;

/* renamed from: l.h.e.b */
/* compiled from: Insets */
public final class C4950b {

    /* renamed from: e */
    public static final C4950b f8745e = new C4950b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f8746a;

    /* renamed from: b */
    public final int f8747b;

    /* renamed from: c */
    public final int f8748c;

    /* renamed from: d */
    public final int f8749d;

    private C4950b(int i, int i2, int i3, int i4) {
        this.f8746a = i;
        this.f8747b = i2;
        this.f8748c = i3;
        this.f8749d = i4;
    }

    /* renamed from: a */
    public static C4950b m8710a(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f8745e;
        }
        return new C4950b(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4950b.class != obj.getClass()) {
            return false;
        }
        C4950b bVar = (C4950b) obj;
        return this.f8749d == bVar.f8749d && this.f8746a == bVar.f8746a && this.f8748c == bVar.f8748c && this.f8747b == bVar.f8747b;
    }

    public int hashCode() {
        return (((((this.f8746a * 31) + this.f8747b) * 31) + this.f8748c) * 31) + this.f8749d;
    }

    public String toString() {
        return "Insets{left=" + this.f8746a + ", top=" + this.f8747b + ", right=" + this.f8748c + ", bottom=" + this.f8749d + '}';
    }

    /* renamed from: a */
    public Insets mo17359a() {
        return Insets.of(this.f8746a, this.f8747b, this.f8748c, this.f8749d);
    }
}
