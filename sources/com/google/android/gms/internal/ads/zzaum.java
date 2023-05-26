package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzaum extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaum> CREATOR = new zzaun();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f18525f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f18526g;

    public zzaum(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f18525f, false);
        SafeParcelWriter.m16143a(parcel, 2, this.f18526g, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzaum(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.f18525f = str;
        this.f18526g = str2;
    }
}
