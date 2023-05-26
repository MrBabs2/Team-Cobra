package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.vt */
final class C8077vt extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f17038a;

    public C8077vt(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f17038a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C8077vt.class) {
            if (this == obj) {
                return true;
            }
            C8077vt vtVar = (C8077vt) obj;
            return this.f17038a == vtVar.f17038a && get() == vtVar.get();
        }
    }

    public final int hashCode() {
        return this.f17038a;
    }
}
