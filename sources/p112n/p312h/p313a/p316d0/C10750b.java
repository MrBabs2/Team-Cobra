package p112n.p312h.p313a.p316d0;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;

/* renamed from: n.h.a.d0.b */
/* compiled from: IFileDownloadIPCService */
public interface C10750b extends IInterface {
    /* renamed from: M0 */
    boolean mo32784M0() throws RemoteException;

    /* renamed from: a */
    void mo32785a(int i, Notification notification) throws RemoteException;

    /* renamed from: a */
    void mo32787a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException;

    /* renamed from: a */
    void mo32788a(C10747a aVar) throws RemoteException;

    /* renamed from: a */
    boolean mo32789a(String str, String str2) throws RemoteException;

    /* renamed from: b */
    byte mo32790b(int i) throws RemoteException;

    /* renamed from: b */
    void mo32792b(C10747a aVar) throws RemoteException;

    /* renamed from: c0 */
    void mo32793c0() throws RemoteException;

    /* renamed from: d */
    boolean mo32794d(int i) throws RemoteException;

    /* renamed from: e */
    boolean mo32795e(int i) throws RemoteException;

    /* renamed from: j */
    boolean mo32796j(int i) throws RemoteException;

    /* renamed from: l */
    void mo32797l(boolean z) throws RemoteException;

    /* renamed from: m */
    long mo32798m(int i) throws RemoteException;

    /* renamed from: m1 */
    void mo32799m1() throws RemoteException;

    /* renamed from: q */
    long mo32801q(int i) throws RemoteException;

    /* renamed from: n.h.a.d0.b$a */
    /* compiled from: IFileDownloadIPCService */
    public static abstract class C10751a extends Binder implements C10750b {
        public C10751a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCService");
        }

