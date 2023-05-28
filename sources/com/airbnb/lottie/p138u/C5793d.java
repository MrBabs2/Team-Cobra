package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5730a;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5732c;
import com.airbnb.lottie.p133s.p134i.C5733d;
import com.airbnb.lottie.p133s.p134i.C5735f;
import com.airbnb.lottie.p133s.p134i.C5736g;
import com.airbnb.lottie.p133s.p134i.C5737h;
import com.airbnb.lottie.p133s.p134i.C5739j;
import com.airbnb.lottie.p139v.C5829f;
import com.airbnb.lottie.p140w.C5830a;
import com.airbnb.lottie.p140w.C5833d;
import java.io.IOException;
import java.util.List;

/* renamed from: com.airbnb.lottie.u.d */
/* compiled from: AnimatableValueParser */
public class C5793d {
    /* renamed from: a */
    public static C5731b m11268a(JsonReader jsonReader, C5648d dVar, boolean z) throws IOException {
        return new C5731b(m11270a(jsonReader, z ? C5829f.m11376a() : 1.0f, dVar, C5803i.f10473a));
    }

    /* renamed from: b */
    static C5739j m11272b(JsonReader jsonReader, C5648d dVar) throws IOException {
        return new C5739j(m11271a(jsonReader, dVar, C5801h.f10472a));
    }

    /* renamed from: c */
    public static C5731b m11273c(JsonReader jsonReader, C5648d dVar) throws IOException {
        return m11268a(jsonReader, dVar, true);
    }

    /* renamed from: d */
    static C5733d m11274d(JsonReader jsonReader, C5648d dVar) throws IOException {
        return new C5733d(m11271a(jsonReader, dVar, C5811o.f10475a));
    }

    /* renamed from: e */
    static C5735f m11275e(JsonReader jsonReader, C5648d dVar) throws IOException {
        return new C5735f(m11270a(jsonReader, C5829f.m11376a(), dVar, C5822y.f10480a));
    }

    /* renamed from: f */
    static C5736g m11276f(JsonReader jsonReader, C5648d dVar) throws IOException {
        return new C5736g((List<C5830a<C5833d>>) m11271a(jsonReader, dVar, C5792c0.f10469a));
    }

    /* renamed from: g */
    static C5737h m11277g(JsonReader jsonReader, C5648d dVar) throws IOException {
        return new C5737h(m11270a(jsonReader, C5829f.m11376a(), dVar, C5794d0.f10470a));
    }

    /* renamed from: a */
    static C5730a m11267a(JsonReader jsonReader, C5648d dVar) throws IOException {
        return new C5730a(m11271a(jsonReader, dVar, C5797f.f10471a));
    }

    /* renamed from: a */
    static C5732c m11269a(JsonReader jsonReader, C5648d dVar, int i) throws IOException {
        return new C5732c(m11271a(jsonReader, dVar, new C5808l(i)));
    }

    /* renamed from: a */
    private static <T> List<C5830a<T>> m11271a(JsonReader jsonReader, C5648d dVar, C5806j0<T> j0Var) throws IOException {
        return C5815r.m11317a(jsonReader, dVar, 1.0f, j0Var);
    }

    /* renamed from: a */
    private static <T> List<C5830a<T>> m11270a(JsonReader jsonReader, float f, C5648d dVar, C5806j0<T> j0Var) throws IOException {
        return C5815r.m11317a(jsonReader, dVar, f, j0Var);
    }
}
