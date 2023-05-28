package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzqo implements zzql {

    /* renamed from: f */
    private final zzql[] f22529f;

    /* renamed from: g */
    private final ArrayList<zzql> f22530g;

    /* renamed from: h */
    private final zzlu f22531h = new zzlu();

    /* renamed from: i */
    private zzqm f22532i;

    /* renamed from: j */
    private zzlr f22533j;

    /* renamed from: k */
    private Object f22534k;

    /* renamed from: l */
    private int f22535l = -1;

    /* renamed from: m */
    private zzqq f22536m;

    public zzqo(zzql... zzqlArr) {
        this.f22529f = zzqlArr;
        this.f22530g = new ArrayList<>(Arrays.asList(zzqlArr));
    }

    /* renamed from: a */
    public final void mo29634a(zzkv zzkv, boolean z, zzqm zzqm) {
        this.f22532i = zzqm;
        int i = 0;
        while (true) {
            zzql[] zzqlArr = this.f22529f;
            if (i < zzqlArr.length) {
                zzqlArr[i].mo29634a(zzkv, false, new i30(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo29636b() throws IOException {
        zzqq zzqq = this.f22536m;
        if (zzqq == null) {
            for (zzql b : this.f22529f) {
                b.mo29636b();
            }
            return;
        }
        throw zzqq;
    }

    /* renamed from: a */
    public final zzqj mo29632a(int i, zzrt zzrt) {
        int length = this.f22529f.length;
        zzqj[] zzqjArr = new zzqj[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzqjArr[i2] = this.f22529f[i2].mo29632a(i, zzrt);
        }
        return new h30(zzqjArr);
    }

    /* renamed from: a */
    public final void mo29635a(zzqj zzqj) {
        h30 h30 = (h30) zzqj;
        int i = 0;
        while (true) {
            zzql[] zzqlArr = this.f22529f;
            if (i < zzqlArr.length) {
                zzqlArr[i].mo29635a(h30.f15341f[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo29633a() {
        for (zzql a : this.f22529f) {
            a.mo29633a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25076a(int i, zzlr zzlr, Object obj) {
        zzqq zzqq;
        if (this.f22536m == null) {
            int b = zzlr.mo26677b();
            int i2 = 0;
            while (true) {
                if (i2 >= b) {
                    if (this.f22535l == -1) {
                        this.f22535l = zzlr.mo26678c();
                    } else if (zzlr.mo26678c() != this.f22535l) {
                        zzqq = new zzqq(1);
                    }
                    zzqq = null;
                } else if (zzlr.mo29487a(i2, this.f22531h, false).f22221e) {
                    zzqq = new zzqq(0);
                    break;
                } else {
                    i2++;
                }
            }
            this.f22536m = zzqq;
        }
        if (this.f22536m == null) {
            this.f22530g.remove(this.f22529f[i]);
            if (i == 0) {
                this.f22533j = zzlr;
                this.f22534k = obj;
            }
            if (this.f22530g.isEmpty()) {
                this.f22532i.mo26072a(this.f22533j, this.f22534k);
            }
        }
    }
}
