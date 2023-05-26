package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* renamed from: com.google.android.gms.common.internal.c */
final class C7231c extends DialogRedirect {

    /* renamed from: f */
    private final /* synthetic */ Intent f14164f;

    /* renamed from: g */
    private final /* synthetic */ LifecycleFragment f14165g;

    /* renamed from: h */
    private final /* synthetic */ int f14166h;

    C7231c(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.f14164f = intent;
        this.f14165g = lifecycleFragment;
        this.f14166h = i;
    }

    /* renamed from: a */
    public final void mo25338a() {
        Intent intent = this.f14164f;
        if (intent != null) {
            this.f14165g.startActivityForResult(intent, this.f14166h);
        }
    }
}
