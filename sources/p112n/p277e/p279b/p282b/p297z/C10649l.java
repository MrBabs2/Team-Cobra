package p112n.p277e.p279b.p282b.p297z;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: n.e.b.b.z.l */
/* compiled from: ShapeAppearancePathProvider */
public class C10649l {

    /* renamed from: a */
    private final C10652m[] f28634a = new C10652m[4];

    /* renamed from: b */
    private final Matrix[] f28635b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f28636c = new Matrix[4];

    /* renamed from: d */
    private final PointF f28637d = new PointF();

    /* renamed from: e */
    private final Path f28638e = new Path();

    /* renamed from: f */
    private final Path f28639f = new Path();

    /* renamed from: g */
    private final C10652m f28640g = new C10652m();

    /* renamed from: h */
    private final float[] f28641h = new float[2];

    /* renamed from: i */
    private final float[] f28642i = new float[2];

    /* renamed from: j */
    private boolean f28643j = true;

    /* renamed from: n.e.b.b.z.l$a */
    /* compiled from: ShapeAppearancePathProvider */
    public interface C10650a {
        /* renamed from: a */
        void mo36275a(C10652m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo36276b(C10652m mVar, Matrix matrix, int i);
    }

    /* renamed from: n.e.b.b.z.l$b */
    /* compiled from: ShapeAppearancePathProvider */
    static final class C10651b {

        /* renamed from: a */
        public final C10645k f28644a;

        /* renamed from: b */
        public final Path f28645b;

        /* renamed from: c */
        public final RectF f28646c;

        /* renamed from: d */
        public final C10650a f28647d;

        /* renamed from: e */
        public final float f28648e;

        C10651b(C10645k kVar, float f, RectF rectF, C10650a aVar, Path path) {
            this.f28647d = aVar;
            this.f28644a = kVar;
            this.f28648e = f;
            this.f28646c = rectF;
            this.f28645b = path;
        }
    }

