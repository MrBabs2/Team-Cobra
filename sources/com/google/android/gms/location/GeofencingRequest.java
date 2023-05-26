package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzq();
    @SafeParcelable.Field

    /* renamed from: f */
    private final List<zzbh> f23604f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f23605g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String f23606h;

    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    @SafeParcelable.Constructor
    GeofencingRequest(@SafeParcelable.Param(id = 1) List<zzbh> list, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str) {
        this.f23604f = list;
        this.f23605g = i;
        this.f23606h = str;
    }

    /* renamed from: d */
    public int mo30549d() {
        return this.f23605g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f23604f);
        int i = this.f23605g;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f23606h);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16155c(parcel, 1, this.f23604f, false);
        SafeParcelWriter.m16135a(parcel, 2, mo30549d());
        SafeParcelWriter.m16143a(parcel, 3, this.f23606h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
