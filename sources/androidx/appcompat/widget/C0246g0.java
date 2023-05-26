package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C0394a;
import androidx.core.graphics.drawable.C0414a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p050l.p051a.p054l.p055a.C4802a;
import p050l.p051a.p056m.C4817a;
import p050l.p066e.C4873d;
import p050l.p066e.C4874e;
import p050l.p066e.C4881g;
import p050l.p066e.C4882h;
import p050l.p109t.p110a.p111a.C5277c;
import p050l.p109t.p110a.p111a.C5287i;

/* renamed from: androidx.appcompat.widget.g0 */
/* compiled from: ResourceManagerInternal */
public final class C0246g0 {

    /* renamed from: h */
    private static final PorterDuff.Mode f1072h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static C0246g0 f1073i;

    /* renamed from: j */
    private static final C0249c f1074j = new C0249c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C4882h<ColorStateList>> f1075a;

    /* renamed from: b */
    private C4881g<String, C0250d> f1076b;

    /* renamed from: c */
    private C4882h<String> f1077c;

    /* renamed from: d */
    private final WeakHashMap<Context, C4873d<WeakReference<Drawable.ConstantState>>> f1078d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1079e;

    /* renamed from: f */
    private boolean f1080f;

    /* renamed from: g */
    private C0251e f1081g;

    /* renamed from: androidx.appcompat.widget.g0$a */
    /* compiled from: ResourceManagerInternal */
    static class C0247a implements C0250d {
        C0247a() {
        }

        /* renamed from: a */
        public Drawable mo1560a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4802a.m7940b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$b */
    /* compiled from: ResourceManagerInternal */
    private static class C0248b implements C0250d {
        C0248b() {
        }

