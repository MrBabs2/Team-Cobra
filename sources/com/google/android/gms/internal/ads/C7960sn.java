package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.sn */
final class C7960sn implements zzcva<zzcuz<Bundle>> {

    /* renamed from: a */
    private final Set<String> f16855a;

    C7960sn(Set<String> set) {
        this.f16855a = set;
    }

    /* renamed from: a */
    public final zzbbh<zzcuz<Bundle>> mo25785a() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f16855a) {
            arrayList.add(add);
        }
        return zzbar.m20539a(new C7997tn(arrayList));
    }
}
