package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzv();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13443f;
    @SafeParcelable.Field

    /* renamed from: g */
    private boolean f13444g;
    @SafeParcelable.Field

    /* renamed from: h */
    private long f13445h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final boolean f13446i;

    @SafeParcelable.Constructor
    DeviceMetaData(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f13443f = i;
        this.f13444g = z;
        this.f13445h = j;
        this.f13446i = z2;
    }

    /* renamed from: d */
    public long mo24660d() {
        return this.f13445h;
    }

    /* renamed from: o */
    public boolean mo24661o() {
        return this.f13446i;
    }

    /* renamed from: p */
    public boolean mo24662p() {
        return this.f13444g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13443f);
        SafeParcelWriter.m16146a(parcel, 2, mo24662p());
        SafeParcelWriter.m16136a(parcel, 3, mo24660d());
        SafeParcelWriter.m16146a(parcel, 4, mo24661o());
        SafeParcelWriter.m16132a(parcel, a);
    }
}
