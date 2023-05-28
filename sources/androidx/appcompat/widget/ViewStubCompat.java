package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p050l.p051a.C4799j;

public final class ViewStubCompat extends View {

    /* renamed from: f */
    private int f960f;

    /* renamed from: g */
    private int f961g;

    /* renamed from: h */
    private WeakReference<View> f962h;

    /* renamed from: i */
    private LayoutInflater f963i;

    /* renamed from: j */
    private C0219a f964j;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0219a {
        /* renamed from: a */
        void mo1410a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo1398a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f960f != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f963i;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f960f, viewGroup, false);
            int i = this.f961g;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f962h = new WeakReference<>(inflate);
            C0219a aVar = this.f964j;
            if (aVar != null) {
                aVar.mo1410a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f961g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f963i;
    }

    public int getLayoutResource() {
        return this.f960f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f961g = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f963i = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f960f = i;
    }

    public void setOnInflateListener(C0219a aVar) {
        this.f964j = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f962h;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1398a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f960f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4799j.ViewStubCompat, i, 0);
        this.f961g = obtainStyledAttributes.getResourceId(C4799j.ViewStubCompat_android_inflatedId, -1);
        this.f960f = obtainStyledAttributes.getResourceId(C4799j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C4799j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
