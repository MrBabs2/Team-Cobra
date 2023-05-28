package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0286t;
import com.google.android.material.theme.p190a.C8648a;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p294w.C10619b;
import p112n.p277e.p279b.p282b.p294w.C10620c;

public class MaterialTextView extends C0286t {
    public MaterialTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m28231a(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C10584l.MaterialTextAppearance);
        int a = m28229a(getContext(), obtainStyledAttributes, C10584l.MaterialTextAppearance_android_lineHeight, C10584l.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            setLineHeight(a);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m28232a(context)) {
            m28231a(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C8648a.m28241b(context, attributeSet, i, i2), attributeSet, i);
        int a;
        Context context2 = getContext();
        if (m28232a(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!m28233a(context2, theme, attributeSet, i, i2) && (a = m28230a(theme, attributeSet, i, i2)) != -1) {
                m28231a(theme, a);
            }
        }
    }

    /* renamed from: a */
    private static boolean m28232a(Context context) {
        return C10619b.m35954a(context, C10574b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: a */
    private static int m28229a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C10620c.m35955a(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m28233a(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C10584l.MaterialTextView, i, i2);
        int a = m28229a(context, obtainStyledAttributes, C10584l.MaterialTextView_android_lineHeight, C10584l.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (a != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m28230a(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C10584l.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C10584l.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
