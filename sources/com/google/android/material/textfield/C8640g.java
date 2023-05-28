package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0228c;
import androidx.appcompat.widget.C0232d0;
import com.google.android.material.internal.C8566j;
import com.google.android.material.theme.p190a.C8648a;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;

/* renamed from: com.google.android.material.textfield.g */
/* compiled from: MaterialAutoCompleteTextView */
public class C8640g extends C0228c {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0232d0 f24684i;

    /* renamed from: j */
    private final AccessibilityManager f24685j;

    /* renamed from: k */
    private final Rect f24686k;

    /* renamed from: com.google.android.material.textfield.g$a */
    /* compiled from: MaterialAutoCompleteTextView */
    class C8641a implements AdapterView.OnItemClickListener {
        C8641a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C8640g.this.m28219a(i < 0 ? C8640g.this.f24684i.mo1505i() : C8640g.this.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = C8640g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C8640g.this.f24684i.mo1510l();
                    i = C8640g.this.f24684i.mo1509k();
                    j = C8640g.this.f24684i.mo1507j();
                }
                onItemClickListener.onItemClick(C8640g.this.f24684i.mo579e(), view, i, j);
            }
            C8640g.this.f24684i.dismiss();
        }
    }

    public C8640g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.autoCompleteTextViewStyle);
    }

    /* renamed from: b */
    private int m28220b() {
        ListAdapter adapter = getAdapter();
        TextInputLayout a = m28217a();
        int i = 0;
        if (adapter == null || a == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f24684i.mo1509k()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, a);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable d = this.f24684i.mo1496d();
        if (d != null) {
            d.getPadding(this.f24686k);
            Rect rect = this.f24686k;
            i2 += rect.left + rect.right;
        }
        return i2 + a.getEndIconView().getMeasuredWidth();
    }

    public CharSequence getHint() {
        TextInputLayout a = m28217a();
        if (a == null || !a.isProvidingHint()) {
            return super.getHint();
        }
        return a.getHint();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m28220b()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f24684i.mo1111a(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.f24685j) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f24684i.show();
        }
    }

    public C8640g(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, 0), attributeSet, i);
        this.f24686k = new Rect();
        Context context2 = getContext();
        TypedArray c = C8566j.m27997c(context2, attributeSet, C10584l.MaterialAutoCompleteTextView, i, C10583k.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (c.hasValue(C10584l.MaterialAutoCompleteTextView_android_inputType) && c.getInt(C10584l.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f24685j = (AccessibilityManager) context2.getSystemService("accessibility");
        C0232d0 d0Var = new C0232d0(context2);
        this.f24684i = d0Var;
        d0Var.mo1492a(true);
        this.f24684i.mo1489a((View) this);
        this.f24684i.mo1502g(2);
        this.f24684i.mo1111a(getAdapter());
        this.f24684i.mo1490a((AdapterView.OnItemClickListener) new C8641a());
        c.recycle();
    }

    /* renamed from: a */
    private TextInputLayout m28217a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T extends ListAdapter & Filterable> void m28219a(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter((ListAdapter) null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }
}
