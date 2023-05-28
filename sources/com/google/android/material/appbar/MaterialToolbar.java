package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.theme.p190a.C8648a;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10642h;

public class MaterialToolbar extends Toolbar {

    /* renamed from: U */
    private static final int f23794U = C10583k.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m27033a(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C10638g gVar = new C10638g();
            gVar.mo36240a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.mo36239a(context);
            gVar.mo36245b(C5071v.m9200l(this));
            C5071v.m9161a((View) this, (Drawable) gVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10642h.m36066a((View) this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C10642h.m36067a((View) this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f23794U), attributeSet, i);
        m27033a(getContext());
    }
}
