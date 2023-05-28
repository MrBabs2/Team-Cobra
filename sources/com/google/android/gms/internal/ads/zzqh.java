package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

public final class zzqh implements zzql, zzqm {

    /* renamed from: f */
    private final Uri f22518f;

    /* renamed from: g */
    private final zzrw f22519g;

    /* renamed from: h */
    private final zznq f22520h;

    /* renamed from: i */
    private final int f22521i = -1;

    /* renamed from: j */
    private final Handler f22522j;

    /* renamed from: k */
    private final zzqi f22523k;

    /* renamed from: l */
    private final zzlt f22524l;

    /* renamed from: m */
    private final int f22525m;

    /* renamed from: n */
    private zzqm f22526n;

    /* renamed from: o */
    private zzlr f22527o;

    /* renamed from: p */
    private boolean f22528p;

    public zzqh(Uri uri, zzrw zzrw, zznq zznq, int i, Handler handler, zzqi zzqi, String str, int i2) {
        this.f22518f = uri;
        this.f22519g = zzrw;
        this.f22520h = zznq;
        this.f22522j = handler;
        this.f22523k = zzqi;
        this.f22525m = i2;
        this.f22524l = new zzlt();
    }

    /* renamed from: a */
    public final void mo29634a(zzkv zzkv, boolean z, zzqm zzqm) {
        this.f22526n = zzqm;
        zzqz zzqz = new zzqz(-9223372036854775807L, false);
        this.f22527o = zzqz;
        zzqm.mo26072a(zzqz, (Object) null);
    }

    /* renamed from: b */
    public final void mo29636b() throws IOException {
    }

    /* renamed from: a */
    public final zzqj mo29632a(int i, zzrt zzrt) {
        zzsk.m25216a(i == 0);
        return new z20(this.f22518f, this.f22519g.mo26357a(), this.f22520h.mo26226a(), this.f22521i, this.f22522j, this.f22523k, this, zzrt, (String) null, this.f22525m);
    }

    /* renamed from: a */
    public final void mo29635a(zzqj zzqj) {
        ((z20) zzqj).mo26872g();
    }

    /* renamed from: a */
    public final void mo29633a() {
        this.f22526n = null;
    }

    /* renamed from: a */
    public final void mo26072a(zzlr zzlr, Object obj) {
        boolean z = false;
        if (zzlr.mo26675a(0, this.f22524l, false).f22215c != -9223372036854775807L) {
            z = true;
        }
        if (!this.f22528p || z) {
            this.f22527o = zzlr;
            this.f22528p = z;
            this.f22526n.mo26072a(zzlr, (Object) null);
        }
    }
}
