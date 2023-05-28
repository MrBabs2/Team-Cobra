package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzczf<E> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final zzbbh<?> f21232d = zzbar.m20539a(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzbbl f21233a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f21234b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzczr<E> f21235c;

    public zzczf(zzbbl zzbbl, ScheduledExecutorService scheduledExecutorService, zzczr<E> zzczr) {
        this.f21233a = zzbbl;
        this.f21234b = scheduledExecutorService;
        this.f21235c = zzczr;
    }

    /* renamed from: a */
    public final zzczj mo28849a(E e) {
        return new zzczj(this, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo28851b(E e);

    /* renamed from: a */
    public final <I> zzczl<I> mo28850a(E e, zzbbh<I> zzbbh) {
        return new zzczl(this, e, (String) null, zzbbh, Collections.singletonList(zzbbh), zzbbh, (C7405dq) null);
    }

    /* renamed from: a */
    public final zzczh mo28848a(E e, zzbbh<?>... zzbbhArr) {
        return new zzczh(this, e, Arrays.asList(zzbbhArr));
    }
}
