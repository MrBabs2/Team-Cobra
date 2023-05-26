package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.u */
final class C8348u extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ Activity f23347j;

    /* renamed from: k */
    private final /* synthetic */ zzea.C8378c f23348k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8348u(zzea.C8378c cVar, Activity activity) {
        super(zzea.this);
        this.f23348k = cVar;
        this.f23347j = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        zzea.this.f23421i.mo30318d(ObjectWrapper.m16391a(this.f23347j), this.f23426g);
    }
}
