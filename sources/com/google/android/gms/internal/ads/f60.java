package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

final class f60 extends j60<zzaem> {

    /* renamed from: b */
    private final /* synthetic */ FrameLayout f15190b;

    /* renamed from: c */
    private final /* synthetic */ FrameLayout f15191c;

    /* renamed from: d */
    private final /* synthetic */ Context f15192d;

    /* renamed from: e */
    private final /* synthetic */ zzyh f15193e;

    f60(zzyh zzyh, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f15193e = zzyh;
        this.f15190b = frameLayout;
        this.f15191c = frameLayout2;
        this.f15192d = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f15192d, "native_ad_view_delegate");
        return new zzabt();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return this.f15193e.f23032d.mo27301a(this.f15192d, this.f15190b, this.f15191c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zzc(ObjectWrapper.m16391a(this.f15190b), ObjectWrapper.m16391a(this.f15191c));
    }
}
