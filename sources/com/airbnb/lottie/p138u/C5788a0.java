package com.airbnb.lottie.p138u;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5735f;
import com.airbnb.lottie.p133s.p134i.C5742m;
import com.airbnb.lottie.p133s.p135j.C5756j;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.a0 */
/* compiled from: RectangleShapeParser */
class C5788a0 {
    /* renamed from: a */
    static C5756j m11260a(JsonReader jsonReader, C5648d dVar) throws IOException {
        String str = null;
        C5742m<PointF, PointF> mVar = null;
        C5735f fVar = null;
        C5731b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3519) {
                    if (hashCode != 114) {
                        if (hashCode == 115 && nextName.equals("s")) {
                            c = 2;
                        }
                    } else if (nextName.equals("r")) {
                        c = 3;
                    }
                } else if (nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("p")) {
                c = 1;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                mVar = C5787a.m11259b(jsonReader, dVar);
            } else if (c == 2) {
                fVar = C5793d.m11275e(jsonReader, dVar);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                bVar = C5793d.m11273c(jsonReader, dVar);
            }
        }
        return new C5756j(str, mVar, fVar, bVar);
    }
}
