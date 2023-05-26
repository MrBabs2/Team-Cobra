package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.p003c.C0413g;
import androidx.preference.C0600j;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: d0 */
    private boolean f2299d0 = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0413g.m1977a(context, C0608m.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo3116Q() {
        C0600j.C0602b c;
        if (mo3217o() == null && mo3215l() == null && mo3119Z() != 0 && (c = mo3224v().mo3373c()) != null) {
            c.onNavigateToScreen(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public boolean mo3237a0() {
        return false;
    }

    /* renamed from: c0 */
    public boolean mo3254c0() {
        return this.f2299d0;
    }
}
