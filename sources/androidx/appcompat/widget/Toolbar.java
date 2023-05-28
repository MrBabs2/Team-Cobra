package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0142i;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.view.menu.C0162r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p050l.p051a.C4790a;
import p050l.p051a.C4799j;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p051a.p058o.C4823c;
import p050l.p051a.p058o.C4828g;
import p050l.p075h.p084l.C5019d;
import p050l.p075h.p084l.C5054g;
import p050l.p075h.p084l.C5071v;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f910A;

    /* renamed from: B */
    private int f911B;

    /* renamed from: C */
    private CharSequence f912C;

    /* renamed from: D */
    private CharSequence f913D;

    /* renamed from: E */
    private ColorStateList f914E;

    /* renamed from: F */
    private ColorStateList f915F;

    /* renamed from: G */
    private boolean f916G;

    /* renamed from: H */
    private boolean f917H;

    /* renamed from: I */
    private final ArrayList<View> f918I;

    /* renamed from: J */
    private final ArrayList<View> f919J;

    /* renamed from: K */
    private final int[] f920K;

    /* renamed from: L */
    C0218f f921L;

    /* renamed from: M */
    private final ActionMenuView.C0182e f922M;

    /* renamed from: N */
    private C0280r0 f923N;

    /* renamed from: O */
    private ActionMenuPresenter f924O;

    /* renamed from: P */
    private C0216d f925P;

    /* renamed from: Q */
    private C0153m.C0154a f926Q;

    /* renamed from: R */
    private C0138g.C0139a f927R;

    /* renamed from: S */
    private boolean f928S;

    /* renamed from: T */
    private final Runnable f929T;

    /* renamed from: f */
    private ActionMenuView f930f;

    /* renamed from: g */
    private TextView f931g;

    /* renamed from: h */
    private TextView f932h;

    /* renamed from: i */
    private ImageButton f933i;

    /* renamed from: j */
    private ImageView f934j;

    /* renamed from: k */
    private Drawable f935k;

    /* renamed from: l */
    private CharSequence f936l;

    /* renamed from: m */
    ImageButton f937m;

    /* renamed from: n */
    View f938n;

    /* renamed from: o */
    private Context f939o;

    /* renamed from: p */
    private int f940p;

    /* renamed from: q */
    private int f941q;

    /* renamed from: r */
    private int f942r;

    /* renamed from: s */
    int f943s;

    /* renamed from: t */
    private int f944t;

    /* renamed from: u */
    private int f945u;

    /* renamed from: v */
    private int f946v;

    /* renamed from: w */
    private int f947w;

    /* renamed from: x */
    private int f948x;

    /* renamed from: y */
    private C0257i0 f949y;

    /* renamed from: z */
    private int f950z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0213a implements ActionMenuView.C0182e {
        C0213a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0218f fVar = Toolbar.this.f921L;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0214b implements Runnable {
        C0214b() {
        }

        public void run() {
            Toolbar.this.mo1352k();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0215c implements View.OnClickListener {
        C0215c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1310c();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0218f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    private MenuInflater getMenuInflater() {
        return new C4828g(getContext());
    }

    /* renamed from: l */
    private void m1008l() {
        if (this.f949y == null) {
            this.f949y = new C0257i0();
        }
    }

    /* renamed from: m */
    private void m1009m() {
        if (this.f934j == null) {
            this.f934j = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: n */
    private void m1010n() {
        m1011o();
        if (this.f930f.mo1015j() == null) {
            C0138g gVar = (C0138g) this.f930f.getMenu();
            if (this.f925P == null) {
                this.f925P = new C0216d();
            }
            this.f930f.setExpandedActionViewsExclusive(true);
            gVar.mo621a((C0153m) this.f925P, this.f939o);
        }
    }

    /* renamed from: o */
    private void m1011o() {
        if (this.f930f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f930f = actionMenuView;
            actionMenuView.setPopupTheme(this.f940p);
            this.f930f.setOnMenuItemClickListener(this.f922M);
            this.f930f.mo998a(this.f926Q, this.f927R);
            C0217e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f215a = 8388613 | (this.f943s & 112);
            this.f930f.setLayoutParams(generateDefaultLayoutParams);
            m1000a((View) this.f930f, false);
        }
    }

    /* renamed from: p */
    private void m1012p() {
        if (this.f933i == null) {
            this.f933i = new C0264k(getContext(), (AttributeSet) null, C4790a.toolbarNavigationButtonStyle);
            C0217e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f215a = 8388611 | (this.f943s & 112);
            this.f933i.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private void m1013q() {
        removeCallbacks(this.f929T);
        post(this.f929T);
    }

    /* renamed from: r */
    private boolean m1014r() {
        if (!this.f928S) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1007d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo1306a(C0138g gVar, ActionMenuPresenter actionMenuPresenter) {
        if (gVar != null || this.f930f != null) {
            m1011o();
            C0138g j = this.f930f.mo1015j();
            if (j != gVar) {
                if (j != null) {
                    j.mo640b((C0153m) this.f924O);
                    j.mo640b((C0153m) this.f925P);
                }
                if (this.f925P == null) {
                    this.f925P = new C0216d();
                }
                actionMenuPresenter.mo981b(true);
                if (gVar != null) {
                    gVar.mo621a((C0153m) actionMenuPresenter, this.f939o);
                    gVar.mo621a((C0153m) this.f925P, this.f939o);
                } else {
                    actionMenuPresenter.mo547a(this.f939o, (C0138g) null);
                    this.f925P.mo547a(this.f939o, (C0138g) null);
                    actionMenuPresenter.mo552a(true);
                    this.f925P.mo552a(true);
                }
                this.f930f.setPopupTheme(this.f940p);
                this.f930f.setPresenter(actionMenuPresenter);
                this.f924O = actionMenuPresenter;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f930f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1309b() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f930f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo1014i()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1309b():boolean");
    }

    /* renamed from: c */
    public void mo1310c() {
        C0142i iVar;
        C0216d dVar = this.f925P;
        if (dVar == null) {
            iVar = null;
        } else {
            iVar = dVar.f957g;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0217e);
    }

    /* renamed from: d */
    public void mo1312d() {
        ActionMenuView actionMenuView = this.f930f;
        if (actionMenuView != null) {
            actionMenuView.mo1000d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1313e() {
        if (this.f937m == null) {
            C0264k kVar = new C0264k(getContext(), (AttributeSet) null, C4790a.toolbarNavigationButtonStyle);
            this.f937m = kVar;
            kVar.setImageDrawable(this.f935k);
            this.f937m.setContentDescription(this.f936l);
            C0217e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f215a = 8388611 | (this.f943s & 112);
            generateDefaultLayoutParams.f959b = 2;
            this.f937m.setLayoutParams(generateDefaultLayoutParams);
            this.f937m.setOnClickListener(new C0215c());
        }
    }

    /* renamed from: f */
    public boolean mo1314f() {
        C0216d dVar = this.f925P;
        return (dVar == null || dVar.f957g == null) ? false : true;
    }

    /* renamed from: g */
    public boolean mo1315g() {
        ActionMenuView actionMenuView = this.f930f;
        return actionMenuView != null && actionMenuView.mo1004f();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f937m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f937m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0257i0 i0Var = this.f949y;
        if (i0Var != null) {
            return i0Var.mo1625a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f910A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0257i0 i0Var = this.f949y;
        if (i0Var != null) {
            return i0Var.mo1628b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0257i0 i0Var = this.f949y;
        if (i0Var != null) {
            return i0Var.mo1630c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0257i0 i0Var = this.f949y;
        if (i0Var != null) {
            return i0Var.mo1631d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f950z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo1015j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f930f
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo1015j()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f910A
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (C5071v.m9204p(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C5071v.m9204p(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f950z, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f934j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f934j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1010n();
        return this.f930f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f933i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f933i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f924O;
    }

    public Drawable getOverflowIcon() {
        m1010n();
        return this.f930f.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f939o;
    }

    public int getPopupTheme() {
        return this.f940p;
    }

    public CharSequence getSubtitle() {
        return this.f913D;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f932h;
    }

    public CharSequence getTitle() {
        return this.f912C;
    }

    public int getTitleMarginBottom() {
        return this.f948x;
    }

    public int getTitleMarginEnd() {
        return this.f946v;
    }

    public int getTitleMarginStart() {
        return this.f945u;
    }

    public int getTitleMarginTop() {
        return this.f947w;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f931g;
    }

    public C0299x getWrapper() {
        if (this.f923N == null) {
            this.f923N = new C0280r0(this, true);
        }
        return this.f923N;
    }

    /* renamed from: h */
    public boolean mo1349h() {
        ActionMenuView actionMenuView = this.f930f;
        return actionMenuView != null && actionMenuView.mo1005g();
    }

    /* renamed from: i */
    public boolean mo1350i() {
        ActionMenuView actionMenuView = this.f930f;
        return actionMenuView != null && actionMenuView.mo1013h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1351j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0217e) childAt.getLayoutParams()).f959b == 2 || childAt == this.f930f)) {
                removeViewAt(childCount);
                this.f919J.add(childAt);
            }
        }
    }

    /* renamed from: k */
    public boolean mo1352k() {
        ActionMenuView actionMenuView = this.f930f;
        return actionMenuView != null && actionMenuView.mo1016k();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f929T);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f917H = false;
        }
        if (!this.f917H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f917H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f917H = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a3 A[LOOP:0: B:101:0x02a1->B:102:0x02a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c5 A[LOOP:1: B:104:0x02c3->B:105:0x02c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fe A[LOOP:2: B:112:0x02fc->B:113:0x02fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p050l.p075h.p084l.C5071v.m9204p(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f920K
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p050l.p075h.p084l.C5071v.m9205q(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f933i
            boolean r13 = r0.m1007d(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f933i
            int r13 = r0.m1004b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f933i
            int r13 = r0.m997a(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f937m
            boolean r15 = r0.m1007d(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f937m
            int r14 = r0.m1004b(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f937m
            int r13 = r0.m997a(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f930f
            boolean r15 = r0.m1007d(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f930f
            int r13 = r0.m997a(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f930f
            int r14 = r0.m1004b(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f938n
            boolean r13 = r0.m1007d(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f938n
            int r10 = r0.m1004b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f938n
            int r2 = r0.m997a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f934j
            boolean r13 = r0.m1007d(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f934j
            int r10 = r0.m1004b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f934j
            int r2 = r0.m997a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f931g
            boolean r13 = r0.m1007d(r13)
            android.widget.TextView r14 = r0.f932h
            boolean r14 = r0.m1007d(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f931g
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0217e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f931g
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f932h
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0217e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f932h
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0294
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f931g
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f932h
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f932h
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f931g
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0217e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0217e) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f931g
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f932h
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f911B
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f947w
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f948x
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f948x
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f947w
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0229
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f945u
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f931g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0217e) r1
            android.widget.TextView r2 = r0.f931g
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f931g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f931g
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f946v
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021d
            android.widget.TextView r1 = r0.f932h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0217e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f932h
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f932h
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f932h
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f946v
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x021e
        L_0x021d:
            r3 = r10
        L_0x021e:
            if (r17 == 0) goto L_0x0225
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0225:
            r2 = r24
            goto L_0x0128
        L_0x0229:
            if (r17 == 0) goto L_0x022f
            int r7 = r0.f945u
            r1 = 0
            goto L_0x0231
        L_0x022f:
            r1 = 0
            r7 = 0
        L_0x0231:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0266
            android.widget.TextView r3 = r0.f931g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0217e) r3
            android.widget.TextView r4 = r0.f931g
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f931g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f931g
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f946v
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0267
        L_0x0266:
            r4 = r2
        L_0x0267:
            if (r14 == 0) goto L_0x028d
            android.widget.TextView r3 = r0.f932h
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0217e) r3
            int r5 = r3.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f932h
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r2
            android.widget.TextView r6 = r0.f932h
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.f932h
            r7.layout(r2, r8, r5, r6)
            int r6 = r0.f946v
            int r5 = r5 + r6
            int r3 = r3.bottomMargin
            goto L_0x028e
        L_0x028d:
            r5 = r2
        L_0x028e:
            if (r17 == 0) goto L_0x0294
            int r2 = java.lang.Math.max(r4, r5)
        L_0x0294:
            java.util.ArrayList<android.view.View> r3 = r0.f918I
            r4 = 3
            r0.m1001a((java.util.List<android.view.View>) r3, (int) r4)
            java.util.ArrayList<android.view.View> r3 = r0.f918I
            int r3 = r3.size()
            r7 = 0
        L_0x02a1:
            if (r7 >= r3) goto L_0x02b4
            java.util.ArrayList<android.view.View> r4 = r0.f918I
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m997a(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x02a1
        L_0x02b4:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f918I
            r4 = 5
            r0.m1001a((java.util.List<android.view.View>) r3, (int) r4)
            java.util.ArrayList<android.view.View> r3 = r0.f918I
            int r3 = r3.size()
            r7 = 0
        L_0x02c3:
            if (r7 >= r3) goto L_0x02d4
            java.util.ArrayList<android.view.View> r4 = r0.f918I
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m1004b(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02c3
        L_0x02d4:
            java.util.ArrayList<android.view.View> r3 = r0.f918I
            r4 = 1
            r0.m1001a((java.util.List<android.view.View>) r3, (int) r4)
            java.util.ArrayList<android.view.View> r3 = r0.f918I
            int r3 = r0.m998a((java.util.List<android.view.View>) r3, (int[]) r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02ef
            goto L_0x02f6
        L_0x02ef:
            if (r3 <= r10) goto L_0x02f5
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f6
        L_0x02f5:
            r2 = r6
        L_0x02f6:
            java.util.ArrayList<android.view.View> r3 = r0.f918I
            int r3 = r3.size()
        L_0x02fc:
            if (r1 >= r3) goto L_0x030d
            java.util.ArrayList<android.view.View> r4 = r0.f918I
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m997a(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02fc
        L_0x030d:
            java.util.ArrayList<android.view.View> r1 = r0.f918I
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f920K;
        int i10 = 0;
        if (C0298w0.m1423a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m1007d(this.f933i)) {
            m999a((View) this.f933i, i, 0, i2, 0, this.f944t);
            i5 = this.f933i.getMeasuredWidth() + m994a((View) this.f933i);
            i4 = Math.max(0, this.f933i.getMeasuredHeight() + m1003b((View) this.f933i));
            i3 = View.combineMeasuredStates(0, this.f933i.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1007d(this.f937m)) {
            m999a((View) this.f937m, i, 0, i2, 0, this.f944t);
            i5 = this.f937m.getMeasuredWidth() + m994a((View) this.f937m);
            i4 = Math.max(i4, this.f937m.getMeasuredHeight() + m1003b((View) this.f937m));
            i3 = View.combineMeasuredStates(i3, this.f937m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m1007d(this.f930f)) {
            m999a((View) this.f930f, i, max, i2, 0, this.f944t);
            i6 = this.f930f.getMeasuredWidth() + m994a((View) this.f930f);
            i4 = Math.max(i4, this.f930f.getMeasuredHeight() + m1003b((View) this.f930f));
            i3 = View.combineMeasuredStates(i3, this.f930f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m1007d(this.f938n)) {
            max2 += m996a(this.f938n, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f938n.getMeasuredHeight() + m1003b(this.f938n));
            i3 = View.combineMeasuredStates(i3, this.f938n.getMeasuredState());
        }
        if (m1007d(this.f934j)) {
            max2 += m996a((View) this.f934j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f934j.getMeasuredHeight() + m1003b((View) this.f934j));
            i3 = View.combineMeasuredStates(i3, this.f934j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0217e) childAt.getLayoutParams()).f959b == 0 && m1007d(childAt)) {
                max2 += m996a(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1003b(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f947w + this.f948x;
        int i13 = this.f945u + this.f946v;
        if (m1007d(this.f931g)) {
            m996a((View) this.f931g, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f931g.getMeasuredWidth() + m994a((View) this.f931g);
            i7 = this.f931g.getMeasuredHeight() + m1003b((View) this.f931g);
            i9 = View.combineMeasuredStates(i3, this.f931g.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m1007d(this.f932h)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, m996a((View) this.f932h, i, max2 + i13, i2, i14, iArr));
            i7 += this.f932h.getMeasuredHeight() + m1003b((View) this.f932h);
            i9 = View.combineMeasuredStates(i9, this.f932h.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m1014r()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2480a());
        ActionMenuView actionMenuView = this.f930f;
        C0138g j = actionMenuView != null ? actionMenuView.mo1015j() : null;
        int i = savedState.f951h;
        if (!(i == 0 || this.f925P == null || j == null || (findItem = j.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f952i) {
            m1013q();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m1008l();
        C0257i0 i0Var = this.f949y;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        i0Var.mo1627a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0142i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0216d dVar = this.f925P;
        if (!(dVar == null || (iVar = dVar.f957g) == null)) {
            savedState.f951h = iVar.getItemId();
        }
        savedState.f952i = mo1350i();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f916G = false;
        }
        if (!this.f916G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f916G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f916G = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C4800a.m7936c(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f928S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f910A) {
            this.f910A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f950z) {
            this.f950z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C4800a.m7936c(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C4800a.m7936c(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1012p();
        this.f933i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0218f fVar) {
        this.f921L = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1010n();
        this.f930f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f940p != i) {
            this.f940p = i;
            if (i == 0) {
                this.f939o = getContext();
            } else {
                this.f939o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f948x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f946v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f945u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f947w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0217e extends C0069a.C0070a {

        /* renamed from: b */
        int f959b = 0;

        public C0217e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1397a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0217e(int i, int i2) {
            super(i, i2);
            this.f215a = 8388627;
        }

        public C0217e(C0217e eVar) {
            super((C0069a.C0070a) eVar);
            this.f959b = eVar.f959b;
        }

        public C0217e(C0069a.C0070a aVar) {
            super(aVar);
        }

        public C0217e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo1397a(marginLayoutParams);
        }

        public C0217e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.toolbarStyle);
    }

    /* renamed from: b */
    public void mo1308b(Context context, int i) {
        this.f941q = i;
        TextView textView = this.f931g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public C0217e generateDefaultLayoutParams() {
        return new C0217e(-2, -2);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1313e();
        }
        ImageButton imageButton = this.f937m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1313e();
            this.f937m.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f937m;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f935k);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1009m();
            if (!m1006c((View) this.f934j)) {
                m1000a((View) this.f934j, true);
            }
        } else {
            ImageView imageView = this.f934j;
            if (imageView != null && m1006c((View) imageView)) {
                removeView(this.f934j);
                this.f919J.remove(this.f934j);
            }
        }
        ImageView imageView2 = this.f934j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1009m();
        }
        ImageView imageView = this.f934j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1012p();
        }
        ImageButton imageButton = this.f933i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1012p();
            if (!m1006c((View) this.f933i)) {
                m1000a((View) this.f933i, true);
            }
        } else {
            ImageButton imageButton = this.f933i;
            if (imageButton != null && m1006c((View) imageButton)) {
                removeView(this.f933i);
                this.f919J.remove(this.f933i);
            }
        }
        ImageButton imageButton2 = this.f933i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f932h == null) {
                Context context = getContext();
                C0286t tVar = new C0286t(context);
                this.f932h = tVar;
                tVar.setSingleLine();
                this.f932h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f942r;
                if (i != 0) {
                    this.f932h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f915F;
                if (colorStateList != null) {
                    this.f932h.setTextColor(colorStateList);
                }
            }
            if (!m1006c((View) this.f932h)) {
                m1000a((View) this.f932h, true);
            }
        } else {
            TextView textView = this.f932h;
            if (textView != null && m1006c((View) textView)) {
                removeView(this.f932h);
                this.f919J.remove(this.f932h);
            }
        }
        TextView textView2 = this.f932h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f913D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f915F = colorStateList;
        TextView textView = this.f932h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f931g == null) {
                Context context = getContext();
                C0286t tVar = new C0286t(context);
                this.f931g = tVar;
                tVar.setSingleLine();
                this.f931g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f941q;
                if (i != 0) {
                    this.f931g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f914E;
                if (colorStateList != null) {
                    this.f931g.setTextColor(colorStateList);
                }
            }
            if (!m1006c((View) this.f931g)) {
                m1000a((View) this.f931g, true);
            }
        } else {
            TextView textView = this.f931g;
            if (textView != null && m1006c((View) textView)) {
                removeView(this.f931g);
                this.f919J.remove(this.f931g);
            }
        }
        TextView textView2 = this.f931g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f912C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f914E = colorStateList;
        TextView textView = this.f931g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0212a();

        /* renamed from: h */
        int f951h;

        /* renamed from: i */
        boolean f952i;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        class C0212a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0212a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f951h = parcel.readInt();
            this.f952i = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f951h);
            parcel.writeInt(this.f952i ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0216d implements C0153m {

        /* renamed from: f */
        C0138g f956f;

        /* renamed from: g */
        C0142i f957g;

        C0216d() {
        }

        /* renamed from: a */
        public void mo547a(Context context, C0138g gVar) {
            C0142i iVar;
            C0138g gVar2 = this.f956f;
            if (!(gVar2 == null || (iVar = this.f957g) == null)) {
                gVar2.mo627a(iVar);
            }
            this.f956f = gVar;
        }

        /* renamed from: a */
        public void mo566a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo549a(C0138g gVar, boolean z) {
        }

        /* renamed from: a */
        public void mo551a(C0153m.C0154a aVar) {
        }

        /* renamed from: a */
        public boolean mo556a(C0162r rVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo573b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo558b(C0138g gVar, C0142i iVar) {
            Toolbar.this.mo1313e();
            ViewParent parent = Toolbar.this.f937m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f937m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f937m);
            }
            Toolbar.this.f938n = iVar.getActionView();
            this.f957g = iVar;
            ViewParent parent2 = Toolbar.this.f938n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f938n);
                }
                C0217e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f215a = 8388611 | (toolbar4.f943s & 112);
                generateDefaultLayoutParams.f959b = 2;
                toolbar4.f938n.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f938n);
            }
            Toolbar.this.mo1351j();
            Toolbar.this.requestLayout();
            iVar.mo693a(true);
            View view = Toolbar.this.f938n;
            if (view instanceof C4823c) {
                ((C4823c) view).mo810a();
            }
            return true;
        }

        /* renamed from: c */
        public Parcelable mo574c() {
            return null;
        }

        public int getId() {
            return 0;
        }

        /* renamed from: a */
        public void mo552a(boolean z) {
            if (this.f957g != null) {
                C0138g gVar = this.f956f;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f956f.getItem(i) == this.f957g) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo555a(this.f956f, this.f957g);
                }
            }
        }

        /* renamed from: a */
        public boolean mo555a(C0138g gVar, C0142i iVar) {
            View view = Toolbar.this.f938n;
            if (view instanceof C4823c) {
                ((C4823c) view).mo811b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f938n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f937m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f938n = null;
            toolbar3.mo1302a();
            this.f957g = null;
            Toolbar.this.requestLayout();
            iVar.mo693a(false);
            return true;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f911B = 8388627;
        this.f918I = new ArrayList<>();
        this.f919J = new ArrayList<>();
        this.f920K = new int[2];
        this.f922M = new C0213a();
        this.f929T = new C0214b();
        C0278q0 a = C0278q0.m1271a(getContext(), attributeSet, C4799j.Toolbar, i, 0);
        C5071v.m9157a(this, context, C4799j.Toolbar, attributeSet, a.mo1714a(), i, 0);
        this.f941q = a.mo1729g(C4799j.Toolbar_titleTextAppearance, 0);
        this.f942r = a.mo1729g(C4799j.Toolbar_subtitleTextAppearance, 0);
        this.f911B = a.mo1725e(C4799j.Toolbar_android_gravity, this.f911B);
        this.f943s = a.mo1725e(C4799j.Toolbar_buttonGravity, 48);
        int b = a.mo1718b(C4799j.Toolbar_titleMargin, 0);
        b = a.mo1730g(C4799j.Toolbar_titleMargins) ? a.mo1718b(C4799j.Toolbar_titleMargins, b) : b;
        this.f948x = b;
        this.f947w = b;
        this.f946v = b;
        this.f945u = b;
        int b2 = a.mo1718b(C4799j.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f945u = b2;
        }
        int b3 = a.mo1718b(C4799j.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f946v = b3;
        }
        int b4 = a.mo1718b(C4799j.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f947w = b4;
        }
        int b5 = a.mo1718b(C4799j.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f948x = b5;
        }
        this.f944t = a.mo1721c(C4799j.Toolbar_maxButtonHeight, -1);
        int b6 = a.mo1718b(C4799j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b7 = a.mo1718b(C4799j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c = a.mo1721c(C4799j.Toolbar_contentInsetLeft, 0);
        int c2 = a.mo1721c(C4799j.Toolbar_contentInsetRight, 0);
        m1008l();
        this.f949y.mo1626a(c, c2);
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f949y.mo1629b(b6, b7);
        }
        this.f950z = a.mo1718b(C4799j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f910A = a.mo1718b(C4799j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f935k = a.mo1719b(C4799j.Toolbar_collapseIcon);
        this.f936l = a.mo1726e(C4799j.Toolbar_collapseContentDescription);
        CharSequence e = a.mo1726e(C4799j.Toolbar_title);
        if (!TextUtils.isEmpty(e)) {
            setTitle(e);
        }
        CharSequence e2 = a.mo1726e(C4799j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e2)) {
            setSubtitle(e2);
        }
        this.f939o = getContext();
        setPopupTheme(a.mo1729g(C4799j.Toolbar_popupTheme, 0));
        Drawable b8 = a.mo1719b(C4799j.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence e3 = a.mo1726e(C4799j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e3)) {
            setNavigationContentDescription(e3);
        }
        Drawable b9 = a.mo1719b(C4799j.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence e4 = a.mo1726e(C4799j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e4)) {
            setLogoDescription(e4);
        }
        if (a.mo1730g(C4799j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo1713a(C4799j.Toolbar_titleTextColor));
        }
        if (a.mo1730g(C4799j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo1713a(C4799j.Toolbar_subtitleTextColor));
        }
        if (a.mo1730g(C4799j.Toolbar_menu)) {
            mo1303a(a.mo1729g(C4799j.Toolbar_menu, 0));
        }
        a.mo1720b();
    }

    /* renamed from: d */
    private boolean m1007d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public C0217e generateLayoutParams(AttributeSet attributeSet) {
        return new C0217e(getContext(), attributeSet);
    }

    /* renamed from: c */
    private int m1005c(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f911B & 112;
    }

    /* access modifiers changed from: protected */
    public C0217e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0217e) {
            return new C0217e((C0217e) layoutParams);
        }
        if (layoutParams instanceof C0069a.C0070a) {
            return new C0217e((C0069a.C0070a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0217e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0217e(layoutParams);
    }

    /* renamed from: b */
    private int m1004b(View view, int i, int[] iArr, int i2) {
        C0217e eVar = (C0217e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m995a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: c */
    private boolean m1006c(View view) {
        return view.getParent() == this || this.f919J.contains(view);
    }

    /* renamed from: b */
    private int mo30924b(int i) {
        int p = C5071v.m9204p(this);
        int a = C5019d.m8933a(i, p) & 7;
        if (a == 1 || a == 3 || a == 5) {
            return a;
        }
        return p == 1 ? 5 : 3;
    }

    /* renamed from: b */
    private int m1003b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public void mo1305a(Context context, int i) {
        this.f942r = i;
        TextView textView = this.f932h;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo1303a(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: a */
    public void mo1304a(int i, int i2) {
        m1008l();
        this.f949y.mo1629b(i, i2);
    }

    /* renamed from: a */
    private void m1000a(View view, boolean z) {
        C0217e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (C0217e) layoutParams;
        }
        eVar.f959b = 1;
        if (!z || this.f938n == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.f919J.add(view);
    }

    /* renamed from: a */
    private void m999a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private int m996a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m998a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0217e eVar = (C0217e) view.getLayoutParams();
            int i5 = eVar.leftMargin - i;
            int i6 = eVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: a */
    private int m997a(View view, int i, int[] iArr, int i2) {
        C0217e eVar = (C0217e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m995a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: a */
    private int m995a(View view, int i) {
        C0217e eVar = (C0217e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int c = m1005c(eVar.f215a);
        if (c == 48) {
            return getPaddingTop() - i2;
        }
        if (c == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private void m1001a(List<View> list, int i) {
        boolean z = C5071v.m9204p(this) == 1;
        int childCount = getChildCount();
        int a = C5019d.m8933a(i, C5071v.m9204p(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0217e eVar = (C0217e) childAt.getLayoutParams();
                if (eVar.f959b == 0 && m1007d(childAt) && mo30924b(eVar.f215a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0217e eVar2 = (C0217e) childAt2.getLayoutParams();
            if (eVar2.f959b == 0 && m1007d(childAt2) && mo30924b(eVar2.f215a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private int m994a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C5054g.m9091b(marginLayoutParams) + C5054g.m9089a(marginLayoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1302a() {
        for (int size = this.f919J.size() - 1; size >= 0; size--) {
            addView(this.f919J.get(size));
        }
        this.f919J.clear();
    }

    /* renamed from: a */
    public void mo1307a(C0153m.C0154a aVar, C0138g.C0139a aVar2) {
        this.f926Q = aVar;
        this.f927R = aVar2;
        ActionMenuView actionMenuView = this.f930f;
        if (actionMenuView != null) {
            actionMenuView.mo998a(aVar, aVar2);
        }
    }
}
