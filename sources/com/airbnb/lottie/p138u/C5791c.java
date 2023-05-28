package com.airbnb.lottie.p138u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5733d;
import com.airbnb.lottie.p133s.p134i.C5734e;
import com.airbnb.lottie.p133s.p134i.C5736g;
import com.airbnb.lottie.p133s.p134i.C5741l;
import com.airbnb.lottie.p133s.p134i.C5742m;
import com.airbnb.lottie.p140w.C5833d;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.c */
/* compiled from: AnimatableTransformParser */
public class C5791c {
    /* renamed from: a */
    public static C5741l m11264a(JsonReader jsonReader, C5648d dVar) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        C5734e eVar = null;
        C5736g gVar = null;
        C5733d dVar2 = null;
        C5742m<PointF, PointF> mVar = null;
        C5731b bVar = null;
        C5731b bVar2 = null;
        C5731b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 97) {
                if (hashCode != 3242) {
                    if (hashCode != 3656) {
                        if (hashCode != 3676) {
                            if (hashCode != 111) {
                                if (hashCode != 112) {
                                    if (hashCode != 114) {
                                        if (hashCode == 115 && nextName.equals("s")) {
                                            c = 2;
                                        }
                                    } else if (nextName.equals("r")) {
                                        c = 4;
                                    }
                                } else if (nextName.equals("p")) {
                                    c = 1;
                                }
                            } else if (nextName.equals("o")) {
                                c = 5;
                            }
                        } else if (nextName.equals("so")) {
                            c = 6;
                        }
                    } else if (nextName.equals("rz")) {
                        c = 3;
                    }
                } else if (nextName.equals("eo")) {
                    c = 7;
                }
            } else if (nextName.equals("a")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("k")) {
                            eVar = C5787a.m11258a(jsonReader, dVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case 1:
                    mVar = C5787a.m11259b(jsonReader, dVar);
                    continue;
                case 2:
                    gVar = C5793d.m11276f(jsonReader, dVar);
                    continue;
                case 3:
                    dVar.mo19392a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar2 = C5793d.m11274d(jsonReader, dVar);
                    continue;
                case 6:
                    bVar2 = C5793d.m11268a(jsonReader, dVar, false);
                    continue;
                case 7:
                    bVar3 = C5793d.m11268a(jsonReader, dVar, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            bVar = C5793d.m11268a(jsonReader, dVar, false);
        }
        if (z) {
            jsonReader.endObject();
        }
        if (eVar == null) {
            Log.w("LOTTIE", "Layer has no transform property. You may be using an unsupported layer type such as a camera.");
            eVar = new C5734e();
        }
        C5734e eVar2 = eVar;
        if (gVar == null) {
            gVar = new C5736g(new C5833d(1.0f, 1.0f));
        }
        C5736g gVar2 = gVar;
        if (dVar2 == null) {
            dVar2 = new C5733d();
        }
        return new C5741l(eVar2, mVar, gVar2, bVar, dVar2, bVar2, bVar3);
    }
}
