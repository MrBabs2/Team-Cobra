package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C4716f;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.a */
/* compiled from: AttributionIdentifiers */
public class C6372a {

    /* renamed from: f */
    private static final String f11726f = "com.facebook.internal.a";

    /* renamed from: g */
    private static C6372a f11727g;

    /* renamed from: a */
    private String f11728a;

    /* renamed from: b */
    private String f11729b;

    /* renamed from: c */
    private String f11730c;

    /* renamed from: d */
    private boolean f11731d;

    /* renamed from: e */
    private long f11732e;

    /* renamed from: com.facebook.internal.a$b */
    /* compiled from: AttributionIdentifiers */
    private static final class C6374b implements IInterface {

        /* renamed from: f */
        private IBinder f11733f;

        C6374b(IBinder iBinder) {
            this.f11733f = iBinder;
        }

        /* renamed from: Z */
        public String mo20931Z() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f11733f.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f11733f;
        }

        /* renamed from: h0 */
        public boolean mo20933h0() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f11733f.transact(2, obtain, obtain2, 0);
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

    /* renamed from: com.facebook.internal.a$c */
    /* compiled from: AttributionIdentifiers */
    private static final class C6375c implements ServiceConnection {

        /* renamed from: f */
        private AtomicBoolean f11734f;

        /* renamed from: g */
        private final BlockingQueue<IBinder> f11735g;

