package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class zzd extends Thread {

    /* renamed from: l */
    private static final boolean f21269l = zzag.f18074b;

    /* renamed from: f */
    private final BlockingQueue<zzr<?>> f21270f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final BlockingQueue<zzr<?>> f21271g;

    /* renamed from: h */
    private final zzb f21272h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzab f21273i;

    /* renamed from: j */
    private volatile boolean f21274j = false;

    /* renamed from: k */
    private final C8119wy f21275k;

    public zzd(BlockingQueue<zzr<?>> blockingQueue, BlockingQueue<zzr<?>> blockingQueue2, zzb zzb, zzab zzab) {
        this.f21270f = blockingQueue;
        this.f21271g = blockingQueue2;
        this.f21272h = zzb;
        this.f21273i = zzab;
        this.f21275k = new C8119wy(this);
    }

    /* renamed from: b */
    private final void m23173b() throws InterruptedException {
        zzr take = this.f21270f.take();
        take.mo29653a("cache-queue-take");
        take.mo29649a(1);
        try {
            take.mo29659i();
            zzc b = this.f21272h.mo27454b(take.mo29661m());
            if (b == null) {
                take.mo29653a("cache-miss");
                if (!this.f21275k.m18432b(take)) {
                    this.f21271g.put(take);
                }
            } else if (b.mo28614a()) {
                take.mo29653a("cache-hit-expired");
                take.mo29647a(b);
                if (!this.f21275k.m18432b(take)) {
                    this.f21271g.put(take);
                }
                take.mo29649a(2);
            } else {
                take.mo29653a("cache-hit");
                zzy a = take.mo27762a(new zzp(b.f19815a, b.f19821g));
                take.mo29653a("cache-hit-parsed");
                if (!(b.f19820f < System.currentTimeMillis())) {
                    this.f21273i.mo26969a((zzr<?>) take, (zzy<?>) a);
                } else {
                    take.mo29653a("cache-hit-refresh-needed");
                    take.mo29647a(b);
                    a.f23005d = true;
                    if (!this.f21275k.m18432b(take)) {
                        this.f21273i.mo26970a(take, a, new C7823oy(this, take));
                    } else {
                        this.f21273i.mo26969a((zzr<?>) take, (zzy<?>) a);
                    }
                }
                take.mo29649a(2);
            }
        } finally {
            take.mo29649a(2);
        }
    }

    /* renamed from: a */
    public final void mo28866a() {
        this.f21274j = true;
        interrupt();
    }

    public final void run() {
        if (f21269l) {
            zzag.m19162c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f21272h.mo27452B();
        while (true) {
            try {
                m23173b();
            } catch (InterruptedException unused) {
                if (this.f21274j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.m19161b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
