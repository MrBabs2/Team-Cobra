package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzadj extends zzadm {

    /* renamed from: f */
    private final zzf f18019f;

    /* renamed from: g */
    private final String f18020g;

    /* renamed from: h */
    private final String f18021h;

    public zzadj(zzf zzf, String str, String str2) {
        this.f18019f = zzf;
        this.f18020g = str;
        this.f18021h = str2;
    }

    /* renamed from: Y0 */
    public final String mo27187Y0() {
        return this.f18020g;
    }

    public final String getContent() {
        return this.f18021h;
    }

    /* renamed from: h */
    public final void mo27189h(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.f18019f.zzg((View) ObjectWrapper.m16390H(iObjectWrapper));
        }
    }

    public final void recordClick() {
        this.f18019f.zzky();
    }

    public final void recordImpression() {
        this.f18019f.zzkz();
    }
}
