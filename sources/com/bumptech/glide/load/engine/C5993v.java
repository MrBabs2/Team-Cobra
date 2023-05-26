package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.C5949f;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6101n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.v */
/* compiled from: ResourceCacheGenerator */
class C5993v implements C5949f, C6034d.C6035a<Object> {

    /* renamed from: f */
    private final C5949f.C5950a f11024f;

    /* renamed from: g */
    private final C5951g<?> f11025g;

    /* renamed from: h */
    private int f11026h;

    /* renamed from: i */
    private int f11027i = -1;

    /* renamed from: j */
    private C6022f f11028j;

    /* renamed from: k */
    private List<C6101n<File, ?>> f11029k;

    /* renamed from: l */
    private int f11030l;

    /* renamed from: m */
    private volatile C6101n.C6102a<?> f11031m;

    /* renamed from: n */
    private File f11032n;

    /* renamed from: o */
    private C5994w f11033o;

    C5993v(C5951g<?> gVar, C5949f.C5950a aVar) {
        this.f11025g = gVar;
        this.f11024f = aVar;
    }

    /* renamed from: b */
    private boolean m11936b() {
        return this.f11030l < this.f11029k.size();
    }

    /* renamed from: a */
    public boolean mo20142a() {
        List<C6022f> c = this.f11025g.mo20159c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> k = this.f11025g.mo20168k();
        if (!k.isEmpty()) {
            while (true) {
                if (this.f11029k == null || !m11936b()) {
                    int i = this.f11027i + 1;
                    this.f11027i = i;
                    if (i >= k.size()) {
                        int i2 = this.f11026h + 1;
                        this.f11026h = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f11027i = 0;
                    }
                    C6022f fVar = c.get(this.f11026h);
                    Class cls = k.get(this.f11027i);
                    C6022f fVar2 = fVar;
                    this.f11033o = new C5994w(this.f11025g.mo20156b(), fVar2, this.f11025g.mo20169l(), this.f11025g.mo20171n(), this.f11025g.mo20163f(), this.f11025g.mo20157b(cls), cls, this.f11025g.mo20166i());
                    File a = this.f11025g.mo20161d().mo20094a(this.f11033o);
                    this.f11032n = a;
                    if (a != null) {
                        this.f11028j = fVar;
                        this.f11029k = this.f11025g.mo20152a(a);
                        this.f11030l = 0;
                    }
                } else {
                    this.f11031m = null;
                    while (!z && m11936b()) {
                        List<C6101n<File, ?>> list = this.f11029k;
                        int i3 = this.f11030l;
                        this.f11030l = i3 + 1;
                        this.f11031m = list.get(i3).mo20362a(this.f11032n, this.f11025g.mo20171n(), this.f11025g.mo20163f(), this.f11025g.mo20166i());
                        if (this.f11031m != null && this.f11025g.mo20160c(this.f11031m.f11190c.mo20323a())) {
                            this.f11031m.f11190c.mo20327a(this.f11025g.mo20167j(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f11025g.mo20170m())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f11025g.mo20165h() + " to " + this.f11025g.mo20170m());
        }
    }

    public void cancel() {
        C6101n.C6102a<?> aVar = this.f11031m;
        if (aVar != null) {
            aVar.f11190c.cancel();
        }
    }

    /* renamed from: a */
    public void mo20141a(Object obj) {
        this.f11024f.mo20147a(this.f11028j, obj, this.f11031m.f11190c, C5901a.RESOURCE_DISK_CACHE, this.f11033o);
    }

    /* renamed from: a */
    public void mo20140a(Exception exc) {
        this.f11024f.mo20146a(this.f11033o, exc, this.f11031m.f11190c, C5901a.RESOURCE_DISK_CACHE);
    }
}
