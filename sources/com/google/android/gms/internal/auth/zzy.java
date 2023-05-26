package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24657a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo29974g((Status) zzc.m25798a(parcel, Status.CREATOR));
                return true;
            case 2:
                mo29972a((Status) zzc.m25798a(parcel, Status.CREATOR), (zzt) zzc.m25798a(parcel, zzt.CREATOR));
                return true;
            case 3:
                mo29971a((Status) zzc.m25798a(parcel, Status.CREATOR), (zzl) zzc.m25798a(parcel, zzl.CREATOR));
                return true;
            case 4:
                mo29969H0();
                return true;
            case 5:
                mo29975h((Status) zzc.m25798a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo29973b(parcel.createByteArray());
                return true;
            case 7:
                mo29970a((DeviceMetaData) zzc.m25798a(parcel, DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
