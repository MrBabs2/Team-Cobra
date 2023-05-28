package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0153m;
import p050l.p075h.p084l.C5019d;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.view.menu.l */
/* compiled from: MenuPopupHelper */
public class C0151l {

    /* renamed from: a */
    private final Context f596a;

    /* renamed from: b */
    private final C0138g f597b;

    /* renamed from: c */
    private final boolean f598c;

    /* renamed from: d */
    private final int f599d;

    /* renamed from: e */
    private final int f600e;

    /* renamed from: f */
    private View f601f;

    /* renamed from: g */
    private int f602g;

    /* renamed from: h */
    private boolean f603h;

    /* renamed from: i */
    private C0153m.C0154a f604i;

    /* renamed from: j */
    private C0150k f605j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f606k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f607l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* compiled from: MenuPopupHelper */
    class C0152a implements PopupWindow.OnDismissListener {
        C0152a() {
        }

        public void onDismiss() {
            C0151l.this.mo828d();
        }
    }

    public C0151l(Context context, C0138g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0150k m725g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f596a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f596a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p050l.p051a.C4793d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f596a
            android.view.View r3 = r14.f601f
            int r4 = r14.f599d
            int r5 = r14.f600e
            boolean r6 = r14.f598c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f596a
            androidx.appcompat.view.menu.g r9 = r14.f597b
            android.view.View r10 = r14.f601f
            int r11 = r14.f599d
            int r12 = r14.f600e
            boolean r13 = r14.f598c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f597b
            r0.mo569a((androidx.appcompat.view.menu.C0138g) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f607l
            r0.mo568a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f601f
            r0.mo567a((android.view.View) r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f604i
            r0.mo551a((androidx.appcompat.view.menu.C0153m.C0154a) r1)
            boolean r1 = r14.f603h
            r0.mo572b((boolean) r1)
            int r1 = r14.f602g
            r0.mo565a((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0151l.m725g():androidx.appcompat.view.menu.k");
    }

    /* renamed from: a */
    public void mo822a(PopupWindow.OnDismissListener onDismissListener) {
        this.f606k = onDismissListener;
    }

    /* renamed from: b */
    public C0150k mo826b() {
        if (this.f605j == null) {
            this.f605j = m725g();
        }
        return this.f605j;
    }

    /* renamed from: c */
    public boolean mo827c() {
        C0150k kVar = this.f605j;
        return kVar != null && kVar.mo570a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo828d() {
        this.f605j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f606k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void mo829e() {
        if (!mo830f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean mo830f() {
        if (mo827c()) {
            return true;
        }
        if (this.f601f == null) {
            return false;
        }
        m724a(0, 0, false, false);
        return true;
    }

    public C0151l(Context context, C0138g gVar, View view, boolean z, int i, int i2) {
        this.f602g = 8388611;
        this.f607l = new C0152a();
        this.f596a = context;
        this.f597b = gVar;
        this.f601f = view;
        this.f598c = z;
        this.f599d = i;
        this.f600e = i2;
    }

    /* renamed from: a */
    public void mo821a(View view) {
        this.f601f = view;
    }

    /* renamed from: a */
    public void mo824a(boolean z) {
        this.f603h = z;
        C0150k kVar = this.f605j;
        if (kVar != null) {
            kVar.mo572b(z);
        }
    }

    /* renamed from: a */
    public void mo820a(int i) {
        this.f602g = i;
    }

    /* renamed from: a */
    public boolean mo825a(int i, int i2) {
        if (mo827c()) {
            return true;
        }
        if (this.f601f == null) {
            return false;
        }
        m724a(i, i2, true, true);
        return true;
    }

    /* renamed from: a */
    private void m724a(int i, int i2, boolean z, boolean z2) {
        C0150k b = mo826b();
        b.mo576c(z2);
        if (z) {
            if ((C5019d.m8933a(this.f602g, C5071v.m9204p(this.f601f)) & 7) == 5) {
                i -= this.f601f.getWidth();
            }
            b.mo571b(i);
            b.mo575c(i2);
            int i3 = (int) ((this.f596a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo816a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.show();
    }

    /* renamed from: a */
    public void mo819a() {
        if (mo827c()) {
            this.f605j.dismiss();
        }
    }

    /* renamed from: a */
    public void mo823a(C0153m.C0154a aVar) {
        this.f604i = aVar;
        C0150k kVar = this.f605j;
        if (kVar != null) {
            kVar.mo551a(aVar);
        }
    }
}
