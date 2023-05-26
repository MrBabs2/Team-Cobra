package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n1 */
final class C8322n1 implements C8346t1 {

    /* renamed from: a */
    private C8346t1[] f23303a;

    C8322n1(C8346t1... t1VarArr) {
        this.f23303a = t1VarArr;
    }

    /* renamed from: a */
    public final C8342s1 mo30062a(Class<?> cls) {
        for (C8346t1 t1Var : this.f23303a) {
            if (t1Var.mo30063b(cls)) {
                return t1Var.mo30062a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    /* renamed from: b */
    public final boolean mo30063b(Class<?> cls) {
        for (C8346t1 b : this.f23303a) {
            if (b.mo30063b(cls)) {
                return true;
            }
        }
        return false;
    }
}
