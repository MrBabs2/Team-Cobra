package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yw */
final class C8191yw implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f17487f;

    /* renamed from: g */
    private boolean f17488g;

    /* renamed from: h */
    private Iterator<Map.Entry<K, V>> f17489h;

    /* renamed from: i */
    private final /* synthetic */ C7895qw f17490i;

    private C8191yw(C7895qw qwVar) {
        this.f17490i = qwVar;
        this.f17487f = -1;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m18559a() {
        if (this.f17489h == null) {
            this.f17489h = this.f17490i.f16684h.entrySet().iterator();
        }
        return this.f17489h;
    }

    public final boolean hasNext() {
        if (this.f17487f + 1 < this.f17490i.f16683g.size() || (!this.f17490i.f16684h.isEmpty() && m18559a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f17488g = true;
        int i = this.f17487f + 1;
        this.f17487f = i;
        if (i < this.f17490i.f16683g.size()) {
            return (Map.Entry) this.f17490i.f16683g.get(this.f17487f);
        }
        return (Map.Entry) m18559a().next();
    }

    public final void remove() {
        if (this.f17488g) {
            this.f17488g = false;
            this.f17490i.m18062f();
            if (this.f17487f < this.f17490i.f16683g.size()) {
                C7895qw qwVar = this.f17490i;
                int i = this.f17487f;
                this.f17487f = i - 1;
                Object unused = qwVar.m18059c(i);
                return;
            }
            m18559a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ C8191yw(C7895qw qwVar, C7932rw rwVar) {
        this(qwVar);
    }
}
