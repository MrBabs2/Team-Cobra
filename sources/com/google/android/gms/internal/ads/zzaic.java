package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzaic extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaic> CREATOR = new zzaid();
    @SafeParcelable.Field

    /* renamed from: f */
    public final boolean f18128f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f18129g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final int f18130h;
    @SafeParcelable.Field

    /* renamed from: i */
    public final byte[] f18131i;
    @SafeParcelable.Field

    /* renamed from: j */
    public final String[] f18132j;
    @SafeParcelable.Field

    /* renamed from: k */
    public final String[] f18133k;
    @SafeParcelable.Field

    /* renamed from: l */
    public final boolean f18134l;
    @SafeParcelable.Field

    /* renamed from: m */
    public final long f18135m;

    @SafeParcelable.Constructor
    zzaic(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) String[] strArr, @SafeParcelable.Param(id = 6) String[] strArr2, @SafeParcelable.Param(id = 7) boolean z2, @SafeParcelable.Param(id = 8) long j) {
        this.f18128f = z;
        this.f18129g = str;
        this.f18130h = i;
        this.f18131i = bArr;
        this.f18132j = strArr;
        this.f18133k = strArr2;
        this.f18134l = z2;
        this.f18135m = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16146a(parcel, 1, this.f18128f);
        SafeParcelWriter.m16143a(parcel, 2, this.f18129g, false);
        SafeParcelWriter.m16135a(parcel, 3, this.f18130h);
        SafeParcelWriter.m16147a(parcel, 4, this.f18131i, false);
        SafeParcelWriter.m16149a(parcel, 5, this.f18132j, false);
        SafeParcelWriter.m16149a(parcel, 6, this.f18133k, false);
        SafeParcelWriter.m16146a(parcel, 7, this.f18134l);
        SafeParcelWriter.m16136a(parcel, 8, this.f18135m);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
