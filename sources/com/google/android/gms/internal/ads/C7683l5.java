package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.google.android.gms.internal.ads.l5 */
final /* synthetic */ class C7683l5 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    private final Activity f16081a;

    C7683l5(zzaxy zzaxy, Activity activity) {
        this.f16081a = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return zzaxy.m20369a(this.f16081a, view, windowInsets);
    }
}
