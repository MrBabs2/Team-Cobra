package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.p */
final class C8328p extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ String f23316j;

    /* renamed from: k */
    private final /* synthetic */ zzea.C8376a f23317k;

    /* renamed from: l */
    private final /* synthetic */ zzea f23318l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8328p(zzea zzea, String str, zzea.C8376a aVar) {
        super(zzea);
        this.f23318l = zzea;
        this.f23316j = str;
        this.f23317k = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        this.f23318l.f23421i.mo30299a(this.f23316j, (zzdq) this.f23317k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30086b() {
        this.f23317k.zzb((Bundle) null);
    }
}
