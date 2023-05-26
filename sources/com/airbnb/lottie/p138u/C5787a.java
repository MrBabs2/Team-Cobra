package com.airbnb.lottie.p138u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5734e;
import com.airbnb.lottie.p133s.p134i.C5738i;
import com.airbnb.lottie.p133s.p134i.C5742m;
import com.airbnb.lottie.p139v.C5829f;
import com.airbnb.lottie.p140w.C5830a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.u.a */
/* compiled from: AnimatablePathValueParser */
public class C5787a {
    /* renamed from: a */
    public static C5734e m11258a(JsonReader jsonReader, C5648d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(C5820w.m11328a(jsonReader, dVar));
            }
            jsonReader.endArray();
            C5815r.m11318a(arrayList);
        } else {
            arrayList.add(new C5830a(C5812p.m11309d(jsonReader, C5829f.m11376a())));
        }
        return new C5734e(arrayList);
    }

    /* renamed from: b */
    static C5742m<PointF, PointF> m11259b(JsonReader jsonReader, C5648d dVar) throws IOException {
        jsonReader.beginObject();
        C5734e eVar = null;
        C5731b bVar = null;
        C5731b bVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 107) {
                if (hashCode != 120) {
                    if (hashCode == 121 && nextName.equals("y")) {
                        c = 2;
                    }
                } else if (nextName.equals("x")) {
                    c = 1;
                }
            } else if (nextName.equals("k")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        jsonReader.skipValue();
                    } else if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                    } else {
                        bVar2 = C5793d.m11273c(jsonReader, dVar);
                    }
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    jsonReader.skipValue();
                } else {
                    bVar = C5793d.m11273c(jsonReader, dVar);
                }
                z = true;
            } else {
                eVar = m11258a(jsonReader, dVar);
            }
        }
        jsonReader.endObject();
        if (z) {
            dVar.mo19392a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C5738i(bVar, bVar2);
    }
}
