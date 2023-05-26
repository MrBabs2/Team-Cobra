package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class zzma {

    /* renamed from: a */
    private final Handler f22233a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzlz f22234b;

    public zzma(Handler handler, zzlz zzlz) {
        Handler handler2;
        if (zzlz != null) {
            zzsk.m25214a(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.f22233a = handler2;
        this.f22234b = zzlz;
    }

    /* renamed from: a */
    public final void mo29504a(zznc zznc) {
        if (this.f22234b != null) {
            this.f22233a.post(new w00(this, zznc));
        }
    }

    /* renamed from: b */
    public final void mo29506b(zznc zznc) {
        if (this.f22234b != null) {
            this.f22233a.post(new a10(this, zznc));
        }
    }

    /* renamed from: a */
    public final void mo29505a(String str, long j, long j2) {
        if (this.f22234b != null) {
            this.f22233a.post(new x00(this, str, j, j2));
        }
    }

    /* renamed from: a */
    public final void mo29503a(zzlh zzlh) {
        if (this.f22234b != null) {
            this.f22233a.post(new y00(this, zzlh));
        }
    }

    /* renamed from: a */
    public final void mo29502a(int i, long j, long j2) {
        if (this.f22234b != null) {
            this.f22233a.post(new z00(this, i, j, j2));
        }
    }

    /* renamed from: a */
    public final void mo29501a(int i) {
        if (this.f22234b != null) {
            this.f22233a.post(new b10(this, i));
        }
    }
}
