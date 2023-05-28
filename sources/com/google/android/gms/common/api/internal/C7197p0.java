package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
final class C7197p0 extends zabr {

    /* renamed from: a */
    private final /* synthetic */ Dialog f13821a;

    /* renamed from: b */
    private final /* synthetic */ C7195o0 f13822b;

    C7197p0(C7195o0 o0Var, Dialog dialog) {
        this.f13822b = o0Var;
        this.f13821a = dialog;
    }

    /* renamed from: a */
    public final void mo25118a() {
        this.f13822b.f13819g.mo25194g();
        if (this.f13821a.isShowing()) {
            this.f13821a.dismiss();
        }
    }
}
