package com.airbnb.lottie;

import android.graphics.Rect;
import android.util.Log;
import com.airbnb.lottie.p133s.C5724c;
import com.airbnb.lottie.p133s.C5725d;
import com.airbnb.lottie.p133s.p136k.C5774d;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p050l.p066e.C4873d;
import p050l.p066e.C4882h;

/* renamed from: com.airbnb.lottie.d */
/* compiled from: LottieComposition */
public class C5648d {

    /* renamed from: a */
    private final C5675m f9963a = new C5675m();

    /* renamed from: b */
    private final HashSet<String> f9964b = new HashSet<>();

    /* renamed from: c */
    private Map<String, List<C5774d>> f9965c;

    /* renamed from: d */
    private Map<String, C5667g> f9966d;

    /* renamed from: e */
    private Map<String, C5724c> f9967e;

    /* renamed from: f */
    private C4882h<C5725d> f9968f;

    /* renamed from: g */
    private C4873d<C5774d> f9969g;

    /* renamed from: h */
    private List<C5774d> f9970h;

    /* renamed from: i */
    private Rect f9971i;

    /* renamed from: j */
    private float f9972j;

    /* renamed from: k */
    private float f9973k;

    /* renamed from: l */
    private float f9974l;

    /* renamed from: a */
    public void mo19391a(Rect rect, float f, float f2, float f3, List<C5774d> list, C4873d<C5774d> dVar, Map<String, List<C5774d>> map, Map<String, C5667g> map2, C4882h<C5725d> hVar, Map<String, C5724c> map3) {
        this.f9971i = rect;
        this.f9972j = f;
        this.f9973k = f2;
        this.f9974l = f3;
        this.f9970h = list;
        this.f9969g = dVar;
        this.f9965c = map;
        this.f9966d = map2;
        this.f9968f = hVar;
        this.f9967e = map3;
    }

    /* renamed from: b */
    public List<C5774d> mo19394b(String str) {
        return this.f9965c.get(str);
    }

    /* renamed from: c */
    public float mo19396c() {
        return (float) ((long) ((mo19397d() / this.f9974l) * 1000.0f));
    }

    /* renamed from: d */
    public float mo19397d() {
        return this.f9973k - this.f9972j;
    }

    /* renamed from: e */
    public float mo19398e() {
        return this.f9973k;
    }

    /* renamed from: f */
    public Map<String, C5724c> mo19399f() {
        return this.f9967e;
    }

    /* renamed from: g */
    public float mo19400g() {
        return this.f9974l;
    }

    /* renamed from: h */
    public Map<String, C5667g> mo19401h() {
        return this.f9966d;
    }

    /* renamed from: i */
    public List<C5774d> mo19402i() {
        return this.f9970h;
    }

    /* renamed from: j */
    public C5675m mo19403j() {
        return this.f9963a;
    }

    /* renamed from: k */
    public float mo19404k() {
        return this.f9972j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C5774d a : this.f9970h) {
            sb.append(a.mo19667a("\t"));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C4882h<C5725d> mo19395b() {
        return this.f9968f;
    }

    /* renamed from: a */
    public void mo19392a(String str) {
        Log.w("LOTTIE", str);
        this.f9964b.add(str);
    }

    /* renamed from: a */
    public void mo19393a(boolean z) {
        this.f9963a.mo19485a(z);
    }

    /* renamed from: a */
    public C5774d mo19390a(long j) {
        return this.f9969g.mo16936a(j);
    }

    /* renamed from: a */
    public Rect mo19389a() {
        return this.f9971i;
    }
}
