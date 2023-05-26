package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class zzayt {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f18693a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Double> f18694b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f18695c = new ArrayList();

    /* renamed from: a */
    public final zzayt mo27859a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f18693a.size()) {
            double doubleValue = this.f18695c.get(i).doubleValue();
            double doubleValue2 = this.f18694b.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f18693a.add(i, str);
        this.f18695c.add(i, Double.valueOf(d));
        this.f18694b.add(i, Double.valueOf(d2));
        return this;
    }

    /* renamed from: a */
    public final zzayq mo27858a() {
        return new zzayq(this);
    }
}
