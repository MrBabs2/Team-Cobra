package p112n.p118g.p301a.p310c;

import android.view.View;

/* renamed from: n.g.a.c.f */
/* compiled from: ViewScrollChangeEvent */
public final class C10706f extends C10699c<View> {

    /* renamed from: b */
    private final int f28719b;

    /* renamed from: c */
    private final int f28720c;

    /* renamed from: d */
    private final int f28721d;

    /* renamed from: e */
    private final int f28722e;

    protected C10706f(View view, int i, int i2, int i3, int i4) {
        super(view);
        this.f28719b = i;
        this.f28720c = i2;
        this.f28721d = i3;
        this.f28722e = i4;
    }

    /* renamed from: a */
    public static C10706f m36228a(View view, int i, int i2, int i3, int i4) {
        return new C10706f(view, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10706f)) {
            return false;
        }
        C10706f fVar = (C10706f) obj;
        if (fVar.mo36350a() == mo36350a() && fVar.f28719b == this.f28719b && fVar.f28720c == this.f28720c && fVar.f28721d == this.f28721d && fVar.f28722e == this.f28722e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((629 + mo36350a().hashCode()) * 37) + this.f28719b) * 37) + this.f28720c) * 37) + this.f28721d) * 37) + this.f28722e;
    }

    public String toString() {
        return "ViewScrollChangeEvent{scrollX=" + this.f28719b + ", scrollY=" + this.f28720c + ", oldScrollX=" + this.f28721d + ", oldScrollY=" + this.f28722e + '}';
    }
}
