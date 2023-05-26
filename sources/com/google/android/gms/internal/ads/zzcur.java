package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzcur implements zzcuz<Bundle> {

    /* renamed from: a */
    private final String f20980a;

    /* renamed from: b */
    private final String f20981b;

    /* renamed from: c */
    private final String f20982c;

    /* renamed from: d */
    private final String f20983d;

    /* renamed from: e */
    private final Long f20984e;

    public zzcur(String str, String str2, String str3, String str4, Long l) {
        this.f20980a = str;
        this.f20981b = str2;
        this.f20982c = str3;
        this.f20983d = str4;
        this.f20984e = l;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzcxz.m23105a(bundle, "gmp_app_id", this.f20980a);
        zzcxz.m23105a(bundle, "fbs_aiid", this.f20981b);
        zzcxz.m23105a(bundle, "fbs_aeid", this.f20982c);
        zzcxz.m23105a(bundle, "apm_id_origin", this.f20983d);
        Long l = this.f20984e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
