package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzyd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyd> CREATOR = new zzye();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f23016f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final int f23017g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final int f23018h;
    @SafeParcelable.Field

    /* renamed from: i */
    public final boolean f23019i;
    @SafeParcelable.Field

    /* renamed from: j */
    public final int f23020j;
    @SafeParcelable.Field

    /* renamed from: k */
    public final int f23021k;
    @SafeParcelable.Field

    /* renamed from: l */
    public final zzyd[] f23022l;
    @SafeParcelable.Field

    /* renamed from: m */
    public final boolean f23023m;
    @SafeParcelable.Field

    /* renamed from: n */
    public final boolean f23024n;
    @SafeParcelable.Field

    /* renamed from: o */
    public boolean f23025o;

    public zzyd() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzyd[]) null, false, false, false);
    }

    /* renamed from: a */
    public static int m25643a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static int m25645b(DisplayMetrics displayMetrics) {
        return (int) (((float) m25646c(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: c */
    private static int m25646c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: d */
    public static zzyd m25647d() {
        return new zzyd("reward_mb", 0, 0, true, 0, 0, (zzyd[]) null, false, false, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 2, this.f23016f, false);
        SafeParcelWriter.m16135a(parcel, 3, this.f23017g);
        SafeParcelWriter.m16135a(parcel, 4, this.f23018h);
        SafeParcelWriter.m16146a(parcel, 5, this.f23019i);
        SafeParcelWriter.m16135a(parcel, 6, this.f23020j);
        SafeParcelWriter.m16135a(parcel, 7, this.f23021k);
        SafeParcelWriter.m16148a(parcel, 8, (T[]) this.f23022l, i, false);
        SafeParcelWriter.m16146a(parcel, 9, this.f23023m);
        SafeParcelWriter.m16146a(parcel, 10, this.f23024n);
        SafeParcelWriter.m16146a(parcel, 11, this.f23025o);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zzyd(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* renamed from: a */
    public static zzyd m25644a(Context context) {
        return new zzyd("320x50_mb", 0, 0, false, 0, 0, (zzyd[]) null, true, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzyd(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.f23019i = r0
            boolean r2 = r1.isFluid()
            r12.f23024n = r2
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getWidth()
            r12.f23020j = r2
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getHeight()
            r12.f23017g = r2
            goto L_0x002d
        L_0x0021:
            int r2 = r1.getWidth()
            r12.f23020j = r2
            int r2 = r1.getHeight()
            r12.f23017g = r2
        L_0x002d:
            int r2 = r12.f23020j
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0035
            r2 = 1
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            int r3 = r12.f23017g
            r5 = -2
            if (r3 != r5) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.zzyt.m25666a()
            boolean r6 = com.google.android.gms.internal.ads.zzazt.m20483d(r13)
            if (r6 == 0) goto L_0x0067
            com.google.android.gms.internal.ads.zzyt.m25666a()
            boolean r6 = com.google.android.gms.internal.ads.zzazt.m20484e(r13)
            if (r6 == 0) goto L_0x0067
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.zzyt.m25666a()
            int r7 = com.google.android.gms.internal.ads.zzazt.m20485f(r13)
            int r6 = r6 - r7
            r12.f23021k = r6
            goto L_0x006b
        L_0x0067:
            int r6 = r5.widthPixels
            r12.f23021k = r6
        L_0x006b:
            int r6 = r12.f23021k
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r9)
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0094
            int r8 = r8 + 1
            goto L_0x0094
        L_0x0087:
            int r8 = r12.f23020j
            com.google.android.gms.internal.ads.zzyt.m25666a()
            int r6 = r12.f23020j
            int r6 = com.google.android.gms.internal.ads.zzazt.m20466a((android.util.DisplayMetrics) r5, (int) r6)
            r12.f23021k = r6
        L_0x0094:
            if (r3 == 0) goto L_0x009b
            int r6 = m25646c(r5)
            goto L_0x009d
        L_0x009b:
            int r6 = r12.f23017g
        L_0x009d:
            com.google.android.gms.internal.ads.zzyt.m25666a()
            int r5 = com.google.android.gms.internal.ads.zzazt.m20466a((android.util.DisplayMetrics) r5, (int) r6)
            r12.f23018h = r5
            if (r2 != 0) goto L_0x00bb
            if (r3 == 0) goto L_0x00ab
            goto L_0x00bb
        L_0x00ab:
            boolean r2 = r12.f23024n
            if (r2 == 0) goto L_0x00b4
            java.lang.String r1 = "320x50_mb"
            r12.f23016f = r1
            goto L_0x00d8
        L_0x00b4:
            java.lang.String r1 = r1.toString()
            r12.f23016f = r1
            goto L_0x00d8
        L_0x00bb:
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "x"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "_as"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r12.f23016f = r1
        L_0x00d8:
            int r1 = r14.length
            if (r1 <= r4) goto L_0x00f2
            int r1 = r14.length
            com.google.android.gms.internal.ads.zzyd[] r1 = new com.google.android.gms.internal.ads.zzyd[r1]
            r12.f23022l = r1
            r1 = 0
        L_0x00e1:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x00f5
            com.google.android.gms.internal.ads.zzyd[] r2 = r12.f23022l
            com.google.android.gms.internal.ads.zzyd r3 = new com.google.android.gms.internal.ads.zzyd
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.AdSize) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x00e1
        L_0x00f2:
            r13 = 0
            r12.f23022l = r13
        L_0x00f5:
            r12.f23023m = r0
            r12.f23025o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyd.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    @SafeParcelable.Constructor
    zzyd(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) zzyd[] zzydArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4) {
        this.f23016f = str;
        this.f23017g = i;
        this.f23018h = i2;
        this.f23019i = z;
        this.f23020j = i3;
        this.f23021k = i4;
        this.f23022l = zzydArr;
        this.f23023m = z2;
        this.f23024n = z3;
        this.f23025o = z4;
    }
}
