package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0286t;
import androidx.core.widget.C0436i;
import java.util.ArrayList;
import java.util.List;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.p283m.C10585a;
import p112n.p277e.p279b.p282b.p283m.C10586b;

/* renamed from: com.google.android.material.textfield.f */
/* compiled from: IndicatorViewController */
final class C8638f {

    /* renamed from: a */
    private final Context f24657a;

    /* renamed from: b */
    private final TextInputLayout f24658b;

    /* renamed from: c */
    private LinearLayout f24659c;

    /* renamed from: d */
    private int f24660d;

    /* renamed from: e */
    private FrameLayout f24661e;

    /* renamed from: f */
    private int f24662f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Animator f24663g;

    /* renamed from: h */
    private final float f24664h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f24665i;

    /* renamed from: j */
    private int f24666j;

    /* renamed from: k */
    private CharSequence f24667k;

    /* renamed from: l */
    private boolean f24668l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f24669m;

    /* renamed from: n */
    private CharSequence f24670n;

    /* renamed from: o */
    private int f24671o;

    /* renamed from: p */
    private ColorStateList f24672p;

    /* renamed from: q */
    private CharSequence f24673q;

    /* renamed from: r */
    private boolean f24674r;

    /* renamed from: s */
    private TextView f24675s;

    /* renamed from: t */
    private int f24676t;

    /* renamed from: u */
    private ColorStateList f24677u;

    /* renamed from: v */
    private Typeface f24678v;

    /* renamed from: com.google.android.material.textfield.f$a */
    /* compiled from: IndicatorViewController */
    class C8639a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f24679a;

        /* renamed from: b */
        final /* synthetic */ TextView f24680b;

        /* renamed from: c */
        final /* synthetic */ int f24681c;

        /* renamed from: d */
        final /* synthetic */ TextView f24682d;

        C8639a(int i, TextView textView, int i2, TextView textView2) {
            this.f24679a = i;
            this.f24680b = textView;
            this.f24681c = i2;
            this.f24682d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C8638f.this.f24665i = this.f24679a;
            Animator unused2 = C8638f.this.f24663g = null;
            TextView textView = this.f24680b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f24681c == 1 && C8638f.this.f24669m != null) {
                    C8638f.this.f24669m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f24682d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f24682d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f24682d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C8638f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f24657a = context;
        this.f24658b = textInputLayout;
        this.f24664h = (float) context.getResources().getDimensionPixelSize(C10576d.design_textinput_caption_translate_y);
    }

    /* renamed from: d */
    private TextView m28185d(int i) {
        if (i == 1) {
            return this.f24669m;
        }
        if (i != 2) {
            return null;
        }
        return this.f24675s;
    }

