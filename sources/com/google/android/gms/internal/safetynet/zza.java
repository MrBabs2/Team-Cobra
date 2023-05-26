package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f23578f;

    /* renamed from: g */
    private final String f23579g;

    protected zza(IBinder iBinder, String str) {
        this.f23578f = iBinder;
        this.f23579g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final Parcel mo30501Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23579g);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30502a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23578f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f23578f;
    }
}
