package kotlinx.coroutines.p393g2;

import kotlinx.coroutines.C12256j0;

/* renamed from: kotlinx.coroutines.g2.k */
/* compiled from: Atomic.kt */
public abstract class C12226k {
    /* renamed from: a */
    public abstract Object mo38859a(Object obj);

    /* renamed from: a */
    public abstract C12208c<?> mo38860a();

    /* renamed from: a */
    public final boolean mo38897a(C12226k kVar) {
        C12208c<?> a;
        C12208c<?> a2 = mo38860a();
        if (a2 == null || (a = kVar.mo38860a()) == null || a2.mo38862b() >= a.mo38862b()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return C12256j0.m40409a((Object) this) + '@' + C12256j0.m40411b(this);
    }
}
