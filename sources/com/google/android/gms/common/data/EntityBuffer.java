package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {

    /* renamed from: g */
    private boolean f14046g;

    /* renamed from: h */
    private ArrayList<Integer> f14047h;

    /* renamed from: d */
    private final void m15926d() {
        synchronized (this) {
            if (!this.f14046g) {
                int count = this.f14024f.getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.f14047h = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String c = mo25240c();
                    String c2 = this.f14024f.mo25229c(c, 0, this.f14024f.mo25227a(0));
                    int i = 1;
                    while (i < count) {
                        int a = this.f14024f.mo25227a(i);
                        String c3 = this.f14024f.mo25229c(c, i, a);
                        if (c3 != null) {
                            if (!c3.equals(c2)) {
                                this.f14047h.add(Integer.valueOf(i));
                                c2 = c3;
                            }
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(c);
                            sb.append(", at row: ");
                            sb.append(i);
                            sb.append(", for window: ");
                            sb.append(a);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.f14046g = true;
            }
        }
    }

    /* renamed from: h */
    private final int m15927h(int i) {
        if (i >= 0 && i < this.f14047h.size()) {
            return this.f14047h.get(i).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: a */
    public abstract T mo25238a(int i, int i2);

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public String mo25239b() {
        return null;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: c */
    public abstract String mo25240c();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (r6.f14024f.mo25229c(r4, r7, r3) == null) goto L_0x0067;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T get(int r7) {
        /*
            r6 = this;
            r6.m15926d()
            int r0 = r6.m15927h(r7)
            r1 = 0
            if (r7 < 0) goto L_0x0067
            java.util.ArrayList<java.lang.Integer> r2 = r6.f14047h
            int r2 = r2.size()
            if (r7 != r2) goto L_0x0013
            goto L_0x0067
        L_0x0013:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f14047h
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            if (r7 != r2) goto L_0x0030
            com.google.android.gms.common.data.DataHolder r2 = r6.f14024f
            int r2 = r2.getCount()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f14047h
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x004a
        L_0x0030:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f14047h
            int r4 = r7 + 1
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f14047h
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x004a:
            int r2 = r2 - r4
            if (r2 != r3) goto L_0x0066
            int r7 = r6.m15927h(r7)
            com.google.android.gms.common.data.DataHolder r3 = r6.f14024f
            int r3 = r3.mo25227a(r7)
            java.lang.String r4 = r6.mo25239b()
            if (r4 == 0) goto L_0x0066
            com.google.android.gms.common.data.DataHolder r5 = r6.f14024f
            java.lang.String r7 = r5.mo25229c(r4, r7, r3)
            if (r7 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r1 = r2
        L_0x0067:
            java.lang.Object r7 = r6.mo25238a(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.EntityBuffer.get(int):java.lang.Object");
    }

    @KeepForSdk
    public int getCount() {
        m15926d();
        return this.f14047h.size();
    }
}
