package com.airbnb.lottie.p138u;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5742m;
import com.airbnb.lottie.p133s.p135j.C5754i;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.z */
/* compiled from: PolystarShapeParser */
class C5823z {
    /* renamed from: a */
    static C5754i m11333a(JsonReader jsonReader, C5648d dVar) throws IOException {
        String str = null;
        C5754i.C5755a aVar = null;
        C5731b bVar = null;
        C5742m<PointF, PointF> mVar = null;
        C5731b bVar2 = null;
        C5731b bVar3 = null;
        C5731b bVar4 = null;
        C5731b bVar5 = null;
        C5731b bVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 114) {
                    if (hashCode != 3519) {
                        if (hashCode != 3588) {
                            if (hashCode != 3686) {
                                if (hashCode != 3369) {
                                    if (hashCode != 3370) {
                                        if (hashCode != 3555) {
                                            if (hashCode == 3556 && nextName.equals("os")) {
                                                c = 6;
                                            }
                                        } else if (nextName.equals("or")) {
                                            c = 5;
                                        }
                                    } else if (nextName.equals("is")) {
                                        c = 8;
                                    }
                                } else if (nextName.equals("ir")) {
                                    c = 7;
                                }
                            } else if (nextName.equals("sy")) {
                                c = 1;
                            }
                        } else if (nextName.equals("pt")) {
                            c = 2;
                        }
                    } else if (nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals("r")) {
                    c = 4;
                }
            } else if (nextName.equals("p")) {
                c = 3;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = C5754i.C5755a.m11123a(jsonReader.nextInt());
                    break;
                case 2:
                    bVar = C5793d.m11268a(jsonReader, dVar, false);
                    break;
                case 3:
                    mVar = C5787a.m11259b(jsonReader, dVar);
                    break;
                case 4:
                    bVar2 = C5793d.m11268a(jsonReader, dVar, false);
                    break;
                case 5:
                    bVar4 = C5793d.m11273c(jsonReader, dVar);
                    break;
                case 6:
                    bVar6 = C5793d.m11268a(jsonReader, dVar, false);
                    break;
                case 7:
                    bVar3 = C5793d.m11273c(jsonReader, dVar);
                    break;
                case 8:
                    bVar5 = C5793d.m11268a(jsonReader, dVar, false);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5754i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }
}
