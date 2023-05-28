package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzs;

@SafeParcelable.Class
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field

    /* renamed from: f */
    private int f23197f;
    @SafeParcelable.Field

    /* renamed from: g */
    private zzm f23198g;
    @SafeParcelable.Field

    /* renamed from: h */
    private zzr f23199h;
    @SafeParcelable.Field

    /* renamed from: i */
    private zzaj f23200i;

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzm zzm, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2) {
        this.f23197f = i;
        this.f23198g = zzm;
        zzaj zzaj = null;
        this.f23199h = iBinder == null ? null : zzs.m26821a(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzal(iBinder2);
        }
        this.f23200i = zzaj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23197f);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f23198g, i, false);
        zzr zzr = this.f23199h;
        IBinder iBinder = null;
        SafeParcelWriter.m16138a(parcel, 3, zzr == null ? null : zzr.asBinder(), false);
        zzaj zzaj = this.f23200i;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        SafeParcelWriter.m16138a(parcel, 4, iBinder, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
