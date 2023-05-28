package com.airbnb.lottie.p139v;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.v.a */
/* compiled from: BaseLottieAnimator */
public abstract class C5824a extends ValueAnimator {

    /* renamed from: f */
    private final Set<ValueAnimator.AnimatorUpdateListener> f10481f = new CopyOnWriteArraySet();

    /* renamed from: g */
    private final Set<Animator.AnimatorListener> f10482g = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19697a(boolean z) {
        for (Animator.AnimatorListener next : this.f10482g) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f10482g.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f10481f.add(animatorUpdateListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19701b(boolean z) {
        for (Animator.AnimatorListener next : this.f10482g) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationStart(this, z);
            } else {
                next.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo19702c() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f10482g) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo19703e() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f10481f) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f10482g.clear();
    }

    public void removeAllUpdateListeners() {
        this.f10481f.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f10482g.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f10481f.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19700b() {
        for (Animator.AnimatorListener onAnimationCancel : this.f10482g) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }
}
