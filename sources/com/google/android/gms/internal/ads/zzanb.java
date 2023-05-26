package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzanb extends zzfn implements zzana {
    public zzanb() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String b = mo27458b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                List f = mo27464f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 4:
                String d = mo27461d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 5:
                zzaei h = mo27468h();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) h);
                return true;
            case 6:
                String c = mo27460c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 7:
                double k = mo27470k();
                parcel2.writeNoException();
                parcel2.writeDouble(k);
                return true;
            case 8:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 9:
                String i3 = mo27469i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 10:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 11:
                mo27459b(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                mo27463e(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean n = mo27471n();
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, n);
                return true;
            case 14:
                boolean r = mo27474r();
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, r);
                return true;
            case 15:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m24347b(parcel2, extras);
                return true;
            case 16:
                mo27456a(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) videoController);
                return true;
            case 18:
                IObjectWrapper q = mo27473q();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) q);
                return true;
            case 19:
                zzaea a = mo27455a();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) a);
                return true;
            case 20:
                IObjectWrapper p = mo27472p();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) p);
                return true;
            case 21:
                IObjectWrapper e = mo27462e();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) e);
                return true;
            case 22:
                mo27457a(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
