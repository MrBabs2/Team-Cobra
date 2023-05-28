package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public final class zzdp extends zzq implements zzdn {
    zzdp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* renamed from: a */
    public final void mo30292a(IObjectWrapper iObjectWrapper, zzdy zzdy, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        zzs.m26507a(Z, (Parcelable) zzdy);
        Z.writeLong(j);
        mo30364b(1, Z);
    }

    /* renamed from: b */
    public final void mo30309b(zzdq zzdq) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdq);
        mo30364b(20, Z);
    }

    /* renamed from: c */
    public final void mo30312c(long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeLong(j);
        mo30364b(14, Z);
    }

    /* renamed from: d */
    public final void mo30317d(long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeLong(j);
        mo30364b(13, Z);
    }

    /* renamed from: e */
    public final void mo30321e(zzdq zzdq) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdq);
        mo30364b(19, Z);
    }

    /* renamed from: f */
    public final void mo30322f(zzdq zzdq) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdq);
        mo30364b(16, Z);
    }

    /* renamed from: b */
    public final void mo30311b(String str, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeLong(j);
        mo30364b(23, Z);
    }

    /* renamed from: c */
    public final void mo30314c(zzdq zzdq) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdq);
        mo30364b(17, Z);
    }

    /* renamed from: d */
    public final void mo30319d(zzdq zzdq) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdq);
        mo30364b(21, Z);
    }

    /* renamed from: e */
    public final void mo30320e(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        Z.writeLong(j);
        mo30364b(29, Z);
    }

    /* renamed from: a */
    public final void mo30302a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzs.m26507a(Z, (Parcelable) bundle);
        zzs.m26508a(Z, z);
        zzs.m26508a(Z, z2);
        Z.writeLong(j);
        mo30364b(2, Z);
    }

    /* renamed from: c */
    public final void mo30316c(String str, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeLong(j);
        mo30364b(24, Z);
    }

    /* renamed from: d */
    public final void mo30318d(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        Z.writeLong(j);
        mo30364b(25, Z);
    }

    /* renamed from: b */
    public final void mo30308b(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        Z.writeLong(j);
        mo30364b(26, Z);
    }

    /* renamed from: c */
    public final void mo30313c(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        Z.writeLong(j);
        mo30364b(28, Z);
    }

    /* renamed from: b */
    public final void mo30310b(zzdt zzdt) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdt);
        mo30364b(36, Z);
    }

    /* renamed from: a */
    public final void mo30301a(String str, String str2, Bundle bundle, zzdq zzdq, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzs.m26507a(Z, (Parcelable) bundle);
        zzs.m26506a(Z, (IInterface) zzdq);
        Z.writeLong(j);
        mo30364b(3, Z);
    }

    /* renamed from: c */
    public final void mo30315c(zzdt zzdt) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdt);
        mo30364b(35, Z);
    }

    /* renamed from: a */
    public final void mo30303a(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        zzs.m26508a(Z, z);
        Z.writeLong(j);
        mo30364b(4, Z);
    }

    /* renamed from: a */
    public final void mo30305a(String str, String str2, boolean z, zzdq zzdq) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzs.m26508a(Z, z);
        zzs.m26506a(Z, (IInterface) zzdq);
        mo30364b(5, Z);
    }

    /* renamed from: a */
    public final void mo30299a(String str, zzdq zzdq) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        zzs.m26506a(Z, (IInterface) zzdq);
        mo30364b(6, Z);
    }

    /* renamed from: a */
    public final void mo30298a(String str, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeLong(j);
        mo30364b(7, Z);
    }

    /* renamed from: a */
    public final void mo30287a(Bundle bundle, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26507a(Z, (Parcelable) bundle);
        Z.writeLong(j);
        mo30364b(8, Z);
    }

    /* renamed from: a */
    public final void mo30300a(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzs.m26507a(Z, (Parcelable) bundle);
        mo30364b(9, Z);
    }

    /* renamed from: a */
    public final void mo30304a(String str, String str2, zzdq zzdq) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzs.m26506a(Z, (IInterface) zzdq);
        mo30364b(10, Z);
    }

    /* renamed from: a */
    public final void mo30307a(boolean z, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26508a(Z, z);
        Z.writeLong(j);
        mo30364b(11, Z);
    }

    /* renamed from: a */
    public final void mo30286a(long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeLong(j);
        mo30364b(12, Z);
    }

    /* renamed from: a */
    public final void mo30293a(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        Z.writeString(str);
        Z.writeString(str2);
        Z.writeLong(j);
        mo30364b(15, Z);
    }

    /* renamed from: a */
    public final void mo30297a(zzdw zzdw) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdw);
        mo30364b(18, Z);
    }

    /* renamed from: a */
    public final void mo30294a(zzdq zzdq) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdq);
        mo30364b(22, Z);
    }

    /* renamed from: a */
    public final void mo30290a(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        zzs.m26507a(Z, (Parcelable) bundle);
        Z.writeLong(j);
        mo30364b(27, Z);
    }

    /* renamed from: a */
    public final void mo30289a(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        Z.writeLong(j);
        mo30364b(30, Z);
    }

    /* renamed from: a */
    public final void mo30291a(IObjectWrapper iObjectWrapper, zzdq zzdq, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        zzs.m26506a(Z, (IInterface) zzdq);
        Z.writeLong(j);
        mo30364b(31, Z);
    }

    /* renamed from: a */
    public final void mo30288a(Bundle bundle, zzdq zzdq, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26507a(Z, (Parcelable) bundle);
        zzs.m26506a(Z, (IInterface) zzdq);
        Z.writeLong(j);
        mo30364b(32, Z);
    }

    /* renamed from: a */
    public final void mo30285a(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeInt(i);
        Z.writeString(str);
        zzs.m26506a(Z, (IInterface) iObjectWrapper);
        zzs.m26506a(Z, (IInterface) iObjectWrapper2);
        zzs.m26506a(Z, (IInterface) iObjectWrapper3);
        mo30364b(33, Z);
    }

    /* renamed from: a */
    public final void mo30296a(zzdt zzdt) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdt);
        mo30364b(34, Z);
    }

    /* renamed from: a */
    public final void mo30306a(Map map) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeMap(map);
        mo30364b(37, Z);
    }

    /* renamed from: a */
    public final void mo30295a(zzdq zzdq, int i) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26506a(Z, (IInterface) zzdq);
        Z.writeInt(i);
        mo30364b(38, Z);
    }
}
