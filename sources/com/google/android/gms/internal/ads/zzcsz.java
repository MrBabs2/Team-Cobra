package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzcsz implements zzcva<zzcsy> {

    /* renamed from: a */
    private final zzbbl f20921a;

    /* renamed from: b */
    private final zzcxv f20922b;

    public zzcsz(zzbbl zzbbl, zzcxv zzcxv) {
        this.f20921a = zzbbl;
        this.f20922b = zzcxv;
    }

    /* renamed from: a */
    public final zzbbh<zzcsy> mo25785a() {
        return this.f20921a.mo27892a(new C7513go(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcsy mo28788b() throws Exception {
        return new zzcsy(m22963a(this.f20922b.f21164a), this.f20922b.f21167d);
    }

    /* renamed from: a */
    private static int m22963a(zzzy zzzy) {
        long j;
        if (zzzy != null) {
            try {
                j = zzzy.getValue();
            } catch (RemoteException unused) {
                zzbad.m20523d("Cannot get correlation id, default to 0.");
            }
            return (int) j;
        }
        j = 0;
        return (int) j;
    }
}
