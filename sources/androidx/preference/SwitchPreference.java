package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.p003c.C0413g;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: Z */
    private final C0574a f2317Z;

    /* renamed from: a0 */
    private CharSequence f2318a0;

    /* renamed from: b0 */
    private CharSequence f2319b0;

    /* renamed from: androidx.preference.SwitchPreference$a */
    private class C0574a implements CompoundButton.OnCheckedChangeListener {
        C0574a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.mo3192a((Object) Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.mo3277f(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2317Z = new C0574a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.SwitchPreference, i, i2);
        mo3276d(C0413g.m1992b(obtainStyledAttributes, C0615t.SwitchPreference_summaryOn, C0615t.SwitchPreference_android_summaryOn));
        mo3275c(C0413g.m1992b(obtainStyledAttributes, C0615t.SwitchPreference_summaryOff, C0615t.SwitchPreference_android_summaryOff));
        mo3268f(C0413g.m1992b(obtainStyledAttributes, C0615t.SwitchPreference_switchTextOn, C0615t.SwitchPreference_android_switchTextOn));
        mo3267e(C0413g.m1992b(obtainStyledAttributes, C0615t.SwitchPreference_switchTextOff, C0615t.SwitchPreference_android_switchTextOff));
        mo3278g(C0413g.m1986a(obtainStyledAttributes, C0615t.SwitchPreference_disableDependentsState, C0615t.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private void m2829c(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f2325U);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f2318a0);
            switchR.setTextOff(this.f2319b0);
            switchR.setOnCheckedChangeListener(this.f2317Z);
        }
    }

    /* renamed from: d */
    private void m2830d(View view) {
        if (((AccessibilityManager) mo3206d().getSystemService("accessibility")).isEnabled()) {
            m2829c(view.findViewById(16908352));
            mo3273b(view.findViewById(16908304));
        }
    }

    /* renamed from: a */
    public void mo3114a(C0607l lVar) {
        super.mo3114a(lVar);
        m2829c(lVar.mo3383a(16908352));
        mo3274b(lVar);
    }

    /* renamed from: e */
    public void mo3267e(CharSequence charSequence) {
        this.f2319b0 = charSequence;
        mo3124N();
    }

    /* renamed from: f */
    public void mo3268f(CharSequence charSequence) {
        this.f2318a0 = charSequence;
        mo3124N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3113a(View view) {
        super.mo3113a(view);
        m2830d(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0413g.m1977a(context, C0608m.switchPreferenceStyle, 16843629));
    }
}
