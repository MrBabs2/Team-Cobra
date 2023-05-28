package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5741l;
import com.airbnb.lottie.p133s.p135j.C5757k;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.b0 */
/* compiled from: RepeaterParser */
class C5790b0 {
    /* renamed from: a */
    static C5757k m11263a(JsonReader jsonReader, C5648d dVar) throws IOException {
        String str = null;
        C5731b bVar = null;
        C5731b bVar2 = null;
        C5741l lVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 111) {
                    if (hashCode != 3519) {
                        if (hashCode == 3710 && nextName.equals("tr")) {
                            c = 3;
                        }
                    } else if (nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals("o")) {
                    c = 2;
                }
            } else if (nextName.equals("c")) {
                c = 1;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                bVar = C5793d.m11268a(jsonReader, dVar, false);
            } else if (c == 2) {
                bVar2 = C5793d.m11268a(jsonReader, dVar, false);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                lVar = C5791c.m11264a(jsonReader, dVar);
            }
        }
        return new C5757k(str, bVar, bVar2, lVar);
    }
}
