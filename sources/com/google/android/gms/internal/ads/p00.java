package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class p00 implements zzkv {

    /* renamed from: a */
    private final zzlo[] f16520a;

    /* renamed from: b */
    private final zzrp f16521b;

    /* renamed from: c */
    private final zzro f16522c;

    /* renamed from: d */
    private final Handler f16523d;

    /* renamed from: e */
    private final r00 f16524e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<zzkw> f16525f;

    /* renamed from: g */
    private final zzlu f16526g;

    /* renamed from: h */
    private final zzlt f16527h;

    /* renamed from: i */
    private boolean f16528i;

    /* renamed from: j */
    private boolean f16529j;

    /* renamed from: k */
    private int f16530k;

    /* renamed from: l */
    private int f16531l;

    /* renamed from: m */
    private int f16532m;

    /* renamed from: n */
    private boolean f16533n;

    /* renamed from: o */
    private zzlr f16534o;

    /* renamed from: p */
    private Object f16535p;

    /* renamed from: q */
    private zzrb f16536q;

    /* renamed from: r */
    private zzro f16537r;

    /* renamed from: s */
    private zzln f16538s;

    /* renamed from: t */
    private zzle f16539t;

    /* renamed from: u */
    private int f16540u;

    /* renamed from: v */
    private long f16541v;

    @SuppressLint({"HandlerLeak"})
    public p00(zzlo[] zzloArr, zzrp zzrp, zzll zzll) {
        String str = zzsy.f22675e;
        StringBuilder sb = new StringBuilder("Init ExoPlayerLib/2.4.2 [".length() + 1 + String.valueOf(str).length());
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zzsk.m25218b(zzloArr.length > 0);
        zzsk.m25214a(zzloArr);
        this.f16520a = zzloArr;
        zzsk.m25214a(zzrp);
        this.f16521b = zzrp;
        this.f16529j = false;
        this.f16530k = 1;
        this.f16525f = new CopyOnWriteArraySet<>();
        this.f16522c = new zzro(new zzrm[zzloArr.length]);
        this.f16534o = zzlr.f22212a;
        this.f16526g = new zzlu();
        this.f16527h = new zzlt();
        this.f16536q = zzrb.f22574d;
        this.f16537r = this.f16522c;
        this.f16538s = zzln.f22206d;
        this.f16523d = new q00(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        zzle zzle = new zzle(0, 0);
        this.f16539t = zzle;
        this.f16524e = new r00(zzloArr, zzrp, zzll, this.f16529j, 0, this.f16523d, zzle, this);
    }

    /* renamed from: g */
    private final int m17844g() {
        if (this.f16534o.mo29488a() || this.f16531l > 0) {
            return this.f16540u;
        }
        this.f16534o.mo26675a(this.f16539t.f22170a, this.f16527h, false);
        return 0;
    }

    /* renamed from: a */
    public final void mo26384a(zzkw zzkw) {
        this.f16525f.remove(zzkw);
    }

    /* renamed from: b */
    public final void mo26389b(zzkw zzkw) {
        this.f16525f.add(zzkw);
    }

    /* renamed from: c */
    public final long mo26391c() {
        if (this.f16534o.mo29488a() || this.f16531l > 0) {
            return this.f16541v;
        }
        this.f16534o.mo26675a(this.f16539t.f22170a, this.f16527h, false);
        return this.f16527h.mo29489a() + zzkt.m24719a(this.f16539t.f22172c);
    }

    /* renamed from: d */
    public final boolean mo26392d() {
        return this.f16529j;
    }

    /* renamed from: e */
    public final long mo26393e() {
        if (this.f16534o.mo29488a()) {
            return -9223372036854775807L;
        }
        return zzkt.m24719a(this.f16534o.mo29487a(m17844g(), this.f16526g, false).f22225i);
    }

    /* renamed from: f */
    public final int mo26394f() {
        return this.f16520a.length;
    }

    /* renamed from: o */
    public final int mo26395o() {
        return this.f16530k;
    }

    public final void stop() {
        this.f16524e.mo26505c();
    }

    /* renamed from: a */
    public final void mo26385a(zzql zzql) {
        if (!this.f16534o.mo29488a() || this.f16535p != null) {
            this.f16534o = zzlr.f22212a;
            this.f16535p = null;
            Iterator<zzkw> it = this.f16525f.iterator();
            while (it.hasNext()) {
                it.next().mo28044a(this.f16534o, this.f16535p);
            }
        }
        if (this.f16528i) {
            this.f16528i = false;
            this.f16536q = zzrb.f22574d;
            this.f16537r = this.f16522c;
            this.f16521b.mo29689a((Object) null);
            Iterator<zzkw> it2 = this.f16525f.iterator();
            while (it2.hasNext()) {
                it2.next().mo28046a(this.f16536q, this.f16537r);
            }
        }
        this.f16532m++;
        this.f16524e.mo26500a(zzql, true);
    }

    /* renamed from: b */
    public final void mo26390b(zzky... zzkyArr) {
        this.f16524e.mo26504b(zzkyArr);
    }

    /* renamed from: b */
    public final long mo26388b() {
        if (this.f16534o.mo29488a() || this.f16531l > 0) {
            return this.f16541v;
        }
        this.f16534o.mo26675a(this.f16539t.f22170a, this.f16527h, false);
        return this.f16527h.mo29489a() + zzkt.m24719a(this.f16539t.f22173d);
    }

    /* renamed from: a */
    public final void mo26386a(boolean z) {
        if (this.f16529j != z) {
            this.f16529j = z;
            this.f16524e.mo26501a(z);
            Iterator<zzkw> it = this.f16525f.iterator();
            while (it.hasNext()) {
                it.next().mo28053a(z, this.f16530k);
            }
        }
    }

    /* renamed from: a */
    public final void mo26382a(long j) {
        int g = m17844g();
        if (g < 0 || (!this.f16534o.mo29488a() && g >= this.f16534o.mo26677b())) {
            throw new zzlk(this.f16534o, g, j);
        }
        this.f16531l++;
        this.f16540u = g;
        if (!this.f16534o.mo29488a()) {
            this.f16534o.mo29487a(g, this.f16526g, false);
            if (j != -9223372036854775807L) {
                zzkt.m24720b(j);
            }
            this.f16534o.mo26675a(0, this.f16527h, false);
        }
        if (j == -9223372036854775807L) {
            this.f16541v = 0;
            this.f16524e.mo26499a(this.f16534o, g, -9223372036854775807L);
            return;
        }
        this.f16541v = j;
        this.f16524e.mo26499a(this.f16534o, g, zzkt.m24720b(j));
        Iterator<zzkw> it = this.f16525f.iterator();
        while (it.hasNext()) {
            it.next().mo28033a();
        }
    }

    /* renamed from: a */
    public final void mo26381a() {
        this.f16524e.mo26503b();
        this.f16523d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public final void mo26387a(zzky... zzkyArr) {
        this.f16524e.mo26502a(zzkyArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26383a(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.f16532m--;
                return;
            case 1:
                this.f16530k = message.arg1;
                Iterator<zzkw> it = this.f16525f.iterator();
                while (it.hasNext()) {
                    it.next().mo28053a(this.f16529j, this.f16530k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.f16533n = z;
                Iterator<zzkw> it2 = this.f16525f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo28052a(this.f16533n);
                }
                return;
            case 3:
                if (this.f16532m == 0) {
                    zzrr zzrr = (zzrr) message.obj;
                    this.f16528i = true;
                    this.f16536q = zzrr.f22600a;
                    this.f16537r = zzrr.f22601b;
                    this.f16521b.mo29689a(zzrr.f22602c);
                    Iterator<zzkw> it3 = this.f16525f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo28046a(this.f16536q, this.f16537r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f16531l - 1;
                this.f16531l = i;
                if (i == 0) {
                    this.f16539t = (zzle) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzkw> it4 = this.f16525f.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo28033a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f16531l == 0) {
                    this.f16539t = (zzle) message.obj;
                    Iterator<zzkw> it5 = this.f16525f.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo28033a();
                    }
                    return;
                }
                return;
            case 6:
                zzlg zzlg = (zzlg) message.obj;
                this.f16531l -= zzlg.f22177d;
                if (this.f16532m == 0) {
                    this.f16534o = zzlg.f22174a;
                    this.f16535p = zzlg.f22175b;
                    this.f16539t = zzlg.f22176c;
                    Iterator<zzkw> it6 = this.f16525f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo28044a(this.f16534o, this.f16535p);
                    }
                    return;
                }
                return;
            case 7:
                zzln zzln = (zzln) message.obj;
                if (!this.f16538s.equals(zzln)) {
                    this.f16538s = zzln;
                    Iterator<zzkw> it7 = this.f16525f.iterator();
                    while (it7.hasNext()) {
                        it7.next().mo28043a(zzln);
                    }
                    return;
                }
                return;
            case 8:
                zzku zzku = (zzku) message.obj;
                Iterator<zzkw> it8 = this.f16525f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo28041a(zzku);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
