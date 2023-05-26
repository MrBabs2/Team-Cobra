package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.ads.rl */
final /* synthetic */ class C7921rl implements zzbwz {

    /* renamed from: a */
    private final zzcjy f16769a;

    /* renamed from: b */
    private final zzcjx f16770b;

    C7921rl(zzcjy zzcjy, zzcjx zzcjx) {
        this.f16769a = zzcjy;
        this.f16770b = zzcjx;
    }

    /* renamed from: a */
    public final void mo25736a(boolean z, Context context) {
        zzcjy zzcjy = this.f16769a;
        zzcjx zzcjx = this.f16770b;
        try {
            if (((zzaov) zzcjy.f20303b).mo27530m(ObjectWrapper.m16391a(context))) {
                zzcjx.mo28718a();
            } else {
                zzbad.m20523d("Can't show rewarded video.");
            }
        } catch (RemoteException e) {
            zzbad.m20522c("Can't show rewarded video.", e);
        }
    }
}
