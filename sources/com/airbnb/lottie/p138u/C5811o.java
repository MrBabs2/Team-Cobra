package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.o */
/* compiled from: IntegerParser */
public class C5811o implements C5806j0<Integer> {

    /* renamed from: a */
    public static final C5811o f10475a = new C5811o();

    private C5811o() {
    }

    /* renamed from: a */
    public Integer m11303a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(C5812p.m11306b(jsonReader) * f));
    }
}
