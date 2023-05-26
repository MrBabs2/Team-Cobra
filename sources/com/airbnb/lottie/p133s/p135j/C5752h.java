package com.airbnb.lottie.p133s.p135j;

import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p130a.C5684b;
import com.airbnb.lottie.p129q.p130a.C5693k;
import com.airbnb.lottie.p133s.p136k.C5768a;

/* renamed from: com.airbnb.lottie.s.j.h */
/* compiled from: MergePaths */
public class C5752h implements C5745b {

    /* renamed from: a */
    private final String f10301a;

    /* renamed from: b */
    private final C5753a f10302b;

    /* renamed from: com.airbnb.lottie.s.j.h$a */
    /* compiled from: MergePaths */
    public enum C5753a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        /* renamed from: a */
        public static C5753a m11112a(int i) {
            if (i == 1) {
                return Merge;
            }
            if (i == 2) {
                return Add;
            }
            if (i == 3) {
                return Subtract;
            }
            if (i == 4) {
                return Intersect;
            }
            if (i != 5) {
                return Merge;
            }
            return ExcludeIntersections;
        }
    }

    public C5752h(String str, C5753a aVar) {
        this.f10301a = str;
        this.f10302b = aVar;
    }

    /* renamed from: a */
    public C5753a mo19603a() {
        return this.f10302b;
    }

    /* renamed from: b */
    public String mo19604b() {
        return this.f10301a;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f10302b + '}';
    }

    /* renamed from: a */
    public C5684b mo19563a(C5656f fVar, C5768a aVar) {
        if (fVar.mo19431c()) {
            return new C5693k(this);
        }
        C5647c.m10756d("Animation contains merge paths but they are disabled.");
        return null;
    }
}
