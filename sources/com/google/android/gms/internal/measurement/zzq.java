package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzq implements IInterface {

    /* renamed from: f */
    private final IBinder f23430f;

    /* renamed from: g */
    private final String f23431g;

    protected zzq(IBinder iBinder, String str) {
        this.f23430f = iBinder;
        this.f23431g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final Parcel mo30361Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23431g);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo30362a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f23430f.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f23430f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30364b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23430f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
