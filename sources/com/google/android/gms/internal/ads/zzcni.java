package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

public final class zzcni extends zzcoj {

    /* renamed from: m */
    private zzbvj f20649m;

    /* renamed from: n */
    private zzbrp f20650n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcni(zzbri zzbri, zzbrt zzbrt, zzbse zzbse, zzbso zzbso, zzbrp zzbrp, zzbtp zzbtp, zzbvq zzbvq, zzbsv zzbsv, zzbvj zzbvj) {
        super(zzbri, zzbrt, zzbse, zzbso, zzbtp, zzbsv, zzbvq);
        this.f20649m = zzbvj;
        this.f20650n = zzbrp;
    }

    /* renamed from: J */
    public final void mo27432J() {
        this.f20649m.mo27308n();
    }

    /* renamed from: a */
    public final void mo27436a(zzatq zzatq) throws RemoteException {
        this.f20649m.mo27306a(new zzato(zzatq.getType(), zzatq.getAmount()));
    }

    /* renamed from: c */
    public final void mo27437c(int i) throws RemoteException {
        this.f20650n.mo28407c(i);
    }

    /* renamed from: j1 */
    public final void mo27439j1() throws RemoteException {
        this.f20649m.mo27307j();
    }

    /* renamed from: x */
    public final void mo27450x() {
        this.f20649m.mo27307j();
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27435a(zzato zzato) {
        this.f20649m.mo27306a(zzato);
    }
}
