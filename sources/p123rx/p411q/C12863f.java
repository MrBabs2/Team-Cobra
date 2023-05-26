package p123rx.p411q;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.q.f */
/* compiled from: RxJavaPlugins */
public class C12863f {

    /* renamed from: f */
    private static final C12863f f33083f = new C12863f();

    /* renamed from: g */
    static final C12843b f33084g = new C12864a();

    /* renamed from: a */
    private final AtomicReference<C12843b> f33085a = new AtomicReference<>();

    /* renamed from: b */
    private final AtomicReference<C12861d> f33086b = new AtomicReference<>();

    /* renamed from: c */
    private final AtomicReference<C12867h> f33087c = new AtomicReference<>();

    /* renamed from: d */
    private final AtomicReference<C12842a> f33088d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicReference<C12866g> f33089e = new AtomicReference<>();

    /* renamed from: rx.q.f$a */
    /* compiled from: RxJavaPlugins */
    static class C12864a extends C12843b {
        C12864a() {
        }
    }

    /* renamed from: rx.q.f$b */
    /* compiled from: RxJavaPlugins */
    class C12865b extends C12842a {
        C12865b(C12863f fVar) {
        }
    }

    C12863f() {
    }

    @Deprecated
    /* renamed from: f */
    public static C12863f m41441f() {
        return f33083f;
    }

    /* renamed from: g */
    static Properties m41442g() {
        try {
            return System.getProperties();
        } catch (SecurityException unused) {
            return new Properties();
        }
    }

    /* renamed from: a */
    public C12842a mo41068a() {
        if (this.f33088d.get() == null) {
            Object a = m41440a(C12842a.class, m41442g());
            if (a == null) {
                this.f33088d.compareAndSet((Object) null, new C12865b(this));
            } else {
                this.f33088d.compareAndSet((Object) null, (C12842a) a);
            }
        }
        return this.f33088d.get();
    }

    /* renamed from: b */
    public C12843b mo41069b() {
        if (this.f33085a.get() == null) {
            Object a = m41440a(C12843b.class, m41442g());
            if (a == null) {
                this.f33085a.compareAndSet((Object) null, f33084g);
            } else {
                this.f33085a.compareAndSet((Object) null, (C12843b) a);
            }
        }
        return this.f33085a.get();
    }

    /* renamed from: c */
    public C12861d mo41070c() {
        if (this.f33086b.get() == null) {
            Object a = m41440a(C12861d.class, m41442g());
            if (a == null) {
                this.f33086b.compareAndSet((Object) null, C12862e.m41439a());
            } else {
                this.f33086b.compareAndSet((Object) null, (C12861d) a);
            }
        }
        return this.f33086b.get();
    }

    /* renamed from: d */
    public C12866g mo41071d() {
        if (this.f33089e.get() == null) {
            Object a = m41440a(C12866g.class, m41442g());
            if (a == null) {
                this.f33089e.compareAndSet((Object) null, C12866g.m41454g());
            } else {
                this.f33089e.compareAndSet((Object) null, (C12866g) a);
            }
        }
        return this.f33089e.get();
    }

