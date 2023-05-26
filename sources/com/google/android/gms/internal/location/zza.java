package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f23158f;

    /* renamed from: g */
    private final String f23159g;

    protected zza(IBinder iBinder, String str) {
        this.f23158f = iBinder;
        this.f23159g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final Parcel mo30016Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23159g);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30017a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23158f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f23158f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30019b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f23158f.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
