package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzane extends zzfn implements zzand {
    public zzane() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String b = mo27480b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                List f = mo27486f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 4:
                String d = mo27483d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 5:
                zzaei C = mo27476C();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) C);
                return true;
            case 6:
                String c = mo27482c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 7:
                String l = mo27489l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                return true;
            case 8:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 9:
                mo27481b(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                mo27485e(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                boolean n = mo27490n();
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, n);
                return true;
            case 12:
                boolean r = mo27493r();
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, r);
                return true;
            case 13:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m24347b(parcel2, extras);
                return true;
            case 14:
                mo27478a(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper q = mo27492q();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) q);
                return true;
            case 16:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) videoController);
                return true;
            case 19:
                zzaea a = mo27477a();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) a);
                return true;
            case 20:
                IObjectWrapper p = mo27491p();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) p);
                return true;
            case 21:
                IObjectWrapper e = mo27484e();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) e);
                return true;
            case 22:
                mo27479a(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
