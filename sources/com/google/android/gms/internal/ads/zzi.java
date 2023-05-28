package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzi implements zzab {

    /* renamed from: a */
    private final Executor f21998a;

    public zzi(Handler handler) {
        this.f21998a = new c00(this, handler);
    }

    /* renamed from: a */
    public final void mo26969a(zzr<?> zzr, zzy<?> zzy) {
        mo26970a(zzr, zzy, (Runnable) null);
    }

    /* renamed from: a */
    public final void mo26970a(zzr<?> zzr, zzy<?> zzy, Runnable runnable) {
        zzr.mo29666t();
        zzr.mo29653a("post-response");
        this.f21998a.execute(new m00(zzr, zzy, runnable));
    }

    /* renamed from: a */
    public final void mo26968a(zzr<?> zzr, zzaf zzaf) {
        zzr.mo29653a("post-error");
        this.f21998a.execute(new m00(zzr, zzy.m25639a(zzaf), (Runnable) null));
    }
}
