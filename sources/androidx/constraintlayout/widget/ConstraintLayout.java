package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4910f;
import p050l.p067f.p071b.p072k.C4911g;
import p050l.p067f.p071b.p072k.C4915j;
import p050l.p067f.p071b.p072k.C4916k;
import p050l.p067f.p071b.p072k.p073m.C4919b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: f */
    SparseArray<View> f1331f = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<C0323b> f1332g = new ArrayList<>(4);

    /* renamed from: h */
    protected C4910f f1333h = new C4910f();

    /* renamed from: i */
    private int f1334i = 0;

    /* renamed from: j */
    private int f1335j = 0;

    /* renamed from: k */
    private int f1336k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f1337l = Integer.MAX_VALUE;

    /* renamed from: m */
    protected boolean f1338m = true;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f1339n = 257;

    /* renamed from: o */
    private C0327d f1340o = null;

    /* renamed from: p */
    protected C0324c f1341p = null;

    /* renamed from: q */
    private int f1342q = -1;

    /* renamed from: r */
    private HashMap<String, Integer> f1343r = new HashMap<>();

    /* renamed from: s */
    private int f1344s = -1;

    /* renamed from: t */
    private int f1345t = -1;

    /* renamed from: u */
    private SparseArray<C4907e> f1346u = new SparseArray<>();

    /* renamed from: v */
    C0319c f1347v = new C0319c(this);

    /* renamed from: w */
    private int f1348w = 0;

    /* renamed from: x */
    private int f1349x = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0316a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1350a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                l.f.b.k.e$b[] r0 = p050l.p067f.p071b.p072k.C4907e.C4909b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1350a = r0
                l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1350a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1350a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1350a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0316a.<clinit>():void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m1572a((AttributeSet) null, 0, 0);
    }

    /* renamed from: c */
    private void m1576c() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C4907e a = mo1978a(getChildAt(i));
            if (a != null) {
                a.mo17191P();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo1980a(0, (Object) resourceName, (Object) Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m1575c(childAt.getId()).mo17201a(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1342q != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f1342q && (childAt2 instanceof C0333e)) {
                    this.f1340o = ((C0333e) childAt2).getConstraintSet();
                }
            }
        }
        C0327d dVar = this.f1340o;
        if (dVar != null) {
            dVar.mo2049a(this, true);
        }
        this.f1333h.mo17310T();
        int size = this.f1332g.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f1332g.get(i4).mo2034e(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C0336g) {
                ((C0336g) childAt3).mo2069b(this);
            }
        }
        this.f1346u.clear();
        this.f1346u.put(0, this.f1333h);
        this.f1346u.put(getId(), this.f1333h);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f1346u.put(childAt4.getId(), mo1978a(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C4907e a2 = mo1978a(childAt5);
            if (a2 != null) {
                this.f1333h.mo17311a(a2);
                mo1983a(isInEditMode, childAt5, a2, (C0317b) childAt5.getLayoutParams(), this.f1346u);
            }
        }
    }

    /* renamed from: d */
    private boolean m1577d() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m1576c();
        }
        return z;
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0317b;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<C0323b> arrayList = this.f1332g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f1332g.get(i).mo2033d(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    public void forceLayout() {
        m1574b();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f1337l;
    }

    public int getMaxWidth() {
        return this.f1336k;
    }

    public int getMinHeight() {
        return this.f1335j;
    }

    public int getMinWidth() {
        return this.f1334i;
    }

    public int getOptimizationLevel() {
        return this.f1333h.mo17274V();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0317b bVar = (C0317b) childAt.getLayoutParams();
            C4907e eVar = bVar.f1402m0;
            if ((childAt.getVisibility() != 8 || bVar.f1375Y || bVar.f1376Z || bVar.f1380b0 || isInEditMode) && !bVar.f1378a0) {
                int D = eVar.mo17181D();
                int E = eVar.mo17182E();
                int C = eVar.mo17180C() + D;
                int k = eVar.mo17244k() + E;
                childAt.layout(D, E, C, k);
                if ((childAt instanceof C0336g) && (content = ((C0336g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(D, E, C, k);
                }
            }
        }
        int size = this.f1332g.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f1332g.get(i6).mo2018b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f1338m) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.f1338m = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!this.f1338m) {
            if (this.f1348w == i && this.f1349x == i2) {
                mo1979a(i, i2, this.f1333h.mo17180C(), this.f1333h.mo17244k(), this.f1333h.mo17288b0(), this.f1333h.mo17278Z());
                return;
            } else if (this.f1348w == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f1349x) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.f1333h.mo17244k()) {
                this.f1348w = i;
                this.f1349x = i2;
                mo1979a(i, i2, this.f1333h.mo17180C(), this.f1333h.mo17244k(), this.f1333h.mo17288b0(), this.f1333h.mo17278Z());
                return;
            }
        }
        this.f1348w = i;
        this.f1349x = i2;
        this.f1333h.mo17294g(mo1984a());
        if (this.f1338m) {
            this.f1338m = false;
            if (m1577d()) {
                this.f1333h.mo17290c0();
            }
        }
        mo1981a(this.f1333h, this.f1339n, i, i2);
        mo1979a(i, i2, this.f1333h.mo17180C(), this.f1333h.mo17244k(), this.f1333h.mo17288b0(), this.f1333h.mo17278Z());
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C4907e a = mo1978a(view);
        if ((view instanceof Guideline) && !(a instanceof C4911g)) {
            C0317b bVar = (C0317b) view.getLayoutParams();
            C4911g gVar = new C4911g();
            bVar.f1402m0 = gVar;
            bVar.f1375Y = true;
            gVar.mo17304z(bVar.f1368R);
        }
        if (view instanceof C0323b) {
            C0323b bVar2 = (C0323b) view;
            bVar2.mo2031b();
            ((C0317b) view.getLayoutParams()).f1376Z = true;
            if (!this.f1332g.contains(bVar2)) {
                this.f1332g.add(bVar2);
            }
        }
        this.f1331f.put(view.getId(), view);
        this.f1338m = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1331f.remove(view.getId());
        this.f1333h.mo17312c(mo1978a(view));
        this.f1332g.remove(view);
        this.f1338m = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        m1574b();
        super.requestLayout();
    }

    public void setConstraintSet(C0327d dVar) {
        this.f1340o = dVar;
    }

    public void setId(int i) {
        this.f1331f.remove(getId());
        super.setId(i);
        this.f1331f.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1337l) {
            this.f1337l = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1336k) {
            this.f1336k = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1335j) {
            this.f1335j = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1334i) {
            this.f1334i = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0335f fVar) {
        C0324c cVar = this.f1341p;
        if (cVar != null) {
            cVar.mo2042a(fVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1339n = i;
        this.f1333h.mo17296x(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    public void mo1980a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1343r == null) {
                this.f1343r = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1343r.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1986b(int i) {
        this.f1341p = new C0324c(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    public C0317b generateDefaultLayoutParams() {
        return new C0317b(-2, -2);
    }

    public C0317b generateLayoutParams(AttributeSet attributeSet) {
        return new C0317b(getContext(), attributeSet);
    }

    /* renamed from: b */
    private void m1574b() {
        this.f1338m = true;
        this.f1344s = -1;
        this.f1345t = -1;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0317b(layoutParams);
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0319c implements C4919b.C4921b {

        /* renamed from: a */
        ConstraintLayout f1418a;

        /* renamed from: b */
        int f1419b;

        /* renamed from: c */
        int f1420c;

        /* renamed from: d */
        int f1421d;

        /* renamed from: e */
        int f1422e;

        /* renamed from: f */
        int f1423f;

        /* renamed from: g */
        int f1424g;

        public C0319c(ConstraintLayout constraintLayout) {
            this.f1418a = constraintLayout;
        }

        /* renamed from: a */
        public void mo2016a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f1419b = i3;
            this.f1420c = i4;
            this.f1421d = i5;
            this.f1422e = i6;
            this.f1423f = i;
            this.f1424g = i2;
        }

        @SuppressLint({"WrongCall"})
        /* renamed from: a */
        public final void mo2017a(C4907e eVar, C4919b.C4920a aVar) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            C4907e eVar2 = eVar;
            C4919b.C4920a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar.mo17179B() == 8 && !eVar.mo17186I()) {
                    aVar2.f8674e = 0;
                    aVar2.f8675f = 0;
                    aVar2.f8676g = 0;
                } else if (eVar.mo17266v() != null) {
                    C4907e.C4909b bVar = aVar2.f8670a;
                    C4907e.C4909b bVar2 = aVar2.f8671b;
                    int i8 = aVar2.f8672c;
                    int i9 = aVar2.f8673d;
                    int i10 = this.f1419b + this.f1420c;
                    int i11 = this.f1421d;
                    View view = (View) eVar.mo17236g();
                    int i12 = C0316a.f1350a[bVar.ordinal()];
                    if (i12 == 1) {
                        i = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    } else if (i12 == 2) {
                        i = ViewGroup.getChildMeasureSpec(this.f1423f, i11, -2);
                    } else if (i12 == 3) {
                        i = ViewGroup.getChildMeasureSpec(this.f1423f, i11 + eVar.mo17252o(), -1);
                    } else if (i12 != 4) {
                        i = 0;
                    } else {
                        i = ViewGroup.getChildMeasureSpec(this.f1423f, i11, -2);
                        boolean z = eVar2.f8611n == 1;
                        int i13 = aVar2.f8679j;
                        if (i13 == C4919b.C4920a.f8668l || i13 == C4919b.C4920a.f8669m) {
                            if (aVar2.f8679j == C4919b.C4920a.f8669m || !z || (z && (view.getMeasuredHeight() == eVar.mo17244k())) || (view instanceof C0336g) || eVar.mo17143M()) {
                                i = View.MeasureSpec.makeMeasureSpec(eVar.mo17180C(), 1073741824);
                            }
                        }
                    }
                    int i14 = C0316a.f1350a[bVar2.ordinal()];
                    if (i14 == 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    } else if (i14 == 2) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f1424g, i10, -2);
                    } else if (i14 == 3) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f1424g, i10 + eVar.mo17178A(), -1);
                    } else if (i14 != 4) {
                        i2 = 0;
                    } else {
                        i2 = ViewGroup.getChildMeasureSpec(this.f1424g, i10, -2);
                        boolean z2 = eVar2.f8613o == 1;
                        int i15 = aVar2.f8679j;
                        if (i15 == C4919b.C4920a.f8668l || i15 == C4919b.C4920a.f8669m) {
                            if (aVar2.f8679j == C4919b.C4920a.f8669m || !z2 || (z2 && (view.getMeasuredWidth() == eVar.mo17180C())) || (view instanceof C0336g) || eVar.mo17144N()) {
                                i2 = View.MeasureSpec.makeMeasureSpec(eVar.mo17244k(), 1073741824);
                            }
                        }
                    }
                    C4910f fVar = (C4910f) eVar.mo17266v();
                    if (fVar != null && C4915j.m8580a(ConstraintLayout.this.f1339n, 256) && view.getMeasuredWidth() == eVar.mo17180C() && view.getMeasuredWidth() < fVar.mo17180C() && view.getMeasuredHeight() == eVar.mo17244k() && view.getMeasuredHeight() < fVar.mo17244k() && view.getBaseline() == eVar.mo17230e() && !eVar.mo17189L()) {
                        if (m1589a(eVar.mo17254p(), i, eVar.mo17180C()) && m1589a(eVar.mo17256q(), i2, eVar.mo17244k())) {
                            aVar2.f8674e = eVar.mo17180C();
                            aVar2.f8675f = eVar.mo17244k();
                            aVar2.f8676g = eVar.mo17230e();
                            return;
                        }
                    }
                    boolean z3 = bVar == C4907e.C4909b.MATCH_CONSTRAINT;
                    boolean z4 = bVar2 == C4907e.C4909b.MATCH_CONSTRAINT;
                    boolean z5 = bVar2 == C4907e.C4909b.MATCH_PARENT || bVar2 == C4907e.C4909b.FIXED;
                    boolean z6 = bVar == C4907e.C4909b.MATCH_PARENT || bVar == C4907e.C4909b.FIXED;
                    boolean z7 = z3 && eVar2.f8579U > 0.0f;
                    boolean z8 = z4 && eVar2.f8579U > 0.0f;
                    if (view != null) {
                        C0317b bVar3 = (C0317b) view.getLayoutParams();
                        int i16 = aVar2.f8679j;
                        if (i16 == C4919b.C4920a.f8668l || i16 == C4919b.C4920a.f8669m || !z3 || eVar2.f8611n != 0 || !z4 || eVar2.f8613o != 0) {
                            if (!(view instanceof C0339j) || !(eVar2 instanceof C4916k)) {
                                view.measure(i, i2);
                            } else {
                                ((C0339j) view).mo2075a((C4916k) eVar2, i, i2);
                            }
                            eVar2.mo17228d(i, i2);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i5 = view.getBaseline();
                            int i17 = eVar2.f8615q;
                            i4 = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                            int i18 = eVar2.f8616r;
                            if (i18 > 0) {
                                i4 = Math.min(i18, i4);
                            }
                            int i19 = eVar2.f8618t;
                            if (i19 > 0) {
                                i3 = Math.max(i19, measuredHeight);
                                i7 = i2;
                            } else {
                                i7 = i2;
                                i3 = measuredHeight;
                            }
                            int i20 = eVar2.f8619u;
                            if (i20 > 0) {
                                i3 = Math.min(i20, i3);
                            }
                            if (!C4915j.m8580a(ConstraintLayout.this.f1339n, 1)) {
                                if (z7 && z5) {
                                    i4 = (int) ((((float) i3) * eVar2.f8579U) + 0.5f);
                                } else if (z8 && z6) {
                                    i3 = (int) ((((float) i4) / eVar2.f8579U) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i4 && measuredHeight == i3)) {
                                if (measuredWidth != i4) {
                                    i = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                }
                                int makeMeasureSpec = measuredHeight != i3 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : i7;
                                view.measure(i, makeMeasureSpec);
                                eVar2.mo17228d(i, makeMeasureSpec);
                                i4 = view.getMeasuredWidth();
                                i3 = view.getMeasuredHeight();
                                i5 = view.getBaseline();
                            }
                            i6 = -1;
                        } else {
                            i6 = -1;
                            i5 = 0;
                            i4 = 0;
                            i3 = 0;
                        }
                        boolean z9 = i5 != i6;
                        aVar2.f8678i = (i4 == aVar2.f8672c && i3 == aVar2.f8673d) ? false : true;
                        if (bVar3.f1374X) {
                            z9 = true;
                        }
                        if (!(!z9 || i5 == -1 || eVar.mo17230e() == i5)) {
                            aVar2.f8678i = true;
                        }
                        aVar2.f8674e = i4;
                        aVar2.f8675f = i3;
                        aVar2.f8677h = z9;
                        aVar2.f8676g = i5;
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m1589a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo2015a() {
            int childCount = this.f1418a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1418a.getChildAt(i);
                if (childAt instanceof C0336g) {
                    ((C0336g) childAt).mo2068a(this.f1418a);
                }
            }
            int size = this.f1418a.f1332g.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0323b) this.f1418a.f1332g.get(i2)).mo2032c(this.f1418a);
                }
            }
        }
    }

    /* renamed from: a */
    public Object mo1977a(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1343r;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1343r.get(str);
    }

    /* renamed from: a */
    private void m1572a(AttributeSet attributeSet, int i, int i2) {
        this.f1333h.mo17200a((Object) this);
        this.f1333h.mo17283a((C4919b.C4921b) this.f1347v);
        this.f1331f.put(getId(), this);
        this.f1340o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0338i.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0338i.ConstraintLayout_Layout_android_minWidth) {
                    this.f1334i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1334i);
                } else if (index == C0338i.ConstraintLayout_Layout_android_minHeight) {
                    this.f1335j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1335j);
                } else if (index == C0338i.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1336k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1336k);
                } else if (index == C0338i.ConstraintLayout_Layout_android_maxHeight) {
                    this.f1337l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1337l);
                } else if (index == C0338i.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f1339n = obtainStyledAttributes.getInt(index, this.f1339n);
                } else if (index == C0338i.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1986b(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1341p = null;
                        }
                    }
                } else if (index == C0338i.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0327d dVar = new C0327d();
                        this.f1340o = dVar;
                        dVar.mo2051b(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1340o = null;
                    }
                    this.f1342q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1333h.mo17296x(this.f1339n);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1572a(attributeSet, 0, 0);
    }

    /* renamed from: c */
    private final C4907e m1575c(int i) {
        if (i == 0) {
            return this.f1333h;
        }
        View view = this.f1331f.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1333h;
        }
        if (view == null) {
            return null;
        }
        return ((C0317b) view.getLayoutParams()).f1402m0;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1572a(attributeSet, i, 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1983a(boolean r20, android.view.View r21, p050l.p067f.p071b.p072k.C4907e r22, androidx.constraintlayout.widget.ConstraintLayout.C0317b r23, android.util.SparseArray<p050l.p067f.p071b.p072k.C4907e> r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r23.mo2013a()
            r10 = 0
            r8.f1404n0 = r10
            int r2 = r21.getVisibility()
            r7.mo17261s(r2)
            boolean r2 = r8.f1378a0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.mo17219b((boolean) r11)
            r2 = 8
            r7.mo17261s(r2)
        L_0x0024:
            r7.mo17200a((java.lang.Object) r1)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.C0323b
            if (r2 == 0) goto L_0x0036
            androidx.constraintlayout.widget.b r1 = (androidx.constraintlayout.widget.C0323b) r1
            l.f.b.k.f r2 = r0.f1333h
            boolean r2 = r2.mo17285a0()
            r1.mo1968a((p050l.p067f.p071b.p072k.C4907e) r7, (boolean) r2)
        L_0x0036:
            boolean r1 = r8.f1375Y
            r2 = 17
            r12 = -1
            if (r1 == 0) goto L_0x0069
            r1 = r7
            l.f.b.k.g r1 = (p050l.p067f.p071b.p072k.C4911g) r1
            int r3 = r8.f1396j0
            int r4 = r8.f1398k0
            float r5 = r8.f1400l0
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r2) goto L_0x0050
            int r3 = r8.f1377a
            int r4 = r8.f1379b
            float r5 = r8.f1381c
        L_0x0050:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x005b
            r1.mo17301e(r5)
            goto L_0x02d1
        L_0x005b:
            if (r3 == r12) goto L_0x0062
            r1.mo17302x(r3)
            goto L_0x02d1
        L_0x0062:
            if (r4 == r12) goto L_0x02d1
            r1.mo17303y(r4)
            goto L_0x02d1
        L_0x0069:
            int r1 = r8.f1382c0
            int r3 = r8.f1384d0
            int r4 = r8.f1386e0
            int r5 = r8.f1388f0
            int r6 = r8.f1390g0
            int r13 = r8.f1392h0
            float r14 = r8.f1394i0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r2) goto L_0x00b1
            int r1 = r8.f1383d
            int r2 = r8.f1385e
            int r4 = r8.f1387f
            int r5 = r8.f1389g
            int r3 = r8.f1410t
            int r6 = r8.f1412v
            float r14 = r8.f1416z
            if (r1 != r12) goto L_0x0098
            if (r2 != r12) goto L_0x0098
            int r13 = r8.f1407q
            if (r13 == r12) goto L_0x0093
            r1 = r13
            goto L_0x0098
        L_0x0093:
            int r13 = r8.f1406p
            if (r13 == r12) goto L_0x0098
            r2 = r13
        L_0x0098:
            if (r4 != r12) goto L_0x00ac
            if (r5 != r12) goto L_0x00ac
            int r13 = r8.f1408r
            if (r13 == r12) goto L_0x00a1
            goto L_0x00ad
        L_0x00a1:
            int r13 = r8.f1409s
            if (r13 == r12) goto L_0x00ac
            r15 = r6
            r5 = r14
            r6 = r3
            r14 = r13
            r3 = r2
            r13 = r4
            goto L_0x00b8
        L_0x00ac:
            r13 = r4
        L_0x00ad:
            r15 = r6
            r6 = r3
            r3 = r2
            goto L_0x00b3
        L_0x00b1:
            r15 = r13
            r13 = r4
        L_0x00b3:
            r18 = r14
            r14 = r5
            r5 = r18
        L_0x00b8:
            int r2 = r8.f1401m
            if (r2 == r12) goto L_0x00cd
            java.lang.Object r1 = r9.get(r2)
            l.f.b.k.e r1 = (p050l.p067f.p071b.p072k.C4907e) r1
            if (r1 == 0) goto L_0x0200
            float r2 = r8.f1405o
            int r3 = r8.f1403n
            r7.mo17206a(r1, r2, r3)
            goto L_0x0200
        L_0x00cd:
            if (r1 == r12) goto L_0x00ec
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            l.f.b.k.e r3 = (p050l.p067f.p071b.p072k.C4907e) r3
            if (r3 == 0) goto L_0x00e9
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.LEFT
            int r2 = r8.leftMargin
            r1 = r22
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            r1.mo17204a((p050l.p067f.p071b.p072k.C4904d.C4906b) r2, (p050l.p067f.p071b.p072k.C4907e) r3, (p050l.p067f.p071b.p072k.C4904d.C4906b) r4, (int) r5, (int) r6)
            goto L_0x0104
        L_0x00e9:
            r17 = r5
            goto L_0x0104
        L_0x00ec:
            r17 = r5
            if (r3 == r12) goto L_0x0104
            java.lang.Object r1 = r9.get(r3)
            r3 = r1
            l.f.b.k.e r3 = (p050l.p067f.p071b.p072k.C4907e) r3
            if (r3 == 0) goto L_0x0104
            l.f.b.k.d$b r2 = p050l.p067f.p071b.p072k.C4904d.C4906b.LEFT
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.RIGHT
            int r5 = r8.leftMargin
            r1 = r22
            r1.mo17204a((p050l.p067f.p071b.p072k.C4904d.C4906b) r2, (p050l.p067f.p071b.p072k.C4907e) r3, (p050l.p067f.p071b.p072k.C4904d.C4906b) r4, (int) r5, (int) r6)
        L_0x0104:
            if (r13 == r12) goto L_0x011c
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            l.f.b.k.e r3 = (p050l.p067f.p071b.p072k.C4907e) r3
            if (r3 == 0) goto L_0x0132
            l.f.b.k.d$b r2 = p050l.p067f.p071b.p072k.C4904d.C4906b.RIGHT
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.LEFT
            int r5 = r8.rightMargin
            r1 = r22
            r6 = r15
            r1.mo17204a((p050l.p067f.p071b.p072k.C4904d.C4906b) r2, (p050l.p067f.p071b.p072k.C4907e) r3, (p050l.p067f.p071b.p072k.C4904d.C4906b) r4, (int) r5, (int) r6)
            goto L_0x0132
        L_0x011c:
            if (r14 == r12) goto L_0x0132
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            l.f.b.k.e r3 = (p050l.p067f.p071b.p072k.C4907e) r3
            if (r3 == 0) goto L_0x0132
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.RIGHT
            int r5 = r8.rightMargin
            r1 = r22
            r2 = r4
            r6 = r15
            r1.mo17204a((p050l.p067f.p071b.p072k.C4904d.C4906b) r2, (p050l.p067f.p071b.p072k.C4907e) r3, (p050l.p067f.p071b.p072k.C4904d.C4906b) r4, (int) r5, (int) r6)
        L_0x0132:
            int r1 = r8.f1391h
            if (r1 == r12) goto L_0x014c
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            l.f.b.k.e r3 = (p050l.p067f.p071b.p072k.C4907e) r3
            if (r3 == 0) goto L_0x0166
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP
            int r5 = r8.topMargin
            int r6 = r8.f1411u
            r1 = r22
            r2 = r4
            r1.mo17204a((p050l.p067f.p071b.p072k.C4904d.C4906b) r2, (p050l.p067f.p071b.p072k.C4907e) r3, (p050l.p067f.p071b.p072k.C4904d.C4906b) r4, (int) r5, (int) r6)
            goto L_0x0166
        L_0x014c:
            int r1 = r8.f1393i
            if (r1 == r12) goto L_0x0166
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            l.f.b.k.e r3 = (p050l.p067f.p071b.p072k.C4907e) r3
            if (r3 == 0) goto L_0x0166
            l.f.b.k.d$b r2 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.f1411u
            r1 = r22
            r1.mo17204a((p050l.p067f.p071b.p072k.C4904d.C4906b) r2, (p050l.p067f.p071b.p072k.C4907e) r3, (p050l.p067f.p071b.p072k.C4904d.C4906b) r4, (int) r5, (int) r6)
        L_0x0166:
            int r1 = r8.f1395j
            if (r1 == r12) goto L_0x0181
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            l.f.b.k.e r3 = (p050l.p067f.p071b.p072k.C4907e) r3
            if (r3 == 0) goto L_0x019a
            l.f.b.k.d$b r2 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.f1413w
            r1 = r22
            r1.mo17204a((p050l.p067f.p071b.p072k.C4904d.C4906b) r2, (p050l.p067f.p071b.p072k.C4907e) r3, (p050l.p067f.p071b.p072k.C4904d.C4906b) r4, (int) r5, (int) r6)
            goto L_0x019a
        L_0x0181:
            int r1 = r8.f1397k
            if (r1 == r12) goto L_0x019a
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            l.f.b.k.e r3 = (p050l.p067f.p071b.p072k.C4907e) r3
            if (r3 == 0) goto L_0x019a
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.f1413w
            r1 = r22
            r2 = r4
            r1.mo17204a((p050l.p067f.p071b.p072k.C4904d.C4906b) r2, (p050l.p067f.p071b.p072k.C4907e) r3, (p050l.p067f.p071b.p072k.C4904d.C4906b) r4, (int) r5, (int) r6)
        L_0x019a:
            int r1 = r8.f1399l
            if (r1 == r12) goto L_0x01ed
            android.util.SparseArray<android.view.View> r2 = r0.f1331f
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f1399l
            java.lang.Object r2 = r9.get(r2)
            l.f.b.k.e r2 = (p050l.p067f.p071b.p072k.C4907e) r2
            if (r2 == 0) goto L_0x01ed
            if (r1 == 0) goto L_0x01ed
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0317b
            if (r3 == 0) goto L_0x01ed
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0317b) r1
            r8.f1374X = r11
            r1.f1374X = r11
            l.f.b.k.d$b r3 = p050l.p067f.p071b.p072k.C4904d.C4906b.BASELINE
            l.f.b.k.d r3 = r7.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r3)
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.BASELINE
            l.f.b.k.d r2 = r2.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r4)
            r3.mo17163a(r2, r10, r12, r11)
            r7.mo17208a((boolean) r11)
            l.f.b.k.e r1 = r1.f1402m0
            r1.mo17208a((boolean) r11)
            l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP
            l.f.b.k.d r1 = r7.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r1)
            r1.mo17175m()
            l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM
            l.f.b.k.d r1 = r7.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r1)
            r1.mo17175m()
        L_0x01ed:
            r1 = 0
            r14 = r17
            int r2 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x01f7
            r7.mo17195a((float) r14)
        L_0x01f7:
            float r2 = r8.f1351A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0200
            r7.mo17222c((float) r2)
        L_0x0200:
            if (r20 == 0) goto L_0x0211
            int r1 = r8.f1366P
            if (r1 != r12) goto L_0x020a
            int r1 = r8.f1367Q
            if (r1 == r12) goto L_0x0211
        L_0x020a:
            int r1 = r8.f1366P
            int r2 = r8.f1367Q
            r7.mo17232e(r1, r2)
        L_0x0211:
            boolean r1 = r8.f1372V
            r2 = -2
            if (r1 != 0) goto L_0x0247
            int r1 = r8.width
            if (r1 != r12) goto L_0x023e
            boolean r1 = r8.f1369S
            if (r1 == 0) goto L_0x0224
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            r7.mo17205a((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
            goto L_0x0229
        L_0x0224:
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            r7.mo17205a((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
        L_0x0229:
            l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.LEFT
            l.f.b.k.d r1 = r7.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r1)
            int r3 = r8.leftMargin
            r1.f8544g = r3
            l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.RIGHT
            l.f.b.k.d r1 = r7.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r1)
            int r3 = r8.rightMargin
            r1.f8544g = r3
            goto L_0x025a
        L_0x023e:
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            r7.mo17205a((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
            r7.mo17263t(r10)
            goto L_0x025a
        L_0x0247:
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r7.mo17205a((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
            int r1 = r8.width
            r7.mo17263t(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x025a
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            r7.mo17205a((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
        L_0x025a:
            boolean r1 = r8.f1373W
            if (r1 != 0) goto L_0x028f
            int r1 = r8.height
            if (r1 != r12) goto L_0x0286
            boolean r1 = r8.f1370T
            if (r1 == 0) goto L_0x026c
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            r7.mo17217b((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
            goto L_0x0271
        L_0x026c:
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            r7.mo17217b((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
        L_0x0271:
            l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP
            l.f.b.k.d r1 = r7.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r1)
            int r2 = r8.topMargin
            r1.f8544g = r2
            l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM
            l.f.b.k.d r1 = r7.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r1)
            int r2 = r8.bottomMargin
            r1.f8544g = r2
            goto L_0x02a2
        L_0x0286:
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            r7.mo17217b((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
            r7.mo17247l(r10)
            goto L_0x02a2
        L_0x028f:
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r7.mo17217b((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
            int r1 = r8.height
            r7.mo17247l(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x02a2
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            r7.mo17217b((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
        L_0x02a2:
            java.lang.String r1 = r8.f1352B
            r7.mo17215b((java.lang.String) r1)
            float r1 = r8.f1354D
            r7.mo17212b((float) r1)
            float r1 = r8.f1355E
            r7.mo17227d((float) r1)
            int r1 = r8.f1356F
            r7.mo17249m(r1)
            int r1 = r8.f1357G
            r7.mo17259r(r1)
            int r1 = r8.f1358H
            int r2 = r8.f1360J
            int r3 = r8.f1362L
            float r4 = r8.f1364N
            r7.mo17197a((int) r1, (int) r2, (int) r3, (float) r4)
            int r1 = r8.f1359I
            int r2 = r8.f1361K
            int r3 = r8.f1363M
            float r4 = r8.f1365O
            r7.mo17214b(r1, r2, r3, r4)
        L_0x02d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo1983a(boolean, android.view.View, l.f.b.k.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1572a(attributeSet, i, i2);
    }

    /* renamed from: a */
    public final C4907e mo1978a(View view) {
        if (view == this) {
            return this.f1333h;
        }
        if (view == null) {
            return null;
        }
        return ((C0317b) view.getLayoutParams()).f1402m0;
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0317b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f1351A = 0.5f;

        /* renamed from: B */
        public String f1352B = null;

        /* renamed from: C */
        int f1353C = 1;

        /* renamed from: D */
        public float f1354D = -1.0f;

        /* renamed from: E */
        public float f1355E = -1.0f;

        /* renamed from: F */
        public int f1356F = 0;

        /* renamed from: G */
        public int f1357G = 0;

        /* renamed from: H */
        public int f1358H = 0;

        /* renamed from: I */
        public int f1359I = 0;

        /* renamed from: J */
        public int f1360J = 0;

        /* renamed from: K */
        public int f1361K = 0;

        /* renamed from: L */
        public int f1362L = 0;

        /* renamed from: M */
        public int f1363M = 0;

        /* renamed from: N */
        public float f1364N = 1.0f;

        /* renamed from: O */
        public float f1365O = 1.0f;

        /* renamed from: P */
        public int f1366P = -1;

        /* renamed from: Q */
        public int f1367Q = -1;

        /* renamed from: R */
        public int f1368R = -1;

        /* renamed from: S */
        public boolean f1369S = false;

        /* renamed from: T */
        public boolean f1370T = false;

        /* renamed from: U */
        public String f1371U = null;

        /* renamed from: V */
        boolean f1372V = true;

        /* renamed from: W */
        boolean f1373W = true;

        /* renamed from: X */
        boolean f1374X = false;

        /* renamed from: Y */
        boolean f1375Y = false;

        /* renamed from: Z */
        boolean f1376Z = false;

        /* renamed from: a */
        public int f1377a = -1;

        /* renamed from: a0 */
        boolean f1378a0 = false;

        /* renamed from: b */
        public int f1379b = -1;

        /* renamed from: b0 */
        boolean f1380b0 = false;

        /* renamed from: c */
        public float f1381c = -1.0f;

        /* renamed from: c0 */
        int f1382c0 = -1;

        /* renamed from: d */
        public int f1383d = -1;

        /* renamed from: d0 */
        int f1384d0 = -1;

        /* renamed from: e */
        public int f1385e = -1;

        /* renamed from: e0 */
        int f1386e0 = -1;

        /* renamed from: f */
        public int f1387f = -1;

        /* renamed from: f0 */
        int f1388f0 = -1;

        /* renamed from: g */
        public int f1389g = -1;

        /* renamed from: g0 */
        int f1390g0 = -1;

        /* renamed from: h */
        public int f1391h = -1;

        /* renamed from: h0 */
        int f1392h0 = -1;

        /* renamed from: i */
        public int f1393i = -1;

        /* renamed from: i0 */
        float f1394i0 = 0.5f;

        /* renamed from: j */
        public int f1395j = -1;

        /* renamed from: j0 */
        int f1396j0;

        /* renamed from: k */
        public int f1397k = -1;

        /* renamed from: k0 */
        int f1398k0;

        /* renamed from: l */
        public int f1399l = -1;

        /* renamed from: l0 */
        float f1400l0;

        /* renamed from: m */
        public int f1401m = -1;

        /* renamed from: m0 */
        C4907e f1402m0 = new C4907e();

        /* renamed from: n */
        public int f1403n = 0;

        /* renamed from: n0 */
        public boolean f1404n0;

        /* renamed from: o */
        public float f1405o = 0.0f;

        /* renamed from: p */
        public int f1406p = -1;

        /* renamed from: q */
        public int f1407q = -1;

        /* renamed from: r */
        public int f1408r = -1;

        /* renamed from: s */
        public int f1409s = -1;

        /* renamed from: t */
        public int f1410t = -1;

        /* renamed from: u */
        public int f1411u = -1;

        /* renamed from: v */
        public int f1412v = -1;

        /* renamed from: w */
        public int f1413w = -1;

        /* renamed from: x */
        public int f1414x = -1;

        /* renamed from: y */
        public int f1415y = -1;

        /* renamed from: z */
        public float f1416z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class C0318a {

            /* renamed from: a */
            public static final SparseIntArray f1417a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1417a = sparseIntArray;
                sparseIntArray.append(C0338i.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f1417a.append(C0338i.ConstraintLayout_Layout_android_orientation, 1);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                f1417a.append(C0338i.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public C0317b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0318a.f1417a.get(index);
                switch (i3) {
                    case 1:
                        this.f1368R = obtainStyledAttributes.getInt(index, this.f1368R);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1401m);
                        this.f1401m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f1401m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1403n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1403n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f1405o) % 360.0f;
                        this.f1405o = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f1405o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1377a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1377a);
                        break;
                    case 6:
                        this.f1379b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1379b);
                        break;
                    case 7:
                        this.f1381c = obtainStyledAttributes.getFloat(index, this.f1381c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1383d);
                        this.f1383d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1383d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1385e);
                        this.f1385e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1385e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1387f);
                        this.f1387f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f1387f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1389g);
                        this.f1389g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1389g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1391h);
                        this.f1391h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f1391h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1393i);
                        this.f1393i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f1393i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1395j);
                        this.f1395j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f1395j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1397k);
                        this.f1397k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f1397k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1399l);
                        this.f1399l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f1399l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1406p);
                        this.f1406p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f1406p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1407q);
                        this.f1407q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f1407q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1408r);
                        this.f1408r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f1408r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1409s);
                        this.f1409s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f1409s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1410t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1410t);
                        break;
                    case 22:
                        this.f1411u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1411u);
                        break;
                    case 23:
                        this.f1412v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1412v);
                        break;
                    case 24:
                        this.f1413w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1413w);
                        break;
                    case 25:
                        this.f1414x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1414x);
                        break;
                    case 26:
                        this.f1415y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1415y);
                        break;
                    case 27:
                        this.f1369S = obtainStyledAttributes.getBoolean(index, this.f1369S);
                        break;
                    case 28:
                        this.f1370T = obtainStyledAttributes.getBoolean(index, this.f1370T);
                        break;
                    case 29:
                        this.f1416z = obtainStyledAttributes.getFloat(index, this.f1416z);
                        break;
                    case 30:
                        this.f1351A = obtainStyledAttributes.getFloat(index, this.f1351A);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f1358H = i4;
                        if (i4 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f1359I = i5;
                        if (i5 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f1360J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1360J);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1360J) != -2) {
                                break;
                            } else {
                                this.f1360J = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f1362L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1362L);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1362L) != -2) {
                                break;
                            } else {
                                this.f1362L = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f1364N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1364N));
                        this.f1358H = 2;
                        break;
                    case 36:
                        try {
                            this.f1361K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1361K);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1361K) != -2) {
                                break;
                            } else {
                                this.f1361K = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f1363M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1363M);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1363M) != -2) {
                                break;
                            } else {
                                this.f1363M = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f1365O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1365O));
                        this.f1359I = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f1352B = string;
                                this.f1353C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.f1352B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f1352B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f1353C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f1353C = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f1352B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f1352B.substring(i, indexOf2);
                                        String substring3 = this.f1352B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f1353C != 1) {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f1352B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f1354D = obtainStyledAttributes.getFloat(index, this.f1354D);
                                break;
                            case 46:
                                this.f1355E = obtainStyledAttributes.getFloat(index, this.f1355E);
                                break;
                            case 47:
                                this.f1356F = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f1357G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f1366P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1366P);
                                break;
                            case 50:
                                this.f1367Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1367Q);
                                break;
                            case 51:
                                this.f1371U = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo2013a();
        }

        /* renamed from: a */
        public void mo2013a() {
            this.f1375Y = false;
            this.f1372V = true;
            this.f1373W = true;
            if (this.width == -2 && this.f1369S) {
                this.f1372V = false;
                if (this.f1358H == 0) {
                    this.f1358H = 1;
                }
            }
            if (this.height == -2 && this.f1370T) {
                this.f1373W = false;
                if (this.f1359I == 0) {
                    this.f1359I = 1;
                }
            }
            int i = this.width;
            if (i == 0 || i == -1) {
                this.f1372V = false;
                if (this.width == 0 && this.f1358H == 1) {
                    this.width = -2;
                    this.f1369S = true;
                }
            }
            int i2 = this.height;
            if (i2 == 0 || i2 == -1) {
                this.f1373W = false;
                if (this.height == 0 && this.f1359I == 1) {
                    this.height = -2;
                    this.f1370T = true;
                }
            }
            if (this.f1381c != -1.0f || this.f1377a != -1 || this.f1379b != -1) {
                this.f1375Y = true;
                this.f1372V = true;
                this.f1373W = true;
                if (!(this.f1402m0 instanceof C4911g)) {
                    this.f1402m0 = new C4911g();
                }
                ((C4911g) this.f1402m0).mo17304z(this.f1368R);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r7)
                int r7 = r6.getLayoutDirection()
                if (r4 != r7) goto L_0x0017
                r7 = 1
                goto L_0x0018
            L_0x0017:
                r7 = 0
            L_0x0018:
                r2 = -1
                r6.f1386e0 = r2
                r6.f1388f0 = r2
                r6.f1382c0 = r2
                r6.f1384d0 = r2
                r6.f1390g0 = r2
                r6.f1392h0 = r2
                int r5 = r6.f1410t
                r6.f1390g0 = r5
                int r5 = r6.f1412v
                r6.f1392h0 = r5
                float r5 = r6.f1416z
                r6.f1394i0 = r5
                int r5 = r6.f1377a
                r6.f1396j0 = r5
                int r5 = r6.f1379b
                r6.f1398k0 = r5
                float r5 = r6.f1381c
                r6.f1400l0 = r5
                if (r7 == 0) goto L_0x00a0
                int r7 = r6.f1406p
                if (r7 == r2) goto L_0x0047
                r6.f1386e0 = r7
            L_0x0045:
                r3 = 1
                goto L_0x004e
            L_0x0047:
                int r7 = r6.f1407q
                if (r7 == r2) goto L_0x004e
                r6.f1388f0 = r7
                goto L_0x0045
            L_0x004e:
                int r7 = r6.f1408r
                if (r7 == r2) goto L_0x0055
                r6.f1384d0 = r7
                r3 = 1
            L_0x0055:
                int r7 = r6.f1409s
                if (r7 == r2) goto L_0x005c
                r6.f1382c0 = r7
                r3 = 1
            L_0x005c:
                int r7 = r6.f1414x
                if (r7 == r2) goto L_0x0062
                r6.f1392h0 = r7
            L_0x0062:
                int r7 = r6.f1415y
                if (r7 == r2) goto L_0x0068
                r6.f1390g0 = r7
            L_0x0068:
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r6.f1416z
                float r3 = r7 - r3
                r6.f1394i0 = r3
            L_0x0072:
                boolean r3 = r6.f1375Y
                if (r3 == 0) goto L_0x00c4
                int r3 = r6.f1368R
                if (r3 != r4) goto L_0x00c4
                float r3 = r6.f1381c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x008a
                float r7 = r7 - r3
                r6.f1400l0 = r7
                r6.f1396j0 = r2
                r6.f1398k0 = r2
                goto L_0x00c4
            L_0x008a:
                int r7 = r6.f1377a
                if (r7 == r2) goto L_0x0095
                r6.f1398k0 = r7
                r6.f1396j0 = r2
                r6.f1400l0 = r4
                goto L_0x00c4
            L_0x0095:
                int r7 = r6.f1379b
                if (r7 == r2) goto L_0x00c4
                r6.f1396j0 = r7
                r6.f1398k0 = r2
                r6.f1400l0 = r4
                goto L_0x00c4
            L_0x00a0:
                int r7 = r6.f1406p
                if (r7 == r2) goto L_0x00a6
                r6.f1384d0 = r7
            L_0x00a6:
                int r7 = r6.f1407q
                if (r7 == r2) goto L_0x00ac
                r6.f1382c0 = r7
            L_0x00ac:
                int r7 = r6.f1408r
                if (r7 == r2) goto L_0x00b2
                r6.f1386e0 = r7
            L_0x00b2:
                int r7 = r6.f1409s
                if (r7 == r2) goto L_0x00b8
                r6.f1388f0 = r7
            L_0x00b8:
                int r7 = r6.f1414x
                if (r7 == r2) goto L_0x00be
                r6.f1390g0 = r7
            L_0x00be:
                int r7 = r6.f1415y
                if (r7 == r2) goto L_0x00c4
                r6.f1392h0 = r7
            L_0x00c4:
                int r7 = r6.f1408r
                if (r7 != r2) goto L_0x010e
                int r7 = r6.f1409s
                if (r7 != r2) goto L_0x010e
                int r7 = r6.f1407q
                if (r7 != r2) goto L_0x010e
                int r7 = r6.f1406p
                if (r7 != r2) goto L_0x010e
                int r7 = r6.f1387f
                if (r7 == r2) goto L_0x00e3
                r6.f1386e0 = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto L_0x00f1
                if (r1 <= 0) goto L_0x00f1
                r6.rightMargin = r1
                goto L_0x00f1
            L_0x00e3:
                int r7 = r6.f1389g
                if (r7 == r2) goto L_0x00f1
                r6.f1388f0 = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto L_0x00f1
                if (r1 <= 0) goto L_0x00f1
                r6.rightMargin = r1
            L_0x00f1:
                int r7 = r6.f1383d
                if (r7 == r2) goto L_0x0100
                r6.f1382c0 = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010e
                if (r0 <= 0) goto L_0x010e
                r6.leftMargin = r0
                goto L_0x010e
            L_0x0100:
                int r7 = r6.f1385e
                if (r7 == r2) goto L_0x010e
                r6.f1384d0 = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010e
                if (r0 <= 0) goto L_0x010e
                r6.leftMargin = r0
            L_0x010e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0317b.resolveLayoutDirection(int):void");
        }

        public C0317b(int i, int i2) {
            super(i, i2);
        }

        public C0317b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1981a(C4910f fVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1347v.mo2016a(i2, i3, max, max2, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (mo1984a()) {
                max3 = max4;
            }
            i4 = max3;
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        mo1982a(fVar, mode, i6, mode2, i7);
        fVar.mo17279a(i, mode, i6, mode2, i7, this.f1344s, this.f1345t, i4, max);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1979a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0319c cVar = this.f1347v;
        int i5 = cVar.f1422e;
        int i6 = i3 + cVar.f1421d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(i6, i, 0);
            int min = Math.min(this.f1336k, resolveSizeAndState & 16777215);
            int min2 = Math.min(this.f1337l, ViewGroup.resolveSizeAndState(i7, i2, 0) & 16777215);
            if (z) {
                min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            }
            if (z2) {
                min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            }
            setMeasuredDimension(min, min2);
            this.f1344s = min;
            this.f1345t = min2;
            return;
        }
        setMeasuredDimension(i6, i7);
        this.f1344s = i6;
        this.f1345t = i7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1984a() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1982a(C4910f fVar, int i, int i2, int i3, int i4) {
        C4907e.C4909b bVar;
        C0319c cVar = this.f1347v;
        int i5 = cVar.f1422e;
        int i6 = cVar.f1421d;
        C4907e.C4909b bVar2 = C4907e.C4909b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                bVar = C4907e.C4909b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.f1334i);
                }
            } else if (i != 1073741824) {
                bVar = bVar2;
            } else {
                i2 = Math.min(this.f1336k - i6, i2);
                bVar = bVar2;
            }
            i2 = 0;
        } else {
            bVar = C4907e.C4909b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.f1334i);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                bVar2 = C4907e.C4909b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.f1335j);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.f1337l - i5, i4);
            }
            i4 = 0;
        } else {
            bVar2 = C4907e.C4909b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f1335j);
            }
        }
        if (!(i2 == fVar.mo17180C() && i4 == fVar.mo17244k())) {
            fVar.mo17277Y();
        }
        fVar.mo17265u(0);
        fVar.mo17267v(0);
        fVar.mo17253o(this.f1336k - i6);
        fVar.mo17251n(this.f1337l - i5);
        fVar.mo17257q(0);
        fVar.mo17255p(0);
        fVar.mo17205a(bVar);
        fVar.mo17263t(i2);
        fVar.mo17217b(bVar2);
        fVar.mo17247l(i4);
        fVar.mo17257q(this.f1334i - i6);
        fVar.mo17255p(this.f1335j - i5);
    }

    /* renamed from: a */
    public View mo1976a(int i) {
        return this.f1331f.get(i);
    }
}
