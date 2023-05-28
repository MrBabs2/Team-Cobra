package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import p050l.p051a.C4790a;

/* renamed from: androidx.appcompat.widget.p */
/* compiled from: AppCompatSeekBar */
public class C0275p extends SeekBar {

    /* renamed from: f */
    private final C0277q f1170f;

    public C0275p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.seekBarStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1170f.mo1709b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1170f.mo1710c();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1170f.mo1707a(canvas);
    }

    public C0275p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0277q qVar = new C0277q(this);
        this.f1170f = qVar;
        qVar.mo1702a(attributeSet, i);
    }
}
