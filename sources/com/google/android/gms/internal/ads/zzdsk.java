package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzdsk extends zzdrr<zzdsk> {

    /* renamed from: c */
    public String f21699c = null;

    public zzdsk() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        String str = this.f21699c;
        if (str != null) {
            zzdrp.mo29193a(1, str);
        }
        super.mo29198a(zzdrp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29200c() {
        int c = super.mo29200c();
        String str = this.f21699c;
        return str != null ? c + zzdrp.m24119b(1, str) : c;
    }
}
