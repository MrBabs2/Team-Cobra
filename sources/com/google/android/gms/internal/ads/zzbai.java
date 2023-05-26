package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzbai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbai> CREATOR = new zzbaj();
    @SafeParcelable.Field

    /* renamed from: f */
    public String f18742f;
    @SafeParcelable.Field

    /* renamed from: g */
    public int f18743g;
    @SafeParcelable.Field

    /* renamed from: h */
    public int f18744h;
    @SafeParcelable.Field

    /* renamed from: i */
    public boolean f18745i;
    @SafeParcelable.Field

    /* renamed from: j */
    private boolean f18746j;

    public zzbai(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    /* renamed from: d */
    public static zzbai m20531d() {
        return new zzbai(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 2, this.f18742f, false);
        SafeParcelWriter.m16135a(parcel, 3, this.f18743g);
        SafeParcelWriter.m16135a(parcel, 4, this.f18744h);
        SafeParcelWriter.m16146a(parcel, 5, this.f18745i);
        SafeParcelWriter.m16146a(parcel, 6, this.f18746j);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zzbai(int i, int i2, boolean z, boolean z2) {
        this(i, i2, true, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzbai(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0005
            java.lang.String r11 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r11 = "1"
        L_0x0007:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>((java.lang.String) r2, (int) r3, (int) r4, (boolean) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbai.<init>(int, int, boolean, boolean, boolean):void");
    }

    @SafeParcelable.Constructor
    zzbai(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.f18742f = str;
        this.f18743g = i;
        this.f18744h = i2;
        this.f18745i = z;
        this.f18746j = z2;
    }
}
