package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class zzdlo {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f21483a = new C7892qt();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static SecureRandom m23737a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: a */
    public static byte[] m23738a(int i) {
        byte[] bArr = new byte[i];
        f21483a.get().nextBytes(bArr);
        return bArr;
    }
}
