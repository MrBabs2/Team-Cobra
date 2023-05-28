package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xj */
final /* synthetic */ class C8141xj implements Callable {

    /* renamed from: f */
    private final zzcja f17197f;

    private C8141xj(zzcja zzcja) {
        this.f17197f = zzcja;
    }

    /* renamed from: a */
    static Callable m18453a(zzcja zzcja) {
        return new C8141xj(zzcja);
    }

    public final Object call() {
        return this.f17197f.getWritableDatabase();
    }
}
