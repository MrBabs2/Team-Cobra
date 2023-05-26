package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9068f;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.p394h2.C12245a;
import kotlinx.coroutines.p394h2.C12246b;

/* renamed from: kotlinx.coroutines.g0 */
/* compiled from: CoroutineStart.kt */
public enum C12204g0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: a */
    public final <R, T> void mo38854a(C9117p<? super R, ? super C9064d<? super T>, ? extends Object> pVar, R r, C9064d<? super T> dVar) {
        int i = C12200f0.f31963b[ordinal()];
        if (i == 1) {
            C12245a.m40364a(pVar, r, dVar);
        } else if (i == 2) {
            C9068f.m29773a(pVar, r, dVar);
        } else if (i == 3) {
            C12246b.m40366a(pVar, r, dVar);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public final boolean mo38855a() {
        return this == LAZY;
    }
}
