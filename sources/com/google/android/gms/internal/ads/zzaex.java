package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzaex extends zzfn implements zzaew {
    public zzaex() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper j = mo27230j();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) j);
                return true;
            case 3:
                String b = mo27216b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 4:
                List f = mo27223f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 5:
                String d = mo27220d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 6:
                zzaei h = mo27228h();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) h);
                return true;
            case 7:
                String c = mo27218c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 8:
                double k = mo27231k();
                parcel2.writeNoException();
                parcel2.writeDouble(k);
                return true;
            case 9:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 10:
                String i3 = mo27229i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 11:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m24347b(parcel2, extras);
                return true;
            case 12:
                destroy();
                parcel2.writeNoException();
                return true;
            case 13:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) videoController);
                return true;
            case 14:
                mo27215a((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean b2 = mo27217b((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, b2);
                return true;
            case 16:
                mo27219c((Bundle) zzfo.m24341a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                zzaea a = mo27214a();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) a);
                return true;
            case 18:
                IObjectWrapper e = mo27222e();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) e);
                return true;
            case 19:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            default:
                return false;
        }
    }
}
