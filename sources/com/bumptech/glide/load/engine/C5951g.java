package com.bumptech.glide.load.engine;

import com.bumptech.glide.C5876e;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C5904d;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6029k;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.C5952h;
import com.bumptech.glide.load.engine.p144a0.C5913a;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.load.p152o.C6144b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.g */
/* compiled from: DecodeHelper */
final class C5951g<Transcode> {

    /* renamed from: a */
    private final List<C6101n.C6102a<?>> f10862a = new ArrayList();

    /* renamed from: b */
    private final List<C6022f> f10863b = new ArrayList();

    /* renamed from: c */
    private C5876e f10864c;

    /* renamed from: d */
    private Object f10865d;

    /* renamed from: e */
    private int f10866e;

    /* renamed from: f */
    private int f10867f;

    /* renamed from: g */
    private Class<?> f10868g;

    /* renamed from: h */
    private C5952h.C5957e f10869h;

    /* renamed from: i */
    private C6027i f10870i;

    /* renamed from: j */
    private Map<Class<?>, C6030l<?>> f10871j;

    /* renamed from: k */
    private Class<Transcode> f10872k;

    /* renamed from: l */
    private boolean f10873l;

    /* renamed from: m */
    private boolean f10874m;

    /* renamed from: n */
    private C6022f f10875n;

    /* renamed from: o */
    private C5878g f10876o;

    /* renamed from: p */
    private C5963j f10877p;

    /* renamed from: q */
    private boolean f10878q;

    /* renamed from: r */
    private boolean f10879r;

    C5951g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <R> void mo20154a(C5876e eVar, Object obj, C6022f fVar, int i, int i2, C5963j jVar, Class<?> cls, Class<R> cls2, C5878g gVar, C6027i iVar, Map<Class<?>, C6030l<?>> map, boolean z, boolean z2, C5952h.C5957e eVar2) {
        this.f10864c = eVar;
        this.f10865d = obj;
        this.f10875n = fVar;
        this.f10866e = i;
        this.f10867f = i2;
        this.f10877p = jVar;
        this.f10868g = cls;
        this.f10869h = eVar2;
        this.f10872k = cls2;
        this.f10876o = gVar;
        this.f10870i = iVar;
        this.f10871j = map;
        this.f10878q = z;
        this.f10879r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5999b mo20156b() {
        return this.f10864c.mo19973a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo20160c(Class<?> cls) {
        return mo20150a(cls) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5913a mo20161d() {
        return this.f10869h.mo20189a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5963j mo20162e() {
        return this.f10877p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo20163f() {
        return this.f10867f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C6101n.C6102a<?>> mo20164g() {
        if (!this.f10873l) {
            this.f10873l = true;
            this.f10862a.clear();
            List a = this.f10864c.mo19979f().mo19945a(this.f10865d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C6101n.C6102a a2 = ((C6101n) a.get(i)).mo20362a(this.f10865d, this.f10866e, this.f10867f, this.f10870i);
                if (a2 != null) {
                    this.f10862a.add(a2);
                }
            }
        }
        return this.f10862a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Class<?> mo20165h() {
        return this.f10865d.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C6027i mo20166i() {
        return this.f10870i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C5878g mo20167j() {
        return this.f10876o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<Class<?>> mo20168k() {
        return this.f10864c.mo19979f().mo19947b(this.f10865d.getClass(), this.f10868g, this.f10872k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C6022f mo20169l() {
        return this.f10875n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Class<?> mo20170m() {
        return this.f10872k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo20171n() {
        return this.f10866e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo20172o() {
        return this.f10879r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <Z> C6030l<Z> mo20157b(Class<Z> cls) {
        C6030l<Z> lVar = this.f10871j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, C6030l<?>>> it = this.f10871j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    lVar = (C6030l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f10871j.isEmpty() || !this.f10878q) {
            return C6144b.m12385a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C6022f> mo20159c() {
        if (!this.f10874m) {
            this.f10874m = true;
            this.f10863b.clear();
            List<C6101n.C6102a<?>> g = mo20164g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C6101n.C6102a aVar = g.get(i);
                if (!this.f10863b.contains(aVar.f11188a)) {
                    this.f10863b.add(aVar.f11188a);
                }
                for (int i2 = 0; i2 < aVar.f11189b.size(); i2++) {
                    if (!this.f10863b.contains(aVar.f11189b.get(i2))) {
                        this.f10863b.add(aVar.f11189b.get(i2));
                    }
                }
            }
        }
        return this.f10863b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo20158b(C5992u<?> uVar) {
        return this.f10864c.mo19979f().mo19948b(uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20153a() {
        this.f10864c = null;
        this.f10865d = null;
        this.f10875n = null;
        this.f10868g = null;
        this.f10872k = null;
        this.f10870i = null;
        this.f10876o = null;
        this.f10871j = null;
        this.f10877p = null;
        this.f10862a.clear();
        this.f10873l = false;
        this.f10863b.clear();
        this.f10874m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <Data> C5989s<Data, ?, Transcode> mo20150a(Class<Data> cls) {
        return this.f10864c.mo19979f().mo19942a(cls, this.f10868g, this.f10872k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <Z> C6029k<Z> mo20151a(C5992u<Z> uVar) {
        return this.f10864c.mo19979f().mo19943a(uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C6101n<File, ?>> mo20152a(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f10864c.mo19979f().mo19945a(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo20155a(C6022f fVar) {
        List<C6101n.C6102a<?>> g = mo20164g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f11188a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <X> C5904d<X> mo20149a(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f10864c.mo19979f().mo19949c(x);
    }
}
