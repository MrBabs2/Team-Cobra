package com.bumptech.glide.load.p150n;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.p166r.C6315j;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.g */
/* compiled from: GlideUrl */
public class C6087g implements C6022f {

    /* renamed from: b */
    private final C6088h f11164b;

    /* renamed from: c */
    private final URL f11165c;

    /* renamed from: d */
    private final String f11166d;

    /* renamed from: e */
    private String f11167e;

    /* renamed from: f */
    private URL f11168f;

    /* renamed from: g */
    private volatile byte[] f11169g;

    /* renamed from: h */
    private int f11170h;

    public C6087g(URL url) {
        this(url, C6088h.f11171a);
    }

    /* renamed from: d */
    private byte[] m12247d() {
        if (this.f11169g == null) {
            this.f11169g = mo20385a().getBytes(C6022f.f11096a);
        }
        return this.f11169g;
    }

    /* renamed from: e */
    private String m12248e() {
        if (TextUtils.isEmpty(this.f11167e)) {
            String str = this.f11166d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f11165c;
                C6315j.m12978a(url);
                str = url.toString();
            }
            this.f11167e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f11167e;
    }

    /* renamed from: f */
    private URL m12249f() throws MalformedURLException {
        if (this.f11168f == null) {
            this.f11168f = new URL(m12248e());
        }
        return this.f11168f;
    }

    /* renamed from: a */
    public String mo20385a() {
        String str = this.f11166d;
        if (str != null) {
            return str;
        }
        URL url = this.f11165c;
        C6315j.m12978a(url);
        return url.toString();
    }

    /* renamed from: b */
    public Map<String, String> mo20386b() {
        return this.f11164b.mo20389a();
    }

    /* renamed from: c */
    public URL mo20387c() throws MalformedURLException {
        return m12249f();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6087g)) {
            return false;
        }
        C6087g gVar = (C6087g) obj;
        if (!mo20385a().equals(gVar.mo20385a()) || !this.f11164b.equals(gVar.f11164b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f11170h == 0) {
            int hashCode = mo20385a().hashCode();
            this.f11170h = hashCode;
            this.f11170h = (hashCode * 31) + this.f11164b.hashCode();
        }
        return this.f11170h;
    }

    public String toString() {
        return mo20385a();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m12247d());
    }

    public C6087g(String str) {
        this(str, C6088h.f11171a);
    }

    public C6087g(URL url, C6088h hVar) {
        C6315j.m12978a(url);
        this.f11165c = url;
        this.f11166d = null;
        C6315j.m12978a(hVar);
        this.f11164b = hVar;
    }

    public C6087g(String str, C6088h hVar) {
        this.f11165c = null;
        C6315j.m12980a(str);
        this.f11166d = str;
        C6315j.m12978a(hVar);
        this.f11164b = hVar;
    }
}
