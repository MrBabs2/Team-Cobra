package p050l.p051a.p054l.p055a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0246g0;
import androidx.core.content.p003c.C0413g;
import androidx.core.graphics.drawable.C0415b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p050l.p051a.p054l.p055a.C4810b;
import p050l.p051a.p054l.p055a.C4815d;
import p050l.p051a.p056m.C4818b;
import p050l.p066e.C4873d;
import p050l.p066e.C4882h;
import p050l.p109t.p110a.p111a.C5277c;
import p050l.p109t.p110a.p111a.C5287i;

@SuppressLint({"RestrictedAPI"})
/* renamed from: l.a.l.a.a */
/* compiled from: AnimatedStateListDrawableCompat */
public class C4802a extends C4815d implements C0415b {

    /* renamed from: t */
    private C4805c f8144t;

    /* renamed from: u */
    private C4809g f8145u;

    /* renamed from: v */
    private int f8146v;

    /* renamed from: w */
    private int f8147w;

    /* renamed from: x */
    private boolean f8148x;

    /* renamed from: l.a.l.a.a$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C4804b extends C4809g {

        /* renamed from: a */
        private final Animatable f8149a;

        C4804b(Animatable animatable) {
            super();
            this.f8149a = animatable;
        }

        /* renamed from: c */
        public void mo16655c() {
            this.f8149a.start();
        }

