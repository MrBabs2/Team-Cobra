package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.a */
final class C7229a extends DialogRedirect {

    /* renamed from: f */
    private final /* synthetic */ Intent f14158f;

    /* renamed from: g */
    private final /* synthetic */ Activity f14159g;

    /* renamed from: h */
    private final /* synthetic */ int f14160h;

    C7229a(Intent intent, Activity activity, int i) {
        this.f14158f = intent;
        this.f14159g = activity;
        this.f14160h = i;
    }

    /* renamed from: a */
    public final void mo25338a() {
        Intent intent = this.f14158f;
        if (intent != null) {
            this.f14159g.startActivityForResult(intent, this.f14160h);
        }
    }
}
