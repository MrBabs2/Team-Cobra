package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
@zzard
public class zzbbw<T> {

    /* renamed from: a */
    private final zzbbr<T> f18758a = new zzbbr<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f18759b = new AtomicInteger(0);

    public zzbbw() {
        zzbar.m20546a(this.f18758a, new C7570i7(this), zzbbm.f18749b);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo27910a(zzbbv<T> zzbbv, zzbbt zzbbt) {
        zzbar.m20546a(this.f18758a, new C7611j7(this, zzbbv, zzbbt), zzbbm.f18749b);
    }

    @Deprecated
    /* renamed from: b */
    public final void mo27912b() {
        this.f18758a.mo27903a(new Exception());
    }

    @Deprecated
    /* renamed from: a */
    public final void mo27911a(T t) {
        this.f18758a.mo27904b(t);
    }

    @Deprecated
    /* renamed from: a */
    public final int mo27909a() {
        return this.f18759b.get();
    }
}
