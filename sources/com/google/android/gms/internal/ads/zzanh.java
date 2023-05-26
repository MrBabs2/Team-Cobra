package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzanh extends zzfn implements zzang {
    public zzanh() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: a */
    public static zzang m19596a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        if (queryLocalInterface instanceof zzang) {
            return (zzang) queryLocalInterface;
        }
        return new zzani(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String b = mo27498b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                List f = mo27503f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                return true;
            case 4:
                String d = mo27501d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 5:
                zzaei h = mo27507h();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) h);
                return true;
            case 6:
                String c = mo27500c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 7:
                String l = mo27510l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                return true;
            case 8:
                double k = mo27509k();
                parcel2.writeNoException();
                parcel2.writeDouble(k);
                return true;
            case 9:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 10:
                String i3 = mo27508i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 11:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) videoController);
                return true;
            case 12:
                zzaea a = mo27495a();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) a);
                return true;
            case 13:
                IObjectWrapper q = mo27513q();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) q);
                return true;
            case 14:
                IObjectWrapper p = mo27512p();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) p);
                return true;
            case 15:
                IObjectWrapper e = mo27502e();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) e);
                return true;
            case 16:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m24347b(parcel2, extras);
                return true;
            case 17:
                boolean n = mo27511n();
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, n);
                return true;
            case 18:
                boolean r = mo27514r();
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, r);
                return true;
            case 19:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 20:
                mo27499b(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                mo27497a(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()), IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                mo27496a(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                float v0 = mo27516v0();
                parcel2.writeNoException();
                parcel2.writeFloat(v0);
                return true;
            default:
                return false;
        }
    }
}
