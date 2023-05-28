package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.e */
final class C8275e extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ Activity f23231j;

    /* renamed from: k */
    private final /* synthetic */ String f23232k;

    /* renamed from: l */
    private final /* synthetic */ String f23233l;

    /* renamed from: m */
    private final /* synthetic */ zzea f23234m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8275e(zzea zzea, Activity activity, String str, String str2) {
        super(zzea);
        this.f23234m = zzea;
        this.f23231j = activity;
        this.f23232k = str;
        this.f23233l = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        this.f23234m.f23421i.mo30293a(ObjectWrapper.m16391a(this.f23231j), this.f23232k, this.f23233l, this.f23425f);
    }
}
