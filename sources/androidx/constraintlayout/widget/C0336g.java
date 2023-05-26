package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p050l.p067f.p071b.p072k.C4907e;

/* renamed from: androidx.constraintlayout.widget.g */
/* compiled from: Placeholder */
public class C0336g extends View {

    /* renamed from: f */
    private int f1578f;

    /* renamed from: g */
    private View f1579g;

    /* renamed from: h */
    private int f1580h;

    /* renamed from: a */
    public void mo2068a(ConstraintLayout constraintLayout) {
        if (this.f1579g != null) {
            ConstraintLayout.C0317b bVar = (ConstraintLayout.C0317b) getLayoutParams();
            ConstraintLayout.C0317b bVar2 = (ConstraintLayout.C0317b) this.f1579g.getLayoutParams();
            bVar2.f1402m0.mo17261s(0);
            if (bVar.f1402m0.mo17250n() != C4907e.C4909b.FIXED) {
                bVar.f1402m0.mo17263t(bVar2.f1402m0.mo17180C());
            }
            if (bVar.f1402m0.mo17271z() != C4907e.C4909b.FIXED) {
                bVar.f1402m0.mo17247l(bVar2.f1402m0.mo17244k());
            }
            bVar2.f1402m0.mo17261s(8);
        }
    }

    /* renamed from: b */
    public void mo2069b(ConstraintLayout constraintLayout) {
        if (this.f1578f == -1 && !isInEditMode()) {
            setVisibility(this.f1580h);
        }
        View findViewById = constraintLayout.findViewById(this.f1578f);
        this.f1579g = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0317b) findViewById.getLayoutParams()).f1378a0 = true;
            this.f1579g.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1579g;
    }

    public int getEmptyVisibility() {
        return this.f1580h;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f1578f != i) {
            View view = this.f1579g;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0317b) this.f1579g.getLayoutParams()).f1378a0 = false;
                this.f1579g = null;
            }
            this.f1578f = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1580h = i;
    }
}
