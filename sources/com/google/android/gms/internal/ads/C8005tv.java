package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tv */
final class C8005tv implements C8227zv {

    /* renamed from: a */
    private C8227zv[] f16918a;

    C8005tv(C8227zv... zvVarArr) {
        this.f16918a = zvVarArr;
    }

    /* renamed from: a */
    public final C8190yv mo25977a(Class<?> cls) {
        for (C8227zv zvVar : this.f16918a) {
            if (zvVar.mo25978b(cls)) {
                return zvVar.mo25977a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    /* renamed from: b */
    public final boolean mo25978b(Class<?> cls) {
        for (C8227zv b : this.f16918a) {
            if (b.mo25978b(cls)) {
                return true;
            }
        }
        return false;
    }
}
