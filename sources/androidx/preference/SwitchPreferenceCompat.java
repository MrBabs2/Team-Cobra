package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.p003c.C0413g;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: Z */
    private final C0575a f2321Z;

    /* renamed from: a0 */
    private CharSequence f2322a0;

    /* renamed from: b0 */
    private CharSequence f2323b0;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C0575a implements CompoundButton.OnCheckedChangeListener {
        C0575a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.mo3192a((Object) Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.mo3277f(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2321Z = new C0575a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.SwitchPreferenceCompat, i, i2);
        mo3276d(C0413g.m1992b(obtainStyledAttributes, C0615t.SwitchPreferenceCompat_summaryOn, C0615t.SwitchPreferenceCompat_android_summaryOn));
        mo3275c(C0413g.m1992b(obtainStyledAttributes, C0615t.SwitchPreferenceCompat_summaryOff, C0615t.SwitchPreferenceCompat_android_summaryOff));
        mo3271f(C0413g.m1992b(obtainStyledAttributes, C0615t.SwitchPreferenceCompat_switchTextOn, C0615t.SwitchPreferenceCompat_android_switchTextOn));
        mo3270e(C0413g.m1992b(obtainStyledAttributes, C0615t.SwitchPreferenceCompat_switchTextOff, C0615t.SwitchPreferenceCompat_android_switchTextOff));
        mo3278g(C0413g.m1986a(obtainStyledAttributes, C0615t.SwitchPreferenceCompat_disableDependentsState, C0615t.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private void m2835c(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f2325U);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f2322a0);
            switchCompat.setTextOff(this.f2323b0);
            switchCompat.setOnCheckedChangeListener(this.f2321Z);
        }
    }

    /* renamed from: d */
    private void m2836d(View view) {
        if (((AccessibilityManager) mo3206d().getSystemService("accessibility")).isEnabled()) {
            m2835c(view.findViewById(C0611p.switchWidget));
            mo3273b(view.findViewById(16908304));
        }
    }

    /* renamed from: a */
    public void mo3114a(C0607l lVar) {
        super.mo3114a(lVar);
        m2835c(lVar.mo3383a(C0611p.switchWidget));
        mo3274b(lVar);
    }

    /* renamed from: e */
    public void mo3270e(CharSequence charSequence) {
        this.f2323b0 = charSequence;
        mo3124N();
    }

    /* renamed from: f */
    public void mo3271f(CharSequence charSequence) {
        this.f2322a0 = charSequence;
        mo3124N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3113a(View view) {
        super.mo3113a(view);
        m2836d(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0608m.switchPreferenceCompatStyle);
    }
}
