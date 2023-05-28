package p050l.p108s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p050l.p075h.p084l.C5071v;
import p050l.p108s.C5247m;

/* renamed from: l.s.c */
/* compiled from: ChangeBounds */
public class C5205c extends C5247m {

    /* renamed from: R */
    private static final String[] f9220R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: S */
    private static final Property<Drawable, PointF> f9221S = new C5207b(PointF.class, "boundsOrigin");

    /* renamed from: T */
    private static final Property<C5216k, PointF> f9222T = new C5208c(PointF.class, "topLeft");

    /* renamed from: U */
    private static final Property<C5216k, PointF> f9223U = new C5209d(PointF.class, "bottomRight");

    /* renamed from: V */
    private static final Property<View, PointF> f9224V = new C5210e(PointF.class, "bottomRight");

    /* renamed from: W */
    private static final Property<View, PointF> f9225W = new C5211f(PointF.class, "topLeft");

    /* renamed from: X */
    private static final Property<View, PointF> f9226X = new C5212g(PointF.class, "position");

    /* renamed from: Y */
    private static C5243k f9227Y = new C5243k();

    /* renamed from: O */
    private int[] f9228O = new int[2];

    /* renamed from: P */
    private boolean f9229P = false;

    /* renamed from: Q */
    private boolean f9230Q = false;

    /* renamed from: l.s.c$a */
    /* compiled from: ChangeBounds */
    class C5206a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f9231a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f9232b;

        /* renamed from: c */
        final /* synthetic */ View f9233c;

        /* renamed from: d */
        final /* synthetic */ float f9234d;

