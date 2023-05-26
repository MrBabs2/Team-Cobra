package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.content.C0394a;
import androidx.core.content.p003c.C0413g;
import p050l.p075h.p084l.p085e0.C5034c;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: J */
    public boolean mo3165J() {
        return false;
    }

    /* renamed from: V */
    public boolean mo3129V() {
        return !super.mo3165J();
    }

    /* renamed from: a */
    public void mo3114a(C0607l lVar) {
        TextView textView;
        super.mo3114a(lVar);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            lVar.itemView.setAccessibilityHeading(true);
        } else if (i < 21) {
            TypedValue typedValue = new TypedValue();
            if (mo3206d().getTheme().resolveAttribute(C0608m.colorAccent, typedValue, true) && (textView = (TextView) lVar.mo3383a(16908310)) != null && textView.getCurrentTextColor() == C0394a.m1909a(mo3206d(), C0609n.preference_fallback_accent_color)) {
                textView.setTextColor(typedValue.data);
            }
        }
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0413g.m1977a(context, C0608m.preferenceCategoryStyle, 16842892));
    }

    @Deprecated
    /* renamed from: a */
    public void mo3190a(C5034c cVar) {
        C5034c.C5037c e;
        super.mo3190a(cVar);
        if (Build.VERSION.SDK_INT < 28 && (e = cVar.mo17533e()) != null) {
            cVar.mo17521b((Object) C5034c.C5037c.m9069a(e.mo17576c(), e.mo17577d(), e.mo17574a(), e.mo17575b(), true, e.mo17578e()));
        }
    }
}
