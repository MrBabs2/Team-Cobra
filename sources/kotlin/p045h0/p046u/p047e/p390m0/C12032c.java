package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9512a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9515b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p390m0.C12033d;
import kotlin.p215c0.C9100a;

/* renamed from: kotlin.h0.u.e.m0.c */
/* compiled from: ReflectJavaAnnotation.kt */
public final class C12032c extends C12053n implements C9512a {

    /* renamed from: a */
    private final Annotation f31791a;

    public C12032c(Annotation annotation) {
        C10202j.m34178b(annotation, "annotation");
        this.f31791a = annotation;
    }

    /* renamed from: A */
    public Collection<C9515b> mo34021A() {
        Method[] declaredMethods = C9100a.m29804a(C9100a.m29806a(this.f31791a)).getDeclaredMethods();
        C10202j.m34174a((Object) declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            C12033d.C12034a aVar = C12033d.f31792b;
            Object invoke = method.invoke(this.f31791a, new Object[0]);
            C10202j.m34174a(invoke, "method.invoke(annotation)");
            C10202j.m34174a((Object) method, "method");
            arrayList.add(aVar.mo38670a(invoke, C9939f.m33302b(method.getName())));
        }
        return arrayList;
    }

    /* renamed from: d */
    public C9933a mo34022d() {
        return C12029b.m39748b(C9100a.m29804a(C9100a.m29806a(this.f31791a)));
    }

    /* renamed from: e */
    public boolean mo34023e() {
        return C9512a.C9513a.m30831a(this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12032c) && C10202j.m34176a((Object) this.f31791a, (Object) ((C12032c) obj).f31791a);
    }

    public int hashCode() {
        return this.f31791a.hashCode();
    }

    /* renamed from: i */
    public final Annotation mo38668i() {
        return this.f31791a;
    }

    public String toString() {
        return C12032c.class.getName() + ": " + this.f31791a;
    }

    /* renamed from: r */
    public C12041j m39761r() {
        return new C12041j(C9100a.m29804a(C9100a.m29806a(this.f31791a)));
    }
}
