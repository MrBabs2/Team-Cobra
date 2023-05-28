package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.ix */
final class C7596ix {

    /* renamed from: a */
    private static final Logger f15686a = Logger.getLogger(C7596ix.class.getName());

    /* renamed from: b */
    private static final Unsafe f15687b = m17227d();

    /* renamed from: c */
    private static final Class<?> f15688c = C8225zt.m18655b();

    /* renamed from: d */
    private static final boolean f15689d = m17230d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f15690e = m17230d(Integer.TYPE);

    /* renamed from: f */
    private static final C7600d f15691f;

    /* renamed from: g */
    private static final boolean f15692g = m17235f();

    /* renamed from: h */
    private static final boolean f15693h = m17233e();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f15694i = ((long) m17216b(byte[].class));

    /* renamed from: j */
    private static final long f15695j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final boolean f15696k = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.ads.ix$a */
    static final class C7597a extends C7600d {
        C7597a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo26090a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: c */
        public final boolean mo26096c(Object obj, long j) {
            if (C7596ix.f15696k) {
                return C7596ix.m17240i(obj, j);
            }
            return C7596ix.m17241j(obj, j);
        }

        /* renamed from: d */
        public final float mo26097d(Object obj, long j) {
            return Float.intBitsToFloat(mo26100a(obj, j));
        }

        /* renamed from: e */
        public final double mo26098e(Object obj, long j) {
            return Double.longBitsToDouble(mo26103b(obj, j));
        }

        /* renamed from: f */
        public final byte mo26099f(Object obj, long j) {
            if (C7596ix.f15696k) {
                return C7596ix.m17236g(obj, j);
            }
            return C7596ix.m17238h(obj, j);
        }

