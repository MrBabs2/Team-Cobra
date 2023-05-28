package p112n.p277e.p279b.p282b.p297z;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p112n.p277e.p279b.p282b.p296y.C10630a;

/* renamed from: n.e.b.b.z.m */
/* compiled from: ShapePath */
public class C10652m {
    @Deprecated

    /* renamed from: a */
    public float f28649a;
    @Deprecated

    /* renamed from: b */
    public float f28650b;
    @Deprecated

    /* renamed from: c */
    public float f28651c;
    @Deprecated

    /* renamed from: d */
    public float f28652d;
    @Deprecated

    /* renamed from: e */
    public float f28653e;
    @Deprecated

    /* renamed from: f */
    public float f28654f;

    /* renamed from: g */
    private final List<C10658f> f28655g = new ArrayList();

    /* renamed from: h */
    private final List<C10659g> f28656h = new ArrayList();

    /* renamed from: i */
    private boolean f28657i;

    /* renamed from: n.e.b.b.z.m$a */
    /* compiled from: ShapePath */
    class C10653a extends C10659g {

        /* renamed from: b */
        final /* synthetic */ List f28658b;

        /* renamed from: c */
        final /* synthetic */ Matrix f28659c;

        C10653a(C10652m mVar, List list, Matrix matrix) {
            this.f28658b = list;
            this.f28659c = matrix;
        }

        /* renamed from: a */
        public void mo36329a(Matrix matrix, C10630a aVar, int i, Canvas canvas) {
            for (C10659g a : this.f28658b) {
                a.mo36329a(this.f28659c, aVar, i, canvas);
            }
        }
    }

    /* renamed from: n.e.b.b.z.m$b */
    /* compiled from: ShapePath */
    static class C10654b extends C10659g {

        /* renamed from: b */
        private final C10656d f28660b;

        public C10654b(C10656d dVar) {
            this.f28660b = dVar;
        }

        /* renamed from: a */
        public void mo36329a(Matrix matrix, C10630a aVar, int i, Canvas canvas) {
            float e = this.f28660b.m36179d();
            float f = this.f28660b.m36182e();
            aVar.mo36225a(canvas, matrix, new RectF(this.f28660b.m36172b(), this.f28660b.m36185f(), this.f28660b.m36176c(), this.f28660b.m36168a()), i, e, f);
        }
    }

    /* renamed from: n.e.b.b.z.m$d */
    /* compiled from: ShapePath */
    public static class C10656d extends C10658f {

        /* renamed from: h */
        private static final RectF f28664h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f28665b;
        @Deprecated

        /* renamed from: c */
        public float f28666c;
        @Deprecated

        /* renamed from: d */
        public float f28667d;
        @Deprecated

        /* renamed from: e */
        public float f28668e;
        @Deprecated

        /* renamed from: f */
        public float f28669f;
        @Deprecated

        /* renamed from: g */
        public float f28670g;

