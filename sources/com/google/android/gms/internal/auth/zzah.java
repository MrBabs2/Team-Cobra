package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f23068f = 1;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f23069g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final PendingIntent f23070h;

    @SafeParcelable.Constructor
    zzah(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        Preconditions.m16037a(str);
        this.f23069g = str;
        Preconditions.m16037a(pendingIntent);
        this.f23070h = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23068f);
        SafeParcelWriter.m16143a(parcel, 2, this.f23069g, false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) this.f23070h, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
