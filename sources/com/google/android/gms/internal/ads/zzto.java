package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

public final class zzto {

    /* renamed from: a */
    private final Handler f22737a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zztn f22738b;

    public zzto(Handler handler, zztn zztn) {
        Handler handler2;
        if (zztn != null) {
            zzsk.m25214a(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.f22737a = handler2;
        this.f22738b = zztn;
    }

    /* renamed from: a */
    public final void mo29768a(zznc zznc) {
        if (this.f22738b != null) {
            this.f22737a.post(new x30(this, zznc));
        }
    }

    /* renamed from: b */
    public final void mo29770b(zznc zznc) {
        if (this.f22738b != null) {
            this.f22737a.post(new d40(this, zznc));
        }
    }

    /* renamed from: a */
    public final void mo29769a(String str, long j, long j2) {
        if (this.f22738b != null) {
            this.f22737a.post(new y30(this, str, j, j2));
        }
    }

    /* renamed from: a */
    public final void mo29767a(zzlh zzlh) {
        if (this.f22738b != null) {
            this.f22737a.post(new z30(this, zzlh));
        }
    }

    /* renamed from: a */
    public final void mo29765a(int i, long j) {
        if (this.f22738b != null) {
            this.f22737a.post(new a40(this, i, j));
        }
    }

    /* renamed from: a */
    public final void mo29764a(int i, int i2, int i3, float f) {
        if (this.f22738b != null) {
            this.f22737a.post(new b40(this, i, i2, i3, f));
        }
    }

    /* renamed from: a */
    public final void mo29766a(Surface surface) {
        if (this.f22738b != null) {
            this.f22737a.post(new c40(this, surface));
        }
    }
}
