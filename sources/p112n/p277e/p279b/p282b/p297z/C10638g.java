package p112n.p277e.p279b.p282b.p297z;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.C0415b;
import java.util.BitSet;
import p050l.p075h.p083k.C5003c;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.p288q.C10609a;
import p112n.p277e.p279b.p282b.p290s.C10611a;
import p112n.p277e.p279b.p282b.p296y.C10630a;
import p112n.p277e.p279b.p282b.p297z.C10645k;
import p112n.p277e.p279b.p282b.p297z.C10649l;
import p112n.p277e.p279b.p282b.p297z.C10652m;

/* renamed from: n.e.b.b.z.g */
/* compiled from: MaterialShapeDrawable */
public class C10638g extends Drawable implements C0415b, C10660n {

    /* renamed from: B */
    private static final String f28559B = C10638g.class.getSimpleName();

    /* renamed from: C */
    private static final Paint f28560C = new Paint(1);

    /* renamed from: A */
    private boolean f28561A;

    /* renamed from: f */
    private C10641c f28562f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10652m.C10659g[] f28563g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C10652m.C10659g[] f28564h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final BitSet f28565i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f28566j;

    /* renamed from: k */
    private final Matrix f28567k;

    /* renamed from: l */
    private final Path f28568l;

    /* renamed from: m */
    private final Path f28569m;

    /* renamed from: n */
    private final RectF f28570n;

    /* renamed from: o */
    private final RectF f28571o;

    /* renamed from: p */
    private final Region f28572p;

    /* renamed from: q */
    private final Region f28573q;

    /* renamed from: r */
    private C10645k f28574r;

    /* renamed from: s */
    private final Paint f28575s;

    /* renamed from: t */
    private final Paint f28576t;

    /* renamed from: u */
    private final C10630a f28577u;

    /* renamed from: v */
    private final C10649l.C10650a f28578v;

    /* renamed from: w */
    private final C10649l f28579w;

    /* renamed from: x */
    private PorterDuffColorFilter f28580x;

    /* renamed from: y */
    private PorterDuffColorFilter f28581y;

    /* renamed from: z */
    private final RectF f28582z;

    /* renamed from: n.e.b.b.z.g$a */
    /* compiled from: MaterialShapeDrawable */
    class C10639a implements C10649l.C10650a {
        C10639a() {
        }

        /* renamed from: a */
        public void mo36275a(C10652m mVar, Matrix matrix, int i) {
            C10638g.this.f28565i.set(i, mVar.mo36323a());
            C10638g.this.f28563g[i] = mVar.mo36318a(matrix);
        }

        /* renamed from: b */
        public void mo36276b(C10652m mVar, Matrix matrix, int i) {
            C10638g.this.f28565i.set(i + 4, mVar.mo36323a());
            C10638g.this.f28564h[i] = mVar.mo36318a(matrix);
        }
    }

    /* renamed from: n.e.b.b.z.g$b */
    /* compiled from: MaterialShapeDrawable */
    class C10640b implements C10645k.C10648c {

        /* renamed from: a */
        final /* synthetic */ float f28584a;

        C10640b(C10638g gVar, float f) {
            this.f28584a = f;
        }

        /* renamed from: a */
        public C10634c mo36277a(C10634c cVar) {
            return cVar instanceof C10643i ? cVar : new C10633b(this.f28584a, cVar);
        }
    }

    /* synthetic */ C10638g(C10641c cVar, C10639a aVar) {
        this(cVar);
    }

    /* renamed from: A */
    private void mo31437A() {
        super.invalidateSelf();
    }

