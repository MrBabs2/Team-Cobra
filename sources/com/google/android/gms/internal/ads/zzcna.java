package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

public final class zzcna implements zzcka<zzcdb, zzams, zzcla> {

    /* renamed from: a */
    private final Context f20639a;

    /* renamed from: b */
    private final Executor f20640b;

    /* renamed from: c */
    private final zzcdf f20641c;

    public zzcna(Context context, Executor executor, zzcdf zzcdf) {
        this.f20639a = context;
        this.f20640b = executor;
        this.f20641c = zzcdf;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28721a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws RemoteException, zzcmw {
        zzcdc a = this.f20641c.mo26174a(new zzbpr(zzcxu, zzcxm, zzcjy.f20302a), new zzcdd(new C7884ql(zzcjy)));
        a.mo25587a().mo28428a(new zzccy((zzams) zzcjy.f20303b), this.f20640b);
        ((zzcla) zzcjy.f20304c).mo28728a((zzamv) a.mo26210l());
        return a.mo26208j();
    }

    /* renamed from: b */
    public final void mo28722b(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzams, zzcla> zzcjy) throws RemoteException {
        try {
            ((zzams) zzcjy.f20303b).mo27407a(ObjectWrapper.m16391a(this.f20639a), zzcxu.f21162a.f21156a.f21167d, zzcxm.f21135s.toString(), (zzamv) zzcjy.f20304c);
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcjy.f20302a);
            zzbad.m20522c(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }
}
