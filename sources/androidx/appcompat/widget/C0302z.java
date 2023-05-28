package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0414a;
import androidx.core.widget.C0433f;
import java.lang.reflect.Field;
import p050l.p051a.C4790a;
import p050l.p051a.p054l.p055a.C4814c;
import p050l.p075h.p084l.C5086z;

/* renamed from: androidx.appcompat.widget.z */
/* compiled from: DropDownListView */
class C0302z extends ListView {

    /* renamed from: f */
    private final Rect f1268f = new Rect();

    /* renamed from: g */
    private int f1269g = 0;

    /* renamed from: h */
    private int f1270h = 0;

    /* renamed from: i */
    private int f1271i = 0;

    /* renamed from: j */
    private int f1272j = 0;

    /* renamed from: k */
    private int f1273k;

    /* renamed from: l */
    private Field f1274l;

    /* renamed from: m */
    private C0303a f1275m;

    /* renamed from: n */
    private boolean f1276n;

    /* renamed from: o */
    private boolean f1277o;

    /* renamed from: p */
    private boolean f1278p;

    /* renamed from: q */
    private C5086z f1279q;

    /* renamed from: r */
    private C0433f f1280r;

    /* renamed from: s */
    C0304b f1281s;

    /* renamed from: androidx.appcompat.widget.z$a */
    /* compiled from: DropDownListView */
    private static class C0303a extends C4814c {

        /* renamed from: g */
        private boolean f1282g = true;

        C0303a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1875a(boolean z) {
            this.f1282g = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1282g) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1282g) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1282g) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1282g) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1282g) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$b */
    /* compiled from: DropDownListView */
    private class C0304b implements Runnable {
        C0304b() {
        }

        /* renamed from: a */
        public void mo1881a() {
            C0302z zVar = C0302z.this;
            zVar.f1281s = null;
            zVar.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1882b() {
            C0302z.this.post(this);
        }

        public void run() {
            C0302z zVar = C0302z.this;
            zVar.f1281s = null;
            zVar.drawableStateChanged();
        }
    }

    C0302z(Context context, boolean z) {
        super(context, (AttributeSet) null, C4790a.dropDownListViewStyle);
        this.f1277o = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1274l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1460b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1455a(i, view);
        if (z2) {
            Rect rect = this.f1268f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0414a.m2012a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: c */
    private void m1462c() {
        Drawable selector = getSelector();
        if (selector != null && m1461b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0303a aVar = this.f1275m;
        if (aVar != null) {
            aVar.mo1875a(z);
        }
    }

    /* renamed from: a */
    public int mo1864a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1457a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1281s == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1462c();
        }
    }

    public boolean hasFocus() {
        return this.f1277o || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1277o || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1277o || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1277o && this.f1276n) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1281s = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1281s == null) {
            C0304b bVar = new C0304b();
            this.f1281s = bVar;
            bVar.mo1882b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1462c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1273k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0304b bVar = this.f1281s;
        if (bVar != null) {
            bVar.mo1881a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1276n = z;
    }

    public void setSelector(Drawable drawable) {
        C0303a aVar = drawable != null ? new C0303a(drawable) : null;
        this.f1275m = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1269g = rect.left;
        this.f1270h = rect.top;
        this.f1271i = rect.right;
        this.f1272j = rect.bottom;
    }

    /* renamed from: b */
    private boolean m1461b() {
        return this.f1278p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1865a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1459a((android.view.View) r3, (int) r5, (float) r4, (float) r9)
            if (r0 != r2) goto L_0x000e
            r7.m1458a((android.view.View) r3, (int) r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1454a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f1280r
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f1280r = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f1280r
            r9.mo2449a((boolean) r2)
            androidx.core.widget.f r9 = r7.f1280r
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f1280r
            if (r8 == 0) goto L_0x006c
            r8.mo2449a((boolean) r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0302z.mo1865a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    private void m1458a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m1457a(Canvas canvas) {
        Drawable selector;
        if (!this.f1268f.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1268f);
            selector.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m1456a(int i, View view, float f, float f2) {
        m1460b(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0414a.m2012a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m1455a(int i, View view) {
        Rect rect = this.f1268f;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1269g;
        rect.top -= this.f1270h;
        rect.right += this.f1271i;
        rect.bottom += this.f1272j;
        try {
            boolean z = this.f1274l.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1274l.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1454a() {
        this.f1278p = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1273k - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C5086z zVar = this.f1279q;
        if (zVar != null) {
            zVar.mo17642a();
            this.f1279q = null;
        }
    }

    /* renamed from: a */
    private void m1459a(View view, int i, float f, float f2) {
        View childAt;
        this.f1278p = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1273k;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1273k = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1456a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }
}
