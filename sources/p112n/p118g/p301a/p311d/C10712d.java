package p112n.p118g.p301a.p311d;

import android.widget.TextView;
import p112n.p118g.p301a.p310c.C10699c;

/* renamed from: n.g.a.d.d */
/* compiled from: TextViewTextChangeEvent */
public final class C10712d extends C10699c<TextView> {

    /* renamed from: b */
    private final CharSequence f28729b;

    /* renamed from: c */
    private final int f28730c;

    /* renamed from: d */
    private final int f28731d;

    /* renamed from: e */
    private final int f28732e;

    private C10712d(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        super(textView);
        this.f28729b = charSequence;
        this.f28730c = i;
        this.f28731d = i2;
        this.f28732e = i3;
    }

    /* renamed from: a */
    public static C10712d m36234a(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        return new C10712d(textView, charSequence, i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10712d)) {
            return false;
        }
        C10712d dVar = (C10712d) obj;
        if (dVar.mo36350a() == mo36350a() && this.f28729b.equals(dVar.f28729b) && this.f28730c == dVar.f28730c && this.f28731d == dVar.f28731d && this.f28732e == dVar.f28732e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((629 + ((TextView) mo36350a()).hashCode()) * 37) + this.f28729b.hashCode()) * 37) + this.f28730c) * 37) + this.f28731d) * 37) + this.f28732e;
    }

    public String toString() {
        return "TextViewTextChangeEvent{text=" + this.f28729b + ", start=" + this.f28730c + ", before=" + this.f28731d + ", count=" + this.f28732e + ", view=" + mo36350a() + '}';
    }
}
