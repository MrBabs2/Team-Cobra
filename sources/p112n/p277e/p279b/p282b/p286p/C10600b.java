package p112n.p277e.p279b.p282b.p286p;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p112n.p277e.p279b.p282b.p286p.C10602d;

/* renamed from: n.e.b.b.p.b */
/* compiled from: CircularRevealFrameLayout */
public class C10600b extends FrameLayout implements C10602d {

    /* renamed from: f */
    private final C10601c f28484f;

    /* renamed from: a */
    public void mo36158a() {
        this.f28484f.mo36168a();
        throw null;
    }

    /* renamed from: b */
    public void mo36159b() {
        this.f28484f.mo36173b();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C10601c cVar = this.f28484f;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.mo36170a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f28484f.mo36174c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f28484f.mo36175d();
        throw null;
    }

    public C10602d.C10607e getRevealInfo() {
        this.f28484f.mo36176e();
        throw null;
    }

    public boolean isOpaque() {
        C10601c cVar = this.f28484f;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.mo36177f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f28484f.mo36171a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f28484f.mo36169a(i);
        throw null;
    }

    public void setRevealInfo(C10602d.C10607e eVar) {
        this.f28484f.mo36172a(eVar);
        throw null;
    }
}