        /* renamed from: d */
        public void mo16656d() {
            this.f8149a.stop();
        }
    }

    /* renamed from: l.a.l.a.a$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    static class C4805c extends C4815d.C4816a {

        /* renamed from: K */
        C4873d<Long> f8150K;

        /* renamed from: L */
        C4882h<Integer> f8151L;

        C4805c(C4805c cVar, C4802a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f8150K = cVar.f8150K;
                this.f8151L = cVar.f8151L;
                return;
            }
            this.f8150K = new C4873d<>();
            this.f8151L = new C4882h<>();
        }

        /* renamed from: f */
        private static long m7953f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo16657a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo16712a(drawable);
            long f = m7953f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f8150K.mo16937a(f, Long.valueOf(j2 | j));
            if (z) {
                this.f8150K.mo16937a(m7953f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo16659b(int[] iArr) {
            int a = super.mo16766a(iArr);
            if (a >= 0) {
                return a;
            }
            return super.mo16766a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo16660c(int i, int i2) {
            return (int) this.f8150K.mo16939b(m7953f(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo16661d(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f8151L.mo17046b(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo16663e(int i, int i2) {
            return (this.f8150K.mo16939b(m7953f(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo16664m() {
            this.f8150K = this.f8150K.clone();
            this.f8151L = this.f8151L.clone();
        }

        public Drawable newDrawable() {
            return new C4802a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo16662d(int i, int i2) {
            return (this.f8150K.mo16939b(m7953f(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        public Drawable newDrawable(Resources resources) {
            return new C4802a(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo16658a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo16767a(iArr, drawable);
            this.f8151L.mo17050c(a, Integer.valueOf(i));
            return a;
        }
    }

    /* renamed from: l.a.l.a.a$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C4806d extends C4809g {

        /* renamed from: a */
        private final C5277c f8152a;

        C4806d(C5277c cVar) {
            super();
            this.f8152a = cVar;
        }

        /* renamed from: c */
        public void mo16655c() {
            this.f8152a.start();
        }

        /* renamed from: d */
        public void mo16656d() {
            this.f8152a.stop();
        }
    }

    /* renamed from: l.a.l.a.a$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C4807e extends C4809g {

        /* renamed from: a */
        private final ObjectAnimator f8153a;

        /* renamed from: b */
        private final boolean f8154b;

        C4807e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C4808f fVar = new C4808f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo16669a());
            ofInt.setInterpolator(fVar);
            this.f8154b = z2;
            this.f8153a = ofInt;
        }

        /* renamed from: a */
        public boolean mo16667a() {
            return this.f8154b;
        }

        /* renamed from: b */
        public void mo16668b() {
            this.f8153a.reverse();
        }

        /* renamed from: c */
        public void mo16655c() {
            this.f8153a.start();
        }

        /* renamed from: d */
        public void mo16656d() {
            this.f8153a.cancel();
        }
    }

    /* renamed from: l.a.l.a.a$g */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class C4809g {
        private C4809g() {
        }

        /* renamed from: a */
        public boolean mo16667a() {
            return false;
        }

        /* renamed from: b */
        public void mo16668b() {
        }

        /* renamed from: c */
        public abstract void mo16655c();

        /* renamed from: d */
        public abstract void mo16656d();
    }

    static {
        Class<C4802a> cls = C4802a.class;
    }

    public C4802a() {
        this((C4805c) null, (Resources) null);
    }

    /* renamed from: b */
    public static C4802a m7940b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C4802a aVar = new C4802a();
            aVar.mo16648a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: c */
    private void m7942c() {
        onStateChange(getState());
    }

    /* renamed from: d */
    private int m7944d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C0413g.m1982a(resources, theme, attributeSet, C4818b.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C4818b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C4818b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable a2 = resourceId2 > 0 ? C0246g0.m1150a().mo1553a(context, resourceId2) : null;
        a.recycle();
        int[] a3 = mo16765a(attributeSet);
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                a2 = C5287i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (a2 != null) {
            return this.f8144t.mo16658a(a3, a2, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: e */
    private int m7945e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C0413g.m1982a(resources, theme, attributeSet, C4818b.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C4818b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C4818b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C4818b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable a2 = resourceId3 > 0 ? C0246g0.m1150a().mo1553a(context, resourceId3) : null;
        boolean z = a.getBoolean(C4818b.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                a2 = C5277c.m9936a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (a2 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f8144t.mo16657a(resourceId, resourceId2, a2, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C4809g gVar = this.f8145u;
        if (gVar != null) {
            gVar.mo16656d();
            this.f8145u = null;
            mo16674a(this.f8146v);
            this.f8146v = -1;
            this.f8147w = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f8148x) {
            super.mutate();
            if (this == this) {
                this.f8144t.mo16664m();
                this.f8148x = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int b = this.f8144t.mo16659b(iArr);
        boolean z = b != mo16676b() && (m7941b(b) || mo16674a(b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f8145u != null && (visible || z2)) {
            if (z) {
                this.f8145u.mo16655c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C4802a(C4805c cVar, Resources resources) {
        super((C4815d.C4816a) null);
        this.f8146v = -1;
        this.f8147w = -1;
        mo16649a((C4810b.C4813c) new C4805c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: c */
    private void m7943c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m7944d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m7945e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo16648a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0413g.m1982a(resources, theme, attributeSet, C4818b.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C4818b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m7939a(a);
        mo16672a(resources);
        a.recycle();
        m7943c(context, resources, xmlPullParser, attributeSet, theme);
        m7942c();
    }

    /* renamed from: b */
    private boolean m7941b(int i) {
        int i2;
        int c;
        C4809g gVar;
        C4809g gVar2 = this.f8145u;
        if (gVar2 == null) {
            i2 = mo16676b();
        } else if (i == this.f8146v) {
            return true;
        } else {
            if (i != this.f8147w || !gVar2.mo16667a()) {
                i2 = this.f8146v;
                gVar2.mo16656d();
            } else {
                gVar2.mo16668b();
                this.f8146v = this.f8147w;
                this.f8147w = i;
                return true;
            }
        }
        this.f8145u = null;
        this.f8147w = -1;
        this.f8146v = -1;
        C4805c cVar = this.f8144t;
        int d = cVar.mo16661d(i2);
        int d2 = cVar.mo16661d(i);
        if (d2 == 0 || d == 0 || (c = cVar.mo16660c(d, d2)) < 0) {
            return false;
        }
        boolean e = cVar.mo16663e(d, d2);
        mo16674a(c);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C4807e((AnimationDrawable) current, cVar.mo16662d(d, d2), e);
        } else if (current instanceof C5277c) {
            gVar = new C4806d((C5277c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C4804b((Animatable) current);
            }
            return false;
        }
        gVar.mo16655c();
        this.f8145u = gVar;
        this.f8147w = i2;
        this.f8146v = i;
        return true;
    }

    /* renamed from: l.a.l.a.a$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C4808f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f8155a;

        /* renamed from: b */
        private int f8156b;

        /* renamed from: c */
        private int f8157c;

        C4808f(AnimationDrawable animationDrawable, boolean z) {
            mo16670a(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo16670a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f8156b = numberOfFrames;
            int[] iArr = this.f8155a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f8155a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f8155a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f8157c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f8157c)) + 0.5f);
            int i2 = this.f8156b;
            int[] iArr = this.f8155a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f8157c) : 0.0f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo16669a() {
            return this.f8157c;
        }
    }

    /* renamed from: a */
    private void m7939a(TypedArray typedArray) {
        C4805c cVar = this.f8144t;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f8184d |= typedArray.getChangingConfigurations();
        }
        cVar.mo16721b(typedArray.getBoolean(C4818b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f8189i));
        cVar.mo16717a(typedArray.getBoolean(C4818b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f8192l));
        cVar.mo16720b(typedArray.getInt(C4818b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f8172A));
        cVar.mo16724c(typedArray.getInt(C4818b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f8173B));
        setDither(typedArray.getBoolean(C4818b.AnimatedStateListDrawableCompat_android_dither, cVar.f8204x));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4805c m7948a() {
        return new C4805c(this.f8144t, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16649a(C4810b.C4813c cVar) {
        super.mo16649a(cVar);
        if (cVar instanceof C4805c) {
            this.f8144t = (C4805c) cVar;
        }
    }
}
