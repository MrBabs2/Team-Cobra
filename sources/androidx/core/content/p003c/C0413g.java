package androidx.core.content.p003c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.c.g */
/* compiled from: TypedArrayUtils */
public class C0413g {
    /* renamed from: a */
    public static boolean m1988a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m1990b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1988a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: c */
    public static int m1993c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1988a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: d */
    public static CharSequence[] m1995d(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: a */
    public static float m1976a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m1988a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: b */
    public static TypedValue m1991b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1988a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static CharSequence m1994c(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* renamed from: a */
    public static boolean m1987a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m1988a(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m1989b(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: a */
    public static int m1979a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1988a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: b */
    public static String m1992b(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: a */
    public static C0397b m1984a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m1988a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0397b.m1929b(typedValue.data);
            }
            C0397b b = C0397b.m1930b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (b != null) {
                return b;
            }
        }
        return C0397b.m1929b(i2);
    }

    /* renamed from: a */
    public static ColorStateList m1980a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m1988a(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return C0396a.m1921a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m1981a(typedValue);
        }
    }

    /* renamed from: a */
    private static ColorStateList m1981a(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: a */
    public static String m1985a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1988a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static TypedArray m1982a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static boolean m1986a(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* renamed from: a */
    public static Drawable m1983a(TypedArray typedArray, int i, int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    /* renamed from: a */
    public static int m1978a(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    /* renamed from: a */
    public static int m1977a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }
}
