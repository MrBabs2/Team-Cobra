package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzai();
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f23630f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f23631g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final boolean f23632h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final boolean f23633i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final boolean f23634j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final boolean f23635k;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) boolean z5, @SafeParcelable.Param(id = 6) boolean z6) {
        this.f23630f = z;
        this.f23631g = z2;
        this.f23632h = z3;
        this.f23633i = z4;
        this.f23634j = z5;
        this.f23635k = z6;
    }

    /* renamed from: d */
    public final boolean mo30570d() {
        return this.f23635k;
    }

    /* renamed from: o */
    public final boolean mo30571o() {
        return this.f23632h;
    }

    /* renamed from: p */
    public final boolean mo30572p() {
        return this.f23633i;
    }

    /* renamed from: q */
    public final boolean mo30573q() {
        return this.f23630f;
    }

    /* renamed from: t */
    public final boolean mo30574t() {
        return this.f23634j;
    }

    /* renamed from: u */
    public final boolean mo30575u() {
        return this.f23631g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16146a(parcel, 1, mo30573q());
        SafeParcelWriter.m16146a(parcel, 2, mo30575u());
        SafeParcelWriter.m16146a(parcel, 3, mo30571o());
        SafeParcelWriter.m16146a(parcel, 4, mo30572p());
        SafeParcelWriter.m16146a(parcel, 5, mo30574t());
        SafeParcelWriter.m16146a(parcel, 6, mo30570d());
        SafeParcelWriter.m16132a(parcel, a);
    }
}
