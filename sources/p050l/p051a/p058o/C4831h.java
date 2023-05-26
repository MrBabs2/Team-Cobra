package p050l.p051a.p058o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p050l.p075h.p084l.C5012a0;
import p050l.p075h.p084l.C5016b0;
import p050l.p075h.p084l.C5086z;

/* renamed from: l.a.o.h */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class C4831h {

    /* renamed from: a */
    final ArrayList<C5086z> f8273a = new ArrayList<>();

    /* renamed from: b */
    private long f8274b = -1;

    /* renamed from: c */
    private Interpolator f8275c;

    /* renamed from: d */
    C5012a0 f8276d;

    /* renamed from: e */
    private boolean f8277e;

    /* renamed from: f */
    private final C5016b0 f8278f = new C4832a();

    /* renamed from: l.a.o.h$a */
    /* compiled from: ViewPropertyAnimatorCompatSet */
    class C4832a extends C5016b0 {

        /* renamed from: a */
        private boolean f8279a = false;

        /* renamed from: b */
        private int f8280b = 0;

        C4832a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16824a() {
            this.f8280b = 0;
            this.f8279a = false;
            C4831h.this.mo16822b();
        }

        public void onAnimationEnd(View view) {
            int i = this.f8280b + 1;
            this.f8280b = i;
            if (i == C4831h.this.f8273a.size()) {
                C5012a0 a0Var = C4831h.this.f8276d;
                if (a0Var != null) {
                    a0Var.onAnimationEnd((View) null);
                }
                mo16824a();
            }
        }

        public void onAnimationStart(View view) {
            if (!this.f8279a) {
                this.f8279a = true;
                C5012a0 a0Var = C4831h.this.f8276d;
                if (a0Var != null) {
                    a0Var.onAnimationStart((View) null);
                }
            }
        }
    }

    /* renamed from: a */
    public C4831h mo16819a(C5086z zVar) {
        if (!this.f8277e) {
            this.f8273a.add(zVar);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16822b() {
        this.f8277e = false;
    }

    /* renamed from: c */
    public void mo16823c() {
        if (!this.f8277e) {
            Iterator<C5086z> it = this.f8273a.iterator();
            while (it.hasNext()) {
                C5086z next = it.next();
                long j = this.f8274b;
                if (j >= 0) {
                    next.mo17638a(j);
                }
                Interpolator interpolator = this.f8275c;
                if (interpolator != null) {
                    next.mo17639a(interpolator);
                }
                if (this.f8276d != null) {
                    next.mo17640a((C5012a0) this.f8278f);
                }
                next.mo17646c();
            }
            this.f8277e = true;
        }
    }

    /* renamed from: a */
    public C4831h mo16820a(C5086z zVar, C5086z zVar2) {
        this.f8273a.add(zVar);
        zVar2.mo17645b(zVar.mo17643b());
        this.f8273a.add(zVar2);
        return this;
    }

    /* renamed from: a */
    public void mo16821a() {
        if (this.f8277e) {
            Iterator<C5086z> it = this.f8273a.iterator();
            while (it.hasNext()) {
                it.next().mo17642a();
            }
            this.f8277e = false;
        }
    }

    /* renamed from: a */
    public C4831h mo16816a(long j) {
        if (!this.f8277e) {
            this.f8274b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C4831h mo16817a(Interpolator interpolator) {
        if (!this.f8277e) {
            this.f8275c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C4831h mo16818a(C5012a0 a0Var) {
        if (!this.f8277e) {
            this.f8276d = a0Var;
        }
        return this;
    }
}
