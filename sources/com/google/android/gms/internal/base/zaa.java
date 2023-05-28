package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zaa implements IInterface {

    /* renamed from: f */
    private final IBinder f23132f;

    /* renamed from: g */
    private final String f23133g;

    protected zaa(IBinder iBinder, String str) {
        this.f23132f = iBinder;
        this.f23133g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final Parcel mo29980Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23133g);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo29981a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f23132f.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f23132f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29983b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23132f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo29984c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f23132f.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
