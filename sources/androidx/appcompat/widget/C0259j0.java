package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.widget.C0229c0;
import p050l.p051a.C4790a;
import p050l.p051a.p058o.C4820a;

/* renamed from: androidx.appcompat.widget.j0 */
/* compiled from: ScrollingTabContainerView */
public class C0259j0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    Runnable f1103f;

    /* renamed from: g */
    private C0262c f1104g;

    /* renamed from: h */
    C0229c0 f1105h;

    /* renamed from: i */
    private Spinner f1106i;

    /* renamed from: j */
    private boolean f1107j;

    /* renamed from: k */
    int f1108k;

    /* renamed from: l */
    int f1109l;

    /* renamed from: m */
    private int f1110m;

    /* renamed from: n */
    private int f1111n;

    /* renamed from: androidx.appcompat.widget.j0$a */
    /* compiled from: ScrollingTabContainerView */
    class C0260a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f1112f;

        C0260a(View view) {
            this.f1112f = view;
        }

        public void run() {
            C0259j0.this.smoothScrollTo(this.f1112f.getLeft() - ((C0259j0.this.getWidth() - this.f1112f.getWidth()) / 2), 0);
            C0259j0.this.f1103f = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    /* compiled from: ScrollingTabContainerView */
    private class C0261b extends BaseAdapter {
        C0261b() {
        }

        public int getCount() {
            return C0259j0.this.f1105h.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0263d) C0259j0.this.f1105h.getChildAt(i)).mo1649a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0259j0.this.mo1632a((C0069a.C0072c) getItem(i), true);
            }
            ((C0263d) view).mo1650a((C0069a.C0072c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$c */
    /* compiled from: ScrollingTabContainerView */
    private class C0262c implements View.OnClickListener {
        C0262c() {
        }

        public void onClick(View view) {
            ((C0263d) view).mo1649a().mo204e();
            int childCount = C0259j0.this.f1105h.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0259j0.this.f1105h.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    private Spinner m1210a() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, C4790a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new C0229c0.C0230a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: b */
    private boolean m1211b() {
        Spinner spinner = this.f1106i;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m1212c() {
        if (!m1211b()) {
            if (this.f1106i == null) {
                this.f1106i = m1210a();
            }
            removeView(this.f1105h);
            addView(this.f1106i, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1106i.getAdapter() == null) {
                this.f1106i.setAdapter(new C0261b());
            }
            Runnable runnable = this.f1103f;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1103f = null;
            }
            this.f1106i.setSelection(this.f1111n);
        }
    }

    /* renamed from: d */
    private boolean m1213d() {
        if (!m1211b()) {
            return false;
        }
        removeView(this.f1106i);
        addView(this.f1105h, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1106i.getSelectedItemPosition());
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1103f;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C4820a a = C4820a.m8020a(getContext());
        setContentHeight(a.mo16774e());
        this.f1109l = a.mo16773d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1103f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0263d) view).mo1649a().mo204e();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1105h.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1108k = -1;
        } else {
            if (childCount > 2) {
                this.f1108k = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1108k = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1108k = Math.min(this.f1108k, this.f1109l);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1110m, 1073741824);
        if (z2 || !this.f1107j) {
            z = false;
        }
        if (z) {
            this.f1105h.measure(0, makeMeasureSpec);
            if (this.f1105h.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m1212c();
            } else {
                m1213d();
            }
        } else {
            m1213d();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1111n);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1107j = z;
    }

    public void setContentHeight(int i) {
        this.f1110m = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1111n = i;
        int childCount = this.f1105h.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1105h.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo1633a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1106i;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$d */
    /* compiled from: ScrollingTabContainerView */
    private class C0263d extends LinearLayout {

        /* renamed from: f */
        private final int[] f1116f;

        /* renamed from: g */
        private C0069a.C0072c f1117g;

        /* renamed from: h */
        private TextView f1118h;

        /* renamed from: i */
        private ImageView f1119i;

        /* renamed from: j */
        private View f1120j;

        public C0263d(Context context, C0069a.C0072c cVar, boolean z) {
            super(context, (AttributeSet) null, C4790a.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f1116f = iArr;
            this.f1117g = cVar;
            C0278q0 a = C0278q0.m1271a(context, (AttributeSet) null, iArr, C4790a.actionBarTabStyle, 0);
            if (a.mo1730g(0)) {
                setBackgroundDrawable(a.mo1719b(0));
            }
            a.mo1720b();
            if (z) {
                setGravity(8388627);
            }
            mo1651b();
        }

        /* renamed from: a */
        public void mo1650a(C0069a.C0072c cVar) {
            this.f1117g = cVar;
            mo1651b();
        }

        /* renamed from: b */
        public void mo1651b() {
            C0069a.C0072c cVar = this.f1117g;
            View b = cVar.mo201b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1120j = b;
                TextView textView = this.f1118h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1119i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1119i.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1120j;
            if (view != null) {
                removeView(view);
                this.f1120j = null;
            }
            Drawable c = cVar.mo202c();
            CharSequence d = cVar.mo203d();
            if (c != null) {
                if (this.f1119i == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1119i = appCompatImageView;
                }
                this.f1119i.setImageDrawable(c);
                this.f1119i.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1119i;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1119i.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1118h == null) {
                    C0286t tVar = new C0286t(getContext(), (AttributeSet) null, C4790a.actionBarTabTextStyle);
                    tVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    tVar.setLayoutParams(layoutParams2);
                    addView(tVar);
                    this.f1118h = tVar;
                }
                this.f1118h.setText(d);
                this.f1118h.setVisibility(0);
            } else {
                TextView textView2 = this.f1118h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1118h.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1119i;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo200a());
            }
            if (!z) {
                charSequence = cVar.mo200a();
            }
            C0285s0.m1359a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0259j0.this.f1108k > 0 && getMeasuredWidth() > (i3 = C0259j0.this.f1108k)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        /* renamed from: a */
        public C0069a.C0072c mo1649a() {
            return this.f1117g;
        }
    }

    /* renamed from: a */
    public void mo1633a(int i) {
        View childAt = this.f1105h.getChildAt(i);
        Runnable runnable = this.f1103f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0260a aVar = new C0260a(childAt);
        this.f1103f = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0263d mo1632a(C0069a.C0072c cVar, boolean z) {
        C0263d dVar = new C0263d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1110m));
        } else {
            dVar.setFocusable(true);
            if (this.f1104g == null) {
                this.f1104g = new C0262c();
            }
            dVar.setOnClickListener(this.f1104g);
        }
        return dVar;
    }
}
