package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzan extends zzb implements zzam {
    public zzan() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30024a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo30026a(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            mo30027c(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            mo30025a(parcel.readInt(), (PendingIntent) zzc.m25872a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
