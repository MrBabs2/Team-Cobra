package com.airbnb.lottie.p138u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.y */
/* compiled from: PointFParser */
public class C5822y implements C5806j0<PointF> {

    /* renamed from: a */
    public static final C5822y f10480a = new C5822y();

    private C5822y() {
    }

    /* renamed from: a */
    public PointF m11332a(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return C5812p.m11309d(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return C5812p.m11309d(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + peek);
    }
}
