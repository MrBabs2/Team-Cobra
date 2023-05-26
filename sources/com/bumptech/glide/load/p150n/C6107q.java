package com.bumptech.glide.load.p150n;

import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p166r.C6315j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.n.q */
/* compiled from: MultiModelLoader */
class C6107q<Model, Data> implements C6101n<Model, Data> {

    /* renamed from: a */
    private final List<C6101n<Model, Data>> f11195a;

    /* renamed from: b */
    private final C5005e<List<Throwable>> f11196b;

    C6107q(List<C6101n<Model, Data>> list, C5005e<List<Throwable>> eVar) {
        this.f11195a = list;
        this.f11196b = eVar;
    }

    /* renamed from: a */
    public C6101n.C6102a<Data> mo20362a(Model model, int i, int i2, C6027i iVar) {
        C6101n.C6102a a;
        int size = this.f11195a.size();
        ArrayList arrayList = new ArrayList(size);
        C6022f fVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C6101n nVar = this.f11195a.get(i3);
            if (nVar.mo20364a(model) && (a = nVar.mo20362a(model, i, i2, iVar)) != null) {
                fVar = a.f11188a;
                arrayList.add(a.f11190c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new C6101n.C6102a<>(fVar, new C6108a(arrayList, this.f11196b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f11195a.toArray()) + '}';
    }

    /* renamed from: com.bumptech.glide.load.n.q$a */
    /* compiled from: MultiModelLoader */
    static class C6108a<Data> implements C6034d<Data>, C6034d.C6035a<Data> {

        /* renamed from: f */
        private final List<C6034d<Data>> f11197f;

        /* renamed from: g */
        private final C5005e<List<Throwable>> f11198g;

        /* renamed from: h */
        private int f11199h = 0;

        /* renamed from: i */
        private C5878g f11200i;

        /* renamed from: j */
        private C6034d.C6035a<? super Data> f11201j;

        /* renamed from: k */
        private List<Throwable> f11202k;

        /* renamed from: l */
        private boolean f11203l;

        C6108a(List<C6034d<Data>> list, C5005e<List<Throwable>> eVar) {
            this.f11198g = eVar;
            C6315j.m12981a(list);
            this.f11197f = list;
        }

        /* renamed from: d */
        private void m12292d() {
            if (!this.f11203l) {
                if (this.f11199h < this.f11197f.size() - 1) {
                    this.f11199h++;
                    mo20327a(this.f11200i, this.f11201j);
                    return;
                }
                C6315j.m12978a(this.f11202k);
                this.f11201j.mo20140a((Exception) new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f11202k)));
            }
        }

        /* renamed from: a */
        public void mo20327a(C5878g gVar, C6034d.C6035a<? super Data> aVar) {
            this.f11200i = gVar;
            this.f11201j = aVar;
            this.f11202k = this.f11198g.mo17456a();
            this.f11197f.get(this.f11199h).mo20327a(gVar, this);
            if (this.f11203l) {
                cancel();
            }
        }

        /* renamed from: b */
        public void mo20329b() {
            List<Throwable> list = this.f11202k;
            if (list != null) {
                this.f11198g.mo17457a(list);
            }
            this.f11202k = null;
            for (C6034d<Data> b : this.f11197f) {
                b.mo20329b();
            }
        }

        /* renamed from: c */
        public C5901a mo20330c() {
            return this.f11197f.get(0).mo20330c();
        }

        public void cancel() {
            this.f11203l = true;
            for (C6034d<Data> cancel : this.f11197f) {
                cancel.cancel();
            }
        }

        /* renamed from: a */
        public Class<Data> mo20323a() {
            return this.f11197f.get(0).mo20323a();
        }

        /* renamed from: a */
        public void mo20141a(Data data) {
            if (data != null) {
                this.f11201j.mo20141a(data);
            } else {
                m12292d();
            }
        }

        /* renamed from: a */
        public void mo20140a(Exception exc) {
            List<Throwable> list = this.f11202k;
            C6315j.m12978a(list);
            list.add(exc);
            m12292d();
        }
    }

    /* renamed from: a */
    public boolean mo20364a(Model model) {
        for (C6101n<Model, Data> a : this.f11195a) {
            if (a.mo20364a(model)) {
                return true;
            }
        }
        return false;
    }
}
