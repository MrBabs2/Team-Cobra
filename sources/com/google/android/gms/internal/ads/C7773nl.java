package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.nl */
final class C7773nl implements zzban<T> {

    /* renamed from: a */
    private final /* synthetic */ String f16393a;

    /* renamed from: b */
    private final /* synthetic */ long f16394b;

    /* renamed from: c */
    private final /* synthetic */ zzcmu f16395c;

    C7773nl(zzcmu zzcmu, String str, long j) {
        this.f16395c = zzcmu;
        this.f16393a = str;
        this.f16394b = j;
    }

    /* renamed from: a */
    public final void mo25565a(T t) {
        this.f16395c.m22707a(this.f16393a, 0, this.f16395c.f20623a.mo25499c() - this.f16394b);
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        long c = this.f16395c.f20623a.mo25499c();
        int i = 3;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (!(th instanceof zzcmk)) {
            i = th instanceof CancellationException ? 4 : (!(th instanceof zzcgm) || ((zzcgm) th).mo28688a() != 3) ? 6 : 1;
        }
        this.f16395c.m22707a(this.f16393a, i, c - this.f16394b);
    }
}
