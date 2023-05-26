package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class zzchl extends zzchj {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Pattern f20203g = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: b */
    private final zzcgn f20204b;

    /* renamed from: c */
    private final zzbbl f20205c;

    /* renamed from: d */
    private final zzcxv f20206d;

    /* renamed from: e */
    private final ScheduledExecutorService f20207e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzcji f20208f;

    zzchl(zzbtg zzbtg, zzcxv zzcxv, zzcgn zzcgn, zzbbl zzbbl, ScheduledExecutorService scheduledExecutorService, zzcji zzcji) {
        super(zzbtg);
        this.f20206d = zzcxv;
        this.f20204b = zzcgn;
        this.f20205c = zzbbl;
        this.f20207e = scheduledExecutorService;
        this.f20208f = zzcji;
    }

    /* renamed from: a */
    public final zzbbh<zzcxu> mo28693a(zzarx zzarx) throws zzcgm {
        zzbbh<zzcxu> a = zzbar.m20542a(this.f20204b.mo28689a(zzarx), new C7324bj(this), (Executor) this.f20205c);
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17796F2)).booleanValue()) {
            a = zzbar.m20544a(zzbar.m20541a(a, (long) ((Integer) zzyt.m25670e().mo27163a(zzacu.f17800G2)).intValue(), TimeUnit.SECONDS, this.f20207e), TimeoutException.class, C7361cj.f14759a, zzbbm.f18749b);
        }
        zzbar.m20546a(a, new C7398dj(this), zzbbm.f18749b);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28694a(InputStream inputStream) throws Exception {
        return zzbar.m20539a(new zzcxu(new zzcxr(this.f20206d), zzcxs.m23065a(new InputStreamReader(inputStream))));
    }
}
