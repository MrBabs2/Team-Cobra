package com.google.android.gms.internal.ads;

import java.math.BigInteger;

@zzard
public final class zzawt {

    /* renamed from: a */
    private BigInteger f18614a = BigInteger.ONE;

    /* renamed from: b */
    private String f18615b = "0";

    /* renamed from: a */
    public final synchronized String mo27752a() {
        String bigInteger;
        bigInteger = this.f18614a.toString();
        this.f18614a = this.f18614a.add(BigInteger.ONE);
        this.f18615b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String mo27753b() {
        return this.f18615b;
    }
}
