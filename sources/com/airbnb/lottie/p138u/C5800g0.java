package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5737h;
import com.airbnb.lottie.p133s.p135j.C5761o;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.g0 */
/* compiled from: ShapePathParser */
class C5800g0 {
    /* renamed from: a */
    static C5761o m11286a(JsonReader jsonReader, C5648d dVar) throws IOException {
        String str = null;
        C5737h hVar = null;
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3432) {
                if (hashCode != 3519) {
                    if (hashCode == 104415 && nextName.equals("ind")) {
                        c = 1;
                    }
                } else if (nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("ks")) {
                c = 2;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                i = jsonReader.nextInt();
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                hVar = C5793d.m11277g(jsonReader, dVar);
            }
        }
        return new C5761o(str, i, hVar);
    }
}