    /* renamed from: e */
    public C12867h mo41072e() {
        if (this.f33087c.get() == null) {
            Object a = m41440a(C12867h.class, m41442g());
            if (a == null) {
                this.f33087c.compareAndSet((Object) null, C12868i.m41464a());
            } else {
                this.f33087c.compareAndSet((Object) null, (C12867h) a);
            }
        }
        return this.f33087c.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        r2 = "rxjava.plugin." + r7.substring(0, r7.length() - 6).substring(14) + ".impl";
        r11 = r11.getProperty(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0087, code lost:
        if (r11 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a8, code lost:
        throw new java.lang.IllegalStateException("Implementing class declaration for " + r0 + " missing: " + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a9, code lost:
        r1 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5 A[SYNTHETIC, Splitter:B:24:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0136 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object m41440a(java.lang.Class<?> r10, java.util.Properties r11) {
        /*
            java.lang.Object r11 = r11.clone()
            java.util.Properties r11 = (java.util.Properties) r11
            java.lang.String r0 = r10.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "rxjava.plugin."
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = ".implementation"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r11.getProperty(r1)
            if (r1 != 0) goto L_0x00b3
            java.lang.String r3 = ".class"
            java.lang.String r4 = ".impl"
            java.util.Set r5 = r11.entrySet()     // Catch:{ SecurityException -> 0x00ab }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ SecurityException -> 0x00ab }
        L_0x0032:
            boolean r6 = r5.hasNext()     // Catch:{ SecurityException -> 0x00ab }
            if (r6 == 0) goto L_0x00b3
            java.lang.Object r6 = r5.next()     // Catch:{ SecurityException -> 0x00ab }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ SecurityException -> 0x00ab }
            java.lang.Object r7 = r6.getKey()     // Catch:{ SecurityException -> 0x00ab }
            java.lang.String r7 = r7.toString()     // Catch:{ SecurityException -> 0x00ab }
            boolean r8 = r7.startsWith(r2)     // Catch:{ SecurityException -> 0x00ab }
            if (r8 == 0) goto L_0x0032
            boolean r8 = r7.endsWith(r3)     // Catch:{ SecurityException -> 0x00ab }
            if (r8 == 0) goto L_0x0032
            java.lang.Object r6 = r6.getValue()     // Catch:{ SecurityException -> 0x00ab }
            java.lang.String r6 = r6.toString()     // Catch:{ SecurityException -> 0x00ab }
            boolean r6 = r0.equals(r6)     // Catch:{ SecurityException -> 0x00ab }
            if (r6 == 0) goto L_0x0032
            r3 = 0
            int r5 = r7.length()     // Catch:{ SecurityException -> 0x00ab }
            int r5 = r5 + -6
            java.lang.String r3 = r7.substring(r3, r5)     // Catch:{ SecurityException -> 0x00ab }
            r5 = 14
            java.lang.String r3 = r3.substring(r5)     // Catch:{ SecurityException -> 0x00ab }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00ab }
            r5.<init>()     // Catch:{ SecurityException -> 0x00ab }
            r5.append(r2)     // Catch:{ SecurityException -> 0x00ab }
            r5.append(r3)     // Catch:{ SecurityException -> 0x00ab }
            r5.append(r4)     // Catch:{ SecurityException -> 0x00ab }
            java.lang.String r2 = r5.toString()     // Catch:{ SecurityException -> 0x00ab }
            java.lang.String r11 = r11.getProperty(r2)     // Catch:{ SecurityException -> 0x00ab }
            if (r11 == 0) goto L_0x008a
            goto L_0x00b2
        L_0x008a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x00a9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00a9 }
            r3.<init>()     // Catch:{ SecurityException -> 0x00a9 }
            java.lang.String r4 = "Implementing class declaration for "
            r3.append(r4)     // Catch:{ SecurityException -> 0x00a9 }
            r3.append(r0)     // Catch:{ SecurityException -> 0x00a9 }
            java.lang.String r4 = " missing: "
            r3.append(r4)     // Catch:{ SecurityException -> 0x00a9 }
            r3.append(r2)     // Catch:{ SecurityException -> 0x00a9 }
            java.lang.String r2 = r3.toString()     // Catch:{ SecurityException -> 0x00a9 }
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x00a9 }
            throw r1     // Catch:{ SecurityException -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            goto L_0x00af
        L_0x00ab:
            r11 = move-exception
            r9 = r1
            r1 = r11
            r11 = r9
        L_0x00af:
            r1.printStackTrace()
        L_0x00b2:
            r1 = r11
        L_0x00b3:
            if (r1 == 0) goto L_0x0136
            java.lang.Class r11 = java.lang.Class.forName(r1)     // Catch:{ ClassCastException -> 0x0113, ClassNotFoundException -> 0x00f8, InstantiationException -> 0x00dd, IllegalAccessException -> 0x00c2 }
            java.lang.Class r10 = r11.asSubclass(r10)     // Catch:{ ClassCastException -> 0x0113, ClassNotFoundException -> 0x00f8, InstantiationException -> 0x00dd, IllegalAccessException -> 0x00c2 }
            java.lang.Object r10 = r10.newInstance()     // Catch:{ ClassCastException -> 0x0113, ClassNotFoundException -> 0x00f8, InstantiationException -> 0x00dd, IllegalAccessException -> 0x00c2 }
            return r10
        L_0x00c2:
            r10 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " implementation not able to be accessed: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0, r10)
            throw r11
        L_0x00dd:
            r10 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " implementation not able to be instantiated: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0, r10)
            throw r11
        L_0x00f8:
            r10 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " implementation class not found: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0, r10)
            throw r11
        L_0x0113:
            r10 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = " implementation is not an instance of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0, r10)
            throw r11
        L_0x0136:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.p411q.C12863f.m41440a(java.lang.Class, java.util.Properties):java.lang.Object");
    }
}
