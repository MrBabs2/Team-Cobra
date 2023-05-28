package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzdso extends zzdrr<zzdso> {

    /* renamed from: c */
    public Integer f21704c = null;

    /* renamed from: d */
    public String f21705d = null;

    /* renamed from: e */
    public byte[] f21706e = null;

    public zzdso() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        Integer num = this.f21704c;
        if (num != null) {
            zzdrp.mo29197b(1, num.intValue());
        }
        String str = this.f21705d;
        if (str != null) {
            zzdrp.mo29193a(2, str);
        }
        byte[] bArr = this.f21706e;
        if (bArr != null) {
            zzdrp.mo29195a(3, bArr);
        }
        super.mo29198a(zzdrp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29200c() {
        int c = super.mo29200c();
        Integer num = this.f21704c;
        if (num != null) {
            c += zzdrp.m24123c(1, num.intValue());
        }
        String str = this.f21705d;
        if (str != null) {
            c += zzdrp.m24119b(2, str);
        }
        byte[] bArr = this.f21706e;
        return bArr != null ? c + zzdrp.m24120b(3, bArr) : c;
    }
}
