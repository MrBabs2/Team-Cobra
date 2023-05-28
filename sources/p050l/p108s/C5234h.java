package p050l.p108s;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: l.s.h */
/* compiled from: PathProperty */
class C5234h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f9274a;

    /* renamed from: b */
    private final PathMeasure f9275b;

    /* renamed from: c */
    private final float f9276c;

    /* renamed from: d */
    private final float[] f9277d = new float[2];

    /* renamed from: e */
    private final PointF f9278e = new PointF();

    /* renamed from: f */
    private float f9279f;

    C5234h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f9274a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f9275b = pathMeasure;
        this.f9276c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f9279f = f.floatValue();
        this.f9275b.getPosTan(this.f9276c * f.floatValue(), this.f9277d, (float[]) null);
        PointF pointF = this.f9278e;
        float[] fArr = this.f9277d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f9274a.set(t, pointF);
    }

    public Float get(T t) {
        return Float.valueOf(this.f9279f);
    }
}
