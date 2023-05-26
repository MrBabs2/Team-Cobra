package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public abstract class zzaff extends zzfn implements zzafe {
    public zzaff() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public static zzafe m19133a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof zzafe) {
            return (zzafe) queryLocalInterface;
        }
        return new zzafg(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String c = mo27250c(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 2:
                zzaei e = mo27252e(parcel.readString());
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) e);
                return true;
            case 3:
                List<String> availableAssetNames = getAvailableAssetNames();
                parcel2.writeNoException();
                parcel2.writeStringList(availableAssetNames);
                return true;
            case 4:
                String customTemplateId = getCustomTemplateId();
                parcel2.writeNoException();
                parcel2.writeString(customTemplateId);
                return true;
            case 5:
                performClick(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 7:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) videoController);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper L0 = mo27249L0();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) L0);
                return true;
            case 10:
                boolean r = mo27258r(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m24344a(parcel2, r);
                return true;
            case 11:
                IObjectWrapper j = mo27256j();
                parcel2.writeNoException();
                zzfo.m24342a(parcel2, (IInterface) j);
                return true;
            default:
                return false;
        }
    }
}
