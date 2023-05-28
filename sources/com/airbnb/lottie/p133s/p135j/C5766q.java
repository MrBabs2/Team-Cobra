package com.airbnb.lottie.p133s.p135j;

import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p130a.C5684b;
import com.airbnb.lottie.p129q.p130a.C5702r;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p136k.C5768a;

/* renamed from: com.airbnb.lottie.s.j.q */
/* compiled from: ShapeTrimPath */
public class C5766q implements C5745b {

    /* renamed from: a */
    private final String f10362a;

    /* renamed from: b */
    private final C5767a f10363b;

    /* renamed from: c */
    private final C5731b f10364c;

    /* renamed from: d */
    private final C5731b f10365d;

    /* renamed from: e */
    private final C5731b f10366e;

    /* renamed from: com.airbnb.lottie.s.j.q$a */
    /* compiled from: ShapeTrimPath */
    public enum C5767a {
        Simultaneously,
        Individually;

        /* renamed from: a */
        public static C5767a m11168a(int i) {
            if (i == 1) {
                return Simultaneously;
            }
            if (i == 2) {
                return Individually;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public C5766q(String str, C5767a aVar, C5731b bVar, C5731b bVar2, C5731b bVar3) {
        this.f10362a = str;
        this.f10363b = aVar;
        this.f10364c = bVar;
        this.f10365d = bVar2;
        this.f10366e = bVar3;
    }

    /* renamed from: a */
    public C5731b mo19651a() {
        return this.f10365d;
    }

    /* renamed from: b */
    public String mo19652b() {
        return this.f10362a;
    }

    /* renamed from: c */
    public C5731b mo19653c() {
        return this.f10366e;
    }

    /* renamed from: d */
    public C5731b mo19654d() {
        return this.f10364c;
    }

    /* renamed from: e */
    public C5767a mo19655e() {
        return this.f10363b;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f10364c + ", end: " + this.f10365d + ", offset: " + this.f10366e + "}";
    }

    /* renamed from: a */
    public C5684b mo19563a(C5656f fVar, C5768a aVar) {
        return new C5702r(aVar, this);
    }
}
