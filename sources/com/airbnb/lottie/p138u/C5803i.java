package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.i */
/* compiled from: FloatParser */
public class C5803i implements C5806j0<Float> {

    /* renamed from: a */
    public static final C5803i f10473a = new C5803i();

    private C5803i() {
    }

    /* renamed from: a */
    public Float m11291a(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(C5812p.m11306b(jsonReader) * f);
    }
}
