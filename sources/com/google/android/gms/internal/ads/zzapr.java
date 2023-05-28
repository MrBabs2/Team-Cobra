package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import p015cm.aptoide.p016pt.BuildConfig;

@zzard
public final class zzapr extends zzaqb {

    /* renamed from: c */
    private String f18258c = "top-right";

    /* renamed from: d */
    private boolean f18259d = true;

    /* renamed from: e */
    private int f18260e = 0;

    /* renamed from: f */
    private int f18261f = 0;

    /* renamed from: g */
    private int f18262g = -1;

    /* renamed from: h */
    private int f18263h = 0;

    /* renamed from: i */
    private int f18264i = 0;

    /* renamed from: j */
    private int f18265j = -1;

    /* renamed from: k */
    private final Object f18266k = new Object();

    /* renamed from: l */
    private final zzbgz f18267l;

    /* renamed from: m */
    private final Activity f18268m;

    /* renamed from: n */
    private zzbin f18269n;

    /* renamed from: o */
    private ImageView f18270o;

    /* renamed from: p */
    private LinearLayout f18271p;

    /* renamed from: q */
    private zzaqc f18272q;

    /* renamed from: r */
    private PopupWindow f18273r;

    /* renamed from: s */
    private RelativeLayout f18274s;

    /* renamed from: t */
    private ViewGroup f18275t;

