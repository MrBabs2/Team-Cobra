package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.p283m.C10585a;
import p112n.p277e.p279b.p282b.p283m.C10586b;
import p112n.p277e.p279b.p282b.p283m.C10587c;
import p112n.p277e.p279b.p282b.p283m.C10588d;
import p112n.p277e.p279b.p282b.p283m.C10589e;
import p112n.p277e.p279b.p282b.p283m.C10592h;
import p112n.p277e.p279b.p282b.p283m.C10593i;
import p112n.p277e.p279b.p282b.p283m.C10594j;
import p112n.p277e.p279b.p282b.p286p.C10598a;
import p112n.p277e.p279b.p282b.p286p.C10601c;
import p112n.p277e.p279b.p282b.p286p.C10602d;
import p112n.p277e.p279b.p282b.p292u.C10615a;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f24704c = new Rect();

    /* renamed from: d */
    private final RectF f24705d = new RectF();

    /* renamed from: e */
    private final RectF f24706e = new RectF();

    /* renamed from: f */
    private final int[] f24707f = new int[2];

    /* renamed from: g */
    private float f24708g;

    /* renamed from: h */
    private float f24709h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C8651a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f24710a;

        /* renamed from: b */
        final /* synthetic */ View f24711b;

        /* renamed from: c */
        final /* synthetic */ View f24712c;

        C8651a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f24710a = z;
            this.f24711b = view;
            this.f24712c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f24710a) {
                this.f24711b.setVisibility(4);
                this.f24712c.setAlpha(1.0f);
                this.f24712c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f24710a) {
                this.f24711b.setVisibility(0);
                this.f24712c.setAlpha(0.0f);
                this.f24712c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C8652b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f24713a;

        C8652b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f24713a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f24713a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C8653c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C10602d f24714a;

        /* renamed from: b */
        final /* synthetic */ Drawable f24715b;

        C8653c(FabTransformationBehavior fabTransformationBehavior, C10602d dVar, Drawable drawable) {
            this.f24714a = dVar;
            this.f24715b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f24714a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f24714a.setCircularRevealOverlayDrawable(this.f24715b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C8654d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C10602d f24716a;

        C8654d(FabTransformationBehavior fabTransformationBehavior, C10602d dVar) {
            this.f24716a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            C10602d.C10607e revealInfo = this.f24716a.getRevealInfo();
            revealInfo.f28492c = Float.MAX_VALUE;
            this.f24716a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C8655e {

        /* renamed from: a */
        public C10592h f24717a;

        /* renamed from: b */
        public C10594j f24718b;

        protected C8655e() {
        }
    }

    public FabTransformationBehavior() {
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m28269c(View view, View view2, boolean z, boolean z2, C8655e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float l = C5071v.m9200l(view2) - C5071v.m9200l(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-l);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-l});
        }
        eVar.f24717a.mo36136a("elevation").mo36144a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: d */
    private void m28271d(View view, View view2, boolean z, boolean z2, C8655e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C10602d) && (view instanceof ImageView)) {
            C10602d dVar = (C10602d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C10589e.f28463b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C10589e.f28463b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C8652b(this, view2));
                eVar.f24717a.mo36136a("iconFade").mo36144a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new C8653c(this, dVar, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C8655e mo32286a(Context context, boolean z);

    /* renamed from: a */
    public boolean mo2148a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo32284b(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C8655e a = mo32286a(view2.getContext(), z3);
        if (z3) {
            this.f24708g = view.getTranslationX();
            this.f24709h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m28269c(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f24705d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m28261a(view3, view4, z4, z2, a, (List<Animator>) arrayList3, (List<Animator.AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m28258a(view3, view4, z4, a, arrayList);
        boolean z5 = z2;
        C8655e eVar = a;
        m28271d(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m28259a(view3, view4, z4, z5, eVar, width, height, (List<Animator>) arrayList, (List<Animator.AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m28266b(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m28260a(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C10586b.m35868a(animatorSet, arrayList);
        animatorSet.addListener(new C8651a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo2132a(CoordinatorLayout.C0346f fVar) {
        if (fVar.f1620h == 0) {
            fVar.f1620h = 80;
        }
    }

    /* renamed from: c */
    private float m28267c(View view, View view2, C10594j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f24705d;
        RectF rectF2 = this.f24706e;
        m28257a(view, rectF);
        m28265b(view2, rectF2);
        int i = jVar.f28476a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f28477b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f28477b;
    }

    /* renamed from: a */
    private void m28258a(View view, View view2, boolean z, C8655e eVar, List<Animator> list) {
        float c = m28267c(view, view2, eVar.f24718b);
        float d = m28270d(view, view2, eVar.f24718b);
        Pair<C10593i, C10593i> a = m28253a(c, d, z, eVar);
        C10593i iVar = (C10593i) a.first;
        C10593i iVar2 = (C10593i) a.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            c = this.f24708g;
        }
        fArr[0] = c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            d = this.f24709h;
        }
        fArr2[0] = d;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo36144a((Animator) ofFloat);
        iVar2.mo36144a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d */
    private float m28270d(View view, View view2, C10594j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f24705d;
        RectF rectF2 = this.f24706e;
        m28257a(view, rectF);
        m28265b(view2, rectF2);
        int i = jVar.f28476a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f28478c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f28478c;
    }

    /* renamed from: c */
    private ViewGroup m28268c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: a */
    private void m28261a(View view, View view2, boolean z, boolean z2, C8655e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C8655e eVar2 = eVar;
        List<Animator> list3 = list;
        float c = m28267c(view3, view4, eVar2.f24718b);
        float d = m28270d(view3, view4, eVar2.f24718b);
        Pair<C10593i, C10593i> a = m28253a(c, d, z3, eVar2);
        C10593i iVar = (C10593i) a.first;
        C10593i iVar2 = (C10593i) a.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-c);
                view4.setTranslationY(-d);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m28262a(view2, eVar, iVar, iVar2, -c, -d, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-c});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-d});
        }
        iVar.mo36144a((Animator) objectAnimator2);
        iVar2.mo36144a((Animator) objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: b */
    private void m28266b(View view, View view2, boolean z, boolean z2, C8655e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C10602d) {
            C10602d dVar = (C10602d) view2;
            int b = m28264b(view);
            int i = 16777215 & b;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(b);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C10602d.C10606d.f28489a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C10602d.C10606d.f28489a, new int[]{b});
            }
            objectAnimator.setEvaluator(C10587c.m35869a());
            eVar.f24717a.mo36136a("color").mo36144a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: b */
    private void m28265b(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f24707f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: a */
    private void m28259a(View view, View view2, boolean z, boolean z2, C8655e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C8655e eVar2 = eVar;
        if (view4 instanceof C10602d) {
            C10602d dVar = (C10602d) view4;
            float a = m28251a(view3, view4, eVar2.f24718b);
            float b = m28263b(view3, view4, eVar2.f24718b);
            ((FloatingActionButton) view3).mo31676a(this.f24704c);
            float width = ((float) this.f24704c.width()) / 2.0f;
            C10593i a2 = eVar2.f24717a.mo36136a("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C10602d.C10607e(a, b, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f28492c;
                }
                animator = C10598a.m35899a(dVar, a, b, C10615a.m35944a(a, b, 0.0f, 0.0f, f, f2));
                animator.addListener(new C8654d(this, dVar));
                m28255a(view2, a2.mo36143a(), (int) a, (int) b, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f28492c;
                Animator a3 = C10598a.m35899a(dVar, a, b, width);
                int i = (int) a;
                int i2 = (int) b;
                View view5 = view2;
                m28255a(view5, a2.mo36143a(), i, i2, f3, list);
                long a4 = a2.mo36143a();
                long b2 = a2.mo36145b();
                long a5 = eVar2.f24717a.mo36135a();
                m28256a(view5, a4, b2, a5, i, i2, width, list);
                animator = a3;
            }
            a2.mo36144a(animator);
            list.add(animator);
            list2.add(C10598a.m35898a(dVar));
        }
    }

    /* renamed from: b */
    private float m28263b(View view, View view2, C10594j jVar) {
        RectF rectF = this.f24705d;
        RectF rectF2 = this.f24706e;
        m28257a(view, rectF);
        m28265b(view2, rectF2);
        rectF2.offset(0.0f, -m28270d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: b */
    private int m28264b(View view) {
        ColorStateList h = C5071v.m9194h(view);
        if (h != null) {
            return h.getColorForState(view.getDrawableState(), h.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: a */
    private void m28260a(View view, View view2, boolean z, boolean z2, C8655e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup a;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C10602d) || C10601c.f28485a != 0) && (a = m28254a(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C10588d.f28462a.set(a, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(a, C10588d.f28462a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(a, C10588d.f28462a, new float[]{0.0f});
                }
                eVar.f24717a.mo36136a("contentFade").mo36144a((Animator) objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: a */
    private Pair<C10593i, C10593i> m28253a(float f, float f2, boolean z, C8655e eVar) {
        C10593i iVar;
        C10593i iVar2;
        if (f == 0.0f || f2 == 0.0f) {
            iVar2 = eVar.f24717a.mo36136a("translationXLinear");
            iVar = eVar.f24717a.mo36136a("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            iVar2 = eVar.f24717a.mo36136a("translationXCurveDownwards");
            iVar = eVar.f24717a.mo36136a("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f24717a.mo36136a("translationXCurveUpwards");
            iVar = eVar.f24717a.mo36136a("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    /* renamed from: a */
    private void m28257a(View view, RectF rectF) {
        m28265b(view, rectF);
        rectF.offset(this.f24708g, this.f24709h);
    }

    /* renamed from: a */
    private float m28251a(View view, View view2, C10594j jVar) {
        RectF rectF = this.f24705d;
        RectF rectF2 = this.f24706e;
        m28257a(view, rectF);
        m28265b(view2, rectF2);
        rectF2.offset(-m28267c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: a */
    private void m28262a(View view, C8655e eVar, C10593i iVar, C10593i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m28252a(eVar, iVar, f, f3);
        float a2 = m28252a(eVar, iVar2, f2, f4);
        Rect rect = this.f24704c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f24705d;
        rectF2.set(rect);
        RectF rectF3 = this.f24706e;
        m28265b(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: a */
    private float m28252a(C8655e eVar, C10593i iVar, float f, float f2) {
        long a = iVar.mo36143a();
        long b = iVar.mo36145b();
        C10593i a2 = eVar.f24717a.mo36136a("expansion");
        return C10585a.m35867a(f, f2, iVar.mo36146c().getInterpolation(((float) (((a2.mo36143a() + a2.mo36145b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private ViewGroup m28254a(View view) {
        View findViewById = view.findViewById(C10578f.mtrl_child_content_container);
        if (findViewById != null) {
            return m28268c(findViewById);
        }
        if ((view instanceof C8658b) || (view instanceof C8657a)) {
            return m28268c(((ViewGroup) view).getChildAt(0));
        }
        return m28268c(view);
    }

    /* renamed from: a */
    private void m28255a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: a */
    private void m28256a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }
}
