package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10107m;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.k.a0 */
/* compiled from: IntersectionTypeConstructor.kt */
public final class C11819a0 implements C11953s0 {

    /* renamed from: a */
    private final LinkedHashSet<C11824b0> f31522a;

    /* renamed from: b */
    private final int f31523b;

    /* renamed from: kotlin.h0.u.e.k0.k.a0$a */
    /* compiled from: Comparisons.kt */
    public static final class C11820a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C10546b.m35832a(((C11824b0) t).toString(), ((C11824b0) t2).toString());
        }
    }

    public C11819a0(Collection<? extends C11824b0> collection) {
        C10202j.m34178b(collection, "typesToIntersect");
        boolean z = !collection.isEmpty();
        if (!C10485x.f28360a || z) {
            LinkedHashSet<C11824b0> linkedHashSet = new LinkedHashSet<>(collection);
            this.f31522a = linkedHashSet;
            this.f31523b = linkedHashSet.hashCode();
            return;
        }
        throw new AssertionError("Attempt to create an empty intersection");
    }

    /* renamed from: a */
    public Collection<C11824b0> mo35229a() {
        return this.f31522a;
    }

    /* renamed from: b */
    public C10349h mo33781b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo33782c() {
        return false;
    }

    /* renamed from: e */
    public final C10096h mo38429e() {
        C10107m.C10108a aVar = C10107m.f27733c;
        return aVar.mo35315a("member scope for intersection type " + this, this.f31522a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11819a0)) {
            return false;
        }
        return C10202j.m34176a((Object) this.f31522a, (Object) ((C11819a0) obj).f31522a);
    }

    public List<C10375s0> getParameters() {
        return C10529o.m35736a();
    }

    public int hashCode() {
        return this.f31523b;
    }

    /* renamed from: l */
    public C9333g mo35232l() {
        C9333g l = ((C11824b0) this.f31522a.iterator().next()).mo35227v0().mo35232l();
        C10202j.m34174a((Object) l, "intersectedTypes.iterato…xt().constructor.builtIns");
        return l;
    }

    public String toString() {
        return m38895a(this.f31522a);
    }

    /* renamed from: a */
    private final String m38895a(Iterable<? extends C11824b0> iterable) {
        return C10539w.m35773a(C10539w.m35775a(iterable, new C11820a()), " & ", "{", "}", 0, (CharSequence) null, (C9113l) null, 56, (Object) null);
    }
}
