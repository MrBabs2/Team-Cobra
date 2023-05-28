package com.flurry.sdk;

import java.util.Comparator;

/* renamed from: com.flurry.sdk.a1 */
public final class C6736a1 implements Comparator<Runnable> {
    /* renamed from: a */
    private static int m14371a(Runnable runnable) {
        if (runnable == null) {
            return Integer.MAX_VALUE;
        }
        if (runnable instanceof C6748b1) {
            C6831g2 g2Var = (C6831g2) ((C6748b1) runnable).mo23542a();
            if (g2Var != null) {
                return g2Var.f12783h;
            }
            return Integer.MAX_VALUE;
        } else if (runnable instanceof C6831g2) {
            return ((C6831g2) runnable).f12783h;
        } else {
            C6792d1.m14476a(6, "PriorityComparator", "Unknown runnable class: " + runnable.getClass().getName());
            return Integer.MAX_VALUE;
        }
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int a = m14371a((Runnable) obj);
        int a2 = m14371a((Runnable) obj2);
        if (a < a2) {
            return -1;
        }
        return a > a2 ? 1 : 0;
    }
}
