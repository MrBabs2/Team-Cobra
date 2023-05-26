package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzl {

    /* renamed from: a */
    private final String f22168a;

    /* renamed from: b */
    private final String f22169b;

    public zzl(String str, String str2) {
        this.f22168a = str;
        this.f22169b = str2;
    }

    /* renamed from: a */
    public final String mo29461a() {
        return this.f22168a;
    }

    /* renamed from: b */
    public final String mo29462b() {
        return this.f22169b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzl.class == obj.getClass()) {
            zzl zzl = (zzl) obj;
            return TextUtils.equals(this.f22168a, zzl.f22168a) && TextUtils.equals(this.f22169b, zzl.f22169b);
        }
    }

    public final int hashCode() {
        return (this.f22168a.hashCode() * 31) + this.f22169b.hashCode();
    }

    public final String toString() {
        String str = this.f22168a;
        String str2 = this.f22169b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
