package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9512a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9522i;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9523j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9536v;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p390m0.C12063w;

/* renamed from: kotlin.h0.u.e.m0.l */
/* compiled from: ReflectJavaClassifierType.kt */
public final class C12051l extends C12063w implements C9523j {

    /* renamed from: b */
    private final C9522i f31808b;

    /* renamed from: c */
    private final Type f31809c;

    public C12051l(Type type) {
        C9522i iVar;
        C10202j.m34178b(type, "reflectType");
        this.f31809c = type;
        Type J = mo38672J();
        if (J instanceof Class) {
            iVar = new C12041j((Class) J);
        } else if (J instanceof TypeVariable) {
            iVar = new C12065x((TypeVariable) J);
        } else if (J instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) J).getRawType();
            if (rawType != null) {
                iVar = new C12041j((Class) rawType);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else {
            throw new IllegalStateException("Not a classifier type (" + J.getClass() + "): " + J);
        }
        this.f31808b = iVar;
    }

    /* renamed from: J */
    public Type mo38672J() {
        return this.f31809c;
    }

    /* renamed from: a */
    public C9512a mo34027a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return null;
    }

    /* renamed from: b */
    public C9522i mo34044b() {
        return this.f31808b;
    }

    public Collection<C9512a> getAnnotations() {
        return C10529o.m35736a();
    }

    /* renamed from: h */
    public boolean mo34029h() {
        return false;
    }

    /* renamed from: k */
    public String mo34045k() {
        return mo38672J().toString();
    }

    /* renamed from: p */
    public boolean mo34046p() {
        Type J = mo38672J();
        if (!(J instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) J).getTypeParameters();
        C10202j.m34174a((Object) typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    /* renamed from: q */
    public String mo34047q() {
        throw new UnsupportedOperationException("Type not found: " + mo38672J());
    }

    /* renamed from: x */
    public List<C9536v> mo34048x() {
        List<Type> a = C12029b.m39747a(mo38672J());
        C12063w.C12064a aVar = C12063w.f31817a;
        ArrayList arrayList = new ArrayList(C10531p.m35750a(a, 10));
        for (Type a2 : a) {
            arrayList.add(aVar.mo38696a(a2));
        }
        return arrayList;
    }
}
