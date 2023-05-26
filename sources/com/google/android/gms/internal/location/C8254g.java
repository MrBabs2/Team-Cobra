package com.google.android.gms.internal.location;

import android.os.DeadObjectException;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.location.g */
final class C8254g implements zzbj<zzao> {

    /* renamed from: a */
    private final /* synthetic */ zzk f23157a;

    C8254g(zzk zzk) {
        this.f23157a = zzk;
    }

    /* renamed from: a */
    public final void mo30014a() {
        this.f23157a.checkConnected();
    }

    /* renamed from: b */
    public final /* synthetic */ IInterface mo30015b() throws DeadObjectException {
        return (zzao) this.f23157a.getService();
    }
}
