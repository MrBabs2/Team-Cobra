package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p050l.p051a.C4793d;
import p050l.p051a.C4795f;
import p050l.p051a.C4796g;
import p050l.p051a.C4798i;

/* renamed from: androidx.appcompat.widget.u0 */
/* compiled from: TooltipPopup */
class C0294u0 {

    /* renamed from: a */
    private final Context f1253a;

    /* renamed from: b */
    private final View f1254b;

    /* renamed from: c */
    private final TextView f1255c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1256d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f1257e = new Rect();

    /* renamed from: f */
    private final int[] f1258f = new int[2];

    /* renamed from: g */
    private final int[] f1259g = new int[2];

    C0294u0(Context context) {
        this.f1253a = context;
        View inflate = LayoutInflater.from(context).inflate(C4796g.abc_tooltip, (ViewGroup) null);
        this.f1254b = inflate;
        this.f1255c = (TextView) inflate.findViewById(C4795f.message);
        this.f1256d.setTitle(C0294u0.class.getSimpleName());
        this.f1256d.packageName = this.f1253a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f1256d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C4798i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1859a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo1860b()) {
            mo1858a();
        }
        this.f1255c.setText(charSequence);
        m1406a(view, i, i2, z, this.f1256d);
        ((WindowManager) this.f1253a.getSystemService("window")).addView(this.f1254b, this.f1256d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1860b() {
        return this.f1254b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1858a() {
        if (mo1860b()) {
            ((WindowManager) this.f1253a.getSystemService("window")).removeView(this.f1254b);
        }
    }

    /* renamed from: a */
    private void m1406a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1253a.getResources().getDimensionPixelOffset(C4793d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1253a.getResources().getDimensionPixelOffset(C4793d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1253a.getResources().getDimensionPixelOffset(z ? C4793d.tooltip_y_offset_touch : C4793d.tooltip_y_offset_non_touch);
        View a = m1405a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f1257e);
        Rect rect = this.f1257e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1253a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1257e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f1259g);
        view.getLocationOnScreen(this.f1258f);
        int[] iArr = this.f1258f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1259g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1254b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1254b.getMeasuredHeight();
        int[] iArr3 = this.f1258f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        } else if (measuredHeight + i7 <= this.f1257e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: a */
    private static View m1405a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
