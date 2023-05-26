package com.airbnb.lottie.p139v;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.p129q.p130a.C5702r;
import java.io.Closeable;

/* renamed from: com.airbnb.lottie.v.f */
/* compiled from: Utils */
public final class C5829f {

    /* renamed from: a */
    private static final PathMeasure f10494a = new PathMeasure();

    /* renamed from: b */
    private static final Path f10495b = new Path();

    /* renamed from: c */
    private static final Path f10496c = new Path();

    /* renamed from: d */
    private static final float[] f10497d = new float[4];

    /* renamed from: e */
    private static final float f10498e = ((float) Math.sqrt(2.0d));

    /* renamed from: f */
    private static float f10499f = -1.0f;

    /* renamed from: a */
    public static int m11378a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: a */
    public static Path m11379a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        }
        return path;
    }

    /* renamed from: a */
    public static boolean m11383a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: a */
    public static void m11382a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m11377a(Matrix matrix) {
        float[] fArr = f10497d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f10498e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f10497d;
        return ((float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static void m11381a(Path path, C5702r rVar) {
        if (rVar != null) {
            m11380a(path, rVar.mo19504d().mo19513d().floatValue() / 100.0f, rVar.mo19502b().mo19513d().floatValue() / 100.0f, rVar.mo19503c().mo19513d().floatValue() / 360.0f);
        }
    }

    /* renamed from: a */
    public static void m11380a(Path path, float f, float f2, float f3) {
        C5647c.m10753a("applyTrimPathIfNeeded");
        f10494a.setPath(path, false);
        float length = f10494a.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C5647c.m10755c("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C5647c.m10755c("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C5828e.m11366a(min, length);
                max = (float) C5828e.m11366a(max, length);
            }
            if (min < 0.0f) {
                min = (float) C5828e.m11366a(min, length);
            }
            if (max < 0.0f) {
                max = (float) C5828e.m11366a(max, length);
            }
            if (min == max) {
                path.reset();
                C5647c.m10755c("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            f10495b.reset();
            f10494a.getSegment(min, max, f10495b, true);
            if (max > length) {
                f10496c.reset();
                f10494a.getSegment(0.0f, max % length, f10496c, true);
                f10495b.addPath(f10496c);
            } else if (min < 0.0f) {
                f10496c.reset();
                f10494a.getSegment(min + length, length, f10496c, true);
                f10495b.addPath(f10496c);
            }
            path.set(f10495b);
            C5647c.m10755c("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: a */
    public static float m11376a() {
        if (f10499f == -1.0f) {
            f10499f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f10499f;
    }
}
