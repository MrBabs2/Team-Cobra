package com.airbnb.lottie.p138u;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p133s.p135j.C5746c;
import com.airbnb.lottie.p139v.C5828e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.u.l */
/* compiled from: GradientColorParser */
public class C5808l implements C5806j0<C5746c> {

    /* renamed from: a */
    private int f10474a;

    public C5808l(int i) {
        this.f10474a = i;
    }

    /* renamed from: a */
    public C5746c m11299a(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f10474a == -1) {
            this.f10474a = arrayList.size() / 4;
        }
        int i = this.f10474a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f10474a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C5746c cVar = new C5746c(fArr, iArr);
        m11297a(cVar, (List<Float>) arrayList);
        return cVar;
    }

    /* renamed from: a */
    private void m11297a(C5746c cVar, List<Float> list) {
        int i = this.f10474a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < cVar.mo19580c(); i3++) {
                int i4 = cVar.mo19578a()[i3];
                cVar.mo19578a()[i3] = Color.argb(m11296a((double) cVar.mo19579b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* renamed from: a */
    private int m11296a(double d, double[] dArr, double[] dArr2) {
        double d2;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int i = 1;
        while (true) {
            if (i >= dArr3.length) {
                d2 = dArr4[dArr4.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr3[i2];
            double d4 = dArr3[i];
            if (dArr3[i] >= d) {
                d2 = C5828e.m11364a(dArr4[i2], dArr4[i], (d - d3) / (d4 - d3));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }
}
