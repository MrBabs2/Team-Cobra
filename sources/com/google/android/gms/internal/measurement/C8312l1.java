package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;

/* renamed from: com.google.android.gms.internal.measurement.l1 */
final class C8312l1 implements C8278e2 {

    /* renamed from: b */
    private static final C8346t1 f23284b = new C8317m1();

    /* renamed from: a */
    private final C8346t1 f23285a;

    public C8312l1() {
        this(new C8322n1(C8262b1.m25889a(), m26081a()));
    }

    /* renamed from: a */
    public final <T> C8273d2<T> mo30106a(Class<T> cls) {
        Class<zzuo> cls2 = zzuo.class;
        C8283f2.m25946a((Class<?>) cls);
        C8342s1 a = this.f23285a.mo30062a(cls);
        if (a.mo30084f()) {
            if (cls2.isAssignableFrom(cls)) {
                return C8358w1.m26258a(C8283f2.m25958c(), C8357w0.m26256b(), a.mo30083e());
            }
            return C8358w1.m26258a(C8283f2.m25938a(), C8357w0.m26257c(), a.mo30083e());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m26082a(a)) {
                return C8354v1.m26214a(cls, a, C8374z1.m26369b(), C8287g1.m25989b(), C8283f2.m25958c(), C8357w0.m26256b(), C8338r1.m26129b());
            }
            return C8354v1.m26214a(cls, a, C8374z1.m26369b(), C8287g1.m25989b(), C8283f2.m25958c(), (C8349u0<?>) null, C8338r1.m26129b());
        } else if (m26082a(a)) {
            return C8354v1.m26214a(cls, a, C8374z1.m26368a(), C8287g1.m25988a(), C8283f2.m25938a(), C8357w0.m26257c(), C8338r1.m26128a());
        } else {
            return C8354v1.m26214a(cls, a, C8374z1.m26368a(), C8287g1.m25988a(), C8283f2.m25952b(), (C8349u0<?>) null, C8338r1.m26128a());
        }
    }

    private C8312l1(C8346t1 t1Var) {
        zzuq.m26679a(t1Var, "messageInfoFactory");
        this.f23285a = t1Var;
    }

    /* renamed from: a */
    private static boolean m26082a(C8342s1 s1Var) {
        return s1Var.mo30085g() == zzuo.zze.f23505g;
    }

    /* renamed from: a */
    private static C8346t1 m26081a() {
        try {
            return (C8346t1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f23284b;
        }
    }
}
