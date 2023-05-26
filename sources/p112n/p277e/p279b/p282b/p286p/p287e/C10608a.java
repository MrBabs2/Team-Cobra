package p112n.p277e.p279b.p282b.p286p.p287e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.google.android.material.card.MaterialCardView;
import p112n.p277e.p279b.p282b.p286p.C10601c;
import p112n.p277e.p279b.p282b.p286p.C10602d;

/* renamed from: n.e.b.b.p.e.a */
/* compiled from: CircularRevealCardView */
public class C10608a extends MaterialCardView implements C10602d {

    /* renamed from: x */
    private final C10601c f28493x;

    /* renamed from: a */
    public void mo36158a() {
        this.f28493x.mo36168a();
        throw null;
    }

    /* renamed from: b */
    public void mo36159b() {
        this.f28493x.mo36173b();
        throw null;
    }

    public void draw(Canvas canvas) {
        C10601c cVar = this.f28493x;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.mo36170a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f28493x.mo36174c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f28493x.mo36175d();
        throw null;
    }

    public C10602d.C10607e getRevealInfo() {
        this.f28493x.mo36176e();
        throw null;
    }

    public boolean isOpaque() {
        C10601c cVar = this.f28493x;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.mo36177f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f28493x.mo36171a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f28493x.mo36169a(i);
        throw null;
    }

    public void setRevealInfo(C10602d.C10607e eVar) {
        this.f28493x.mo36172a(eVar);
        throw null;
    }
}
