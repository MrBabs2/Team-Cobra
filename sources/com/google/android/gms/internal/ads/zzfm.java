package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzfm implements IInterface {

    /* renamed from: f */
    private final IBinder f21860f;

    /* renamed from: g */
    private final String f21861g;

    protected zzfm(IBinder iBinder, String str) {
        this.f21860f = iBinder;
        this.f21861g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final Parcel mo29277Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f21861g);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo29278a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f21860f.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f21860f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29280b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f21860f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo29281c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f21860f.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
