package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzbym extends zzaef {

    /* renamed from: f */
    private final zzbyt f19677f;

    public zzbym(zzbyt zzbyt) {
        this.f19677f = zzbyt;
    }

    /* renamed from: p1 */
    private final float m22060p1() {
        try {
            return this.f19677f.mo28546m().mo26938t();
        } catch (RemoteException e) {
            zzbad.m20520b("Remote exception getting video controller aspect ratio.", e);
            return 0.0f;
        }
    }

    /* renamed from: q1 */
    private final float m22061q1() {
        zzadw zzadw = this.f19677f.mo28541h().get(0);
        if (zzadw.getWidth() != -1 && zzadw.getHeight() != -1) {
            return ((float) zzadw.getWidth()) / ((float) zzadw.getHeight());
        }
        try {
            Drawable drawable = (Drawable) ObjectWrapper.m16390H(zzadw.mo27203D0());
            if (drawable == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
                return 0.0f;
            }
            return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        } catch (RemoteException e) {
            zzbad.m20520b("RemoteException getting Drawable for aspect ratio calculation.", e);
            return 0.0f;
        }
    }

    /* renamed from: t */
    public final float mo27211t() {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17931k3)).booleanValue()) {
            return 0.0f;
        }
        if (this.f19677f.mo28517A() != 0.0f) {
            return this.f19677f.mo28517A();
        }
        if (this.f19677f.mo28546m() != null) {
            return m22060p1();
        }
        return m22061q1();
    }
}
