package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* renamed from: com.google.android.gms.internal.measurement.n */
final class C8320n extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ int f23296j = 5;

    /* renamed from: k */
    private final /* synthetic */ String f23297k;

    /* renamed from: l */
    private final /* synthetic */ Object f23298l;

    /* renamed from: m */
    private final /* synthetic */ Object f23299m;

    /* renamed from: n */
    private final /* synthetic */ Object f23300n;

    /* renamed from: o */
    private final /* synthetic */ zzea f23301o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8320n(zzea zzea, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f23301o = zzea;
        this.f23297k = str;
        this.f23298l = obj;
        this.f23299m = obj2;
        this.f23300n = obj3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30061a() throws RemoteException {
        this.f23301o.f23421i.mo30285a(this.f23296j, this.f23297k, ObjectWrapper.m16391a(this.f23298l), ObjectWrapper.m16391a(this.f23299m), ObjectWrapper.m16391a(this.f23300n));
    }
}
