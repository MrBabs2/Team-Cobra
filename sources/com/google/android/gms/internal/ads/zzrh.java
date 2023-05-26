package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzrh {

    /* renamed from: a */
    public final boolean f22585a;

    /* renamed from: b */
    public final int f22586b;

    /* renamed from: c */
    public final int f22587c;

    /* renamed from: d */
    public final int f22588d;

    /* renamed from: e */
    public final boolean f22589e;

    /* renamed from: f */
    public final boolean f22590f;

    /* renamed from: g */
    public final int f22591g;

    /* renamed from: h */
    public final int f22592h;

    /* renamed from: i */
    public final boolean f22593i;

    public zzrh() {
        this((String) null, (String) null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzrh.class == obj.getClass()) {
            zzrh zzrh = (zzrh) obj;
            return this.f22585a == zzrh.f22585a && this.f22586b == zzrh.f22586b && this.f22587c == zzrh.f22587c && this.f22589e == zzrh.f22589e && this.f22590f == zzrh.f22590f && this.f22593i == zzrh.f22593i && this.f22591g == zzrh.f22591g && this.f22592h == zzrh.f22592h && this.f22588d == zzrh.f22588d && TextUtils.equals((CharSequence) null, (CharSequence) null) && TextUtils.equals((CharSequence) null, (CharSequence) null);
        }
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.f22585a ? 1 : 0)) * 31) + this.f22586b) * 31) + this.f22587c) * 31) + this.f22588d) * 31) + (this.f22589e ? 1 : 0)) * 31) + (this.f22590f ? 1 : 0)) * 31) + (this.f22593i ? 1 : 0)) * 31) + this.f22591g) * 31) + this.f22592h;
    }

    private zzrh(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.f22585a = true;
        this.f22586b = Integer.MAX_VALUE;
        this.f22587c = Integer.MAX_VALUE;
        this.f22588d = Integer.MAX_VALUE;
        this.f22589e = true;
        this.f22590f = true;
        this.f22591g = Integer.MAX_VALUE;
        this.f22592h = Integer.MAX_VALUE;
        this.f22593i = true;
    }
}
