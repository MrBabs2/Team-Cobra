package com.google.android.gms.internal.ads;

import java.util.Map;

@zzard
public final class zzagw implements zzaho<Object> {

    /* renamed from: a */
    private final zzagx f18093a;

    public zzagw(zzagx zzagx) {
        this.f18093a = zzagx;
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            zzbad.m20523d("App event with no name parameter.");
        } else {
            this.f18093a.onAppEvent(str, map.get("info"));
        }
    }
}
