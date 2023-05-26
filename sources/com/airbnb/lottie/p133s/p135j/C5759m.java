package com.airbnb.lottie.p133s.p135j;

import android.graphics.Path;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p130a.C5684b;
import com.airbnb.lottie.p129q.p130a.C5688f;
import com.airbnb.lottie.p133s.p134i.C5730a;
import com.airbnb.lottie.p133s.p134i.C5733d;
import com.airbnb.lottie.p133s.p136k.C5768a;

/* renamed from: com.airbnb.lottie.s.j.m */
/* compiled from: ShapeFill */
public class C5759m implements C5745b {

    /* renamed from: a */
    private final boolean f10333a;

    /* renamed from: b */
    private final Path.FillType f10334b;

    /* renamed from: c */
    private final String f10335c;

    /* renamed from: d */
    private final C5730a f10336d;

    /* renamed from: e */
    private final C5733d f10337e;

    public C5759m(String str, boolean z, Path.FillType fillType, C5730a aVar, C5733d dVar) {
        this.f10335c = str;
        this.f10333a = z;
        this.f10334b = fillType;
        this.f10336d = aVar;
        this.f10337e = dVar;
    }

    /* renamed from: a */
    public C5730a mo19629a() {
        return this.f10336d;
    }

    /* renamed from: b */
    public Path.FillType mo19630b() {
        return this.f10334b;
    }

    /* renamed from: c */
    public String mo19631c() {
        return this.f10335c;
    }

    /* renamed from: d */
    public C5733d mo19632d() {
        return this.f10337e;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f10333a + '}';
    }

    /* renamed from: a */
    public C5684b mo19563a(C5656f fVar, C5768a aVar) {
        return new C5688f(fVar, aVar, this);
    }
}
