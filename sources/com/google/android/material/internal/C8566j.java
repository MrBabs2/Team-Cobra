package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0278q0;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10584l;

/* renamed from: com.google.android.material.internal.j */
/* compiled from: ThemeEnforcement */
public final class C8566j {

    /* renamed from: a */
    private static final int[] f24517a = {C10574b.colorPrimary};

    /* renamed from: b */
    private static final int[] f24518b = {C10574b.colorPrimaryVariant};

    /* renamed from: a */
    private static void m27991a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C10584l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C10574b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m27995b(context);
            }
        }
        m27990a(context);
    }

    /* renamed from: b */
    private static boolean m27996b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    public static TypedArray m27997c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m27991a(context, attributeSet, i, i2);
        m27992a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    public static C0278q0 m27998d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m27991a(context, attributeSet, i, i2);
        m27992a(context, attributeSet, iArr, i, i2, iArr2);
        return C0278q0.m1271a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static void m27995b(Context context) {
        m27993a(context, f24518b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static void m27992a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C10584l.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C10584l.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m27996b(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: a */
    public static void m27990a(Context context) {
        m27993a(context, f24517a, "Theme.AppCompat");
    }

    /* renamed from: a */
    private static boolean m27994a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: a */
    private static void m27993a(Context context, int[] iArr, String str) {
        if (!m27994a(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }
}
