package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzaza extends zzr<zzp> {

    /* renamed from: s */
    private final zzbbr<zzp> f18698s;

    /* renamed from: t */
    private final zzazx f18699t;

    public zzaza(String str, zzbbr<zzp> zzbbr) {
        this(str, (Map<String, String>) null, zzbbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zzy<zzp> mo27762a(zzp zzp) {
        return zzy.m25640a(zzp, zzaq.m19828a(zzp));
    }

    private zzaza(String str, Map<String, String> map, zzbbr<zzp> zzbbr) {
        super(0, str, new C7274a6(zzbbr));
        this.f18698s = zzbbr;
        zzazx zzazx = new zzazx();
        this.f18699t = zzazx;
        zzazx.mo27883a(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo26762a(Object obj) {
        zzp zzp = (zzp) obj;
        this.f18699t.mo27886a((Map<String, ?>) zzp.f22438c, zzp.f22436a);
        zzazx zzazx = this.f18699t;
        byte[] bArr = zzp.f22437b;
        if (zzazx.m20498a() && bArr != null) {
            zzazx.mo27887a(bArr);
        }
        this.f18698s.mo27904b(zzp);
    }
}
