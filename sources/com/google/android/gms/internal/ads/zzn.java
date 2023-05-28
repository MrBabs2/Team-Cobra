package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class zzn extends Thread {

    /* renamed from: f */
    private final BlockingQueue<zzr<?>> f22320f;

    /* renamed from: g */
    private final zzm f22321g;

    /* renamed from: h */
    private final zzb f22322h;

    /* renamed from: i */
    private final zzab f22323i;

    /* renamed from: j */
    private volatile boolean f22324j = false;

    public zzn(BlockingQueue<zzr<?>> blockingQueue, zzm zzm, zzb zzb, zzab zzab) {
        this.f22320f = blockingQueue;
        this.f22321g = zzm;
        this.f22322h = zzb;
        this.f22323i = zzab;
    }

    /* renamed from: b */
    private final void m24911b() throws InterruptedException {
        zzr take = this.f22320f.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        take.mo29649a(3);
        try {
            take.mo29653a("network-queue-take");
            take.mo29659i();
            TrafficStats.setThreadStatsTag(take.mo29660l());
            zzp a = this.f22321g.mo27317a(take);
            take.mo29653a("network-http-complete");
            if (!a.f22440e || !take.mo29668v()) {
                zzy a2 = take.mo27762a(a);
                take.mo29653a("network-parse-complete");
                if (take.mo29663q() && a2.f23003b != null) {
                    this.f22322h.mo27453a(take.mo29661m(), a2.f23003b);
                    take.mo29653a("network-cache-written");
                }
                take.mo29666t();
                this.f22323i.mo26969a((zzr<?>) take, (zzy<?>) a2);
                take.mo29652a((zzy<?>) a2);
                take.mo29649a(4);
                return;
            }
            take.mo29655b("not-modified");
            take.mo29669w();
        } catch (zzaf e) {
            e.mo27232a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f22323i.mo26968a((zzr<?>) take, e);
            take.mo29669w();
        } catch (Exception e2) {
            zzag.m19160a(e2, "Unhandled exception %s", e2.toString());
            zzaf zzaf = new zzaf((Throwable) e2);
            zzaf.mo27232a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f22323i.mo26968a((zzr<?>) take, zzaf);
            take.mo29669w();
        } finally {
            take.mo29649a(4);
        }
    }

    /* renamed from: a */
    public final void mo29549a() {
        this.f22324j = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m24911b();
            } catch (InterruptedException unused) {
                if (this.f22324j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.m19161b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
