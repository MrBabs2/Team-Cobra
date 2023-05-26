package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@ShowFirstParty
@SafeParcelable.Class
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zaj();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14242f;
    @SafeParcelable.Field

    /* renamed from: g */
    final String f14243g;
    @SafeParcelable.Field

    /* renamed from: h */
    final FastJsonResponse.Field<?, ?> f14244h;

    @SafeParcelable.Constructor
    zam(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) FastJsonResponse.Field<?, ?> field) {
        this.f14242f = i;
        this.f14243g = str;
        this.f14244h = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14242f);
        SafeParcelWriter.m16143a(parcel, 2, this.f14243g, false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) this.f14244h, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f14242f = 1;
        this.f14243g = str;
        this.f14244h = field;
    }
}
