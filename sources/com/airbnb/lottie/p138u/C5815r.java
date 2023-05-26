package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p140w.C5830a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.u.r */
/* compiled from: KeyframesParser */
class C5815r {
    /* renamed from: a */
    static <T> List<C5830a<T>> m11317a(JsonReader jsonReader, C5648d dVar, float f, C5806j0<T> j0Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            dVar.mo19392a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 107 && nextName.equals("k")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C5814q.m11312a(jsonReader, dVar, f, j0Var, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C5814q.m11312a(jsonReader, dVar, f, j0Var, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C5814q.m11312a(jsonReader, dVar, f, j0Var, false));
            }
        }
        jsonReader.endObject();
        m11318a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static void m11318a(List<? extends C5830a<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            i2++;
            ((C5830a) list.get(i2)).f10505f = Float.valueOf(((C5830a) list.get(i2)).f10504e);
        }
        C5830a aVar = (C5830a) list.get(i);
        if (aVar.f10501b == null) {
            list.remove(aVar);
        }
    }
}
