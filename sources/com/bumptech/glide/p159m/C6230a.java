package com.bumptech.glide.p159m;

import com.bumptech.glide.p166r.C6316k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.m.a */
/* compiled from: ActivityFragmentLifecycle */
class C6230a implements C6239h {

    /* renamed from: a */
    private final Set<C6240i> f11385a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f11386b;

    /* renamed from: c */
    private boolean f11387c;

    C6230a() {
    }

    /* renamed from: a */
    public void mo20558a(C6240i iVar) {
        this.f11385a.add(iVar);
        if (this.f11387c) {
            iVar.onDestroy();
        } else if (this.f11386b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    /* renamed from: b */
    public void mo20560b(C6240i iVar) {
        this.f11385a.remove(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo20561c() {
        this.f11386b = false;
        for (T onStop : C6316k.m12993a(this.f11385a)) {
            onStop.onStop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo20559b() {
        this.f11386b = true;
        for (T onStart : C6316k.m12993a(this.f11385a)) {
            onStart.onStart();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20557a() {
        this.f11387c = true;
        for (T onDestroy : C6316k.m12993a(this.f11385a)) {
            onDestroy.onDestroy();
        }
    }
}
