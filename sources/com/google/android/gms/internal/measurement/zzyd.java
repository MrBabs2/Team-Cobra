package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyc;
import java.io.IOException;

public final class zzyd<M extends zzyc<M>, T> {

    /* renamed from: a */
    private final int f23569a;

    /* renamed from: b */
    protected final Class<T> f23570b;

    /* renamed from: c */
    public final int f23571c;

    /* renamed from: d */
    protected final boolean f23572d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30489a(Object obj, zzya zzya) {
        try {
            zzya.mo30480a(this.f23571c);
            int i = this.f23569a;
            if (i == 10) {
                ((zzyi) obj).mo30485a(zzya);
                zzya.mo30481a(this.f23571c >>> 3, 4);
            } else if (i == 11) {
                zzya.mo30482a((zzyi) obj);
            } else {
                int i2 = this.f23569a;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzyd)) {
            return false;
        }
        zzyd zzyd = (zzyd) obj;
        return this.f23569a == zzyd.f23569a && this.f23570b == zzyd.f23570b && this.f23571c == zzyd.f23571c && this.f23572d == zzyd.f23572d;
    }

    public final int hashCode() {
        return ((((((this.f23569a + 1147) * 31) + this.f23570b.hashCode()) * 31) + this.f23571c) * 31) + (this.f23572d ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30488a(Object obj) {
        int i = this.f23571c >>> 3;
        int i2 = this.f23569a;
        if (i2 == 10) {
            return (zzya.m26738b(i) << 1) + ((zzyi) obj).mo30497b();
        }
        if (i2 == 11) {
            return zzya.m26736a(i, (zzyi) obj);
        }
        int i3 = this.f23569a;
        StringBuilder sb = new StringBuilder(24);
        sb.append("Unknown type ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }
}
