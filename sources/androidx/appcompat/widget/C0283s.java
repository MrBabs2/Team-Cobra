package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.p003c.C0406f;
import androidx.core.widget.C0429b;
import androidx.core.widget.C0436i;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p050l.p051a.C4799j;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.widget.s */
/* compiled from: AppCompatTextHelper */
class C0283s {

    /* renamed from: a */
    private final TextView f1205a;

    /* renamed from: b */
    private C0274o0 f1206b;

    /* renamed from: c */
    private C0274o0 f1207c;

    /* renamed from: d */
    private C0274o0 f1208d;

    /* renamed from: e */
    private C0274o0 f1209e;

    /* renamed from: f */
    private C0274o0 f1210f;

    /* renamed from: g */
    private C0274o0 f1211g;

    /* renamed from: h */
    private C0274o0 f1212h;

    /* renamed from: i */
    private final C0290u f1213i;

    /* renamed from: j */
    private int f1214j = 0;

    /* renamed from: k */
    private int f1215k = -1;

    /* renamed from: l */
    private Typeface f1216l;

    /* renamed from: m */
    private boolean f1217m;

    /* renamed from: androidx.appcompat.widget.s$a */
    /* compiled from: AppCompatTextHelper */
    class C0284a extends C0406f.C0407a {

        /* renamed from: a */
        final /* synthetic */ int f1218a;

        /* renamed from: b */
        final /* synthetic */ int f1219b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1220c;

        C0284a(int i, int i2, WeakReference weakReference) {
            this.f1218a = i;
            this.f1219b = i2;
            this.f1220c = weakReference;
        }

        /* renamed from: a */
        public void mo1794a(int i) {
        }

