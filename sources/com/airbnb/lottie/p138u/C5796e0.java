package com.airbnb.lottie.p138u;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5730a;
import com.airbnb.lottie.p133s.p134i.C5733d;
import com.airbnb.lottie.p133s.p135j.C5759m;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.e0 */
/* compiled from: ShapeFillParser */
class C5796e0 {
    /* renamed from: a */
    static C5759m m11281a(JsonReader jsonReader, C5648d dVar) throws IOException {
        String str = null;
        C5730a aVar = null;
        C5733d dVar2 = null;
        int i = 1;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -396065730) {
                if (hashCode != 99) {
                    if (hashCode != 111) {
                        if (hashCode != 114) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c = 0;
                            }
                        } else if (nextName.equals("r")) {
                            c = 4;
                        }
                    } else if (nextName.equals("o")) {
                        c = 2;
                    }
                } else if (nextName.equals("c")) {
                    c = 1;
                }
            } else if (nextName.equals("fillEnabled")) {
                c = 3;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                aVar = C5793d.m11267a(jsonReader, dVar);
            } else if (c == 2) {
                dVar2 = C5793d.m11274d(jsonReader, dVar);
            } else if (c == 3) {
                z = jsonReader.nextBoolean();
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                i = jsonReader.nextInt();
            }
        }
        return new C5759m(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar2);
    }
}