        /* renamed from: a */
        public Drawable mo1560a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5277c.m9936a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$c */
    /* compiled from: ResourceManagerInternal */
    private static class C0249c extends C4874e<Integer, PorterDuffColorFilter> {
        public C0249c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m1171b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo1561a(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo16953b(Integer.valueOf(m1171b(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo1562a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo16949a(Integer.valueOf(m1171b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$d */
    /* compiled from: ResourceManagerInternal */
    private interface C0250d {
        /* renamed from: a */
        Drawable mo1560a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.g0$e */
    /* compiled from: ResourceManagerInternal */
    interface C0251e {
        /* renamed from: a */
        ColorStateList mo1563a(Context context, int i);

        /* renamed from: a */
        PorterDuff.Mode mo1564a(int i);

        /* renamed from: a */
        Drawable mo1565a(C0246g0 g0Var, Context context, int i);

        /* renamed from: a */
        boolean mo1566a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        boolean mo1567b(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.g0$f */
    /* compiled from: ResourceManagerInternal */
    private static class C0252f implements C0250d {
        C0252f() {
        }

        /* renamed from: a */
        public Drawable mo1560a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5287i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized C0246g0 m1150a() {
        C0246g0 g0Var;
        synchronized (C0246g0.class) {
            if (f1073i == null) {
                C0246g0 g0Var2 = new C0246g0();
                f1073i = g0Var2;
                m1153a(g0Var2);
            }
            g0Var = f1073i;
        }
        return g0Var;
    }

    /* renamed from: c */
    private Drawable m1158c(Context context, int i) {
        Drawable drawable;
        if (this.f1079e == null) {
            this.f1079e = new TypedValue();
        }
        TypedValue typedValue = this.f1079e;
        context.getResources().getValue(i, typedValue, true);
        long a = m1145a(typedValue);
        Drawable a2 = m1149a(context, a);
        if (a2 != null) {
            return a2;
        }
        C0251e eVar = this.f1081g;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.mo1565a(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m1155a(context, a, drawable);
        }
        return drawable;
    }

    /* renamed from: d */
    private ColorStateList m1159d(Context context, int i) {
        C4882h hVar;
        WeakHashMap<Context, C4882h<ColorStateList>> weakHashMap = this.f1075a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.mo17043a(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1160e(android.content.Context r11, int r12) {
        /*
            r10 = this;
            l.e.g<java.lang.String, androidx.appcompat.widget.g0$d> r0 = r10.f1076b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            l.e.h<java.lang.String> r0 = r10.f1077c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo17043a((int) r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            l.e.g<java.lang.String, androidx.appcompat.widget.g0$d> r3 = r10.f1076b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            l.e.h r0 = new l.e.h
            r0.<init>()
            r10.f1077c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1079e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1079e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1079e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1145a((android.util.TypedValue) r0)
            android.graphics.drawable.Drawable r6 = r10.m1149a((android.content.Context) r11, (long) r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            l.e.h<java.lang.String> r8 = r10.f1077c     // Catch:{ Exception -> 0x00a2 }
            r8.mo17044a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            l.e.g<java.lang.String, androidx.appcompat.widget.g0$d> r8 = r10.f1076b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.g0$d r3 = (androidx.appcompat.widget.C0246g0.C0250d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo1560a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m1155a((android.content.Context) r11, (long) r4, (android.graphics.drawable.Drawable) r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            l.e.h<java.lang.String> r11 = r10.f1077c
            r11.mo17044a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0246g0.m1160e(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized ColorStateList mo1559b(Context context, int i) {
        ColorStateList d;
        d = m1159d(context, i);
        if (d == null) {
            d = this.f1081g == null ? null : this.f1081g.mo1563a(context, i);
            if (d != null) {
                m1151a(context, i, d);
            }
        }
        return d;
    }

    /* renamed from: a */
    private static void m1153a(C0246g0 g0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            g0Var.m1154a("vector", (C0250d) new C0252f());
            g0Var.m1154a("animated-vector", (C0250d) new C0248b());
            g0Var.m1154a("animated-selector", (C0250d) new C0247a());
        }
    }

    /* renamed from: b */
    private void m1157b(Context context) {
        if (!this.f1080f) {
            this.f1080f = true;
            Drawable a = mo1553a(context, C4817a.abc_vector_test);
            if (a == null || !m1156a(a)) {
                this.f1080f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo1557a(C0251e eVar) {
        this.f1081g = eVar;
    }

    /* renamed from: a */
    public synchronized Drawable mo1553a(Context context, int i) {
        return mo1554a(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo1554a(Context context, int i, boolean z) {
        Drawable e;
        m1157b(context);
        e = m1160e(context, i);
        if (e == null) {
            e = m1158c(context, i);
        }
        if (e == null) {
            e = C0394a.m1917c(context, i);
        }
        if (e != null) {
            e = m1148a(context, i, z, e);
        }
        if (e != null) {
            C0301y.m1451b(e);
        }
        return e;
    }

    /* renamed from: a */
    public synchronized void mo1556a(Context context) {
        C4873d dVar = this.f1078d.get(context);
        if (dVar != null) {
            dVar.mo16940b();
        }
    }

    /* renamed from: a */
    private static long m1145a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    private Drawable m1148a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo1559b(context, i);
        if (b != null) {
            if (C0301y.m1450a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i2 = C0414a.m2029i(drawable);
            C0414a.m2014a(i2, b);
            PorterDuff.Mode a = mo1552a(i);
            if (a == null) {
                return i2;
            }
            C0414a.m2017a(i2, a);
            return i2;
        }
        C0251e eVar = this.f1081g;
        if ((eVar == null || !eVar.mo1567b(context, i, drawable)) && !mo1558a(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1149a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, l.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1078d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            l.e.d r0 = (p050l.p066e.C4873d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo16936a((long) r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo16944c((long) r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0246g0.m1149a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private synchronized boolean m1155a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C4873d dVar = this.f1078d.get(context);
        if (dVar == null) {
            dVar = new C4873d();
            this.f1078d.put(context, dVar);
        }
        dVar.mo16945c(j, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo1555a(Context context, C0296v0 v0Var, int i) {
        Drawable e = m1160e(context, i);
        if (e == null) {
            e = v0Var.mo1861a(i);
        }
        if (e == null) {
            return null;
        }
        return m1148a(context, i, false, e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1558a(Context context, int i, Drawable drawable) {
        C0251e eVar = this.f1081g;
        return eVar != null && eVar.mo1566a(context, i, drawable);
    }

    /* renamed from: a */
    private void m1154a(String str, C0250d dVar) {
        if (this.f1076b == null) {
            this.f1076b = new C4881g<>();
        }
        this.f1076b.put(str, dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuff.Mode mo1552a(int i) {
        C0251e eVar = this.f1081g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1564a(i);
    }

    /* renamed from: a */
    private void m1151a(Context context, int i, ColorStateList colorStateList) {
        if (this.f1075a == null) {
            this.f1075a = new WeakHashMap<>();
        }
        C4882h hVar = this.f1075a.get(context);
        if (hVar == null) {
            hVar = new C4882h();
            this.f1075a.put(context, hVar);
        }
        hVar.mo17044a(i, colorStateList);
    }

    /* renamed from: a */
    static void m1152a(Drawable drawable, C0274o0 o0Var, int[] iArr) {
        if (!C0301y.m1450a(drawable) || drawable.mutate() == drawable) {
            if (o0Var.f1169d || o0Var.f1168c) {
                drawable.setColorFilter(m1147a(o0Var.f1169d ? o0Var.f1166a : null, o0Var.f1168c ? o0Var.f1167b : f1072h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m1147a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1146a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1146a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0246g0.class) {
            a = f1074j.mo1561a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f1074j.mo1562a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static boolean m1156a(Drawable drawable) {
        return (drawable instanceof C5287i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }
}
