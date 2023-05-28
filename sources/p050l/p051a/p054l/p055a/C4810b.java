package p050l.p051a.p054l.p055a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0414a;

/* renamed from: l.a.l.a.b */
/* compiled from: DrawableContainer */
class C4810b extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private C4813c f8158f;

    /* renamed from: g */
    private Rect f8159g;

    /* renamed from: h */
    private Drawable f8160h;

    /* renamed from: i */
    private Drawable f8161i;

    /* renamed from: j */
    private int f8162j = 255;

    /* renamed from: k */
    private boolean f8163k;

    /* renamed from: l */
    private int f8164l = -1;

    /* renamed from: m */
    private boolean f8165m;

    /* renamed from: n */
    private Runnable f8166n;

    /* renamed from: o */
    private long f8167o;

    /* renamed from: p */
    private long f8168p;

    /* renamed from: q */
    private C4812b f8169q;

    /* renamed from: l.a.l.a.b$a */
    /* compiled from: DrawableContainer */
    class C4811a implements Runnable {
        C4811a() {
        }

        public void run() {
            C4810b.this.mo16673a(true);
            C4810b.this.invalidateSelf();
        }
    }

    /* renamed from: l.a.l.a.b$b */
    /* compiled from: DrawableContainer */
    static class C4812b implements Drawable.Callback {

        /* renamed from: f */
        private Drawable.Callback f8171f;

        C4812b() {
        }

        /* renamed from: a */
        public C4812b mo16708a(Drawable.Callback callback) {
            this.f8171f = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f8171f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f8171f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        /* renamed from: a */
        public Drawable.Callback mo16707a() {
            Drawable.Callback callback = this.f8171f;
            this.f8171f = null;
            return callback;
        }
    }

    /* renamed from: l.a.l.a.b$c */
    /* compiled from: DrawableContainer */
    static abstract class C4813c extends Drawable.ConstantState {

        /* renamed from: A */
        int f8172A;

        /* renamed from: B */
        int f8173B;

        /* renamed from: C */
        boolean f8174C;

        /* renamed from: D */
        ColorFilter f8175D;

        /* renamed from: E */
        boolean f8176E;

        /* renamed from: F */
        ColorStateList f8177F;

        /* renamed from: G */
        PorterDuff.Mode f8178G;

        /* renamed from: H */
        boolean f8179H;

        /* renamed from: I */
        boolean f8180I;

        /* renamed from: a */
        final C4810b f8181a;

        /* renamed from: b */
        Resources f8182b;

        /* renamed from: c */
        int f8183c = 160;

        /* renamed from: d */
        int f8184d;

        /* renamed from: e */
        int f8185e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f8186f;

        /* renamed from: g */
        Drawable[] f8187g;

        /* renamed from: h */
        int f8188h;

        /* renamed from: i */
        boolean f8189i;

        /* renamed from: j */
        boolean f8190j;

        /* renamed from: k */
        Rect f8191k;

        /* renamed from: l */
        boolean f8192l;

        /* renamed from: m */
        boolean f8193m;

        /* renamed from: n */
        int f8194n;

        /* renamed from: o */
        int f8195o;

        /* renamed from: p */
        int f8196p;

        /* renamed from: q */
        int f8197q;

        /* renamed from: r */
        boolean f8198r;

        /* renamed from: s */
        int f8199s;

        /* renamed from: t */
        boolean f8200t;

        /* renamed from: u */
        boolean f8201u;

        /* renamed from: v */
        boolean f8202v;

        /* renamed from: w */
        boolean f8203w;

        /* renamed from: x */
        boolean f8204x;

        /* renamed from: y */
        boolean f8205y;

        /* renamed from: z */
        int f8206z;

        C4813c(C4813c cVar, C4810b bVar, Resources resources) {
            Resources resources2;
            this.f8189i = false;
            this.f8192l = false;
            this.f8204x = true;
            this.f8172A = 0;
            this.f8173B = 0;
            this.f8181a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.f8182b : null;
            }
            this.f8182b = resources2;
            int a = C4810b.m7974a(resources, cVar != null ? cVar.f8183c : 0);
            this.f8183c = a;
            if (cVar != null) {
                this.f8184d = cVar.f8184d;
                this.f8185e = cVar.f8185e;
                this.f8202v = true;
                this.f8203w = true;
                this.f8189i = cVar.f8189i;
                this.f8192l = cVar.f8192l;
                this.f8204x = cVar.f8204x;
                this.f8205y = cVar.f8205y;
                this.f8206z = cVar.f8206z;
                this.f8172A = cVar.f8172A;
                this.f8173B = cVar.f8173B;
                this.f8174C = cVar.f8174C;
                this.f8175D = cVar.f8175D;
                this.f8176E = cVar.f8176E;
                this.f8177F = cVar.f8177F;
                this.f8178G = cVar.f8178G;
                this.f8179H = cVar.f8179H;
                this.f8180I = cVar.f8180I;
                if (cVar.f8183c == a) {
                    if (cVar.f8190j) {
                        this.f8191k = new Rect(cVar.f8191k);
                        this.f8190j = true;
                    }
                    if (cVar.f8193m) {
                        this.f8194n = cVar.f8194n;
                        this.f8195o = cVar.f8195o;
                        this.f8196p = cVar.f8196p;
                        this.f8197q = cVar.f8197q;
                        this.f8193m = true;
                    }
                }
                if (cVar.f8198r) {
                    this.f8199s = cVar.f8199s;
                    this.f8198r = true;
                }
                if (cVar.f8200t) {
                    this.f8201u = cVar.f8201u;
                    this.f8200t = true;
                }
                Drawable[] drawableArr = cVar.f8187g;
                this.f8187g = new Drawable[drawableArr.length];
                this.f8188h = cVar.f8188h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f8186f;
                if (sparseArray != null) {
                    this.f8186f = sparseArray.clone();
                } else {
                    this.f8186f = new SparseArray<>(this.f8188h);
                }
                int i = this.f8188h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f8186f.put(i2, constantState);
                        } else {
                            this.f8187g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f8187g = new Drawable[10];
            this.f8188h = 0;
        }

        /* renamed from: b */
        private Drawable m7985b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f8206z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f8181a);
            return mutate;
        }

        /* renamed from: n */
        private void m7986n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f8186f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f8187g[this.f8186f.keyAt(i)] = m7985b(this.f8186f.valueAt(i).newDrawable(this.f8182b));
                }
                this.f8186f = null;
            }
        }

        /* renamed from: a */
        public final int mo16712a(Drawable drawable) {
            int i = this.f8188h;
            if (i >= this.f8187g.length) {
                mo16714a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f8181a);
            this.f8187g[i] = drawable;
            this.f8188h++;
            this.f8185e = drawable.getChangingConfigurations() | this.f8185e;
            mo16734k();
            this.f8191k = null;
            this.f8190j = false;
            this.f8193m = false;
            this.f8202v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final int mo16723c() {
            return this.f8187g.length;
        }

        public boolean canApplyTheme() {
            int i = this.f8188h;
            Drawable[] drawableArr = this.f8187g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f8186f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int mo16726d() {
            return this.f8188h;
        }

        /* renamed from: e */
        public final int mo16727e() {
            if (!this.f8193m) {
                mo16719b();
            }
            return this.f8195o;
        }

        /* renamed from: f */
        public final int mo16728f() {
            if (!this.f8193m) {
                mo16719b();
            }
            return this.f8197q;
        }

        /* renamed from: g */
        public final int mo16729g() {
            if (!this.f8193m) {
                mo16719b();
            }
            return this.f8196p;
        }

        public int getChangingConfigurations() {
            return this.f8184d | this.f8185e;
        }

        /* renamed from: h */
        public final Rect mo16731h() {
            Rect rect = null;
            if (this.f8189i) {
                return null;
            }
            if (this.f8191k != null || this.f8190j) {
                return this.f8191k;
            }
            m7986n();
            Rect rect2 = new Rect();
            int i = this.f8188h;
            Drawable[] drawableArr = this.f8187g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect2.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect2.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect2.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect2.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f8190j = true;
            this.f8191k = rect;
            return rect;
        }

        /* renamed from: i */
        public final int mo16732i() {
            if (!this.f8193m) {
                mo16719b();
            }
            return this.f8194n;
        }

        /* renamed from: j */
        public final int mo16733j() {
            if (this.f8198r) {
                return this.f8199s;
            }
            m7986n();
            int i = this.f8188h;
            Drawable[] drawableArr = this.f8187g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f8199s = opacity;
            this.f8198r = true;
            return opacity;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo16734k() {
            this.f8198r = false;
            this.f8200t = false;
        }

        /* renamed from: l */
        public final boolean mo16735l() {
            return this.f8192l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public abstract void mo16664m();

        /* renamed from: c */
        public final void mo16724c(int i) {
            this.f8173B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo16722b(int i, int i2) {
            int i3 = this.f8188h;
            Drawable[] drawableArr = this.f8187g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f8206z = i;
            return z;
        }

        /* renamed from: b */
        public final void mo16721b(boolean z) {
            this.f8189i = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16719b() {
            this.f8193m = true;
            m7986n();
            int i = this.f8188h;
            Drawable[] drawableArr = this.f8187g;
            this.f8195o = -1;
            this.f8194n = -1;
            this.f8197q = 0;
            this.f8196p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f8194n) {
                    this.f8194n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f8195o) {
                    this.f8195o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f8196p) {
                    this.f8196p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f8197q) {
                    this.f8197q = minimumHeight;
                }
            }
        }

        /* renamed from: a */
        public final Drawable mo16713a(int i) {
            int indexOfKey;
            Drawable drawable = this.f8187g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f8186f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b = m7985b(this.f8186f.valueAt(indexOfKey).newDrawable(this.f8182b));
            this.f8187g[i] = b;
            this.f8186f.removeAt(indexOfKey);
            if (this.f8186f.size() == 0) {
                this.f8186f = null;
            }
            return b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo16716a(Resources resources) {
            if (resources != null) {
                this.f8182b = resources;
                int a = C4810b.m7974a(resources, this.f8183c);
                int i = this.f8183c;
                this.f8183c = a;
                if (i != a) {
                    this.f8193m = false;
                    this.f8190j = false;
                }
            }
        }

        /* renamed from: b */
        public final void mo16720b(int i) {
            this.f8172A = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo16715a(Resources.Theme theme) {
            if (theme != null) {
                m7986n();
                int i = this.f8188h;
                Drawable[] drawableArr = this.f8187g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f8185e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo16716a(theme.getResources());
            }
        }

        /* renamed from: a */
        public final void mo16717a(boolean z) {
            this.f8192l = z;
        }

        /* renamed from: a */
        public void mo16714a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f8187g, 0, drawableArr, 0, i);
            this.f8187g = drawableArr;
        }

        /* renamed from: a */
        public synchronized boolean mo16718a() {
            if (this.f8202v) {
                return this.f8203w;
            }
            m7986n();
            this.f8202v = true;
            int i = this.f8188h;
            Drawable[] drawableArr = this.f8187g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f8203w = false;
                    return false;
                }
            }
            this.f8203w = true;
            return true;
        }
    }

    C4810b() {
    }

    /* renamed from: c */
    private boolean m7976c() {
        if (!isAutoMirrored() || C0414a.m2025e(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4813c mo16647a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16674a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f8164l
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            l.a.l.a.b$c r0 = r9.f8158f
            int r0 = r0.f8173B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f8161i
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f8160h
            if (r0 == 0) goto L_0x0029
            r9.f8161i = r0
            l.a.l.a.b$c r0 = r9.f8158f
            int r0 = r0.f8173B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f8168p = r0
            goto L_0x0035
        L_0x0029:
            r9.f8161i = r4
            r9.f8168p = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f8160h
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            l.a.l.a.b$c r0 = r9.f8158f
            int r1 = r0.f8188h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo16713a((int) r10)
            r9.f8160h = r0
            r9.f8164l = r10
            if (r0 == 0) goto L_0x005a
            l.a.l.a.b$c r10 = r9.f8158f
            int r10 = r10.f8172A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f8167o = r2
        L_0x0051:
            r9.m7975a((android.graphics.drawable.Drawable) r0)
            goto L_0x005a
        L_0x0055:
            r9.f8160h = r4
            r10 = -1
            r9.f8164l = r10
        L_0x005a:
            long r0 = r9.f8167o
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f8168p
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f8166n
            if (r0 != 0) goto L_0x0073
            l.a.l.a.b$a r0 = new l.a.l.a.b$a
            r0.<init>()
            r9.f8166n = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo16673a((boolean) r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p051a.p054l.p055a.C4810b.mo16674a(int):boolean");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f8158f.mo16715a(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo16676b() {
        return this.f8164l;
    }

    public boolean canApplyTheme() {
        return this.f8158f.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f8160h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f8161i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f8162j;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f8158f.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f8158f.mo16718a()) {
            return null;
        }
        this.f8158f.f8184d = getChangingConfigurations();
        return this.f8158f;
    }

    public Drawable getCurrent() {
        return this.f8160h;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f8159g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f8158f.mo16735l()) {
            return this.f8158f.mo16727e();
        }
        Drawable drawable = this.f8160h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f8158f.mo16735l()) {
            return this.f8158f.mo16732i();
        }
        Drawable drawable = this.f8160h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f8158f.mo16735l()) {
            return this.f8158f.mo16728f();
        }
        Drawable drawable = this.f8160h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f8158f.mo16735l()) {
            return this.f8158f.mo16729g();
        }
        Drawable drawable = this.f8160h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f8160h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f8158f.mo16733j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f8160h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h = this.f8158f.mo16731h();
        if (h != null) {
            rect.set(h);
            z = (h.right | ((h.left | h.top) | h.bottom)) != 0;
        } else {
            Drawable drawable = this.f8160h;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (m7976c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C4813c cVar = this.f8158f;
        if (cVar != null) {
            cVar.mo16734k();
        }
        if (drawable == this.f8160h && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f8158f.f8174C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f8161i;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f8161i = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f8160h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f8163k) {
                this.f8160h.setAlpha(this.f8162j);
            }
        }
        if (this.f8168p != 0) {
            this.f8168p = 0;
            z = true;
        }
        if (this.f8167o != 0) {
            this.f8167o = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f8165m && super.mutate() == this) {
            C4813c a = mo16647a();
            a.mo16664m();
            mo16649a(a);
            this.f8165m = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8161i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f8160h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f8158f.mo16722b(i, mo16676b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f8161i;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f8160h;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8161i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f8160h;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f8160h && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f8163k || this.f8162j != i) {
            this.f8163k = true;
            this.f8162j = i;
            Drawable drawable = this.f8160h;
            if (drawable == null) {
                return;
            }
            if (this.f8167o == 0) {
                drawable.setAlpha(i);
            } else {
                mo16673a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C4813c cVar = this.f8158f;
        if (cVar.f8174C != z) {
            cVar.f8174C = z;
            Drawable drawable = this.f8160h;
            if (drawable != null) {
                C0414a.m2018a(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C4813c cVar = this.f8158f;
        cVar.f8176E = true;
        if (cVar.f8175D != colorFilter) {
            cVar.f8175D = colorFilter;
            Drawable drawable = this.f8160h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C4813c cVar = this.f8158f;
        if (cVar.f8204x != z) {
            cVar.f8204x = z;
            Drawable drawable = this.f8160h;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f8160h;
        if (drawable != null) {
            C0414a.m2012a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f8159g;
        if (rect == null) {
            this.f8159g = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f8160h;
        if (drawable != null) {
            C0414a.m2013a(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C4813c cVar = this.f8158f;
        cVar.f8179H = true;
        if (cVar.f8177F != colorStateList) {
            cVar.f8177F = colorStateList;
            C0414a.m2014a(this.f8160h, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C4813c cVar = this.f8158f;
        cVar.f8180I = true;
        if (cVar.f8178G != mode) {
            cVar.f8178G = mode;
            C0414a.m2017a(this.f8160h, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f8161i;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f8160h;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f8160h && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    private void m7975a(Drawable drawable) {
        if (this.f8169q == null) {
            this.f8169q = new C4812b();
        }
        C4812b bVar = this.f8169q;
        bVar.mo16708a(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f8158f.f8172A <= 0 && this.f8163k) {
                drawable.setAlpha(this.f8162j);
            }
            if (this.f8158f.f8176E) {
                drawable.setColorFilter(this.f8158f.f8175D);
            } else {
                if (this.f8158f.f8179H) {
                    C0414a.m2014a(drawable, this.f8158f.f8177F);
                }
                if (this.f8158f.f8180I) {
                    C0414a.m2017a(drawable, this.f8158f.f8178G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f8158f.f8204x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f8158f.f8174C);
            }
            Rect rect = this.f8159g;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f8169q.mo16707a());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16673a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f8163k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f8160h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f8167o
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f8162j
            r3.setAlpha(r9)
            r13.f8167o = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            l.a.l.a.b$c r9 = r13.f8158f
            int r9 = r9.f8172A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f8162j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f8167o = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f8161i
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f8168p
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f8161i = r0
            r13.f8168p = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            l.a.l.a.b$c r4 = r13.f8158f
            int r4 = r4.f8173B
            int r3 = r3 / r4
            int r4 = r13.f8162j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f8168p = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f8166n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p051a.p054l.p055a.C4810b.mo16673a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16672a(Resources resources) {
        this.f8158f.mo16716a(resources);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16649a(C4813c cVar) {
        this.f8158f = cVar;
        int i = this.f8164l;
        if (i >= 0) {
            Drawable a = cVar.mo16713a(i);
            this.f8160h = a;
            if (a != null) {
                m7975a(a);
            }
        }
        this.f8161i = null;
    }

    /* renamed from: a */
    static int m7974a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }
}
