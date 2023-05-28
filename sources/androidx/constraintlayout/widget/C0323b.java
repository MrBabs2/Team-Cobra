package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4913h;

/* renamed from: androidx.constraintlayout.widget.b */
/* compiled from: ConstraintHelper */
public abstract class C0323b extends View {

    /* renamed from: f */
    protected int[] f1442f = new int[32];

    /* renamed from: g */
    protected int f1443g;

    /* renamed from: h */
    protected Context f1444h;

    /* renamed from: i */
    protected C4913h f1445i;

    /* renamed from: j */
    protected boolean f1446j = false;

    /* renamed from: k */
    protected String f1447k;

    /* renamed from: l */
    protected String f1448l;

    /* renamed from: m */
    private HashMap<Integer, String> f1449m = new HashMap<>();

    public C0323b(Context context) {
        super(context);
        this.f1444h = context;
        mo1967a((AttributeSet) null);
    }

    /* renamed from: c */
    private int m1603c(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object a = constraintLayout.mo1977a(0, str);
            if (a instanceof Integer) {
                i = ((Integer) a).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m1599a(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0337h.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f1444h.getResources().getIdentifier(str, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, this.f1444h.getPackageName()) : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1967a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0338i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0338i.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1447k = string;
                    setIds(string);
                } else if (index == C0338i.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1448l = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo1968a(C4907e eVar, boolean z) {
    }

    /* renamed from: b */
    public void mo2031b() {
        if (this.f1445i != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0317b) {
                ((ConstraintLayout.C0317b) layoutParams).f1402m0 = (C4907e) this.f1445i;
            }
        }
    }

    /* renamed from: b */
    public void mo2018b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void mo2032c(ConstraintLayout constraintLayout) {
    }

    /* renamed from: d */
    public void mo2033d(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f1449m.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2034e(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f1447k
            r5.setIds(r0)
        L_0x000b:
            l.f.b.k.h r0 = r5.f1445i
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo17305a()
            r0 = 0
        L_0x0014:
            int r1 = r5.f1443g
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f1442f
            r1 = r1[r0]
            android.view.View r2 = r6.mo1976a((int) r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f1449m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.m1599a((androidx.constraintlayout.widget.ConstraintLayout) r6, (java.lang.String) r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f1442f
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f1449m
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.mo1976a((int) r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            l.f.b.k.h r1 = r5.f1445i
            l.f.b.k.e r2 = r6.mo1978a((android.view.View) r2)
            r1.mo17306a((p050l.p067f.p071b.p072k.C4907e) r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            l.f.b.k.h r0 = r5.f1445i
            l.f.b.k.f r6 = r6.f1333h
            r0.mo17307a((p050l.p067f.p071b.p072k.C4910f) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0323b.mo2034e(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1442f, this.f1443g);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1447k;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1448l;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1446j) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f1447k = str;
        if (str != null) {
            int i = 0;
            this.f1443g = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1601a(str.substring(i));
                    return;
                } else {
                    m1601a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f1448l = str;
        if (str != null) {
            int i = 0;
            this.f1443g = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1602b(str.substring(i));
                    return;
                } else {
                    m1602b(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1447k = null;
        this.f1443g = 0;
        for (int a : iArr) {
            m1600a(a);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f1447k == null) {
            m1600a(i);
        }
    }

    /* renamed from: b */
    private void m1602b(String str) {
        if (str != null && str.length() != 0 && this.f1444h != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.C0317b) && trim.equals(((ConstraintLayout.C0317b) layoutParams).f1371U)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        m1600a(childAt.getId());
                    }
                }
            }
        }
    }

    public C0323b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1444h = context;
        mo1967a(attributeSet);
    }

    /* renamed from: a */
    private void m1600a(int i) {
        if (i != getId()) {
            int i2 = this.f1443g + 1;
            int[] iArr = this.f1442f;
            if (i2 > iArr.length) {
                this.f1442f = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1442f;
            int i3 = this.f1443g;
            iArr2[i3] = i;
            this.f1443g = i3 + 1;
        }
    }

    public C0323b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1444h = context;
        mo1967a(attributeSet);
    }

    /* renamed from: a */
    private void m1601a(String str) {
        if (str != null && str.length() != 0 && this.f1444h != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int c = m1603c(trim);
            if (c != 0) {
                this.f1449m.put(Integer.valueOf(c), trim);
                m1600a(c);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* renamed from: a */
    private int m1599a(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1444h.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2030a(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f1443g; i++) {
            View a = constraintLayout.mo1976a(this.f1442f[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    a.setTranslationZ(a.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2029a() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo2030a((ConstraintLayout) parent);
        }
    }
}
