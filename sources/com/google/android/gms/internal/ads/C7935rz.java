package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.rz */
final class C7935rz implements zzkc {

    /* renamed from: a */
    private final Uri f16785a;

    /* renamed from: b */
    private final zzjp f16786b;

    /* renamed from: c */
    private final zzid f16787c;

    /* renamed from: d */
    private final zzjr f16788d;

    /* renamed from: e */
    private final int f16789e;

    /* renamed from: f */
    private final zzij f16790f;

    /* renamed from: g */
    private volatile boolean f16791g;

    /* renamed from: h */
    private boolean f16792h = true;

    public C7935rz(Uri uri, zzjp zzjp, zzid zzid, zzjr zzjr, int i, long j) {
        zzkh.m24656a(uri);
        this.f16785a = uri;
        zzkh.m24656a(zzjp);
        this.f16786b = zzjp;
        zzkh.m24656a(zzid);
        this.f16787c = zzid;
        zzkh.m24656a(zzjr);
        this.f16788d = zzjr;
        this.f16789e = i;
        zzij zzij = new zzij();
        this.f16790f = zzij;
        zzij.f22041a = j;
    }

    /* renamed from: a */
    public final boolean mo26527a() {
        return this.f16791g;
    }

    /* renamed from: b */
    public final void mo26528b() {
        this.f16791g = true;
    }

    /* renamed from: c */
    public final void mo26529c() throws IOException, InterruptedException {
        if (this.f16792h) {
            this.f16787c.mo29384a();
            this.f16792h = false;
        }
        int i = 0;
        while (i == 0 && !this.f16791g) {
            zzib zzib = null;
            try {
                long j = this.f16790f.f22041a;
                long a = this.f16786b.mo25635a(new zzjq(this.f16785a, j, -1, (String) null));
                if (a != -1) {
                    a += j;
                }
                zzib zzib2 = new zzib(this.f16786b, j, a);
                while (i == 0) {
                    try {
                        if (this.f16791g) {
                            break;
                        }
                        this.f16788d.mo29405a(this.f16789e);
                        i = this.f16787c.mo29383a(zzib2, this.f16790f);
                    } catch (Throwable th) {
                        th = th;
                        zzib = zzib2;
                        if (!(i == 1 || zzib == null)) {
                            this.f16790f.f22041a = zzib.getPosition();
                        }
                        this.f16786b.close();
                        throw th;
                    }
                }
                if (i == 1) {
                    i = 0;
                } else {
                    this.f16790f.f22041a = zzib2.getPosition();
                }
                this.f16786b.close();
            } catch (Throwable th2) {
                th = th2;
                this.f16790f.f22041a = zzib.getPosition();
                this.f16786b.close();
                throw th;
            }
        }
    }
}
