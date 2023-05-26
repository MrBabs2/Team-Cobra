package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@TargetApi(16)
@zzard
public final class zzbdk {
    @VisibleForTesting

    /* renamed from: h */
    private static int f18860h;
    @VisibleForTesting

    /* renamed from: i */
    private static int f18861i;

    /* renamed from: a */
    private zzge f18862a;

    /* renamed from: b */
    private zzhd f18863b;

    /* renamed from: c */
    private zzgn f18864c;

    /* renamed from: d */
    private zzbdo f18865d;

    /* renamed from: e */
    private final C7612j8 f18866e = new C7612j8(this);

    /* renamed from: f */
    private final C7649k8 f18867f = new C7649k8(this);

    /* renamed from: g */
    private final C7571i8 f18868g = new C7571i8(this);

    public zzbdk() {
        Preconditions.m16042a("ExoPlayer must be created on the main UI thread.");
        if (zzawz.m20166a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("AdExoPlayerHelper initialize ");
            sb.append(valueOf);
            zzawz.m20167e(sb.toString());
        }
        f18860h++;
        zzge a = zzgg.m24381a(2);
        this.f18862a = a;
        a.mo26845a((zzgh) this.f18866e);
    }

    /* renamed from: f */
    public static int m20699f() {
        return f18860h;
    }

    /* renamed from: g */
    public static int m20700g() {
        return f18861i;
    }

    /* renamed from: a */
    public final boolean mo27994a(zzhn zzhn) {
        if (this.f18862a == null) {
            return false;
        }
        this.f18863b = new zzhd(zzhn, 1, 0, zzaxi.f18651h, this.f18867f, -1);
        zzgn zzgn = new zzgn(zzhn, zzaxi.f18651h, this.f18868g);
        this.f18864c = zzgn;
        this.f18862a.mo26847a(this.f18863b, zzgn);
        f18861i++;
        return true;
    }

    /* renamed from: b */
    public final void mo27995b() {
        zzge zzge = this.f18862a;
        if (zzge != null) {
            zzge.mo26840a();
            this.f18862a = null;
            f18861i--;
        }
    }

    /* renamed from: c */
    public final zzge mo27996c() {
        return this.f18862a;
    }

    /* renamed from: d */
    public final zzhd mo27997d() {
        return this.f18863b;
    }

    /* renamed from: e */
    public final zzgn mo27998e() {
        return this.f18864c;
    }

    public final void finalize() throws Throwable {
        f18860h--;
        if (zzawz.m20166a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("AdExoPlayerHelper finalize ");
            sb.append(valueOf);
            zzawz.m20167e(sb.toString());
        }
    }

    /* renamed from: a */
    public final synchronized void mo27992a(zzbdo zzbdo) {
        this.f18865d = zzbdo;
    }

    /* renamed from: a */
    public final synchronized void mo27991a() {
        this.f18865d = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m20698a(String str, String str2) {
        if (this.f18865d != null) {
            this.f18865d.mo26130a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo27993a(zzgh zzgh, zzhh zzhh, zzgq zzgq) {
        this.f18866e.mo26127a(zzgh);
        this.f18867f.mo26168a(zzhh);
        this.f18868g.mo26076a(zzgq);
    }
}
