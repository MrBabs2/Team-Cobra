package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

public final class zzcnw implements zzcka<zzcdb, zzams, zzclb> {

    /* renamed from: a */
    private final Context f20674a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f20675b;

    /* renamed from: c */
    private final zzcdf f20676c;

    public zzcnw(Context context, Executor executor, zzcdf zzcdf) {
        this.f20674a = context;
        this.f20675b = executor;
        this.f20676c = zzcdf;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m22729c(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzams, zzclb> zzcjy) {
        try {
            ((zzams) zzcjy.f20303b).mo27413a(zzcxu.f21162a.f21156a.f21167d, zzcxm.f21135s.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcjy.f20302a);
            zzbad.m20522c(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28721a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws RemoteException, zzcmw {
        zzcdc a = this.f20676c.mo26174a(new zzbpr(zzcxu, zzcxm, zzcjy.f20302a), new zzcdd(new C7401dm(zzcjy)));
        a.mo25587a().mo28428a(new zzccy((zzams) zzcjy.f20303b), this.f20675b);
        zzbse b = a.mo25588b();
        zzbri c = a.mo25589c();
        ((zzclb) zzcjy.f20304c).mo28729a((zzatk) new C7548hm(this, a.mo26206h(), c, b, a.mo26209k()));
        return a.mo26208j();
    }

    /* renamed from: b */
    public final void mo28722b(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzams, zzclb> zzcjy) throws RemoteException {
        if (!((zzams) zzcjy.f20303b).isInitialized()) {
            ((zzclb) zzcjy.f20304c).mo28730a((zzbvo) new C7438em(this, zzcxu, zzcxm, zzcjy));
            ((zzams) zzcjy.f20303b).mo27408a(ObjectWrapper.m16391a(this.f20674a), zzcxu.f21162a.f21156a.f21167d, (String) null, (zzatk) zzcjy.f20304c, zzcxm.f21135s.toString());
            return;
        }
        m22729c(zzcxu, zzcxm, zzcjy);
    }
}
