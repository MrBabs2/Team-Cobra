package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class u40 implements Comparator<zzvi> {
    u40(zzvb zzvb) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzvi zzvi = (zzvi) obj;
        zzvi zzvi2 = (zzvi) obj2;
        int i = zzvi.f22840c - zzvi2.f22840c;
        if (i != 0) {
            return i;
        }
        return (int) (zzvi.f22838a - zzvi2.f22838a);
    }
}
