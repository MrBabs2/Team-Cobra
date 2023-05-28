package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

@zzard
public final class zzbfa implements zzkw, zzqi, zzsj<zzrv>, zztn {
    @VisibleForTesting

    /* renamed from: r */
    private static int f18908r;
    @VisibleForTesting

    /* renamed from: s */
    private static int f18909s;

    /* renamed from: f */
    private final Context f18910f;

    /* renamed from: g */
    private final zzbez f18911g;

    /* renamed from: h */
    private final zzlo f18912h;

    /* renamed from: i */
    private final zzlo f18913i;

    /* renamed from: j */
    private final zzrj f18914j;

    /* renamed from: k */
    private final zzbde f18915k;

    /* renamed from: l */
    private zzkv f18916l;

    /* renamed from: m */
    private ByteBuffer f18917m;

    /* renamed from: n */
    private boolean f18918n;

    /* renamed from: o */
    private zzbfi f18919o;

    /* renamed from: p */
    private int f18920p;

    /* renamed from: q */
    private Set<WeakReference<C7724m9>> f18921q = new HashSet();

    public zzbfa(Context context, zzbde zzbde) {
        this.f18910f = context;
        this.f18915k = zzbde;
        this.f18911g = new zzbez();
        this.f18912h = new zzth(this.f18910f, zzpg.f22496a, 0, zzaxi.f18651h, this, -1);
        this.f18913i = new zzms(zzpg.f22496a);
        this.f18914j = new zzrg();
        if (zzawz.m20166a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzawz.m20167e(sb.toString());
        }
        f18908r++;
        zzkv a = zzkz.m24746a(new zzlo[]{this.f18913i, this.f18912h}, this.f18914j, this.f18911g);
        this.f18916l = a;
        a.mo26389b((zzkw) this);
    }

    /* renamed from: f */
    public static int m20768f() {
        return f18908r;
    }

    /* renamed from: g */
    public static int m20769g() {
        return f18909s;
    }

    /* renamed from: a */
    public final void mo28033a() {
    }

    /* renamed from: a */
    public final void mo28037a(int i, long j) {
    }

    /* renamed from: a */
    public final void mo28038a(Surface surface) {
    }

    /* renamed from: a */
    public final void mo28040a(zzbfi zzbfi) {
        this.f18919o = zzbfi;
    }

    /* renamed from: a */
    public final void mo28042a(zzlh zzlh) {
    }

    /* renamed from: a */
    public final void mo28043a(zzln zzln) {
    }

    /* renamed from: a */
    public final void mo28044a(zzlr zzlr, Object obj) {
    }

    /* renamed from: a */
    public final void mo28045a(zznc zznc) {
    }

    /* renamed from: a */
    public final void mo28046a(zzrb zzrb, zzro zzro) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28048a(Object obj) {
    }

    /* renamed from: a */
    public final void mo28051a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo28052a(boolean z) {
    }

    /* renamed from: b */
    public final long mo28057b() {
        return (long) this.f18920p;
    }

    /* renamed from: b */
    public final void mo28059b(zznc zznc) {
    }

    /* renamed from: c */
    public final void mo28061c() {
        zzkv zzkv = this.f18916l;
        if (zzkv != null) {
            zzkv.mo26384a((zzkw) this);
            this.f18916l.mo26381a();
            this.f18916l = null;
            f18909s--;
        }
    }

    /* renamed from: d */
    public final zzkv mo28062d() {
        return this.f18916l;
    }

    /* renamed from: e */
    public final zzbez mo28063e() {
        return this.f18911g;
    }