        /* renamed from: a */
        public final void mo26091a(Object obj, long j, byte b) {
            if (C7596ix.f15696k) {
                C7596ix.m17206a(obj, j, b);
            } else {
                C7596ix.m17218b(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo26094a(Object obj, long j, boolean z) {
            if (C7596ix.f15696k) {
                C7596ix.m17219b(obj, j, z);
            } else {
                C7596ix.m17223c(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo26093a(Object obj, long j, float f) {
            mo26101a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo26092a(Object obj, long j, double d) {
            mo26102a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo26095a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ix$b */
    static final class C7598b extends C7600d {
        C7598b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo26090a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: c */
        public final boolean mo26096c(Object obj, long j) {
            if (C7596ix.f15696k) {
                return C7596ix.m17240i(obj, j);
            }
            return C7596ix.m17241j(obj, j);
        }

        /* renamed from: d */
        public final float mo26097d(Object obj, long j) {
            return Float.intBitsToFloat(mo26100a(obj, j));
        }

        /* renamed from: e */
        public final double mo26098e(Object obj, long j) {
            return Double.longBitsToDouble(mo26103b(obj, j));
        }

        /* renamed from: f */
        public final byte mo26099f(Object obj, long j) {
            if (C7596ix.f15696k) {
                return C7596ix.m17236g(obj, j);
            }
            return C7596ix.m17238h(obj, j);
        }

        /* renamed from: a */
        public final void mo26091a(Object obj, long j, byte b) {
            if (C7596ix.f15696k) {
                C7596ix.m17206a(obj, j, b);
            } else {
                C7596ix.m17218b(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo26094a(Object obj, long j, boolean z) {
            if (C7596ix.f15696k) {
                C7596ix.m17219b(obj, j, z);
            } else {
                C7596ix.m17223c(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo26093a(Object obj, long j, float f) {
            mo26101a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo26092a(Object obj, long j, double d) {
            mo26102a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo26095a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ix$c */
    static final class C7599c extends C7600d {
        C7599c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo26090a(long j, byte b) {
            this.f15697a.putByte(j, b);
        }

        /* renamed from: c */
        public final boolean mo26096c(Object obj, long j) {
            return this.f15697a.getBoolean(obj, j);
        }

        /* renamed from: d */
        public final float mo26097d(Object obj, long j) {
            return this.f15697a.getFloat(obj, j);
        }

        /* renamed from: e */
        public final double mo26098e(Object obj, long j) {
            return this.f15697a.getDouble(obj, j);
        }

        /* renamed from: f */
        public final byte mo26099f(Object obj, long j) {
            return this.f15697a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo26091a(Object obj, long j, byte b) {
            this.f15697a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo26094a(Object obj, long j, boolean z) {
            this.f15697a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public final void mo26093a(Object obj, long j, float f) {
            this.f15697a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo26092a(Object obj, long j, double d) {
            this.f15697a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo26095a(byte[] bArr, long j, long j2, long j3) {
            this.f15697a.copyMemory(bArr, C7596ix.f15694i + j, (Object) null, j2, j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ix$d */
    static abstract class C7600d {

        /* renamed from: a */
        Unsafe f15697a;

        C7600d(Unsafe unsafe) {
            this.f15697a = unsafe;
        }

        /* renamed from: a */
        public final int mo26100a(Object obj, long j) {
            return this.f15697a.getInt(obj, j);
        }

        /* renamed from: a */
        public abstract void mo26090a(long j, byte b);

        /* renamed from: a */
        public abstract void mo26091a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo26092a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo26093a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo26094a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo26095a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public final long mo26103b(Object obj, long j) {
            return this.f15697a.getLong(obj, j);
        }

        /* renamed from: c */
        public abstract boolean mo26096c(Object obj, long j);

        /* renamed from: d */
        public abstract float mo26097d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo26098e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo26099f(Object obj, long j);

        /* renamed from: a */
        public final void mo26101a(Object obj, long j, int i) {
            this.f15697a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo26102a(Object obj, long j, long j2) {
            this.f15697a.putLong(obj, j, j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a0, code lost:
        r1 = f15691f;
     */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.ads.ix> r6 = com.google.android.gms.internal.ads.C7596ix.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            f15686a = r6
            sun.misc.Unsafe r6 = m17227d()
            f15687b = r6
            java.lang.Class r6 = com.google.android.gms.internal.ads.C8225zt.m18655b()
            f15688c = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = m17230d(r6)
            f15689d = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r6 = m17230d(r6)
            f15690e = r6
            sun.misc.Unsafe r6 = f15687b
            r7 = 0
            if (r6 != 0) goto L_0x003a
            goto L_0x005f
        L_0x003a:
            boolean r6 = com.google.android.gms.internal.ads.C8225zt.m18654a()
            if (r6 == 0) goto L_0x0058
            boolean r6 = f15689d
            if (r6 == 0) goto L_0x004c
            com.google.android.gms.internal.ads.ix$b r7 = new com.google.android.gms.internal.ads.ix$b
            sun.misc.Unsafe r6 = f15687b
            r7.<init>(r6)
            goto L_0x005f
        L_0x004c:
            boolean r6 = f15690e
            if (r6 == 0) goto L_0x005f
            com.google.android.gms.internal.ads.ix$a r7 = new com.google.android.gms.internal.ads.ix$a
            sun.misc.Unsafe r6 = f15687b
            r7.<init>(r6)
            goto L_0x005f
        L_0x0058:
            com.google.android.gms.internal.ads.ix$c r7 = new com.google.android.gms.internal.ads.ix$c
            sun.misc.Unsafe r6 = f15687b
            r7.<init>(r6)
        L_0x005f:
            f15691f = r7
            boolean r6 = m17235f()
            f15692g = r6
            boolean r6 = m17233e()
            f15693h = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m17216b(r6)
            long r6 = (long) r6
            f15694i = r6
            m17216b(r5)
            m17221c(r5)
            m17216b(r4)
            m17221c(r4)
            m17216b(r3)
            m17221c(r3)
            m17216b(r2)
            m17221c(r2)
            m17216b(r1)
            m17221c(r1)
            m17216b(r0)
            m17221c(r0)
            java.lang.reflect.Field r0 = m17237g()
            if (r0 == 0) goto L_0x00ac
            com.google.android.gms.internal.ads.ix$d r1 = f15691f
            if (r1 != 0) goto L_0x00a5
            goto L_0x00ac
        L_0x00a5:
            sun.misc.Unsafe r1 = r1.f15697a
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00ae
        L_0x00ac:
            r0 = -1
        L_0x00ae:
            f15695j = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00ba
            r0 = 1
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            f15696k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7596ix.<clinit>():void");
    }

    private C7596ix() {
    }

    /* renamed from: a */
    static <T> T m17203a(Class<T> cls) {
        try {
            return f15687b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    static boolean m17220b() {
        return f15693h;
    }

    /* renamed from: c */
    static boolean m17224c() {
        return f15692g;
    }

    /* renamed from: d */
    static float m17226d(Object obj, long j) {
        return f15691f.mo26097d(obj, j);
    }

    /* renamed from: e */
    static double m17231e(Object obj, long j) {
        return f15691f.mo26098e(obj, j);
    }

    /* renamed from: f */
    static Object m17234f(Object obj, long j) {
        return f15691f.f15697a.getObject(obj, j);
    }

    /* renamed from: g */
    private static Field m17237g() {
        Field a;
        if (C8225zt.m18654a() && (a = m17204a((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return a;
        }
        Field a2 = m17204a((Class<?>) Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static byte m17238h(Object obj, long j) {
        return (byte) (m17201a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m17240i(Object obj, long j) {
        return m17236g(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m17241j(Object obj, long j) {
        return m17238h(obj, j) != 0;
    }

    /* renamed from: b */
    private static int m17216b(Class<?> cls) {
        if (f15693h) {
            return f15691f.f15697a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m17221c(Class<?> cls) {
        if (f15693h) {
            return f15691f.f15697a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: d */
    static Unsafe m17227d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C7674kx());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m17233e() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f15687b;
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
            if (C8225zt.m18654a()) {
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
            Logger logger = f15686a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: a */
    static int m17201a(Object obj, long j) {
        return f15691f.mo26100a(obj, j);
    }

    /* renamed from: f */
    private static boolean m17235f() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f15687b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (m17237g() == null) {
                return false;
            }
            if (C8225zt.m18654a()) {
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
            Logger logger = f15686a;
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
    static void m17209a(Object obj, long j, int i) {
        f15691f.mo26101a(obj, j, i);
    }

    /* renamed from: b */
    static long m17217b(Object obj, long j) {
        return f15691f.mo26103b(obj, j);
    }

    /* renamed from: c */
    static boolean m17225c(Object obj, long j) {
        return f15691f.mo26096c(obj, j);
    }

    /* renamed from: d */
    private static boolean m17230d(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C8225zt.m18654a()) {
            return false;
        }
        try {
            Class<?> cls3 = f15688c;
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
    static void m17210a(Object obj, long j, long j2) {
        f15691f.mo26102a(obj, j, j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17218b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m17209a(obj, j2, ((255 & b) << i) | (m17201a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m17223c(Object obj, long j, boolean z) {
        m17218b(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static byte m17236g(Object obj, long j) {
        return (byte) (m17201a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* renamed from: a */
    static void m17212a(Object obj, long j, boolean z) {
        f15691f.mo26094a(obj, j, z);
    }

    /* renamed from: a */
    static void m17208a(Object obj, long j, float f) {
        f15691f.mo26093a(obj, j, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17219b(Object obj, long j, boolean z) {
        m17206a(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    static void m17207a(Object obj, long j, double d) {
        f15691f.mo26092a(obj, j, d);
    }

    /* renamed from: a */
    static void m17211a(Object obj, long j, Object obj2) {
        f15691f.f15697a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m17200a(byte[] bArr, long j) {
        return f15691f.mo26099f(bArr, f15694i + j);
    }

    /* renamed from: a */
    static void m17213a(byte[] bArr, long j, byte b) {
        f15691f.mo26091a((Object) bArr, f15694i + j, b);
    }

    /* renamed from: a */
    static void m17214a(byte[] bArr, long j, long j2, long j3) {
        f15691f.mo26095a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static void m17205a(long j, byte b) {
        f15691f.mo26090a(j, b);
    }

    /* renamed from: a */
    static long m17202a(ByteBuffer byteBuffer) {
        return f15691f.mo26103b(byteBuffer, f15695j);
    }

    /* renamed from: a */
    private static Field m17204a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m17206a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m17209a(obj, j2, ((255 & b) << i) | (m17201a(obj, j2) & ((255 << i) ^ -1)));
    }
}
