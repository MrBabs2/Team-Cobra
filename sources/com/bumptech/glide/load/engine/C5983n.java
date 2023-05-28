package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.p166r.C6315j;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.n */
/* compiled from: EngineKey */
class C5983n implements C6022f {

    /* renamed from: b */
    private final Object f10998b;

    /* renamed from: c */
    private final int f10999c;

    /* renamed from: d */
    private final int f11000d;

    /* renamed from: e */
    private final Class<?> f11001e;

    /* renamed from: f */
    private final Class<?> f11002f;

    /* renamed from: g */
    private final C6022f f11003g;

    /* renamed from: h */
    private final Map<Class<?>, C6030l<?>> f11004h;

    /* renamed from: i */
    private final C6027i f11005i;

    /* renamed from: j */
    private int f11006j;

    C5983n(Object obj, C6022f fVar, int i, int i2, Map<Class<?>, C6030l<?>> map, Class<?> cls, Class<?> cls2, C6027i iVar) {
        C6315j.m12978a(obj);
        this.f10998b = obj;
        C6315j.m12979a(fVar, "Signature must not be null");
        this.f11003g = fVar;
        this.f10999c = i;
        this.f11000d = i2;
        C6315j.m12978a(map);
        this.f11004h = map;
        C6315j.m12979a(cls, "Resource class must not be null");
        this.f11001e = cls;
        C6315j.m12979a(cls2, "Transcode class must not be null");
        this.f11002f = cls2;
        C6315j.m12978a(iVar);
        this.f11005i = iVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5983n)) {
            return false;
        }
        C5983n nVar = (C5983n) obj;
        if (!this.f10998b.equals(nVar.f10998b) || !this.f11003g.equals(nVar.f11003g) || this.f11000d != nVar.f11000d || this.f10999c != nVar.f10999c || !this.f11004h.equals(nVar.f11004h) || !this.f11001e.equals(nVar.f11001e) || !this.f11002f.equals(nVar.f11002f) || !this.f11005i.equals(nVar.f11005i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f11006j == 0) {
            int hashCode = this.f10998b.hashCode();
            this.f11006j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f11003g.hashCode();
            this.f11006j = hashCode2;
            int i = (hashCode2 * 31) + this.f10999c;
            this.f11006j = i;
            int i2 = (i * 31) + this.f11000d;
            this.f11006j = i2;
            int hashCode3 = (i2 * 31) + this.f11004h.hashCode();
            this.f11006j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f11001e.hashCode();
            this.f11006j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f11002f.hashCode();
            this.f11006j = hashCode5;
            this.f11006j = (hashCode5 * 31) + this.f11005i.hashCode();
        }
        return this.f11006j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f10998b + ", width=" + this.f10999c + ", height=" + this.f11000d + ", resourceClass=" + this.f11001e + ", transcodeClass=" + this.f11002f + ", signature=" + this.f11003g + ", hashCode=" + this.f11006j + ", transformations=" + this.f11004h + ", options=" + this.f11005i + '}';
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
