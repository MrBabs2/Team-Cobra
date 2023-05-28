package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzag();
    @SafeParcelable.Field

    /* renamed from: f */
    private final List<LocationRequest> f23624f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f23625g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final boolean f23626h;
    @SafeParcelable.Field

    /* renamed from: i */
    private zzae f23627i;

    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    @SafeParcelable.Constructor
    LocationSettingsRequest(@SafeParcelable.Param(id = 1) List<LocationRequest> list, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 5) zzae zzae) {
        this.f23624f = list;
        this.f23625g = z;
        this.f23626h = z2;
        this.f23627i = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16155c(parcel, 1, Collections.unmodifiableList(this.f23624f), false);
        SafeParcelWriter.m16146a(parcel, 2, this.f23625g);
        SafeParcelWriter.m16146a(parcel, 3, this.f23626h);
        SafeParcelWriter.m16140a(parcel, 5, (Parcelable) this.f23627i, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
