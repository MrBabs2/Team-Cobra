package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w1 */
final class C8358w1<T> implements C8273d2<T> {

    /* renamed from: a */
    private final C8351u2<?, ?> f23369a;

    /* renamed from: b */
    private final boolean f23370b;

    /* renamed from: c */
    private final C8349u0<?> f23371c;

    private C8358w1(C8351u2<?, ?> u2Var, C8349u0<?> u0Var, zzvv zzvv) {
        this.f23369a = u2Var;
        this.f23370b = u0Var.mo30236a(zzvv);
        this.f23371c = u0Var;
    }

    /* renamed from: a */
    static <T> C8358w1<T> m26258a(C8351u2<?, ?> u2Var, C8349u0<?> u0Var, zzvv zzvv) {
        return new C8358w1<>(u2Var, u0Var, zzvv);
    }

    /* renamed from: b */
    public final boolean mo30091b(T t, T t2) {
        if (!this.f23369a.mo30242b(t).equals(this.f23369a.mo30242b(t2))) {
            return false;
        }
        if (this.f23370b) {
            return this.f23371c.mo30234a((Object) t).equals(this.f23371c.mo30234a((Object) t2));
        }
        return true;
    }

    /* renamed from: c */
    public final int mo30092c(T t) {
        C8351u2<?, ?> u2Var = this.f23369a;
        int c = u2Var.mo30245c(u2Var.mo30242b(t)) + 0;
        return this.f23370b ? c + this.f23371c.mo30234a((Object) t).mo30266h() : c;
    }

    /* renamed from: d */
    public final boolean mo30093d(T t) {
        return this.f23371c.mo30234a((Object) t).mo30261d();
    }

    /* renamed from: a */
    public final int mo30087a(T t) {
        int hashCode = this.f23369a.mo30242b(t).hashCode();
        return this.f23370b ? (hashCode * 53) + this.f23371c.mo30234a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: a */
    public final void mo30089a(T t, T t2) {
        C8283f2.m25945a(this.f23369a, t, t2);
        if (this.f23370b) {
            C8283f2.m25944a(this.f23371c, t, t2);
        }
    }

    /* renamed from: b */
    public final void mo30090b(T t) {
        this.f23369a.mo30246d(t);
        this.f23371c.mo30238c(t);
    }

    /* renamed from: a */
    public final void mo30088a(T t, C8309k3 k3Var) throws IOException {
        Iterator<Map.Entry<?, Object>> e = this.f23371c.mo30234a((Object) t).mo30262e();
        while (e.hasNext()) {
            Map.Entry next = e.next();
            zzuh zzuh = (zzuh) next.getKey();
            if (zzuh.mo30417G() != zzxx.MESSAGE || zzuh.mo30416C() || zzuh.mo30421z()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C8277e1) {
                k3Var.mo30156a(zzuh.mo30420g(), (Object) ((C8277e1) next).mo30102a().mo30443a());
            } else {
                k3Var.mo30156a(zzuh.mo30420g(), next.getValue());
            }
        }
        C8351u2<?, ?> u2Var = this.f23369a;
        u2Var.mo30244b(u2Var.mo30242b(t), k3Var);
    }
}
