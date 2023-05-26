package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk
public class ListenerHolders {

    /* renamed from: a */
    private final Set<ListenerHolder<?>> f13766a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo25083a() {
        for (ListenerHolder<?> a : this.f13766a) {
            a.mo25078a();
        }
        this.f13766a.clear();
    }
}
