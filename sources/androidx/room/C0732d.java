package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.d */
/* compiled from: IMultiInstanceInvalidationCallback */
public interface C0732d extends IInterface {

    /* renamed from: androidx.room.d$a */
    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class C0733a extends Binder implements C0732d {

        /* renamed from: androidx.room.d$a$a */
        /* compiled from: IMultiInstanceInvalidationCallback */
        private static class C0734a implements C0732d {

            /* renamed from: f */
            private IBinder f2744f;

            C0734a(IBinder iBinder) {
                this.f2744f = iBinder;
            }

            /* renamed from: a */
            public void mo4343a(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f2744f.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2744f;
            }
        }

        public C0733a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: a */
        public static C0732d m3445a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0732d)) {
                return new C0734a(iBinder);
            }
            return (C0732d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo4343a(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo4343a(String[] strArr) throws RemoteException;
}
