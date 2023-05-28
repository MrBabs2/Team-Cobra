package com.airbnb.lottie.p140w;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C5648d;

/* renamed from: com.airbnb.lottie.w.a */
/* compiled from: Keyframe */
public class C5830a<T> {

    /* renamed from: a */
    private final C5648d f10500a;

    /* renamed from: b */
    public final T f10501b;

    /* renamed from: c */
    public final T f10502c;

    /* renamed from: d */
    public final Interpolator f10503d;

    /* renamed from: e */
    public final float f10504e;

    /* renamed from: f */
    public Float f10505f;

    /* renamed from: g */
    private float f10506g;

    /* renamed from: h */
    private float f10507h;

    /* renamed from: i */
    public PointF f10508i;

    /* renamed from: j */
    public PointF f10509j;

    public C5830a(C5648d dVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f10506g = Float.MIN_VALUE;
        this.f10507h = Float.MIN_VALUE;
        this.f10508i = null;
        this.f10509j = null;
        this.f10500a = dVar;
        this.f10501b = t;
        this.f10502c = t2;
        this.f10503d = interpolator;
        this.f10504e = f;
        this.f10505f = f2;
    }

    /* renamed from: a */
    public float mo19738a() {
        if (this.f10500a == null) {
            return 1.0f;
        }
        if (this.f10507h == Float.MIN_VALUE) {
            if (this.f10505f == null) {
                this.f10507h = 1.0f;
            } else {
                this.f10507h = mo19740b() + ((this.f10505f.floatValue() - this.f10504e) / this.f10500a.mo19397d());
            }
        }
        return this.f10507h;
    }

    /* renamed from: b */
    public float mo19740b() {
        C5648d dVar = this.f10500a;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.f10506g == Float.MIN_VALUE) {
            this.f10506g = (this.f10504e - dVar.mo19404k()) / this.f10500a.mo19397d();
        }
        return this.f10506g;
    }

    /* renamed from: c */
    public boolean mo19741c() {
        return this.f10503d == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f10501b + ", endValue=" + this.f10502c + ", startFrame=" + this.f10504e + ", endFrame=" + this.f10505f + ", interpolator=" + this.f10503d + '}';
    }

    /* renamed from: a */
    public boolean mo19739a(float f) {
        return f >= mo19740b() && f < mo19738a();
    }

    public C5830a(T t) {
        this.f10506g = Float.MIN_VALUE;
        this.f10507h = Float.MIN_VALUE;
        this.f10508i = null;
        this.f10509j = null;
        this.f10500a = null;
        this.f10501b = t;
        this.f10502c = t;
        this.f10503d = null;
        this.f10504e = Float.MIN_VALUE;
        this.f10505f = Float.valueOf(Float.MAX_VALUE);
    }
}
