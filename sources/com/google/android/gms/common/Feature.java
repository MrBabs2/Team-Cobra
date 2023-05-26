package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f13615f;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: g */
    private final int f13616g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final long f13617h;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) long j) {
        this.f13615f = str;
        this.f13616g = i;
        this.f13617h = j;
    }

    @KeepForSdk
    /* renamed from: d */
    public String mo24852d() {
        return this.f13615f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo24852d() == null || !mo24852d().equals(feature.mo24852d())) && (mo24852d() != null || feature.mo24852d() != null)) || mo24855o() != feature.mo24855o()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m16029a(mo24852d(), Long.valueOf(mo24855o()));
    }

    @KeepForSdk
    /* renamed from: o */
    public long mo24855o() {
        long j = this.f13617h;
        return j == -1 ? (long) this.f13616g : j;
    }

    public String toString() {
        Objects.ToStringHelper a = Objects.m16030a((Object) this);
        a.mo25372a("name", mo24852d());
        a.mo25372a("version", Long.valueOf(mo24855o()));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, mo24852d(), false);
        SafeParcelWriter.m16135a(parcel, 2, this.f13616g);
        SafeParcelWriter.m16136a(parcel, 3, mo24855o());
        SafeParcelWriter.m16132a(parcel, a);
    }
}
