package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

public final class zzcrv implements zzcva<zzcuz<Bundle>> {

    /* renamed from: a */
    private final Executor f20870a;

    /* renamed from: b */
    private final zzawm f20871b;

    zzcrv(Executor executor, zzawm zzawm) {
        this.f20870a = executor;
        this.f20871b = zzawm;
    }

    /* renamed from: a */
    public final zzbbh<zzcuz<Bundle>> mo25785a() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17951p1)).booleanValue()) {
            return zzbar.m20539a(null);
        }
        return zzbar.m20543a(this.f20871b.mo27744j(), C8034un.f16969a, this.f20870a);
    }
}
