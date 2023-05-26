package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.v */
final class C7208v extends zabr {

    /* renamed from: a */
    private WeakReference<zaaw> f13850a;

    C7208v(zaaw zaaw) {
        this.f13850a = new WeakReference<>(zaaw);
    }

    /* renamed from: a */
    public final void mo25118a() {
        zaaw zaaw = (zaaw) this.f13850a.get();
        if (zaaw != null) {
            zaaw.m15696o();
        }
    }
}
