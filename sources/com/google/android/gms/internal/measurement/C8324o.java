package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.o */
final class C8324o extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ Bundle f23307j;

    /* renamed from: k */
    private final /* synthetic */ zzea.C8376a f23308k;

    /* renamed from: l */
    private final /* synthetic */ zzea f23309l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8324o(zzea zzea, Bundle bundle, zzea.C8376a aVar) {
        super(zzea);
        this.f23309l = zzea;
        this.f23307j = bundle;
        this.f23308k = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        this.f23309l.f23421i.mo30288a(this.f23307j, (zzdq) this.f23308k, this.f23425f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30086b() {
        this.f23308k.zzb((Bundle) null);
    }
}
