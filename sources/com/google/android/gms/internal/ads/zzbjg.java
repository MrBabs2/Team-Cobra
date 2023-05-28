package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

public abstract class zzbjg extends zzfn implements zzbjf {
    public zzbjg() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo27388f((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle g = mo27390g((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.m24347b(parcel2, g);
                return true;
            case 3:
                mo27386b(parcel.readString(), parcel.readString(), (Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo27383a(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map a = mo27381a(parcel.readString(), parcel.readString(), zzfo.m24345a(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(a);
                return true;
            case 6:
                int j = mo27393j(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(j);
                return true;
            case 7:
                mo27391i((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                mo27382a(parcel.readString(), parcel.readString(), (Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List b = mo27384b(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case 10:
                String b0 = mo27387b0();
                parcel2.writeNoException();
                parcel2.writeString(b0);
                return true;
            case 11:
                String y0 = mo27397y0();
                parcel2.writeNoException();
                parcel2.writeString(y0);
                return true;
            case 12:
                long f0 = mo27389f0();
                parcel2.writeNoException();
                parcel2.writeLong(f0);
                return true;
            case 13:
                mo27394p(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                mo27395s(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo27385b(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String i0 = mo27392i0();
                parcel2.writeNoException();
                parcel2.writeString(i0);
                return true;
            case 17:
                String J0 = mo27380J0();
                parcel2.writeNoException();
                parcel2.writeString(J0);
                return true;
            case 18:
                String x0 = mo27396x0();
                parcel2.writeNoException();
                parcel2.writeString(x0);
                return true;
            default:
                return false;
        }
    }
}
