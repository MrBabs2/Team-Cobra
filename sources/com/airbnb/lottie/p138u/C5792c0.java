package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p140w.C5833d;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.c0 */
/* compiled from: ScaleXYParser */
public class C5792c0 implements C5806j0<C5833d> {

    /* renamed from: a */
    public static final C5792c0 f10469a = new C5792c0();

    private C5792c0() {
    }

    /* renamed from: a */
    public C5833d m11266a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C5833d((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
