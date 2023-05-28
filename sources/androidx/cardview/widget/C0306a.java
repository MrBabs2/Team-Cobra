package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.C0314g;

/* renamed from: androidx.cardview.widget.a */
/* compiled from: CardViewApi17Impl */
class C0306a extends C0309c {

    /* renamed from: androidx.cardview.widget.a$a */
    /* compiled from: CardViewApi17Impl */
    class C0307a implements C0314g.C0315a {
        C0307a(C0306a aVar) {
        }

        /* renamed from: a */
        public void mo1916a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0306a() {
    }

    /* renamed from: a */
    public void mo1915a() {
        C0314g.f1311r = new C0307a(this);
    }
}
