package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzxo extends zzdrr<zzxo> {

    /* renamed from: c */
    public Integer f22972c = null;

    /* renamed from: d */
    public Integer f22973d = null;

    /* renamed from: e */
    public Integer f22974e = null;

    public zzxo() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        Integer num = this.f22972c;
        if (num != null) {
            zzdrp.mo29197b(1, num.intValue());
        }
        Integer num2 = this.f22973d;
        if (num2 != null) {
            zzdrp.mo29197b(2, num2.intValue());
        }
        Integer num3 = this.f22974e;
        if (num3 != null) {
            zzdrp.mo29197b(3, num3.intValue());
        }
        super.mo29198a(zzdrp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29200c() {
        int c = super.mo29200c();
        Integer num = this.f22972c;
        if (num != null) {
            c += zzdrp.m24123c(1, num.intValue());
        }
        Integer num2 = this.f22973d;
        if (num2 != null) {
            c += zzdrp.m24123c(2, num2.intValue());
        }
        Integer num3 = this.f22974e;
        return num3 != null ? c + zzdrp.m24123c(3, num3.intValue()) : c;
    }
}
