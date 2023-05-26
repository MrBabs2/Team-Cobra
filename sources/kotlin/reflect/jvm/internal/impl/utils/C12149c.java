package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.reflect.jvm.internal.impl.utils.c */
/* compiled from: exceptionUtils.kt */
public final class C12149c {
    /* renamed from: a */
    public static final boolean m40153a(Throwable th) {
        C10202j.m34178b(th, "$this$isProcessCanceledException");
        Class cls = th.getClass();
        while (!C10202j.m34176a((Object) cls.getCanonicalName(), (Object) "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final RuntimeException m40154b(Throwable th) {
        C10202j.m34178b(th, "e");
        throw th;
    }
}
