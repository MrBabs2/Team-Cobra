package com.airbnb.lottie.p133s.p135j;

import android.graphics.PointF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p130a.C5684b;
import com.airbnb.lottie.p129q.p130a.C5696m;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5742m;
import com.airbnb.lottie.p133s.p136k.C5768a;

/* renamed from: com.airbnb.lottie.s.j.i */
/* compiled from: PolystarShape */
public class C5754i implements C5745b {

    /* renamed from: a */
    private final String f10309a;

    /* renamed from: b */
    private final C5755a f10310b;

    /* renamed from: c */
    private final C5731b f10311c;

    /* renamed from: d */
    private final C5742m<PointF, PointF> f10312d;

    /* renamed from: e */
    private final C5731b f10313e;

    /* renamed from: f */
    private final C5731b f10314f;

    /* renamed from: g */
    private final C5731b f10315g;

    /* renamed from: h */
    private final C5731b f10316h;

    /* renamed from: i */
    private final C5731b f10317i;

    /* renamed from: com.airbnb.lottie.s.j.i$a */
    /* compiled from: PolystarShape */
    public enum C5755a {
        Star(1),
        Polygon(2);
        

        /* renamed from: f */
        private final int f10321f;

        private C5755a(int i) {
            this.f10321f = i;
        }

        /* renamed from: a */
        public static C5755a m11123a(int i) {
            for (C5755a aVar : values()) {
                if (aVar.f10321f == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C5754i(String str, C5755a aVar, C5731b bVar, C5742m<PointF, PointF> mVar, C5731b bVar2, C5731b bVar3, C5731b bVar4, C5731b bVar5, C5731b bVar6) {
        this.f10309a = str;
        this.f10310b = aVar;
        this.f10311c = bVar;
        this.f10312d = mVar;
        this.f10313e = bVar2;
        this.f10314f = bVar3;
        this.f10315g = bVar4;
        this.f10316h = bVar5;
        this.f10317i = bVar6;
    }

    /* renamed from: a */
    public C5731b mo19606a() {
        return this.f10314f;
    }

    /* renamed from: b */
    public C5731b mo19607b() {
        return this.f10316h;
    }

    /* renamed from: c */
    public String mo19608c() {
        return this.f10309a;
    }

    /* renamed from: d */
    public C5731b mo19609d() {
        return this.f10315g;
    }

    /* renamed from: e */
    public C5731b mo19610e() {
        return this.f10317i;
    }

    /* renamed from: f */
    public C5731b mo19611f() {
        return this.f10311c;
    }

    /* renamed from: g */
    public C5742m<PointF, PointF> mo19612g() {
        return this.f10312d;
    }

    /* renamed from: h */
    public C5731b mo19613h() {
        return this.f10313e;
    }

    /* renamed from: i */
    public C5755a mo19614i() {
        return this.f10310b;
    }

    /* renamed from: a */
    public C5684b mo19563a(C5656f fVar, C5768a aVar) {
        return new C5696m(fVar, aVar, this);
    }
}
