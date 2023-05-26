package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
public final class zztl {

    /* renamed from: a */
    private final w30 f22726a;

    /* renamed from: b */
    private final boolean f22727b;

    /* renamed from: c */
    private final long f22728c;

    /* renamed from: d */
    private final long f22729d;

    /* renamed from: e */
    private long f22730e;

    /* renamed from: f */
    private long f22731f;

    /* renamed from: g */
    private long f22732g;

    /* renamed from: h */
    private boolean f22733h;

    /* renamed from: i */
    private long f22734i;

    /* renamed from: j */
    private long f22735j;

    /* renamed from: k */
    private long f22736k;

    public zztl() {
        this(-1.0d);
    }

    /* renamed from: a */
    public final void mo29762a() {
        if (this.f22727b) {
            this.f22726a.mo26724b();
        }
    }

    /* renamed from: b */
    public final void mo29763b() {
        this.f22733h = false;
        if (this.f22727b) {
            this.f22726a.mo26723a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zztl(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0018
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001a
        L_0x0018:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001a:
            r2.<init>((double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo29761a(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f22733h
            if (r2 == 0) goto L_0x0042
            long r2 = r11.f22730e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r11.f22736k
            r4 = 1
            long r2 = r2 + r4
            r11.f22736k = r2
            long r2 = r11.f22732g
            r11.f22731f = r2
        L_0x0019:
            long r2 = r11.f22736k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r11.f22735j
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.f22731f
            long r2 = r2 + r4
            boolean r4 = r11.m25336b(r2, r14)
            if (r4 == 0) goto L_0x0033
            r11.f22733h = r6
            goto L_0x0042
        L_0x0033:
            long r4 = r11.f22734i
            long r4 = r4 + r2
            long r6 = r11.f22735j
            long r4 = r4 - r6
            goto L_0x0044
        L_0x003a:
            boolean r2 = r11.m25336b(r0, r14)
            if (r2 == 0) goto L_0x0042
            r11.f22733h = r6
        L_0x0042:
            r4 = r14
            r2 = r0
        L_0x0044:
            boolean r6 = r11.f22733h
            r7 = 0
            if (r6 != 0) goto L_0x0053
            r11.f22735j = r0
            r11.f22734i = r14
            r11.f22736k = r7
            r14 = 1
            r11.f22733h = r14
        L_0x0053:
            r11.f22730e = r12
            r11.f22732g = r2
            com.google.android.gms.internal.ads.w30 r12 = r11.f22726a
            if (r12 == 0) goto L_0x0086
            long r12 = r12.f17061f
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0062
            goto L_0x0086
        L_0x0062:
            com.google.android.gms.internal.ads.w30 r12 = r11.f22726a
            long r12 = r12.f17061f
            long r14 = r11.f22728c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0075
            long r14 = r12 - r14
            goto L_0x0079
        L_0x0075:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x0079:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r12 = r14
        L_0x0082:
            long r14 = r11.f22729d
            long r12 = r12 - r14
            return r12
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.mo29761a(long, long):long");
    }

    /* renamed from: b */
    private final boolean m25336b(long j, long j2) {
        return Math.abs((j2 - this.f22734i) - (j - this.f22735j)) > 20000000;
    }

    private zztl(double d) {
        boolean z = d != -1.0d;
        this.f22727b = z;
        if (z) {
            this.f22726a = w30.m18356c();
            long j = (long) (1.0E9d / d);
            this.f22728c = j;
            this.f22729d = (j * 80) / 100;
            return;
        }
        this.f22726a = null;
        this.f22728c = -1;
        this.f22729d = -1;
    }
}
