package com.bumptech.glide.p166r;

/* renamed from: com.bumptech.glide.r.i */
/* compiled from: MultiClassKey */
public class C6314i {

    /* renamed from: a */
    private Class<?> f11567a;

    /* renamed from: b */
    private Class<?> f11568b;

    /* renamed from: c */
    private Class<?> f11569c;

    public C6314i() {
    }

    /* renamed from: a */
    public void mo20768a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f11567a = cls;
        this.f11568b = cls2;
        this.f11569c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6314i.class != obj.getClass()) {
            return false;
        }
        C6314i iVar = (C6314i) obj;
        return this.f11567a.equals(iVar.f11567a) && this.f11568b.equals(iVar.f11568b) && C6316k.m13000b((Object) this.f11569c, (Object) iVar.f11569c);
    }

    public int hashCode() {
        int hashCode = ((this.f11567a.hashCode() * 31) + this.f11568b.hashCode()) * 31;
        Class<?> cls = this.f11569c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f11567a + ", second=" + this.f11568b + '}';
    }

    public C6314i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo20768a(cls, cls2, cls3);
    }
}
