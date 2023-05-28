package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcvo implements zzcva<zzcvn> {

    /* renamed from: a */
    private final zzawi f21033a;

    /* renamed from: b */
    private final Context f21034b;

    /* renamed from: c */
    private final ScheduledExecutorService f21035c;

    /* renamed from: d */
    private final Executor f21036d;

    public zzcvo(zzawi zzawi, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f21033a = zzawi;
        this.f21034b = context;
        this.f21035c = scheduledExecutorService;
        this.f21036d = executor;
    }

    /* renamed from: a */
    public final zzbbh<zzcvn> mo25785a() {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17794F0)).booleanValue()) {
            return zzbar.m20538a((Throwable) new Exception("Did not ad Ad ID into query param."));
        }
        zzbbr zzbbr = new zzbbr();
        zzbbh<AdvertisingIdClient.Info> a = this.f21033a.mo27715a(this.f21034b);
        a.mo25573b(new C7478fp(this, a, zzbbr), this.f21036d);
        this.f21035c.schedule(new C7514gp(a), ((Long) zzyt.m25670e().mo27163a(zzacu.f17798G0)).longValue(), TimeUnit.MILLISECONDS);
        return zzbbr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28802a(zzbbh zzbbh, zzbbr zzbbr) {
        String str;
        try {
            AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) zzbbh.get();
            if (info == null || !TextUtils.isEmpty(info.getId())) {
                str = null;
            } else {
                zzyt.m25666a();
                str = zzazt.m20477b(this.f21034b);
            }
            zzbbr.mo27904b(new zzcvn(info, this.f21034b, str));
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            zzyt.m25666a();
            zzbbr.mo27904b(new zzcvn((AdvertisingIdClient.Info) null, this.f21034b, zzazt.m20477b(this.f21034b)));
        }
    }
}
