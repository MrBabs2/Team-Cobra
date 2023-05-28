package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

final class g60 extends j60<zzaer> {

    /* renamed from: b */
    private final /* synthetic */ View f15280b;

    /* renamed from: c */
    private final /* synthetic */ HashMap f15281c;

    /* renamed from: d */
    private final /* synthetic */ HashMap f15282d;

    /* renamed from: e */
    private final /* synthetic */ zzyh f15283e;

    g60(zzyh zzyh, View view, HashMap hashMap, HashMap hashMap2) {
        this.f15283e = zzyh;
        this.f15280b = view;
        this.f15281c = hashMap;
        this.f15282d = hashMap2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f15280b.getContext(), "native_ad_view_holder_delegate");
        return new zzabu();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return this.f15283e.f23035g.mo27302a(this.f15280b, this.f15281c, this.f15282d);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zza(ObjectWrapper.m16391a(this.f15280b), ObjectWrapper.m16391a(this.f15281c), ObjectWrapper.m16391a(this.f15282d));
    }
}
