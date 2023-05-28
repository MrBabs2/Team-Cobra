package com.airbnb.lottie.p133s.p134i;

import com.airbnb.lottie.p140w.C5830a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.s.i.n */
/* compiled from: BaseAnimatableValue */
abstract class C5743n<V, O> implements C5742m<V, O> {

    /* renamed from: a */
    final List<C5830a<V>> f10265a;

    C5743n(V v) {
        this(Collections.singletonList(new C5830a(v)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f10265a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f10265a.toArray()));
        }
        return sb.toString();
    }

    C5743n(List<C5830a<V>> list) {
        this.f10265a = list;
    }
}
