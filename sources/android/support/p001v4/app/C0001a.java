package android.support.p001v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.app.a */
/* compiled from: INotificationSideChannel */
public interface C0001a extends IInterface {

    /* renamed from: android.support.v4.app.a$a */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0002a extends Binder implements C0001a {

        /* renamed from: android.support.v4.app.a$a$a */
        /* compiled from: INotificationSideChannel */
        private static class C0003a implements C0001a {

            /* renamed from: g */
            public static C0001a f0g;

            /* renamed from: f */
            private IBinder f1f;

            C0003a(IBinder iBinder) {
                this.f1f = iBinder;
            }

            /* renamed from: a */
            public void mo1a(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f1f.transact(1, obtain, (Parcel) null, 1) || C0002a.m2Z() == null) {
                        obtain.recycle();
                    } else {
                        C0002a.m2Z().mo1a(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1f;
            }
        }

        /* renamed from: Z */
        public static C0001a m2Z() {
            return C0003a.f0g;
        }

        /* renamed from: a */
        public static C0001a m3a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0001a)) {
                return new C0003a(iBinder);
            }
            return (C0001a) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo1a(String str, int i, String str2, Notification notification) throws RemoteException;
}
