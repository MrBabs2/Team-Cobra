package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.p166r.C6312g;
import com.bumptech.glide.p166r.C6316k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.w */
/* compiled from: ResourceCacheKey */
final class C5994w implements C6022f {

    /* renamed from: j */
    private static final C6312g<Class<?>, byte[]> f11034j = new C6312g<>(50);

    /* renamed from: b */
    private final C5999b f11035b;

    /* renamed from: c */
    private final C6022f f11036c;

    /* renamed from: d */
    private final C6022f f11037d;

    /* renamed from: e */
    private final int f11038e;

    /* renamed from: f */
    private final int f11039f;

    /* renamed from: g */
    private final Class<?> f11040g;

    /* renamed from: h */
    private final C6027i f11041h;

    /* renamed from: i */
    private final C6030l<?> f11042i;

    C5994w(C5999b bVar, C6022f fVar, C6022f fVar2, int i, int i2, C6030l<?> lVar, Class<?> cls, C6027i iVar) {
        this.f11035b = bVar;
        this.f11036c = fVar;
        this.f11037d = fVar2;
        this.f11038e = i;
        this.f11039f = i2;
        this.f11042i = lVar;
        this.f11040g = cls;
        this.f11041h = iVar;
    }

    /* renamed from: a */
    private byte[] m11940a() {
        byte[] a = f11034j.mo20756a(this.f11040g);
        if (a != null) {
            return a;
        }
        byte[] bytes = this.f11040g.getName().getBytes(C6022f.f11096a);
        f11034j.mo20760b(this.f11040g, bytes);
        return bytes;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5994w)) {
            return false;
        }
        C5994w wVar = (C5994w) obj;
        if (this.f11039f != wVar.f11039f || this.f11038e != wVar.f11038e || !C6316k.m13000b((Object) this.f11042i, (Object) wVar.f11042i) || !this.f11040g.equals(wVar.f11040g) || !this.f11036c.equals(wVar.f11036c) || !this.f11037d.equals(wVar.f11037d) || !this.f11041h.equals(wVar.f11041h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f11036c.hashCode() * 31) + this.f11037d.hashCode()) * 31) + this.f11038e) * 31) + this.f11039f;
        C6030l<?> lVar = this.f11042i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f11040g.hashCode()) * 31) + this.f11041h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f11036c + ", signature=" + this.f11037d + ", width=" + this.f11038e + ", height=" + this.f11039f + ", decodedResourceClass=" + this.f11040g + ", transformation='" + this.f11042i + '\'' + ", options=" + this.f11041h + '}';
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f11035b.mo20259a(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f11038e).putInt(this.f11039f).array();
        this.f11037d.updateDiskCacheKey(messageDigest);
        this.f11036c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        C6030l<?> lVar = this.f11042i;
        if (lVar != null) {
            lVar.updateDiskCacheKey(messageDigest);
        }
        this.f11041h.updateDiskCacheKey(messageDigest);
        messageDigest.update(m11940a());
        this.f11035b.mo20262a(bArr);
    }
}
