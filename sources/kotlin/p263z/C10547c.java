package kotlin.p263z;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.z.c */
/* compiled from: _ComparisonsJvm.kt */
class C10547c extends C10546b {
    /* renamed from: b */
    public static <T extends Comparable<? super T>> T m35834b(T t, T t2) {
        C10202j.m34178b(t, "a");
        C10202j.m34178b(t2, "b");
        return t.compareTo(t2) >= 0 ? t : t2;
    }
}
