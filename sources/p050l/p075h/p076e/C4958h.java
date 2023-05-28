package p050l.p075h.p076e;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l.h.e.h */
/* compiled from: TypefaceCompatApi28Impl */
public class C4958h extends C4957g {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo17367a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f8765g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f8771m.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo17372d(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
