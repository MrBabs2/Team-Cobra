package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzafb extends zzfn implements zzafa {
    public zzafb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper j = mo27247j();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) j);
                return true;
            case 3:
                String b = mo27236b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 4:
                List f = mo27243f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 5:
                String d = mo27240d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 6:
                zzaei C = mo27233C();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) C);
                return true;
            case 7:
                String c = mo27238c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 8:
                String l = mo27248l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                return true;
            case 9:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m24347b(parcel2, extras);
                return true;
            case 10:
                destroy();
                parcel2.writeNoException();
                return true;
            case 11:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) videoController);
                return true;
            case 12:
                mo27235a((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean b2 = mo27237b((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, b2);
                return true;
            case 14:
                mo27239c((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzaea a = mo27234a();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) a);
                return true;
            case 16:
                IObjectWrapper e = mo27242e();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) e);
                return true;
            case 17:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            default:
                return false;
        }
    }
}
