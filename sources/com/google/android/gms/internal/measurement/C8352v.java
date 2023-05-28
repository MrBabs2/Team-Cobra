package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.v */
final class C8352v extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ Activity f23349j;

    /* renamed from: k */
    private final /* synthetic */ zzea.C8378c f23350k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8352v(zzea.C8378c cVar, Activity activity) {
        super(zzea.this);
        this.f23350k = cVar;
        this.f23349j = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        zzea.this.f23421i.mo30289a(ObjectWrapper.m16391a(this.f23349j), this.f23426g);
    }
}
