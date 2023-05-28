package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.m */
final class C7190m extends zac {

    /* renamed from: f */
    private final WeakReference<zaak> f13811f;

    C7190m(zaak zaak) {
        this.f13811f = new WeakReference<>(zaak);
    }

    /* renamed from: a */
    public final void mo25109a(zaj zaj) {
        zaak zaak = (zaak) this.f13811f.get();
        if (zaak != null) {
            zaak.f13869a.mo25168a((C7210w) new C7192n(this, zaak, zaak, zaj));
        }
    }
}
