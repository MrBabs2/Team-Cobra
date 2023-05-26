package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzd();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14104f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f14105g;
    @SafeParcelable.Field

    /* renamed from: h */
    private int f14106h;
    @SafeParcelable.Field

    /* renamed from: i */
    String f14107i;
    @SafeParcelable.Field

    /* renamed from: j */
    IBinder f14108j;
    @SafeParcelable.Field

    /* renamed from: k */
    Scope[] f14109k;
    @SafeParcelable.Field

    /* renamed from: l */
    Bundle f14110l;
    @SafeParcelable.Field

    /* renamed from: m */
    Account f14111m;
    @SafeParcelable.Field

    /* renamed from: n */
    Feature[] f14112n;
    @SafeParcelable.Field

    /* renamed from: o */
    Feature[] f14113o;
    @SafeParcelable.Field

    /* renamed from: p */
    private boolean f14114p;

    public GetServiceRequest(int i) {
        this.f14104f = 4;
        this.f14106h = GoogleApiAvailabilityLight.f13623a;
        this.f14105g = i;
        this.f14114p = true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14104f);
        SafeParcelWriter.m16135a(parcel, 2, this.f14105g);
        SafeParcelWriter.m16135a(parcel, 3, this.f14106h);
        SafeParcelWriter.m16143a(parcel, 4, this.f14107i, false);
        SafeParcelWriter.m16138a(parcel, 5, this.f14108j, false);
        SafeParcelWriter.m16148a(parcel, 6, (T[]) this.f14109k, i, false);
        SafeParcelWriter.m16137a(parcel, 7, this.f14110l, false);
        SafeParcelWriter.m16140a(parcel, 8, (Parcelable) this.f14111m, i, false);
        SafeParcelWriter.m16148a(parcel, 10, (T[]) this.f14112n, i, false);
        SafeParcelWriter.m16148a(parcel, 11, (T[]) this.f14113o, i, false);
        SafeParcelWriter.m16146a(parcel, 12, this.f14114p);
        SafeParcelWriter.m16132a(parcel, a);
    }

    @SafeParcelable.Constructor
    GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z) {
        this.f14104f = i;
        this.f14105g = i2;
        this.f14106h = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f14107i = "com.google.android.gms";
        } else {
            this.f14107i = str;
        }
        if (i < 2) {
            this.f14111m = iBinder != null ? AccountAccessor.m15936a(IAccountAccessor.Stub.m16017a(iBinder)) : null;
        } else {
            this.f14108j = iBinder;
            this.f14111m = account;
        }
        this.f14109k = scopeArr;
        this.f14110l = bundle;
        this.f14112n = featureArr;
        this.f14113o = featureArr2;
        this.f14114p = z;
    }
}
