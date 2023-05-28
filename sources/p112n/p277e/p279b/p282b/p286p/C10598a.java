package p112n.p277e.p279b.p282b.p286p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import p112n.p277e.p279b.p282b.p286p.C10602d;

/* renamed from: n.e.b.b.p.a */
/* compiled from: CircularRevealCompat */
public final class C10598a {

    /* renamed from: n.e.b.b.p.a$a */
    /* compiled from: CircularRevealCompat */
    static class C10599a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C10602d f28483a;

        C10599a(C10602d dVar) {
            this.f28483a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f28483a.mo36159b();
        }

        public void onAnimationStart(Animator animator) {
            this.f28483a.mo36158a();
        }
    }

    /* renamed from: a */
    public static Animator m35899a(C10602d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C10602d.C10605c.f28488a, C10602d.C10604b.f28486b, new C10602d.C10607e[]{new C10602d.C10607e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C10602d.C10607e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f28492c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: a */
    public static Animator.AnimatorListener m35898a(C10602d dVar) {
        return new C10599a(dVar);
    }
}
