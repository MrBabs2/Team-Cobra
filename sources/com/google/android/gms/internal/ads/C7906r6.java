package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.r6 */
final /* synthetic */ class C7906r6 implements Runnable {

    /* renamed from: f */
    private final Iterable f16743f;

    /* renamed from: g */
    private final zzbbr f16744g;

    C7906r6(Iterable iterable, zzbbr zzbbr) {
        this.f16743f = iterable;
        this.f16744g = zzbbr;
    }

    public final void run() {
        Iterable<zzbbh> iterable = this.f16743f;
        zzbbr zzbbr = this.f16744g;
        ArrayList arrayList = new ArrayList();
        for (zzbbh zzbbh : iterable) {
            try {
                arrayList.add(zzbbh.get());
            } catch (ExecutionException e) {
                zzbbr.mo27903a(e.getCause());
            } catch (Exception | InterruptedException e2) {
                zzbbr.mo27903a(e2);
            }
        }
        zzbbr.mo27904b(arrayList);
    }
}