        private C6375c() {
            this.f11734f = new AtomicBoolean(false);
            this.f11735g = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public IBinder mo20934a() throws InterruptedException {
            if (!this.f11734f.compareAndSet(true, true)) {
                return this.f11735g.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f11735g.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    private static C6372a m13211a(Context context) {
        C6372a b = m13213b(context);
        if (b != null) {
            return b;
        }
        C6372a c = m13214c(context);
        return c == null ? new C6372a() : c;
    }

    /* renamed from: b */
    private static C6372a m13213b(Context context) {
        Method a;
        Object a2;
        try {
            if (!m13217f(context) || (a = C6476x.m13492a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class})) == null || (a2 = C6476x.m13482a((Object) null, a, context)) == null) {
                return null;
            }
            Method a3 = C6476x.m13491a(a2.getClass(), "getId", (Class<?>[]) new Class[0]);
            Method a4 = C6476x.m13491a(a2.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
            if (a3 != null) {
                if (a4 != null) {
                    C6372a aVar = new C6372a();
                    aVar.f11729b = (String) C6476x.m13482a(a2, a3, new Object[0]);
                    aVar.f11731d = ((Boolean) C6476x.m13482a(a2, a4, new Object[0])).booleanValue();
                    return aVar;
                }
            }
            return null;
        } catch (Exception e) {
            C6476x.m13507a("android_id", e);
            return null;
        }
    }

    /* renamed from: c */
    private static C6372a m13214c(Context context) {
        C6375c cVar = new C6375c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, cVar, 1)) {
            try {
                C6374b bVar = new C6374b(cVar.mo20934a());
                C6372a aVar = new C6372a();
                aVar.f11729b = bVar.mo20931Z();
                aVar.f11731d = bVar.mo20933h0();
                return aVar;
            } catch (Exception e) {
                C6476x.m13507a("android_id", e);
            } finally {
                context.unbindService(cVar);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076 A[Catch:{ Exception -> 0x00e3, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a A[Catch:{ Exception -> 0x00e3, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e A[Catch:{ Exception -> 0x00e3, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0109  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.C6372a m13215d(android.content.Context r13) {
        /*
            java.lang.String r0 = "limit_tracking"
            java.lang.String r1 = "androidid"
            java.lang.String r2 = "aid"
            com.facebook.internal.a r3 = m13211a((android.content.Context) r13)
            r4 = 0
            android.os.Looper r5 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            if (r5 == r6) goto L_0x00d9
            com.facebook.internal.a r5 = f11727g     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            if (r5 == 0) goto L_0x002c
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            com.facebook.internal.a r7 = f11727g     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            long r7 = r7.f11732e     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            long r5 = r5 - r7
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x002c
            com.facebook.internal.a r13 = f11727g     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            return r13
        L_0x002c:
            r5 = 3
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            r5 = 0
            r8[r5] = r2     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            r6 = 1
            r8[r6] = r1     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            r6 = 2
            r8[r6] = r0     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            java.lang.String r7 = "com.facebook.katana.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r6 = r6.resolveContentProvider(r7, r5)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            android.content.pm.PackageManager r7 = r13.getPackageManager()     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            java.lang.String r9 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r5 = r7.resolveContentProvider(r9, r5)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r6 = r6.packageName     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            boolean r6 = com.facebook.internal.C6434i.m13332a(r13, r6)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r5 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
        L_0x005c:
            r7 = r5
            goto L_0x0070
        L_0x005e:
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = r5.packageName     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            boolean r5 = com.facebook.internal.C6434i.m13332a(r13, r5)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            goto L_0x005c
        L_0x006f:
            r7 = r4
        L_0x0070:
            java.lang.String r5 = m13216e(r13)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            if (r5 == 0) goto L_0x0078
            r3.f11730c = r5     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
        L_0x0078:
            if (r7 != 0) goto L_0x007e
            m13212a((com.facebook.internal.C6372a) r3)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            return r3
        L_0x007e:
            android.content.ContentResolver r6 = r13.getContentResolver()     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r13 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            if (r13 == 0) goto L_0x00c7
            boolean r5 = r13.moveToFirst()     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            if (r5 != 0) goto L_0x0092
            goto L_0x00c7
        L_0x0092:
            int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            int r0 = r13.getColumnIndex(r0)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            r3.f11728a = r2     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            if (r1 <= 0) goto L_0x00be
            if (r0 <= 0) goto L_0x00be
            java.lang.String r2 = r3.mo20927a()     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            if (r2 != 0) goto L_0x00be
            java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            r3.f11729b = r1     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            java.lang.String r0 = r13.getString(r0)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            r3.f11731d = r0     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
        L_0x00be:
            if (r13 == 0) goto L_0x00c3
            r13.close()
        L_0x00c3:
            m13212a((com.facebook.internal.C6372a) r3)
            return r3
        L_0x00c7:
            m13212a((com.facebook.internal.C6372a) r3)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            if (r13 == 0) goto L_0x00cf
            r13.close()
        L_0x00cf:
            return r3
        L_0x00d0:
            r0 = move-exception
            r4 = r13
            r13 = r0
            goto L_0x0107
        L_0x00d4:
            r0 = move-exception
            r12 = r0
            r0 = r13
            r13 = r12
            goto L_0x00e5
        L_0x00d9:
            com.facebook.FacebookException r13 = new com.facebook.FacebookException     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            java.lang.String r0 = "getAttributionIdentifiers cannot be called on the main thread."
            r13.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
            throw r13     // Catch:{ Exception -> 0x00e3, all -> 0x00e1 }
        L_0x00e1:
            r13 = move-exception
            goto L_0x0107
        L_0x00e3:
            r13 = move-exception
            r0 = r4
        L_0x00e5:
            java.lang.String r1 = f11726f     // Catch:{ all -> 0x0105 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0105 }
            r2.<init>()     // Catch:{ all -> 0x0105 }
            java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
            r2.append(r3)     // Catch:{ all -> 0x0105 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0105 }
            r2.append(r13)     // Catch:{ all -> 0x0105 }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x0105 }
            com.facebook.internal.C6476x.m13528c(r1, r13)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0104
            r0.close()
        L_0x0104:
            return r4
        L_0x0105:
            r13 = move-exception
            r4 = r0
        L_0x0107:
            if (r4 == 0) goto L_0x010c
            r4.close()
        L_0x010c:
            goto L_0x010e
        L_0x010d:
            throw r13
        L_0x010e:
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6372a.m13215d(android.content.Context):com.facebook.internal.a");
    }

    /* renamed from: e */
    private static String m13216e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    /* renamed from: f */
    private static boolean m13217f(Context context) {
        Method a = C6476x.m13492a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
        if (a == null) {
            return false;
        }
        Object a2 = C6476x.m13482a((Object) null, a, context);
        return (a2 instanceof Integer) && ((Integer) a2).intValue() == 0;
    }

    /* renamed from: g */
    public static boolean m13218g(Context context) {
        C6372a d = m13215d(context);
        return d != null && d.mo20930d();
    }

    /* renamed from: a */
    private static C6372a m13212a(C6372a aVar) {
        aVar.f11732e = System.currentTimeMillis();
        f11727g = aVar;
        return aVar;
    }

    /* renamed from: a */
    public String mo20927a() {
        if (!C4716f.m7713v() || !C4716f.m7695d()) {
            return null;
        }
        return this.f11729b;
    }

    /* renamed from: b */
    public String mo20928b() {
        return this.f11730c;
    }

    /* renamed from: c */
    public String mo20929c() {
        return this.f11728a;
    }

    /* renamed from: d */
    public boolean mo20930d() {
        return this.f11731d;
    }
}
