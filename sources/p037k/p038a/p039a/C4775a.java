package p037k.p038a.p039a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: k.a.a.a */
/* compiled from: IPackageInstallObserver */
public interface C4775a extends IInterface {

    /* renamed from: k.a.a.a$a */
    /* compiled from: IPackageInstallObserver */
    public static abstract class C4776a extends Binder implements C4775a {
        public C4776a() {
            throw new RuntimeException("Stub!");
        }

        public static C4775a asInterface(IBinder iBinder) {
            throw new RuntimeException("Stub!");
        }

        public IBinder asBinder() {
            throw new RuntimeException("Stub!");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            throw new RuntimeException("Stub!");
        }

        public abstract void packageInstalled(String str, int i) throws RemoteException;
    }
}
