package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzxl extends zzdrr<zzxl> {

    /* renamed from: c */
    public String f22964c = null;

    /* renamed from: d */
    public zzxo f22965d = null;

    public zzxl() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        String str = this.f22964c;
        if (str != null) {
            zzdrp.mo29193a(1, str);
        }
        zzxo zzxo = this.f22965d;
        if (zzxo != null) {
            zzdrp.mo29192a(4, (zzdrw) zzxo);
        }
        super.mo29198a(zzdrp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29200c() {
        int c = super.mo29200c();
        String str = this.f22964c;
        if (str != null) {
            c += zzdrp.m24119b(1, str);
        }
        zzxo zzxo = this.f22965d;
        return zzxo != null ? c + zzdrp.m24118b(4, (zzdrw) zzxo) : c;
    }
}
