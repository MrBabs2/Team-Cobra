package p112n.p118g.p301a.p303b.p308c.p309a;

import androidx.appcompat.widget.SearchView;
import p112n.p118g.p301a.p310c.C10699c;

/* renamed from: n.g.a.b.c.a.g */
/* compiled from: SearchViewQueryTextEvent */
public final class C10691g extends C10699c<SearchView> {

    /* renamed from: b */
    private final CharSequence f28702b;

    /* renamed from: c */
    private final boolean f28703c;

    private C10691g(SearchView searchView, CharSequence charSequence, boolean z) {
        super(searchView);
        this.f28702b = charSequence;
        this.f28703c = z;
    }

    /* renamed from: a */
    public static C10691g m36217a(SearchView searchView, CharSequence charSequence, boolean z) {
        return new C10691g(searchView, charSequence, z);
    }

    /* renamed from: b */
    public boolean mo36342b() {
        return this.f28703c;
    }

    /* renamed from: c */
    public CharSequence mo36343c() {
        return this.f28702b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10691g)) {
            return false;
        }
        C10691g gVar = (C10691g) obj;
        if (gVar.mo36350a() == mo36350a() && gVar.f28702b.equals(this.f28702b) && gVar.f28703c == this.f28703c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((629 + ((SearchView) mo36350a()).hashCode()) * 37) + this.f28702b.hashCode()) * 37) + (this.f28703c ? 1 : 0);
    }

    public String toString() {
        return "SearchViewQueryTextEvent{view=" + mo36350a() + ", queryText=" + this.f28702b + ", submitted=" + this.f28703c + '}';
    }
}