    public final void finalize() throws Throwable {
        f18908r--;
        if (zzawz.m20166a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzawz.m20167e(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo28055a(Uri[] uriArr, String str) {
        mo28056a(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo28060b(boolean z) {
        for (int i = 0; i < this.f18916l.mo26394f(); i++) {
            this.f18914j.mo29688a(i, !z);
        }
    }

    /* renamed from: a */
    public final void mo28056a(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzql zzql;
        this.f18917m = byteBuffer;
        this.f18918n = z;
        if (uriArr.length == 1) {
            zzql = m20767a(uriArr[0], str);
        } else {
            zzql[] zzqlArr = new zzql[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                zzqlArr[i] = m20767a(uriArr[i], str);
            }
            zzql = new zzqo(zzqlArr);
        }
        this.f18916l.mo26385a(zzql);
        f18909s++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzrv mo28058b(String str) {
        zzbfa zzbfa = this.f18915k.f18836j ? null : this;
        zzbde zzbde = this.f18915k;
        C7724m9 m9Var = new C7724m9(str, zzbfa, zzbde.f18830d, zzbde.f18832f, zzbde.f18835i);
        this.f18921q.add(new WeakReference(m9Var));
        return m9Var;
    }

    /* renamed from: a */
    public final void mo28047a(IOException iOException) {
        zzbfi zzbfi = this.f18919o;
        if (zzbfi != null) {
            zzbfi.mo28003a("onLoadError", (Exception) iOException);
        }
    }

    /* renamed from: a */
    public final void mo28036a(int i, int i2, int i3, float f) {
        zzbfi zzbfi = this.f18919o;
        if (zzbfi != null) {
            zzbfi.mo28001a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo28053a(boolean z, int i) {
        zzbfi zzbfi = this.f18919o;
        if (zzbfi != null) {
            zzbfi.mo28000a(i);
        }
    }

    /* renamed from: a */
    public final void mo28041a(zzku zzku) {
        zzbfi zzbfi = this.f18919o;
        if (zzbfi != null) {
            zzbfi.mo28003a("onPlayerError", (Exception) zzku);
        }
    }

    /* renamed from: a */
    public final void mo28035a(int i) {
        for (WeakReference<C7724m9> weakReference : this.f18921q) {
            C7724m9 m9Var = (C7724m9) weakReference.get();
            if (m9Var != null) {
                m9Var.mo26233a(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo28039a(Surface surface, boolean z) {
        zzky zzky = new zzky(this.f18912h, 1, surface);
        if (z) {
            this.f18916l.mo26390b(zzky);
            return;
        }
        this.f18916l.mo26387a(zzky);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo28034a(float f, boolean z) {
        zzky zzky = new zzky(this.f18913i, 2, Float.valueOf(f));
        if (z) {
            this.f18916l.mo26390b(zzky);
            return;
        }
        this.f18916l.mo26387a(zzky);
    }

    @VisibleForTesting
    /* renamed from: a */
    private final zzql m20767a(Uri uri, String str) {
        zzrw zzrw;
        if (!this.f18918n || this.f18917m.limit() <= 0) {
            if (this.f18915k.f18835i > 0) {
                zzrw = new C7835p9(this, str);
            } else {
                zzrw = new C7872q9(this, str);
            }
            if (this.f18915k.f18836j) {
                zzrw = new C7909r9(this, zzrw);
            }
            if (this.f18917m.limit() > 0) {
                byte[] bArr = new byte[this.f18917m.limit()];
                this.f18917m.get(bArr);
                zzrw = new C7946s9(zzrw, bArr);
            }
        } else {
            byte[] bArr2 = new byte[this.f18917m.limit()];
            this.f18917m.get(bArr2);
            zzrw = new C7798o9(bArr2);
        }
        return new zzqh(uri, zzrw, C7983t9.f16897a, -1, zzaxi.f18651h, this, (String) null, this.f18915k.f18833g);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28049a(Object obj, int i) {
        this.f18920p += i;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28050a(Object obj, zzry zzry) {
        this.f18920p = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzrv mo28031a(zzrw zzrw) {
        return new zzbex(this.f18910f, zzrw.mo26357a(), this, new C8020u9(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28054a(boolean z, long j) {
        zzbfi zzbfi = this.f18919o;
        if (zzbfi != null) {
            zzbfi.mo28004a(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzrv mo28032a(String str) {
        zzbfa zzbfa = this.f18915k.f18836j ? null : this;
        zzbde zzbde = this.f18915k;
        return new zzsa(str, (zzsv<String>) null, zzbfa, zzbde.f18830d, zzbde.f18832f, true, (zzsd) null);
    }
}
