package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzzw extends zzfn implements zzzv {
    public zzzw() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzzk zza = zza(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), (zzyd) zzfo.m24341a(parcel, zzyd.CREATOR), parcel.readString(), zzamq.m19431a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zza);
                return true;
            case 2:
                zzzk zzb = zzb(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), (zzyd) zzfo.m24341a(parcel, zzyd.CREATOR), parcel.readString(), zzamq.m19431a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zzb);
                return true;
            case 3:
                zzzf zza2 = zza(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), parcel.readString(), zzamq.m19431a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zza2);
                return true;
            case 4:
                zzaab zzg = zzg(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zzg);
                return true;
            case 5:
                zzaem zzc = zzc(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zzc);
                return true;
            case 6:
                zzasw zza3 = zza(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), zzamq.m19431a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zza3);
                return true;
            case 7:
                zzaqq zzh = zzh(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zzh);
                return true;
            case 8:
                zzaqg zzf = zzf(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zzf);
                return true;
            case 9:
                zzaab zza4 = zza(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zza4);
                return true;
            case 10:
                zzzk zza5 = zza(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), (zzyd) zzfo.m24341a(parcel, zzyd.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zza5);
                return true;
            case 11:
                zzaer zza6 = zza(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zza6);
                return true;
            case 12:
                zzatt zzb2 = zzb(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), parcel.readString(), zzamq.m19431a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) zzb2);
                return true;
            default:
                return false;
        }
    }
}
