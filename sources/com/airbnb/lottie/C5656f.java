package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.p132r.C5720a;
import com.airbnb.lottie.p132r.C5721b;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p136k.C5771b;
import com.airbnb.lottie.p138u.C5816s;
import com.airbnb.lottie.p139v.C5826c;
import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p140w.C5832c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.airbnb.lottie.f */
/* compiled from: LottieDrawable */
public class C5656f extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: u */
    private static final String f9985u = C5656f.class.getSimpleName();

    /* renamed from: f */
    private final Matrix f9986f = new Matrix();

    /* renamed from: g */
    private C5648d f9987g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5826c f9988h = new C5826c();

    /* renamed from: i */
    private float f9989i = 1.0f;

    /* renamed from: j */
    private final ArrayList<C5666j> f9990j;

    /* renamed from: k */
    private C5721b f9991k;

    /* renamed from: l */
    private String f9992l;

    /* renamed from: m */
    private C5646b f9993m;

    /* renamed from: n */
    private C5720a f9994n;

    /* renamed from: o */
    C5645a f9995o;

    /* renamed from: p */
    C5680p f9996p;

    /* renamed from: q */
    private boolean f9997q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C5771b f9998r;

    /* renamed from: s */
    private int f9999s;

    /* renamed from: t */
    private boolean f10000t;

    /* renamed from: com.airbnb.lottie.f$a */
    /* compiled from: LottieDrawable */
    class C5657a implements C5666j {

        /* renamed from: a */
        final /* synthetic */ int f10001a;

        C5657a(int i) {
            this.f10001a = i;
        }

        /* renamed from: a */
        public void mo19467a(C5648d dVar) {
            C5656f.this.mo19417a(this.f10001a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$b */
    /* compiled from: LottieDrawable */
    class C5658b implements C5666j {

        /* renamed from: a */
        final /* synthetic */ float f10003a;

        C5658b(float f) {
            this.f10003a = f;
        }

        /* renamed from: a */
        public void mo19467a(C5648d dVar) {
            C5656f.this.mo19429c(this.f10003a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$c */
    /* compiled from: LottieDrawable */
    class C5659c implements C5666j {

        /* renamed from: a */
        final /* synthetic */ C5726e f10005a;

        /* renamed from: b */
        final /* synthetic */ Object f10006b;

        /* renamed from: c */
        final /* synthetic */ C5832c f10007c;

        C5659c(C5726e eVar, Object obj, C5832c cVar) {
            this.f10005a = eVar;
            this.f10006b = obj;
            this.f10007c = cVar;
        }

        /* renamed from: a */
        public void mo19467a(C5648d dVar) {
            C5656f.this.mo19421a(this.f10005a, this.f10006b, this.f10007c);
        }
    }

    /* renamed from: com.airbnb.lottie.f$d */
    /* compiled from: LottieDrawable */
    class C5660d implements ValueAnimator.AnimatorUpdateListener {
        C5660d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C5656f.this.f9998r != null) {
                C5656f.this.f9998r.mo19657a(C5656f.this.f9988h.mo19726h());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.f$e */
    /* compiled from: LottieDrawable */
    class C5661e implements C5666j {
        C5661e() {
        }

        /* renamed from: a */
        public void mo19467a(C5648d dVar) {
            C5656f.this.mo19458r();
        }
    }

    /* renamed from: com.airbnb.lottie.f$f */
    /* compiled from: LottieDrawable */
    class C5662f implements C5666j {

        /* renamed from: a */
        final /* synthetic */ int f10011a;

        C5662f(int i) {
            this.f10011a = i;
        }

        /* renamed from: a */
        public void mo19467a(C5648d dVar) {
            C5656f.this.mo19430c(this.f10011a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$g */
    /* compiled from: LottieDrawable */
    class C5663g implements C5666j {

        /* renamed from: a */
        final /* synthetic */ float f10013a;

        C5663g(float f) {
            this.f10013a = f;
        }

        /* renamed from: a */
        public void mo19467a(C5648d dVar) {
            C5656f.this.mo19425b(this.f10013a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$h */
    /* compiled from: LottieDrawable */
    class C5664h implements C5666j {

        /* renamed from: a */
        final /* synthetic */ int f10015a;

        C5664h(int i) {
            this.f10015a = i;
        }

        /* renamed from: a */
        public void mo19467a(C5648d dVar) {
            C5656f.this.mo19426b(this.f10015a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$i */
    /* compiled from: LottieDrawable */
    class C5665i implements C5666j {

        /* renamed from: a */
        final /* synthetic */ float f10017a;

        C5665i(float f) {
            this.f10017a = f;
        }

        /* renamed from: a */
        public void mo19467a(C5648d dVar) {
            C5656f.this.mo19416a(this.f10017a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$j */
    /* compiled from: LottieDrawable */
    private interface C5666j {
        /* renamed from: a */
        void mo19467a(C5648d dVar);
    }

    public C5656f() {
        new HashSet();
        this.f9990j = new ArrayList<>();
        this.f9999s = 255;
        this.f9988h.addUpdateListener(new C5660d());
    }

    /* renamed from: u */
    private void m10795u() {
        this.f9998r = new C5771b(this, C5816s.m11320a(this.f9987g), this.f9987g.mo19402i(), this.f9987g);
    }

    /* renamed from: v */
    private Context m10796v() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: w */
    private C5720a m10797w() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f9994n == null) {
            this.f9994n = new C5720a(getCallback(), this.f9995o);
        }
        return this.f9994n;
    }

    /* renamed from: x */
    private C5721b m10798x() {
        if (getCallback() == null) {
            return null;
        }
        C5721b bVar = this.f9991k;
        if (bVar != null && !bVar.mo19534a(m10796v())) {
            this.f9991k.mo19532a();
            this.f9991k = null;
        }
        if (this.f9991k == null) {
            this.f9991k = new C5721b(getCallback(), this.f9992l, this.f9993m, this.f9987g.mo19401h());
        }
        return this.f9991k;
    }

    /* renamed from: y */
    private void m10799y() {
        if (this.f9987g != null) {
            float n = mo19454n();
            setBounds(0, 0, (int) (((float) this.f9987g.mo19389a().width()) * n), (int) (((float) this.f9987g.mo19389a().height()) * n));
        }
    }

    /* renamed from: c */
    public boolean mo19431c() {
        return this.f9997q;
    }

    /* renamed from: d */
    public void mo19432d() {
        this.f9990j.clear();
        this.f9988h.mo19722g();
    }

    public void draw(Canvas canvas) {
        float f;
        C5647c.m10753a("Drawable#draw");
        if (this.f9998r != null) {
            float f2 = this.f9989i;
            float a = m10792a(canvas);
            if (f2 > a) {
                f = this.f9989i / a;
            } else {
                a = f2;
                f = 1.0f;
            }
            if (f > 1.0f) {
                canvas.save();
                float width = ((float) this.f9987g.mo19389a().width()) / 2.0f;
                float height = ((float) this.f9987g.mo19389a().height()) / 2.0f;
                float f3 = width * a;
                float f4 = height * a;
                canvas.translate((mo19454n() * width) - f3, (mo19454n() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f9986f.reset();
            this.f9986f.preScale(a, a);
            this.f9998r.mo19491a(canvas, this.f9986f, this.f9999s);
            C5647c.m10755c("Drawable#draw");
            if (f > 1.0f) {
                canvas.restore();
            }
        }
    }

    /* renamed from: e */
    public void mo19437e(float f) {
        this.f9988h.mo19712a(f);
    }

    /* renamed from: f */
    public int mo19439f() {
        return (int) this.f9988h.mo19727i();
    }

    /* renamed from: g */
    public String mo19440g() {
        return this.f9992l;
    }

    public int getAlpha() {
        return this.f9999s;
    }

    public int getIntrinsicHeight() {
        C5648d dVar = this.f9987g;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo19389a().height()) * mo19454n());
    }

    public int getIntrinsicWidth() {
        C5648d dVar = this.f9987g;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo19389a().width()) * mo19454n());
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float mo19445h() {
        return this.f9988h.mo19729j();
    }

    /* renamed from: i */
    public float mo19446i() {
        return this.f9988h.mo19730k();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isRunning() {
        return mo19457q();
    }

    /* renamed from: j */
    public C5675m mo19450j() {
        C5648d dVar = this.f9987g;
        if (dVar != null) {
            return dVar.mo19403j();
        }
        return null;
    }

    /* renamed from: k */
    public float mo19451k() {
        return this.f9988h.mo19726h();
    }

    /* renamed from: l */
    public int mo19452l() {
        return this.f9988h.getRepeatCount();
    }

    /* renamed from: m */
    public int mo19453m() {
        return this.f9988h.getRepeatMode();
    }

    /* renamed from: n */
    public float mo19454n() {
        return this.f9989i;
    }

    /* renamed from: o */
    public float mo19455o() {
        return this.f9988h.mo19731l();
    }

    /* renamed from: p */
    public C5680p mo19456p() {
        return this.f9996p;
    }

    /* renamed from: q */
    public boolean mo19457q() {
        return this.f9988h.isRunning();
    }

    /* renamed from: r */
    public void mo19458r() {
        if (this.f9998r == null) {
            this.f9990j.add(new C5661e());
        } else {
            this.f9988h.mo19732m();
        }
    }

    /* renamed from: s */
    public void mo19459s() {
        C5721b bVar = this.f9991k;
        if (bVar != null) {
            bVar.mo19532a();
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        this.f9999s = i;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Log.w("LOTTIE", "Use addColorFilter instead.");
    }

    public void start() {
        mo19458r();
    }

    public void stop() {
        mo19432d();
    }

    /* renamed from: t */
    public boolean mo19465t() {
        return this.f9996p == null && this.f9987g.mo19395b().mo17048c() > 0;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    public void mo19422a(boolean z) {
        if (this.f9997q != z) {
            if (Build.VERSION.SDK_INT < 19) {
                Log.w(f9985u, "Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.f9997q = z;
            if (this.f9987g != null) {
                m10795u();
            }
        }
    }

    /* renamed from: b */
    public void mo19427b(String str) {
        this.f9992l = str;
    }

    /* renamed from: c */
    public void mo19430c(int i) {
        if (this.f9987g == null) {
            this.f9990j.add(new C5662f(i));
        } else {
            this.f9988h.mo19717c(i);
        }
    }

    /* renamed from: e */
    public void mo19438e(int i) {
        this.f9988h.setRepeatMode(i);
    }

    /* renamed from: b */
    public void mo19428b(boolean z) {
        this.f10000t = z;
        C5648d dVar = this.f9987g;
        if (dVar != null) {
            dVar.mo19393a(z);
        }
    }

    /* renamed from: d */
    public void mo19434d(int i) {
        this.f9988h.setRepeatCount(i);
    }

    /* renamed from: e */
    public C5648d mo19436e() {
        return this.f9987g;
    }

    /* renamed from: d */
    public void mo19433d(float f) {
        this.f9989i = f;
        m10799y();
    }

    /* renamed from: c */
    public void mo19429c(float f) {
        C5648d dVar = this.f9987g;
        if (dVar == null) {
            this.f9990j.add(new C5658b(f));
        } else {
            mo19417a((int) C5828e.m11375c(dVar.mo19404k(), this.f9987g.mo19398e(), f));
        }
    }

    /* renamed from: b */
    public void mo19424b() {
        mo19459s();
        if (this.f9988h.isRunning()) {
            this.f9988h.cancel();
        }
        this.f9987g = null;
        this.f9998r = null;
        this.f9991k = null;
        this.f9988h.mo19721f();
        invalidateSelf();
    }

    /* renamed from: a */
    public boolean mo19423a(C5648d dVar) {
        if (this.f9987g == dVar) {
            return false;
        }
        mo19424b();
        this.f9987g = dVar;
        m10795u();
        this.f9988h.mo19715a(dVar);
        mo19429c(this.f9988h.getAnimatedFraction());
        mo19433d(this.f9989i);
        m10799y();
        Iterator it = new ArrayList(this.f9990j).iterator();
        while (it.hasNext()) {
            ((C5666j) it.next()).mo19467a(dVar);
            it.remove();
        }
        this.f9990j.clear();
        dVar.mo19393a(this.f10000t);
        return true;
    }

    /* renamed from: b */
    public void mo19425b(float f) {
        C5648d dVar = this.f9987g;
        if (dVar == null) {
            this.f9990j.add(new C5663g(f));
        } else {
            mo19430c((int) C5828e.m11375c(dVar.mo19404k(), this.f9987g.mo19398e(), f));
        }
    }

    /* renamed from: b */
    public void mo19426b(int i) {
        if (this.f9987g == null) {
            this.f9990j.add(new C5664h(i));
        } else {
            this.f9988h.mo19716b(i);
        }
    }

    /* renamed from: a */
    public void mo19416a(float f) {
        C5648d dVar = this.f9987g;
        if (dVar == null) {
            this.f9990j.add(new C5665i(f));
        } else {
            mo19426b((int) C5828e.m11375c(dVar.mo19404k(), this.f9987g.mo19398e(), f));
        }
    }

    /* renamed from: a */
    public void mo19417a(int i) {
        if (this.f9987g == null) {
            this.f9990j.add(new C5657a(i));
        } else {
            this.f9988h.mo19713a(i);
        }
    }

    /* renamed from: a */
    public void mo19419a(C5646b bVar) {
        this.f9993m = bVar;
        C5721b bVar2 = this.f9991k;
        if (bVar2 != null) {
            bVar2.mo19533a(bVar);
        }
    }

    /* renamed from: a */
    public void mo19418a(C5645a aVar) {
        this.f9995o = aVar;
        C5720a aVar2 = this.f9994n;
        if (aVar2 != null) {
            aVar2.mo19530a(aVar);
        }
    }

    /* renamed from: a */
    public void mo19420a(C5680p pVar) {
        this.f9996p = pVar;
    }

    /* renamed from: a */
    public void mo19415a() {
        this.f9990j.clear();
        this.f9988h.cancel();
    }

    /* renamed from: a */
    public List<C5726e> mo19414a(C5726e eVar) {
        if (this.f9998r == null) {
            Log.w("LOTTIE", "Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f9998r.mo19493a(eVar, 0, (List<C5726e>) arrayList, new C5726e(new String[0]));
        return arrayList;
    }

    /* renamed from: a */
    public <T> void mo19421a(C5726e eVar, T t, C5832c<T> cVar) {
        if (this.f9998r == null) {
            this.f9990j.add(new C5659c(eVar, t, cVar));
            return;
        }
        boolean z = true;
        if (eVar.mo19550a() != null) {
            eVar.mo19550a().mo19494a(t, cVar);
        } else {
            List<C5726e> a = mo19414a(eVar);
            for (int i = 0; i < a.size(); i++) {
                a.get(i).mo19550a().mo19494a(t, cVar);
            }
            z = true ^ a.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == C5670j.f10044w) {
                mo19429c(mo19451k());
            }
        }
    }

    /* renamed from: a */
    public Bitmap mo19412a(String str) {
        C5721b x = m10798x();
        if (x != null) {
            return x.mo19531a(str);
        }
        return null;
    }

    /* renamed from: a */
    public Typeface mo19413a(String str, String str2) {
        C5720a w = m10797w();
        if (w != null) {
            return w.mo19529a(str, str2);
        }
        return null;
    }

    /* renamed from: a */
    private float m10792a(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f9987g.mo19389a().width()), ((float) canvas.getHeight()) / ((float) this.f9987g.mo19389a().height()));
    }
}
