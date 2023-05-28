package com.airbnb.epoxy;

/* renamed from: com.airbnb.epoxy.y */
/* compiled from: IdUtils */
public final class C5640y {
    /* renamed from: a */
    public static long m10729a(long j) {
        long j2 = j ^ (j << 21);
        long j3 = j2 ^ (j2 >>> 35);
        return j3 ^ (j3 << 4);
    }

    /* renamed from: a */
    public static long m10730a(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        long j = -3750763034362895579L;
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            j = (j ^ ((long) charSequence.charAt(i))) * 1099511628211L;
        }
        return j;
    }
}
