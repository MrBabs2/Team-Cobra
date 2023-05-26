package com.airbnb.lottie.p138u;

import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.C5667g;
import com.airbnb.lottie.p133s.C5724c;
import com.airbnb.lottie.p133s.C5725d;
import com.airbnb.lottie.p133s.p136k.C5774d;
import com.airbnb.lottie.p139v.C5829f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p050l.p066e.C4873d;
import p050l.p066e.C4882h;

/* renamed from: com.airbnb.lottie.u.t */
/* compiled from: LottieCompositionParser */
public class C5817t {
    /* renamed from: a */
    public static C5648d m11321a(JsonReader jsonReader) throws IOException {
        C4882h hVar;
        HashMap hashMap;
        JsonReader jsonReader2 = jsonReader;
        float a = C5829f.m11376a();
        C4873d dVar = new C4873d();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        C4882h hVar2 = new C4882h();
        C5648d dVar2 = new C5648d();
        jsonReader.beginObject();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1408207997:
                    if (nextName.equals("assets")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1109732030:
                    if (nextName.equals("layers")) {
                        c = 6;
                        break;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c = 1;
                        break;
                    }
                    break;
                case 118:
                    if (nextName.equals("v")) {
                        c = 5;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3276:
                    if (nextName.equals("fr")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3367:
                    if (nextName.equals("ip")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        c = 3;
                        break;
                    }
                    break;
                case 94623709:
                    if (nextName.equals("chars")) {
                        c = 9;
                        break;
                    }
                    break;
                case 97615364:
                    if (nextName.equals("fonts")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    i = jsonReader.nextInt();
                    continue;
                case 1:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    i2 = jsonReader.nextInt();
                    continue;
                case 2:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    f = (float) jsonReader.nextDouble();
                    continue;
                case 3:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    f2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    continue;
                case 4:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    f3 = (float) jsonReader.nextDouble();
                    continue;
                case 5:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!C5829f.m11383a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dVar2.mo19392a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    m11322a(jsonReader2, dVar2, (List<C5774d>) arrayList, (C4873d<C5774d>) dVar);
                    break;
                case 7:
                    m11323a(jsonReader2, dVar2, (Map<String, List<C5774d>>) hashMap2, (Map<String, C5667g>) hashMap3);
                    break;
                case 8:
                    m11325a(jsonReader2, hashMap4);
                    break;
                case 9:
                    m11324a(jsonReader2, dVar2, hVar2);
                    break;
                default:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    jsonReader.skipValue();
                    continue;
            }
            hVar = hVar2;
            hashMap = hashMap4;
            hashMap4 = hashMap;
            hVar2 = hVar;
        }
        C4882h hVar3 = hVar2;
        HashMap hashMap5 = hashMap4;
        jsonReader.endObject();
        dVar2.mo19391a(new Rect(0, 0, (int) (((float) i) * a), (int) (((float) i2) * a)), f, f2, f3, arrayList, dVar, hashMap2, hashMap3, hVar2, hashMap4);
        return dVar2;
    }

    /* renamed from: a */
    private static void m11322a(JsonReader jsonReader, C5648d dVar, List<C5774d> list, C4873d<C5774d> dVar2) throws IOException {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            C5774d a = C5816s.m11319a(jsonReader, dVar);
            if (a.mo19670d() == C5774d.C5775a.Image) {
                i++;
            }
            list.add(a);
            dVar2.mo16945c(a.mo19668b(), a);
            if (i > 4) {
                C5647c.m10756d("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    private static void m11323a(JsonReader jsonReader, C5648d dVar, Map<String, List<C5774d>> map, Map<String, C5667g> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            C4873d dVar2 = new C4873d();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != -1109732030) {
                    if (hashCode != 104) {
                        if (hashCode != 112) {
                            if (hashCode != 117) {
                                if (hashCode != 119) {
                                    if (hashCode == 3355 && nextName.equals(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID)) {
                                        c = 0;
                                    }
                                } else if (nextName.equals("w")) {
                                    c = 2;
                                }
                            } else if (nextName.equals("u")) {
                                c = 5;
                            }
                        } else if (nextName.equals("p")) {
                            c = 4;
                        }
                    } else if (nextName.equals("h")) {
                        c = 3;
                    }
                } else if (nextName.equals("layers")) {
                    c = 1;
                }
                if (c == 0) {
                    str = jsonReader.nextString();
                } else if (c == 1) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        C5774d a = C5816s.m11319a(jsonReader, dVar);
                        dVar2.mo16945c(a.mo19668b(), a);
                        arrayList.add(a);
                    }
                    jsonReader.endArray();
                } else if (c == 2) {
                    i = jsonReader.nextInt();
                } else if (c == 3) {
                    i2 = jsonReader.nextInt();
                } else if (c == 4) {
                    str2 = jsonReader.nextString();
                } else if (c != 5) {
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                C5667g gVar = new C5667g(i, i2, str, str2, str3);
                map2.put(gVar.mo19472c(), gVar);
                Map<String, List<C5774d>> map3 = map;
            } else {
                Map<String, C5667g> map4 = map2;
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    private static void m11325a(JsonReader jsonReader, Map<String, C5724c> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 3322014 && nextName.equals("list")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C5724c a = C5807k.m11295a(jsonReader);
                    map.put(a.mo19543b(), a);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    /* renamed from: a */
    private static void m11324a(JsonReader jsonReader, C5648d dVar, C4882h<C5725d> hVar) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            C5725d a = C5805j.m11293a(jsonReader, dVar);
            hVar.mo17050c(a.hashCode(), a);
        }
        jsonReader.endArray();
    }
}
