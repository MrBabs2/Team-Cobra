package p050l.p109t.p110a.p111a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p003c.C0413g;
import androidx.core.graphics.drawable.C0414a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p050l.p066e.C4868a;

/* renamed from: l.t.a.a.c */
/* compiled from: AnimatedVectorDrawableCompat */
public class C5277c extends C5286h implements C5275b {

    /* renamed from: g */
    private C5279b f9399g;

    /* renamed from: h */
    private Context f9400h;

    /* renamed from: i */
    private ArgbEvaluator f9401i;

    /* renamed from: j */
    final Drawable.Callback f9402j;

    /* renamed from: l.t.a.a.c$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    class C5278a implements Drawable.Callback {
        C5278a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C5277c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C5277c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C5277c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: l.t.a.a.c$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C5279b extends Drawable.ConstantState {

        /* renamed from: a */
        int f9404a;

        /* renamed from: b */
        C5287i f9405b;

        /* renamed from: c */
        AnimatorSet f9406c;

        /* renamed from: d */
        ArrayList<Animator> f9407d;

        /* renamed from: e */
        C4868a<Animator, String> f9408e;

        public C5279b(Context context, C5279b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f9404a = bVar.f9404a;
                C5287i iVar = bVar.f9405b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f9405b = (C5287i) constantState.newDrawable(resources);
                    } else {
                        this.f9405b = (C5287i) constantState.newDrawable();
                    }
                    C5287i iVar2 = this.f9405b;
                    iVar2.mutate();
                    C5287i iVar3 = iVar2;
                    this.f9405b = iVar3;
                    iVar3.setCallback(callback);
                    this.f9405b.setBounds(bVar.f9405b.getBounds());
                    this.f9405b.mo18197a(false);
                }
                ArrayList<Animator> arrayList = bVar.f9407d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f9407d = new ArrayList<>(size);
                    this.f9408e = new C4868a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f9407d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f9408e.get(animator);
                        clone.setTarget(this.f9405b.mo18196a(str));
                        this.f9407d.add(clone);
                        this.f9408e.put(clone, str);
                    }
                    mo18168a();
                }
            }
        }

        /* renamed from: a */
        public void mo18168a() {
            if (this.f9406c == null) {
                this.f9406c = new AnimatorSet();
            }
            this.f9406c.playTogether(this.f9407d);
        }

        public int getChangingConfigurations() {
            return this.f9404a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C5277c() {
        this((Context) null, (C5279b) null, (Resources) null);
    }

    /* renamed from: a */
    public static C5277c m9936a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C5277c cVar = new C5277c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2015a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return C0414a.m2019a(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f9399g.f9405b.draw(canvas);
        if (this.f9399g.f9406c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return C0414a.m2023c(drawable);
        }
        return this.f9399g.f9405b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f9399g.f9404a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return C0414a.m2024d(drawable);
        }
        return this.f9399g.f9405b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f9414f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C5280c(this.f9414f.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f9399g.f9405b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f9399g.f9405b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f9399g.f9405b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2016a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0413g.m1982a(resources, theme, attributeSet, C5274a.f9391e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C5287i a2 = C5287i.m9969a(resources, resourceId, theme);
                        a2.mo18197a(false);
                        a2.setCallback(this.f9402j);
                        C5287i iVar = this.f9399g.f9405b;
                        if (iVar != null) {
                            iVar.setCallback((Drawable.Callback) null);
                        }
                        this.f9399g.f9405b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C5274a.f9392f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f9400h;
                        if (context != null) {
                            m9938a(string, C5282e.m9944a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f9399g.mo18168a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return C0414a.m2026f(drawable);
        }
        return this.f9399g.f9405b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f9399g.f9406c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f9399g.f9405b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f9399g.f9405b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f9399g.f9405b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f9399g.f9405b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f9399g.f9405b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2018a(drawable, z);
        } else {
            this.f9399g.f9405b.setAutoMirrored(z);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2022b(drawable, i);
        } else {
            this.f9399g.f9405b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2014a(drawable, colorStateList);
        } else {
            this.f9399g.f9405b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2017a(drawable, mode);
        } else {
            this.f9399g.f9405b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f9399g.f9405b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f9399g.f9406c.isStarted()) {
            this.f9399g.f9406c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f9399g.f9406c.end();
        }
    }

    private C5277c(Context context) {
        this(context, (C5279b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f9399g.f9405b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: l.t.a.a.c$c */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C5280c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f9409a;

        public C5280c(Drawable.ConstantState constantState) {
            this.f9409a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f9409a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f9409a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C5277c cVar = new C5277c();
            Drawable newDrawable = this.f9409a.newDrawable();
            cVar.f9414f = newDrawable;
            newDrawable.setCallback(cVar.f9402j);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C5277c cVar = new C5277c();
            Drawable newDrawable = this.f9409a.newDrawable(resources);
            cVar.f9414f = newDrawable;
            newDrawable.setCallback(cVar.f9402j);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C5277c cVar = new C5277c();
            Drawable newDrawable = this.f9409a.newDrawable(resources, theme);
            cVar.f9414f = newDrawable;
            newDrawable.setCallback(cVar.f9402j);
            return cVar;
        }
    }

    private C5277c(Context context, C5279b bVar, Resources resources) {
        this.f9401i = null;
        this.f9402j = new C5278a();
        this.f9400h = context;
        if (bVar != null) {
            this.f9399g = bVar;
        } else {
            this.f9399g = new C5279b(context, bVar, this.f9402j, resources);
        }
    }

    /* renamed from: a */
    private void m9937a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m9937a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f9401i == null) {
                    this.f9401i = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f9401i);
            }
        }
    }

    /* renamed from: a */
    private void m9938a(String str, Animator animator) {
        animator.setTarget(this.f9399g.f9405b.mo18196a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m9937a(animator);
        }
        C5279b bVar = this.f9399g;
        if (bVar.f9407d == null) {
            bVar.f9407d = new ArrayList<>();
            this.f9399g.f9408e = new C4868a<>();
        }
        this.f9399g.f9407d.add(animator);
        this.f9399g.f9408e.put(animator, str);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
