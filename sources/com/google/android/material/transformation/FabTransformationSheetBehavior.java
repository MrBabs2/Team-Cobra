package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10573a;
import p112n.p277e.p279b.p282b.p283m.C10592h;
import p112n.p277e.p279b.p282b.p283m.C10594j;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f24723i;

    public FabTransformationSheetBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FabTransformationBehavior.C8655e mo32286a(Context context, boolean z) {
        int i;
        if (z) {
            i = C10573a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C10573a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C8655e eVar = new FabTransformationBehavior.C8655e();
        eVar.f24717a = C10592h.m35878a(context, i);
        eVar.f24718b = new C10594j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32281a(View view, View view2, boolean z, boolean z2) {
        m28280a(view2, z);
        return super.mo32281a(view, view2, z, z2);
    }

    /* renamed from: a */
    private void m28280a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f24723i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0346f) && (((CoordinatorLayout.C0346f) childAt.getLayoutParams()).mo2175d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f24723i;
                        if (map != null && map.containsKey(childAt)) {
                            C5071v.m9195h(childAt, this.f24723i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f24723i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C5071v.m9195h(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f24723i = null;
            }
        }
    }
}
