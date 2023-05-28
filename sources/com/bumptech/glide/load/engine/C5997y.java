package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C5904d;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.C5949f;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p166r.C6311f;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.y */
/* compiled from: SourceGenerator */
class C5997y implements C5949f, C6034d.C6035a<Object>, C5949f.C5950a {

    /* renamed from: f */
    private final C5951g<?> f11045f;

    /* renamed from: g */
    private final C5949f.C5950a f11046g;

    /* renamed from: h */
    private int f11047h;

    /* renamed from: i */
    private C5945c f11048i;

    /* renamed from: j */
    private Object f11049j;

    /* renamed from: k */
    private volatile C6101n.C6102a<?> f11050k;

    /* renamed from: l */
    private C5947d f11051l;

    C5997y(C5951g<?> gVar, C5949f.C5950a aVar) {
        this.f11045f = gVar;
        this.f11046g = aVar;
    }

    /* renamed from: b */
    private boolean m11943b() {
        return this.f11047h < this.f11045f.mo20164g().size();
    }

    /* renamed from: a */
    public boolean mo20142a() {
        Object obj = this.f11049j;
        if (obj != null) {
            this.f11049j = null;
            m11942b(obj);
        }
        C5945c cVar = this.f11048i;
        if (cVar != null && cVar.mo20142a()) {
            return true;
        }
        this.f11048i = null;
        this.f11050k = null;
        boolean z = false;
        while (!z && m11943b()) {
            List<C6101n.C6102a<?>> g = this.f11045f.mo20164g();
            int i = this.f11047h;
            this.f11047h = i + 1;
            this.f11050k = g.get(i);
            if (this.f11050k != null && (this.f11045f.mo20162e().mo20197a(this.f11050k.f11190c.mo20330c()) || this.f11045f.mo20160c(this.f11050k.f11190c.mo20323a()))) {
                this.f11050k.f11190c.mo20327a(this.f11045f.mo20167j(), this);
                z = true;
            }
        }
        return z;
    }

    public void cancel() {
        C6101n.C6102a<?> aVar = this.f11050k;
        if (aVar != null) {
            aVar.f11190c.cancel();
        }
    }

    /* renamed from: d */
    public void mo20148d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private void m11942b(Object obj) {
        long a = C6311f.m12965a();
        try {
            C5904d<X> a2 = this.f11045f.mo20149a(obj);
            C5948e eVar = new C5948e(a2, obj, this.f11045f.mo20166i());
            this.f11051l = new C5947d(this.f11050k.f11188a, this.f11045f.mo20169l());
            this.f11045f.mo20161d().mo20095a(this.f11051l, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f11051l + ", data: " + obj + ", encoder: " + a2 + ", duration: " + C6311f.m12964a(a));
            }
            this.f11050k.f11190c.mo20329b();
            this.f11048i = new C5945c(Collections.singletonList(this.f11050k.f11188a), this.f11045f, this);
        } catch (Throwable th) {
            this.f11050k.f11190c.mo20329b();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo20141a(Object obj) {
        C5963j e = this.f11045f.mo20162e();
        if (obj == null || !e.mo20197a(this.f11050k.f11190c.mo20330c())) {
            this.f11046g.mo20147a(this.f11050k.f11188a, obj, this.f11050k.f11190c, this.f11050k.f11190c.mo20330c(), this.f11051l);
            return;
        }
        this.f11049j = obj;
        this.f11046g.mo20148d();
    }

    /* renamed from: a */
    public void mo20140a(Exception exc) {
        this.f11046g.mo20146a(this.f11051l, exc, this.f11050k.f11190c, this.f11050k.f11190c.mo20330c());
    }

    /* renamed from: a */
    public void mo20147a(C6022f fVar, Object obj, C6034d<?> dVar, C5901a aVar, C6022f fVar2) {
        this.f11046g.mo20147a(fVar, obj, dVar, this.f11050k.f11190c.mo20330c(), fVar);
    }

    /* renamed from: a */
    public void mo20146a(C6022f fVar, Exception exc, C6034d<?> dVar, C5901a aVar) {
        this.f11046g.mo20146a(fVar, exc, dVar, this.f11050k.f11190c.mo20330c());
    }
}
