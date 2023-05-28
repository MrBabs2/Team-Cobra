package p050l.p108s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import p050l.p075h.p084l.C5071v;
import p050l.p108s.C5247m;

/* renamed from: l.s.d */
/* compiled from: Fade */
public class C5220d extends C5239j0 {

    /* renamed from: l.s.d$a */
    /* compiled from: Fade */
    class C5221a extends C5255n {

        /* renamed from: a */
        final /* synthetic */ View f9255a;

        C5221a(C5220d dVar, View view) {
            this.f9255a = view;
        }

        /* renamed from: c */
        public void mo18026c(C5247m mVar) {
            C5217c0.m9706a(this.f9255a, 1.0f);
            C5217c0.m9705a(this.f9255a);
            mVar.mo18086b((C5247m.C5253f) this);
        }
    }

    /* renamed from: l.s.d$b */
    /* compiled from: Fade */
    private static class C5222b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f9256a;

        /* renamed from: b */
        private boolean f9257b = false;

        C5222b(View view) {
            this.f9256a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C5217c0.m9706a(this.f9256a, 1.0f);
            if (this.f9257b) {
                this.f9256a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C5071v.m9136A(this.f9256a) && this.f9256a.getLayerType() == 0) {
                this.f9257b = true;
                this.f9256a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C5220d(int i) {
        mo18057a(i);
    }

    /* renamed from: a */
    private Animator m9720a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C5217c0.m9706a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C5217c0.f9254b, new float[]{f2});
        ofFloat.addListener(new C5222b(view));
        mo18075a((C5247m.C5253f) new C5221a(this, view));
        return ofFloat;
    }

    /* renamed from: b */
    public Animator mo18040b(ViewGroup viewGroup, View view, C5264s sVar, C5264s sVar2) {
        C5217c0.m9714e(view);
        return m9720a(view, m9719a(sVar, 1.0f), 0.0f);
    }

    /* renamed from: c */
    public void mo17996c(C5264s sVar) {
        super.mo17996c(sVar);
        sVar.f9367a.put("android:fade:transitionAlpha", Float.valueOf(C5217c0.m9712c(sVar.f9368b)));
    }

    /* renamed from: a */
    public Animator mo18039a(ViewGroup viewGroup, View view, C5264s sVar, C5264s sVar2) {
        float f = 0.0f;
        float a = m9719a(sVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m9720a(view, f, 1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f9367a.get("android:fade:transitionAlpha");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m9719a(p050l.p108s.C5264s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f9367a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p108s.C5220d.m9719a(l.s.s, float):float");
    }
}
