package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
public final class zzbcw {

    /* renamed from: a */
    private final Context f18792a;

    /* renamed from: b */
    private final zzbdf f18793b;

    /* renamed from: c */
    private final ViewGroup f18794c;

    /* renamed from: d */
    private zzbcq f18795d;

    public zzbcw(Context context, ViewGroup viewGroup, zzbgz zzbgz) {
        this(context, viewGroup, zzbgz, (zzbcq) null);
    }

    /* renamed from: a */
    public final void mo27961a(int i, int i2, int i3, int i4) {
        Preconditions.m16042a("The underlay may only be modified from the UI thread.");
        zzbcq zzbcq = this.f18795d;
        if (zzbcq != null) {
            zzbcq.mo27940a(i, i2, i3, i4);
        }
    }

    /* renamed from: b */
    public final void mo27963b() {
        Preconditions.m16042a("onPause must be called from the UI thread.");
        zzbcq zzbcq = this.f18795d;
        if (zzbcq != null) {
            zzbcq.mo27946c();
        }
    }

    /* renamed from: c */
    public final zzbcq mo27964c() {
        Preconditions.m16042a("getAdVideoUnderlay must be called from the UI thread.");
        return this.f18795d;
    }

    @VisibleForTesting
    private zzbcw(Context context, ViewGroup viewGroup, zzbdf zzbdf, zzbcq zzbcq) {
        this.f18792a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f18794c = viewGroup;
        this.f18793b = zzbdf;
        this.f18795d = null;
    }

    /* renamed from: a */
    public final void mo27962a(int i, int i2, int i3, int i4, int i5, boolean z, zzbde zzbde) {
        if (this.f18795d == null) {
            zzadb.m19000a(this.f18793b.mo25694h().mo27178a(), this.f18793b.mo25725w(), "vpr2");
            Context context = this.f18792a;
            zzbdf zzbdf = this.f18793b;
            zzbcq zzbcq = new zzbcq(context, zzbdf, i5, z, zzbdf.mo25694h().mo27178a(), zzbde);
            this.f18795d = zzbcq;
            this.f18794c.addView(zzbcq, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            this.f18795d.mo27940a(i, i2, i3, i4);
            this.f18793b.mo25688f(false);
        }
    }

    /* renamed from: a */
    public final void mo27960a() {
        Preconditions.m16042a("onDestroy must be called from the UI thread.");
        zzbcq zzbcq = this.f18795d;
        if (zzbcq != null) {
            zzbcq.mo27944b();
            this.f18794c.removeView(this.f18795d);
            this.f18795d = null;
        }
    }
}
