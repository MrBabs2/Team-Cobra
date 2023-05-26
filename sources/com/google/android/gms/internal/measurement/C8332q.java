package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.q */
final class C8332q extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ Long f23320j;

    /* renamed from: k */
    private final /* synthetic */ String f23321k;

    /* renamed from: l */
    private final /* synthetic */ String f23322l;

    /* renamed from: m */
    private final /* synthetic */ Bundle f23323m;

    /* renamed from: n */
    private final /* synthetic */ boolean f23324n = true;

    /* renamed from: o */
    private final /* synthetic */ boolean f23325o;

    /* renamed from: p */
    private final /* synthetic */ zzea f23326p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8332q(zzea zzea, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzea);
        this.f23326p = zzea;
        this.f23320j = l;
        this.f23321k = str;
        this.f23322l = str2;
        this.f23323m = bundle;
        this.f23325o = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        Long l = this.f23320j;
        this.f23326p.f23421i.mo30302a(this.f23321k, this.f23322l, this.f23323m, this.f23324n, this.f23325o, l == null ? this.f23425f : l.longValue());
    }
}
