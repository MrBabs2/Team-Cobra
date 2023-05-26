package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.t */
final class C8344t extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ Activity f23343j;

    /* renamed from: k */
    private final /* synthetic */ Bundle f23344k;

    /* renamed from: l */
    private final /* synthetic */ zzea.C8378c f23345l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8344t(zzea.C8378c cVar, Activity activity, Bundle bundle) {
        super(zzea.this);
        this.f23345l = cVar;
        this.f23343j = activity;
        this.f23344k = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        zzea.this.f23421i.mo30290a(ObjectWrapper.m16391a(this.f23343j), this.f23344k, this.f23426g);
    }
}
