package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzxr;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    @SafeParcelable.Field
    public final int orientation;
    @SafeParcelable.Field
    public final String url;
    @SafeParcelable.Field
    public final zzbai zzbtc;
    @SafeParcelable.Field
    public final zzxr zzcgi;
    @SafeParcelable.Field
    public final zzagv zzczo;
    @SafeParcelable.Field
    public final zzagx zzczp;
    @SafeParcelable.Field
    public final zzbgz zzdbs;
    @SafeParcelable.Field
    public final zzc zzdkl;
    @SafeParcelable.Field
    public final zzo zzdkm;
    @SafeParcelable.Field
    public final String zzdkn;
    @SafeParcelable.Field
    public final boolean zzdko;
    @SafeParcelable.Field
    public final String zzdkp;
    @SafeParcelable.Field
    public final zzu zzdkq;
    @SafeParcelable.Field
    public final int zzdkr;
    @SafeParcelable.Field
    public final String zzdks;
    @SafeParcelable.Field
    public final zzh zzdkt;

    public AdOverlayInfoParcel(zzxr zzxr, zzo zzo, zzu zzu, zzbgz zzbgz, int i, zzbai zzbai, String str, zzh zzh) {
        this.zzdkl = null;
        this.zzcgi = null;
        this.zzdkm = zzo;
        this.zzdbs = zzbgz;
        this.zzczo = null;
        this.zzczp = null;
        this.zzdkn = null;
        this.zzdko = false;
        this.zzdkp = null;
        this.zzdkq = null;
        this.orientation = i;
        this.zzdkr = 1;
        this.url = null;
        this.zzbtc = zzbai;
        this.zzdks = str;
        this.zzdkt = zzh;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.zzdkl, i, false);
        SafeParcelWriter.m16138a(parcel, 3, ObjectWrapper.m16391a(this.zzcgi).asBinder(), false);
        SafeParcelWriter.m16138a(parcel, 4, ObjectWrapper.m16391a(this.zzdkm).asBinder(), false);
        SafeParcelWriter.m16138a(parcel, 5, ObjectWrapper.m16391a(this.zzdbs).asBinder(), false);
        SafeParcelWriter.m16138a(parcel, 6, ObjectWrapper.m16391a(this.zzczp).asBinder(), false);
        SafeParcelWriter.m16143a(parcel, 7, this.zzdkn, false);
        SafeParcelWriter.m16146a(parcel, 8, this.zzdko);
        SafeParcelWriter.m16143a(parcel, 9, this.zzdkp, false);
        SafeParcelWriter.m16138a(parcel, 10, ObjectWrapper.m16391a(this.zzdkq).asBinder(), false);
        SafeParcelWriter.m16135a(parcel, 11, this.orientation);
        SafeParcelWriter.m16135a(parcel, 12, this.zzdkr);
        SafeParcelWriter.m16143a(parcel, 13, this.url, false);
        SafeParcelWriter.m16140a(parcel, 14, (Parcelable) this.zzbtc, i, false);
        SafeParcelWriter.m16143a(parcel, 16, this.zzdks, false);
        SafeParcelWriter.m16140a(parcel, 17, (Parcelable) this.zzdkt, i, false);
        SafeParcelWriter.m16138a(parcel, 18, ObjectWrapper.m16391a(this.zzczo).asBinder(), false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public AdOverlayInfoParcel(zzxr zzxr, zzo zzo, zzu zzu, zzbgz zzbgz, boolean z, int i, zzbai zzbai) {
        this.zzdkl = null;
        this.zzcgi = zzxr;
        this.zzdkm = zzo;
        this.zzdbs = zzbgz;
        this.zzczo = null;
        this.zzczp = null;
        this.zzdkn = null;
        this.zzdko = z;
        this.zzdkp = null;
        this.zzdkq = zzu;
        this.orientation = i;
        this.zzdkr = 2;
        this.url = null;
        this.zzbtc = zzbai;
        this.zzdks = null;
        this.zzdkt = null;
    }

    public AdOverlayInfoParcel(zzxr zzxr, zzo zzo, zzagv zzagv, zzagx zzagx, zzu zzu, zzbgz zzbgz, boolean z, int i, String str, zzbai zzbai) {
        this.zzdkl = null;
        this.zzcgi = zzxr;
        this.zzdkm = zzo;
        this.zzdbs = zzbgz;
        this.zzczo = zzagv;
        this.zzczp = zzagx;
        this.zzdkn = null;
        this.zzdko = z;
        this.zzdkp = null;
        this.zzdkq = zzu;
        this.orientation = i;
        this.zzdkr = 3;
        this.url = str;
        this.zzbtc = zzbai;
        this.zzdks = null;
        this.zzdkt = null;
    }

    public AdOverlayInfoParcel(zzxr zzxr, zzo zzo, zzagv zzagv, zzagx zzagx, zzu zzu, zzbgz zzbgz, boolean z, int i, String str, String str2, zzbai zzbai) {
        this.zzdkl = null;
        this.zzcgi = zzxr;
        this.zzdkm = zzo;
        this.zzdbs = zzbgz;
        this.zzczo = zzagv;
        this.zzczp = zzagx;
        this.zzdkn = str2;
        this.zzdko = z;
        this.zzdkp = str;
        this.zzdkq = zzu;
        this.orientation = i;
        this.zzdkr = 3;
        this.url = null;
        this.zzbtc = zzbai;
        this.zzdks = null;
        this.zzdkt = null;
    }

    public AdOverlayInfoParcel(zzc zzc, zzxr zzxr, zzo zzo, zzu zzu, zzbai zzbai) {
        this.zzdkl = zzc;
        this.zzcgi = zzxr;
        this.zzdkm = zzo;
        this.zzdbs = null;
        this.zzczo = null;
        this.zzczp = null;
        this.zzdkn = null;
        this.zzdko = false;
        this.zzdkp = null;
        this.zzdkq = zzu;
        this.orientation = -1;
        this.zzdkr = 4;
        this.url = null;
        this.zzbtc = zzbai;
        this.zzdks = null;
        this.zzdkt = null;
    }

    @SafeParcelable.Constructor
    AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzc zzc, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i, @SafeParcelable.Param(id = 12) int i2, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) zzbai zzbai, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) zzh zzh, @SafeParcelable.Param(id = 18) IBinder iBinder6) {
        this.zzdkl = zzc;
        this.zzcgi = (zzxr) ObjectWrapper.m16390H(IObjectWrapper.Stub.m16389a(iBinder));
        this.zzdkm = (zzo) ObjectWrapper.m16390H(IObjectWrapper.Stub.m16389a(iBinder2));
        this.zzdbs = (zzbgz) ObjectWrapper.m16390H(IObjectWrapper.Stub.m16389a(iBinder3));
        this.zzczo = (zzagv) ObjectWrapper.m16390H(IObjectWrapper.Stub.m16389a(iBinder6));
        this.zzczp = (zzagx) ObjectWrapper.m16390H(IObjectWrapper.Stub.m16389a(iBinder4));
        this.zzdkn = str;
        this.zzdko = z;
        this.zzdkp = str2;
        this.zzdkq = (zzu) ObjectWrapper.m16390H(IObjectWrapper.Stub.m16389a(iBinder5));
        this.orientation = i;
        this.zzdkr = i2;
        this.url = str3;
        this.zzbtc = zzbai;
        this.zzdks = str4;
        this.zzdkt = zzh;
    }
}
