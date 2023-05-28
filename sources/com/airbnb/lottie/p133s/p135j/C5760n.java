package com.airbnb.lottie.p133s.p135j;

import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p130a.C5684b;
import com.airbnb.lottie.p129q.p130a.C5685c;
import com.airbnb.lottie.p133s.p136k.C5768a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.s.j.n */
/* compiled from: ShapeGroup */
public class C5760n implements C5745b {

    /* renamed from: a */
    private final String f10338a;

    /* renamed from: b */
    private final List<C5745b> f10339b;

    public C5760n(String str, List<C5745b> list) {
        this.f10338a = str;
        this.f10339b = list;
    }

    /* renamed from: a */
    public List<C5745b> mo19634a() {
        return this.f10339b;
    }

    /* renamed from: b */
    public String mo19635b() {
        return this.f10338a;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f10338a + "' Shapes: " + Arrays.toString(this.f10339b.toArray()) + '}';
    }

    /* renamed from: a */
    public C5684b mo19563a(C5656f fVar, C5768a aVar) {
        return new C5685c(fVar, aVar, this);
    }
}
