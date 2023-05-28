package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;

@TargetApi(16)
@zzard
public final class zzbgh extends zzbgl {

    /* renamed from: m */
    private final String f18952m = null;

    public zzbgh(zzbdf zzbdf, String str) {
        super(zzbdf);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28091b(boolean z, long j) {
        zzbdf zzbdf = (zzbdf) this.f18931h.get();
        if (zzbdf != null) {
            zzbbm.f18748a.execute(new C7573ia(zzbdf, z, j));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo28092c() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzhn mo28093c(String str) {
        zzjp zzjt = new zzjt(this.f18929f, this.f18930g);
        return new zzig(Uri.parse(str), ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17859V1)).booleanValue() ? new zzbeh(this.f18929f, zzjt, new C7536ha(this)) : zzjt, "video/webm".equals(this.f18952m) ? new zzjg() : new zziv(), 2, ((Integer) zzyt.m25670e().mo27163a(zzacu.f17961s)).intValue());
    }
}
