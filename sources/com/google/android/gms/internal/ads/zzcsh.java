package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class zzcsh implements zzcva<zzcsg> {

    /* renamed from: a */
    private final zzbbl f20898a;

    /* renamed from: b */
    private final Context f20899b;

    public zzcsh(zzbbl zzbbl, Context context) {
        this.f20898a = zzbbl;
        this.f20899b = context;
    }

    /* renamed from: a */
    public final zzbbh<zzcsg> mo25785a() {
        return this.f20898a.mo27892a(new C8219zn(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcsg mo28786b() throws Exception {
        double d;
        Intent registerReceiver = this.f20899b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = (double) registerReceiver.getIntExtra("level", -1);
            double intExtra3 = (double) registerReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new zzcsg(d, z);
    }
}
