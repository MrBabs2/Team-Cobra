package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p135j.C5766q;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.i0 */
/* compiled from: ShapeTrimPathParser */
class C5804i0 {
    /* renamed from: a */
    static C5766q m11292a(JsonReader jsonReader, C5648d dVar) throws IOException {
        String str = null;
        C5766q.C5767a aVar = null;
        C5731b bVar = null;
        C5731b bVar2 = null;
        C5731b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 101) {
                if (hashCode != 109) {
                    if (hashCode != 111) {
                        if (hashCode != 115) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c = 3;
                            }
                        } else if (nextName.equals("s")) {
                            c = 0;
                        }
                    } else if (nextName.equals("o")) {
                        c = 2;
                    }
                } else if (nextName.equals("m")) {
                    c = 4;
                }
            } else if (nextName.equals("e")) {
                c = 1;
            }
            if (c == 0) {
                bVar = C5793d.m11268a(jsonReader, dVar, false);
            } else if (c == 1) {
                bVar2 = C5793d.m11268a(jsonReader, dVar, false);
            } else if (c == 2) {
                bVar3 = C5793d.m11268a(jsonReader, dVar, false);
            } else if (c == 3) {
                str = jsonReader.nextString();
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                aVar = C5766q.C5767a.m11168a(jsonReader.nextInt());
            }
        }
        return new C5766q(str, aVar, bVar, bVar2, bVar3);
    }
}
