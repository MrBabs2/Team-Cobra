package p050l.p109t.p110a.p111a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.p003c.C0413g;
import org.xmlpull.v1.XmlPullParser;
import p050l.p075h.p076e.C4951c;

/* renamed from: l.t.a.a.g */
/* compiled from: PathInterpolatorCompat */
public class C5285g implements Interpolator {

    /* renamed from: a */
    private float[] f9412a;

    /* renamed from: b */
    private float[] f9413b;

    public C5285g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* renamed from: a */
    private void m9965a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0413g.m1988a(xmlPullParser, "pathData")) {
            String a = C0413g.m1985a(typedArray, xmlPullParser, "pathData", 4);
            Path b = C4951c.m8719b(a);
            if (b != null) {
                m9966a(b);
                return;
            }
            throw new InflateException("The path is null, which is created from " + a);
        } else if (!C0413g.m1988a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0413g.m1988a(xmlPullParser, "controlY1")) {
            float a2 = C0413g.m1976a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a3 = C0413g.m1976a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a4 = C0413g.m1988a(xmlPullParser, "controlX2");
            if (a4 != C0413g.m1988a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a4) {
                m9963a(a2, a3);
            } else {
                m9964a(a2, a3, C0413g.m1976a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0413g.m1976a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f9412a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f9412a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f9412a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f9413b[i];
        }
        float[] fArr2 = this.f9413b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public C5285g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0413g.m1982a(resources, theme, attributeSet, C5274a.f9398l);
        m9965a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m9963a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m9966a(path);
    }

    /* renamed from: a */
    private void m9964a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m9966a(path);
    }

    /* renamed from: a */
    private void m9966a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f9412a = new float[min];
            this.f9413b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f9412a[i2] = fArr[0];
                this.f9413b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f9412a[0])) <= 1.0E-5d && ((double) Math.abs(this.f9413b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f9412a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f9413b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f9412a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f9412a[0]);
            sb.append(",");
            sb.append(this.f9413b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f9412a[i6]);
            sb.append(",");
            sb.append(this.f9413b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }
}
