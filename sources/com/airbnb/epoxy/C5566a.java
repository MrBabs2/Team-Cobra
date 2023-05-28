package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0521j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;

/* renamed from: com.airbnb.epoxy.a */
/* compiled from: ActivityRecyclerPool.kt */
public final class C5566a {

    /* renamed from: a */
    private final ArrayList<PoolReference> f9824a = new ArrayList<>(5);

    /* renamed from: a */
    public final PoolReference mo19113a(Context context, C9102a<? extends RecyclerView.C0654u> aVar) {
        C0514f lifecycle;
        C10202j.m34178b(context, "context");
        C10202j.m34178b(aVar, "poolFactory");
        Iterator<PoolReference> it = this.f9824a.iterator();
        C10202j.m34174a((Object) it, "pools.iterator()");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            PoolReference next = it.next();
            C10202j.m34174a((Object) next, "iterator.next()");
            PoolReference poolReference2 = next;
            if (poolReference2.mo15768b() == context) {
                if (poolReference == null) {
                    poolReference = poolReference2;
                } else {
                    throw new IllegalStateException("A pool was already found");
                }
            } else if (C5568b.m10541a(poolReference2.mo15768b())) {
                poolReference2.mo15769c().mo3977b();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(context, (RecyclerView.C0654u) aVar.invoke(), this);
            if (!(context instanceof C0521j)) {
                context = null;
            }
            C0521j jVar = (C0521j) context;
            if (!(jVar == null || (lifecycle = jVar.getLifecycle()) == null)) {
                lifecycle.mo3039a(poolReference);
            }
            this.f9824a.add(poolReference);
        }
        return poolReference;
    }

    /* renamed from: a */
    public final void mo19114a(PoolReference poolReference) {
        C10202j.m34178b(poolReference, "pool");
        if (C5568b.m10541a(poolReference.mo15768b())) {
            poolReference.mo15769c().mo3977b();
            this.f9824a.remove(poolReference);
        }
    }
}
