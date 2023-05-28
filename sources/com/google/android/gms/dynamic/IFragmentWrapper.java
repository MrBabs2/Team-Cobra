package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IFragmentWrapper extends IInterface {
    /* renamed from: A */
    Bundle mo25519A() throws RemoteException;

    /* renamed from: A0 */
    boolean mo25520A0() throws RemoteException;

    /* renamed from: C0 */
    boolean mo25521C0() throws RemoteException;

    /* renamed from: G */
    boolean mo25522G() throws RemoteException;

    /* renamed from: L */
    boolean mo25523L() throws RemoteException;

    /* renamed from: P */
    IObjectWrapper mo25524P() throws RemoteException;

    /* renamed from: S */
    boolean mo25525S() throws RemoteException;

    /* renamed from: W0 */
    int mo25526W0() throws RemoteException;

    /* renamed from: X */
    boolean mo25527X() throws RemoteException;

    /* renamed from: a */
    void mo25528a(Intent intent) throws RemoteException;

    /* renamed from: a0 */
    IFragmentWrapper mo25529a0() throws RemoteException;

    /* renamed from: c */
    void mo25530c(boolean z) throws RemoteException;

    /* renamed from: d */
    void mo25531d(boolean z) throws RemoteException;

    /* renamed from: e */
    void mo25532e(boolean z) throws RemoteException;

    /* renamed from: e1 */
    IObjectWrapper mo25533e1() throws RemoteException;

    int getId() throws RemoteException;

    String getTag() throws RemoteException;

    boolean isVisible() throws RemoteException;

    /* renamed from: j0 */
    IObjectWrapper mo25537j0() throws RemoteException;

    /* renamed from: m */
    void mo25538m(boolean z) throws RemoteException;

    /* renamed from: o0 */
    boolean mo25539o0() throws RemoteException;

    /* renamed from: p0 */
    IFragmentWrapper mo25540p0() throws RemoteException;

    /* renamed from: s */
    void mo25541s(IObjectWrapper iObjectWrapper) throws RemoteException;

    void startActivityForResult(Intent intent, int i) throws RemoteException;

    /* renamed from: z */
    void mo25543z(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: z0 */
    boolean mo25544z0() throws RemoteException;

    public static abstract class Stub extends zzb implements IFragmentWrapper {

        public static class zza extends com.google.android.gms.internal.common.zza implements IFragmentWrapper {
            zza(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            /* renamed from: A */
            public final Bundle mo25519A() throws RemoteException {
                Parcel a = mo30004a(3, mo30003B());
                Bundle bundle = (Bundle) zzc.m25833a(a, Bundle.CREATOR);
                a.recycle();
                return bundle;
            }

            /* renamed from: A0 */
            public final boolean mo25520A0() throws RemoteException {
                Parcel a = mo30004a(18, mo30003B());
                boolean a2 = zzc.m25837a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: C0 */
            public final boolean mo25521C0() throws RemoteException {
                Parcel a = mo30004a(13, mo30003B());
                boolean a2 = zzc.m25837a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: G */
            public final boolean mo25522G() throws RemoteException {
                Parcel a = mo30004a(15, mo30003B());
                boolean a2 = zzc.m25837a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: L */
            public final boolean mo25523L() throws RemoteException {
                Parcel a = mo30004a(11, mo30003B());
                boolean a2 = zzc.m25837a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: P */
            public final IObjectWrapper mo25524P() throws RemoteException {
                Parcel a = mo30004a(6, mo30003B());
                IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            /* renamed from: S */
            public final boolean mo25525S() throws RemoteException {
                Parcel a = mo30004a(14, mo30003B());
                boolean a2 = zzc.m25837a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: W0 */
            public final int mo25526W0() throws RemoteException {
                Parcel a = mo30004a(10, mo30003B());
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            /* renamed from: X */
            public final boolean mo25527X() throws RemoteException {
                Parcel a = mo30004a(7, mo30003B());
                boolean a2 = zzc.m25837a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: a */
            public final void mo25528a(Intent intent) throws RemoteException {
                Parcel B = mo30003B();
                zzc.m25835a(B, (Parcelable) intent);
                mo30006b(25, B);
            }

            /* renamed from: a0 */
            public final IFragmentWrapper mo25529a0() throws RemoteException {
                Parcel a = mo30004a(9, mo30003B());
                IFragmentWrapper a2 = Stub.m16365a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            /* renamed from: c */
            public final void mo25530c(boolean z) throws RemoteException {
                Parcel B = mo30003B();
                zzc.m25836a(B, z);
                mo30006b(21, B);
            }

            /* renamed from: d */
            public final void mo25531d(boolean z) throws RemoteException {
                Parcel B = mo30003B();
                zzc.m25836a(B, z);
                mo30006b(24, B);
            }

            /* renamed from: e */
            public final void mo25532e(boolean z) throws RemoteException {
                Parcel B = mo30003B();
                zzc.m25836a(B, z);
                mo30006b(22, B);
            }

            /* renamed from: e1 */
            public final IObjectWrapper mo25533e1() throws RemoteException {
                Parcel a = mo30004a(12, mo30003B());
                IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            public final int getId() throws RemoteException {
                Parcel a = mo30004a(4, mo30003B());
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            public final String getTag() throws RemoteException {
                Parcel a = mo30004a(8, mo30003B());
                String readString = a.readString();
                a.recycle();
                return readString;
            }

            public final boolean isVisible() throws RemoteException {
                Parcel a = mo30004a(19, mo30003B());
                boolean a2 = zzc.m25837a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: j0 */
            public final IObjectWrapper mo25537j0() throws RemoteException {
                Parcel a = mo30004a(2, mo30003B());
                IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            /* renamed from: m */
            public final void mo25538m(boolean z) throws RemoteException {
                Parcel B = mo30003B();
                zzc.m25836a(B, z);
                mo30006b(23, B);
            }

            /* renamed from: o0 */
            public final boolean mo25539o0() throws RemoteException {
                Parcel a = mo30004a(16, mo30003B());
                boolean a2 = zzc.m25837a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: p0 */
            public final IFragmentWrapper mo25540p0() throws RemoteException {
                Parcel a = mo30004a(5, mo30003B());
                IFragmentWrapper a2 = Stub.m16365a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            /* renamed from: s */
            public final void mo25541s(IObjectWrapper iObjectWrapper) throws RemoteException {
                Parcel B = mo30003B();
                zzc.m25834a(B, (IInterface) iObjectWrapper);
                mo30006b(27, B);
            }

            public final void startActivityForResult(Intent intent, int i) throws RemoteException {
                Parcel B = mo30003B();
                zzc.m25835a(B, (Parcelable) intent);
                B.writeInt(i);
                mo30006b(26, B);
            }

            /* renamed from: z */
            public final void mo25543z(IObjectWrapper iObjectWrapper) throws RemoteException {
                Parcel B = mo30003B();
                zzc.m25834a(B, (IInterface) iObjectWrapper);
                mo30006b(20, B);
            }

            /* renamed from: z0 */
            public final boolean mo25544z0() throws RemoteException {
                Parcel a = mo30004a(17, mo30003B());
                boolean a2 = zzc.m25837a(a);
                a.recycle();
                return a2;
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        /* renamed from: a */
        public static IFragmentWrapper m16365a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof IFragmentWrapper) {
                return (IFragmentWrapper) queryLocalInterface;
            }
            return new zza(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo25364a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    IObjectWrapper j0 = mo25537j0();
                    parcel2.writeNoException();
                    zzc.m25834a(parcel2, (IInterface) j0);
                    return true;
                case 3:
                    Bundle A = mo25519A();
                    parcel2.writeNoException();
                    zzc.m25838b(parcel2, A);
                    return true;
                case 4:
                    int id = getId();
                    parcel2.writeNoException();
                    parcel2.writeInt(id);
                    return true;
                case 5:
                    IFragmentWrapper p0 = mo25540p0();
                    parcel2.writeNoException();
                    zzc.m25834a(parcel2, (IInterface) p0);
                    return true;
                case 6:
                    IObjectWrapper P = mo25524P();
                    parcel2.writeNoException();
                    zzc.m25834a(parcel2, (IInterface) P);
                    return true;
                case 7:
                    boolean X = mo25527X();
                    parcel2.writeNoException();
                    zzc.m25836a(parcel2, X);
                    return true;
                case 8:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 9:
                    IFragmentWrapper a0 = mo25529a0();
                    parcel2.writeNoException();
                    zzc.m25834a(parcel2, (IInterface) a0);
                    return true;
                case 10:
                    int W0 = mo25526W0();
                    parcel2.writeNoException();
                    parcel2.writeInt(W0);
                    return true;
                case 11:
                    boolean L = mo25523L();
                    parcel2.writeNoException();
                    zzc.m25836a(parcel2, L);
                    return true;
                case 12:
                    IObjectWrapper e1 = mo25533e1();
                    parcel2.writeNoException();
                    zzc.m25834a(parcel2, (IInterface) e1);
                    return true;
                case 13:
                    boolean C0 = mo25521C0();
                    parcel2.writeNoException();
                    zzc.m25836a(parcel2, C0);
                    return true;
                case 14:
                    boolean S = mo25525S();
                    parcel2.writeNoException();
                    zzc.m25836a(parcel2, S);
                    return true;
                case 15:
                    boolean G = mo25522G();
                    parcel2.writeNoException();
                    zzc.m25836a(parcel2, G);
                    return true;
                case 16:
                    boolean o0 = mo25539o0();
                    parcel2.writeNoException();
                    zzc.m25836a(parcel2, o0);
                    return true;
                case 17:
                    boolean z0 = mo25544z0();
                    parcel2.writeNoException();
                    zzc.m25836a(parcel2, z0);
                    return true;
                case 18:
                    boolean A0 = mo25520A0();
                    parcel2.writeNoException();
                    zzc.m25836a(parcel2, A0);
                    return true;
                case 19:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    zzc.m25836a(parcel2, isVisible);
                    return true;
                case 20:
                    mo25543z(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    mo25530c(zzc.m25837a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    mo25532e(zzc.m25837a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    mo25538m(zzc.m25837a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    mo25531d(zzc.m25837a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    mo25528a((Intent) zzc.m25833a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    startActivityForResult((Intent) zzc.m25833a(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    mo25541s(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }
}
