package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
public final class zzlw {

    /* renamed from: a */
    private final int[] f22230a;

    /* renamed from: b */
    private final int f22231b = 2;

    static {
        new zzlw(new int[]{2}, 2);
    }

    private zzlw(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f22230a = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public final boolean mo29491a(int i) {
        return Arrays.binarySearch(this.f22230a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlw)) {
            return false;
        }
        zzlw zzlw = (zzlw) obj;
        return Arrays.equals(this.f22230a, zzlw.f22230a) && this.f22231b == zzlw.f22231b;
    }

    public final int hashCode() {
        return this.f22231b + (Arrays.hashCode(this.f22230a) * 31);
    }

    public final String toString() {
        int i = this.f22231b;
        String arrays = Arrays.toString(this.f22230a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
