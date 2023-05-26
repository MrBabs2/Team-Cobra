package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import p050l.p075h.p083k.C5008h;

/* renamed from: com.google.android.material.internal.g */
/* compiled from: StaticLayoutBuilderCompat */
final class C8559g {

    /* renamed from: k */
    private static boolean f24496k;

    /* renamed from: l */
    private static Constructor<StaticLayout> f24497l;

    /* renamed from: m */
    private static Object f24498m;

    /* renamed from: a */
    private CharSequence f24499a;

    /* renamed from: b */
    private final TextPaint f24500b;

    /* renamed from: c */
    private final int f24501c;

    /* renamed from: d */
    private int f24502d = 0;

    /* renamed from: e */
    private int f24503e;

    /* renamed from: f */
    private Layout.Alignment f24504f;

    /* renamed from: g */
    private int f24505g;

    /* renamed from: h */
    private boolean f24506h;

    /* renamed from: i */
    private boolean f24507i;

    /* renamed from: j */
    private TextUtils.TruncateAt f24508j;

    /* renamed from: com.google.android.material.internal.g$a */
    /* compiled from: StaticLayoutBuilderCompat */
    static class C8560a extends Exception {
        C8560a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private C8559g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f24499a = charSequence;
        this.f24500b = textPaint;
        this.f24501c = i;
        this.f24503e = charSequence.length();
        this.f24504f = Layout.Alignment.ALIGN_NORMAL;
        this.f24505g = Integer.MAX_VALUE;
        this.f24506h = true;
        this.f24508j = null;
    }

    /* renamed from: a */
    public static C8559g m27965a(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C8559g(charSequence, textPaint, i);
    }

    /* renamed from: b */
    private void m27966b() throws C8560a {
        Class cls;
        if (!f24496k) {
            try {
                boolean z = this.f24507i && Build.VERSION.SDK_INT >= 23;
                if (Build.VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f24498m = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = C8559g.class.getClassLoader();
                    String str = this.f24507i ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f24498m = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE});
                f24497l = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f24496k = true;
            } catch (Exception e) {
                throw new C8560a(e);
            }
        }
    }

    /* renamed from: a */
    public C8559g mo31938a(Layout.Alignment alignment) {
        this.f24504f = alignment;
        return this;
    }

    /* renamed from: a */
    public C8559g mo31940a(boolean z) {
        this.f24506h = z;
        return this;
    }

    /* renamed from: a */
    public C8559g mo31937a(int i) {
        this.f24505g = i;
        return this;
    }

    /* renamed from: a */
    public C8559g mo31939a(TextUtils.TruncateAt truncateAt) {
        this.f24508j = truncateAt;
        return this;
    }

    /* renamed from: a */
    public StaticLayout mo31936a() throws C8560a {
        if (this.f24499a == null) {
            this.f24499a = "";
        }
        int max = Math.max(0, this.f24501c);
        CharSequence charSequence = this.f24499a;
        if (this.f24505g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f24500b, (float) max, this.f24508j);
        }
        this.f24503e = Math.min(charSequence.length(), this.f24503e);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f24507i) {
                this.f24504f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f24502d, this.f24503e, this.f24500b, max);
            obtain.setAlignment(this.f24504f);
            obtain.setIncludePad(this.f24506h);
            obtain.setTextDirection(this.f24507i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f24508j;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f24505g);
            return obtain.build();
        }
        m27966b();
        try {
            Constructor<StaticLayout> constructor = f24497l;
            C5008h.m8899a(constructor);
            Object obj = f24498m;
            C5008h.m8899a(obj);
            return (StaticLayout) constructor.newInstance(new Object[]{charSequence, Integer.valueOf(this.f24502d), Integer.valueOf(this.f24503e), this.f24500b, Integer.valueOf(max), this.f24504f, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f24506h), null, Integer.valueOf(max), Integer.valueOf(this.f24505g)});
        } catch (Exception e) {
            throw new C8560a(e);
        }
    }

    /* renamed from: b */
    public C8559g mo31941b(boolean z) {
        this.f24507i = z;
        return this;
    }
}
