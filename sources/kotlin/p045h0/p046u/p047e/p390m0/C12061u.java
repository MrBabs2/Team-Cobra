package kotlin.p045h0.p046u.p047e.p390m0;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9512a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9534t;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.h0.u.e.m0.u */
/* compiled from: ReflectJavaPackage.kt */
public final class C12061u extends C12053n implements C9534t {

    /* renamed from: a */
    private final C9934b f31815a;

    public C12061u(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        this.f31815a = bVar;
    }

    /* renamed from: a */
    public Collection<C9520g> mo34066a(C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(lVar, "nameFilter");
        return C10529o.m35736a();
    }

    /* renamed from: a */
    public C9512a mo34027a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return null;
    }

    /* renamed from: c */
    public C9934b mo34067c() {
        return this.f31815a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12061u) && C10202j.m34176a((Object) mo34067c(), (Object) ((C12061u) obj).mo34067c());
    }

    /* renamed from: h */
    public boolean mo34029h() {
        return false;
    }

    public int hashCode() {
        return mo34067c().hashCode();
    }

    /* renamed from: s */
    public Collection<C9534t> mo34068s() {
        return C10529o.m35736a();
    }

    public String toString() {
        return C12061u.class.getName() + ": " + mo34067c();
    }

    public List<C9512a> getAnnotations() {
        return C10529o.m35736a();
    }
}
