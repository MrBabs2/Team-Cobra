package android.support.p001v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.media.session.b */
/* compiled from: IMediaSession */
public interface C0026b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* compiled from: IMediaSession */
    public static abstract class C0027a extends Binder implements C0026b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* compiled from: IMediaSession */
        private static class C0028a implements C0026b {

            /* renamed from: f */
            private IBinder f68f;

            C0028a(IBinder iBinder) {
                this.f68f = iBinder;
            }

            /* renamed from: a */
            public void mo89a(C0024a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f68f.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f68f;
            }
        }

        /* renamed from: a */
        public static C0026b m77a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0026b)) {
                return new C0028a(iBinder);
            }
            return (C0026b) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo89a(C0024a aVar) throws RemoteException;
}
