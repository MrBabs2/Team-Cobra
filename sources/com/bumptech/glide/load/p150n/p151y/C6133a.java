package com.bumptech.glide.load.p150n.p151y;

import com.bumptech.glide.load.C6024h;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6044j;
import com.bumptech.glide.load.p150n.C6087g;
import com.bumptech.glide.load.p150n.C6098m;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.load.p150n.C6103o;
import com.bumptech.glide.load.p150n.C6109r;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.y.a */
/* compiled from: HttpGlideUrlLoader */
public class C6133a implements C6101n<C6087g, InputStream> {

    /* renamed from: b */
    public static final C6024h<Integer> f11231b = C6024h.m12062a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C6098m<C6087g, C6087g> f11232a;

    /* renamed from: com.bumptech.glide.load.n.y.a$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class C6134a implements C6103o<C6087g, InputStream> {

        /* renamed from: a */
        private final C6098m<C6087g, C6087g> f11233a = new C6098m<>(500);

        /* renamed from: a */
        public C6101n<C6087g, InputStream> mo20366a(C6109r rVar) {
            return new C6133a(this.f11233a);
        }
    }

    public C6133a(C6098m<C6087g, C6087g> mVar) {
        this.f11232a = mVar;
    }

    /* renamed from: a */
    public boolean mo20364a(C6087g gVar) {
        return true;
    }

    /* renamed from: a */
    public C6101n.C6102a<InputStream> mo20362a(C6087g gVar, int i, int i2, C6027i iVar) {
        C6098m<C6087g, C6087g> mVar = this.f11232a;
        if (mVar != null) {
            C6087g a = mVar.mo20401a(gVar, 0, 0);
            if (a == null) {
                this.f11232a.mo20402a(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new C6101n.C6102a<>(gVar, new C6044j(gVar, ((Integer) iVar.mo20316a(f11231b)).intValue()));
    }
}
