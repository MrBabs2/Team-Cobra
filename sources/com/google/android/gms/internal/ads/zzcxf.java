package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzcxf implements zzdti<zzcvb<JSONObject>> {
    /* renamed from: a */
    public static zzcvb<JSONObject> m23054a(Object obj, zzcvu zzcvu, zzcwn zzcwn, zzdte<zzcvo> zzdte, zzdte<zzcvy> zzdte2, zzdte<zzcwc> zzdte3, zzdte<zzcwj> zzdte4, zzdte<zzcwq> zzdte5, zzdte<zzcwu> zzdte6, zzdte<zzcxh> zzdte7, Executor executor) {
        HashSet hashSet = new HashSet();
        hashSet.add((C7740mp) obj);
        hashSet.add(zzcvu);
        hashSet.add(zzcwn);
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17820L2)).booleanValue()) {
            hashSet.add(zzdte.get());
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17824M2)).booleanValue()) {
            hashSet.add(zzdte2.get());
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17828N2)).booleanValue()) {
            hashSet.add(zzdte3.get());
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17832O2)).booleanValue()) {
            hashSet.add(zzdte4.get());
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17840Q2)).booleanValue()) {
            hashSet.add(zzdte5.get());
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17844R2)).booleanValue()) {
            hashSet.add(zzdte6.get());
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17848S2)).booleanValue()) {
            hashSet.add(zzdte7.get());
        }
        zzcvb<JSONObject> zzcvb = new zzcvb<>(executor, hashSet);
        zzdto.m24236a(zzcvb, "Cannot return null from a non-@Nullable @Provides method");
        return zzcvb;
    }

    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
