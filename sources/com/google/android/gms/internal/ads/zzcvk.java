package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzk;

public final class zzcvk implements zzcva<zzcvj> {

    /* renamed from: a */
    private final zzbbl f21027a;

    /* renamed from: b */
    private final Context f21028b;

    public zzcvk(zzbbl zzbbl, Context context) {
        this.f21027a = zzbbl;
        this.f21028b = context;
    }

    /* renamed from: a */
    public final zzbbh<zzcvj> mo25785a() {
        return this.f21027a.mo27892a(new C7441ep(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcvj mo28801b() throws Exception {
        int i;
        boolean z;
        int i2;
        int i3;
        TelephonyManager telephonyManager = (TelephonyManager) this.f21028b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int networkType = telephonyManager.getNetworkType();
        int phoneType = telephonyManager.getPhoneType();
        zzk.zzlg();
        int i4 = -1;
        if (zzaxi.m20286b(this.f21028b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f21028b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                i4 = activeNetworkInfo.getType();
                i3 = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                i3 = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                i2 = i4;
                i = i3;
                z = connectivityManager.isActiveNetworkMetered();
            } else {
                i2 = i4;
                i = i3;
                z = false;
            }
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        return new zzcvj(networkOperator, i2, networkType, phoneType, z, i);
    }
}