        public C10656d(float f, float f2, float f3, float f4) {
            m36174b(f);
            m36187f(f2);
            m36178c(f3);
            m36170a(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public float m36176c() {
            return this.f28667d;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public float m36179d() {
            return this.f28669f;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public float m36182e() {
            return this.f28670g;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public float m36185f() {
            return this.f28666c;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public float m36172b() {
            return this.f28665b;
        }

        /* renamed from: c */
        private void m36178c(float f) {
            this.f28667d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m36181d(float f) {
            this.f28669f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m36184e(float f) {
            this.f28670g = f;
        }

        /* renamed from: f */
        private void m36187f(float f) {
            this.f28666c = f;
        }

        /* renamed from: a */
        public void mo36331a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f28673a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f28664h.set(m36172b(), m36185f(), m36176c(), m36168a());
            path.arcTo(f28664h, m36179d(), m36182e(), false);
            path.transform(matrix);
        }

        /* renamed from: b */
        private void m36174b(float f) {
            this.f28665b = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public float m36168a() {
            return this.f28668e;
        }

        /* renamed from: a */
        private void m36170a(float f) {
            this.f28668e = f;
        }
    }

    /* renamed from: n.e.b.b.z.m$f */
    /* compiled from: ShapePath */
    public static abstract class C10658f {

        /* renamed from: a */
        protected final Matrix f28673a = new Matrix();

        /* renamed from: a */
        public abstract void mo36331a(Matrix matrix, Path path);
    }

    /* renamed from: n.e.b.b.z.m$g */
    /* compiled from: ShapePath */
    static abstract class C10659g {

        /* renamed from: a */
        static final Matrix f28674a = new Matrix();

        C10659g() {
        }

        /* renamed from: a */
        public abstract void mo36329a(Matrix matrix, C10630a aVar, int i, Canvas canvas);

        /* renamed from: a */
        public final void mo36332a(C10630a aVar, int i, Canvas canvas) {
            mo36329a(f28674a, aVar, i, canvas);
        }
    }

    public C10652m() {
        mo36325b(0.0f, 0.0f);
    }

    /* renamed from: f */
    private float m36149f() {
        return this.f28653e;
    }

    /* renamed from: g */
    private float m36151g() {
        return this.f28654f;
    }

    /* renamed from: a */
    public void mo36320a(float f, float f2, float f3, float f4) {
        m36150f(f);
        m36152g(f2);
        m36147d(f);
        m36148e(f2);
        m36145b(f3);
        m36146c((f3 + f4) % 360.0f);
        this.f28655g.clear();
        this.f28656h.clear();
        this.f28657i = false;
    }

    /* renamed from: b */
    public void mo36325b(float f, float f2) {
        mo36320a(f, f2, 270.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo36326c() {
        return this.f28652d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo36327d() {
        return this.f28649a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo36328e() {
        return this.f28650b;
    }

    /* renamed from: n.e.b.b.z.m$e */
    /* compiled from: ShapePath */
    public static class C10657e extends C10658f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f28671b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f28672c;

        /* renamed from: a */
        public void mo36331a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f28673a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f28671b, this.f28672c);
            path.transform(matrix);
        }
    }

    /* renamed from: c */
    private void m36146c(float f) {
        this.f28654f = f;
    }

    /* renamed from: d */
    private void m36147d(float f) {
        this.f28651c = f;
    }

    /* renamed from: e */
    private void m36148e(float f) {
        this.f28652d = f;
    }

    /* renamed from: f */
    private void m36150f(float f) {
        this.f28649a = f;
    }

    /* renamed from: g */
    private void m36152g(float f) {
        this.f28650b = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo36324b() {
        return this.f28651c;
    }

    /* renamed from: b */
    private void m36145b(float f) {
        this.f28653e = f;
    }

    /* renamed from: n.e.b.b.z.m$c */
    /* compiled from: ShapePath */
    static class C10655c extends C10659g {

        /* renamed from: b */
        private final C10657e f28661b;

        /* renamed from: c */
        private final float f28662c;

        /* renamed from: d */
        private final float f28663d;

        public C10655c(C10657e eVar, float f, float f2) {
            this.f28661b = eVar;
            this.f28662c = f;
            this.f28663d = f2;
        }

        /* renamed from: a */
        public void mo36329a(Matrix matrix, C10630a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f28661b.f28672c - this.f28663d), (double) (this.f28661b.f28671b - this.f28662c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f28662c, this.f28663d);
            matrix2.preRotate(mo36330a());
            aVar.mo36224a(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo36330a() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f28661b.f28672c - this.f28663d) / (this.f28661b.f28671b - this.f28662c))));
        }
    }

    /* renamed from: a */
    public void mo36319a(float f, float f2) {
        C10657e eVar = new C10657e();
        float unused = eVar.f28671b = f;
        float unused2 = eVar.f28672c = f2;
        this.f28655g.add(eVar);
        C10655c cVar = new C10655c(eVar, mo36324b(), mo36326c());
        m36144a(cVar, cVar.mo36330a() + 270.0f, cVar.mo36330a() + 270.0f);
        m36147d(f);
        m36148e(f2);
    }

    /* renamed from: a */
    public void mo36321a(float f, float f2, float f3, float f4, float f5, float f6) {
        C10656d dVar = new C10656d(f, f2, f3, f4);
        dVar.m36181d(f5);
        dVar.m36184e(f6);
        this.f28655g.add(dVar);
        C10654b bVar = new C10654b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m36144a(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m36147d(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m36148e(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: a */
    public void mo36322a(Matrix matrix, Path path) {
        int size = this.f28655g.size();
        for (int i = 0; i < size; i++) {
            this.f28655g.get(i).mo36331a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10659g mo36318a(Matrix matrix) {
        m36143a(m36151g());
        return new C10653a(this, new ArrayList(this.f28656h), matrix);
    }

    /* renamed from: a */
    private void m36144a(C10659g gVar, float f, float f2) {
        m36143a(f);
        this.f28656h.add(gVar);
        m36145b(f2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo36323a() {
        return this.f28657i;
    }

    /* renamed from: a */
    private void m36143a(float f) {
        if (m36149f() != f) {
            float f2 = ((f - m36149f()) + 360.0f) % 360.0f;
            if (f2 <= 180.0f) {
                C10656d dVar = new C10656d(mo36324b(), mo36326c(), mo36324b(), mo36326c());
                dVar.m36181d(m36149f());
                dVar.m36184e(f2);
                this.f28656h.add(new C10654b(dVar));
                m36145b(f);
            }
        }
    }
}
