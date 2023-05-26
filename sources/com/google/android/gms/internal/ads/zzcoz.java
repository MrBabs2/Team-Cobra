package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

public final class zzcoz implements zzf {

    /* renamed from: a */
    private zzf f20724a;

    /* renamed from: a */
    public final synchronized void mo28752a(zzf zzf) {
        this.f20724a = zzf;
    }

    public final synchronized void zzg(View view) {
        if (this.f20724a != null) {
            this.f20724a.zzg(view);
        }
    }

    public final synchronized void zzky() {
        if (this.f20724a != null) {
            this.f20724a.zzky();
        }
    }

    public final synchronized void zzkz() {
        if (this.f20724a != null) {
            this.f20724a.zzkz();
        }
    }
}
