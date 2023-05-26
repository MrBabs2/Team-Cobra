package p112n.p277e.p279b.p282b.p286p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p112n.p277e.p279b.p282b.p292u.C10615a;

/* renamed from: n.e.b.b.p.d */
/* compiled from: CircularRevealWidget */
public interface C10602d {

    /* renamed from: n.e.b.b.p.d$b */
    /* compiled from: CircularRevealWidget */
    public static class C10604b implements TypeEvaluator<C10607e> {

        /* renamed from: b */
        public static final TypeEvaluator<C10607e> f28486b = new C10604b();

        /* renamed from: a */
        private final C10607e f28487a = new C10607e();

        /* renamed from: a */
        public C10607e evaluate(float f, C10607e eVar, C10607e eVar2) {
            this.f28487a.mo36188a(C10615a.m35942a(eVar.f28490a, eVar2.f28490a, f), C10615a.m35942a(eVar.f28491b, eVar2.f28491b, f), C10615a.m35942a(eVar.f28492c, eVar2.f28492c, f));
            return this.f28487a;
        }
    }

    /* renamed from: n.e.b.b.p.d$c */
    /* compiled from: CircularRevealWidget */
    public static class C10605c extends Property<C10602d, C10607e> {

        /* renamed from: a */
        public static final Property<C10602d, C10607e> f28488a = new C10605c("circularReveal");

        private C10605c(String str) {
            super(C10607e.class, str);
        }

        /* renamed from: a */
        public C10607e get(C10602d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(C10602d dVar, C10607e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: n.e.b.b.p.d$d */
    /* compiled from: CircularRevealWidget */
    public static class C10606d extends Property<C10602d, Integer> {

        /* renamed from: a */
        public static final Property<C10602d, Integer> f28489a = new C10606d("circularRevealScrimColor");

        private C10606d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C10602d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(C10602d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: n.e.b.b.p.d$e */
    /* compiled from: CircularRevealWidget */
    public static class C10607e {

        /* renamed from: a */
        public float f28490a;

        /* renamed from: b */
        public float f28491b;

        /* renamed from: c */
        public float f28492c;

        /* renamed from: a */
        public void mo36188a(float f, float f2, float f3) {
            this.f28490a = f;
            this.f28491b = f2;
            this.f28492c = f3;
        }

        private C10607e() {
        }

        public C10607e(float f, float f2, float f3) {
            this.f28490a = f;
            this.f28491b = f2;
            this.f28492c = f3;
        }
    }

    /* renamed from: a */
    void mo36158a();

    /* renamed from: b */
    void mo36159b();

    int getCircularRevealScrimColor();

    C10607e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C10607e eVar);
}
