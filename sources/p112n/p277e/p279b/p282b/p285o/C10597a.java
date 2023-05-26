package p112n.p277e.p279b.p282b.p285o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0240e;
import androidx.core.widget.C0430c;
import com.google.android.material.internal.C8566j;
import com.google.android.material.theme.p190a.C8648a;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p288q.C10609a;
import p112n.p277e.p279b.p282b.p294w.C10620c;

/* renamed from: n.e.b.b.o.a */
/* compiled from: MaterialCheckBox */
public class C10597a extends C0240e {

    /* renamed from: k */
    private static final int f28479k = C10583k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: l */
    private static final int[][] f28480l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i */
    private ColorStateList f28481i;

    /* renamed from: j */
    private boolean f28482j;

    public C10597a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.checkboxStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f28481i == null) {
            int[] iArr = new int[f28480l.length];
            int a = C10609a.m35926a((View) this, C10574b.colorControlActivated);
            int a2 = C10609a.m35926a((View) this, C10574b.colorSurface);
            int a3 = C10609a.m35926a((View) this, C10574b.colorOnSurface);
            iArr[0] = C10609a.m35923a(a2, a, 1.0f);
            iArr[1] = C10609a.m35923a(a2, a3, 0.54f);
            iArr[2] = C10609a.m35923a(a2, a3, 0.38f);
            iArr[3] = C10609a.m35923a(a2, a3, 0.38f);
            this.f28481i = new ColorStateList(f28480l, iArr);
        }
        return this.f28481i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28482j && C0430c.m2130b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f28482j = z;
        if (z) {
            C0430c.m2128a((CompoundButton) this, getMaterialThemeColorsTintList());
        } else {
            C0430c.m2128a((CompoundButton) this, (ColorStateList) null);
        }
    }

    public C10597a(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f28479k), attributeSet, i);
        Context context2 = getContext();
        TypedArray c = C8566j.m27997c(context2, attributeSet, C10584l.MaterialCheckBox, i, f28479k, new int[0]);
        if (c.hasValue(C10584l.MaterialCheckBox_buttonTint)) {
            C0430c.m2128a((CompoundButton) this, C10620c.m35957a(context2, c, C10584l.MaterialCheckBox_buttonTint));
        }
        this.f28482j = c.getBoolean(C10584l.MaterialCheckBox_useMaterialThemeColors, false);
        c.recycle();
    }
}
