package com.airbnb.lottie.p138u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p133s.C5722a;
import com.airbnb.lottie.p133s.p135j.C5758l;
import com.airbnb.lottie.p139v.C5828e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.u.d0 */
/* compiled from: ShapeDataParser */
public class C5794d0 implements C5806j0<C5758l> {

    /* renamed from: a */
    public static final C5794d0 f10470a = new C5794d0();

    private C5794d0() {
    }

    /* renamed from: a */
    public C5758l m11279a(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 105) {
                    if (hashCode != 111) {
                        if (hashCode == 118 && nextName.equals("v")) {
                            c = 1;
                        }
                    } else if (nextName.equals("o")) {
                        c = 3;
                    }
                } else if (nextName.equals("i")) {
                    c = 2;
                }
            } else if (nextName.equals("c")) {
                c = 0;
            }
            if (c == 0) {
                z = jsonReader.nextBoolean();
            } else if (c == 1) {
                list = C5812p.m11310e(jsonReader, f);
            } else if (c == 2) {
                list2 = C5812p.m11310e(jsonReader, f);
            } else if (c == 3) {
                list3 = C5812p.m11310e(jsonReader, f);
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C5758l(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C5722a(C5828e.m11370a(list.get(i2), list3.get(i2)), C5828e.m11370a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C5722a(C5828e.m11370a(list.get(i3), list3.get(i3)), C5828e.m11370a(pointF3, list2.get(0)), pointF3));
            }
            return new C5758l(pointF, z, arrayList);
        }
    }
}
