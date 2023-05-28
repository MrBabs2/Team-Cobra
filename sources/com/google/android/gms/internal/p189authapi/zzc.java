package com.google.android.gms.internal.p189authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api.zzc */
public class zzc implements IInterface {

    /* renamed from: f */
    private final IBinder f23053f;

    /* renamed from: g */
    private final String f23054g;

    protected zzc(IBinder iBinder, String str) {
        this.f23053f = iBinder;
        this.f23054g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final Parcel mo29938Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23054g);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29939a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23053f.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f23053f;
    }
}
