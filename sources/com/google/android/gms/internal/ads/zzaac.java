package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzaac extends zzfn implements zzaab {
    public zzaac() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo26908B();
                parcel2.writeNoException();
                return true;
            case 2:
                mo26910a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                mo26918n(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                mo26916g(zzfo.m24345a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                mo26914b(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo26913a(parcel.readString(), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float G0 = mo26909G0();
                parcel2.writeNoException();
                parcel2.writeFloat(G0);
                return true;
            case 8:
                boolean s0 = mo26920s0();
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, s0);
                return true;
            case 9:
                String r0 = mo26919r0();
                parcel2.writeNoException();
                parcel2.writeString(r0);
                return true;
            case 10:
                mo26915f(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                mo26912a(zzamq.m19431a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                mo26911a(zzaiu.m19270a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzaio> k0 = mo26917k0();
                parcel2.writeNoException();
                parcel2.writeTypedList(k0);
                return true;
            default:
                return false;
        }
    }
}
