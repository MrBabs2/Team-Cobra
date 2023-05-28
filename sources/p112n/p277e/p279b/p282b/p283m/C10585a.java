package p112n.p277e.p279b.p282b.p283m;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p050l.p091k.p092a.p093a.C5108a;
import p050l.p091k.p092a.p093a.C5109b;
import p050l.p091k.p092a.p093a.C5110c;

/* renamed from: n.e.b.b.m.a */
/* compiled from: AnimationUtils */
public class C10585a {

    /* renamed from: a */
    public static final TimeInterpolator f28456a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f28457b = new C5109b();

    /* renamed from: c */
    public static final TimeInterpolator f28458c = new C5108a();

    /* renamed from: d */
    public static final TimeInterpolator f28459d = new C5110c();

    /* renamed from: e */
    public static final TimeInterpolator f28460e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m35867a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
