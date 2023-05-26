package p112n.p312h.p313a.p318f0;

import android.util.Log;

/* renamed from: n.h.a.f0.d */
/* compiled from: FileDownloadLog */
public class C10767d {

    /* renamed from: a */
    public static boolean f28826a = false;

    /* renamed from: a */
    public static void m36491a(Object obj, Throwable th, String str, Object... objArr) {
        m36489a(6, obj, th, str, objArr);
    }

    /* renamed from: b */
    public static void m36492b(Object obj, String str, Object... objArr) {
        m36488a(6, obj, str, objArr);
    }

    /* renamed from: c */
    public static void m36493c(Object obj, String str, Object... objArr) {
        m36488a(4, obj, str, objArr);
    }

    /* renamed from: d */
    public static void m36494d(Object obj, String str, Object... objArr) {
        m36488a(2, obj, str, objArr);
    }

    /* renamed from: e */
    public static void m36495e(Object obj, String str, Object... objArr) {
        m36488a(5, obj, str, objArr);
    }

    /* renamed from: a */
    public static void m36490a(Object obj, String str, Object... objArr) {
        m36488a(3, obj, str, objArr);
    }

    /* renamed from: a */
    private static void m36488a(int i, Object obj, String str, Object... objArr) {
        m36489a(i, obj, (Throwable) null, str, objArr);
    }

    /* renamed from: a */
    private static void m36489a(int i, Object obj, Throwable th, String str, Object... objArr) {
        if ((i >= 5) || f28826a) {
            Log.println(i, m36487a(obj), C10771f.m36504a(str, objArr));
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static String m36487a(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("FileDownloader.");
        sb.append((obj instanceof Class ? (Class) obj : obj.getClass()).getSimpleName());
        return sb.toString();
    }
}
