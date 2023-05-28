package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.y2 */
final class C8367y2 {

    /* renamed from: a */
    private static final Logger f23388a = Logger.getLogger(C8367y2.class.getName());

    /* renamed from: b */
    private static final Unsafe f23389b = m26313d();

    /* renamed from: c */
    private static final Class<?> f23390c = C8281f0.m25932b();

    /* renamed from: d */
    private static final boolean f23391d = m26316d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f23392e = m26316d(Integer.TYPE);

    /* renamed from: f */
    private static final C8371d f23393f;

    /* renamed from: g */
    private static final boolean f23394g = m26321f();

    /* renamed from: h */
    private static final boolean f23395h = m26319e();

    /* renamed from: i */
    private static final long f23396i = ((long) m26302b(byte[].class));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final boolean f23397j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.measurement.y2$c */
    static final class C8370c extends C8371d {
        C8370c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo30271a(Object obj, long j, byte b) {
            this.f23398a.putByte(obj, j, b);
        }

        /* renamed from: c */
        public final boolean mo30275c(Object obj, long j) {
            return this.f23398a.getBoolean(obj, j);
        }

        /* renamed from: d */
        public final float mo30276d(Object obj, long j) {
            return this.f23398a.getFloat(obj, j);
        }

        /* renamed from: e */
        public final double mo30277e(Object obj, long j) {
            return this.f23398a.getDouble(obj, j);
        }