    static {
        CollectionUtils.m16261a("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzapr(zzbgz zzbgz, zzaqc zzaqc) {
        super(zzbgz, "resize");
        this.f18267l = zzbgz;
        this.f18268m = zzbgz.mo25650a();
        this.f18272q = zzaqc;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a8, code lost:
        if (r5 == 5) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01aa, code lost:
        r5 = ((r1.f18260e + r1.f18263h) + r1.f18265j) - 50;
        r8 = r1.f18261f;
        r15 = r1.f18264i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b8, code lost:
        r5 = ((r1.f18260e + r1.f18263h) + r1.f18265j) - 50;
        r8 = r1.f18261f + r1.f18264i;
        r15 = r1.f18262g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c9, code lost:
        r5 = ((r1.f18260e + r1.f18263h) + (r1.f18265j / 2)) - 25;
        r8 = r1.f18261f + r1.f18264i;
        r15 = r1.f18262g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01dc, code lost:
        r5 = r1.f18260e + r1.f18263h;
        r8 = r1.f18261f + r1.f18264i;
        r15 = r1.f18262g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e8, code lost:
        r8 = (r8 + r15) - 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01eb, code lost:
        r5 = ((r1.f18260e + r1.f18263h) + (r1.f18265j / 2)) - 25;
        r8 = ((r1.f18261f + r1.f18264i) + (r1.f18262g / 2)) - 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0202, code lost:
        r5 = ((r1.f18260e + r1.f18263h) + (r1.f18265j / 2)) - 25;
        r8 = r1.f18261f;
        r15 = r1.f18264i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0212, code lost:
        r5 = r1.f18260e + r1.f18263h;
        r8 = r1.f18261f;
        r15 = r1.f18264i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021b, code lost:
        r8 = r8 + r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x021c, code lost:
        if (r5 < 0) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x021f, code lost:
        if ((r5 + 50) > r7) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0223, code lost:
        if (r8 < r6[0]) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0228, code lost:
        if ((r8 + 50) <= r6[1]) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019d, code lost:
        r5 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019e, code lost:
        if (r5 == 0) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a0, code lost:
        if (r5 == 1) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a2, code lost:
        if (r5 == 2) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (r5 == 3) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a6, code lost:
        if (r5 == 4) goto L_0x01c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x023b A[Catch:{ RuntimeException -> 0x0465 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x023d A[Catch:{ RuntimeException -> 0x0465 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x029b A[Catch:{ RuntimeException -> 0x0465 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02a2 A[Catch:{ RuntimeException -> 0x0465 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27542a(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.Object r2 = r1.f18266k
            monitor-enter(r2)
            android.app.Activity r3 = r1.f18268m     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x0012
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r1.mo27556a(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.zzbgz r3 = r1.f18267l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbin r3 = r3.mo25695i()     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r1.mo27556a(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0021:
            com.google.android.gms.internal.ads.zzbgz r3 = r1.f18267l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbin r3 = r3.mo25695i()     // Catch:{ all -> 0x04bb }
            boolean r3 = r3.mo28181b()     // Catch:{ all -> 0x04bb }
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r1.mo27556a(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0034:
            com.google.android.gms.internal.ads.zzbgz r3 = r1.f18267l     // Catch:{ all -> 0x04bb }
            boolean r3 = r3.mo25691g()     // Catch:{ all -> 0x04bb }
            if (r3 == 0) goto L_0x0043
            java.lang.String r0 = "Cannot resize an expanded banner."
            r1.mo27556a(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0043:
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x0062
            com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            int r3 = com.google.android.gms.internal.ads.zzaxi.m20287c((java.lang.String) r3)     // Catch:{ all -> 0x04bb }
            r1.f18265j = r3     // Catch:{ all -> 0x04bb }
        L_0x0062:
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x0081
            com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            int r3 = com.google.android.gms.internal.ads.zzaxi.m20287c((java.lang.String) r3)     // Catch:{ all -> 0x04bb }
            r1.f18262g = r3     // Catch:{ all -> 0x04bb }
        L_0x0081:
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x00a0
            com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            int r3 = com.google.android.gms.internal.ads.zzaxi.m20287c((java.lang.String) r3)     // Catch:{ all -> 0x04bb }
            r1.f18263h = r3     // Catch:{ all -> 0x04bb }
        L_0x00a0:
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x00bf
            com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            int r3 = com.google.android.gms.internal.ads.zzaxi.m20287c((java.lang.String) r3)     // Catch:{ all -> 0x04bb }
            r1.f18264i = r3     // Catch:{ all -> 0x04bb }
        L_0x00bf:
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x00db
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ all -> 0x04bb }
            r1.f18259d = r3     // Catch:{ all -> 0x04bb }
        L_0x00db:
            java.lang.String r3 = "customClosePosition"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x00eb
            r1.f18258c = r0     // Catch:{ all -> 0x04bb }
        L_0x00eb:
            int r0 = r1.f18265j     // Catch:{ all -> 0x04bb }
            r3 = 1
            r4 = 0
            if (r0 < 0) goto L_0x00f7
            int r0 = r1.f18262g     // Catch:{ all -> 0x04bb }
            if (r0 < 0) goto L_0x00f7
            r0 = 1
            goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r1.mo27556a(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0101:
            android.app.Activity r0 = r1.f18268m     // Catch:{ all -> 0x04bb }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x04b4
            android.view.View r5 = r0.getDecorView()     // Catch:{ all -> 0x04bb }
            if (r5 != 0) goto L_0x0111
            goto L_0x04b4
        L_0x0111:
            com.google.android.gms.internal.ads.zzaxi r5 = com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            android.app.Activity r6 = r1.f18268m     // Catch:{ all -> 0x04bb }
            int[] r5 = r5.mo27805a((android.app.Activity) r6)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzaxi r6 = com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            android.app.Activity r7 = r1.f18268m     // Catch:{ all -> 0x04bb }
            int[] r6 = r6.mo27808b((android.app.Activity) r7)     // Catch:{ all -> 0x04bb }
            r7 = r5[r4]     // Catch:{ all -> 0x04bb }
            r5 = r5[r3]     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18265j     // Catch:{ all -> 0x04bb }
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = -1
            r13 = 2
            r14 = 50
            if (r8 < r14) goto L_0x0233
            int r8 = r1.f18265j     // Catch:{ all -> 0x04bb }
            if (r8 <= r7) goto L_0x013a
            goto L_0x0233
        L_0x013a:
            int r8 = r1.f18262g     // Catch:{ all -> 0x04bb }
            if (r8 < r14) goto L_0x022d
            int r8 = r1.f18262g     // Catch:{ all -> 0x04bb }
            if (r8 <= r5) goto L_0x0144
            goto L_0x022d
        L_0x0144:
            int r8 = r1.f18262g     // Catch:{ all -> 0x04bb }
            if (r8 != r5) goto L_0x0153
            int r5 = r1.f18265j     // Catch:{ all -> 0x04bb }
            if (r5 != r7) goto L_0x0153
            java.lang.String r5 = "Cannot resize to a full-screen ad."
            com.google.android.gms.internal.ads.zzbad.m20523d(r5)     // Catch:{ all -> 0x04bb }
            goto L_0x0238
        L_0x0153:
            boolean r5 = r1.f18259d     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x022b
            java.lang.String r5 = r1.f18258c     // Catch:{ all -> 0x04bb }
            int r8 = r5.hashCode()     // Catch:{ all -> 0x04bb }
            switch(r8) {
                case -1364013995: goto L_0x0193;
                case -1012429441: goto L_0x0189;
                case -655373719: goto L_0x017f;
                case 1163912186: goto L_0x0175;
                case 1288627767: goto L_0x016b;
                case 1755462605: goto L_0x0161;
                default: goto L_0x0160;
            }     // Catch:{ all -> 0x04bb }
        L_0x0160:
            goto L_0x019d
        L_0x0161:
            java.lang.String r8 = "top-center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 1
            goto L_0x019e
        L_0x016b:
            java.lang.String r8 = "bottom-center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 4
            goto L_0x019e
        L_0x0175:
            java.lang.String r8 = "bottom-right"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 5
            goto L_0x019e
        L_0x017f:
            java.lang.String r8 = "bottom-left"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 3
            goto L_0x019e
        L_0x0189:
            java.lang.String r8 = "top-left"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 0
            goto L_0x019e
        L_0x0193:
            java.lang.String r8 = "center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 2
            goto L_0x019e
        L_0x019d:
            r5 = -1
        L_0x019e:
            if (r5 == 0) goto L_0x0212
            if (r5 == r3) goto L_0x0202
            if (r5 == r13) goto L_0x01eb
            if (r5 == r11) goto L_0x01dc
            if (r5 == r10) goto L_0x01c9
            if (r5 == r9) goto L_0x01b8
            int r5 = r1.f18260e     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18263h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r5 = r5 - r14
            int r8 = r1.f18261f     // Catch:{ all -> 0x04bb }
            int r15 = r1.f18264i     // Catch:{ all -> 0x04bb }
            goto L_0x021b
        L_0x01b8:
            int r5 = r1.f18260e     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18263h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r5 = r5 - r14
            int r8 = r1.f18261f     // Catch:{ all -> 0x04bb }
            int r15 = r1.f18264i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            int r15 = r1.f18262g     // Catch:{ all -> 0x04bb }
            goto L_0x01e8
        L_0x01c9:
            int r5 = r1.f18260e     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18263h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.f18261f     // Catch:{ all -> 0x04bb }
            int r15 = r1.f18264i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            int r15 = r1.f18262g     // Catch:{ all -> 0x04bb }
            goto L_0x01e8
        L_0x01dc:
            int r5 = r1.f18260e     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18263h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.f18261f     // Catch:{ all -> 0x04bb }
            int r15 = r1.f18264i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            int r15 = r1.f18262g     // Catch:{ all -> 0x04bb }
        L_0x01e8:
            int r8 = r8 + r15
            int r8 = r8 - r14
            goto L_0x021c
        L_0x01eb:
            int r5 = r1.f18260e     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18263h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.f18261f     // Catch:{ all -> 0x04bb }
            int r15 = r1.f18264i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            int r15 = r1.f18262g     // Catch:{ all -> 0x04bb }
            int r15 = r15 / r13
            int r8 = r8 + r15
            int r8 = r8 + -25
            goto L_0x021c
        L_0x0202:
            int r5 = r1.f18260e     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18263h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.f18261f     // Catch:{ all -> 0x04bb }
            int r15 = r1.f18264i     // Catch:{ all -> 0x04bb }
            goto L_0x021b
        L_0x0212:
            int r5 = r1.f18260e     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18263h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.f18261f     // Catch:{ all -> 0x04bb }
            int r15 = r1.f18264i     // Catch:{ all -> 0x04bb }
        L_0x021b:
            int r8 = r8 + r15
        L_0x021c:
            if (r5 < 0) goto L_0x0238
            int r5 = r5 + r14
            if (r5 > r7) goto L_0x0238
            r5 = r6[r4]     // Catch:{ all -> 0x04bb }
            if (r8 < r5) goto L_0x0238
            int r8 = r8 + r14
            r5 = r6[r3]     // Catch:{ all -> 0x04bb }
            if (r8 <= r5) goto L_0x022b
            goto L_0x0238
        L_0x022b:
            r5 = 1
            goto L_0x0239
        L_0x022d:
            java.lang.String r5 = "Height is too small or too large."
            com.google.android.gms.internal.ads.zzbad.m20523d(r5)     // Catch:{ all -> 0x04bb }
            goto L_0x0238
        L_0x0233:
            java.lang.String r5 = "Width is too small or too large."
            com.google.android.gms.internal.ads.zzbad.m20523d(r5)     // Catch:{ all -> 0x04bb }
        L_0x0238:
            r5 = 0
        L_0x0239:
            if (r5 != 0) goto L_0x023d
            r5 = 0
            goto L_0x0299
        L_0x023d:
            boolean r5 = r1.f18259d     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x0252
            int[] r5 = new int[r13]     // Catch:{ all -> 0x04bb }
            int r6 = r1.f18260e     // Catch:{ all -> 0x04bb }
            int r7 = r1.f18263h     // Catch:{ all -> 0x04bb }
            int r6 = r6 + r7
            r5[r4] = r6     // Catch:{ all -> 0x04bb }
            int r6 = r1.f18261f     // Catch:{ all -> 0x04bb }
            int r7 = r1.f18264i     // Catch:{ all -> 0x04bb }
            int r6 = r6 + r7
            r5[r3] = r6     // Catch:{ all -> 0x04bb }
            goto L_0x0299
        L_0x0252:
            com.google.android.gms.internal.ads.zzaxi r5 = com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            android.app.Activity r6 = r1.f18268m     // Catch:{ all -> 0x04bb }
            int[] r5 = r5.mo27805a((android.app.Activity) r6)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzaxi r6 = com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            android.app.Activity r7 = r1.f18268m     // Catch:{ all -> 0x04bb }
            int[] r6 = r6.mo27808b((android.app.Activity) r7)     // Catch:{ all -> 0x04bb }
            r5 = r5[r4]     // Catch:{ all -> 0x04bb }
            int r7 = r1.f18260e     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18263h     // Catch:{ all -> 0x04bb }
            int r7 = r7 + r8
            int r8 = r1.f18261f     // Catch:{ all -> 0x04bb }
            int r15 = r1.f18264i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            if (r7 >= 0) goto L_0x0276
            r7 = 0
            goto L_0x027f
        L_0x0276:
            int r15 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r15 = r15 + r7
            if (r15 <= r5) goto L_0x027f
            int r7 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r7 = r5 - r7
        L_0x027f:
            r5 = r6[r4]     // Catch:{ all -> 0x04bb }
            if (r8 >= r5) goto L_0x0286
            r8 = r6[r4]     // Catch:{ all -> 0x04bb }
            goto L_0x0293
        L_0x0286:
            int r5 = r1.f18262g     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            r15 = r6[r3]     // Catch:{ all -> 0x04bb }
            if (r5 <= r15) goto L_0x0293
            r5 = r6[r3]     // Catch:{ all -> 0x04bb }
            int r6 = r1.f18262g     // Catch:{ all -> 0x04bb }
            int r8 = r5 - r6
        L_0x0293:
            int[] r5 = new int[r13]     // Catch:{ all -> 0x04bb }
            r5[r4] = r7     // Catch:{ all -> 0x04bb }
            r5[r3] = r8     // Catch:{ all -> 0x04bb }
        L_0x0299:
            if (r5 != 0) goto L_0x02a2
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r1.mo27556a(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x02a2:
            com.google.android.gms.internal.ads.zzyt.m25666a()     // Catch:{ all -> 0x04bb }
            android.app.Activity r6 = r1.f18268m     // Catch:{ all -> 0x04bb }
            int r7 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r6 = com.google.android.gms.internal.ads.zzazt.m20475b((android.content.Context) r6, (int) r7)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzyt.m25666a()     // Catch:{ all -> 0x04bb }
            android.app.Activity r7 = r1.f18268m     // Catch:{ all -> 0x04bb }
            int r8 = r1.f18262g     // Catch:{ all -> 0x04bb }
            int r7 = com.google.android.gms.internal.ads.zzazt.m20475b((android.content.Context) r7, (int) r8)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbgz r8 = r1.f18267l     // Catch:{ all -> 0x04bb }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04bb }
            android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x04bb }
            if (r8 == 0) goto L_0x04ad
            boolean r15 = r8 instanceof android.view.ViewGroup     // Catch:{ all -> 0x04bb }
            if (r15 == 0) goto L_0x04ad
            r15 = r8
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbgz r9 = r1.f18267l     // Catch:{ all -> 0x04bb }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x04bb }
            r15.removeView(r9)     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r9 = r1.f18273r     // Catch:{ all -> 0x04bb }
            if (r9 != 0) goto L_0x0305
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x04bb }
            r1.f18275t = r8     // Catch:{ all -> 0x04bb }
            com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbgz r8 = r1.f18267l     // Catch:{ all -> 0x04bb }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04bb }
            android.graphics.Bitmap r8 = com.google.android.gms.internal.ads.zzaxi.m20263a((android.view.View) r8)     // Catch:{ all -> 0x04bb }
            android.widget.ImageView r9 = new android.widget.ImageView     // Catch:{ all -> 0x04bb }
            android.app.Activity r15 = r1.f18268m     // Catch:{ all -> 0x04bb }
            r9.<init>(r15)     // Catch:{ all -> 0x04bb }
            r1.f18270o = r9     // Catch:{ all -> 0x04bb }
            r9.setImageBitmap(r8)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbgz r8 = r1.f18267l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbin r8 = r8.mo25695i()     // Catch:{ all -> 0x04bb }
            r1.f18269n = r8     // Catch:{ all -> 0x04bb }
            android.view.ViewGroup r8 = r1.f18275t     // Catch:{ all -> 0x04bb }
            android.widget.ImageView r9 = r1.f18270o     // Catch:{ all -> 0x04bb }
            r8.addView(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x030a
        L_0x0305:
            android.widget.PopupWindow r8 = r1.f18273r     // Catch:{ all -> 0x04bb }
            r8.dismiss()     // Catch:{ all -> 0x04bb }
        L_0x030a:
            android.widget.RelativeLayout r8 = new android.widget.RelativeLayout     // Catch:{ all -> 0x04bb }
            android.app.Activity r9 = r1.f18268m     // Catch:{ all -> 0x04bb }
            r8.<init>(r9)     // Catch:{ all -> 0x04bb }
            r1.f18274s = r8     // Catch:{ all -> 0x04bb }
            r8.setBackgroundColor(r4)     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r8 = r1.f18274s     // Catch:{ all -> 0x04bb }
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x04bb }
            r9.<init>(r6, r7)     // Catch:{ all -> 0x04bb }
            r8.setLayoutParams(r9)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r8 = r1.f18274s     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r8 = com.google.android.gms.internal.ads.zzaxi.m20266a((android.view.View) r8, (int) r6, (int) r7, (boolean) r4)     // Catch:{ all -> 0x04bb }
            r1.f18273r = r8     // Catch:{ all -> 0x04bb }
            r8.setOutsideTouchable(r3)     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r8 = r1.f18273r     // Catch:{ all -> 0x04bb }
            r8.setTouchable(r3)     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r8 = r1.f18273r     // Catch:{ all -> 0x04bb }
            boolean r9 = r1.f18259d     // Catch:{ all -> 0x04bb }
            if (r9 != 0) goto L_0x033b
            r9 = 1
            goto L_0x033c
        L_0x033b:
            r9 = 0
        L_0x033c:
            r8.setClippingEnabled(r9)     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r8 = r1.f18274s     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbgz r9 = r1.f18267l     // Catch:{ all -> 0x04bb }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x04bb }
            r8.addView(r9, r12, r12)     // Catch:{ all -> 0x04bb }
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch:{ all -> 0x04bb }
            android.app.Activity r9 = r1.f18268m     // Catch:{ all -> 0x04bb }
            r8.<init>(r9)     // Catch:{ all -> 0x04bb }
            r1.f18271p = r8     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzyt.m25666a()     // Catch:{ all -> 0x04bb }
            android.app.Activity r9 = r1.f18268m     // Catch:{ all -> 0x04bb }
            int r9 = com.google.android.gms.internal.ads.zzazt.m20475b((android.content.Context) r9, (int) r14)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzyt.m25666a()     // Catch:{ all -> 0x04bb }
            android.app.Activity r15 = r1.f18268m     // Catch:{ all -> 0x04bb }
            int r14 = com.google.android.gms.internal.ads.zzazt.m20475b((android.content.Context) r15, (int) r14)     // Catch:{ all -> 0x04bb }
            r8.<init>(r9, r14)     // Catch:{ all -> 0x04bb }
            java.lang.String r9 = r1.f18258c     // Catch:{ all -> 0x04bb }
            int r14 = r9.hashCode()     // Catch:{ all -> 0x04bb }
            switch(r14) {
                case -1364013995: goto L_0x03a6;
                case -1012429441: goto L_0x039c;
                case -655373719: goto L_0x0392;
                case 1163912186: goto L_0x0388;
                case 1288627767: goto L_0x037e;
                case 1755462605: goto L_0x0374;
                default: goto L_0x0373;
            }     // Catch:{ all -> 0x04bb }
        L_0x0373:
            goto L_0x03af
        L_0x0374:
            java.lang.String r14 = "top-center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 1
            goto L_0x03af
        L_0x037e:
            java.lang.String r14 = "bottom-center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 4
            goto L_0x03af
        L_0x0388:
            java.lang.String r14 = "bottom-right"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 5
            goto L_0x03af
        L_0x0392:
            java.lang.String r14 = "bottom-left"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 3
            goto L_0x03af
        L_0x039c:
            java.lang.String r14 = "top-left"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 0
            goto L_0x03af
        L_0x03a6:
            java.lang.String r14 = "center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 2
        L_0x03af:
            r9 = 9
            r14 = 10
            if (r12 == 0) goto L_0x03ef
            r15 = 14
            if (r12 == r3) goto L_0x03e8
            if (r12 == r13) goto L_0x03e2
            r13 = 12
            if (r12 == r11) goto L_0x03db
            if (r12 == r10) goto L_0x03d4
            r9 = 11
            r10 = 5
            if (r12 == r10) goto L_0x03cd
            r8.addRule(r14)     // Catch:{ all -> 0x04bb }
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03cd:
            r8.addRule(r13)     // Catch:{ all -> 0x04bb }
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03d4:
            r8.addRule(r13)     // Catch:{ all -> 0x04bb }
            r8.addRule(r15)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03db:
            r8.addRule(r13)     // Catch:{ all -> 0x04bb }
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03e2:
            r9 = 13
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03e8:
            r8.addRule(r14)     // Catch:{ all -> 0x04bb }
            r8.addRule(r15)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03ef:
            r8.addRule(r14)     // Catch:{ all -> 0x04bb }
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
        L_0x03f5:
            android.widget.LinearLayout r9 = r1.f18271p     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.j3 r10 = new com.google.android.gms.internal.ads.j3     // Catch:{ all -> 0x04bb }
            r10.<init>(r1)     // Catch:{ all -> 0x04bb }
            r9.setOnClickListener(r10)     // Catch:{ all -> 0x04bb }
            android.widget.LinearLayout r9 = r1.f18271p     // Catch:{ all -> 0x04bb }
            java.lang.String r10 = "Close button"
            r9.setContentDescription(r10)     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r9 = r1.f18274s     // Catch:{ all -> 0x04bb }
            android.widget.LinearLayout r10 = r1.f18271p     // Catch:{ all -> 0x04bb }
            r9.addView(r10, r8)     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r8 = r1.f18273r     // Catch:{ RuntimeException -> 0x0465 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x0465 }
            com.google.android.gms.internal.ads.zzyt.m25666a()     // Catch:{ RuntimeException -> 0x0465 }
            android.app.Activity r9 = r1.f18268m     // Catch:{ RuntimeException -> 0x0465 }
            r10 = r5[r4]     // Catch:{ RuntimeException -> 0x0465 }
            int r9 = com.google.android.gms.internal.ads.zzazt.m20475b((android.content.Context) r9, (int) r10)     // Catch:{ RuntimeException -> 0x0465 }
            com.google.android.gms.internal.ads.zzyt.m25666a()     // Catch:{ RuntimeException -> 0x0465 }
            android.app.Activity r10 = r1.f18268m     // Catch:{ RuntimeException -> 0x0465 }
            r11 = r5[r3]     // Catch:{ RuntimeException -> 0x0465 }
            int r10 = com.google.android.gms.internal.ads.zzazt.m20475b((android.content.Context) r10, (int) r11)     // Catch:{ RuntimeException -> 0x0465 }
            r8.showAtLocation(r0, r4, r9, r10)     // Catch:{ RuntimeException -> 0x0465 }
            r0 = r5[r4]     // Catch:{ all -> 0x04bb }
            r8 = r5[r3]     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzaqc r9 = r1.f18272q     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x043d
            com.google.android.gms.internal.ads.zzaqc r9 = r1.f18272q     // Catch:{ all -> 0x04bb }
            int r10 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r11 = r1.f18262g     // Catch:{ all -> 0x04bb }
            r9.mo25831a(r0, r8, r10, r11)     // Catch:{ all -> 0x04bb }
        L_0x043d:
            com.google.android.gms.internal.ads.zzbgz r0 = r1.f18267l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbin r6 = com.google.android.gms.internal.ads.zzbin.m21122a(r6, r7)     // Catch:{ all -> 0x04bb }
            r0.mo25658a((com.google.android.gms.internal.ads.zzbin) r6)     // Catch:{ all -> 0x04bb }
            r0 = r5[r4]     // Catch:{ all -> 0x04bb }
            r3 = r5[r3]     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzaxi r5 = com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x04bb }
            android.app.Activity r6 = r1.f18268m     // Catch:{ all -> 0x04bb }
            int[] r5 = r5.mo27808b((android.app.Activity) r6)     // Catch:{ all -> 0x04bb }
            r4 = r5[r4]     // Catch:{ all -> 0x04bb }
            int r3 = r3 - r4
            int r4 = r1.f18265j     // Catch:{ all -> 0x04bb }
            int r5 = r1.f18262g     // Catch:{ all -> 0x04bb }
            r1.mo27554a(r0, r3, r4, r5)     // Catch:{ all -> 0x04bb }
            java.lang.String r0 = "resized"
            r1.mo27559c(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0465:
            r0 = move-exception
            java.lang.String r3 = "Cannot show popup window: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04bb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04bb }
            int r4 = r0.length()     // Catch:{ all -> 0x04bb }
            if (r4 == 0) goto L_0x047b
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x04bb }
            goto L_0x0480
        L_0x047b:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x04bb }
            r0.<init>(r3)     // Catch:{ all -> 0x04bb }
        L_0x0480:
            r1.mo27556a(r0)     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r0 = r1.f18274s     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbgz r3 = r1.f18267l     // Catch:{ all -> 0x04bb }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x04bb }
            r0.removeView(r3)     // Catch:{ all -> 0x04bb }
            android.view.ViewGroup r0 = r1.f18275t     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x04ab
            android.view.ViewGroup r0 = r1.f18275t     // Catch:{ all -> 0x04bb }
            android.widget.ImageView r3 = r1.f18270o     // Catch:{ all -> 0x04bb }
            r0.removeView(r3)     // Catch:{ all -> 0x04bb }
            android.view.ViewGroup r0 = r1.f18275t     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbgz r3 = r1.f18267l     // Catch:{ all -> 0x04bb }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x04bb }
            r0.addView(r3)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbgz r0 = r1.f18267l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbin r3 = r1.f18269n     // Catch:{ all -> 0x04bb }
            r0.mo25658a((com.google.android.gms.internal.ads.zzbin) r3)     // Catch:{ all -> 0x04bb }
        L_0x04ab:
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x04ad:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r1.mo27556a(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x04b4:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r1.mo27556a(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x04bb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapr.mo27542a(java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo27543a(boolean z) {
        synchronized (this.f18266k) {
            if (this.f18273r != null) {
                this.f18273r.dismiss();
                this.f18274s.removeView(this.f18267l.getView());
                if (this.f18275t != null) {
                    this.f18275t.removeView(this.f18270o);
                    this.f18275t.addView(this.f18267l.getView());
                    this.f18267l.mo25658a(this.f18269n);
                }
                if (z) {
                    mo27559c(BuildConfig.APTOIDE_THEME);
                    if (this.f18272q != null) {
                        this.f18272q.mo25832b();
                    }
                }
                this.f18273r = null;
                this.f18274s = null;
                this.f18275t = null;
                this.f18271p = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo27541a(int i, int i2, boolean z) {
        synchronized (this.f18266k) {
            this.f18260e = i;
            this.f18261f = i2;
        }
    }

    /* renamed from: a */
    public final boolean mo27544a() {
        boolean z;
        synchronized (this.f18266k) {
            z = this.f18273r != null;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo27540a(int i, int i2) {
        this.f18260e = i;
        this.f18261f = i2;
    }
}
