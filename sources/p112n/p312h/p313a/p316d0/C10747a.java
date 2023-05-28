package p112n.p312h.p313a.p316d0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* renamed from: n.h.a.d0.a */
/* compiled from: IFileDownloadIPCCallback */
public interface C10747a extends IInterface {

    /* renamed from: n.h.a.d0.a$a */
    /* compiled from: IFileDownloadIPCCallback */
    public static abstract class C10748a extends Binder implements C10747a {

        /* renamed from: n.h.a.d0.a$a$a */
        /* compiled from: IFileDownloadIPCCallback */
        private static class C10749a implements C10747a {

            /* renamed from: f */
            private IBinder f28817f;

            C10749a(IBinder iBinder) {
                this.f28817f = iBinder;
            }

            public IBinder asBinder() {
                return this.f28817f;
            }

            /* renamed from: b */
            public void mo36484b(MessageSnapshot messageSnapshot) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                    if (messageSnapshot != null) {
                        obtain.writeInt(1);
                        messageSnapshot.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28817f.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C10748a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
        }

        /* renamed from: a */
        public static C10747a m36425a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C10747a)) {
                return new C10749a(iBinder);
            }
            return (C10747a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                mo36484b(parcel.readInt() != 0 ? MessageSnapshot.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                return true;
            }
        }
    }

    /* renamed from: b */
    void mo36484b(MessageSnapshot messageSnapshot) throws RemoteException;
}
