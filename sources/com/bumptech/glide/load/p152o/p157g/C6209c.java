package com.bumptech.glide.load.p152o.p157g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.p152o.p157g.C6214g;
import com.bumptech.glide.p143l.C5895a;
import com.bumptech.glide.p166r.C6315j;
import java.nio.ByteBuffer;
import java.util.List;
import p050l.p109t.p110a.p111a.C5275b;

/* renamed from: com.bumptech.glide.load.o.g.c */
/* compiled from: GifDrawable */
public class C6209c extends Drawable implements C6214g.C6216b, Animatable, C5275b {

    /* renamed from: f */
    private final C6210a f11335f;

    /* renamed from: g */
    private boolean f11336g;

    /* renamed from: h */
    private boolean f11337h;

    /* renamed from: i */
    private boolean f11338i;

    /* renamed from: j */
    private boolean f11339j;

    /* renamed from: k */
    private int f11340k;

    /* renamed from: l */
    private int f11341l;

    /* renamed from: m */
    private boolean f11342m;

    /* renamed from: n */
    private Paint f11343n;

    /* renamed from: o */
    private Rect f11344o;

    /* renamed from: p */
    private List<C5275b.C5276a> f11345p;

    /* renamed from: com.bumptech.glide.load.o.g.c$a */
    /* compiled from: GifDrawable */
    static final class C6210a extends Drawable.ConstantState {

        /* renamed from: a */
        final C6214g f11346a;

        C6210a(C6214g gVar) {
            this.f11346a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C6209c(this);
        }
    }

    public C6209c(Context context, C5895a aVar, C6030l<Bitmap> lVar, int i, int i2, Bitmap bitmap) {
        this(new C6210a(new C6214g(C5874c.m11487b(context), aVar, i, i2, lVar, bitmap)));
    }

    /* renamed from: h */
    private Drawable.Callback m12596h() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: i */
    private Rect m12597i() {
        if (this.f11344o == null) {
            this.f11344o = new Rect();
        }
        return this.f11344o;
    }

    /* renamed from: j */
    private Paint m12598j() {
        if (this.f11343n == null) {
            this.f11343n = new Paint(2);
        }
        return this.f11343n;
    }

    /* renamed from: k */
    private void m12599k() {
        List<C5275b.C5276a> list = this.f11345p;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f11345p.get(i).mo18139a(this);
            }
        }
    }

    /* renamed from: l */
    private void m12600l() {
        this.f11340k = 0;
    }

    /* renamed from: m */
    private void m12601m() {
        C6315j.m12982a(!this.f11338i, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f11335f.f11346a.mo20540f() == 1) {
            invalidateSelf();
        } else if (!this.f11336g) {
            this.f11336g = true;
            this.f11335f.f11346a.mo20534a((C6214g.C6216b) this);
            invalidateSelf();
        }
    }

    /* renamed from: n */
    private void m12602n() {
        this.f11336g = false;
        this.f11335f.f11346a.mo20536b(this);
    }

    /* renamed from: a */
    public void mo20508a(C6030l<Bitmap> lVar, Bitmap bitmap) {
        this.f11335f.f11346a.mo20532a(lVar, bitmap);
    }

    /* renamed from: b */
    public ByteBuffer mo20509b() {
        return this.f11335f.f11346a.mo20535b();
    }

    /* renamed from: c */
    public Bitmap mo20510c() {
        return this.f11335f.f11346a.mo20539e();
    }

    /* renamed from: d */
    public int mo20511d() {
        return this.f11335f.f11346a.mo20540f();
    }

    public void draw(Canvas canvas) {
        if (!this.f11338i) {
            if (this.f11342m) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m12597i());
                this.f11342m = false;
            }
            canvas.drawBitmap(this.f11335f.f11346a.mo20537c(), (Rect) null, m12597i(), m12598j());
        }
    }

    /* renamed from: e */
    public int mo20513e() {
        return this.f11335f.f11346a.mo20538d();
    }

    /* renamed from: f */
    public int mo20514f() {
        return this.f11335f.f11346a.mo20542h();
    }

    /* renamed from: g */
    public void mo20515g() {
        this.f11338i = true;
        this.f11335f.f11346a.mo20531a();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f11335f;
    }

    public int getIntrinsicHeight() {
        return this.f11335f.f11346a.mo20541g();
    }

    public int getIntrinsicWidth() {
        return this.f11335f.f11346a.mo20543i();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f11336g;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11342m = true;
    }

    public void setAlpha(int i) {
        m12598j().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m12598j().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C6315j.m12982a(!this.f11338i, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f11339j = z;
        if (!z) {
            m12602n();
        } else if (this.f11337h) {
            m12601m();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f11337h = true;
        m12600l();
        if (this.f11339j) {
            m12601m();
        }
    }

    public void stop() {
        this.f11337h = false;
        m12602n();
    }

    /* renamed from: a */
    public void mo20507a() {
        if (m12596h() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo20513e() == mo20511d() - 1) {
            this.f11340k++;
        }
        int i = this.f11341l;
        if (i != -1 && this.f11340k >= i) {
            m12599k();
            stop();
        }
    }

    C6209c(C6210a aVar) {
        this.f11339j = true;
        this.f11341l = -1;
        C6315j.m12978a(aVar);
        this.f11335f = aVar;
    }
}
