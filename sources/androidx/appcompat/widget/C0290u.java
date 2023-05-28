package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p050l.p051a.C4799j;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.widget.u */
/* compiled from: AppCompatTextViewAutoSizeHelper */
class C0290u {

    /* renamed from: l */
    private static final RectF f1239l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1240m = new ConcurrentHashMap<>();

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1241n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1242a = 0;

    /* renamed from: b */
    private boolean f1243b = false;

    /* renamed from: c */
    private float f1244c = -1.0f;

    /* renamed from: d */
    private float f1245d = -1.0f;

    /* renamed from: e */
    private float f1246e = -1.0f;

    /* renamed from: f */
    private int[] f1247f = new int[0];

    /* renamed from: g */
    private boolean f1248g = false;

    /* renamed from: h */
    private TextPaint f1249h;

    /* renamed from: i */
    private final TextView f1250i;

    /* renamed from: j */
    private final Context f1251j;

    /* renamed from: k */
    private final C0293c f1252k;

    /* renamed from: androidx.appcompat.widget.u$a */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0291a extends C0293c {
        C0291a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1856a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0290u.m1380b((Object) textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.u$b */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0292b extends C0291a {
        C0292b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1857a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1856a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    /* renamed from: androidx.appcompat.widget.u$c */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0293c {
        C0293c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1856a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1857a(TextView textView) {
            return ((Boolean) C0290u.m1380b((Object) textView, "getHorizontallyScrolling", false)).booleanValue();
        }
    }

    C0290u(TextView textView) {
        this.f1250i = textView;
        this.f1251j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f1252k = new C0292b();
        } else if (i >= 23) {
            this.f1252k = new C0291a();
        } else {
            this.f1252k = new C0293c();
        }
    }

    /* renamed from: h */
    private void m1382h() {
        this.f1242a = 0;
        this.f1245d = -1.0f;
        this.f1246e = -1.0f;
        this.f1244c = -1.0f;
        this.f1247f = new int[0];
        this.f1243b = false;
    }

    /* renamed from: i */
    private boolean m1383i() {
        if (!m1385k() || this.f1242a != 1) {
            this.f1243b = false;
        } else {
            if (!this.f1248g || this.f1247f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1246e - this.f1245d) / this.f1244c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1245d + (((float) i) * this.f1244c));
                }
                this.f1247f = m1377a(iArr);
            }
            this.f1243b = true;
        }
        return this.f1243b;
    }

    /* renamed from: j */
    private boolean m1384j() {
        int length = this.f1247f.length;
        boolean z = length > 0;
        this.f1248g = z;
        if (z) {
            this.f1242a = 1;
            int[] iArr = this.f1247f;
            this.f1245d = (float) iArr[0];
            this.f1246e = (float) iArr[length - 1];
            this.f1244c = -1.0f;
        }
        return this.f1248g;
    }

    /* renamed from: k */
    private boolean m1385k() {
        return !(this.f1250i instanceof C0256i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1847a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1251j.obtainStyledAttributes(attributeSet, C4799j.AppCompatTextView, i, 0);
        TextView textView = this.f1250i;
        C5071v.m9157a(textView, textView.getContext(), C4799j.AppCompatTextView, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(C4799j.AppCompatTextView_autoSizeTextType)) {
            this.f1242a = obtainStyledAttributes.getInt(C4799j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C4799j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C4799j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C4799j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C4799j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C4799j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C4799j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C4799j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C4799j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1375a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1385k()) {
            this.f1242a = 0;
        } else if (this.f1242a == 1) {
            if (!this.f1248g) {
                DisplayMetrics displayMetrics = this.f1251j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1374a(dimension2, dimension3, dimension);
            }
            m1383i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1850b(int i) {
        if (!m1385k()) {
            return;
        }
        if (i == 0) {
            m1382h();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1251j.getResources().getDisplayMetrics();
            m1374a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1383i()) {
                mo1843a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo1851c() {
        return Math.round(this.f1245d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo1852d() {
        return Math.round(this.f1244c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo1853e() {
        return this.f1247f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo1854f() {
        return this.f1242a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo1855g() {
        return m1385k() && this.f1242a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo1849b() {
        return Math.round(this.f1246e);
    }

    /* renamed from: b */
    private StaticLayout m1379b(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1249h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1250i.getLineSpacingExtra(), this.f1250i.getLineSpacingMultiplier()).setIncludePad(this.f1250i.getIncludeFontPadding()).setBreakStrategy(this.f1250i.getBreakStrategy()).setHyphenationFrequency(this.f1250i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f1252k.mo1856a(obtain, this.f1250i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: b */
    private StaticLayout m1378b(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1249h, i, alignment, this.f1250i.getLineSpacingMultiplier(), this.f1250i.getLineSpacingExtra(), this.f1250i.getIncludeFontPadding());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1846a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m1385k()) {
            DisplayMetrics displayMetrics = this.f1251j.getResources().getDisplayMetrics();
            m1374a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1383i()) {
                mo1843a();
            }
        }
    }

    /* renamed from: b */
    static <T> T m1380b(Object obj, String str, T t) {
        try {
            return m1381b(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: b */
    private static Method m1381b(String str) {
        try {
            Method method = f1240m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1240m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1848a(int[] iArr, int i) throws IllegalArgumentException {
        if (m1385k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1251j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1247f = m1377a(iArr2);
                if (!m1384j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1248g = false;
            }
            if (m1383i()) {
                mo1843a();
            }
        }
    }

    /* renamed from: a */
    private void m1375a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1247f = m1377a(iArr);
            m1384j();
        }
    }

    /* renamed from: a */
    private int[] m1377a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m1374a(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1242a = 1;
            this.f1245d = f;
            this.f1246e = f2;
            this.f1244c = f3;
            this.f1248g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1843a() {
        int i;
        if (mo1855g()) {
            if (this.f1243b) {
                if (this.f1250i.getMeasuredHeight() > 0 && this.f1250i.getMeasuredWidth() > 0) {
                    if (this.f1252k.mo1857a(this.f1250i)) {
                        i = CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
                    } else {
                        i = (this.f1250i.getMeasuredWidth() - this.f1250i.getTotalPaddingLeft()) - this.f1250i.getTotalPaddingRight();
                    }
                    int height = (this.f1250i.getHeight() - this.f1250i.getCompoundPaddingBottom()) - this.f1250i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f1239l) {
                            f1239l.setEmpty();
                            f1239l.right = (float) i;
                            f1239l.bottom = (float) height;
                            float a = (float) m1369a(f1239l);
                            if (a != this.f1250i.getTextSize()) {
                                mo1845a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1243b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1845a(int i, float f) {
        Resources resources;
        Context context = this.f1251j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1373a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private void m1373a(float f) {
        if (f != this.f1250i.getPaint().getTextSize()) {
            this.f1250i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1250i.isInLayout() : false;
            if (this.f1250i.getLayout() != null) {
                this.f1243b = false;
                try {
                    Method b = m1381b("nullLayouts");
                    if (b != null) {
                        b.invoke(this.f1250i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1250i.requestLayout();
                } else {
                    this.f1250i.forceLayout();
                }
                this.f1250i.invalidate();
            }
        }
    }

    /* renamed from: a */
    private int m1369a(RectF rectF) {
        int length = this.f1247f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1376a(this.f1247f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1247f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1844a(int i) {
        TextPaint textPaint = this.f1249h;
        if (textPaint == null) {
            this.f1249h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1249h.set(this.f1250i.getPaint());
        this.f1249h.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public StaticLayout mo1842a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            return m1379b(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return m1378b(charSequence, alignment, i);
        }
        return m1370a(charSequence, alignment, i);
    }

    /* renamed from: a */
    private boolean m1376a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1250i.getText();
        TransformationMethod transformationMethod = this.f1250i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1250i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1250i.getMaxLines() : -1;
        mo1844a(i);
        StaticLayout a = mo1842a(text, (Layout.Alignment) m1380b((Object) this.f1250i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private StaticLayout m1370a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1249h, i, alignment, ((Float) m1371a((Object) this.f1250i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m1371a((Object) this.f1250i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m1371a((Object) this.f1250i, "mIncludePad", true)).booleanValue());
    }

    /* renamed from: a */
    private static <T> T m1371a(Object obj, String str, T t) {
        try {
            Field a = m1372a(str);
            if (a == null) {
                return t;
            }
            return a.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: a */
    private static Field m1372a(String str) {
        try {
            Field field = f1241n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1241n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }
}
