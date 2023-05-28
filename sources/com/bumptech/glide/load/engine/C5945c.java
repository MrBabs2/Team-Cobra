package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.C5949f;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6101n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.c */
/* compiled from: DataCacheGenerator */
class C5945c implements C5949f, C6034d.C6035a<Object> {

    /* renamed from: f */
    private final List<C6022f> f10848f;

    /* renamed from: g */
    private final C5951g<?> f10849g;

    /* renamed from: h */
    private final C5949f.C5950a f10850h;

    /* renamed from: i */
    private int f10851i;

    /* renamed from: j */
    private C6022f f10852j;

    /* renamed from: k */
    private List<C6101n<File, ?>> f10853k;

    /* renamed from: l */
    private int f10854l;

    /* renamed from: m */
    private volatile C6101n.C6102a<?> f10855m;

    /* renamed from: n */
    private File f10856n;

    C5945c(C5951g<?> gVar, C5949f.C5950a aVar) {
        this(gVar.mo20159c(), gVar, aVar);
    }

    /* renamed from: b */
    private boolean m11757b() {
        return this.f10854l < this.f10853k.size();
    }

    /* renamed from: a */
    public boolean mo20142a() {
        while (true) {
            boolean z = false;
            if (this.f10853k == null || !m11757b()) {
                int i = this.f10851i + 1;
                this.f10851i = i;
                if (i >= this.f10848f.size()) {
                    return false;
                }
                C6022f fVar = this.f10848f.get(this.f10851i);
                File a = this.f10849g.mo20161d().mo20094a(new C5947d(fVar, this.f10849g.mo20169l()));
                this.f10856n = a;
                if (a != null) {
                    this.f10852j = fVar;
                    this.f10853k = this.f10849g.mo20152a(a);
                    this.f10854l = 0;
                }
            } else {
                this.f10855m = null;
                while (!z && m11757b()) {
                    List<C6101n<File, ?>> list = this.f10853k;
                    int i2 = this.f10854l;
                    this.f10854l = i2 + 1;
                    this.f10855m = list.get(i2).mo20362a(this.f10856n, this.f10849g.mo20171n(), this.f10849g.mo20163f(), this.f10849g.mo20166i());
                    if (this.f10855m != null && this.f10849g.mo20160c(this.f10855m.f11190c.mo20323a())) {
                        this.f10855m.f11190c.mo20327a(this.f10849g.mo20167j(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    public void cancel() {
        C6101n.C6102a<?> aVar = this.f10855m;
        if (aVar != null) {
            aVar.f11190c.cancel();
        }
    }

    C5945c(List<C6022f> list, C5951g<?> gVar, C5949f.C5950a aVar) {
        this.f10851i = -1;
        this.f10848f = list;
        this.f10849g = gVar;
        this.f10850h = aVar;
    }

    /* renamed from: a */
    public void mo20141a(Object obj) {
        this.f10850h.mo20147a(this.f10852j, obj, this.f10855m.f11190c, C5901a.DATA_DISK_CACHE, this.f10852j);
    }

    /* renamed from: a */
    public void mo20140a(Exception exc) {
        this.f10850h.mo20146a(this.f10852j, exc, this.f10855m.f11190c, C5901a.DATA_DISK_CACHE);
    }
}
