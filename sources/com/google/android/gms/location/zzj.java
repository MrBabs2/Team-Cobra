package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: f */
    private boolean f23650f;
    @SafeParcelable.Field

    /* renamed from: g */
    private long f23651g;
    @SafeParcelable.Field

    /* renamed from: h */
    private float f23652h;
    @SafeParcelable.Field

    /* renamed from: i */
    private long f23653i;
    @SafeParcelable.Field

    /* renamed from: j */
    private int f23654j;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) float f, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) int i) {
        this.f23650f = z;
        this.f23651g = j;
        this.f23652h = f;
        this.f23653i = j2;
        this.f23654j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f23650f == zzj.f23650f && this.f23651g == zzj.f23651g && Float.compare(this.f23652h, zzj.f23652h) == 0 && this.f23653i == zzj.f23653i && this.f23654j == zzj.f23654j;
    }

    public final int hashCode() {
        return Objects.m16029a(Boolean.valueOf(this.f23650f), Long.valueOf(this.f23651g), Float.valueOf(this.f23652h), Long.valueOf(this.f23653i), Integer.valueOf(this.f23654j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f23650f);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f23651g);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f23652h);
        long j = this.f23653i;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f23654j != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f23654j);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16146a(parcel, 1, this.f23650f);
        SafeParcelWriter.m16136a(parcel, 2, this.f23651g);
        SafeParcelWriter.m16134a(parcel, 3, this.f23652h);
        SafeParcelWriter.m16136a(parcel, 4, this.f23653i);
        SafeParcelWriter.m16135a(parcel, 5, this.f23654j);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