        /* renamed from: a */
        public static C10750b m36442a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C10750b)) {
                return new C10752a(iBinder);
            }
            return (C10750b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.app.Notification} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r17, android.os.Parcel r18, android.os.Parcel r19, int r20) throws android.os.RemoteException {
            /*
                r16 = this;
                r10 = r16
                r0 = r17
                r1 = r18
                r11 = r19
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r3 = "com.liulishuo.filedownloader.i.IFileDownloadIPCService"
                r12 = 1
                if (r0 == r2) goto L_0x0159
                r2 = 0
                r4 = 0
                switch(r0) {
                    case 1: goto L_0x014a;
                    case 2: goto L_0x013b;
                    case 3: goto L_0x0125;
                    case 4: goto L_0x00d0;
                    case 5: goto L_0x00be;
                    case 6: goto L_0x00b4;
                    case 7: goto L_0x00a2;
                    case 8: goto L_0x0090;
                    case 9: goto L_0x007e;
                    case 10: goto L_0x006c;
                    case 11: goto L_0x005e;
                    case 12: goto L_0x0044;
                    case 13: goto L_0x0036;
                    case 14: goto L_0x0024;
                    case 15: goto L_0x001a;
                    default: goto L_0x0015;
                }
            L_0x0015:
                boolean r0 = super.onTransact(r17, r18, r19, r20)
                return r0
            L_0x001a:
                r1.enforceInterface(r3)
                r16.mo32793c0()
                r19.writeNoException()
                return r12
            L_0x0024:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                boolean r0 = r10.mo32795e(r0)
                r19.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x0036:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x0040
                r4 = 1
            L_0x0040:
                r10.mo32797l(r4)
                return r12
            L_0x0044:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                int r3 = r18.readInt()
                if (r3 == 0) goto L_0x005a
                android.os.Parcelable$Creator r2 = android.app.Notification.CREATOR
                java.lang.Object r1 = r2.createFromParcel(r1)
                r2 = r1
                android.app.Notification r2 = (android.app.Notification) r2
            L_0x005a:
                r10.mo32785a((int) r0, (android.app.Notification) r2)
                return r12
            L_0x005e:
                r1.enforceInterface(r3)
                boolean r0 = r16.mo32784M0()
                r19.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x006c:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                byte r0 = r10.mo32790b((int) r0)
                r19.writeNoException()
                r11.writeByte(r0)
                return r12
            L_0x007e:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                long r0 = r10.mo32798m(r0)
                r19.writeNoException()
                r11.writeLong(r0)
                return r12
            L_0x0090:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                long r0 = r10.mo32801q(r0)
                r19.writeNoException()
                r11.writeLong(r0)
                return r12
            L_0x00a2:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                boolean r0 = r10.mo32796j(r0)
                r19.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x00b4:
                r1.enforceInterface(r3)
                r16.mo32799m1()
                r19.writeNoException()
                return r12
            L_0x00be:
                r1.enforceInterface(r3)
                int r0 = r18.readInt()
                boolean r0 = r10.mo32794d(r0)
                r19.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x00d0:
                r1.enforceInterface(r3)
                java.lang.String r3 = r18.readString()
                java.lang.String r5 = r18.readString()
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x00e3
                r6 = 1
                goto L_0x00e4
            L_0x00e3:
                r6 = 0
            L_0x00e4:
                int r7 = r18.readInt()
                int r8 = r18.readInt()
                int r9 = r18.readInt()
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x00f8
                r13 = 1
                goto L_0x00f9
            L_0x00f8:
                r13 = 0
            L_0x00f9:
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x0109
                android.os.Parcelable$Creator<com.liulishuo.filedownloader.model.FileDownloadHeader> r0 = com.liulishuo.filedownloader.model.FileDownloadHeader.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r1)
                com.liulishuo.filedownloader.model.FileDownloadHeader r0 = (com.liulishuo.filedownloader.model.FileDownloadHeader) r0
                r14 = r0
                goto L_0x010a
            L_0x0109:
                r14 = r2
            L_0x010a:
                int r0 = r18.readInt()
                if (r0 == 0) goto L_0x0112
                r15 = 1
                goto L_0x0113
            L_0x0112:
                r15 = 0
            L_0x0113:
                r0 = r16
                r1 = r3
                r2 = r5
                r3 = r6
                r4 = r7
                r5 = r8
                r6 = r9
                r7 = r13
                r8 = r14
                r9 = r15
                r0.mo32787a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r19.writeNoException()
                return r12
            L_0x0125:
                r1.enforceInterface(r3)
                java.lang.String r0 = r18.readString()
                java.lang.String r1 = r18.readString()
                boolean r0 = r10.mo32789a((java.lang.String) r0, (java.lang.String) r1)
                r19.writeNoException()
                r11.writeInt(r0)
                return r12
            L_0x013b:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                n.h.a.d0.a r0 = p112n.p312h.p313a.p316d0.C10747a.C10748a.m36425a(r0)
                r10.mo32792b((p112n.p312h.p313a.p316d0.C10747a) r0)
                return r12
            L_0x014a:
                r1.enforceInterface(r3)
                android.os.IBinder r0 = r18.readStrongBinder()
                n.h.a.d0.a r0 = p112n.p312h.p313a.p316d0.C10747a.C10748a.m36425a(r0)
                r10.mo32788a(r0)
                return r12
            L_0x0159:
                r11.writeString(r3)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p112n.p312h.p313a.p316d0.C10750b.C10751a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        /* renamed from: n.h.a.d0.b$a$a */
        /* compiled from: IFileDownloadIPCService */
        private static class C10752a implements C10750b {

            /* renamed from: f */
            private IBinder f28818f;

            C10752a(IBinder iBinder) {
                this.f28818f = iBinder;
            }

            /* renamed from: M0 */
            public boolean mo32784M0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    boolean z = false;
                    this.f28818f.transact(11, obtain, obtain2, 0);
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
            public void mo32788a(C10747a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f28818f.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f28818f;
            }

            /* renamed from: b */
            public void mo32792b(C10747a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f28818f.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c0 */
            public void mo32793c0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    this.f28818f.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public boolean mo32794d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f28818f.transact(5, obtain, obtain2, 0);
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

            /* renamed from: e */
            public boolean mo32795e(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f28818f.transact(14, obtain, obtain2, 0);
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

            /* renamed from: j */
            public boolean mo32796j(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f28818f.transact(7, obtain, obtain2, 0);
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

            /* renamed from: l */
            public void mo32797l(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f28818f.transact(13, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public long mo32798m(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    this.f28818f.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m1 */
            public void mo32799m1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    this.f28818f.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public long mo32801q(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    this.f28818f.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo32789a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.f28818f.transact(3, obtain, obtain2, 0);
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

            /* renamed from: b */
            public byte mo32790b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    this.f28818f.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readByte();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo32787a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    int i4 = 1;
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(z2 ? 1 : 0);
                    if (fileDownloadHeader != null) {
                        obtain.writeInt(1);
                        fileDownloadHeader.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z3) {
                        i4 = 0;
                    }
                    obtain.writeInt(i4);
                    this.f28818f.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo32785a(int i, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f28818f.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
