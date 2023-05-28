package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
public final class zzalr {
    @VisibleForTesting

    /* renamed from: b */
    private static final zzayp<zzajw> f18182b = new C7418e2();
    @VisibleForTesting

    /* renamed from: c */
    private static final zzayp<zzajw> f18183c = new C7455f2();

    /* renamed from: a */
    private final zzakh f18184a;

    public zzalr(Context context, zzbai zzbai, String str) {
        this.f18184a = new zzakh(context, zzbai, str, f18182b, f18183c);
    }

    /* renamed from: a */
    public final <I, O> zzalj<I, O> mo27373a(String str, zzalm<I> zzalm, zzall<O> zzall) {
        return new zzalu(this.f18184a, str, zzalm, zzall);
    }

    /* renamed from: a */
    public final zzaly mo27374a() {
        return new zzaly(this.f18184a);
    }
}
