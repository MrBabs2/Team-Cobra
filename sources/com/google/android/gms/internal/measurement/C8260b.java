package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
final class C8260b extends zzea.C8377b {

    /* renamed from: j */
    private final /* synthetic */ Context f23208j;

    /* renamed from: k */
    private final /* synthetic */ String f23209k;

    /* renamed from: l */
    private final /* synthetic */ String f23210l;

    /* renamed from: m */
    private final /* synthetic */ Bundle f23211m;

    /* renamed from: n */
    private final /* synthetic */ zzea f23212n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8260b(zzea zzea, Context context, String str, String str2, Bundle bundle) {
        super(zzea);
        this.f23212n = zzea;
        this.f23208j = context;
        this.f23209k = str;
        this.f23210l = str2;
        this.f23211m = bundle;
    }

    /* renamed from: a */
    public final void mo30061a() {
        String str;
        String str2;
        String str3;
        try {
            Map unused = this.f23212n.f23417e = new HashMap();
            zzdn unused2 = this.f23212n.f23421i = this.f23212n.mo30332a(this.f23208j);
            if (this.f23212n.f23421i == null) {
                Log.w(this.f23212n.f23413a, "Failed to connect to measurement client.");
                return;
            }
            if (zzea.m26469b(this.f23209k, this.f23210l)) {
                String str4 = this.f23210l;
                str2 = this.f23209k;
                str = str4;
                str3 = this.f23212n.f23413a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            int e = zzea.m26472d(this.f23208j);
            int f = zzea.m26470c(this.f23208j);
            this.f23212n.f23421i.mo30292a(ObjectWrapper.m16391a(this.f23208j), new zzdy(13001, (long) Math.max(e, f), f < e, str3, str2, str, this.f23211m), this.f23425f);
        } catch (RemoteException e2) {
            this.f23212n.m26463a((Exception) e2, true, false);
        }
    }
}
