package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.ads.ql */
final /* synthetic */ class C7884ql implements zzbwz {

    /* renamed from: a */
    private final zzcjy f16668a;

    C7884ql(zzcjy zzcjy) {
        this.f16668a = zzcjy;
    }

    /* renamed from: a */
    public final void mo25736a(boolean z, Context context) {
        zzcjy zzcjy = this.f16668a;
        try {
            ((zzams) zzcjy.f20303b).setImmersiveMode(z);
            ((zzams) zzcjy.f20303b).mo27429t(ObjectWrapper.m16391a(context));
        } catch (RemoteException e) {
            zzbad.m20522c("Cannot show rewarded .", e);
        }
    }
}
