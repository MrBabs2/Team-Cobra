package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.x5 */
final class C8127x5 extends zzax {

    /* renamed from: u */
    private final /* synthetic */ byte[] f17168u;

    /* renamed from: v */
    private final /* synthetic */ Map f17169v;

    /* renamed from: w */
    private final /* synthetic */ zzazx f17170w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8127x5(zzayu zzayu, int i, String str, zzaa zzaa, zzz zzz, byte[] bArr, Map map, zzazx zzazx) {
        super(i, str, zzaa, zzz);
        this.f17168u = bArr;
        this.f17169v = map;
        this.f17170w = zzazx;
    }

    /* renamed from: a */
    public final Map<String, String> mo26761a() throws zza {
        Map<String, String> map = this.f17169v;
        return map == null ? super.mo26761a() : map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo26762a(String str) {
        this.f17170w.mo27882a(str);
        super.mo26762a(str);
    }

    /* renamed from: p */
    public final byte[] mo26764p() throws zza {
        byte[] bArr = this.f17168u;
        return bArr == null ? super.mo26764p() : bArr;
    }
}
