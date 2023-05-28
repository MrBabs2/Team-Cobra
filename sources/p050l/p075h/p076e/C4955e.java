package p050l.p075h.p076e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p003c.C0398c;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l.h.e.e */
/* compiled from: TypefaceCompatApi21Impl */
class C4955e extends C4960j {

    /* renamed from: b */
    private static Class<?> f8756b = null;

    /* renamed from: c */
    private static Constructor<?> f8757c = null;

    /* renamed from: d */
    private static Method f8758d = null;

    /* renamed from: e */
    private static Method f8759e = null;

    /* renamed from: f */
    private static boolean f8760f = false;

    C4955e() {
    }

    /* renamed from: a */
    private static void mo17368a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f8760f) {
            f8760f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f8757c = constructor;
            f8756b = cls;
            f8758d = method;
            f8759e = method2;
        }
    }

    /* renamed from: b */
    private static Object m8738b() {
        mo17368a();
        try {
            return f8757c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private File m8735a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static Typeface mo17367a(Object obj) {
        mo17368a();
        try {
            Object newInstance = Array.newInstance(f8756b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f8759e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m8737a(Object obj, String str, int i, boolean z) {
        mo17368a();
        try {
            return ((Boolean) f8758d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0058 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo17364a(android.content.Context r4, android.os.CancellationSignal r5, p050l.p075h.p081i.C4971b.C4977f[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            l.h.i.b$f r6 = r3.mo17376a((p050l.p075h.p081i.C4971b.C4977f[]) r6, (int) r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.mo17401c()     // Catch:{ IOException -> 0x0059 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0059 }
            if (r5 != 0) goto L_0x0020
            if (r5 == 0) goto L_0x001f
            r5.close()     // Catch:{ IOException -> 0x0059 }
        L_0x001f:
            return r1
        L_0x0020:
            java.io.File r6 = r3.m8735a((android.os.ParcelFileDescriptor) r5)     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0037
            boolean r7 = r6.canRead()     // Catch:{ all -> 0x0052 }
            if (r7 != 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x0036
            r5.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0036:
            return r4
        L_0x0037:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0052 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0052 }
            r6.<init>(r7)     // Catch:{ all -> 0x0052 }
            android.graphics.Typeface r4 = super.mo17375a((android.content.Context) r4, (java.io.InputStream) r6)     // Catch:{ all -> 0x004d }
            r6.close()     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x004c
            r5.close()     // Catch:{ IOException -> 0x0059 }
        L_0x004c:
            return r4
        L_0x004d:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r4     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r4 = move-exception
            if (r5 == 0) goto L_0x0058
            r5.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p076e.C4955e.mo17364a(android.content.Context, android.os.CancellationSignal, l.h.i.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo17365a(Context context, C0398c.C0400b bVar, Resources resources, int i) {
        Object b = m8738b();
        C0398c.C0401c[] a = bVar.mo2305a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0398c.C0401c cVar = a[i2];
            File a2 = C4964k.m8791a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!C4964k.m8796a(a2, resources, cVar.mo2307b())) {
                    a2.delete();
                    return null;
                } else if (!m8737a(b, a2.getPath(), cVar.mo2310e(), cVar.mo2311f())) {
                    return null;
                } else {
                    a2.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a2.delete();
            }
        }
        return mo17367a(b);
    }
}
