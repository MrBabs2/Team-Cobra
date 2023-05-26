package kotlin.p045h0.p046u.p047e;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.h0 */
/* compiled from: moduleByClassLoader.kt */
final class C9246h0 {

    /* renamed from: a */
    private final WeakReference<ClassLoader> f25792a;

    /* renamed from: b */
    private final int f25793b;

    public C9246h0(ClassLoader classLoader) {
        C10202j.m34178b(classLoader, "classLoader");
        this.f25792a = new WeakReference<>(classLoader);
        this.f25793b = System.identityHashCode(classLoader);
    }

    /* renamed from: a */
    public final void mo33609a(ClassLoader classLoader) {
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9246h0) && ((ClassLoader) this.f25792a.get()) == ((ClassLoader) ((C9246h0) obj).f25792a.get());
    }

    public int hashCode() {
        return this.f25793b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r1 = this;
            java.lang.ref.WeakReference<java.lang.ClassLoader> r0 = r1.f25792a
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            java.lang.String r0 = "<null>"
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C9246h0.toString():java.lang.String");
    }
}
