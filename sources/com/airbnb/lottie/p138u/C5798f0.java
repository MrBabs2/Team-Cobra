package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p135j.C5745b;
import com.airbnb.lottie.p133s.p135j.C5760n;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.u.f0 */
/* compiled from: ShapeGroupParser */
class C5798f0 {
    /* renamed from: a */
    static C5760n m11284a(JsonReader jsonReader, C5648d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3371) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("it")) {
                c = 1;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C5745b a = C5799g.m11285a(jsonReader, dVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                jsonReader.endArray();
            }
        }
        return new C5760n(str, arrayList);
    }
}
