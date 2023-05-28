package p120q.p121b;

import p036io.sentry.dsn.C9055a;
import p120q.p121b.p354i.C11515d;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.d */
/* compiled from: SentryClientFactory */
public abstract class C5312d {

    /* renamed from: b */
    private static final C12938b f9544b = C12939c.m41777a((Class<?>) C5312d.class);

    /* renamed from: a */
    protected final C11515d f9545a;

    protected C5312d(C11515d dVar) {
        dVar.getClass();
        this.f9545a = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r6 = (p120q.p121b.C5312d) r1.newInstance();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:7:0x0021] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p120q.p121b.C5312d m10110a(p120q.p121b.p354i.C11515d r6, java.lang.String r7) {
        /*
            io.sentry.dsn.a r0 = new io.sentry.dsn.a
            java.lang.String r7 = m10109a((java.lang.String) r7, (p120q.p121b.p354i.C11515d) r6)
            r0.<init>((java.lang.String) r7)
            java.lang.String r7 = "factory"
            java.lang.String r7 = r6.mo37634a(r7, r0)
            boolean r0 = p120q.p121b.p367q.C11591b.m37917a((java.lang.String) r7)
            if (r0 == 0) goto L_0x001b
            q.b.a r7 = new q.b.a
            r7.<init>(r6)
            goto L_0x0066
        L_0x001b:
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x005f, InvocationTargetException -> 0x0037 }
            java.lang.Class<q.b.i.d> r4 = p120q.p121b.p354i.C11515d.class
            r5 = 0
            r3[r5] = r4     // Catch:{ NoSuchMethodException -> 0x005f, InvocationTargetException -> 0x0037 }
            java.lang.reflect.Constructor r3 = r1.getConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x005f, InvocationTargetException -> 0x0037 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x005f, InvocationTargetException -> 0x0038 }
            r2[r5] = r6     // Catch:{ NoSuchMethodException -> 0x005f, InvocationTargetException -> 0x0038 }
            java.lang.Object r6 = r3.newInstance(r2)     // Catch:{ NoSuchMethodException -> 0x005f, InvocationTargetException -> 0x0038 }
            q.b.d r6 = (p120q.p121b.C5312d) r6     // Catch:{ NoSuchMethodException -> 0x005f, InvocationTargetException -> 0x0038 }
            goto L_0x0065
        L_0x0037:
            r3 = r0
        L_0x0038:
            t.b.b r6 = f9544b     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            r2.<init>()     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            java.lang.String r4 = "Failed to instantiate SentryClientFactory using "
            r2.append(r4)     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            java.lang.String r3 = ". Falling back to using"
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            java.lang.String r3 = " the default constructor, if any."
            r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            java.lang.String r2 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            r6.mo41315c(r2)     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            java.lang.Object r6 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            q.b.d r6 = (p120q.p121b.C5312d) r6     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            goto L_0x0065
        L_0x005f:
            java.lang.Object r6 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
            q.b.d r6 = (p120q.p121b.C5312d) r6     // Catch:{ ClassNotFoundException -> 0x006b, IllegalAccessException -> 0x0069, InstantiationException -> 0x0067 }
        L_0x0065:
            r7 = r6
        L_0x0066:
            return r7
        L_0x0067:
            r6 = move-exception
            goto L_0x006c
        L_0x0069:
            r6 = move-exception
            goto L_0x006c
        L_0x006b:
            r6 = move-exception
        L_0x006c:
            t.b.b r1 = f9544b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error creating SentryClient using factory class: '"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = "'."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.mo41308a((java.lang.String) r7, (java.lang.Throwable) r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p121b.C5312d.m10110a(q.b.i.d, java.lang.String):q.b.d");
    }

    /* renamed from: a */
    public abstract C5311c mo18479a(C9055a aVar);

    public String toString() {
        return "SentryClientFactory{name='" + getClass().getName() + '\'' + '}';
    }

    protected C5312d() {
        this(C11515d.m37672a());
    }

    /* renamed from: a */
    private static String m10109a(String str, C11515d dVar) {
        return str == null ? C9055a.m29747a(dVar) : str;
    }

    /* renamed from: a */
    public C5311c mo18523a(String str) {
        if (str == null) {
            str = C9055a.m29747a(this.f9545a);
        }
        return mo18479a(new C9055a(str));
    }
}
