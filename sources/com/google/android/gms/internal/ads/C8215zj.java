package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.zj */
final class C8215zj implements zzban<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ boolean f17650a;

    /* renamed from: b */
    final /* synthetic */ zzcjm f17651b;

    C8215zj(zzcjm zzcjm, boolean z) {
        this.f17651b = zzcjm;
        this.f17650a = z;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        zzbad.m20519b("Failed to get signals bundle");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList a = zzcjm.m22610c(bundle);
        zzwt.zzi.zzc b = zzcjm.m22606b(bundle);
        this.f17651b.f20288e.mo28704a(new C7288ak(this, this.f17650a, a, this.f17651b.m22602a(bundle), b));
    }
}
