package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10577e;
import p112n.p277e.p279b.p282b.C10582j;
import p112n.p277e.p279b.p282b.p283m.C10585a;
import p112n.p277e.p279b.p282b.p288q.C10609a;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10645k;

/* renamed from: com.google.android.material.textfield.d */
/* compiled from: DropdownMenuEndIconDelegate */
class C8625d extends C8637e {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final boolean f24627q = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f24628d = new C8626a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View.OnFocusChangeListener f24629e = new C8629c();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TextInputLayout.C8610e f24630f = new C8630d(this.f24654a);

    /* renamed from: g */
    private final TextInputLayout.C8611f f24631g = new C8631e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h */
    private final TextInputLayout.C8612g f24632h = new C8632f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f24633i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f24634j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f24635k = Long.MAX_VALUE;

    /* renamed from: l */
    private StateListDrawable f24636l;

    /* renamed from: m */
    private C10638g f24637m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AccessibilityManager f24638n;

    /* renamed from: o */
    private ValueAnimator f24639o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ValueAnimator f24640p;

    /* renamed from: com.google.android.material.textfield.d$a */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8626a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C8627a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ AutoCompleteTextView f24642f;

            C8627a(AutoCompleteTextView autoCompleteTextView) {
                this.f24642f = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f24642f.isPopupShowing();
                C8625d.this.m28148b(isPopupShowing);
                boolean unused = C8625d.this.f24633i = isPopupShowing;
            }
        }

        C8626a() {
        }

        public void afterTextChanged(Editable editable) {
            C8625d dVar = C8625d.this;
            AutoCompleteTextView a = dVar.m28138a(dVar.f24654a.getEditText());
            a.post(new C8627a(a));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8628b implements ValueAnimator.AnimatorUpdateListener {
        C8628b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8625d.this.f24656c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8629c implements View.OnFocusChangeListener {
        C8629c() {
        }

        public void onFocusChange(View view, boolean z) {
            C8625d.this.f24654a.setEndIconActivated(z);
            if (!z) {
                C8625d.this.m28148b(false);
                boolean unused = C8625d.this.f24633i = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8630d extends TextInputLayout.C8610e {
        C8630d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            super.mo2445a(view, cVar);
            cVar.mo17510a((CharSequence) Spinner.class.getName());
            if (cVar.mo17565u()) {
                cVar.mo17531d((CharSequence) null);
            }
        }

        /* renamed from: c */
        public void mo4271c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4271c(view, accessibilityEvent);
            C8625d dVar = C8625d.this;
            AutoCompleteTextView a = dVar.m28138a(dVar.f24654a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C8625d.this.f24638n.isTouchExplorationEnabled()) {
                C8625d.this.m28157d(a);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8631e implements TextInputLayout.C8611f {
        C8631e() {
        }

        /* renamed from: a */
        public void mo32216a(TextInputLayout textInputLayout) {
            AutoCompleteTextView a = C8625d.this.m28138a(textInputLayout.getEditText());
            C8625d.this.m28145b(a);
            C8625d.this.m28141a(a);
            C8625d.this.m28151c(a);
            a.setThreshold(0);
            a.removeTextChangedListener(C8625d.this.f24628d);
            a.addTextChangedListener(C8625d.this.f24628d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C8625d.this.f24630f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8632f implements TextInputLayout.C8612g {
        C8632f() {
        }

        /* renamed from: a */
        public void mo32217a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.removeTextChangedListener(C8625d.this.f24628d);
                if (autoCompleteTextView.getOnFocusChangeListener() == C8625d.this.f24629e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (C8625d.f24627q) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8633g implements View.OnClickListener {
        C8633g() {
        }

        public void onClick(View view) {
            C8625d.this.m28157d((AutoCompleteTextView) C8625d.this.f24654a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8634h implements View.OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ AutoCompleteTextView f24650f;

        C8634h(AutoCompleteTextView autoCompleteTextView) {
            this.f24650f = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C8625d.this.m28160e()) {
                    boolean unused = C8625d.this.f24633i = false;
                }
                C8625d.this.m28157d(this.f24650f);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8635i implements AutoCompleteTextView.OnDismissListener {
        C8635i() {
        }

        public void onDismiss() {
            boolean unused = C8625d.this.f24633i = true;
            long unused2 = C8625d.this.f24635k = System.currentTimeMillis();
            C8625d.this.m28148b(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$j */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C8636j extends AnimatorListenerAdapter {
        C8636j() {
        }

        public void onAnimationEnd(Animator animator) {
            C8625d dVar = C8625d.this;
            dVar.f24656c.setChecked(dVar.f24634j);
            C8625d.this.f24640p.start();
        }
    }

    C8625d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo32231a(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo32232b() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m28160e() {
        long currentTimeMillis = System.currentTimeMillis() - this.f24635k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m28157d(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m28160e()) {
                this.f24633i = false;
            }
            if (!this.f24633i) {
                if (f24627q) {
                    m28148b(!this.f24634j);
                } else {
                    this.f24634j = !this.f24634j;
                    this.f24656c.toggle();
                }
                if (this.f24634j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f24633i = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28145b(AutoCompleteTextView autoCompleteTextView) {
        if (f24627q) {
            int boxBackgroundMode = this.f24654a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f24637m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f24636l);
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: c */
    public void m28151c(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C8634h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f24629e);
        if (f24627q) {
            autoCompleteTextView.setOnDismissListener(new C8635i());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32218a() {
        float dimensionPixelOffset = (float) this.f24655b.getResources().getDimensionPixelOffset(C10576d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f24655b.getResources().getDimensionPixelOffset(C10576d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f24655b.getResources().getDimensionPixelOffset(C10576d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C10638g a = m28140a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C10638g a2 = m28140a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f24637m = a;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f24636l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, a);
        this.f24636l.addState(new int[0], a2);
        this.f24654a.setEndIconDrawable(C4800a.m7936c(this.f24655b, f24627q ? C10577e.mtrl_dropdown_arrow : C10577e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f24654a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C10582j.exposed_dropdown_menu_content_description));
        this.f24654a.setEndIconOnClickListener(new C8633g());
        this.f24654a.addOnEditTextAttachedListener(this.f24631g);
        this.f24654a.addOnEndIconChangedListener(this.f24632h);
        m28156d();
        C5071v.m9195h(this.f24656c, 2);
        this.f24638n = (AccessibilityManager) this.f24655b.getSystemService("accessibility");
    }

    /* renamed from: b */
    private void m28146b(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C10638g gVar) {
        LayerDrawable layerDrawable;
        int a = C10609a.m35926a((View) autoCompleteTextView, C10574b.colorSurface);
        C10638g gVar2 = new C10638g(gVar.mo36264l());
        int a2 = C10609a.m35923a(i, a, 0.1f);
        gVar2.mo36240a(new ColorStateList(iArr, new int[]{a2, 0}));
        if (f24627q) {
            gVar2.setTint(a);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a2, a});
            C10638g gVar3 = new C10638g(gVar.mo36264l());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        C5071v.m9161a((View) autoCompleteTextView, (Drawable) layerDrawable);
    }

    /* renamed from: d */
    private void m28156d() {
        this.f24640p = m28136a(67, 0.0f, 1.0f);
        ValueAnimator a = m28136a(50, 1.0f, 0.0f);
        this.f24639o = a;
        a.addListener(new C8636j());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28148b(boolean z) {
        if (this.f24634j != z) {
            this.f24634j = z;
            this.f24640p.cancel();
            this.f24639o.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28141a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f24654a.getBoxBackgroundMode();
            C10638g boxBackground = this.f24654a.getBoxBackground();
            int a = C10609a.m35926a((View) autoCompleteTextView, C10574b.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m28146b(autoCompleteTextView, a, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m28142a(autoCompleteTextView, a, iArr, boxBackground);
            }
        }
    }

    /* renamed from: a */
    private void m28142a(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C10638g gVar) {
        int boxBackgroundColor = this.f24654a.getBoxBackgroundColor();
        int[] iArr2 = {C10609a.m35923a(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f24627q) {
            C5071v.m9161a((View) autoCompleteTextView, (Drawable) new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        C10638g gVar2 = new C10638g(gVar.mo36264l());
        gVar2.mo36240a(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int u = C5071v.m9209u(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int t = C5071v.m9208t(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C5071v.m9161a((View) autoCompleteTextView, (Drawable) layerDrawable);
        C5071v.m9156a(autoCompleteTextView, u, paddingTop, t, paddingBottom);
    }

    /* renamed from: a */
    private C10638g m28140a(float f, float f2, float f3, int i) {
        C10645k.C10647b n = C10645k.m36079n();
        n.mo36311d(f);
        n.mo36315e(f);
        n.mo36303b(f2);
        n.mo36307c(f2);
        C10645k a = n.mo36302a();
        C10638g a2 = C10638g.m36007a(this.f24655b, f3);
        a2.setShapeAppearanceModel(a);
        a2.mo36238a(0, i, 0, i);
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AutoCompleteTextView m28138a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: a */
    private ValueAnimator m28136a(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C10585a.f28456a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C8628b());
        return ofFloat;
    }
}
