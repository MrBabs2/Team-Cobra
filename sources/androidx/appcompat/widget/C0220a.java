package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p050l.p051a.C4790a;
import p050l.p051a.C4799j;
import p050l.p075h.p084l.C5012a0;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.C5086z;

/* renamed from: androidx.appcompat.widget.a */
/* compiled from: AbsActionBarView */
abstract class C0220a extends ViewGroup {

    /* renamed from: f */
    protected final C0221a f965f;

    /* renamed from: g */
    protected final Context f966g;

    /* renamed from: h */
    protected ActionMenuView f967h;

    /* renamed from: i */
    protected ActionMenuPresenter f968i;

    /* renamed from: j */
    protected int f969j;

    /* renamed from: k */
    protected C5086z f970k;

    /* renamed from: l */
    private boolean f971l;

    /* renamed from: m */
    private boolean f972m;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* compiled from: AbsActionBarView */
    protected class C0221a implements C5012a0 {

        /* renamed from: a */
        private boolean f973a = false;

        /* renamed from: b */
        int f974b;

        protected C0221a() {
        }

        /* renamed from: a */
        public C0221a mo1417a(C5086z zVar, int i) {
            C0220a.this.f970k = zVar;
            this.f974b = i;
            return this;
        }

        public void onAnimationCancel(View view) {
            this.f973a = true;
        }

        public void onAnimationEnd(View view) {
            if (!this.f973a) {
                C0220a aVar = C0220a.this;
                aVar.f970k = null;
                C0220a.super.setVisibility(this.f974b);
            }
        }

        public void onAnimationStart(View view) {
            C0220a.super.setVisibility(0);
            this.f973a = false;
        }
    }

    C0220a(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    protected static int m1045a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getAnimatedVisibility() {
        if (this.f970k != null) {
            return this.f965f.f974b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f969j;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C4799j.ActionBar, C4790a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C4799j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f968i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo978a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f972m = false;
        }
        if (!this.f972m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f972m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f972m = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f971l = false;
        }
        if (!this.f971l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f971l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f971l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C5086z zVar = this.f970k;
            if (zVar != null) {
                zVar.mo17642a();
            }
            super.setVisibility(i);
        }
    }

    C0220a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public C5086z mo1413a(int i, long j) {
        C5086z zVar = this.f970k;
        if (zVar != null) {
            zVar.mo17642a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C5086z a = C5071v.m9151a(this);
            a.mo17637a(1.0f);
            a.mo17638a(j);
            C0221a aVar = this.f965f;
            aVar.mo1417a(a, i);
            a.mo17640a((C5012a0) aVar);
            return a;
        }
        C5086z a2 = C5071v.m9151a(this);
        a2.mo17637a(0.0f);
        a2.mo17638a(j);
        C0221a aVar2 = this.f965f;
        aVar2.mo1417a(a2, i);
        a2.mo17640a((C5012a0) aVar2);
        return a2;
    }

    C0220a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f965f = new C0221a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C4790a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f966g = context;
        } else {
            this.f966g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1411a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1412a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
