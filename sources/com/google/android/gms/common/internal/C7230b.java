package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: com.google.android.gms.common.internal.b */
final class C7230b extends DialogRedirect {

    /* renamed from: f */
    private final /* synthetic */ Intent f14161f;

    /* renamed from: g */
    private final /* synthetic */ Fragment f14162g;

    /* renamed from: h */
    private final /* synthetic */ int f14163h;

    C7230b(Intent intent, Fragment fragment, int i) {
        this.f14161f = intent;
        this.f14162g = fragment;
        this.f14163h = i;
    }

    /* renamed from: a */
    public final void mo25338a() {
        Intent intent = this.f14161f;
        if (intent != null) {
            this.f14162g.startActivityForResult(intent, this.f14163h);
        }
    }
}
