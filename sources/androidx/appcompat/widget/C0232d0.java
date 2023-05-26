package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0158p;
import androidx.core.widget.C0435h;
import java.lang.reflect.Method;
import p050l.p051a.C4790a;
import p050l.p051a.C4799j;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.widget.d0 */
/* compiled from: ListPopupWindow */
public class C0232d0 implements C0158p {

    /* renamed from: K */
    private static Method f1014K;

    /* renamed from: L */
    private static Method f1015L;

    /* renamed from: M */
    private static Method f1016M;

    /* renamed from: A */
    private AdapterView.OnItemSelectedListener f1017A;

    /* renamed from: B */
    final C0239g f1018B;

    /* renamed from: C */
    private final C0238f f1019C;

    /* renamed from: D */
    private final C0237e f1020D;

    /* renamed from: E */
    private final C0235c f1021E;

    /* renamed from: F */
    final Handler f1022F;

    /* renamed from: G */
    private final Rect f1023G;

    /* renamed from: H */
    private Rect f1024H;

    /* renamed from: I */
    private boolean f1025I;

    /* renamed from: J */
    PopupWindow f1026J;

    /* renamed from: f */
    private Context f1027f;

    /* renamed from: g */
    private ListAdapter f1028g;

    /* renamed from: h */
    C0302z f1029h;

    /* renamed from: i */
    private int f1030i;

    /* renamed from: j */
    private int f1031j;

    /* renamed from: k */
    private int f1032k;

    /* renamed from: l */
    private int f1033l;

    /* renamed from: m */
    private int f1034m;

    /* renamed from: n */
    private boolean f1035n;

    /* renamed from: o */
    private boolean f1036o;

    /* renamed from: p */
    private boolean f1037p;

    /* renamed from: q */
    private int f1038q;

    /* renamed from: r */
    private boolean f1039r;

    /* renamed from: s */
    private boolean f1040s;

    /* renamed from: t */
    int f1041t;

    /* renamed from: u */
    private View f1042u;

    /* renamed from: v */
    private int f1043v;

    /* renamed from: w */
    private DataSetObserver f1044w;

    /* renamed from: x */
    private View f1045x;

    /* renamed from: y */
    private Drawable f1046y;

    /* renamed from: z */
    private AdapterView.OnItemClickListener f1047z;

    /* renamed from: androidx.appcompat.widget.d0$a */
    /* compiled from: ListPopupWindow */
    class C0233a implements Runnable {
        C0233a() {
        }

