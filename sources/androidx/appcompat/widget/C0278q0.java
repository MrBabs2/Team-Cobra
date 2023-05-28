package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p003c.C0406f;
import p050l.p051a.p052k.p053a.C4800a;

/* renamed from: androidx.appcompat.widget.q0 */
/* compiled from: TintTypedArray */
public class C0278q0 {

    /* renamed from: a */
    private final Context f1178a;

    /* renamed from: b */
    private final TypedArray f1179b;

    /* renamed from: c */
    private TypedValue f1180c;

    private C0278q0(Context context, TypedArray typedArray) {
        this.f1178a = context;
        this.f1179b = typedArray;
    }

    /* renamed from: a */
    public static C0278q0 m1270a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0278q0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: b */
    public Drawable mo1719b(int i) {
        int resourceId;
        if (!this.f1179b.hasValue(i) || (resourceId = this.f1179b.getResourceId(i, 0)) == 0) {
            return this.f1179b.getDrawable(i);
        }
        return C4800a.m7936c(this.f1178a, resourceId);
    }

    /* renamed from: c */
    public Drawable mo1722c(int i) {
        int resourceId;
        if (!this.f1179b.hasValue(i) || (resourceId = this.f1179b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0253h.m1184b().mo1569a(this.f1178a, resourceId, true);
    }

    /* renamed from: d */
    public String mo1724d(int i) {
        return this.f1179b.getString(i);
    }

    /* renamed from: e */
    public CharSequence mo1726e(int i) {
        return this.f1179b.getText(i);
    }

    /* renamed from: f */
    public int mo1727f(int i, int i2) {
        return this.f1179b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int mo1729g(int i, int i2) {
        return this.f1179b.getResourceId(i, i2);
    }

    /* renamed from: a */
    public static C0278q0 m1271a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0278q0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: d */
    public int mo1723d(int i, int i2) {
        return this.f1179b.getInt(i, i2);
    }

    /* renamed from: e */
    public int mo1725e(int i, int i2) {
        return this.f1179b.getInteger(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo1728f(int i) {
        return this.f1179b.getTextArray(i);
    }

    /* renamed from: g */
    public boolean mo1730g(int i) {
        return this.f1179b.hasValue(i);
    }

    /* renamed from: a */
    public static C0278q0 m1269a(Context context, int i, int[] iArr) {
        return new C0278q0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: c */
    public int mo1721c(int i, int i2) {
        return this.f1179b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: a */
    public TypedArray mo1714a() {
        return this.f1179b;
    }

    /* renamed from: b */
    public float mo1717b(int i, float f) {
        return this.f1179b.getFloat(i, f);
    }

    /* renamed from: a */
    public Typeface mo1715a(int i, int i2, C0406f.C0407a aVar) {
        int resourceId = this.f1179b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1180c == null) {
            this.f1180c = new TypedValue();
        }
        return C0406f.m1964a(this.f1178a, resourceId, this.f1180c, i2, aVar);
    }

    /* renamed from: b */
    public int mo1718b(int i, int i2) {
        return this.f1179b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: b */
    public void mo1720b() {
        this.f1179b.recycle();
    }

    /* renamed from: a */
    public boolean mo1716a(int i, boolean z) {
        return this.f1179b.getBoolean(i, z);
    }

    /* renamed from: a */
    public int mo1712a(int i, int i2) {
        return this.f1179b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList mo1713a(int i) {
        int resourceId;
        ColorStateList b;
        if (!this.f1179b.hasValue(i) || (resourceId = this.f1179b.getResourceId(i, 0)) == 0 || (b = C4800a.m7935b(this.f1178a, resourceId)) == null) {
            return this.f1179b.getColorStateList(i);
        }
        return b;
    }

    /* renamed from: a */
    public float mo1711a(int i, float f) {
        return this.f1179b.getDimension(i, f);
    }
}
