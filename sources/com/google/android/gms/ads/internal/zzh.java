package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzard;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    @SafeParcelable.Field
    public final boolean zzbre;
    @SafeParcelable.Field
    public final boolean zzbrf;
    @SafeParcelable.Field
    private final String zzbrg;
    @SafeParcelable.Field
    public final boolean zzbrh;
    @SafeParcelable.Field
    public final float zzbri;
    @SafeParcelable.Field
    public final int zzbrj;
    @SafeParcelable.Field
    public final boolean zzbrk;
    @SafeParcelable.Field
    public final boolean zzbrl;
    @SafeParcelable.Field
    public final boolean zzbrm;

    public zzh(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(false, z2, (String) null, false, 0.0f, -1, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16146a(parcel, 2, this.zzbre);
        SafeParcelWriter.m16146a(parcel, 3, this.zzbrf);
        SafeParcelWriter.m16143a(parcel, 4, this.zzbrg, false);
        SafeParcelWriter.m16146a(parcel, 5, this.zzbrh);
        SafeParcelWriter.m16134a(parcel, 6, this.zzbri);
        SafeParcelWriter.m16135a(parcel, 7, this.zzbrj);
        SafeParcelWriter.m16146a(parcel, 8, this.zzbrk);
        SafeParcelWriter.m16146a(parcel, 9, this.zzbrl);
        SafeParcelWriter.m16146a(parcel, 10, this.zzbrm);
        SafeParcelWriter.m16132a(parcel, a);
    }

    @SafeParcelable.Constructor
    zzh(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) boolean z5, @SafeParcelable.Param(id = 10) boolean z6) {
        this.zzbre = z;
        this.zzbrf = z2;
        this.zzbrg = str;
        this.zzbrh = z3;
        this.zzbri = f;
        this.zzbrj = i;
        this.zzbrk = z4;
        this.zzbrl = z5;
        this.zzbrm = z6;
    }
}
