package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j2 */
final class C8303j2 extends C8331p2 {

    /* renamed from: g */
    private final /* synthetic */ C8288g2 f23271g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8303j2(C8288g2 g2Var) {
        super(g2Var, (C8293h2) null);
        this.f23271g = g2Var;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C8298i2(this.f23271g, (C8293h2) null);
    }

    /* synthetic */ C8303j2(C8288g2 g2Var, C8293h2 h2Var) {
        this(g2Var);
    }
}
