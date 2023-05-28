package p123rx.p401n.p406e.p408o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: rx.n.e.o.z */
/* compiled from: UnsafeAccess */
public final class C12828z {

    /* renamed from: a */
    public static final Unsafe f33043a;

    /* renamed from: b */
    private static final boolean f33044b = (System.getProperty("rx.unsafe-disable") != null);

    static {
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get((Object) null);
        } catch (Throwable unused) {
        }
        f33043a = unsafe;
    }

    /* renamed from: a */
    public static boolean m41379a() {
        return f33043a != null && !f33044b;
    }

    /* renamed from: a */
    public static long m41378a(Class<?> cls, String str) {
        try {
            return f33043a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            InternalError internalError = new InternalError();
            internalError.initCause(e);
            throw internalError;
        }
    }
}
