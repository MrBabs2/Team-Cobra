package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import com.airbnb.lottie.p133s.p135j.C5752h;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.v */
/* compiled from: MergePathsParser */
class C5819v {
    /* renamed from: a */
    static C5752h m11327a(JsonReader jsonReader) throws IOException {
        String str = null;
        C5752h.C5753a aVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3488) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("mm")) {
                c = 1;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                aVar = C5752h.C5753a.m11112a(jsonReader.nextInt());
            }
        }
        return new C5752h(str, aVar);
    }
}
