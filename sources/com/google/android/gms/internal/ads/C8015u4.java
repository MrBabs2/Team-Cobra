package com.google.android.gms.internal.ads;

import android.os.Bundle;

@zzard
/* renamed from: com.google.android.gms.internal.ads.u4 */
final class C8015u4 {

    /* renamed from: a */
    private long f16940a = -1;

    /* renamed from: b */
    private long f16941b = -1;

    /* renamed from: c */
    private final /* synthetic */ zzawj f16942c;

    public C8015u4(zzawj zzawj) {
        this.f16942c = zzawj;
    }

    /* renamed from: a */
    public final Bundle mo26649a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f16940a);
        bundle.putLong("tclose", this.f16941b);
        return bundle;
    }

    /* renamed from: b */
    public final long mo26650b() {
        return this.f16941b;
    }

    /* renamed from: c */
    public final void mo26651c() {
        this.f16941b = this.f16942c.f18572a.mo25499c();
    }

    /* renamed from: d */
    public final void mo26652d() {
        this.f16940a = this.f16942c.f18572a.mo25499c();
    }
}
