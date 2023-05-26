package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzir extends C8157xz {

    /* renamed from: N */
    public final long f22042N;

    /* renamed from: O */
    public final List<zzis> f22043O = new ArrayList();

    /* renamed from: P */
    public final List<zzir> f22044P = new ArrayList();

    public zzir(int i, long j) {
        super(i);
        this.f22042N = j;
    }

    /* renamed from: c */
    public final zzis mo29393c(int i) {
        int size = this.f22043O.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzis zzis = this.f22043O.get(i2);
            if (zzis.f17252a == i) {
                return zzis;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final zzir mo29394d(int i) {
        int size = this.f22044P.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzir zzir = this.f22044P.get(i2);
            if (zzir.f17252a == i) {
                return zzir;
            }
        }
        return null;
    }

    public final String toString() {
        String b = C8157xz.m18481b(this.f17252a);
        String valueOf = String.valueOf(Arrays.toString(this.f22043O.toArray(new zzis[0])));
        String valueOf2 = String.valueOf(Arrays.toString(this.f22044P.toArray(new zzir[0])));
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 22 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(b);
        sb.append(" leaves: ");
        sb.append(valueOf);
        sb.append(" containers: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
