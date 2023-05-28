package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.p003c.C0413g;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: Z */
    private final C0551a f2217Z;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    private class C0551a implements CompoundButton.OnCheckedChangeListener {
        C0551a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.mo3192a((Object) Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.mo3277f(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: c */
    private void m2647c(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f2325U);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f2217Z);
        }
    }

    /* renamed from: d */
    private void m2648d(View view) {
        if (((AccessibilityManager) mo3206d().getSystemService("accessibility")).isEnabled()) {
            m2647c(view.findViewById(16908289));
            mo3273b(view.findViewById(16908304));
        }
    }

    /* renamed from: a */
    public void mo3114a(C0607l lVar) {
        super.mo3114a(lVar);
        m2647c(lVar.mo3383a(16908289));
        mo3274b(lVar);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2217Z = new C0551a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.CheckBoxPreference, i, i2);
        mo3276d(C0413g.m1992b(obtainStyledAttributes, C0615t.CheckBoxPreference_summaryOn, C0615t.CheckBoxPreference_android_summaryOn));
        mo3275c(C0413g.m1992b(obtainStyledAttributes, C0615t.CheckBoxPreference_summaryOff, C0615t.CheckBoxPreference_android_summaryOff));
        mo3278g(C0413g.m1986a(obtainStyledAttributes, C0615t.CheckBoxPreference_disableDependentsState, C0615t.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3113a(View view) {
        super.mo3113a(view);
        m2648d(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0413g.m1977a(context, C0608m.checkBoxPreferenceStyle, 16842895));
    }
}
