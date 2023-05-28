package com.google.android.gms.signin.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new zak();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f23696f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final ConnectionResult f23697g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final ResolveAccountResponse f23698h;

    @SafeParcelable.Constructor
    zaj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(id = 3) ResolveAccountResponse resolveAccountResponse) {
        this.f23696f = i;
        this.f23697g = connectionResult;
        this.f23698h = resolveAccountResponse;
    }

    /* renamed from: d */
    public final ConnectionResult mo30699d() {
        return this.f23697g;
    }

    /* renamed from: o */
    public final ResolveAccountResponse mo30700o() {
        return this.f23698h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23696f);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f23697g, i, false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) this.f23698h, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zaj(int i) {
        this(new ConnectionResult(8, (PendingIntent) null), (ResolveAccountResponse) null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, (ResolveAccountResponse) null);
    }
}
