package androidx.core.content.p003c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p050l.p075h.p083k.C5008h;

/* renamed from: androidx.core.content.c.f */
/* compiled from: ResourcesCompat */
public final class C0406f {

    /* renamed from: androidx.core.content.c.f$b */
    /* compiled from: ResourcesCompat */
    public static final class C0410b {

        /* renamed from: androidx.core.content.c.f$b$a */
        /* compiled from: ResourcesCompat */
        static class C0411a {

            /* renamed from: a */
            private static final Object f1794a = new Object();

            /* renamed from: b */
            private static Method f1795b;

            /* renamed from: c */
            private static boolean f1796c;

            /* renamed from: a */
            static void m1974a(Resources.Theme theme) {
                synchronized (f1794a) {
                    if (!f1796c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f1795b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f1796c = true;
                    }
                    if (f1795b != null) {
                        try {
                            f1795b.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f1795b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.c.f$b$b */
        /* compiled from: ResourcesCompat */
        static class C0412b {
            /* renamed from: a */
            static void m1975a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m1973a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C0412b.m1975a(theme);
            } else if (i >= 23) {
                C0411a.m1974a(theme);
            }
        }
    }

    /* renamed from: a */
    public static Drawable m1967a(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: androidx.core.content.c.f$a */
    /* compiled from: ResourcesCompat */
    public static abstract class C0407a {

        /* renamed from: androidx.core.content.c.f$a$a */
        /* compiled from: ResourcesCompat */
        class C0408a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Typeface f1790f;

            C0408a(Typeface typeface) {
                this.f1790f = typeface;
            }

            public void run() {
                C0407a.this.mo1795a(this.f1790f);
            }
        }

        /* renamed from: androidx.core.content.c.f$a$b */
        /* compiled from: ResourcesCompat */
        class C0409b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f1792f;

            C0409b(int i) {
                this.f1792f = i;
            }

            public void run() {
                C0407a.this.mo1794a(this.f1792f);
            }
        }

        /* renamed from: a */
        public abstract void mo1794a(int i);

        /* renamed from: a */
        public abstract void mo1795a(Typeface typeface);

        /* renamed from: a */
        public final void mo2316a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0408a(typeface));
        }

        /* renamed from: a */
        public final void mo2315a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0409b(i));
        }
    }

    /* renamed from: a */
    public static Typeface m1963a(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m1965a(context, i, new TypedValue(), 0, (C0407a) null, (Handler) null, false);
    }

    /* renamed from: a */
    public static void m1968a(Context context, int i, C0407a aVar, Handler handler) throws Resources.NotFoundException {
        C5008h.m8899a(aVar);
        if (context.isRestricted()) {
            aVar.mo2315a(-4, handler);
            return;
        }
        m1965a(context, i, new TypedValue(), 0, aVar, handler, false);
    }

    /* renamed from: a */
    public static Typeface m1964a(Context context, int i, TypedValue typedValue, int i2, C0407a aVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m1965a(context, i, typedValue, i2, aVar, (Handler) null, true);
    }

    /* renamed from: a */
    private static Typeface m1965a(Context context, int i, TypedValue typedValue, int i2, C0407a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m1966a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m1966a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.p003c.C0406f.C0407a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00a7
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo2315a((int) r14, (android.os.Handler) r10)
        L_0x0025:
            return r13
        L_0x0026:
            android.graphics.Typeface r1 = p050l.p075h.p076e.C4954d.m8733b((android.content.res.Resources) r0, (int) r4, (int) r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo2316a((android.graphics.Typeface) r1, (android.os.Handler) r10)
        L_0x0031:
            return r1
        L_0x0032:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            androidx.core.content.c.c$a r2 = androidx.core.content.p003c.C0398c.m1939a((org.xmlpull.v1.XmlPullParser) r1, (android.content.res.Resources) r0)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0052
            r9.mo2315a((int) r14, (android.os.Handler) r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
        L_0x0052:
            return r13
        L_0x0053:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p050l.p075h.p076e.C4954d.m8730a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r15
            android.graphics.Typeface r0 = p050l.p075h.p076e.C4954d.m8727a(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.mo2316a((android.graphics.Typeface) r0, (android.os.Handler) r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.mo2315a((int) r14, (android.os.Handler) r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x00a1
        L_0x008c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x00a1:
            if (r9 == 0) goto L_0x00a6
            r9.mo2315a((int) r14, (android.os.Handler) r10)
        L_0x00a6:
            return r13
        L_0x00a7:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003c.C0406f.m1966a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.c.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
