package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new zan();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14144f;
    @SafeParcelable.Field

    /* renamed from: g */
    private IBinder f14145g;
    @SafeParcelable.Field

    /* renamed from: h */
    private ConnectionResult f14146h;
    @SafeParcelable.Field

    /* renamed from: i */
    private boolean f14147i;
    @SafeParcelable.Field

    /* renamed from: j */
    private boolean f14148j;

    @SafeParcelable.Constructor
    ResolveAccountResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.f14144f = i;
        this.f14145g = iBinder;
        this.f14146h = connectionResult;
        this.f14147i = z;
        this.f14148j = z2;
    }

    /* renamed from: d */
    public IAccountAccessor mo25379d() {
        return IAccountAccessor.Stub.m16017a(this.f14145g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f14146h.equals(resolveAccountResponse.f14146h) && mo25379d().equals(resolveAccountResponse.mo25379d());
    }

    /* renamed from: o */
    public ConnectionResult mo25381o() {
        return this.f14146h;
    }

    /* renamed from: p */
    public boolean mo25382p() {
        return this.f14147i;
    }

    /* renamed from: q */
    public boolean mo25383q() {
        return this.f14148j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14144f);
        SafeParcelWriter.m16138a(parcel, 2, this.f14145g, false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) mo25381o(), i, false);
        SafeParcelWriter.m16146a(parcel, 4, mo25382p());
        SafeParcelWriter.m16146a(parcel, 5, mo25383q());
        SafeParcelWriter.m16132a(parcel, a);
    }
}
