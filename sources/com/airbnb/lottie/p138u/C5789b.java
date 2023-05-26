package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5730a;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5740k;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.b */
/* compiled from: AnimatableTextPropertiesParser */
public class C5789b {
    /* renamed from: a */
    public static C5740k m11261a(JsonReader jsonReader, C5648d dVar) throws IOException {
        jsonReader.beginObject();
        C5740k kVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 97 && nextName.equals("a")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                kVar = m11262b(jsonReader, dVar);
            }
        }
        jsonReader.endObject();
        return kVar == null ? new C5740k((C5730a) null, (C5730a) null, (C5731b) null, (C5731b) null) : kVar;
    }

    /* renamed from: b */
    private static C5740k m11262b(JsonReader jsonReader, C5648d dVar) throws IOException {
        jsonReader.beginObject();
        C5730a aVar = null;
        C5730a aVar2 = null;
        C5731b bVar = null;
        C5731b bVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 116) {
                if (hashCode != 3261) {
                    if (hashCode != 3664) {
                        if (hashCode == 3684 && nextName.equals("sw")) {
                            c = 2;
                        }
                    } else if (nextName.equals("sc")) {
                        c = 1;
                    }
                } else if (nextName.equals("fc")) {
                    c = 0;
                }
            } else if (nextName.equals("t")) {
                c = 3;
            }
            if (c == 0) {
                aVar = C5793d.m11267a(jsonReader, dVar);
            } else if (c == 1) {
                aVar2 = C5793d.m11267a(jsonReader, dVar);
            } else if (c == 2) {
                bVar = C5793d.m11273c(jsonReader, dVar);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                bVar2 = C5793d.m11273c(jsonReader, dVar);
            }
        }
        jsonReader.endObject();
        return new C5740k(aVar, aVar2, bVar, bVar2);
    }
}