    /* renamed from: B */
    private boolean mo31439B() {
        PorterDuffColorFilter porterDuffColorFilter = this.f28580x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f28581y;
        C10641c cVar = this.f28562f;
        this.f28580x = m36003a(cVar.f28591g, cVar.f28592h, this.f28575s, true);
        C10641c cVar2 = this.f28562f;
        this.f28581y = m36003a(cVar2.f28590f, cVar2.f28592h, this.f28576t, false);
        C10641c cVar3 = this.f28562f;
        if (cVar3.f28605u) {
            this.f28577u.mo36223a(cVar3.f28591g.getColorForState(getState(), 0));
        }
        if (!C5003c.m8889a(porterDuffColorFilter, this.f28580x) || !C5003c.m8889a(porterDuffColorFilter2, this.f28581y)) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private void mo31441C() {
        float q = mo36271q();
        this.f28562f.f28602r = (int) Math.ceil((double) (0.75f * q));
        this.f28562f.f28603s = (int) Math.ceil((double) (q * 0.25f));
        mo31439B();
        mo31437A();
    }

    /* renamed from: a */
    private static int m36002a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: u */
    private void mo31544u() {
        C10645k a = mo36264l().mo36284a((C10645k.C10648c) new C10640b(this, -mo31549w()));
        this.f28574r = a;
        this.f28579w.mo36316a(a, this.f28562f.f28595k, mo31547v(), this.f28569m);
    }

    /* renamed from: v */
    private RectF mo31547v() {
        this.f28571o.set(mo36250d());
        float w = mo31549w();
        this.f28571o.inset(w, w);
        return this.f28571o;
    }

    /* renamed from: w */
    private float mo31549w() {
        if (mo31555z()) {
            return this.f28576t.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: x */
    private boolean mo31551x() {
        C10641c cVar = this.f28562f;
        int i = cVar.f28601q;
        if (i == 1 || cVar.f28602r <= 0 || (i != 2 && !mo36274t())) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private boolean mo31553y() {
        Paint.Style style = this.f28562f.f28606v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: z */
    private boolean mo31555z() {
        Paint.Style style = this.f28562f.f28606v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f28576t.getStrokeWidth() > 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public RectF mo36250d() {
        this.f28570n.set(getBounds());
        return this.f28570n;
    }

    public void draw(Canvas canvas) {
        this.f28575s.setColorFilter(this.f28580x);
        int alpha = this.f28575s.getAlpha();
        this.f28575s.setAlpha(m36002a(alpha, this.f28562f.f28597m));
        this.f28576t.setColorFilter(this.f28581y);
        this.f28576t.setStrokeWidth(this.f28562f.f28596l);
        int alpha2 = this.f28576t.getAlpha();
        this.f28576t.setAlpha(m36002a(alpha2, this.f28562f.f28597m));
        if (this.f28566j) {
            mo31544u();
            m36013b(mo36250d(), this.f28568l);
            this.f28566j = false;
        }
        m36018d(canvas);
        if (mo31553y()) {
            m36012b(canvas);
        }
        if (mo31555z()) {
            m36016c(canvas);
        }
        this.f28575s.setAlpha(alpha);
        this.f28576t.setAlpha(alpha2);
    }

    /* renamed from: e */
    public void mo36253e(float f) {
        this.f28562f.f28596l = f;
        invalidateSelf();
    }

    /* renamed from: f */
    public ColorStateList mo36254f() {
        return this.f28562f.f28588d;
    }

    /* renamed from: g */
    public float mo36255g() {
        return this.f28562f.f28595k;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f28562f;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f28562f.f28601q != 2) {
            if (mo36273s()) {
                outline.setRoundRect(getBounds(), mo36267n() * this.f28562f.f28595k);
                return;
            }
            m36013b(mo36250d(), this.f28568l);
            if (this.f28568l.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f28568l);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f28562f.f28593i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f28572p.set(getBounds());
        m36013b(mo36250d(), this.f28568l);
        this.f28573q.setPath(this.f28568l, this.f28572p);
        this.f28572p.op(this.f28573q, Region.Op.DIFFERENCE);
        return this.f28572p;
    }

    /* renamed from: h */
    public float mo36259h() {
        return this.f28562f.f28598n;
    }

    /* renamed from: i */
    public int mo36260i() {
        C10641c cVar = this.f28562f;
        double d = (double) cVar.f28603s;
        double sin = Math.sin(Math.toRadians((double) cVar.f28604t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    public void invalidateSelf() {
        this.f28566j = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f28562f.f28589e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f28562f.f28588d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f28562f.f28591g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f28562f.f28590f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            n.e.b.b.z.g$c r0 = r1.f28562f
            android.content.res.ColorStateList r0 = r0.f28591g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            n.e.b.b.z.g$c r0 = r1.f28562f
            android.content.res.ColorStateList r0 = r0.f28590f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            n.e.b.b.z.g$c r0 = r1.f28562f
            android.content.res.ColorStateList r0 = r0.f28589e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            n.e.b.b.z.g$c r0 = r1.f28562f
            android.content.res.ColorStateList r0 = r0.f28588d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p277e.p279b.p282b.p297z.C10638g.isStateful():boolean");
    }

    /* renamed from: j */
    public int mo36262j() {
        C10641c cVar = this.f28562f;
        double d = (double) cVar.f28603s;
        double cos = Math.cos(Math.toRadians((double) cVar.f28604t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* renamed from: k */
    public int mo36263k() {
        return this.f28562f.f28602r;
    }

    /* renamed from: l */
    public C10645k mo36264l() {
        return this.f28562f.f28585a;
    }

    /* renamed from: m */
    public ColorStateList mo36265m() {
        return this.f28562f.f28591g;
    }

    public Drawable mutate() {
        this.f28562f = new C10641c(this.f28562f);
        return this;
    }

    /* renamed from: n */
    public float mo36267n() {
        return this.f28562f.f28585a.mo36294j().mo36226a(mo36250d());
    }

    /* renamed from: o */
    public float mo36268o() {
        return this.f28562f.f28585a.mo36296l().mo36226a(mo36250d());
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f28566j = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = mo31476a(iArr) || mo31439B();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public float mo36270p() {
        return this.f28562f.f28600p;
    }

    /* renamed from: q */
    public float mo36271q() {
        return mo36252e() + mo36270p();
    }

    /* renamed from: r */
    public boolean mo36272r() {
        C10611a aVar = this.f28562f.f28586b;
        return aVar != null && aVar.mo36194a();
    }

    /* renamed from: s */
    public boolean mo36273s() {
        return this.f28562f.f28585a.mo36285a(mo36250d());
    }

    public void setAlpha(int i) {
        C10641c cVar = this.f28562f;
        if (cVar.f28597m != i) {
            cVar.f28597m = i;
            mo31437A();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f28562f.f28587c = colorFilter;
        mo31437A();
    }

    public void setShapeAppearanceModel(C10645k kVar) {
        this.f28562f.f28585a = kVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f28562f.f28591g = colorStateList;
        mo31439B();
        mo31437A();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C10641c cVar = this.f28562f;
        if (cVar.f28592h != mode) {
            cVar.f28592h = mode;
            mo31439B();
            mo31437A();
        }
    }

    /* renamed from: t */
    public boolean mo36274t() {
        return Build.VERSION.SDK_INT < 21 || (!mo36273s() && !this.f28568l.isConvex() && Build.VERSION.SDK_INT < 29);
    }

    public C10638g() {
        this(new C10645k());
    }

    /* renamed from: c */
    private int mo31483c(int i) {
        float q = mo36271q() + mo36259h();
        C10611a aVar = this.f28562f.f28586b;
        return aVar != null ? aVar.mo36195b(i, q) : i;
    }

    /* renamed from: b */
    public void mo36247b(ColorStateList colorStateList) {
        C10641c cVar = this.f28562f;
        if (cVar.f28589e != colorStateList) {
            cVar.f28589e = colorStateList;
            onStateChange(getState());
        }
    }

    public C10638g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C10645k.m36076a(context, attributeSet, i, i2).mo36302a());
    }

    /* renamed from: a */
    public static C10638g m36007a(Context context, float f) {
        int a = C10609a.m35925a(context, C10574b.colorSurface, C10638g.class.getSimpleName());
        C10638g gVar = new C10638g();
        gVar.mo36239a(context);
        gVar.mo36240a(ColorStateList.valueOf(a));
        gVar.mo36245b(f);
        return gVar;
    }

    /* renamed from: d */
    public void mo36251d(float f) {
        C10641c cVar = this.f28562f;
        if (cVar.f28598n != f) {
            cVar.f28598n = f;
            mo31441C();
        }
    }

    /* renamed from: e */
    public float mo36252e() {
        return this.f28562f.f28599o;
    }

    public C10638g(C10645k kVar) {
        this(new C10641c(kVar, (C10611a) null));
    }

    /* renamed from: e */
    private void m36019e(Canvas canvas) {
        int i = mo36260i();
        int j = mo36262j();
        if (Build.VERSION.SDK_INT < 21 && this.f28561A) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f28562f.f28602r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(i, j);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) i, (float) j);
    }

    private C10638g(C10641c cVar) {
        this.f28563g = new C10652m.C10659g[4];
        this.f28564h = new C10652m.C10659g[4];
        this.f28565i = new BitSet(8);
        this.f28567k = new Matrix();
        this.f28568l = new Path();
        this.f28569m = new Path();
        this.f28570n = new RectF();
        this.f28571o = new RectF();
        this.f28572p = new Region();
        this.f28573q = new Region();
        this.f28575s = new Paint(1);
        this.f28576t = new Paint(1);
        this.f28577u = new C10630a();
        this.f28579w = new C10649l();
        this.f28582z = new RectF();
        this.f28561A = true;
        this.f28562f = cVar;
        this.f28576t.setStyle(Paint.Style.STROKE);
        this.f28575s.setStyle(Paint.Style.FILL);
        f28560C.setColor(-1);
        f28560C.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        mo31439B();
        mo31476a(getState());
        this.f28578v = new C10639a();
    }

    /* renamed from: b */
    public void mo36245b(float f) {
        C10641c cVar = this.f28562f;
        if (cVar.f28599o != f) {
            cVar.f28599o = f;
            mo31441C();
        }
    }

    /* renamed from: c */
    public void mo36249c(float f) {
        C10641c cVar = this.f28562f;
        if (cVar.f28595k != f) {
            cVar.f28595k = f;
            this.f28566j = true;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    private void m36018d(Canvas canvas) {
        if (mo31551x()) {
            canvas.save();
            m36019e(canvas);
            if (!this.f28561A) {
                m36008a(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f28582z.width() - ((float) getBounds().width()));
            int height = (int) (this.f28582z.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f28582z.width()) + (this.f28562f.f28602r * 2) + width, ((int) this.f28582z.height()) + (this.f28562f.f28602r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f28562f.f28602r) - width);
            float f2 = (float) ((getBounds().top - this.f28562f.f28602r) - height);
            canvas2.translate(-f, -f2);
            m36008a(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo36246b(int i) {
        C10641c cVar = this.f28562f;
        if (cVar.f28604t != i) {
            cVar.f28604t = i;
            mo31437A();
        }
    }

    /* renamed from: c */
    private void m36016c(Canvas canvas) {
        m36009a(canvas, this.f28576t, this.f28569m, this.f28574r, mo31547v());
    }

    /* renamed from: a */
    public void mo36240a(ColorStateList colorStateList) {
        C10641c cVar = this.f28562f;
        if (cVar.f28588d != colorStateList) {
            cVar.f28588d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: b */
    private void m36012b(Canvas canvas) {
        m36009a(canvas, this.f28575s, this.f28568l, this.f28562f.f28585a, mo36250d());
    }

    /* renamed from: b */
    private void m36013b(RectF rectF, Path path) {
        mo36242a(rectF, path);
        if (this.f28562f.f28594j != 1.0f) {
            this.f28567k.reset();
            Matrix matrix = this.f28567k;
            float f = this.f28562f.f28594j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f28567k);
        }
        path.computeBounds(this.f28582z, true);
    }

    /* renamed from: c */
    public float mo36248c() {
        return this.f28562f.f28585a.mo36289e().mo36226a(mo36250d());
    }

    /* renamed from: a */
    public void mo36235a(float f, int i) {
        mo36253e(f);
        mo36247b(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public void mo36236a(float f, ColorStateList colorStateList) {
        mo36253e(f);
        mo36247b(colorStateList);
    }

    /* renamed from: a */
    public void mo36234a(float f) {
        setShapeAppearanceModel(this.f28562f.f28585a.mo36283a(f));
    }

    /* renamed from: a */
    public void mo36238a(int i, int i2, int i3, int i4) {
        C10641c cVar = this.f28562f;
        if (cVar.f28593i == null) {
            cVar.f28593i = new Rect();
        }
        this.f28562f.f28593i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: b */
    public float mo36244b() {
        return this.f28562f.f28585a.mo36287c().mo36226a(mo36250d());
    }

    /* renamed from: n.e.b.b.z.g$c */
    /* compiled from: MaterialShapeDrawable */
    static final class C10641c extends Drawable.ConstantState {

        /* renamed from: a */
        public C10645k f28585a;

        /* renamed from: b */
        public C10611a f28586b;

        /* renamed from: c */
        public ColorFilter f28587c;

        /* renamed from: d */
        public ColorStateList f28588d = null;

        /* renamed from: e */
        public ColorStateList f28589e = null;

        /* renamed from: f */
        public ColorStateList f28590f = null;

        /* renamed from: g */
        public ColorStateList f28591g = null;

        /* renamed from: h */
        public PorterDuff.Mode f28592h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f28593i = null;

        /* renamed from: j */
        public float f28594j = 1.0f;

        /* renamed from: k */
        public float f28595k = 1.0f;

        /* renamed from: l */
        public float f28596l;

        /* renamed from: m */
        public int f28597m = 255;

        /* renamed from: n */
        public float f28598n = 0.0f;

        /* renamed from: o */
        public float f28599o = 0.0f;

        /* renamed from: p */
        public float f28600p = 0.0f;

        /* renamed from: q */
        public int f28601q = 0;

        /* renamed from: r */
        public int f28602r = 0;

        /* renamed from: s */
        public int f28603s = 0;

        /* renamed from: t */
        public int f28604t = 0;

        /* renamed from: u */
        public boolean f28605u = false;

        /* renamed from: v */
        public Paint.Style f28606v = Paint.Style.FILL_AND_STROKE;

        public C10641c(C10645k kVar, C10611a aVar) {
            this.f28585a = kVar;
            this.f28586b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C10638g gVar = new C10638g(this, (C10639a) null);
            boolean unused = gVar.f28566j = true;
            return gVar;
        }

        public C10641c(C10641c cVar) {
            this.f28585a = cVar.f28585a;
            this.f28586b = cVar.f28586b;
            this.f28596l = cVar.f28596l;
            this.f28587c = cVar.f28587c;
            this.f28588d = cVar.f28588d;
            this.f28589e = cVar.f28589e;
            this.f28592h = cVar.f28592h;
            this.f28591g = cVar.f28591g;
            this.f28597m = cVar.f28597m;
            this.f28594j = cVar.f28594j;
            this.f28603s = cVar.f28603s;
            this.f28601q = cVar.f28601q;
            this.f28605u = cVar.f28605u;
            this.f28595k = cVar.f28595k;
            this.f28598n = cVar.f28598n;
            this.f28599o = cVar.f28599o;
            this.f28600p = cVar.f28600p;
            this.f28602r = cVar.f28602r;
            this.f28604t = cVar.f28604t;
            this.f28590f = cVar.f28590f;
            this.f28606v = cVar.f28606v;
            if (cVar.f28593i != null) {
                this.f28593i = new Rect(cVar.f28593i);
            }
        }
    }

    /* renamed from: a */
    public void mo36239a(Context context) {
        this.f28562f.f28586b = new C10611a(context);
        mo31441C();
    }

    /* renamed from: a */
    public void mo36243a(boolean z) {
        this.f28561A = z;
    }

    /* renamed from: a */
    public void mo36237a(int i) {
        this.f28577u.mo36223a(i);
        this.f28562f.f28605u = false;
        mo31437A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36241a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m36009a(canvas, paint, path, this.f28562f.f28585a, rectF);
    }

    /* renamed from: a */
    private void m36009a(Canvas canvas, Paint paint, Path path, C10645k kVar, RectF rectF) {
        if (kVar.mo36285a(rectF)) {
            float a = kVar.mo36296l().mo36226a(rectF) * this.f28562f.f28595k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: a */
    private void m36008a(Canvas canvas) {
        if (this.f28565i.cardinality() > 0) {
            Log.w(f28559B, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f28562f.f28603s != 0) {
            canvas.drawPath(this.f28568l, this.f28577u.mo36222a());
        }
        for (int i = 0; i < 4; i++) {
            this.f28563g[i].mo36332a(this.f28577u, this.f28562f.f28602r, canvas);
            this.f28564h[i].mo36332a(this.f28577u, this.f28562f.f28602r, canvas);
        }
        if (this.f28561A) {
            int i2 = mo36260i();
            int j = mo36262j();
            canvas.translate((float) (-i2), (float) (-j));
            canvas.drawPath(this.f28568l, f28560C);
            canvas.translate((float) i2, (float) j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36242a(RectF rectF, Path path) {
        C10649l lVar = this.f28579w;
        C10641c cVar = this.f28562f;
        C10645k kVar = cVar.f28585a;
        float f = cVar.f28595k;
        lVar.mo36317a(kVar, f, rectF, this.f28578v, path);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m36003a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m36005a(paint, z);
        }
        return m36004a(colorStateList, mode, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter m36005a(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.mo31483c((int) r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p277e.p279b.p282b.p297z.C10638g.m36005a(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* renamed from: a */
    private PorterDuffColorFilter m36004a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo31483c(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: a */
    private boolean mo31476a(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f28562f.f28588d == null || (color2 = this.f28575s.getColor()) == (colorForState2 = this.f28562f.f28588d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f28575s.setColor(colorForState2);
            z = true;
        }
        if (this.f28562f.f28589e == null || (color = this.f28576t.getColor()) == (colorForState = this.f28562f.f28589e.getColorForState(iArr, color))) {
            return z;
        }
        this.f28576t.setColor(colorForState);
        return true;
    }
}
