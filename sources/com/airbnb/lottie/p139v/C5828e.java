package com.airbnb.lottie.p139v;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.p129q.p130a.C5692j;
import com.airbnb.lottie.p133s.C5722a;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.C5727f;
import com.airbnb.lottie.p133s.p135j.C5758l;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.e */
/* compiled from: MiscUtils */
public class C5828e {
    /* renamed from: a */
    public static double m11364a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static int m11368a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: a */
    public static PointF m11370a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    private static int m11373b(int i, int i2) {
        return i - (i2 * m11367a(i, i2));
    }

    /* renamed from: b */
    public static boolean m11374b(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: c */
    public static float m11375c(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static void m11372a(C5758l lVar, Path path) {
        path.reset();
        PointF b = lVar.mo19626b();
        path.moveTo(b.x, b.y);
        PointF pointF = new PointF(b.x, b.y);
        for (int i = 0; i < lVar.mo19624a().size(); i++) {
            C5722a aVar = lVar.mo19624a().get(i);
            PointF a = aVar.mo19535a();
            PointF b2 = aVar.mo19537b();
            PointF c = aVar.mo19539c();
            if (!a.equals(pointF) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (lVar.mo19627c()) {
            path.close();
        }
    }

    /* renamed from: a */
    static int m11366a(float f, float f2) {
        return m11373b((int) f, (int) f2);
    }

    /* renamed from: a */
    private static int m11367a(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: a */
    public static int m11369a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: a */
    public static float m11365a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static void m11371a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2, C5692j jVar) {
        if (eVar.mo19551a(jVar.getName(), i)) {
            list.add(eVar2.mo19549a(jVar.getName()).mo19548a((C5727f) jVar));
        }
    }
}
