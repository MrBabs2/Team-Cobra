package p050l.p075h.p076e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import androidx.core.content.p003c.C0398c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: l.h.e.g */
/* compiled from: TypefaceCompatApi26Impl */
public class C4957g extends C4955e {

    /* renamed from: g */
    protected final Class<?> f8765g;

    /* renamed from: h */
    protected final Constructor<?> f8766h;

    /* renamed from: i */
    protected final Method f8767i;

    /* renamed from: j */
    protected final Method f8768j;

    /* renamed from: k */
    protected final Method f8769k;

    /* renamed from: l */
    protected final Method f8770l;

    /* renamed from: m */
    protected final Method f8771m;

    public C4957g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> a = mo17368a();
            constructor = mo17373e(a);
            method4 = mo17370b(a);
            method3 = mo17371c(a);
            method2 = mo17374f(a);
            method = mo17369a(a);
            Class<?> cls2 = a;
            method5 = mo17372d(a);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f8765g = cls;
        this.f8766h = constructor;
        this.f8767i = method4;
        this.f8768j = method3;
        this.f8769k = method2;
        this.f8770l = method;
        this.f8771m = method5;
    }

    /* renamed from: a */
    private boolean m8747a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f8767i.invoke(obj, new Object[]{context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m8750b() {
        if (this.f8767i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f8767i != null;
    }

    /* renamed from: c */
    private Object m8751c() {
        try {
            return this.f8766h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo17372d(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Constructor<?> mo17373e(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo17374f(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: c */
    private boolean m8752c(Object obj) {
        try {
            return ((Boolean) this.f8769k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo17371c(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: b */
    private void m8749b(Object obj) {
        try {
            this.f8770l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: a */
    private boolean m8748a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f8768j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo17370b(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo17367a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f8765g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f8771m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo17365a(Context context, C0398c.C0400b bVar, Resources resources, int i) {
        if (!m8750b()) {
            return super.mo17365a(context, bVar, resources, i);
        }
        Object c = m8751c();
        if (c == null) {
            return null;
        }
        for (C0398c.C0401c cVar : bVar.mo2305a()) {
            if (!m8747a(context, c, cVar.mo2306a(), cVar.mo2308c(), cVar.mo2310e(), cVar.mo2311f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo2309d()))) {
                m8749b(c);
                return null;
            }
        }
        if (!m8752c(c)) {
            return null;
        }
        return mo17367a(c);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo17364a(android.content.Context r11, android.os.CancellationSignal r12, p050l.p075h.p081i.C4971b.C4977f[] r13, int r14) {
        /*
            r10 = this;
            int r0 = r13.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r10.m8750b()
            if (r0 != 0) goto L_0x0051
            l.h.i.b$f r13 = r10.mo17376a((p050l.p075h.p081i.C4971b.C4977f[]) r13, (int) r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.mo17401c()     // Catch:{ IOException -> 0x0050 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch:{ IOException -> 0x0050 }
            if (r11 != 0) goto L_0x0026
            if (r11 == 0) goto L_0x0025
            r11.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r12.<init>(r14)     // Catch:{ all -> 0x0049 }
            int r14 = r13.mo17402d()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch:{ all -> 0x0049 }
            boolean r13 = r13.mo17403e()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r12 = r12.build()     // Catch:{ all -> 0x0049 }
            if (r11 == 0) goto L_0x0048
            r11.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0048:
            return r12
        L_0x0049:
            r12 = move-exception
            if (r11 == 0) goto L_0x004f
            r11.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r12     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            return r2
        L_0x0051:
            java.util.Map r11 = p050l.p075h.p081i.C4971b.m8813a((android.content.Context) r11, (p050l.p075h.p081i.C4971b.C4977f[]) r13, (android.os.CancellationSignal) r12)
            java.lang.Object r12 = r10.m8751c()
            if (r12 != 0) goto L_0x005c
            return r2
        L_0x005c:
            int r0 = r13.length
            r3 = 0
            r9 = 0
        L_0x005f:
            if (r9 >= r0) goto L_0x008c
            r4 = r13[r9]
            android.net.Uri r5 = r4.mo17401c()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0070
            goto L_0x0089
        L_0x0070:
            int r6 = r4.mo17400b()
            int r7 = r4.mo17402d()
            boolean r8 = r4.mo17403e()
            r3 = r10
            r4 = r12
            boolean r3 = r3.m8748a((java.lang.Object) r4, (java.nio.ByteBuffer) r5, (int) r6, (int) r7, (int) r8)
            if (r3 != 0) goto L_0x0088
            r10.m8749b((java.lang.Object) r12)
            return r2
        L_0x0088:
            r3 = 1
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x005f
        L_0x008c:
            if (r3 != 0) goto L_0x0092
            r10.m8749b((java.lang.Object) r12)
            return r2
        L_0x0092:
            boolean r11 = r10.m8752c((java.lang.Object) r12)
            if (r11 != 0) goto L_0x0099
            return r2
        L_0x0099:
            android.graphics.Typeface r11 = r10.mo17367a((java.lang.Object) r12)
            if (r11 != 0) goto L_0x00a0
            return r2
        L_0x00a0:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p076e.C4957g.mo17364a(android.content.Context, android.os.CancellationSignal, l.h.i.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo17366a(Context context, Resources resources, int i, String str, int i2) {
        if (!m8750b()) {
            return super.mo17366a(context, resources, i, str, i2);
        }
        Object c = m8751c();
        if (c == null) {
            return null;
        }
        if (!m8747a(context, c, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m8749b(c);
            return null;
        } else if (!m8752c(c)) {
            return null;
        } else {
            return mo17367a(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class<?> mo17368a() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo17369a(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }
}
