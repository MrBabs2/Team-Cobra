package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0104h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10580h;
import p112n.p277e.p279b.p282b.C10583k;

/* renamed from: com.google.android.material.bottomsheet.a */
/* compiled from: BottomSheetDialog */
public class C8462a extends C0104h {

    /* renamed from: h */
    private BottomSheetBehavior<FrameLayout> f24027h;

    /* renamed from: i */
    private FrameLayout f24028i;

    /* renamed from: j */
    boolean f24029j;

    /* renamed from: k */
    boolean f24030k = true;

    /* renamed from: l */
    private boolean f24031l = true;

    /* renamed from: m */
    private boolean f24032m;

    /* renamed from: n */
    private BottomSheetBehavior.C8460e f24033n = new C8466d();

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    /* compiled from: BottomSheetDialog */
    class C8463a implements View.OnClickListener {
        C8463a() {
        }

        public void onClick(View view) {
            C8462a aVar = C8462a.this;
            if (aVar.f24030k && aVar.isShowing() && C8462a.this.mo31093c()) {
                C8462a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    /* compiled from: BottomSheetDialog */
    class C8465c implements View.OnTouchListener {
        C8465c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    /* compiled from: BottomSheetDialog */
    class C8466d extends BottomSheetBehavior.C8460e {
        C8466d() {
        }

        public void onSlide(View view, float f) {
        }

        public void onStateChanged(View view, int i) {
            if (i == 5) {
                C8462a.this.cancel();
            }
        }
    }

    public C8462a(Context context, int i) {
        super(context, m27320a(context, i));
        mo380a(1);
    }

    /* renamed from: a */
    private View m27321a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m27322d();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f24028i.findViewById(C10578f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f24028i.findViewById(C10578f.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C10578f.touch_outside).setOnClickListener(new C8463a());
        C5071v.m9165a((View) frameLayout, (C5010a) new C8464b());
        frameLayout.setOnTouchListener(new C8465c());
        return this.f24028i;
    }

    /* renamed from: d */
    private FrameLayout m27322d() {
        if (this.f24028i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C10580h.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f24028i = frameLayout;
            BottomSheetBehavior<FrameLayout> b = BottomSheetBehavior.m27260b((FrameLayout) frameLayout.findViewById(C10578f.design_bottom_sheet));
            this.f24027h = b;
            b.mo31070a(this.f24033n);
            this.f24027h.mo31081d(this.f24030k);
        }
        return this.f24028i;
    }

    /* renamed from: b */
    public BottomSheetBehavior<FrameLayout> mo31092b() {
        if (this.f24027h == null) {
            m27322d();
        }
        return this.f24027h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo31093c() {
        if (!this.f24032m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f24031l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f24032m = true;
        }
        return this.f24031l;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> b = mo31092b();
        if (!this.f24029j || b.mo31077c() == 5) {
            super.cancel();
        } else {
            b.mo31083e(5);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f24027h;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo31077c() == 5) {
            this.f24027h.mo31083e(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f24030k != z) {
            this.f24030k = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f24027h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo31081d(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f24030k) {
            this.f24030k = true;
        }
        this.f24031l = z;
        this.f24032m = true;
    }

    public void setContentView(int i) {
        super.setContentView(m27321a(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(m27321a(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m27321a(0, view, layoutParams));
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    /* compiled from: BottomSheetDialog */
    class C8464b extends C5010a {
        C8464b() {
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            super.mo2445a(view, cVar);
            if (C8462a.this.f24030k) {
                cVar.mo17506a((int) CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
                cVar.mo17535e(true);
                return;
            }
            cVar.mo17535e(false);
        }

        /* renamed from: a */
        public boolean mo2446a(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C8462a aVar = C8462a.this;
                if (aVar.f24030k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo2446a(view, i, bundle);
        }
    }

    /* renamed from: a */
    private static int m27320a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C10574b.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return C10583k.Theme_Design_Light_BottomSheetDialog;
    }
}
