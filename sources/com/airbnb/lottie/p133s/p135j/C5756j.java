package com.airbnb.lottie.p133s.p135j;

import android.graphics.PointF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p130a.C5684b;
import com.airbnb.lottie.p129q.p130a.C5698n;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5735f;
import com.airbnb.lottie.p133s.p134i.C5742m;
import com.airbnb.lottie.p133s.p136k.C5768a;

/* renamed from: com.airbnb.lottie.s.j.j */
/* compiled from: RectangleShape */
public class C5756j implements C5745b {

    /* renamed from: a */
    private final String f10322a;

    /* renamed from: b */
    private final C5742m<PointF, PointF> f10323b;

    /* renamed from: c */
    private final C5735f f10324c;

    /* renamed from: d */
    private final C5731b f10325d;

    public C5756j(String str, C5742m<PointF, PointF> mVar, C5735f fVar, C5731b bVar) {
        this.f10322a = str;
        this.f10323b = mVar;
        this.f10324c = fVar;
        this.f10325d = bVar;
    }

    /* renamed from: a */
    public C5731b mo19615a() {
        return this.f10325d;
    }

    /* renamed from: b */
    public String mo19616b() {
        return this.f10322a;
    }

    /* renamed from: c */
    public C5742m<PointF, PointF> mo19617c() {
        return this.f10323b;
    }

    /* renamed from: d */
    public C5735f mo19618d() {
        return this.f10324c;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f10323b + ", size=" + this.f10324c + '}';
    }

    /* renamed from: a */
    public C5684b mo19563a(C5656f fVar, C5768a aVar) {
        return new C5698n(fVar, aVar, this);
    }
}