    /* renamed from: e */
    private boolean m28186e(int i) {
        if (i != 1 || this.f24669m == null || TextUtils.isEmpty(this.f24667k)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m28187f(int i) {
        return i == 2 && this.f24675s != null && !TextUtils.isEmpty(this.f24673q);
    }

    /* renamed from: o */
    private boolean m28188o() {
        return (this.f24659c == null || this.f24658b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo32249a(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32254b(CharSequence charSequence) {
        mo32250b();
        this.f24667k = charSequence;
        this.f24669m.setText(charSequence);
        if (this.f24665i != 1) {
            this.f24666j = 1;
        }
        m28180a(this.f24665i, this.f24666j, m28184a(this.f24669m, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32257c(CharSequence charSequence) {
        mo32250b();
        this.f24673q = charSequence;
        this.f24675s.setText(charSequence);
        if (this.f24665i != 2) {
            this.f24666j = 2;
        }
        m28180a(this.f24665i, this.f24666j, m28184a(this.f24675s, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ColorStateList mo32262g() {
        TextView textView = this.f24669m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public CharSequence mo32263h() {
        return this.f24673q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo32264i() {
        TextView textView = this.f24675s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo32265j() {
        return m28187f(this.f24665i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo32266k() {
        this.f24667k = null;
        mo32250b();
        if (this.f24665i == 1) {
            if (!this.f24674r || TextUtils.isEmpty(this.f24673q)) {
                this.f24666j = 0;
            } else {
                this.f24666j = 2;
            }
        }
        m28180a(this.f24665i, this.f24666j, m28184a(this.f24669m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo32267l() {
        mo32250b();
        if (this.f24665i == 2) {
            this.f24666j = 0;
        }
        m28180a(this.f24665i, this.f24666j, m28184a(this.f24675s, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo32268m() {
        return this.f24668l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo32269n() {
        return this.f24674r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public CharSequence mo32259d() {
        return this.f24670n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public CharSequence mo32260e() {
        return this.f24667k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo32261f() {
        TextView textView = this.f24669m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m28184a(TextView textView, CharSequence charSequence) {
        return C5071v.m9140E(this.f24658b) && this.f24658b.isEnabled() && (this.f24666j != this.f24665i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: a */
    private void m28180a(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f24663g = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m28183a(arrayList2, this.f24674r, this.f24675s, 2, i3, i4);
                m28183a(arrayList2, this.f24668l, this.f24669m, 1, i3, i4);
                C10586b.m35868a(animatorSet, arrayList);
                animatorSet.addListener(new C8639a(i2, m28185d(i), i, m28185d(i2)));
                animatorSet.start();
            } else {
                m28179a(i, i2);
            }
            this.f24658b.updateEditTextBackground();
            this.f24658b.updateLabelState(z2);
            this.f24658b.updateTextInputBoxState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32250b() {
        Animator animator = this.f24663g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo32258c() {
        return m28186e(this.f24666j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo32256c(int i) {
        this.f24676t = i;
        TextView textView = this.f24675s;
        if (textView != null) {
            C0436i.m2158d(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32253b(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f24659c != null) {
            if (!mo32249a(i) || (frameLayout = this.f24661e) == null) {
                this.f24659c.removeView(textView);
            } else {
                int i2 = this.f24662f - 1;
                this.f24662f = i2;
                m28181a((ViewGroup) frameLayout, i2);
                this.f24661e.removeView(textView);
            }
            int i3 = this.f24660d - 1;
            this.f24660d = i3;
            m28181a((ViewGroup) this.f24659c, i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32255b(boolean z) {
        if (this.f24674r != z) {
            mo32250b();
            if (z) {
                C0286t tVar = new C0286t(this.f24657a);
                this.f24675s = tVar;
                tVar.setId(C10578f.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f24675s.setTextAlignment(5);
                }
                Typeface typeface = this.f24678v;
                if (typeface != null) {
                    this.f24675s.setTypeface(typeface);
                }
                this.f24675s.setVisibility(4);
                C5071v.m9193g(this.f24675s, 1);
                mo32256c(this.f24676t);
                mo32252b(this.f24677u);
                mo32246a(this.f24675s, 1);
            } else {
                mo32267l();
                mo32253b(this.f24675s, 1);
                this.f24675s = null;
                this.f24658b.updateEditTextBackground();
                this.f24658b.updateTextInputBoxState();
            }
            this.f24674r = z;
        }
    }

    /* renamed from: a */
    private void m28179a(int i, int i2) {
        TextView d;
        TextView d2;
        if (i != i2) {
            if (!(i2 == 0 || (d2 = m28185d(i2)) == null)) {
                d2.setVisibility(0);
                d2.setAlpha(1.0f);
            }
            if (!(i == 0 || (d = m28185d(i)) == null)) {
                d.setVisibility(4);
                if (i == 1) {
                    d.setText((CharSequence) null);
                }
            }
            this.f24665i = i2;
        }
    }

    /* renamed from: a */
    private void m28183a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m28177a(textView, i3 == i));
                if (i3 == i) {
                    list.add(m28176a(textView));
                }
            }
        }
    }

    /* renamed from: a */
    private ObjectAnimator m28177a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C10585a.f28456a);
        return ofFloat;
    }

    /* renamed from: a */
    private ObjectAnimator m28176a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f24664h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C10585a.f28459d);
        return ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32243a() {
        if (m28188o()) {
            C5071v.m9156a(this.f24659c, C5071v.m9209u(this.f24658b.getEditText()), 0, C5071v.m9208t(this.f24658b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32251b(int i) {
        this.f24671o = i;
        TextView textView = this.f24669m;
        if (textView != null) {
            this.f24658b.setTextAppearanceCompatWithErrorFallback(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo32252b(ColorStateList colorStateList) {
        this.f24677u = colorStateList;
        TextView textView = this.f24675s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32246a(TextView textView, int i) {
        if (this.f24659c == null && this.f24661e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f24657a);
            this.f24659c = linearLayout;
            linearLayout.setOrientation(0);
            this.f24658b.addView(this.f24659c, -1, -2);
            this.f24661e = new FrameLayout(this.f24657a);
            this.f24659c.addView(this.f24661e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f24658b.getEditText() != null) {
                mo32243a();
            }
        }
        if (mo32249a(i)) {
            this.f24661e.setVisibility(0);
            this.f24661e.addView(textView);
            this.f24662f++;
        } else {
            this.f24659c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f24659c.setVisibility(0);
        this.f24660d++;
    }

    /* renamed from: a */
    private void m28181a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32248a(boolean z) {
        if (this.f24668l != z) {
            mo32250b();
            if (z) {
                C0286t tVar = new C0286t(this.f24657a);
                this.f24669m = tVar;
                tVar.setId(C10578f.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f24669m.setTextAlignment(5);
                }
                Typeface typeface = this.f24678v;
                if (typeface != null) {
                    this.f24669m.setTypeface(typeface);
                }
                mo32251b(this.f24671o);
                mo32244a(this.f24672p);
                mo32247a(this.f24670n);
                this.f24669m.setVisibility(4);
                C5071v.m9193g(this.f24669m, 1);
                mo32246a(this.f24669m, 0);
            } else {
                mo32266k();
                mo32253b(this.f24669m, 0);
                this.f24669m = null;
                this.f24658b.updateEditTextBackground();
                this.f24658b.updateTextInputBoxState();
            }
            this.f24668l = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32245a(Typeface typeface) {
        if (typeface != this.f24678v) {
            this.f24678v = typeface;
            m28182a(this.f24669m, typeface);
            m28182a(this.f24675s, typeface);
        }
    }

    /* renamed from: a */
    private void m28182a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32244a(ColorStateList colorStateList) {
        this.f24672p = colorStateList;
        TextView textView = this.f24669m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32247a(CharSequence charSequence) {
        this.f24670n = charSequence;
        TextView textView = this.f24669m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }
}
