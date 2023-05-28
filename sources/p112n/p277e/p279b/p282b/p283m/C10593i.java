package p112n.p277e.p279b.p282b.p283m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: n.e.b.b.m.i */
/* compiled from: MotionTiming */
public class C10593i {

    /* renamed from: a */
    private long f28471a = 0;

    /* renamed from: b */
    private long f28472b = 300;

    /* renamed from: c */
    private TimeInterpolator f28473c = null;

    /* renamed from: d */
    private int f28474d = 0;

    /* renamed from: e */
    private int f28475e = 1;

    public C10593i(long j, long j2) {
        this.f28471a = j;
        this.f28472b = j2;
    }

    /* renamed from: a */
    public void mo36144a(Animator animator) {
        animator.setStartDelay(mo36143a());
        animator.setDuration(mo36145b());
        animator.setInterpolator(mo36146c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo36147d());
            valueAnimator.setRepeatMode(mo36148e());
        }
    }

    /* renamed from: b */
    public long mo36145b() {
        return this.f28472b;
    }

    /* renamed from: c */
    public TimeInterpolator mo36146c() {
        TimeInterpolator timeInterpolator = this.f28473c;
        return timeInterpolator != null ? timeInterpolator : C10585a.f28457b;
    }

    /* renamed from: d */
    public int mo36147d() {
        return this.f28474d;
    }

    /* renamed from: e */
    public int mo36148e() {
        return this.f28475e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10593i)) {
            return false;
        }
        C10593i iVar = (C10593i) obj;
        if (mo36143a() == iVar.mo36143a() && mo36145b() == iVar.mo36145b() && mo36147d() == iVar.mo36147d() && mo36148e() == iVar.mo36148e()) {
            return mo36146c().getClass().equals(iVar.mo36146c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (mo36143a() ^ (mo36143a() >>> 32))) * 31) + ((int) (mo36145b() ^ (mo36145b() >>> 32)))) * 31) + mo36146c().getClass().hashCode()) * 31) + mo36147d()) * 31) + mo36148e();
    }

    public String toString() {
        return 10 + C10593i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo36143a() + " duration: " + mo36145b() + " interpolator: " + mo36146c().getClass() + " repeatCount: " + mo36147d() + " repeatMode: " + mo36148e() + "}\n";
    }

    /* renamed from: b */
    private static TimeInterpolator m35888b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C10585a.f28457b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C10585a.f28458c;
        }
        return interpolator instanceof DecelerateInterpolator ? C10585a.f28459d : interpolator;
    }

    /* renamed from: a */
    public long mo36143a() {
        return this.f28471a;
    }

    /* renamed from: a */
    static C10593i m35887a(ValueAnimator valueAnimator) {
        C10593i iVar = new C10593i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m35888b(valueAnimator));
        iVar.f28474d = valueAnimator.getRepeatCount();
        iVar.f28475e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public C10593i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f28471a = j;
        this.f28472b = j2;
        this.f28473c = timeInterpolator;
    }
}