        /* renamed from: a */
        public void mo1795a(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1218a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1219b & 2) != 0);
            }
            C0283s.this.mo1780a((WeakReference<TextView>) this.f1220c, typeface);
        }
    }

    C0283s(TextView textView) {
        this.f1205a = textView;
        this.f1213i = new C0290u(this.f1205a);
    }

    /* renamed from: l */
    private void m1334l() {
        C0274o0 o0Var = this.f1212h;
        this.f1206b = o0Var;
        this.f1207c = o0Var;
        this.f1208d = o0Var;
        this.f1209e = o0Var;
        this.f1210f = o0Var;
        this.f1211g = o0Var;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo1779a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        String str;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        String str2;
        ColorStateList colorStateList3;
        boolean z3;
        int i2;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i;
        Context context = this.f1205a.getContext();
        C0253h b = C0253h.m1184b();
        C0278q0 a = C0278q0.m1271a(context, attributeSet2, C4799j.AppCompatTextHelper, i3, 0);
        TextView textView = this.f1205a;
        C5071v.m9157a(textView, textView.getContext(), C4799j.AppCompatTextHelper, attributeSet, a.mo1714a(), i, 0);
        int g = a.mo1729g(C4799j.AppCompatTextHelper_android_textAppearance, -1);
        if (a.mo1730g(C4799j.AppCompatTextHelper_android_drawableLeft)) {
            this.f1206b = m1329a(context, b, a.mo1729g(C4799j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a.mo1730g(C4799j.AppCompatTextHelper_android_drawableTop)) {
            this.f1207c = m1329a(context, b, a.mo1729g(C4799j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a.mo1730g(C4799j.AppCompatTextHelper_android_drawableRight)) {
            this.f1208d = m1329a(context, b, a.mo1729g(C4799j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a.mo1730g(C4799j.AppCompatTextHelper_android_drawableBottom)) {
            this.f1209e = m1329a(context, b, a.mo1729g(C4799j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a.mo1730g(C4799j.AppCompatTextHelper_android_drawableStart)) {
                this.f1210f = m1329a(context, b, a.mo1729g(C4799j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a.mo1730g(C4799j.AppCompatTextHelper_android_drawableEnd)) {
                this.f1211g = m1329a(context, b, a.mo1729g(C4799j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a.mo1720b();
        boolean z4 = this.f1205a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            C0278q0 a2 = C0278q0.m1269a(context, g, C4799j.TextAppearance);
            if (z4 || !a2.mo1730g(C4799j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = a2.mo1716a(C4799j.TextAppearance_textAllCaps, false);
                z = true;
            }
            m1330a(context, a2);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList = a2.mo1730g(C4799j.TextAppearance_android_textColor) ? a2.mo1713a(C4799j.TextAppearance_android_textColor) : null;
                colorStateList3 = a2.mo1730g(C4799j.TextAppearance_android_textColorHint) ? a2.mo1713a(C4799j.TextAppearance_android_textColorHint) : null;
                colorStateList2 = a2.mo1730g(C4799j.TextAppearance_android_textColorLink) ? a2.mo1713a(C4799j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            }
            str = a2.mo1730g(C4799j.TextAppearance_textLocale) ? a2.mo1724d(C4799j.TextAppearance_textLocale) : null;
            str2 = (Build.VERSION.SDK_INT < 26 || !a2.mo1730g(C4799j.TextAppearance_fontVariationSettings)) ? null : a2.mo1724d(C4799j.TextAppearance_fontVariationSettings);
            a2.mo1720b();
        } else {
            colorStateList3 = null;
            str2 = null;
            z2 = false;
            z = false;
            colorStateList2 = null;
            str = null;
            colorStateList = null;
        }
        C0278q0 a3 = C0278q0.m1271a(context, attributeSet2, C4799j.TextAppearance, i3, 0);
        if (z4 || !a3.mo1730g(C4799j.TextAppearance_textAllCaps)) {
            z3 = z;
        } else {
            z2 = a3.mo1716a(C4799j.TextAppearance_textAllCaps, false);
            z3 = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a3.mo1730g(C4799j.TextAppearance_android_textColor)) {
                colorStateList = a3.mo1713a(C4799j.TextAppearance_android_textColor);
            }
            if (a3.mo1730g(C4799j.TextAppearance_android_textColorHint)) {
                colorStateList3 = a3.mo1713a(C4799j.TextAppearance_android_textColorHint);
            }
            if (a3.mo1730g(C4799j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a3.mo1713a(C4799j.TextAppearance_android_textColorLink);
            }
        }
        if (a3.mo1730g(C4799j.TextAppearance_textLocale)) {
            str = a3.mo1724d(C4799j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && a3.mo1730g(C4799j.TextAppearance_fontVariationSettings)) {
            str2 = a3.mo1724d(C4799j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && a3.mo1730g(C4799j.TextAppearance_android_textSize) && a3.mo1721c(C4799j.TextAppearance_android_textSize, -1) == 0) {
            this.f1205a.setTextSize(0, 0.0f);
        }
        m1330a(context, a3);
        a3.mo1720b();
        if (colorStateList != null) {
            this.f1205a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.f1205a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f1205a.setLinkTextColor(colorStateList2);
        }
        if (!z4 && z3) {
            mo1781a(z2);
        }
        Typeface typeface = this.f1216l;
        if (typeface != null) {
            if (this.f1215k == -1) {
                this.f1205a.setTypeface(typeface, this.f1214j);
            } else {
                this.f1205a.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            this.f1205a.setFontVariationSettings(str2);
        }
        if (str != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 24) {
                this.f1205a.setTextLocales(LocaleList.forLanguageTags(str));
            } else if (i4 >= 21) {
                this.f1205a.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
            }
        }
        this.f1213i.mo1847a(attributeSet2, i3);
        if (C0429b.f1890a && this.f1213i.mo1854f() != 0) {
            int[] e = this.f1213i.mo1853e();
            if (e.length > 0) {
                if (((float) this.f1205a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f1205a.setAutoSizeTextTypeUniformWithConfiguration(this.f1213i.mo1851c(), this.f1213i.mo1849b(), this.f1213i.mo1852d(), 0);
                } else {
                    this.f1205a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
                }
            }
        }
        C0278q0 a4 = C0278q0.m1270a(context, attributeSet2, C4799j.AppCompatTextView);
        int g2 = a4.mo1729g(C4799j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable a5 = g2 != -1 ? b.mo1568a(context, g2) : null;
        int g3 = a4.mo1729g(C4799j.AppCompatTextView_drawableTopCompat, -1);
        Drawable a6 = g3 != -1 ? b.mo1568a(context, g3) : null;
        int g4 = a4.mo1729g(C4799j.AppCompatTextView_drawableRightCompat, -1);
        Drawable a7 = g4 != -1 ? b.mo1568a(context, g4) : null;
        int g5 = a4.mo1729g(C4799j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable a8 = g5 != -1 ? b.mo1568a(context, g5) : null;
        int g6 = a4.mo1729g(C4799j.AppCompatTextView_drawableStartCompat, -1);
        Drawable a9 = g6 != -1 ? b.mo1568a(context, g6) : null;
        int g7 = a4.mo1729g(C4799j.AppCompatTextView_drawableEndCompat, -1);
        m1331a(a5, a6, a7, a8, a9, g7 != -1 ? b.mo1568a(context, g7) : null);
        if (a4.mo1730g(C4799j.AppCompatTextView_drawableTint)) {
            C0436i.m2147a(this.f1205a, a4.mo1713a(C4799j.AppCompatTextView_drawableTint));
        }
        if (a4.mo1730g(C4799j.AppCompatTextView_drawableTintMode)) {
            i2 = -1;
            C0436i.m2148a(this.f1205a, C0301y.m1449a(a4.mo1723d(C4799j.AppCompatTextView_drawableTintMode, -1), (PorterDuff.Mode) null));
        } else {
            i2 = -1;
        }
        int c = a4.mo1721c(C4799j.AppCompatTextView_firstBaselineToTopHeight, i2);
        int c2 = a4.mo1721c(C4799j.AppCompatTextView_lastBaselineToBottomHeight, i2);
        int c3 = a4.mo1721c(C4799j.AppCompatTextView_lineHeight, i2);
        a4.mo1720b();
        if (c != i2) {
            C0436i.m2146a(this.f1205a, c);
        }
        if (c2 != i2) {
            C0436i.m2154b(this.f1205a, c2);
        }
        if (c3 != i2) {
            C0436i.m2156c(this.f1205a, c3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1784b() {
        this.f1213i.mo1843a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo1785c() {
        return this.f1213i.mo1849b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo1786d() {
        return this.f1213i.mo1851c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo1787e() {
        return this.f1213i.mo1852d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int[] mo1788f() {
        return this.f1213i.mo1853e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo1789g() {
        return this.f1213i.mo1854f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo1790h() {
        C0274o0 o0Var = this.f1212h;
        if (o0Var != null) {
            return o0Var.f1166a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public PorterDuff.Mode mo1791i() {
        C0274o0 o0Var = this.f1212h;
        if (o0Var != null) {
            return o0Var.f1167b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo1792j() {
        return this.f1213i.mo1855g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo1793k() {
        mo1772a();
    }

    /* renamed from: b */
    private void m1333b(int i, float f) {
        this.f1213i.mo1845a(i, f);
    }

    /* renamed from: a */
    private void m1330a(Context context, C0278q0 q0Var) {
        int i;
        String d;
        this.f1214j = q0Var.mo1723d(C4799j.TextAppearance_android_textStyle, this.f1214j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int d2 = q0Var.mo1723d(C4799j.TextAppearance_android_textFontWeight, -1);
            this.f1215k = d2;
            if (d2 != -1) {
                this.f1214j = (this.f1214j & 2) | 0;
            }
        }
        if (q0Var.mo1730g(C4799j.TextAppearance_android_fontFamily) || q0Var.mo1730g(C4799j.TextAppearance_fontFamily)) {
            this.f1216l = null;
            if (q0Var.mo1730g(C4799j.TextAppearance_fontFamily)) {
                i = C4799j.TextAppearance_fontFamily;
            } else {
                i = C4799j.TextAppearance_android_fontFamily;
            }
            int i2 = this.f1215k;
            int i3 = this.f1214j;
            if (!context.isRestricted()) {
                try {
                    Typeface a = q0Var.mo1715a(i, this.f1214j, (C0406f.C0407a) new C0284a(i2, i3, new WeakReference(this.f1205a)));
                    if (a != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.f1215k == -1) {
                            this.f1216l = a;
                        } else {
                            this.f1216l = Typeface.create(Typeface.create(a, 0), this.f1215k, (this.f1214j & 2) != 0);
                        }
                    }
                    this.f1217m = this.f1216l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1216l == null && (d = q0Var.mo1724d(i)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1215k == -1) {
                    this.f1216l = Typeface.create(d, this.f1214j);
                    return;
                }
                Typeface create = Typeface.create(d, 0);
                int i4 = this.f1215k;
                if ((this.f1214j & 2) != 0) {
                    z = true;
                }
                this.f1216l = Typeface.create(create, i4, z);
            }
        } else if (q0Var.mo1730g(C4799j.TextAppearance_android_typeface)) {
            this.f1217m = false;
            int d3 = q0Var.mo1723d(C4799j.TextAppearance_android_typeface, 1);
            if (d3 == 1) {
                this.f1216l = Typeface.SANS_SERIF;
            } else if (d3 == 2) {
                this.f1216l = Typeface.SERIF;
            } else if (d3 == 3) {
                this.f1216l = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1780a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1217m) {
            this.f1216l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1214j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1776a(Context context, int i) {
        String d;
        ColorStateList a;
        C0278q0 a2 = C0278q0.m1269a(context, i, C4799j.TextAppearance);
        if (a2.mo1730g(C4799j.TextAppearance_textAllCaps)) {
            mo1781a(a2.mo1716a(C4799j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.mo1730g(C4799j.TextAppearance_android_textColor) && (a = a2.mo1713a(C4799j.TextAppearance_android_textColor)) != null) {
            this.f1205a.setTextColor(a);
        }
        if (a2.mo1730g(C4799j.TextAppearance_android_textSize) && a2.mo1721c(C4799j.TextAppearance_android_textSize, -1) == 0) {
            this.f1205a.setTextSize(0, 0.0f);
        }
        m1330a(context, a2);
        if (Build.VERSION.SDK_INT >= 26 && a2.mo1730g(C4799j.TextAppearance_fontVariationSettings) && (d = a2.mo1724d(C4799j.TextAppearance_fontVariationSettings)) != null) {
            this.f1205a.setFontVariationSettings(d);
        }
        a2.mo1720b();
        Typeface typeface = this.f1216l;
        if (typeface != null) {
            this.f1205a.setTypeface(typeface, this.f1214j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1781a(boolean z) {
        this.f1205a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1772a() {
        if (!(this.f1206b == null && this.f1207c == null && this.f1208d == null && this.f1209e == null)) {
            Drawable[] compoundDrawables = this.f1205a.getCompoundDrawables();
            m1332a(compoundDrawables[0], this.f1206b);
            m1332a(compoundDrawables[1], this.f1207c);
            m1332a(compoundDrawables[2], this.f1208d);
            m1332a(compoundDrawables[3], this.f1209e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1210f != null || this.f1211g != null) {
            Drawable[] compoundDrawablesRelative = this.f1205a.getCompoundDrawablesRelative();
            m1332a(compoundDrawablesRelative[0], this.f1210f);
            m1332a(compoundDrawablesRelative[2], this.f1211g);
        }
    }

    /* renamed from: a */
    private void m1332a(Drawable drawable, C0274o0 o0Var) {
        if (drawable != null && o0Var != null) {
            C0253h.m1183a(drawable, o0Var, this.f1205a.getDrawableState());
        }
    }

    /* renamed from: a */
    private static C0274o0 m1329a(Context context, C0253h hVar, int i) {
        ColorStateList b = hVar.mo1571b(context, i);
        if (b == null) {
            return null;
        }
        C0274o0 o0Var = new C0274o0();
        o0Var.f1169d = true;
        o0Var.f1166a = b;
        return o0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1782a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0429b.f1890a) {
            mo1784b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1774a(int i, float f) {
        if (!C0429b.f1890a && !mo1792j()) {
            m1333b(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1773a(int i) {
        this.f1213i.mo1850b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1775a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1213i.mo1846a(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1783a(int[] iArr, int i) throws IllegalArgumentException {
        this.f1213i.mo1848a(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1777a(ColorStateList colorStateList) {
        if (this.f1212h == null) {
            this.f1212h = new C0274o0();
        }
        C0274o0 o0Var = this.f1212h;
        o0Var.f1166a = colorStateList;
        o0Var.f1169d = colorStateList != null;
        m1334l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1778a(PorterDuff.Mode mode) {
        if (this.f1212h == null) {
            this.f1212h = new C0274o0();
        }
        C0274o0 o0Var = this.f1212h;
        o0Var.f1167b = mode;
        o0Var.f1168c = mode != null;
        m1334l();
    }

    /* renamed from: a */
    private void m1331a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1205a.getCompoundDrawablesRelative();
            TextView textView = this.f1205a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1205a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1205a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1205a.getCompoundDrawables();
            TextView textView3 = this.f1205a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }
}
