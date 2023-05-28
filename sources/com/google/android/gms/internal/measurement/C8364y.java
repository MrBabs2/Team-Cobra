package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.y */
final class C8364y extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ Activity f23383j;

    /* renamed from: k */
    private final /* synthetic */ zzea.C8376a f23384k;

    /* renamed from: l */
    private final /* synthetic */ zzea.C8378c f23385l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8364y(zzea.C8378c cVar, Activity activity, zzea.C8376a aVar) {
        super(zzea.this);
        this.f23385l = cVar;
        this.f23383j = activity;
        this.f23384k = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        zzea.this.f23421i.mo30291a(ObjectWrapper.m16391a(this.f23383j), (zzdq) this.f23384k, this.f23426g);
    }
}
