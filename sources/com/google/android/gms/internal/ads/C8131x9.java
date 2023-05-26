package com.google.android.gms.internal.ads;

@zzard
/* renamed from: com.google.android.gms.internal.ads.x9 */
final class C8131x9 extends zzay {

    /* renamed from: c */
    static final C8131x9 f17176c = new C8131x9();

    C8131x9() {
    }

    /* renamed from: a */
    public final zzbd mo26768a(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzbf();
        }
        if ("mvhd".equals(str)) {
            return new zzbg();
        }
        return new zzbh(str);
    }
}