        public void run() {
            View h = C0232d0.this.mo1503h();
            if (h != null && h.getWindowToken() != null) {
                C0232d0.this.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$b */
    /* compiled from: ListPopupWindow */
    class C0234b implements AdapterView.OnItemSelectedListener {
        C0234b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0302z zVar;
            if (i != -1 && (zVar = C0232d0.this.f1029h) != null) {
                zVar.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$c */
    /* compiled from: ListPopupWindow */
    private class C0235c implements Runnable {
        C0235c() {
        }

        public void run() {
            C0232d0.this.mo1501g();
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$d */
    /* compiled from: ListPopupWindow */
    private class C0236d extends DataSetObserver {
        C0236d() {
        }

        public void onChanged() {
            if (C0232d0.this.mo570a()) {
                C0232d0.this.show();
            }
        }

        public void onInvalidated() {
            C0232d0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$e */
    /* compiled from: ListPopupWindow */
    private class C0237e implements AbsListView.OnScrollListener {
        C0237e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0232d0.this.mo1512n() && C0232d0.this.f1026J.getContentView() != null) {
                C0232d0 d0Var = C0232d0.this;
                d0Var.f1022F.removeCallbacks(d0Var.f1018B);
                C0232d0.this.f1018B.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$f */
    /* compiled from: ListPopupWindow */
    private class C0238f implements View.OnTouchListener {
        C0238f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0232d0.this.f1026J) != null && popupWindow.isShowing() && x >= 0 && x < C0232d0.this.f1026J.getWidth() && y >= 0 && y < C0232d0.this.f1026J.getHeight()) {
                C0232d0 d0Var = C0232d0.this;
                d0Var.f1022F.postDelayed(d0Var.f1018B, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0232d0 d0Var2 = C0232d0.this;
                d0Var2.f1022F.removeCallbacks(d0Var2.f1018B);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$g */
    /* compiled from: ListPopupWindow */
    private class C0239g implements Runnable {
        C0239g() {
        }

        public void run() {
            C0302z zVar = C0232d0.this.f1029h;
            if (zVar != null && C5071v.m9139D(zVar) && C0232d0.this.f1029h.getCount() > C0232d0.this.f1029h.getChildCount()) {
                int childCount = C0232d0.this.f1029h.getChildCount();
                C0232d0 d0Var = C0232d0.this;
                if (childCount <= d0Var.f1041t) {
                    d0Var.f1026J.setInputMethodMode(2);
                    C0232d0.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1014K = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1016M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1015L = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0232d0(Context context) {
        this(context, (AttributeSet) null, C4790a.listPopupWindowStyle);
    }

    /* renamed from: c */
    private void mo1539c(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1014K;
            if (method != null) {
                try {
                    method.invoke(this.f1026J, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1026J.setIsClippedToScreen(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo1136p() {
        /*
            r12 = this;
            androidx.appcompat.widget.z r0 = r12.f1029h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bd
            android.content.Context r0 = r12.f1027f
            androidx.appcompat.widget.d0$a r5 = new androidx.appcompat.widget.d0$a
            r5.<init>()
            boolean r5 = r12.f1025I
            r5 = r5 ^ r3
            androidx.appcompat.widget.z r5 = r12.mo1485a(r0, r5)
            r12.f1029h = r5
            android.graphics.drawable.Drawable r6 = r12.f1046y
            if (r6 == 0) goto L_0x0020
            r5.setSelector(r6)
        L_0x0020:
            androidx.appcompat.widget.z r5 = r12.f1029h
            android.widget.ListAdapter r6 = r12.f1028g
            r5.setAdapter(r6)
            androidx.appcompat.widget.z r5 = r12.f1029h
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1047z
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.z r5 = r12.f1029h
            r5.setFocusable(r3)
            androidx.appcompat.widget.z r5 = r12.f1029h
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.z r5 = r12.f1029h
            androidx.appcompat.widget.d0$b r6 = new androidx.appcompat.widget.d0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.z r5 = r12.f1029h
            androidx.appcompat.widget.d0$e r6 = r12.f1020D
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1017A
            if (r5 == 0) goto L_0x0052
            androidx.appcompat.widget.z r6 = r12.f1029h
            r6.setOnItemSelectedListener(r5)
        L_0x0052:
            androidx.appcompat.widget.z r5 = r12.f1029h
            android.view.View r6 = r12.f1042u
            if (r6 == 0) goto L_0x00b6
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1043v
            if (r8 == 0) goto L_0x008d
            if (r8 == r3) goto L_0x0086
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1043v
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0093
        L_0x0086:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0093
        L_0x008d:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0093:
            int r0 = r12.f1031j
            if (r0 < 0) goto L_0x009a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009c
        L_0x009a:
            r0 = 0
            r5 = 0
        L_0x009c:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            android.widget.PopupWindow r6 = r12.f1026J
            r6.setContentView(r5)
            goto L_0x00db
        L_0x00bd:
            android.widget.PopupWindow r0 = r12.f1026J
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1042u
            if (r0 == 0) goto L_0x00da
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            android.widget.PopupWindow r5 = r12.f1026J
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f7
            android.graphics.Rect r6 = r12.f1023G
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1023G
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1035n
            if (r7 != 0) goto L_0x00fd
            int r6 = -r6
            r12.f1033l = r6
            goto L_0x00fd
        L_0x00f7:
            android.graphics.Rect r5 = r12.f1023G
            r5.setEmpty()
            r5 = 0
        L_0x00fd:
            android.widget.PopupWindow r6 = r12.f1026J
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r3 = 0
        L_0x0108:
            android.view.View r4 = r12.mo1503h()
            int r6 = r12.f1033l
            int r3 = r12.m1092a(r4, r6, r3)
            boolean r4 = r12.f1039r
            if (r4 != 0) goto L_0x0179
            int r4 = r12.f1030i
            if (r4 != r2) goto L_0x011b
            goto L_0x0179
        L_0x011b:
            int r4 = r12.f1031j
            r6 = -2
            if (r4 == r6) goto L_0x0142
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0129
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x015a
        L_0x0129:
            android.content.Context r2 = r12.f1027f
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1023G
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x015a
        L_0x0142:
            android.content.Context r2 = r12.f1027f
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1023G
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x015a:
            r7 = r1
            androidx.appcompat.widget.z r6 = r12.f1029h
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo1864a(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0177
            androidx.appcompat.widget.z r2 = r12.f1029h
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.z r3 = r12.f1029h
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0177:
            int r1 = r1 + r0
            return r1
        L_0x0179:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0232d0.mo1136p():int");
    }

    /* renamed from: q */
    private void mo1137q() {
        View view = this.f1042u;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1042u);
            }
        }
    }

    /* renamed from: a */
    public void mo1111a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1044w;
        if (dataSetObserver == null) {
            this.f1044w = new C0236d();
        } else {
            ListAdapter listAdapter2 = this.f1028g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1028g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1044w);
        }
        C0302z zVar = this.f1029h;
        if (zVar != null) {
            zVar.setAdapter(this.f1028g);
        }
    }

    /* renamed from: b */
    public int mo1493b() {
        return this.f1032k;
    }

    /* renamed from: d */
    public Drawable mo1496d() {
        return this.f1026J.getBackground();
    }

    public void dismiss() {
        this.f1026J.dismiss();
        mo1137q();
        this.f1026J.setContentView((View) null);
        this.f1029h = null;
        this.f1022F.removeCallbacks(this.f1018B);
    }

    /* renamed from: e */
    public void mo1498e(int i) {
        Drawable background = this.f1026J.getBackground();
        if (background != null) {
            background.getPadding(this.f1023G);
            Rect rect = this.f1023G;
            this.f1031j = rect.left + rect.right + i;
            return;
        }
        mo1508j(i);
    }

    /* renamed from: f */
    public int mo1499f() {
        if (!this.f1035n) {
            return 0;
        }
        return this.f1033l;
    }

    /* renamed from: g */
    public void mo1502g(int i) {
        this.f1026J.setInputMethodMode(i);
    }

    /* renamed from: h */
    public void mo1504h(int i) {
        this.f1043v = i;
    }

    /* renamed from: i */
    public void mo1506i(int i) {
        C0302z zVar = this.f1029h;
        if (mo570a() && zVar != null) {
            zVar.setListSelectionHidden(false);
            zVar.setSelection(i);
            if (zVar.getChoiceMode() != 0) {
                zVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: j */
    public void mo1508j(int i) {
        this.f1031j = i;
    }

    /* renamed from: k */
    public int mo1509k() {
        if (!mo570a()) {
            return -1;
        }
        return this.f1029h.getSelectedItemPosition();
    }

    /* renamed from: l */
    public View mo1510l() {
        if (!mo570a()) {
            return null;
        }
        return this.f1029h.getSelectedView();
    }

    /* renamed from: m */
    public int mo1511m() {
        return this.f1031j;
    }

    /* renamed from: n */
    public boolean mo1512n() {
        return this.f1026J.getInputMethodMode() == 2;
    }

    /* renamed from: o */
    public boolean mo1513o() {
        return this.f1025I;
    }

    public void show() {
        int p = mo1136p();
        boolean n = mo1512n();
        C0435h.m2141a(this.f1026J, this.f1034m);
        boolean z = true;
        if (!this.f1026J.isShowing()) {
            int i = this.f1031j;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1503h().getWidth();
            }
            int i2 = this.f1030i;
            if (i2 == -1) {
                p = -1;
            } else if (i2 != -2) {
                p = i2;
            }
            this.f1026J.setWidth(i);
            this.f1026J.setHeight(p);
            mo1539c(true);
            this.f1026J.setOutsideTouchable(!this.f1040s && !this.f1039r);
            this.f1026J.setTouchInterceptor(this.f1019C);
            if (this.f1037p) {
                C0435h.m2143a(this.f1026J, this.f1036o);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1016M;
                if (method != null) {
                    try {
                        method.invoke(this.f1026J, new Object[]{this.f1024H});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f1026J.setEpicenterBounds(this.f1024H);
            }
            C0435h.m2142a(this.f1026J, mo1503h(), this.f1032k, this.f1033l, this.f1038q);
            this.f1029h.setSelection(-1);
            if (!this.f1025I || this.f1029h.isInTouchMode()) {
                mo1501g();
            }
            if (!this.f1025I) {
                this.f1022F.post(this.f1021E);
            }
        } else if (C5071v.m9139D(mo1503h())) {
            int i3 = this.f1031j;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1503h().getWidth();
            }
            int i4 = this.f1030i;
            if (i4 == -1) {
                if (!n) {
                    p = -1;
                }
                if (n) {
                    this.f1026J.setWidth(this.f1031j == -1 ? -1 : 0);
                    this.f1026J.setHeight(0);
                } else {
                    this.f1026J.setWidth(this.f1031j == -1 ? -1 : 0);
                    this.f1026J.setHeight(-1);
                }
            } else if (i4 != -2) {
                p = i4;
            }
            PopupWindow popupWindow = this.f1026J;
            if (this.f1040s || this.f1039r) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1026J.update(mo1503h(), this.f1032k, this.f1033l, i3 < 0 ? -1 : i3, p < 0 ? -1 : p);
        }
    }

    public C0232d0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: b */
    public void mo1494b(int i) {
        this.f1033l = i;
        this.f1035n = true;
    }

    /* renamed from: d */
    public void mo1497d(int i) {
        this.f1026J.setAnimationStyle(i);
    }

    /* renamed from: g */
    public void mo1501g() {
        C0302z zVar = this.f1029h;
        if (zVar != null) {
            zVar.setListSelectionHidden(true);
            zVar.requestLayout();
        }
    }

    /* renamed from: h */
    public View mo1503h() {
        return this.f1045x;
    }

    /* renamed from: j */
    public long mo1507j() {
        if (!mo570a()) {
            return Long.MIN_VALUE;
        }
        return this.f1029h.getSelectedItemId();
    }

    public C0232d0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1030i = -2;
        this.f1031j = -2;
        this.f1034m = 1002;
        this.f1038q = 0;
        this.f1039r = false;
        this.f1040s = false;
        this.f1041t = Integer.MAX_VALUE;
        this.f1043v = 0;
        this.f1018B = new C0239g();
        this.f1019C = new C0238f();
        this.f1020D = new C0237e();
        this.f1021E = new C0235c();
        this.f1023G = new Rect();
        this.f1027f = context;
        this.f1022F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4799j.ListPopupWindow, i, i2);
        this.f1032k = obtainStyledAttributes.getDimensionPixelOffset(C4799j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C4799j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1033l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1035n = true;
        }
        obtainStyledAttributes.recycle();
        C0271n nVar = new C0271n(context, attributeSet, i, i2);
        this.f1026J = nVar;
        nVar.setInputMethodMode(1);
    }

    /* renamed from: f */
    public void mo1500f(int i) {
        this.f1038q = i;
    }

    /* renamed from: b */
    public void mo1495b(boolean z) {
        this.f1037p = true;
        this.f1036o = z;
    }

    /* renamed from: e */
    public ListView mo579e() {
        return this.f1029h;
    }

    /* renamed from: i */
    public Object mo1505i() {
        if (!mo570a()) {
            return null;
        }
        return this.f1029h.getSelectedItem();
    }

    /* renamed from: a */
    public void mo1492a(boolean z) {
        this.f1025I = z;
        this.f1026J.setFocusable(z);
    }

    /* renamed from: a */
    public void mo1488a(Drawable drawable) {
        this.f1026J.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo1489a(View view) {
        this.f1045x = view;
    }

    /* renamed from: a */
    public void mo1486a(int i) {
        this.f1032k = i;
    }

    /* renamed from: a */
    public void mo1487a(Rect rect) {
        this.f1024H = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: a */
    public void mo1490a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1047z = onItemClickListener;
    }

    /* renamed from: a */
    public void mo1491a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1026J.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public boolean mo570a() {
        return this.f1026J.isShowing();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0302z mo1485a(Context context, boolean z) {
        return new C0302z(context, z);
    }

    /* renamed from: a */
    private int m1092a(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f1026J.getMaxAvailableHeight(view, i, z);
        }
        Method method = f1015L;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1026J, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1026J.getMaxAvailableHeight(view, i);
    }
}
