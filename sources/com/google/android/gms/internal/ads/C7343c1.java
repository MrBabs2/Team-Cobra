package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* renamed from: com.google.android.gms.internal.ads.c1 */
final /* synthetic */ class C7343c1 implements Predicate {

    /* renamed from: a */
    private final zzaho f14690a;

    C7343c1(zzaho zzaho) {
        this.f14690a = zzaho;
    }

    public final boolean apply(Object obj) {
        zzaho zzaho = (zzaho) obj;
        return (zzaho instanceof C7527h1) && C7527h1.m17038a((C7527h1) zzaho).equals(this.f14690a);
    }
}
