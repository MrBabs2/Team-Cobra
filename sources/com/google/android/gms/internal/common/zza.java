package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f23150f;

    /* renamed from: g */
    private final String f23151g;

    protected zza(IBinder iBinder, String str) {
        this.f23150f = iBinder;
        this.f23151g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Parcel mo30003B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23151g);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo30004a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f23150f.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f23150f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30006b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23150f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo30007c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f23150f.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
