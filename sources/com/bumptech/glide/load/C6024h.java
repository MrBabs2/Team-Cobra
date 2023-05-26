package com.bumptech.glide.load;

import com.bumptech.glide.p166r.C6315j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.h */
/* compiled from: Option */
public final class C6024h<T> {

    /* renamed from: e */
    private static final C6026b<Object> f11098e = new C6025a();

    /* renamed from: a */
    private final T f11099a;

    /* renamed from: b */
    private final C6026b<T> f11100b;

    /* renamed from: c */
    private final String f11101c;

    /* renamed from: d */
    private volatile byte[] f11102d;

    /* renamed from: com.bumptech.glide.load.h$a */
    /* compiled from: Option */
    class C6025a implements C6026b<Object> {
        C6025a() {
        }

        /* renamed from: a */
        public void mo20314a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.h$b */
    /* compiled from: Option */
    public interface C6026b<T> {
        /* renamed from: a */
        void mo20314a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C6024h(String str, T t, C6026b<T> bVar) {
        C6315j.m12980a(str);
        this.f11101c = str;
        this.f11099a = t;
        C6315j.m12978a(bVar);
        this.f11100b = bVar;
    }

    /* renamed from: a */
    public static <T> C6024h<T> m12061a(String str) {
        return new C6024h<>(str, (Object) null, m12064b());
    }

    /* renamed from: b */
    private static <T> C6026b<T> m12064b() {
        return f11098e;
    }

    /* renamed from: c */
    private byte[] m12065c() {
        if (this.f11102d == null) {
            this.f11102d = this.f11101c.getBytes(C6022f.f11096a);
        }
        return this.f11102d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6024h) {
            return this.f11101c.equals(((C6024h) obj).f11101c);
        }
        return false;
    }

    public int hashCode() {
        return this.f11101c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f11101c + '\'' + '}';
    }

    /* renamed from: a */
    public static <T> C6024h<T> m12062a(String str, T t) {
        return new C6024h<>(str, t, m12064b());
    }

    /* renamed from: a */
    public static <T> C6024h<T> m12063a(String str, T t, C6026b<T> bVar) {
        return new C6024h<>(str, t, bVar);
    }

    /* renamed from: a */
    public T mo20309a() {
        return this.f11099a;
    }

    /* renamed from: a */
    public void mo20310a(T t, MessageDigest messageDigest) {
        this.f11100b.mo20314a(m12065c(), t, messageDigest);
    }
}
