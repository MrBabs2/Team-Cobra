package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzatl extends zzfn implements zzatk {
    public zzatl() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static zzatk m19969a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzatk) {
            return (zzatk) queryLocalInterface;
        }
        return new zzatm(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo26038o(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                break;
            case 2:
                mo26034b(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo26039q(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                break;
            case 4:
                mo26036g(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                break;
            case 5:
                mo26037j(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                break;
            case 6:
                mo26031C(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                break;
            case 7:
                mo26033a(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), (zzato) zzfo.m24341a(parcel, zzato.CREATOR));
                break;
            case 8:
                mo26032E(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                break;
            case 9:
                mo26035c(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo26040u(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                break;
            case 11:
                mo26041x(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                break;
            case 12:
                zzb((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
