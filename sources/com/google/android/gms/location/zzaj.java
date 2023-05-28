package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f23643f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f23644g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final long f23645h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final long f23646i;

    @SafeParcelable.Constructor
    zzaj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) long j2) {
        this.f23643f = i;
        this.f23644g = i2;
        this.f23645h = j;
        this.f23646i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f23643f == zzaj.f23643f && this.f23644g == zzaj.f23644g && this.f23645h == zzaj.f23645h && this.f23646i == zzaj.f23646i;
        }
    }

    public final int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f23644g), Integer.valueOf(this.f23643f), Long.valueOf(this.f23646i), Long.valueOf(this.f23645h));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f23643f + " Cell status: " + this.f23644g + " elapsed time NS: " + this.f23646i + " system time ms: " + this.f23645h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23643f);
        SafeParcelWriter.m16135a(parcel, 2, this.f23644g);
        SafeParcelWriter.m16136a(parcel, 3, this.f23645h);
        SafeParcelWriter.m16136a(parcel, 4, this.f23646i);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
