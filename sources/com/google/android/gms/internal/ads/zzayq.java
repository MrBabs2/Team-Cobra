package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@zzard
public final class zzayq {

    /* renamed from: a */
    private final String[] f18683a;

    /* renamed from: b */
    private final double[] f18684b;

    /* renamed from: c */
    private final double[] f18685c;

    /* renamed from: d */
    private final int[] f18686d;

    /* renamed from: e */
    private int f18687e;

    private zzayq(zzayt zzayt) {
        int size = zzayt.f18694b.size();
        this.f18683a = (String[]) zzayt.f18693a.toArray(new String[size]);
        this.f18684b = m20411a((List<Double>) zzayt.f18694b);
        this.f18685c = m20411a((List<Double>) zzayt.f18695c);
        this.f18686d = new int[size];
        this.f18687e = 0;
    }

    /* renamed from: a */
    private static double[] m20411a(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final void mo27854a(double d) {
        this.f18687e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f18685c;
            if (i < dArr.length) {
                if (dArr[i] <= d && d < this.f18684b[i]) {
                    int[] iArr = this.f18686d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d >= this.f18685c[i]) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final List<zzays> mo27853a() {
        ArrayList arrayList = new ArrayList(this.f18683a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f18683a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.f18685c[i];
            double d2 = this.f18684b[i];
            int[] iArr = this.f18686d;
            double d3 = (double) iArr[i];
            double d4 = (double) this.f18687e;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzays(str, d, d2, d3 / d4, iArr[i]));
            i++;
        }
    }
}
