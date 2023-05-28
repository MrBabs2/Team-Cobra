package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.r */
final class C8336r extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ String f23332j;

    /* renamed from: k */
    private final /* synthetic */ String f23333k;

    /* renamed from: l */
    private final /* synthetic */ Object f23334l;

    /* renamed from: m */
    private final /* synthetic */ boolean f23335m = true;

    /* renamed from: n */
    private final /* synthetic */ zzea f23336n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8336r(zzea zzea, String str, String str2, Object obj, boolean z) {
        super(zzea);
        this.f23336n = zzea;
        this.f23332j = str;
        this.f23333k = str2;
        this.f23334l = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        this.f23336n.f23421i.mo30303a(this.f23332j, this.f23333k, ObjectWrapper.m16391a(this.f23334l), this.f23335m, this.f23425f);
    }
}
