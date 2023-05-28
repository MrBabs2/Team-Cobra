package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* renamed from: com.google.android.gms.internal.ads.kw */
final class C7673kw implements C8190yv {

    /* renamed from: a */
    private final zzdpk f16023a;

    /* renamed from: b */
    private final String f16024b;

    /* renamed from: c */
    private final Object[] f16025c;

    /* renamed from: d */
    private final int f16026d;

    C7673kw(zzdpk zzdpk, String str, Object[] objArr) {
        this.f16023a = zzdpk;
        this.f16024b = str;
        this.f16025c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16026d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f16026d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25604a() {
        return (this.f16026d & 2) == 2;
    }

    /* renamed from: b */
    public final zzdpk mo25605b() {
        return this.f16023a;
    }

    /* renamed from: c */
    public final int mo25606c() {
        return (this.f16026d & 1) == 1 ? zzdob.zze.f21582i : zzdob.zze.f21583j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo26187d() {
        return this.f16024b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Object[] mo26188e() {
        return this.f16025c;
    }
}
