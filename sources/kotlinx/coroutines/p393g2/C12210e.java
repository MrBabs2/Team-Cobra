package kotlinx.coroutines.p393g2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.C9100a;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002\u001a1\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00072\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0006H\b\u001a!\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00052\u0006\u0010\u0011\u001a\u0002H\u0010H\u0000¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\b\b\u0002\u0010\u0014\u001a\u00020\tH\u0010\u001a\u0018\u0010\u0015\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0016\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"4\u0010\u0002\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00070\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00062\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006¨\u0006\u0018"}, mo16641d2 = {"cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "throwableFields", "", "createConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", "E", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.g2.e */
/* compiled from: ExceptionsConstuctor.kt */
public final class C12210e {

    /* renamed from: a */
    private static final int f31976a = m40262b(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f31977b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, C9113l<Throwable, Throwable>> f31978c = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.g2.e$a */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C12211a extends C10203k implements C9113l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f31979f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12211a(Constructor constructor) {
            super(1);
            this.f31979f = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10222o.C10223a aVar = C10222o.f27863f;
                Object newInstance = this.f31979f.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C10222o.m34210a(obj);
                    if (C10222o.m34212c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C10222o.C10223a aVar2 = C10222o.f27863f;
                obj = C10225p.m34213a(th2);
                C10222o.m34210a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.g2.e$b */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C12212b extends C10203k implements C9113l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f31980f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12212b(Constructor constructor) {
            super(1);
            this.f31980f = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10222o.C10223a aVar = C10222o.f27863f;
                Object newInstance = this.f31980f.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C10222o.m34210a(obj);
                    if (C10222o.m34212c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C10222o.C10223a aVar2 = C10222o.f27863f;
                obj = C10225p.m34213a(th2);
                C10222o.m34210a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.g2.e$c */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C12213c extends C10203k implements C9113l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f31981f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12213c(Constructor constructor) {
            super(1);
            this.f31981f = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Throwable th2;
            try {
                C10222o.C10223a aVar = C10222o.f27863f;
                Object newInstance = this.f31981f.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    C10222o.m34210a(th3);
                    th2 = th3;
                    boolean c = C10222o.m34212c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                C10222o.C10223a aVar2 = C10222o.f27863f;
                Object a = C10225p.m34213a(th5);
                C10222o.m34210a(a);
                th2 = a;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.g2.e$d */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C12214d extends C10203k implements C9113l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f31982f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12214d(Constructor constructor) {
            super(1);
            this.f31982f = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Throwable th2;
            try {
                C10222o.C10223a aVar = C10222o.f27863f;
                Object newInstance = this.f31982f.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    C10222o.m34210a(th3);
                    th2 = th3;
                    boolean c = C10222o.m34212c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                C10222o.C10223a aVar2 = C10222o.f27863f;
                Object a = C10225p.m34213a(th5);
                C10222o.m34210a(a);
                th2 = a;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.g2.e$e */
    /* compiled from: Comparisons.kt */
    public static final class C12215e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C10546b.m35832a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.g2.e$f */
    /* compiled from: ExceptionsConstuctor.kt */
    static final class C12216f extends C10203k implements C9113l {

        /* renamed from: f */
        public static final C12216f f31983f = new C12216f();

        C12216f() {
            super(1);
        }

        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.g2.e$g */
    /* compiled from: ExceptionsConstuctor.kt */
    static final class C12217g extends C10203k implements C9113l {

        /* renamed from: f */
        public static final C12217g f31984f = new C12217g();

        C12217g() {
            super(1);
        }

        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public static final <E extends java.lang.Throwable> E m40260a(E r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.C12318w
            r1 = 0
            if (r0 == 0) goto L_0x0026
            kotlin.o$a r0 = kotlin.C10222o.f27863f     // Catch:{ all -> 0x0011 }
            kotlinx.coroutines.w r9 = (kotlinx.coroutines.C12318w) r9     // Catch:{ all -> 0x0011 }
            java.lang.Throwable r9 = r9.mo38805a()     // Catch:{ all -> 0x0011 }
            kotlin.C10222o.m34210a(r9)     // Catch:{ all -> 0x0011 }
            goto L_0x001b
        L_0x0011:
            r9 = move-exception
            kotlin.o$a r0 = kotlin.C10222o.f27863f
            java.lang.Object r9 = kotlin.C10225p.m34213a((java.lang.Throwable) r9)
            kotlin.C10222o.m34210a(r9)
        L_0x001b:
            boolean r0 = kotlin.C10222o.m34212c(r9)
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r9
        L_0x0023:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x0026:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f31977b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.c0.c.l<java.lang.Throwable, java.lang.Throwable>> r2 = f31978c     // Catch:{ all -> 0x0119 }
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x0119 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0119 }
            kotlin.c0.c.l r2 = (kotlin.p215c0.p216c.C9113l) r2     // Catch:{ all -> 0x0119 }
            r0.unlock()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r9 = r2.invoke(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x0047:
            int r0 = f31976a
            java.lang.Class r2 = r9.getClass()
            r3 = 0
            int r2 = m40262b(r2, r3)
            if (r0 == r2) goto L_0x009c
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f31977b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r4 = r0.getWriteHoldCount()
            if (r4 != 0) goto L_0x0065
            int r4 = r0.getReadHoldCount()
            goto L_0x0066
        L_0x0065:
            r4 = 0
        L_0x0066:
            r5 = 0
        L_0x0067:
            if (r5 >= r4) goto L_0x006f
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x0067
        L_0x006f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.c0.c.l<java.lang.Throwable, java.lang.Throwable>> r5 = f31978c     // Catch:{ all -> 0x008f }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x008f }
            kotlinx.coroutines.g2.e$f r6 = kotlinx.coroutines.p393g2.C12210e.C12216f.f31983f     // Catch:{ all -> 0x008f }
            r5.put(r9, r6)     // Catch:{ all -> 0x008f }
            kotlin.v r9 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x008f }
        L_0x0083:
            if (r3 >= r4) goto L_0x008b
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0083
        L_0x008b:
            r0.unlock()
            return r1
        L_0x008f:
            r9 = move-exception
        L_0x0090:
            if (r3 >= r4) goto L_0x0098
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0090
        L_0x0098:
            r0.unlock()
            throw r9
        L_0x009c:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            kotlinx.coroutines.g2.e$e r2 = new kotlinx.coroutines.g2.e$e
            r2.<init>()
            java.util.List r0 = kotlin.p262y.C10519k.m35642c((T[]) r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00b2:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00c4
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            kotlin.c0.c.l r2 = m40261a((java.lang.reflect.Constructor<?>) r2)
            if (r2 == 0) goto L_0x00b2
        L_0x00c4:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f31977b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00d5
            int r5 = r0.getReadHoldCount()
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            if (r6 >= r5) goto L_0x00df
            r4.unlock()
            int r6 = r6 + 1
            goto L_0x00d7
        L_0x00df:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.c0.c.l<java.lang.Throwable, java.lang.Throwable>> r6 = f31978c     // Catch:{ all -> 0x010c }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x010c }
            if (r2 == 0) goto L_0x00f0
            r8 = r2
            goto L_0x00f2
        L_0x00f0:
            kotlinx.coroutines.g2.e$g r8 = kotlinx.coroutines.p393g2.C12210e.C12217g.f31984f     // Catch:{ all -> 0x010c }
        L_0x00f2:
            r6.put(r7, r8)     // Catch:{ all -> 0x010c }
            kotlin.v r6 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x010c }
        L_0x00f7:
            if (r3 >= r5) goto L_0x00ff
            r4.lock()
            int r3 = r3 + 1
            goto L_0x00f7
        L_0x00ff:
            r0.unlock()
            if (r2 == 0) goto L_0x010b
            java.lang.Object r9 = r2.invoke(r9)
            r1 = r9
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x010b:
            return r1
        L_0x010c:
            r9 = move-exception
        L_0x010d:
            if (r3 >= r5) goto L_0x0115
            r4.lock()
            int r3 = r3 + 1
            goto L_0x010d
        L_0x0115:
            r0.unlock()
            throw r9
        L_0x0119:
            r9 = move-exception
            r0.unlock()
            goto L_0x011f
        L_0x011e:
            throw r9
        L_0x011f:
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p393g2.C12210e.m40260a(java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: b */
    private static final int m40262b(Class<?> cls, int i) {
        Integer num;
        C9100a.m29805a(cls);
        try {
            C10222o.C10223a aVar = C10222o.f27863f;
            num = Integer.valueOf(m40259a(cls, 0, 1, (Object) null));
            C10222o.m34210a(num);
        } catch (Throwable th) {
            C10222o.C10223a aVar2 = C10222o.f27863f;
            num = C10225p.m34213a(th);
            C10222o.m34210a(num);
        }
        Integer valueOf = Integer.valueOf(i);
        if (C10222o.m34212c(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /* renamed from: a */
    private static final C9113l<Throwable, Throwable> m40261a(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C12214d(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (C10202j.m34176a((Object) cls2, (Object) Throwable.class)) {
                return new C12212b(constructor);
            }
            if (C10202j.m34176a((Object) cls2, (Object) cls)) {
                return new C12213c(constructor);
            }
        } else if (length == 2 && C10202j.m34176a((Object) parameterTypes[0], (Object) cls) && C10202j.m34176a((Object) parameterTypes[1], (Object) Throwable.class)) {
            return new C12211a(constructor);
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ int m40259a(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m40258a(cls, i);
    }

    /* renamed from: a */
    private static final int m40258a(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            for (int i3 = 0; i3 < length; i3++) {
                if (!Modifier.isStatic(declaredFields[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }
}
