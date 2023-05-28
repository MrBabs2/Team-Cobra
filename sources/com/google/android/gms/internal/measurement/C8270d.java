package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.d */
final class C8270d extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ String f23227j;

    /* renamed from: k */
    private final /* synthetic */ String f23228k;

    /* renamed from: l */
    private final /* synthetic */ zzea.C8376a f23229l;

    /* renamed from: m */
    private final /* synthetic */ zzea f23230m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8270d(zzea zzea, String str, String str2, zzea.C8376a aVar) {
        super(zzea);
        this.f23230m = zzea;
        this.f23227j = str;
        this.f23228k = str2;
        this.f23229l = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        this.f23230m.f23421i.mo30304a(this.f23227j, this.f23228k, (zzdq) this.f23229l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30086b() {
        this.f23229l.zzb((Bundle) null);
    }
}
