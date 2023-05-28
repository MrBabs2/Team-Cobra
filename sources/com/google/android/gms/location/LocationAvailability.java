package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzaa();
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: f */
    private int f23607f;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: g */
    private int f23608g;
    @SafeParcelable.Field

    /* renamed from: h */
    private long f23609h;
    @SafeParcelable.Field

    /* renamed from: i */
    private int f23610i;
    @SafeParcelable.Field

    /* renamed from: j */
    private zzaj[] f23611j;

    @SafeParcelable.Constructor
    LocationAvailability(@SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 5) zzaj[] zzajArr) {
        this.f23610i = i;
        this.f23607f = i2;
        this.f23608g = i3;
        this.f23609h = j;
        this.f23611j = zzajArr;
    }

    /* renamed from: d */
    public final boolean mo30552d() {
        return this.f23610i < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f23607f == locationAvailability.f23607f && this.f23608g == locationAvailability.f23608g && this.f23609h == locationAvailability.f23609h && this.f23610i == locationAvailability.f23610i && Arrays.equals(this.f23611j, locationAvailability.f23611j);
        }
    }

    public final int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f23610i), Integer.valueOf(this.f23607f), Integer.valueOf(this.f23608g), Long.valueOf(this.f23609h), this.f23611j);
    }

    public final String toString() {
        boolean d = mo30552d();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(d);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23607f);
        SafeParcelWriter.m16135a(parcel, 2, this.f23608g);
        SafeParcelWriter.m16136a(parcel, 3, this.f23609h);
        SafeParcelWriter.m16135a(parcel, 4, this.f23610i);
        SafeParcelWriter.m16148a(parcel, 5, (T[]) this.f23611j, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