        C5206a(C5205c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f9231a = viewGroup;
            this.f9232b = bitmapDrawable;
            this.f9233c = view;
            this.f9234d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C5217c0.m9710b(this.f9231a).mo17993b(this.f9232b);
            C5217c0.m9706a(this.f9233c, this.f9234d);
        }
    }

    /* renamed from: l.s.c$c */
    /* compiled from: ChangeBounds */
    static class C5208c extends Property<C5216k, PointF> {
        C5208c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C5216k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C5216k kVar, PointF pointF) {
            kVar.mo18030b(pointF);
        }
    }

    /* renamed from: l.s.c$d */
    /* compiled from: ChangeBounds */
    static class C5209d extends Property<C5216k, PointF> {
        C5209d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C5216k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C5216k kVar, PointF pointF) {
            kVar.mo18029a(pointF);
        }
    }

    /* renamed from: l.s.c$e */
    /* compiled from: ChangeBounds */
    static class C5210e extends Property<View, PointF> {
        C5210e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C5217c0.m9708a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: l.s.c$f */
    /* compiled from: ChangeBounds */
    static class C5211f extends Property<View, PointF> {
        C5211f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C5217c0.m9708a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: l.s.c$g */
    /* compiled from: ChangeBounds */
    static class C5212g extends Property<View, PointF> {
        C5212g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C5217c0.m9708a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: l.s.c$h */
    /* compiled from: ChangeBounds */
    class C5213h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5216k f9236a;
        private C5216k mViewBounds = this.f9236a;

        C5213h(C5205c cVar, C5216k kVar) {
            this.f9236a = kVar;
        }
    }

    /* renamed from: l.s.c$i */
    /* compiled from: ChangeBounds */
    class C5214i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f9237a;

        /* renamed from: b */
        final /* synthetic */ View f9238b;

        /* renamed from: c */
        final /* synthetic */ Rect f9239c;

        /* renamed from: d */
        final /* synthetic */ int f9240d;

        /* renamed from: e */
        final /* synthetic */ int f9241e;

        /* renamed from: f */
        final /* synthetic */ int f9242f;

        /* renamed from: g */
        final /* synthetic */ int f9243g;

        C5214i(C5205c cVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f9238b = view;
            this.f9239c = rect;
            this.f9240d = i;
            this.f9241e = i2;
            this.f9242f = i3;
            this.f9243g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f9237a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f9237a) {
                C5071v.m9160a(this.f9238b, this.f9239c);
                C5217c0.m9708a(this.f9238b, this.f9240d, this.f9241e, this.f9242f, this.f9243g);
            }
        }
    }

    /* renamed from: l.s.c$j */
    /* compiled from: ChangeBounds */
    class C5215j extends C5255n {

        /* renamed from: a */
        boolean f9244a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f9245b;

        C5215j(C5205c cVar, ViewGroup viewGroup) {
            this.f9245b = viewGroup;
        }

        /* renamed from: b */
        public void mo18025b(C5247m mVar) {
            C5269x.m9921b(this.f9245b, false);
        }

        /* renamed from: c */
        public void mo18026c(C5247m mVar) {
            if (!this.f9244a) {
                C5269x.m9921b(this.f9245b, false);
            }
            mVar.mo18086b((C5247m.C5253f) this);
        }

        /* renamed from: d */
        public void mo18027d(C5247m mVar) {
            C5269x.m9921b(this.f9245b, false);
            this.f9244a = true;
        }

        /* renamed from: e */
        public void mo18028e(C5247m mVar) {
            C5269x.m9921b(this.f9245b, true);
        }
    }

    /* renamed from: d */
    private void m9681d(C5264s sVar) {
        View view = sVar.f9368b;
        if (C5071v.m9140E(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f9367a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f9367a.put("android:changeBounds:parent", sVar.f9368b.getParent());
            if (this.f9230Q) {
                sVar.f9368b.getLocationInWindow(this.f9228O);
                sVar.f9367a.put("android:changeBounds:windowX", Integer.valueOf(this.f9228O[0]));
                sVar.f9367a.put("android:changeBounds:windowY", Integer.valueOf(this.f9228O[1]));
            }
            if (this.f9229P) {
                sVar.f9367a.put("android:changeBounds:clip", C5071v.m9198j(view));
            }
        }
    }

    /* renamed from: a */
    public void mo17995a(C5264s sVar) {
        m9681d(sVar);
    }

    /* renamed from: c */
    public void mo17996c(C5264s sVar) {
        m9681d(sVar);
    }

    /* renamed from: q */
    public String[] mo17997q() {
        return f9220R;
    }

    /* renamed from: a */
    private boolean m9680a(View view, View view2) {
        if (!this.f9230Q) {
            return true;
        }
        C5264s a = mo18076a(view, true);
        if (a == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == a.f9368b) {
            return true;
        }
        return false;
    }

    /* renamed from: l.s.c$b */
    /* compiled from: ChangeBounds */
    static class C5207b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f9235a = new Rect();

        C5207b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f9235a);
            this.f9235a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f9235a);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f9235a);
            Rect rect = this.f9235a;
            return new PointF((float) rect.left, (float) rect.top);
        }
    }

    /* renamed from: l.s.c$k */
    /* compiled from: ChangeBounds */
    private static class C5216k {

        /* renamed from: a */
        private int f9246a;

        /* renamed from: b */
        private int f9247b;

        /* renamed from: c */
        private int f9248c;

        /* renamed from: d */
        private int f9249d;

        /* renamed from: e */
        private View f9250e;

        /* renamed from: f */
        private int f9251f;

        /* renamed from: g */
        private int f9252g;

        C5216k(View view) {
            this.f9250e = view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo18029a(PointF pointF) {
            this.f9248c = Math.round(pointF.x);
            this.f9249d = Math.round(pointF.y);
            int i = this.f9252g + 1;
            this.f9252g = i;
            if (this.f9251f == i) {
                m9702a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo18030b(PointF pointF) {
            this.f9246a = Math.round(pointF.x);
            this.f9247b = Math.round(pointF.y);
            int i = this.f9251f + 1;
            this.f9251f = i;
            if (i == this.f9252g) {
                m9702a();
            }
        }

        /* renamed from: a */
        private void m9702a() {
            C5217c0.m9708a(this.f9250e, this.f9246a, this.f9247b, this.f9248c, this.f9249d);
            this.f9251f = 0;
            this.f9252g = 0;
        }
    }

    /* renamed from: a */
    public Animator mo17994a(ViewGroup viewGroup, C5264s sVar, C5264s sVar2) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator2;
        C5264s sVar3 = sVar;
        C5264s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f9367a;
        Map<String, Object> map2 = sVar4.f9367a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f9368b;
        if (m9680a(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f9367a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f9367a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f9367a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f9367a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f9229P) {
                view = view3;
                C5217c0.m9708a(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animator = C5230f.m9755a(view, f9226X, mo18100h().mo18051a((float) i3, (float) i5, (float) i4, (float) i6));
                    } else {
                        C5216k kVar = new C5216k(view);
                        ObjectAnimator a = C5230f.m9755a(kVar, f9222T, mo18100h().mo18051a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C5230f.m9755a(kVar, f9223U, mo18100h().mo18051a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C5213h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = C5230f.m9755a(view, f9224V, mo18100h().mo18051a((float) i7, (float) i9, (float) i8, (float) i10));
                } else {
                    animator = C5230f.m9755a(view, f9225W, mo18100h().mo18051a((float) i3, (float) i5, (float) i4, (float) i6));
                }
            } else {
                view = view3;
                C5217c0.m9708a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C5230f.m9755a(view, f9226X, mo18100h().mo18051a((float) i3, (float) i5, (float) i4, (float) i6));
                }
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C5071v.m9160a(view, rect);
                    C5243k kVar2 = f9227Y;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new C5214i(this, view, rect6, i4, i6, i8, i10));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C5263r.m9907a(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C5269x.m9921b(viewGroup4, true);
                mo18075a((C5247m.C5253f) new C5215j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f9367a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f9367a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f9367a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f9367a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f9228O);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C5217c0.m9712c(view2);
        C5217c0.m9706a(view2, 0.0f);
        C5217c0.m9710b(viewGroup).mo17992a(bitmapDrawable);
        C5232g h = mo18100h();
        int[] iArr = this.f9228O;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C5236i.m9766a(f9221S, h.mo18051a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C5206a(this, viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
