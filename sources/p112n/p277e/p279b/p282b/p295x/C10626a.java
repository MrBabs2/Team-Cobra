package p112n.p277e.p279b.p282b.p295x;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0415b;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10645k;
import p112n.p277e.p279b.p282b.p297z.C10660n;

/* renamed from: n.e.b.b.x.a */
/* compiled from: RippleDrawableCompat */
public class C10626a extends Drawable implements C10660n, C0415b {

    /* renamed from: f */
    private C10628b f28528f;

    /* renamed from: n.e.b.b.x.a$b */
    /* compiled from: RippleDrawableCompat */
    static final class C10628b extends Drawable.ConstantState {

        /* renamed from: a */
        C10638g f28529a;

        /* renamed from: b */
        boolean f28530b;

        public C10628b(C10638g gVar) {
            this.f28529a = gVar;
            this.f28530b = false;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C10626a newDrawable() {
            return new C10626a(new C10628b(this));
        }

        public C10628b(C10628b bVar) {
            this.f28529a = (C10638g) bVar.f28529a.getConstantState().newDrawable();
            this.f28530b = bVar.f28530b;
        }
    }

    public void draw(Canvas canvas) {
        C10628b bVar = this.f28528f;
        if (bVar.f28530b) {
            bVar.f28529a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f28528f;
    }

    public int getOpacity() {
        return this.f28528f.f28529a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f28528f.f28529a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f28528f.f28529a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a = C10629b.m35982a(iArr);
        C10628b bVar = this.f28528f;
        if (bVar.f28530b == a) {
            return onStateChange;
        }
        bVar.f28530b = a;
        return true;
    }

    public void setAlpha(int i) {
        this.f28528f.f28529a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f28528f.f28529a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C10645k kVar) {
        this.f28528f.f28529a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i) {
        this.f28528f.f28529a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f28528f.f28529a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f28528f.f28529a.setTintMode(mode);
    }

    public C10626a(C10645k kVar) {
        this(new C10628b(new C10638g(kVar)));
    }

    public C10626a mutate() {
        this.f28528f = new C10628b(this.f28528f);
        return this;
    }

    private C10626a(C10628b bVar) {
        this.f28528f = bVar;
    }
}
