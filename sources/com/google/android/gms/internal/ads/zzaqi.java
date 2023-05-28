package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaqi extends zzfm implements zzaqg {
    zzaqi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        Z.writeInt(i2);
        zzfo.m24343a(Z, (Parcelable) intent);
        mo29280b(12, Z);
    }

    public final void onBackPressed() throws RemoteException {
        mo29280b(10, mo29277Z());
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        mo29280b(1, Z);
    }

    public final void onDestroy() throws RemoteException {
        mo29280b(8, mo29277Z());
    }

    public final void onPause() throws RemoteException {
        mo29280b(5, mo29277Z());
    }

    public final void onRestart() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    public final void onResume() throws RemoteException {
        mo29280b(4, mo29277Z());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        Parcel a = mo29278a(6, Z);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    public final void onStart() throws RemoteException {
        mo29280b(3, mo29277Z());
    }

    public final void onStop() throws RemoteException {
        mo29280b(7, mo29277Z());
    }

    public final void zzac(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(13, Z);
    }

    public final void zzdd() throws RemoteException {
        mo29280b(9, mo29277Z());
    }

    public final boolean zztg() throws RemoteException {
        Parcel a = mo29278a(11, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }
}
