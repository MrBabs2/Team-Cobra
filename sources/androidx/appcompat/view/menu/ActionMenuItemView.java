package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0155n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0225b0;
import androidx.appcompat.widget.C0285s0;
import androidx.appcompat.widget.C0286t;
import p050l.p051a.C4799j;

public class ActionMenuItemView extends C0286t implements C0155n.C0156a, View.OnClickListener, ActionMenuView.C0178a {

    /* renamed from: j */
    C0142i f404j;

    /* renamed from: k */
    private CharSequence f405k;

    /* renamed from: l */
    private Drawable f406l;

    /* renamed from: m */
    C0138g.C0140b f407m;

    /* renamed from: n */
    private C0225b0 f408n;

    /* renamed from: o */
    C0125b f409o;

    /* renamed from: p */
    private boolean f410p;

    /* renamed from: q */
    private boolean f411q;

    /* renamed from: r */
    private int f412r;

    /* renamed from: s */
    private int f413s;

    /* renamed from: t */
    private int f414t;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0124a extends C0225b0 {
        public C0124a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0158p mo469a() {
            C0125b bVar = ActionMenuItemView.this.f409o;
            if (bVar != null) {
                return bVar.mo471a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo470b() {
            C0158p a;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0138g.C0140b bVar = actionMenuItemView.f407m;
            if (bVar == null || !bVar.mo473a(actionMenuItemView.f404j) || (a = mo469a()) == null || !a.mo570a()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0125b {
        /* renamed from: a */
        public abstract C0158p mo471a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    private boolean m513e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m514f() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f405k);
        if (this.f406l != null && (!this.f404j.mo727n() || (!this.f410p && !this.f411q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f405k : null);
        CharSequence contentDescription = this.f404j.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f404j.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f404j.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f404j.getTitle();
            }
            C0285s0.m1359a(this, charSequence2);
            return;
        }
        C0285s0.m1359a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo450a(C0142i iVar, int i) {
        this.f404j = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo690a((C0155n.C0156a) this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f408n == null) {
            this.f408n = new C0124a();
        }
    }

    /* renamed from: b */
    public boolean mo452b() {
        return mo454d() && this.f404j.getIcon() == null;
    }

    /* renamed from: c */
    public boolean mo453c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo454d() {
        return !TextUtils.isEmpty(getText());
    }

    public C0142i getItemData() {
        return this.f404j;
    }

    public void onClick(View view) {
        C0138g.C0140b bVar = this.f407m;
        if (bVar != null) {
            bVar.mo473a(this.f404j);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f410p = m513e();
        m514f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean d = mo454d();
        if (d && (i4 = this.f413s) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f412r);
        } else {
            i3 = this.f412r;
        }
        if (mode != 1073741824 && this.f412r > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!d && this.f406l != null) {
            super.setPadding((getMeasuredWidth() - this.f406l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0225b0 b0Var;
        if (!this.f404j.hasSubMenu() || (b0Var = this.f408n) == null || !b0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f411q != z) {
            this.f411q = z;
            C0142i iVar = this.f404j;
            if (iVar != null) {
                iVar.mo694b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f406l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f414t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f414t;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m514f();
    }

    public void setItemInvoker(C0138g.C0140b bVar) {
        this.f407m = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f413s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0125b bVar) {
        this.f409o = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f405k = charSequence;
        m514f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f410p = m513e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4799j.ActionMenuItemView, i, 0);
        this.f412r = obtainStyledAttributes.getDimensionPixelSize(C4799j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f414t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f413s = -1;
        setSaveEnabled(false);
    }

    /* renamed from: a */
    public boolean mo451a() {
        return mo454d();
    }
}
