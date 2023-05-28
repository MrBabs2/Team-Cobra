package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzdsq extends zzdrr<zzdsq> {

    /* renamed from: c */
    public String f21714c = null;

    /* renamed from: d */
    public Long f21715d = null;

    /* renamed from: e */
    public Boolean f21716e = null;

    public zzdsq() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        String str = this.f21714c;
        if (str != null) {
            zzdrp.mo29193a(1, str);
        }
        Long l = this.f21715d;
        if (l != null) {
            long longValue = l.longValue();
            zzdrp.mo29190a(2, 0);
            zzdrp.mo29196a(longValue);
        }
        Boolean bool = this.f21716e;
        if (bool != null) {
            zzdrp.mo29194a(3, bool.booleanValue());
        }
        super.mo29198a(zzdrp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29200c() {
        int c = super.mo29200c();
        String str = this.f21714c;
        if (str != null) {
            c += zzdrp.m24119b(1, str);
        }
        Long l = this.f21715d;
        if (l != null) {
            c += zzdrp.m24111a(2) + zzdrp.m24121b(l.longValue());
        }
        Boolean bool = this.f21716e;
        if (bool == null) {
            return c;
        }
        bool.booleanValue();
        return c + zzdrp.m24111a(3) + 1;
    }
}
