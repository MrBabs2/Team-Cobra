package p050l.p075h.p076e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p003c.C0398c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p050l.p066e.C4881g;
import p050l.p075h.p081i.C4971b;

/* renamed from: l.h.e.f */
/* compiled from: TypefaceCompatApi24Impl */
class C4956f extends C4960j {

    /* renamed from: b */
    private static final Class<?> f8761b;

    /* renamed from: c */
    private static final Constructor<?> f8762c;

    /* renamed from: d */
    private static final Method f8763d;

    /* renamed from: e */
    private static final Method f8764e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f8762c = constructor;
        f8761b = cls;
        f8763d = method;
        f8764e = method2;
    }

    C4956f() {
    }

    /* renamed from: a */
    public static boolean m8742a() {
        if (f8763d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f8763d != null;
    }

    /* renamed from: b */
    private static Object m8744b() {
        try {
            return f8762c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m8743a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f8763d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Typeface m8741a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f8761b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f8764e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo17364a(Context context, CancellationSignal cancellationSignal, C4971b.C4977f[] fVarArr, int i) {
        Object b = m8744b();
        if (b == null) {
            return null;
        }
        C4881g gVar = new C4881g();
        for (C4971b.C4977f fVar : fVarArr) {
            Uri c = fVar.mo17401c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C4964k.m8793a(context, cancellationSignal, c);
                gVar.put(c, byteBuffer);
            }
            if (byteBuffer == null || !m8743a(b, byteBuffer, fVar.mo17400b(), fVar.mo17402d(), fVar.mo17403e())) {
                return null;
            }
        }
        Typeface a = m8741a(b);
        if (a == null) {
            return null;
        }
        return Typeface.create(a, i);
    }

    /* renamed from: a */
    public Typeface mo17365a(Context context, C0398c.C0400b bVar, Resources resources, int i) {
        Object b = m8744b();
        if (b == null) {
            return null;
        }
        for (C0398c.C0401c cVar : bVar.mo2305a()) {
            ByteBuffer a = C4964k.m8792a(context, resources, cVar.mo2307b());
            if (a == null || !m8743a(b, a, cVar.mo2308c(), cVar.mo2310e(), cVar.mo2311f())) {
                return null;
            }
        }
        return m8741a(b);
    }
}
