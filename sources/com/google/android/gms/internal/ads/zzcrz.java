package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzcrz implements zzcva<Object> {

    /* renamed from: a */
    private final String f20874a;

    /* renamed from: b */
    private final String f20875b;

    /* renamed from: c */
    private final zzbqe f20876c;

    /* renamed from: d */
    private final zzcyi f20877d;

    /* renamed from: e */
    private final zzcxv f20878e;

    public zzcrz(String str, String str2, zzbqe zzbqe, zzcyi zzcyi, zzcxv zzcxv) {
        this.f20874a = str;
        this.f20875b = str2;
        this.f20876c = zzbqe;
        this.f20877d = zzcyi;
        this.f20878e = zzcxv;
    }

    /* renamed from: a */
    public final zzbbh<Object> mo25785a() {
        return zzbar.m20539a(new C8145xn(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28784a(Bundle bundle) {
        this.f20876c.mo28396a(this.f20878e.f21167d);
        bundle.putBundle("quality_signals", this.f20877d.mo28838a());
        bundle.putString("seq_num", this.f20874a);
        bundle.putString("session_id", this.f20875b);
    }
}
