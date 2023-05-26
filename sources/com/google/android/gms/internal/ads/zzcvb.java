package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class zzcvb<T> {

    /* renamed from: a */
    private final Set<zzcva<? extends zzcuz<T>>> f21003a;

    /* renamed from: b */
    private final Executor f21004b;

    public zzcvb(Executor executor, Set<zzcva<? extends zzcuz<T>>> set) {
        this.f21004b = executor;
        this.f21003a = set;
    }

    /* renamed from: a */
    public final zzbbh<T> mo28800a(T t) {
        ArrayList arrayList = new ArrayList(this.f21003a.size());
        for (zzcva next : this.f21003a) {
            zzbbh a = next.mo25785a();
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17850T0)).booleanValue()) {
                a.mo25573b(new C7293ap(next, zzk.zzln().mo25499c()), zzbbm.f18749b);
            }
            arrayList.add(a);
        }
        return zzbar.m20551b(arrayList).mo27900a(new C7330bp(arrayList, t), this.f21004b);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m23014a(List list, Object obj) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                zzcuz zzcuz = (zzcuz) ((zzbbh) it.next()).get();
                if (zzcuz != null) {
                    zzcuz.mo25833a(obj);
                }
            } catch (InterruptedException | ExecutionException e) {
                zzbad.m20520b("Derive quality signals error.", e);
                throw new Exception(e);
            }
        }
        return obj;
    }
}
