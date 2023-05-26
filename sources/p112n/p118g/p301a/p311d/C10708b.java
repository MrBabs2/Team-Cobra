package p112n.p118g.p301a.p311d;

import android.text.Editable;
import android.widget.TextView;
import p112n.p118g.p301a.p310c.C10699c;

/* renamed from: n.g.a.d.b */
/* compiled from: TextViewAfterTextChangeEvent */
public final class C10708b extends C10699c<TextView> {

    /* renamed from: b */
    private final Editable f28723b;

    private C10708b(TextView textView, Editable editable) {
        super(textView);
        this.f28723b = editable;
    }

    /* renamed from: a */
    public static C10708b m36231a(TextView textView, Editable editable) {
        return new C10708b(textView, editable);
    }

    /* renamed from: b */
    public Editable mo36358b() {
        return this.f28723b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10708b)) {
            return false;
        }
        C10708b bVar = (C10708b) obj;
        if (bVar.mo36350a() != mo36350a() || !this.f28723b.equals(bVar.f28723b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((629 + ((TextView) mo36350a()).hashCode()) * 37) + this.f28723b.hashCode();
    }

    public String toString() {
        return "TextViewAfterTextChangeEvent{editable=" + this.f28723b + ", view=" + mo36350a() + '}';
    }
}
