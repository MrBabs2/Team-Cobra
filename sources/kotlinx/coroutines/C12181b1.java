package kotlinx.coroutines;

import kotlinx.coroutines.p393g2.C12230o;

/* renamed from: kotlinx.coroutines.b1 */
/* compiled from: EventLoop.common.kt */
public final class C12181b1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C12230o f31950a = new C12230o("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C12230o f31951b = new C12230o("CLOSED_EMPTY");

    /* renamed from: a */
    public static final long m40219a(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
