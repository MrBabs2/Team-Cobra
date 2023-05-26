package com.bumptech.glide.load.p150n.p151y;

import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p150n.C6087g;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.load.p150n.C6103o;
import com.bumptech.glide.load.p150n.C6109r;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.n.y.e */
/* compiled from: UrlLoader */
public class C6141e implements C6101n<URL, InputStream> {

    /* renamed from: a */
    private final C6101n<C6087g, InputStream> f11240a;

    /* renamed from: com.bumptech.glide.load.n.y.e$a */
    /* compiled from: UrlLoader */
    public static class C6142a implements C6103o<URL, InputStream> {
        /* renamed from: a */
        public C6101n<URL, InputStream> mo20366a(C6109r rVar) {
            return new C6141e(rVar.mo20414a(C6087g.class, InputStream.class));
        }
    }

    public C6141e(C6101n<C6087g, InputStream> nVar) {
        this.f11240a = nVar;
    }

    /* renamed from: a */
    public boolean mo20364a(URL url) {
        return true;
    }

    /* renamed from: a */
    public C6101n.C6102a<InputStream> mo20362a(URL url, int i, int i2, C6027i iVar) {
        return this.f11240a.mo20362a(new C6087g(url), i, i2, iVar);
    }
}
