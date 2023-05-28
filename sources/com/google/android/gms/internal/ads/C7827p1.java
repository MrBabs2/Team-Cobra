package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.p1 */
final class C7827p1 implements zzaho<zzalf> {

    /* renamed from: a */
    private final /* synthetic */ zzdh f16542a;

    /* renamed from: b */
    private final /* synthetic */ zzajw f16543b;

    /* renamed from: c */
    private final /* synthetic */ zzazk f16544c;

    /* renamed from: d */
    private final /* synthetic */ zzakh f16545d;

    C7827p1(zzakh zzakh, zzdh zzdh, zzajw zzajw, zzazk zzazk) {
        this.f16545d = zzakh;
        this.f16542a = zzdh;
        this.f16543b = zzajw;
        this.f16544c = zzazk;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        synchronized (this.f16545d.f18153a) {
            zzbad.m20521c("JS Engine is requesting an update");
            if (this.f16545d.f18160h == 0) {
                zzbad.m20521c("Starting reload.");
                int unused = this.f16545d.f18160h = 2;
                this.f16545d.mo27358a(this.f16542a);
            }
            this.f16543b.mo27357b("/requestReload", (zzaho) this.f16544c.mo27868a());
        }
    }
}
