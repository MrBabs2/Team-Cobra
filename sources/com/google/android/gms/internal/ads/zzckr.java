package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;
import p050l.p063c.p064b.C4858c;

public final class zzckr implements zzcjv<zzbvx> {

    /* renamed from: a */
    private final Context f20328a;

    /* renamed from: b */
    private final zzbws f20329b;

    /* renamed from: c */
    private final Executor f20330c;

    /* renamed from: d */
    private final zzcxk f20331d;

    public zzckr(Context context, Executor executor, zzbws zzbws, zzcxk zzcxk) {
        this.f20328a = context;
        this.f20329b = zzbws;
        this.f20330c = executor;
        this.f20331d = zzcxk;
    }

    /* renamed from: a */
    public final zzbbh<zzbvx> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        String a = m22635a(zzcxm);
        return zzbar.m20542a(zzbar.m20539a(null), new C7846pk(this, a != null ? Uri.parse(a) : null, zzcxu, zzcxm), this.f20330c);
    }

    /* renamed from: b */
    public final boolean mo28717b(zzcxu zzcxu, zzcxm zzcxm) {
        return (this.f20328a instanceof Activity) && PlatformVersion.m16286b() && zzads.m19024a(this.f20328a) && !TextUtils.isEmpty(m22635a(zzcxm));
    }

    /* renamed from: a */
    private static String m22635a(zzcxm zzcxm) {
        try {
            return zzcxm.f21135s.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28725a(Uri uri, zzcxu zzcxu, zzcxm zzcxm, Object obj) throws Exception {
        try {
            C4858c b = new C4858c.C4859a().mo16896b();
            b.f8326a.setData(uri);
            zzc zzc = new zzc(b.f8326a);
            zzbbr zzbbr = new zzbbr();
            zzbvy a = this.f20329b.mo26025a(new zzbpr(zzcxu, zzcxm, (String) null), new zzbvz(new C7883qk(zzbbr)));
            zzbbr.mo27904b(new AdOverlayInfoParcel(zzc, (zzxr) null, a.mo26082i(), (zzu) null, new zzbai(0, 0, false)));
            this.f20331d.mo28815c();
            return zzbar.m20539a(a.mo26081h());
        } catch (Throwable th) {
            zzbad.m20520b("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
