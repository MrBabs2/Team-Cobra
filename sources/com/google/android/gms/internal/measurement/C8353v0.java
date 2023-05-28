package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.v0 */
final class C8353v0 extends C8349u0<Object> {
    C8353v0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo30236a(zzvv zzvv) {
        return zzvv instanceof zzuo.zzc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C8361x0<Object> mo30237b(Object obj) {
        zzuo.zzc zzc = (zzuo.zzc) obj;
        if (zzc.zzbyl.mo30259c()) {
            zzc.zzbyl = (C8361x0) zzc.zzbyl.clone();
        }
        return zzc.zzbyl;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo30238c(Object obj) {
        mo30234a(obj).mo30264f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C8361x0<Object> mo30234a(Object obj) {
        return ((zzuo.zzc) obj).zzbyl;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo30233a(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30235a(C8309k3 k3Var, Map.Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }
}