    public C10649l() {
        for (int i = 0; i < 4; i++) {
            this.f28634a[i] = new C10652m();
            this.f28635b[i] = new Matrix();
            this.f28636c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m36128a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m36135b(int i) {
        this.f28641h[0] = this.f28634a[i].mo36324b();
        this.f28641h[1] = this.f28634a[i].mo36326c();
        this.f28635b[i].mapPoints(this.f28641h);
        float a = m36128a(i);
        this.f28636c[i].reset();
        Matrix matrix = this.f28636c[i];
        float[] fArr = this.f28641h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f28636c[i].preRotate(a);
    }

    /* renamed from: c */
    private void m36138c(C10651b bVar, int i) {
        m36134b(i, bVar.f28644a).mo36232a(this.f28634a[i], 90.0f, bVar.f28648e, bVar.f28646c, m36130a(i, bVar.f28644a));
        float a = m36128a(i);
        this.f28635b[i].reset();
        m36131a(i, bVar.f28646c, this.f28637d);
        Matrix matrix = this.f28635b[i];
        PointF pointF = this.f28637d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f28635b[i].preRotate(a);
    }

    /* renamed from: a */
    public void mo36316a(C10645k kVar, float f, RectF rectF, Path path) {
        mo36317a(kVar, f, rectF, (C10650a) null, path);
    }

    /* renamed from: a */
    public void mo36317a(C10645k kVar, float f, RectF rectF, C10650a aVar, Path path) {
        path.rewind();
        this.f28638e.rewind();
        this.f28639f.rewind();
        this.f28639f.addRect(rectF, Path.Direction.CW);
        C10651b bVar = new C10651b(kVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m36138c(bVar, i);
            m36135b(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m36132a(bVar, i2);
            m36136b(bVar, i2);
        }
        path.close();
        this.f28638e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f28638e.isEmpty()) {
            path.op(this.f28638e, Path.Op.UNION);
        }
    }

    /* renamed from: b */
    private void m36136b(C10651b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f28641h[0] = this.f28634a[i].mo36324b();
        this.f28641h[1] = this.f28634a[i].mo36326c();
        this.f28635b[i].mapPoints(this.f28641h);
        this.f28642i[0] = this.f28634a[i2].mo36327d();
        this.f28642i[1] = this.f28634a[i2].mo36328e();
        this.f28635b[i2].mapPoints(this.f28642i);
        float[] fArr = this.f28641h;
        float f = fArr[0];
        float[] fArr2 = this.f28642i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float a = m36129a(bVar.f28646c, i);
        this.f28640g.mo36325b(0.0f, 0.0f);
        C10637f c = m36137c(i, bVar.f28644a);
        c.mo30959a(max, a, bVar.f28648e, this.f28640g);
        Path path = new Path();
        this.f28640g.mo36322a(this.f28636c[i], path);
        if (!this.f28643j || Build.VERSION.SDK_INT < 19 || (!c.mo36233b() && !m36133a(path, i) && !m36133a(path, i2))) {
            this.f28640g.mo36322a(this.f28636c[i], bVar.f28645b);
        } else {
            path.op(path, this.f28639f, Path.Op.DIFFERENCE);
            this.f28641h[0] = this.f28640g.mo36327d();
            this.f28641h[1] = this.f28640g.mo36328e();
            this.f28636c[i].mapPoints(this.f28641h);
            Path path2 = this.f28638e;
            float[] fArr3 = this.f28641h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f28640g.mo36322a(this.f28636c[i], this.f28638e);
        }
        C10650a aVar = bVar.f28647d;
        if (aVar != null) {
            aVar.mo36276b(this.f28640g, this.f28636c[i], i);
        }
    }

    /* renamed from: c */
    private C10637f m36137c(int i, C10645k kVar) {
        if (i == 1) {
            return kVar.mo36282a();
        }
        if (i == 2) {
            return kVar.mo36290f();
        }
        if (i != 3) {
            return kVar.mo36291g();
        }
        return kVar.mo36292h();
    }

    /* renamed from: a */
    private void m36132a(C10651b bVar, int i) {
        this.f28641h[0] = this.f28634a[i].mo36327d();
        this.f28641h[1] = this.f28634a[i].mo36328e();
        this.f28635b[i].mapPoints(this.f28641h);
        if (i == 0) {
            Path path = bVar.f28645b;
            float[] fArr = this.f28641h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f28645b;
            float[] fArr2 = this.f28641h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f28634a[i].mo36322a(this.f28635b[i], bVar.f28645b);
        C10650a aVar = bVar.f28647d;
        if (aVar != null) {
            aVar.mo36275a(this.f28634a[i], this.f28635b[i], i);
        }
    }

    /* renamed from: a */
    private boolean m36133a(Path path, int i) {
        Path path2 = new Path();
        this.f28634a[i].mo36322a(this.f28635b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private float m36129a(RectF rectF, int i) {
        float[] fArr = this.f28641h;
        C10652m[] mVarArr = this.f28634a;
        fArr[0] = mVarArr[i].f28651c;
        fArr[1] = mVarArr[i].f28652d;
        this.f28635b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f28641h[0]);
        }
        return Math.abs(rectF.centerY() - this.f28641h[1]);
    }

    /* renamed from: a */
    private C10634c m36130a(int i, C10645k kVar) {
        if (i == 1) {
            return kVar.mo36289e();
        }
        if (i == 2) {
            return kVar.mo36287c();
        }
        if (i != 3) {
            return kVar.mo36296l();
        }
        return kVar.mo36294j();
    }

    /* renamed from: b */
    private C10635d m36134b(int i, C10645k kVar) {
        if (i == 1) {
            return kVar.mo36288d();
        }
        if (i == 2) {
            return kVar.mo36286b();
        }
        if (i != 3) {
            return kVar.mo36295k();
        }
        return kVar.mo36293i();
    }

    /* renamed from: a */
    private void m36131a(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }
}
