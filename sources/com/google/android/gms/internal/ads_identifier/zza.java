package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f23050f;

    /* renamed from: g */
    private final String f23051g;

    protected zza(IBinder iBinder, String str) {
        this.f23050f = iBinder;
        this.f23051g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final Parcel mo29925Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23051g);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo29926a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f23050f.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f23050f;
    }
}
