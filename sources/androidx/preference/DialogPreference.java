package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.p003c.C0413g;

public abstract class DialogPreference extends Preference {

    /* renamed from: U */
    private CharSequence f2219U;

    /* renamed from: V */
    private CharSequence f2220V;

    /* renamed from: W */
    private Drawable f2221W;

    /* renamed from: X */
    private CharSequence f2222X;

    /* renamed from: Y */
    private CharSequence f2223Y;

    /* renamed from: Z */
    private int f2224Z;

    /* renamed from: androidx.preference.DialogPreference$a */
    public interface C0552a {
        <T extends Preference> T findPreference(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.DialogPreference, i, i2);
        String b = C0413g.m1992b(obtainStyledAttributes, C0615t.DialogPreference_dialogTitle, C0615t.DialogPreference_android_dialogTitle);
        this.f2219U = b;
        if (b == null) {
            this.f2219U = mo3161B();
        }
        this.f2220V = C0413g.m1992b(obtainStyledAttributes, C0615t.DialogPreference_dialogMessage, C0615t.DialogPreference_android_dialogMessage);
        this.f2221W = C0413g.m1983a(obtainStyledAttributes, C0615t.DialogPreference_dialogIcon, C0615t.DialogPreference_android_dialogIcon);
        this.f2222X = C0413g.m1992b(obtainStyledAttributes, C0615t.DialogPreference_positiveButtonText, C0615t.DialogPreference_android_positiveButtonText);
        this.f2223Y = C0413g.m1992b(obtainStyledAttributes, C0615t.DialogPreference_negativeButtonText, C0615t.DialogPreference_android_negativeButtonText);
        this.f2224Z = C0413g.m1989b(obtainStyledAttributes, C0615t.DialogPreference_dialogLayout, C0615t.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo3116Q() {
        mo3224v().mo3366a((Preference) this);
    }

    /* renamed from: X */
    public Drawable mo3117X() {
        return this.f2221W;
    }

    /* renamed from: Y */
    public int mo3118Y() {
        return this.f2224Z;
    }

    /* renamed from: Z */
    public CharSequence mo3119Z() {
        return this.f2220V;
    }

    /* renamed from: a0 */
    public CharSequence mo3120a0() {
        return this.f2219U;
    }

    /* renamed from: b0 */
    public CharSequence mo3121b0() {
        return this.f2223Y;
    }

    /* renamed from: c0 */
    public CharSequence mo3122c0() {
        return this.f2222X;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0413g.m1977a(context, C0608m.dialogPreferenceStyle, 16842897));
    }
}
