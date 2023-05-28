package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

final class e30 implements zzsh {

    /* renamed from: a */
    private final Uri f15055a;

    /* renamed from: b */
    private final zzrv f15056b;

    /* renamed from: c */
    private final f30 f15057c;

    /* renamed from: d */
    private final zzsm f15058d;

    /* renamed from: e */
    private final zznt f15059e = new zznt();

    /* renamed from: f */
    private volatile boolean f15060f;

    /* renamed from: g */
    private boolean f15061g = true;

    /* renamed from: h */
    private long f15062h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f15063i = -1;

    /* renamed from: j */
    private final /* synthetic */ z20 f15064j;

    public e30(z20 z20, Uri uri, zzrv zzrv, f30 f30, zzsm zzsm) {
        this.f15064j = z20;
        zzsk.m25214a(uri);
        this.f15055a = uri;
        zzsk.m25214a(zzrv);
        this.f15056b = zzrv;
        zzsk.m25214a(f30);
        this.f15057c = f30;
        this.f15058d = zzsm;
    }

    /* renamed from: a */
    public final void mo25855a(long j, long j2) {
        this.f15059e.f22357a = j;
        this.f15062h = j2;
        this.f15061g = true;
    }

    /* renamed from: b */
    public final void mo25857b() {
        this.f15060f = true;
    }

    /* renamed from: c */
    public final void mo25858c() throws IOException, InterruptedException {
        int i = 0;
        while (i == 0 && !this.f15060f) {
            zznm zznm = null;
            try {
                long j = this.f15059e.f22357a;
                long a = this.f15056b.mo26232a(new zzry(this.f15055a, j, -1, this.f15064j.f17533m));
                this.f15063i = a;
                if (a != -1) {
                    this.f15063i = a + j;
                }
                zznm zznm2 = new zznm(this.f15056b, j, this.f15063i);
                try {
                    zznn a2 = this.f15057c.mo25909a(zznm2, this.f15056b.mo26231F());
                    if (this.f15061g) {
                        a2.mo29584a(j, this.f15062h);
                        this.f15061g = false;
                    }
                    while (i == 0 && !this.f15060f) {
                        this.f15058d.mo29715a();
                        i = a2.mo29582a((zzno) zznm2, this.f15059e);
                        if (zznm2.getPosition() > this.f15064j.f17534n + j) {
                            j = zznm2.getPosition();
                            this.f15058d.mo29717c();
                            this.f15064j.f17540t.post(this.f15064j.f17539s);
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.f15059e.f22357a = zznm2.getPosition();
                    }
                    zzsy.m25287a(this.f15056b);
                } catch (Throwable th) {
                    th = th;
                    zznm = zznm2;
                    this.f15059e.f22357a = zznm.getPosition();
                    zzsy.m25287a(this.f15056b);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (!(i == 1 || zznm == null)) {
                    this.f15059e.f22357a = zznm.getPosition();
                }
                zzsy.m25287a(this.f15056b);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25856a() {
        return this.f15060f;
    }
}
