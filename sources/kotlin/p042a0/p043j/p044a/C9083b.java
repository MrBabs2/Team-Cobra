package kotlin.p042a0.p043j.p044a;

import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;

/* renamed from: kotlin.a0.j.a.b */
/* compiled from: ContinuationImpl.kt */
public final class C9083b implements C9064d<Object> {

    /* renamed from: f */
    public static final C9083b f25663f = new C9083b();

    private C9083b() {
    }

    public C9069g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
