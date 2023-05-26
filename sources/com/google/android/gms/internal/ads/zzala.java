package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

public final class zzala extends zzbbw<zzajw> {

    /* renamed from: c */
    private final Object f18169c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzayp<zzajw> f18170d;

    /* renamed from: e */
    private boolean f18171e;

    /* renamed from: f */
    private int f18172f;

    public zzala(zzayp<zzajw> zzayp) {
        this.f18170d = zzayp;
        this.f18171e = false;
        this.f18172f = 0;
    }

    /* renamed from: f */
    private final void m19365f() {
        synchronized (this.f18169c) {
            Preconditions.m16047b(this.f18172f >= 0);
            if (!this.f18171e || this.f18172f != 0) {
                zzawz.m20167e("There are still references to the engine. Not destroying.");
            } else {
                zzawz.m20167e("No reference is left (including root). Cleaning up engine.");
                mo27910a(new C7270a2(this), new zzbbu());
            }
        }
    }

    /* renamed from: c */
    public final zzakw mo27366c() {
        zzakw zzakw = new zzakw(this);
        synchronized (this.f18169c) {
            mo27910a(new C8160y1(this, zzakw), new C8197z1(this, zzakw));
            Preconditions.m16047b(this.f18172f >= 0);
            this.f18172f++;
        }
        return zzakw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo27367d() {
        synchronized (this.f18169c) {
            Preconditions.m16047b(this.f18172f > 0);
            zzawz.m20167e("Releasing 1 reference for JS Engine");
            this.f18172f--;
            m19365f();
        }
    }

    /* renamed from: e */
    public final void mo27368e() {
        synchronized (this.f18169c) {
            Preconditions.m16047b(this.f18172f >= 0);
            zzawz.m20167e("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f18171e = true;
            m19365f();
        }
    }
}
