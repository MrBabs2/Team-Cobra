package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcus implements zzcva<zzcur> {

    /* renamed from: a */
    private final zzavg f20985a;

    /* renamed from: b */
    private final zzbbl f20986b;

    /* renamed from: c */
    private final Context f20987c;

    public zzcus(zzavg zzavg, zzbbl zzbbl, Context context) {
        this.f20985a = zzavg;
        this.f20986b = zzbbl;
        this.f20987c = context;
    }

    /* renamed from: a */
    public final zzbbh<zzcur> mo25785a() {
        return this.f20986b.mo27892a(new C8146xo(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcur mo28798b() throws Exception {
        String str;
        String str2;
        String str3;
        if (!this.f20985a.mo27700f(this.f20987c)) {
            return new zzcur((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String a = this.f20985a.mo27687a(this.f20987c);
        String str4 = a == null ? "" : a;
        String b = this.f20985a.mo27691b(this.f20987c);
        if (b == null) {
            str = "";
        } else {
            str = b;
        }
        String c = this.f20985a.mo27693c(this.f20987c);
        if (c == null) {
            str2 = "";
        } else {
            str2 = c;
        }
        String d = this.f20985a.mo27695d(this.f20987c);
        if (d == null) {
            str3 = "";
        } else {
            str3 = d;
        }
        return new zzcur(str4, str, str2, str3, "TIME_OUT".equals(str) ? (Long) zzyt.m25670e().mo27163a(zzacu.f17928k0) : null);
    }
}
