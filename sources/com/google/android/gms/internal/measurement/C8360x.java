package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.x */
final class C8360x extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ Activity f23375j;

    /* renamed from: k */
    private final /* synthetic */ zzea.C8378c f23376k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8360x(zzea.C8378c cVar, Activity activity) {
        super(zzea.this);
        this.f23376k = cVar;
        this.f23375j = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        zzea.this.f23421i.mo30308b(ObjectWrapper.m16391a(this.f23375j), this.f23426g);
    }
}
