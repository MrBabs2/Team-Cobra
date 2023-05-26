package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C6022f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.r */
/* compiled from: Jobs */
final class C5988r {

    /* renamed from: a */
    private final Map<C6022f, C5976l<?>> f11014a = new HashMap();

    /* renamed from: b */
    private final Map<C6022f, C5976l<?>> f11015b = new HashMap();

    C5988r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5976l<?> mo20246a(C6022f fVar, boolean z) {
        return m11917a(z).get(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo20248b(C6022f fVar, C5976l<?> lVar) {
        Map<C6022f, C5976l<?>> a = m11917a(lVar.mo20219e());
        if (lVar.equals(a.get(fVar))) {
            a.remove(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20247a(C6022f fVar, C5976l<?> lVar) {
        m11917a(lVar.mo20219e()).put(fVar, lVar);
    }

    /* renamed from: a */
    private Map<C6022f, C5976l<?>> m11917a(boolean z) {
        return z ? this.f11015b : this.f11014a;
    }
}
