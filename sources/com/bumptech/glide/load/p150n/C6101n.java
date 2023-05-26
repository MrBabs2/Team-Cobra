package com.bumptech.glide.load.p150n;

import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.p166r.C6315j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.n */
/* compiled from: ModelLoader */
public interface C6101n<Model, Data> {

    /* renamed from: com.bumptech.glide.load.n.n$a */
    /* compiled from: ModelLoader */
    public static class C6102a<Data> {

        /* renamed from: a */
        public final C6022f f11188a;

        /* renamed from: b */
        public final List<C6022f> f11189b;

        /* renamed from: c */
        public final C6034d<Data> f11190c;

        public C6102a(C6022f fVar, C6034d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public C6102a(C6022f fVar, List<C6022f> list, C6034d<Data> dVar) {
            C6315j.m12978a(fVar);
            this.f11188a = fVar;
            C6315j.m12978a(list);
            this.f11189b = list;
            C6315j.m12978a(dVar);
            this.f11190c = dVar;
        }
    }

    /* renamed from: a */
    C6102a<Data> mo20362a(Model model, int i, int i2, C6027i iVar);

    /* renamed from: a */
    boolean mo20364a(Model model);
}
