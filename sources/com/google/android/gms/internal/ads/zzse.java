package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class zzse {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f22642a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public o30<? extends zzsh> f22643b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f22644c;

    public zzse(String str) {
        this.f22642a = zzsy.m25286a(str);
    }

    /* renamed from: a */
    public final <T extends zzsh> long mo29710a(T t, zzsf<T> zzsf, int i) {
        Looper myLooper = Looper.myLooper();
        zzsk.m25218b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new o30(this, myLooper, t, zzsf, i, elapsedRealtime).mo26338a(0);
        return elapsedRealtime;
    }

    /* renamed from: b */
    public final void mo29714b() {
        this.f22643b.mo26339a(false);
    }

    /* renamed from: a */
    public final boolean mo29713a() {
        return this.f22643b != null;
    }

    /* renamed from: a */
    public final void mo29712a(Runnable runnable) {
        o30<? extends zzsh> o30 = this.f22643b;
        if (o30 != null) {
            o30.mo26339a(true);
        }
        this.f22642a.execute(runnable);
        this.f22642a.shutdown();
    }

    /* renamed from: a */
    public final void mo29711a(int i) throws IOException {
        IOException iOException = this.f22644c;
        if (iOException == null) {
            o30<? extends zzsh> o30 = this.f22643b;
            if (o30 != null) {
                o30.mo26337a(o30.f16422h);
                return;
            }
            return;
        }
        throw iOException;
    }
}
