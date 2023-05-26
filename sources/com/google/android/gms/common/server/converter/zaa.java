package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@SafeParcelable.Class
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14216f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final StringToIntConverter f14217g;

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) StringToIntConverter stringToIntConverter) {
        this.f14216f = i;
        this.f14217g = stringToIntConverter;
    }

    /* renamed from: a */
    public static zaa m16192a(FastJsonResponse.FieldConverter<?, ?> fieldConverter) {
        if (fieldConverter instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) fieldConverter);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: d */
    public final FastJsonResponse.FieldConverter<?, ?> mo25441d() {
        StringToIntConverter stringToIntConverter = this.f14217g;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14216f);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f14217g, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f14216f = 1;
        this.f14217g = stringToIntConverter;
    }
}
