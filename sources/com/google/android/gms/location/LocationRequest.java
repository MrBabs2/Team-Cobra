package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzab();
    @SafeParcelable.Field

    /* renamed from: f */
    private int f23612f;
    @SafeParcelable.Field

    /* renamed from: g */
    private long f23613g;
    @SafeParcelable.Field

    /* renamed from: h */
    private long f23614h;
    @SafeParcelable.Field

    /* renamed from: i */
    private boolean f23615i;
    @SafeParcelable.Field

    /* renamed from: j */
    private long f23616j;
    @SafeParcelable.Field

    /* renamed from: k */
    private int f23617k;
    @SafeParcelable.Field

    /* renamed from: l */
    private float f23618l;
    @SafeParcelable.Field

    /* renamed from: m */
    private long f23619m;

    public LocationRequest() {
        this.f23612f = 102;
        this.f23613g = 3600000;
        this.f23614h = 600000;
        this.f23615i = false;
        this.f23616j = Long.MAX_VALUE;
        this.f23617k = Integer.MAX_VALUE;
        this.f23618l = 0.0f;
        this.f23619m = 0;
    }

    @SafeParcelable.Constructor
    LocationRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) long j3, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) float f, @SafeParcelable.Param(id = 8) long j4) {
        this.f23612f = i;
        this.f23613g = j;
        this.f23614h = j2;
        this.f23615i = z;
        this.f23616j = j3;
        this.f23617k = i2;
        this.f23618l = f;
        this.f23619m = j4;
    }

    /* renamed from: d */
    public final long mo30557d() {
        long j = this.f23619m;
        long j2 = this.f23613g;
        return j < j2 ? j2 : j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f23612f == locationRequest.f23612f && this.f23613g == locationRequest.f23613g && this.f23614h == locationRequest.f23614h && this.f23615i == locationRequest.f23615i && this.f23616j == locationRequest.f23616j && this.f23617k == locationRequest.f23617k && this.f23618l == locationRequest.f23618l && mo30557d() == locationRequest.mo30557d();
    }

    public final int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f23612f), Long.valueOf(this.f23613g), Float.valueOf(this.f23618l), Long.valueOf(this.f23619m));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f23612f;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f23612f != 105) {
            sb.append(" requested=");
            sb.append(this.f23613g);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f23614h);
        sb.append("ms");
        if (this.f23619m > this.f23613g) {
            sb.append(" maxWait=");
            sb.append(this.f23619m);
            sb.append("ms");
        }
        if (this.f23618l > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f23618l);
            sb.append("m");
        }
        long j = this.f23616j;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f23617k != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f23617k);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23612f);
        SafeParcelWriter.m16136a(parcel, 2, this.f23613g);
        SafeParcelWriter.m16136a(parcel, 3, this.f23614h);
        SafeParcelWriter.m16146a(parcel, 4, this.f23615i);
        SafeParcelWriter.m16136a(parcel, 5, this.f23616j);
        SafeParcelWriter.m16135a(parcel, 6, this.f23617k);
        SafeParcelWriter.m16134a(parcel, 7, this.f23618l);
        SafeParcelWriter.m16136a(parcel, 8, this.f23619m);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
