package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzv;
import com.google.android.gms.location.zzx;
import com.google.android.gms.location.zzy;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();
    @SafeParcelable.Field

    /* renamed from: f */
    private int f23175f;
    @SafeParcelable.Field

    /* renamed from: g */
    private zzbd f23176g;
    @SafeParcelable.Field

    /* renamed from: h */
    private zzx f23177h;
    @SafeParcelable.Field

    /* renamed from: i */
    private PendingIntent f23178i;
    @SafeParcelable.Field

    /* renamed from: j */
    private zzu f23179j;
    @SafeParcelable.Field

    /* renamed from: k */
    private zzaj f23180k;

    @SafeParcelable.Constructor
    zzbf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzbd zzbd, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(id = 5) IBinder iBinder2, @SafeParcelable.Param(id = 6) IBinder iBinder3) {
        this.f23175f = i;
        this.f23176g = zzbd;
        zzaj zzaj = null;
        this.f23177h = iBinder == null ? null : zzy.m26830a(iBinder);
        this.f23178i = pendingIntent;
        this.f23179j = iBinder2 == null ? null : zzv.m26825a(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzal(iBinder3);
        }
        this.f23180k = zzaj;
    }

    /* renamed from: a */
    public static zzbf m25867a(zzu zzu, zzaj zzaj) {
        return new zzbf(2, (zzbd) null, (IBinder) null, (PendingIntent) null, zzu.asBinder(), zzaj != null ? zzaj.asBinder() : null);
    }

    /* renamed from: a */
    public static zzbf m25868a(zzx zzx, zzaj zzaj) {
        return new zzbf(2, (zzbd) null, zzx.asBinder(), (PendingIntent) null, (IBinder) null, zzaj != null ? zzaj.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23175f);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f23176g, i, false);
        zzx zzx = this.f23177h;
        IBinder iBinder = null;
        SafeParcelWriter.m16138a(parcel, 3, zzx == null ? null : zzx.asBinder(), false);
        SafeParcelWriter.m16140a(parcel, 4, (Parcelable) this.f23178i, i, false);
        zzu zzu = this.f23179j;
        SafeParcelWriter.m16138a(parcel, 5, zzu == null ? null : zzu.asBinder(), false);
        zzaj zzaj = this.f23180k;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        SafeParcelWriter.m16138a(parcel, 6, iBinder, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
