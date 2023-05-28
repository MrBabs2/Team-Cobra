package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

public final class zzlv {

    /* renamed from: a */
    private static final int[] f22227a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f22228b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f22229c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: a */
    public static int m24800a() {
        return 1536;
    }

    /* renamed from: a */
    public static zzlh m24802a(zzst zzst, String str, String str2, zzne zzne) {
        int i = f22228b[(zzst.mo29735g() & 192) >> 6];
        int g = zzst.mo29735g();
        int i2 = f22229c[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return zzlh.m24751a(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, (zzne) null, 0, str2);
    }

    /* renamed from: b */
    public static zzlh m24803b(zzst zzst, String str, String str2, zzne zzne) {
        zzst.mo29729c(2);
        int i = f22228b[(zzst.mo29735g() & 192) >> 6];
        int g = zzst.mo29735g();
        int i2 = f22229c[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return zzlh.m24751a(str, "audio/eac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, (zzne) null, 0, str2);
    }

    /* renamed from: a */
    public static int m24801a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f22227a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }
}
