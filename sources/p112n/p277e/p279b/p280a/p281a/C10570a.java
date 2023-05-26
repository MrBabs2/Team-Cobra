package p112n.p277e.p279b.p280a.p281a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: n.e.b.a.a.a */
/* compiled from: IGetInstallReferrerService */
public interface C10570a extends IInterface {

    /* renamed from: n.e.b.a.a.a$a */
    /* compiled from: IGetInstallReferrerService */
    public static abstract class C10571a extends Binder implements C10570a {

        /* renamed from: n.e.b.a.a.a$a$a */
        /* compiled from: IGetInstallReferrerService */
        private static class C10572a implements C10570a {

            /* renamed from: f */
            private IBinder f28435f;

            C10572a(IBinder iBinder) {
                this.f28435f = iBinder;
            }

            public IBinder asBinder() {
                return this.f28435f;
            }

            /* renamed from: h */
            public Bundle mo36119h(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28435f.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C10570a m35865a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C10570a)) {
                return new C10572a(iBinder);
            }
            return (C10570a) queryLocalInterface;
        }
    }

    /* renamed from: h */
    Bundle mo36119h(Bundle bundle) throws RemoteException;
}
