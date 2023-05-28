package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9537w;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p390m0.C12036f;

/* renamed from: kotlin.h0.u.e.m0.x */
/* compiled from: ReflectJavaTypeParameter.kt */
public final class C12065x extends C12053n implements C9537w, C12036f {

    /* renamed from: a */
    private final TypeVariable<?> f31818a;

    public C12065x(TypeVariable<?> typeVariable) {
        C10202j.m34178b(typeVariable, "typeVariable");
        this.f31818a = typeVariable;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12065x) && C10202j.m34176a((Object) this.f31818a, (Object) ((C12065x) obj).f31818a);
    }

    public C9939f getName() {
        C9939f b = C9939f.m33302b(this.f31818a.getName());
        C10202j.m34174a((Object) b, "Name.identifier(typeVariable.name)");
        return b;
    }

    /* renamed from: h */
    public boolean mo34029h() {
        return C12036f.C12037a.m39767b(this);
    }

    public int hashCode() {
        return this.f31818a.hashCode();
    }

    /* renamed from: o */
    public AnnotatedElement mo38671o() {
        TypeVariable<?> typeVariable = this.f31818a;
        if (!(typeVariable instanceof AnnotatedElement)) {
            typeVariable = null;
        }
        return (AnnotatedElement) typeVariable;
    }

    public String toString() {
        return C12065x.class.getName() + ": " + this.f31818a;
    }

    /* renamed from: a */
    public C12032c m39855a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C12036f.C12037a.m39766a(this, bVar);
    }

    public List<C12032c> getAnnotations() {
        return C12036f.C12037a.m39765a(this);
    }

    public List<C12051l> getUpperBounds() {
        Type[] bounds = this.f31818a.getBounds();
        C10202j.m34174a((Object) bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type lVar : bounds) {
            arrayList.add(new C12051l(lVar));
        }
        C12051l lVar2 = (C12051l) C10539w.m35811j(arrayList);
        return C10202j.m34176a((Object) lVar2 != null ? lVar2.mo38672J() : null, (Object) Object.class) ? C10529o.m35736a() : arrayList;
    }
}
