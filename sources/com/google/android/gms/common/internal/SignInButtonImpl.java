package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.C0414a;
import com.google.android.gms.base.C7154R;
import com.google.android.gms.common.util.DeviceProperties;

public final class SignInButtonImpl extends Button {
    public SignInButtonImpl(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo25390a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C7154R.C7155drawable.common_google_signin_btn_icon_dark;
        int i5 = C7154R.C7155drawable.common_google_signin_btn_icon_light;
        int a = m16064a(i2, i4, i5, i5);
        int i6 = C7154R.C7155drawable.common_google_signin_btn_text_dark;
        int i7 = C7154R.C7155drawable.common_google_signin_btn_text_light;
        int a2 = m16064a(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            a = a2;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable i8 = C0414a.m2029i(resources.getDrawable(a));
        C0414a.m2014a(i8, resources.getColorStateList(C7154R.color.common_google_signin_btn_tint));
        C0414a.m2017a(i8, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(i8);
        int i9 = C7154R.color.common_google_signin_btn_text_dark;
        int i10 = C7154R.color.common_google_signin_btn_text_light;
        ColorStateList colorStateList = resources.getColorStateList(m16064a(i2, i9, i10, i10));
        Preconditions.m16037a(colorStateList);
        setTextColor(colorStateList);
        if (i == 0) {
            setText(resources.getString(C7154R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C7154R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod((TransformationMethod) null);
        if (DeviceProperties.m16272c(getContext())) {
            setGravity(19);
        }
    }

    public SignInButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    /* renamed from: a */
    private static int m16064a(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
