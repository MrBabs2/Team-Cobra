package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.m */
final class C8315m extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ String f23289j;

    /* renamed from: k */
    private final /* synthetic */ String f23290k;

    /* renamed from: l */
    private final /* synthetic */ boolean f23291l;

    /* renamed from: m */
    private final /* synthetic */ zzea.C8376a f23292m;

    /* renamed from: n */
    private final /* synthetic */ zzea f23293n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8315m(zzea zzea, String str, String str2, boolean z, zzea.C8376a aVar) {
        super(zzea);
        this.f23293n = zzea;
        this.f23289j = str;
        this.f23290k = str2;
        this.f23291l = z;
        this.f23292m = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        this.f23293n.f23421i.mo30305a(this.f23289j, this.f23290k, this.f23291l, (zzdq) this.f23292m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30086b() {
        this.f23292m.zzb((Bundle) null);
    }
}
