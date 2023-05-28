package kotlin.p220g0;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.g0.e */
/* compiled from: Ranges.kt */
class C9149e {
    /* renamed from: a */
    public static final void m29846a(boolean z, Number number) {
        C10202j.m34178b(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }
}
