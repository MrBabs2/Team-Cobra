package android.support.p001v4.p002os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* compiled from: IResultReceiver */
public interface C0045a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C0046a extends Binder implements C0045a {

        /* renamed from: android.support.v4.os.a$a$a */
        /* compiled from: IResultReceiver */
        private static class C0047a implements C0045a {

            /* renamed from: g */
            public static C0045a f81g;

            /* renamed from: f */
            private IBinder f82f;

            C0047a(IBinder iBinder) {
                this.f82f = iBinder;
            }

            public IBinder asBinder() {
                return this.f82f;
            }

            /* renamed from: c */
            public void mo121c(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f82f.transact(1, obtain, (Parcel) null, 1) || C0046a.m140Z() == null) {
                        obtain.recycle();
                    } else {
                        C0046a.m140Z().mo121c(i, bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0046a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: Z */
        public static C0045a m140Z() {
            return C0047a.f81g;
        }

        /* renamed from: a */
        public static C0045a m141a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0045a)) {
                return new C0047a(iBinder);
            }
            return (C0045a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo121c(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: c */
    void mo121c(int i, Bundle bundle) throws RemoteException;
}
