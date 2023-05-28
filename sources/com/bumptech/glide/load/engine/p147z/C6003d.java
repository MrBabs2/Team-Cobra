package com.bumptech.glide.load.engine.p147z;

import com.bumptech.glide.load.engine.p147z.C6017m;
import com.bumptech.glide.p166r.C6316k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.engine.z.d */
/* compiled from: BaseKeyPool */
abstract class C6003d<T extends C6017m> {

    /* renamed from: a */
    private final Queue<T> f11058a = C6316k.m12994a(20);

    C6003d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo20276a();

    /* renamed from: a */
    public void mo20278a(T t) {
        if (this.f11058a.size() < 20) {
            this.f11058a.offer(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public T mo20279b() {
        T t = (C6017m) this.f11058a.poll();
        return t == null ? mo20276a() : t;
    }
}
