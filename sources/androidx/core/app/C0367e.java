package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.e */
/* compiled from: BundleCompat */
public final class C0367e {
    /* renamed from: a */
    public static IBinder m1796a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0368a.m1798a(bundle, str);
    }

    /* renamed from: a */
    public static void m1797a(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0368a.m1799a(bundle, str, iBinder);
        }
    }

    /* renamed from: androidx.core.app.e$a */
    /* compiled from: BundleCompat */
    static class C0368a {

        /* renamed from: a */
        private static Method f1667a;

        /* renamed from: b */
        private static boolean f1668b;

        /* renamed from: c */
        private static Method f1669c;

        /* renamed from: d */
        private static boolean f1670d;

        /* renamed from: a */
        public static IBinder m1798a(Bundle bundle, String str) {
            if (!f1668b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1667a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f1668b = true;
            }
            Method method2 = f1667a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f1667a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m1799a(Bundle bundle, String str, IBinder iBinder) {
            if (!f1670d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f1669c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f1670d = true;
            }
            Method method2 = f1669c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f1669c = null;
                }
            }
        }
    }
}
