package com.bumptech.glide.p159m;

import com.bumptech.glide.p162p.p163l.C6287i;
import com.bumptech.glide.p166r.C6316k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.m.p */
/* compiled from: TargetTracker */
public final class C6251p implements C6240i {

    /* renamed from: f */
    private final Set<C6287i<?>> f11417f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void mo20599a(C6287i<?> iVar) {
        this.f11417f.add(iVar);
    }

    /* renamed from: b */
    public void mo20601b(C6287i<?> iVar) {
        this.f11417f.remove(iVar);
    }

    public void onDestroy() {
        for (T onDestroy : C6316k.m12993a(this.f11417f)) {
            onDestroy.onDestroy();
        }
    }

    public void onStart() {
        for (T onStart : C6316k.m12993a(this.f11417f)) {
            onStart.onStart();
        }
    }

    public void onStop() {
        for (T onStop : C6316k.m12993a(this.f11417f)) {
            onStop.onStop();
        }
    }

    /* renamed from: a */
    public void mo20598a() {
        this.f11417f.clear();
    }

    /* renamed from: b */
    public List<C6287i<?>> mo20600b() {
        return C6316k.m12993a(this.f11417f);
    }
}
