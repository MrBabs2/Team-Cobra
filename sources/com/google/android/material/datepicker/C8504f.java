package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.fragment.app.C0454b;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.p294w.C10619b;

/* renamed from: com.google.android.material.datepicker.f */
/* compiled from: MaterialDatePicker */
public final class C8504f<S> extends C0454b {
    /* renamed from: a */
    static boolean m27671a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C10619b.m35951a(context, C10574b.materialCalendarStyle, C8491e.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
