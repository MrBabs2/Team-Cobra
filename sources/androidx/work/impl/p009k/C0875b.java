package androidx.work.impl.p009k;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.work.impl.k.b */
/* compiled from: NetworkState */
public class C0875b {

    /* renamed from: a */
    private boolean f3151a;

    /* renamed from: b */
    private boolean f3152b;

    /* renamed from: c */
    private boolean f3153c;

    /* renamed from: d */
    private boolean f3154d;

    public C0875b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f3151a = z;
        this.f3152b = z2;
        this.f3153c = z3;
        this.f3154d = z4;
    }

    /* renamed from: a */
    public boolean mo4823a() {
        return this.f3151a;
    }

    /* renamed from: b */
    public boolean mo4824b() {
        return this.f3153c;
    }

    /* renamed from: c */
    public boolean mo4825c() {
        return this.f3154d;
    }

    /* renamed from: d */
    public boolean mo4826d() {
        return this.f3152b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0875b.class != obj.getClass()) {
            return false;
        }
        C0875b bVar = (C0875b) obj;
        if (this.f3151a == bVar.f3151a && this.f3152b == bVar.f3152b && this.f3153c == bVar.f3153c && this.f3154d == bVar.f3154d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f3151a ? 1 : 0;
        if (this.f3152b) {
            i += 16;
        }
        if (this.f3153c) {
            i += 256;
        }
        return this.f3154d ? i + RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f3151a), Boolean.valueOf(this.f3152b), Boolean.valueOf(this.f3153c), Boolean.valueOf(this.f3154d)});
    }
}
