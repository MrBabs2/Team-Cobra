package com.google.zxing.p198h.p199b;

import com.google.zxing.C8807b;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.zxing.h.b.h */
/* compiled from: EncoderContext */
final class C8835h {

    /* renamed from: a */
    private final String f25094a;

    /* renamed from: b */
    private C8839l f25095b;

    /* renamed from: c */
    private C8807b f25096c;

    /* renamed from: d */
    private C8807b f25097d;

    /* renamed from: e */
    private final StringBuilder f25098e;

    /* renamed from: f */
    int f25099f;

    /* renamed from: g */
    private int f25100g;

    /* renamed from: h */
    private C8838k f25101h;

    /* renamed from: i */
    private int f25102i;

    C8835h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f25094a = sb.toString();
        this.f25095b = C8839l.FORCE_NONE;
        this.f25098e = new StringBuilder(str.length());
        this.f25100g = -1;
    }

    /* renamed from: l */
    private int m28855l() {
        return this.f25094a.length() - this.f25102i;
    }

    /* renamed from: a */
    public void mo32623a(C8839l lVar) {
        this.f25095b = lVar;
    }

    /* renamed from: b */
    public StringBuilder mo32625b() {
        return this.f25098e;
    }

    /* renamed from: c */
    public char mo32627c() {
        return this.f25094a.charAt(this.f25099f);
    }

    /* renamed from: d */
    public String mo32629d() {
        return this.f25094a;
    }

    /* renamed from: e */
    public int mo32630e() {
        return this.f25100g;
    }

    /* renamed from: f */
    public int mo32631f() {
        return m28855l() - this.f25099f;
    }

    /* renamed from: g */
    public C8838k mo32632g() {
        return this.f25101h;
    }

    /* renamed from: h */
    public boolean mo32633h() {
        return this.f25099f < m28855l();
    }

    /* renamed from: i */
    public void mo32634i() {
        this.f25100g = -1;
    }

    /* renamed from: j */
    public void mo32635j() {
        this.f25101h = null;
    }

    /* renamed from: k */
    public void mo32636k() {
        mo32628c(mo32619a());
    }

    /* renamed from: a */
    public void mo32622a(C8807b bVar, C8807b bVar2) {
        this.f25096c = bVar;
        this.f25097d = bVar2;
    }

    /* renamed from: b */
    public void mo32626b(int i) {
        this.f25100g = i;
    }

    /* renamed from: c */
    public void mo32628c(int i) {
        C8838k kVar = this.f25101h;
        if (kVar == null || i > kVar.mo32637a()) {
            this.f25101h = C8838k.m28892a(i, this.f25095b, this.f25096c, this.f25097d, true);
        }
    }

    /* renamed from: a */
    public void mo32621a(int i) {
        this.f25102i = i;
    }

    /* renamed from: a */
    public void mo32624a(String str) {
        this.f25098e.append(str);
    }

    /* renamed from: a */
    public void mo32620a(char c) {
        this.f25098e.append(c);
    }

    /* renamed from: a */
    public int mo32619a() {
        return this.f25098e.length();
    }
}
