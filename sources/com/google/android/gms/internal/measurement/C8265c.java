package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.c */
final class C8265c extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ String f23217j;

    /* renamed from: k */
    private final /* synthetic */ String f23218k;

    /* renamed from: l */
    private final /* synthetic */ Bundle f23219l;

    /* renamed from: m */
    private final /* synthetic */ zzea f23220m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8265c(zzea zzea, String str, String str2, Bundle bundle) {
        super(zzea);
        this.f23220m = zzea;
        this.f23217j = str;
        this.f23218k = str2;
        this.f23219l = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        this.f23220m.f23421i.mo30300a(this.f23217j, this.f23218k, this.f23219l);
    }
}