        /* renamed from: f */
        public final byte mo30278f(Object obj, long j) {
            return this.f23398a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo30274a(Object obj, long j, boolean z) {
            this.f23398a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public final void mo30273a(Object obj, long j, float f) {
            this.f23398a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo30272a(Object obj, long j, double d) {
            this.f23398a.putDouble(obj, j, d);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.y2$d */
    static abstract class C8371d {

        /* renamed from: a */
        Unsafe f23398a;

        C8371d(Unsafe unsafe) {
            this.f23398a = unsafe;
        }

        /* renamed from: a */
        public final int mo30279a(Object obj, long j) {
            return this.f23398a.getInt(obj, j);
        }

        /* renamed from: a */
        public abstract void mo30271a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo30272a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo30273a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo30274a(Object obj, long j, boolean z);

        /* renamed from: b */
        public final long mo30282b(Object obj, long j) {
            return this.f23398a.getLong(obj, j);
        }

        /* renamed from: c */
        public abstract boolean mo30275c(Object obj, long j);

        /* renamed from: d */
        public abstract float mo30276d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo30277e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo30278f(Object obj, long j);

        /* renamed from: a */
        public final void mo30280a(Object obj, long j, int i) {
            this.f23398a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo30281a(Object obj, long j, long j2) {
            this.f23398a.putLong(obj, j, j2);
        }
    }

    static {
        C8371d dVar;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        C8371d dVar2 = null;
        if (f23389b != null) {
            if (!C8281f0.m25931a()) {
                dVar2 = new C8370c(f23389b);
            } else if (f23391d) {
                dVar2 = new C8369b(f23389b);
            } else if (f23392e) {
                dVar2 = new C8368a(f23389b);
            }
        }
        f23393f = dVar2;
        m26302b(cls6);
        m26307c(cls6);
        m26302b(cls5);
        m26307c(cls5);
        m26302b(cls4);
        m26307c(cls4);
        m26302b(cls3);
        m26307c(cls3);
        m26302b(cls2);
        m26307c(cls2);
        m26302b(cls);
        m26307c(cls);
        Field g = m26323g();
        if (!(g == null || (dVar = f23393f) == null)) {
            dVar.f23398a.objectFieldOffset(g);
        }
    }

    private C8367y2() {
    }

    /* renamed from: a */
    static <T> T m26291a(Class<T> cls) {
        try {
            return f23389b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    static boolean m26306b() {
        return f23395h;
    }

    /* renamed from: c */
    static boolean m26310c() {
        return f23394g;
    }

    /* renamed from: d */
    static float m26312d(Object obj, long j) {
        return f23393f.mo30276d(obj, j);
    }

    /* renamed from: e */
    static double m26317e(Object obj, long j) {
        return f23393f.mo30277e(obj, j);
    }

    /* renamed from: f */
    static Object m26320f(Object obj, long j) {
        return f23393f.f23398a.getObject(obj, j);
    }

    /* renamed from: g */
    private static Field m26323g() {
        Field a;
        if (C8281f0.m25931a() && (a = m26292a((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return a;
        }
        Field a2 = m26292a((Class<?>) Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static byte m26324h(Object obj, long j) {
        return (byte) (m26290a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m26325i(Object obj, long j) {
        return m26322g(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m26326j(Object obj, long j) {
        return m26324h(obj, j) != 0;
    }

    /* renamed from: b */
    private static int m26302b(Class<?> cls) {
        if (f23395h) {
            return f23393f.f23398a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m26307c(Class<?> cls) {
        if (f23395h) {
            return f23393f.f23398a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: d */
    static Unsafe m26313d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C8375z2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m26319e() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f23389b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (C8281f0.m25931a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f23388a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.y2$a */
    static final class C8368a extends C8371d {
        C8368a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo30271a(Object obj, long j, byte b) {
            if (C8367y2.f23397j) {
                C8367y2.m26293a(obj, j, b);
            } else {
                C8367y2.m26304b(obj, j, b);
            }
        }

        /* renamed from: c */
        public final boolean mo30275c(Object obj, long j) {
            if (C8367y2.f23397j) {
                return C8367y2.m26325i(obj, j);
            }
            return C8367y2.m26326j(obj, j);
        }

        /* renamed from: d */
        public final float mo30276d(Object obj, long j) {
            return Float.intBitsToFloat(mo30279a(obj, j));
        }

        /* renamed from: e */
        public final double mo30277e(Object obj, long j) {
            return Double.longBitsToDouble(mo30282b(obj, j));
        }

        /* renamed from: f */
        public final byte mo30278f(Object obj, long j) {
            if (C8367y2.f23397j) {
                return C8367y2.m26322g(obj, j);
            }
            return C8367y2.m26324h(obj, j);
        }

        /* renamed from: a */
        public final void mo30274a(Object obj, long j, boolean z) {
            if (C8367y2.f23397j) {
                C8367y2.m26305b(obj, j, z);
            } else {
                C8367y2.m26309c(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo30273a(Object obj, long j, float f) {
            mo30280a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo30272a(Object obj, long j, double d) {
            mo30281a(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.y2$b */
    static final class C8369b extends C8371d {
        C8369b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo30271a(Object obj, long j, byte b) {
            if (C8367y2.f23397j) {
                C8367y2.m26293a(obj, j, b);
            } else {
                C8367y2.m26304b(obj, j, b);
            }
        }

        /* renamed from: c */
        public final boolean mo30275c(Object obj, long j) {
            if (C8367y2.f23397j) {
                return C8367y2.m26325i(obj, j);
            }
            return C8367y2.m26326j(obj, j);
        }

        /* renamed from: d */
        public final float mo30276d(Object obj, long j) {
            return Float.intBitsToFloat(mo30279a(obj, j));
        }

        /* renamed from: e */
        public final double mo30277e(Object obj, long j) {
            return Double.longBitsToDouble(mo30282b(obj, j));
        }

        /* renamed from: f */
        public final byte mo30278f(Object obj, long j) {
            if (C8367y2.f23397j) {
                return C8367y2.m26322g(obj, j);
            }
            return C8367y2.m26324h(obj, j);
        }

        /* renamed from: a */
        public final void mo30274a(Object obj, long j, boolean z) {
            if (C8367y2.f23397j) {
                C8367y2.m26305b(obj, j, z);
            } else {
                C8367y2.m26309c(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo30273a(Object obj, long j, float f) {
            mo30280a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo30272a(Object obj, long j, double d) {
            mo30281a(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: a */
    static int m26290a(Object obj, long j) {
        return f23393f.mo30279a(obj, j);
    }

    /* renamed from: f */
    private static boolean m26321f() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f23389b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (m26323g() == null) {
                return false;
            }
            if (C8281f0.m25931a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f23388a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: a */
    static void m26296a(Object obj, long j, int i) {
        f23393f.mo30280a(obj, j, i);
    }

    /* renamed from: b */
    static long m26303b(Object obj, long j) {
        return f23393f.mo30282b(obj, j);
    }

    /* renamed from: c */
    static boolean m26311c(Object obj, long j) {
        return f23393f.mo30275c(obj, j);
    }

    /* renamed from: d */
    private static boolean m26316d(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C8281f0.m25931a()) {
            return false;
        }
        try {
            Class<?> cls3 = f23390c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    static void m26297a(Object obj, long j, long j2) {
        f23393f.mo30281a(obj, j, j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m26304b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m26296a(obj, j2, ((255 & b) << i) | (m26290a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m26309c(Object obj, long j, boolean z) {
        m26304b(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static byte m26322g(Object obj, long j) {
        return (byte) (m26290a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* renamed from: a */
    static void m26299a(Object obj, long j, boolean z) {
        f23393f.mo30274a(obj, j, z);
    }

    /* renamed from: a */
    static void m26295a(Object obj, long j, float f) {
        f23393f.mo30273a(obj, j, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m26305b(Object obj, long j, boolean z) {
        m26293a(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    static void m26294a(Object obj, long j, double d) {
        f23393f.mo30272a(obj, j, d);
    }

    /* renamed from: a */
    static void m26298a(Object obj, long j, Object obj2) {
        f23393f.f23398a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m26289a(byte[] bArr, long j) {
        return f23393f.mo30278f(bArr, f23396i + j);
    }

    /* renamed from: a */
    static void m26300a(byte[] bArr, long j, byte b) {
        f23393f.mo30271a((Object) bArr, f23396i + j, b);
    }

    /* renamed from: a */
    private static Field m26292a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m26293a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m26296a(obj, j2, ((255 & b) << i) | (m26290a(obj, j2) & ((255 << i) ^ -1)));
    }
}
