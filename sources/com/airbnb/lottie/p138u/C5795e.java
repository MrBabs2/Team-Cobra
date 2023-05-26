package com.airbnb.lottie.p138u;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5735f;
import com.airbnb.lottie.p133s.p134i.C5742m;
import com.airbnb.lottie.p133s.p135j.C5744a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.e */
/* compiled from: CircleShapeParser */
class C5795e {
    /* renamed from: a */
    static C5744a m11280a(JsonReader jsonReader, C5648d dVar, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        C5742m<PointF, PointF> mVar = null;
        C5735f fVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 100) {
                if (hashCode != 112) {
                    if (hashCode != 115) {
                        if (hashCode == 3519 && nextName.equals("nm")) {
                            c = 0;
                        }
                    } else if (nextName.equals("s")) {
                        c = 2;
                    }
                } else if (nextName.equals("p")) {
                    c = 1;
                }
            } else if (nextName.equals("d")) {
                c = 3;
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
                z = jsonReader.nextInt() == 3;
            }
        }
        return new C5744a(str, mVar, fVar, z);
    }
}
