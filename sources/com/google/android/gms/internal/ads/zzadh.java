package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@zzard
public final class zzadh {

    /* renamed from: a */
    private final Map<String, zzadg> f18012a = new HashMap();

    /* renamed from: b */
    private final zzadi f18013b;

    public zzadh(zzadi zzadi) {
        this.f18013b = zzadi;
    }

    /* renamed from: a */
    public final void mo27179a(String str, zzadg zzadg) {
        this.f18012a.put(str, zzadg);
    }

    /* renamed from: a */
    public final void mo27180a(String str, String str2, long j) {
        zzadg zzadg;
        zzadi zzadi = this.f18013b;
        zzadg zzadg2 = this.f18012a.get(str2);
        String[] strArr = {str};
        if (!(zzadi == null || zzadg2 == null)) {
            zzadi.mo27185a(zzadg2, j, strArr);
        }
        Map<String, zzadg> map = this.f18012a;
        zzadi zzadi2 = this.f18013b;
        if (zzadi2 == null) {
            zzadg = null;
        } else {
            zzadg = zzadi2.mo27181a(j);
        }
        map.put(str, zzadg);
    }

    /* renamed from: a */
    public final zzadi mo27178a() {
        return this.f18013b;
    }
}
