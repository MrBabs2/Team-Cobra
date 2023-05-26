package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class b20 extends a20 {

    /* renamed from: A0 */
    public final List<c20> f14537A0 = new ArrayList();

    /* renamed from: B0 */
    public final List<b20> f14538B0 = new ArrayList();

    /* renamed from: z0 */
    public final long f14539z0;

    public b20(int i, long j) {
        super(i);
        this.f14539z0 = j;
    }

    /* renamed from: d */
    public final c20 mo25623d(int i) {
        int size = this.f14537A0.size();
        for (int i2 = 0; i2 < size; i2++) {
            c20 c20 = this.f14537A0.get(i2);
            if (c20.f14396a == i) {
                return c20;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final b20 mo25624e(int i) {
        int size = this.f14538B0.size();
        for (int i2 = 0; i2 < size; i2++) {
            b20 b20 = this.f14538B0.get(i2);
            if (b20.f14396a == i) {
                return b20;
            }
        }
        return null;
    }

    public final String toString() {
        String c = a20.m16462c(this.f14396a);
        String arrays = Arrays.toString(this.f14537A0.toArray());
        String arrays2 = Arrays.toString(this.f14538B0.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(c);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
