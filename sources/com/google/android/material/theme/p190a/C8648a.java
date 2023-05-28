package com.google.android.material.theme.p190a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p050l.p051a.p058o.C4824d;
import p112n.p277e.p279b.p282b.C10574b;

/* renamed from: com.google.android.material.theme.a.a */
/* compiled from: MaterialThemeOverlay */
public class C8648a {

    /* renamed from: a */
    private static final int[] f24695a = {16842752, C10574b.theme};

    /* renamed from: b */
    private static final int[] f24696b = {C10574b.materialThemeOverlay};

    /* renamed from: a */
    private static int m28239a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24695a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    public static Context m28241b(Context context, AttributeSet attributeSet, int i, int i2) {
        int a = m28240a(context, attributeSet, i, i2);
        boolean z = (context instanceof C4824d) && ((C4824d) context).mo16780a() == a;
        if (a == 0 || z) {
            return context;
        }
        C4824d dVar = new C4824d(context, a);
        int a2 = m28239a(context, attributeSet);
        if (a2 != 0) {
            dVar.getTheme().applyStyle(a2, true);
        }
        return dVar;
    }

    /* renamed from: a */
    private static int m28240a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24696b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
