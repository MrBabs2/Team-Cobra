package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzaca extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaca> CREATOR = new zzacb();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f17753f;

    public zzaca(SearchAdRequest searchAdRequest) {
        this.f17753f = searchAdRequest.getQuery();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 15, this.f17753f, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    @SafeParcelable.Constructor
    zzaca(@SafeParcelable.Param(id = 15) String str) {
        this.f17753f = str;
    }
}
