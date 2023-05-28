package com.airbnb.lottie.p133s;

import com.airbnb.lottie.p133s.p135j.C5760n;
import java.util.List;

/* renamed from: com.airbnb.lottie.s.d */
/* compiled from: FontCharacter */
public class C5725d {

    /* renamed from: a */
    private final List<C5760n> f10240a;

    /* renamed from: b */
    private final char f10241b;

    /* renamed from: c */
    private final double f10242c;

    /* renamed from: d */
    private final String f10243d;

    /* renamed from: e */
    private final String f10244e;

    public C5725d(List<C5760n> list, char c, double d, double d2, String str, String str2) {
        this.f10240a = list;
        this.f10241b = c;
        this.f10242c = d2;
        this.f10243d = str;
        this.f10244e = str2;
    }

    /* renamed from: a */
    public static int m11035a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: b */
    public double mo19546b() {
        return this.f10242c;
    }

    public int hashCode() {
        return m11035a(this.f10241b, this.f10244e, this.f10243d);
    }

    /* renamed from: a */
    public List<C5760n> mo19545a() {
        return this.f10240a;
    }
}
