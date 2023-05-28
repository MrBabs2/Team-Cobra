package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzac();

    /* renamed from: g */
    static final List<Location> f23620g = Collections.emptyList();
    @SafeParcelable.Field

    /* renamed from: f */
    private final List<Location> f23621f;

    @SafeParcelable.Constructor
    LocationResult(@SafeParcelable.Param(id = 1) List<Location> list) {
        this.f23621f = list;
    }

    /* renamed from: d */
    public final List<Location> mo30562d() {
        return this.f23621f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f23621f.size() != this.f23621f.size()) {
            return false;
        }
        Iterator<Location> it = this.f23621f.iterator();
        for (Location time : locationResult.f23621f) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f23621f) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f23621f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16155c(parcel, 1, mo30562d(), false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
