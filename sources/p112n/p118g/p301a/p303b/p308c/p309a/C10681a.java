package p112n.p118g.p301a.p303b.p308c.p309a;

import androidx.recyclerview.widget.RecyclerView;
import p112n.p118g.p301a.p310c.C10699c;

/* renamed from: n.g.a.b.c.a.a */
/* compiled from: RecyclerViewScrollEvent */
public final class C10681a extends C10699c<RecyclerView> {

    /* renamed from: b */
    private final int f28692b;

    /* renamed from: c */
    private final int f28693c;

    private C10681a(RecyclerView recyclerView, int i, int i2) {
        super(recyclerView);
        this.f28692b = i;
        this.f28693c = i2;
    }

    /* renamed from: a */
    public static C10681a m36209a(RecyclerView recyclerView, int i, int i2) {
        return new C10681a(recyclerView, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10681a)) {
            return false;
        }
        C10681a aVar = (C10681a) obj;
        if (aVar.mo36350a() == mo36350a() && this.f28692b == aVar.f28692b && this.f28693c == aVar.f28693c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((629 + ((RecyclerView) mo36350a()).hashCode()) * 37) + this.f28692b) * 37) + this.f28693c;
    }

    public String toString() {
        return "RecyclerViewScrollEvent{view=" + mo36350a() + ", dx=" + this.f28692b + ", dy=" + this.f28693c + '}';
    }
}
