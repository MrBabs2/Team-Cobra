package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9529p;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9539y;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9941h;
import kotlin.p045h0.p046u.p047e.p390m0.C12036f;
import kotlin.p045h0.p046u.p047e.p390m0.C12059t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;

/* renamed from: kotlin.h0.u.e.m0.r */
/* compiled from: ReflectJavaMember.kt */
public abstract class C12057r extends C12053n implements C9529p, C12036f, C12059t {
    /* renamed from: I */
    public boolean mo34061I() {
        return C12059t.C12060a.m39844d(this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12057r) && C10202j.m34176a((Object) mo38685i(), (Object) ((C12057r) obj).mo38685i());
    }

    public C9939f getName() {
        C9939f b;
        String name = mo38685i().getName();
        if (name != null && (b = C9939f.m33302b(name)) != null) {
            return b;
        }
        C9939f fVar = C9941h.f27438a;
        C10202j.m34174a((Object) fVar, "SpecialNames.NO_NAME_PROVIDED");
        return fVar;
    }

    public C10237a1 getVisibility() {
        return C12059t.C12060a.m39841a(this);
    }

    /* renamed from: h */
    public boolean mo34029h() {
        return C12036f.C12037a.m39767b(this);
    }

    public int hashCode() {
        return mo38685i().hashCode();
    }

    /* renamed from: i */
    public abstract Member mo38685i();

    public boolean isAbstract() {
        return C12059t.C12060a.m39842b(this);
    }

    public boolean isFinal() {
        return C12059t.C12060a.m39843c(this);
    }

    /* renamed from: o */
    public AnnotatedElement mo38671o() {
        Member i = mo38685i();
        if (i != null) {
            return (AnnotatedElement) i;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
    }

    public String toString() {
        return getClass().getName() + ": " + mo38685i();
    }

    /* renamed from: w */
    public int mo38676w() {
        return mo38685i().getModifiers();
    }

    /* renamed from: H */
    public C12041j m39826H() {
        Class<?> declaringClass = mo38685i().getDeclaringClass();
        C10202j.m34174a((Object) declaringClass, "member.declaringClass");
        return new C12041j(declaringClass);
    }

    /* renamed from: a */
    public C12032c m39830a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C12036f.C12037a.m39766a(this, bVar);
    }

    public List<C12032c> getAnnotations() {
        return C12036f.C12037a.m39765a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<C9539y> mo38686a(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        String str;
        C10202j.m34178b(typeArr, "parameterTypes");
        C10202j.m34178b(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> b = C12027a.f31783b.mo38661b(mo38685i());
        int size = b != null ? b.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            C12063w a = C12063w.f31817a.mo38696a(typeArr[i]);
            if (b != null) {
                str = (String) C10539w.m35792d(b, i + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + a + ") in " + b + "@ReflectJavaMember").toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new C12066y(a, annotationArr[i], str, z && i == C10519k.m35649g(typeArr)));
            i++;
        }
        return arrayList;
    }
}
