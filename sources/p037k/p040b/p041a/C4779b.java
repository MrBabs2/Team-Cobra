package p037k.p040b.p041a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: k.b.a.b */
/* compiled from: ICustomTabsService */
public interface C4779b extends IInterface {
    /* renamed from: a */
    boolean mo16617a(C4777a aVar) throws RemoteException;

    /* renamed from: a */
    boolean mo16618a(C4777a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: b */
    boolean mo16619b(long j) throws RemoteException;

    /* renamed from: k.b.a.b$a */
    /* compiled from: ICustomTabsService */
    public static abstract class C4780a extends Binder implements C4779b {
        /* renamed from: a */
        public static C4779b m7892a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C4779b)) {
                return new C4781a(iBinder);
            }
            return (C4779b) queryLocalInterface;
        }

        /* renamed from: k.b.a.b$a$a */
        /* compiled from: ICustomTabsService */
        private static class C4781a implements C4779b {

            /* renamed from: f */
            private IBinder f8123f;

            C4781a(IBinder iBinder) {
                this.f8123f = iBinder;
            }

            /* renamed from: a */
            public boolean mo16617a(C4777a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = false;
                    this.f8123f.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f8123f;
            }

            /* renamed from: b */
            public boolean mo16619b(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f8123f.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo16618a(C4777a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f8123f.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
