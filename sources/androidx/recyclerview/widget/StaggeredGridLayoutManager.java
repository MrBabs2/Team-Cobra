package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p050l.p075h.p084l.p085e0.C5034c;

public class StaggeredGridLayoutManager extends RecyclerView.C0644o implements RecyclerView.C0659y.C0661b {

    /* renamed from: a */
    private int f2503a = -1;

    /* renamed from: b */
    C0668d[] f2504b;

    /* renamed from: c */
    C0711n f2505c;

    /* renamed from: d */
    C0711n f2506d;

    /* renamed from: e */
    private int f2507e;

    /* renamed from: f */
    private int f2508f;

    /* renamed from: g */
    private final C0705i f2509g;

    /* renamed from: h */
    boolean f2510h = false;

    /* renamed from: i */
    boolean f2511i = false;

    /* renamed from: j */
    private BitSet f2512j;

    /* renamed from: k */
    int f2513k = -1;

    /* renamed from: l */
    int f2514l = Integer.MIN_VALUE;

    /* renamed from: m */
    LazySpanLookup f2515m = new LazySpanLookup();

    /* renamed from: n */
    private int f2516n = 2;

    /* renamed from: o */
    private boolean f2517o;

    /* renamed from: p */
    private boolean f2518p;

    /* renamed from: q */
    private SavedState f2519q;

    /* renamed from: r */
    private int f2520r;

    /* renamed from: s */
    private final Rect f2521s = new Rect();

    /* renamed from: t */
    private final C0666b f2522t = new C0666b();

    /* renamed from: u */
    private boolean f2523u = false;

    /* renamed from: v */
    private boolean f2524v = true;

    /* renamed from: w */
    private int[] f2525w;

    /* renamed from: x */
    private final Runnable f2526x = new C0665a();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0664a();

        /* renamed from: f */
        int f2533f;

        /* renamed from: g */
        int f2534g;

        /* renamed from: h */
        int f2535h;

        /* renamed from: i */
        int[] f2536i;

        /* renamed from: j */
        int f2537j;

        /* renamed from: k */
        int[] f2538k;

        /* renamed from: l */
        List<LazySpanLookup.FullSpanItem> f2539l;

        /* renamed from: m */
        boolean f2540m;

        /* renamed from: n */
        boolean f2541n;

        /* renamed from: o */
        boolean f2542o;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        static class C0664a implements Parcelable.Creator<SavedState> {
            C0664a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4086a() {
            this.f2536i = null;
            this.f2535h = 0;
            this.f2533f = -1;
            this.f2534g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4087b() {
            this.f2536i = null;
            this.f2535h = 0;
            this.f2537j = 0;
            this.f2538k = null;
            this.f2539l = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2533f);
            parcel.writeInt(this.f2534g);
            parcel.writeInt(this.f2535h);
            if (this.f2535h > 0) {
                parcel.writeIntArray(this.f2536i);
            }
            parcel.writeInt(this.f2537j);
            if (this.f2537j > 0) {
                parcel.writeIntArray(this.f2538k);
            }
            parcel.writeInt(this.f2540m ? 1 : 0);
            parcel.writeInt(this.f2541n ? 1 : 0);
            parcel.writeInt(this.f2542o ? 1 : 0);
            parcel.writeList(this.f2539l);
        }

        SavedState(Parcel parcel) {
            this.f2533f = parcel.readInt();
            this.f2534g = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2535h = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2536i = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2537j = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2538k = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f2540m = parcel.readInt() == 1;
            this.f2541n = parcel.readInt() == 1;
            this.f2542o = parcel.readInt() == 1 ? true : z;
            this.f2539l = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f2535h = savedState.f2535h;
            this.f2533f = savedState.f2533f;
            this.f2534g = savedState.f2534g;
            this.f2536i = savedState.f2536i;
            this.f2537j = savedState.f2537j;
            this.f2538k = savedState.f2538k;
            this.f2540m = savedState.f2540m;
            this.f2541n = savedState.f2541n;
            this.f2542o = savedState.f2542o;
            this.f2539l = savedState.f2539l;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C0665a implements Runnable {
        C0665a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo4057c();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0667c extends RecyclerView.C0649p {

        /* renamed from: e */
        C0668d f2551e;

        /* renamed from: f */
        boolean f2552f;

        public C0667c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public final int mo4097e() {
            C0668d dVar = this.f2551e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f2557e;
        }

        /* renamed from: f */
        public boolean mo4098f() {
            return this.f2552f;
        }

        public C0667c(int i, int i2) {
            super(i, i2);
        }

        public C0667c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0667c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    class C0668d {

        /* renamed from: a */
        ArrayList<View> f2553a = new ArrayList<>();

        /* renamed from: b */
        int f2554b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f2555c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f2556d = 0;

        /* renamed from: e */
        final int f2557e;

        C0668d(int i) {
            this.f2557e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4099a(int i) {
            int i2 = this.f2555c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2553a.size() == 0) {
                return i;
            }
            mo4103a();
            return this.f2555c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4106b(int i) {
            int i2 = this.f2554b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2553a.size() == 0) {
                return i;
            }
            mo4108b();
            return this.f2554b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4111c(View view) {
            C0667c b = mo4107b(view);
            b.f2551e = this;
            this.f2553a.add(0, view);
            this.f2554b = Integer.MIN_VALUE;
            if (this.f2553a.size() == 1) {
                this.f2555c = Integer.MIN_VALUE;
            }
            if (b.mo3960c() || b.mo3959b()) {
                this.f2556d += StaggeredGridLayoutManager.this.f2505c.mo4253b(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4113d(int i) {
            this.f2554b = i;
            this.f2555c = i;
        }

        /* renamed from: e */
        public int mo4114e() {
            if (StaggeredGridLayoutManager.this.f2510h) {
                return mo4100a(0, this.f2553a.size(), true);
            }
            return mo4100a(this.f2553a.size() - 1, -1, true);
        }

        /* renamed from: f */
        public int mo4115f() {
            return this.f2556d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo4116g() {
            int i = this.f2555c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4103a();
            return this.f2555c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo4117h() {
            int i = this.f2554b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4108b();
            return this.f2554b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4118i() {
            this.f2554b = Integer.MIN_VALUE;
            this.f2555c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4119j() {
            int size = this.f2553a.size();
            View remove = this.f2553a.remove(size - 1);
            C0667c b = mo4107b(remove);
            b.f2551e = null;
            if (b.mo3960c() || b.mo3959b()) {
                this.f2556d -= StaggeredGridLayoutManager.this.f2505c.mo4253b(remove);
            }
            if (size == 1) {
                this.f2554b = Integer.MIN_VALUE;
            }
            this.f2555c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo4120k() {
            View remove = this.f2553a.remove(0);
            C0667c b = mo4107b(remove);
            b.f2551e = null;
            if (this.f2553a.size() == 0) {
                this.f2555c = Integer.MIN_VALUE;
            }
            if (b.mo3960c() || b.mo3959b()) {
                this.f2556d -= StaggeredGridLayoutManager.this.f2505c.mo4253b(remove);
            }
            this.f2554b = Integer.MIN_VALUE;
        }

        /* renamed from: d */
        public int mo4112d() {
            if (StaggeredGridLayoutManager.this.f2510h) {
                return mo4100a(this.f2553a.size() - 1, -1, true);
            }
            return mo4100a(0, this.f2553a.size(), true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4103a() {
            LazySpanLookup.FullSpanItem c;
            ArrayList<View> arrayList = this.f2553a;
            View view = arrayList.get(arrayList.size() - 1);
            C0667c b = mo4107b(view);
            this.f2555c = StaggeredGridLayoutManager.this.f2505c.mo4250a(view);
            if (b.f2552f && (c = StaggeredGridLayoutManager.this.f2515m.mo4076c(b.mo3958a())) != null && c.f2530g == 1) {
                this.f2555c += c.mo4080a(this.f2557e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4108b() {
            LazySpanLookup.FullSpanItem c;
            View view = this.f2553a.get(0);
            C0667c b = mo4107b(view);
            this.f2554b = StaggeredGridLayoutManager.this.f2505c.mo4257d(view);
            if (b.f2552f && (c = StaggeredGridLayoutManager.this.f2515m.mo4076c(b.mo3958a())) != null && c.f2530g == -1) {
                this.f2554b -= c.mo4080a(this.f2557e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4109c() {
            this.f2553a.clear();
            mo4118i();
            this.f2556d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4110c(int i) {
            int i2 = this.f2554b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2554b = i2 + i;
            }
            int i3 = this.f2555c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2555c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4104a(View view) {
            C0667c b = mo4107b(view);
            b.f2551e = this;
            this.f2553a.add(view);
            this.f2555c = Integer.MIN_VALUE;
            if (this.f2553a.size() == 1) {
                this.f2554b = Integer.MIN_VALUE;
            }
            if (b.mo3960c() || b.mo3959b()) {
                this.f2556d += StaggeredGridLayoutManager.this.f2505c.mo4253b(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0667c mo4107b(View view) {
            return (C0667c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4105a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo4099a(Integer.MIN_VALUE);
            } else {
                i2 = mo4106b(Integer.MIN_VALUE);
            }
            mo4109c();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f2505c.mo4252b()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f2505c.mo4260f()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f2555c = i2;
                    this.f2554b = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4101a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f = StaggeredGridLayoutManager.this.f2505c.mo4260f();
            int b = StaggeredGridLayoutManager.this.f2505c.mo4252b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2553a.get(i);
                int d = StaggeredGridLayoutManager.this.f2505c.mo4257d(view);
                int a = StaggeredGridLayoutManager.this.f2505c.mo4250a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b : d <= b;
                if (!z3 ? a > f : a >= f) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (d < f || a > b) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (d >= f && a <= b) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4100a(int i, int i2, boolean z) {
            return mo4101a(i, i2, false, false, z);
        }

        /* renamed from: a */
        public View mo4102a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2553a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2553a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2510h && staggeredGridLayoutManager.getPosition(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2510h && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2553a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2553a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2510h && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2510h && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C0644o.C0648d properties = RecyclerView.C0644o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2455a);
        setSpanCount(properties.f2456b);
        setReverseLayout(properties.f2457c);
        this.f2509g = new C0705i();
        m3118i();
    }

    /* renamed from: a */
    private boolean m3102a(C0668d dVar) {
        if (this.f2511i) {
            if (dVar.mo4116g() < this.f2505c.mo4252b()) {
                ArrayList<View> arrayList = dVar.f2553a;
                return !dVar.mo4107b(arrayList.get(arrayList.size() - 1)).f2552f;
            }
        } else if (dVar.mo4117h() > this.f2505c.mo4260f()) {
            return !dVar.mo4107b(dVar.f2553a.get(0)).f2552f;
        }
        return false;
    }

    private int computeScrollExtent(RecyclerView.C0662z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0716p.m3400a(zVar, this.f2505c, mo4054b(!this.f2524v), mo4049a(!this.f2524v), this, this.f2524v);
    }

    private int computeScrollOffset(RecyclerView.C0662z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0716p.m3401a(zVar, this.f2505c, mo4054b(!this.f2524v), mo4049a(!this.f2524v), this, this.f2524v, this.f2511i);
    }

    private int computeScrollRange(RecyclerView.C0662z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0716p.m3402b(zVar, this.f2505c, mo4054b(!this.f2524v), mo4049a(!this.f2524v), this, this.f2524v);
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.f2507e != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2507e != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.f2507e == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.f2507e == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.f2507e == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f2507e == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: i */
    private void m3118i() {
        this.f2505c = C0711n.m3338a(this, this.f2507e);
        this.f2506d = C0711n.m3338a(this, 1 - this.f2507e);
    }

    /* renamed from: j */
    private void m3120j() {
        if (this.f2506d.mo4256d() != 1073741824) {
            float f = 0.0f;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                float b = (float) this.f2506d.mo4253b(childAt);
                if (b >= f) {
                    if (((C0667c) childAt.getLayoutParams()).mo4098f()) {
                        b = (b * 1.0f) / ((float) this.f2503a);
                    }
                    f = Math.max(f, b);
                }
            }
            int i2 = this.f2508f;
            int round = Math.round(f * ((float) this.f2503a));
            if (this.f2506d.mo4256d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2506d.mo4262g());
            }
            mo4050a(round);
            if (this.f2508f != i2) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt2 = getChildAt(i3);
                    C0667c cVar = (C0667c) childAt2.getLayoutParams();
                    if (!cVar.f2552f) {
                        if (!isLayoutRTL() || this.f2507e != 1) {
                            int i4 = cVar.f2551e.f2557e;
                            int i5 = this.f2508f * i4;
                            int i6 = i4 * i2;
                            if (this.f2507e == 1) {
                                childAt2.offsetLeftAndRight(i5 - i6);
                            } else {
                                childAt2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f2503a;
                            int i8 = cVar.f2551e.f2557e;
                            childAt2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f2508f) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private boolean m3121k(int i) {
        if (this.f2507e == 0) {
            if ((i == -1) != this.f2511i) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.f2511i) == isLayoutRTL()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private void m3122l(int i) {
        C0705i iVar = this.f2509g;
        iVar.f2696e = i;
        int i2 = 1;
        if (this.f2511i != (i == -1)) {
            i2 = -1;
        }
        iVar.f2695d = i2;
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        boolean z2;
        calculateItemDecorationsForChild(view, this.f2521s);
        C0667c cVar = (C0667c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f2521s;
        int b = m3104b(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f2521s;
        int b2 = m3104b(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z) {
            z2 = shouldReMeasureChild(view, b, b2, cVar);
        } else {
            z2 = shouldMeasureChild(view, b, b2, cVar);
        }
        if (z2) {
            view.measure(b, b2);
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.f2507e == 1 || !isLayoutRTL()) {
            this.f2511i = this.f2510h;
        } else {
            this.f2511i = !this.f2510h;
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.f2519q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4055b(RecyclerView.C0662z zVar, C0666b bVar) {
        if (!mo4053a(zVar, bVar) && !m3111c(zVar, bVar)) {
            bVar.mo4093a();
            bVar.f2544a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4057c() {
        int i;
        int i2;
        if (getChildCount() == 0 || this.f2516n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f2511i) {
            i2 = mo4060f();
            i = mo4059e();
        } else {
            i2 = mo4059e();
            i = mo4060f();
        }
        if (i2 == 0 && mo4061g() != null) {
            this.f2515m.mo4069a();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (!this.f2523u) {
            return false;
        } else {
            int i3 = this.f2511i ? -1 : 1;
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem a = this.f2515m.mo4068a(i2, i4, i3, true);
            if (a == null) {
                this.f2523u = false;
                this.f2515m.mo4074b(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem a2 = this.f2515m.mo4068a(i2, a.f2529f, i3 * -1, true);
            if (a2 == null) {
                this.f2515m.mo4074b(a.f2529f);
            } else {
                this.f2515m.mo4074b(a2.f2529f + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
    }

    public boolean canScrollHorizontally() {
        return this.f2507e == 0;
    }

    public boolean canScrollVertically() {
        return this.f2507e == 1;
    }

    public boolean checkLayoutParams(RecyclerView.C0649p pVar) {
        return pVar instanceof C0667c;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C0662z zVar, RecyclerView.C0644o.C0647c cVar) {
        int i3;
        int i4;
        if (this.f2507e != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            mo4051a(i, zVar);
            int[] iArr = this.f2525w;
            if (iArr == null || iArr.length < this.f2503a) {
                this.f2525w = new int[this.f2503a];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2503a; i6++) {
                C0705i iVar = this.f2509g;
                if (iVar.f2695d == -1) {
                    i4 = iVar.f2697f;
                    i3 = this.f2504b[i6].mo4106b(i4);
                } else {
                    i4 = this.f2504b[i6].mo4099a(iVar.f2698g);
                    i3 = this.f2509g.f2698g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f2525w[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f2525w, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f2509g.mo4232a(zVar); i8++) {
                cVar.mo3957a(this.f2509g.f2694c, this.f2525w[i8]);
                C0705i iVar2 = this.f2509g;
                iVar2.f2694c += iVar2.f2695d;
            }
        }
    }

    public int computeHorizontalScrollExtent(RecyclerView.C0662z zVar) {
        return computeScrollExtent(zVar);
    }

    public int computeHorizontalScrollOffset(RecyclerView.C0662z zVar) {
        return computeScrollOffset(zVar);
    }

    public int computeHorizontalScrollRange(RecyclerView.C0662z zVar) {
        return computeScrollRange(zVar);
    }

    public PointF computeScrollVectorForPosition(int i) {
        int b = m3103b(i);
        PointF pointF = new PointF();
        if (b == 0) {
            return null;
        }
        if (this.f2507e == 0) {
            pointF.x = (float) b;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) b;
        }
        return pointF;
    }

    public int computeVerticalScrollExtent(RecyclerView.C0662z zVar) {
        return computeScrollExtent(zVar);
    }

    public int computeVerticalScrollOffset(RecyclerView.C0662z zVar) {
        return computeScrollOffset(zVar);
    }

    public int computeVerticalScrollRange(RecyclerView.C0662z zVar) {
        return computeScrollRange(zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo4058d() {
        View view;
        if (this.f2511i) {
            view = mo4049a(true);
        } else {
            view = mo4054b(true);
        }
        if (view == null) {
            return -1;
        }
        return getPosition(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo4059e() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo4060f() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4061g() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2503a
            r2.<init>(r3)
            int r3 = r12.f2503a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2507e
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f2511i
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0667c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f2551e
            int r9 = r9.f2557e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f2551e
            boolean r9 = r12.m3102a((androidx.recyclerview.widget.StaggeredGridLayoutManager.C0668d) r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f2551e
            int r9 = r9.f2557e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f2552f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f2511i
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.n r10 = r12.f2505c
            int r10 = r10.mo4250a((android.view.View) r7)
            androidx.recyclerview.widget.n r11 = r12.f2505c
            int r11 = r11.mo4250a((android.view.View) r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.n r10 = r12.f2505c
            int r10 = r10.mo4257d(r7)
            androidx.recyclerview.widget.n r11 = r12.f2505c
            int r11 = r11.mo4257d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0667c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f2551e
            int r8 = r8.f2557e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f2551e
            int r9 = r9.f2557e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4061g():android.view.View");
    }

    public RecyclerView.C0649p generateDefaultLayoutParams() {
        if (this.f2507e == 0) {
            return new C0667c(-2, -1);
        }
        return new C0667c(-1, -2);
    }

    public RecyclerView.C0649p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0667c(context, attributeSet);
    }

    public int getColumnCountForAccessibility(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        if (this.f2507e == 1) {
            return this.f2503a;
        }
        return super.getColumnCountForAccessibility(vVar, zVar);
    }

    public int getRowCountForAccessibility(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        if (this.f2507e == 0) {
            return this.f2503a;
        }
        return super.getRowCountForAccessibility(vVar, zVar);
    }

    /* renamed from: h */
    public void mo4062h() {
        this.f2515m.mo4069a();
        requestLayout();
    }

    public boolean isAutoMeasureEnabled() {
        return this.f2516n != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f2503a; i2++) {
            this.f2504b[i2].mo4110c(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f2503a; i2++) {
            this.f2504b[i2].mo4110c(i);
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0656v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        removeCallbacks(this.f2526x);
        for (int i = 0; i < this.f2503a; i++) {
            this.f2504b[i].mo4109c();
        }
        recyclerView.requestLayout();
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        View findContainingItemView;
        int i2;
        int i3;
        int i4;
        int i5;
        View a;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        C0667c cVar = (C0667c) findContainingItemView.getLayoutParams();
        boolean z = cVar.f2552f;
        C0668d dVar = cVar.f2551e;
        if (convertFocusDirectionToLayoutDirection == 1) {
            i2 = mo4060f();
        } else {
            i2 = mo4059e();
        }
        m3105b(i2, zVar);
        m3122l(convertFocusDirectionToLayoutDirection);
        C0705i iVar = this.f2509g;
        iVar.f2694c = iVar.f2695d + i2;
        iVar.f2693b = (int) (((float) this.f2505c.mo4262g()) * 0.33333334f);
        C0705i iVar2 = this.f2509g;
        iVar2.f2699h = true;
        iVar2.f2692a = false;
        m3090a(vVar, iVar2, zVar);
        this.f2517o = this.f2511i;
        if (!z && (a = dVar.mo4102a(i2, convertFocusDirectionToLayoutDirection)) != null && a != findContainingItemView) {
            return a;
        }
        if (m3121k(convertFocusDirectionToLayoutDirection)) {
            for (int i6 = this.f2503a - 1; i6 >= 0; i6--) {
                View a2 = this.f2504b[i6].mo4102a(i2, convertFocusDirectionToLayoutDirection);
                if (a2 != null && a2 != findContainingItemView) {
                    return a2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f2503a; i7++) {
                View a3 = this.f2504b[i7].mo4102a(i2, convertFocusDirectionToLayoutDirection);
                if (a3 != null && a3 != findContainingItemView) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f2510h ^ true) == (convertFocusDirectionToLayoutDirection == -1);
        if (!z) {
            if (z2) {
                i5 = dVar.mo4112d();
            } else {
                i5 = dVar.mo4114e();
            }
            View findViewByPosition = findViewByPosition(i5);
            if (!(findViewByPosition == null || findViewByPosition == findContainingItemView)) {
                return findViewByPosition;
            }
        }
        if (m3121k(convertFocusDirectionToLayoutDirection)) {
            for (int i8 = this.f2503a - 1; i8 >= 0; i8--) {
                if (i8 != dVar.f2557e) {
                    if (z2) {
                        i4 = this.f2504b[i8].mo4112d();
                    } else {
                        i4 = this.f2504b[i8].mo4114e();
                    }
                    View findViewByPosition2 = findViewByPosition(i4);
                    if (!(findViewByPosition2 == null || findViewByPosition2 == findContainingItemView)) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f2503a; i9++) {
                if (z2) {
                    i3 = this.f2504b[i9].mo4112d();
                } else {
                    i3 = this.f2504b[i9].mo4114e();
                }
                View findViewByPosition3 = findViewByPosition(i3);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View b = mo4054b(false);
            View a = mo4049a(false);
            if (b != null && a != null) {
                int position = getPosition(b);
                int position2 = getPosition(a);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, View view, C5034c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0667c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cVar);
            return;
        }
        C0667c cVar2 = (C0667c) layoutParams;
        if (this.f2507e == 0) {
            cVar.mo17521b((Object) C5034c.C5037c.m9069a(cVar2.mo4097e(), cVar2.f2552f ? this.f2503a : 1, -1, -1, false, false));
        } else {
            cVar.mo17521b((Object) C5034c.C5037c.m9069a(-1, -1, cVar2.mo4097e(), cVar2.f2552f ? this.f2503a : 1, false, false));
        }
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m3093a(i, i2, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.f2515m.mo4069a();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m3093a(i, i2, 8);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m3093a(i, i2, 2);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m3093a(i, i2, 4);
    }

    public void onLayoutChildren(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        m3110c(vVar, zVar, true);
    }

    public void onLayoutCompleted(RecyclerView.C0662z zVar) {
        super.onLayoutCompleted(zVar);
        this.f2513k = -1;
        this.f2514l = Integer.MIN_VALUE;
        this.f2519q = null;
        this.f2522t.mo4096b();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f2519q = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.f2519q != null) {
            return new SavedState(this.f2519q);
        }
        SavedState savedState = new SavedState();
        savedState.f2540m = this.f2510h;
        savedState.f2541n = this.f2517o;
        savedState.f2542o = this.f2518p;
        LazySpanLookup lazySpanLookup = this.f2515m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f2527a) == null) {
            savedState.f2537j = 0;
        } else {
            savedState.f2538k = iArr;
            savedState.f2537j = iArr.length;
            savedState.f2539l = lazySpanLookup.f2528b;
        }
        if (getChildCount() > 0) {
            if (this.f2517o) {
                i = mo4060f();
            } else {
                i = mo4059e();
            }
            savedState.f2533f = i;
            savedState.f2534g = mo4058d();
            int i4 = this.f2503a;
            savedState.f2535h = i4;
            savedState.f2536i = new int[i4];
            for (int i5 = 0; i5 < this.f2503a; i5++) {
                if (this.f2517o) {
                    i2 = this.f2504b[i5].mo4099a(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f2505c.mo4252b();
                    } else {
                        savedState.f2536i[i5] = i2;
                    }
                } else {
                    i2 = this.f2504b[i5].mo4106b(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f2505c.mo4260f();
                    } else {
                        savedState.f2536i[i5] = i2;
                    }
                }
                i2 -= i3;
                savedState.f2536i[i5] = i2;
            }
        } else {
            savedState.f2533f = -1;
            savedState.f2534g = -1;
            savedState.f2535h = 0;
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
        if (i == 0) {
            mo4057c();
        }
    }

    /* access modifiers changed from: package-private */
    public int scrollBy(int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo4051a(i, zVar);
        int a = m3090a(vVar, this.f2509g, zVar);
        if (this.f2509g.f2693b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f2505c.mo4251a(-i);
        this.f2517o = this.f2511i;
        C0705i iVar = this.f2509g;
        iVar.f2693b = 0;
        m3099a(vVar, iVar);
        return i;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        return scrollBy(i, vVar, zVar);
    }

    public void scrollToPosition(int i) {
        SavedState savedState = this.f2519q;
        if (!(savedState == null || savedState.f2533f == i)) {
            savedState.mo4086a();
        }
        this.f2513k = i;
        this.f2514l = Integer.MIN_VALUE;
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        return scrollBy(i, vVar, zVar);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f2507e == 1) {
            i4 = RecyclerView.C0644o.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i3 = RecyclerView.C0644o.chooseSize(i, (this.f2508f * this.f2503a) + paddingLeft, getMinimumWidth());
        } else {
            i3 = RecyclerView.C0644o.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            i4 = RecyclerView.C0644o.chooseSize(i2, (this.f2508f * this.f2503a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i != this.f2507e) {
                this.f2507e = i;
                C0711n nVar = this.f2505c;
                this.f2505c = this.f2506d;
                this.f2506d = nVar;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        SavedState savedState = this.f2519q;
        if (!(savedState == null || savedState.f2540m == z)) {
            savedState.f2540m = z;
        }
        this.f2510h = z;
        requestLayout();
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll((String) null);
        if (i != this.f2503a) {
            mo4062h();
            this.f2503a = i;
            this.f2512j = new BitSet(this.f2503a);
            this.f2504b = new C0668d[this.f2503a];
            for (int i2 = 0; i2 < this.f2503a; i2++) {
                this.f2504b[i2] = new C0668d(i2);
            }
            requestLayout();
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0662z zVar, int i) {
        C0706j jVar = new C0706j(recyclerView.getContext());
        jVar.setTargetPosition(i);
        startSmoothScroll(jVar);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.f2519q == null;
    }

    static class LazySpanLookup {

        /* renamed from: a */
        int[] f2527a;

        /* renamed from: b */
        List<FullSpanItem> f2528b;

        LazySpanLookup() {
        }

        /* renamed from: c */
        private void m3137c(int i, int i2) {
            List<FullSpanItem> list = this.f2528b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f2528b.get(size);
                    int i3 = fullSpanItem.f2529f;
                    if (i3 >= i) {
                        fullSpanItem.f2529f = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m3139g(int i) {
            if (this.f2528b == null) {
                return -1;
            }
            FullSpanItem c = mo4076c(i);
            if (c != null) {
                this.f2528b.remove(c);
            }
            int size = this.f2528b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f2528b.get(i2).f2529f >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f2528b.remove(i2);
            return this.f2528b.get(i2).f2529f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4072a(int i, C0668d dVar) {
            mo4070a(i);
            this.f2527a[i] = dVar.f2557e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4074b(int i) {
            List<FullSpanItem> list = this.f2528b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2528b.get(size).f2529f >= i) {
                        this.f2528b.remove(size);
                    }
                }
            }
            return mo4078e(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo4077d(int i) {
            int[] iArr = this.f2527a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo4078e(int i) {
            int[] iArr = this.f2527a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m3139g(i);
            if (g == -1) {
                int[] iArr2 = this.f2527a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2527a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f2527a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo4079f(int i) {
            int length = this.f2527a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: d */
        private void m3138d(int i, int i2) {
            List<FullSpanItem> list = this.f2528b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f2528b.get(size);
                    int i4 = fullSpanItem.f2529f;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f2528b.remove(size);
                        } else {
                            fullSpanItem.f2529f = i4 - i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4070a(int i) {
            int[] iArr = this.f2527a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f2527a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo4079f(i)];
                this.f2527a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2527a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: c */
        public FullSpanItem mo4076c(int i) {
            List<FullSpanItem> list = this.f2528b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2528b.get(size);
                if (fullSpanItem.f2529f == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0663a();

            /* renamed from: f */
            int f2529f;

            /* renamed from: g */
            int f2530g;

            /* renamed from: h */
            int[] f2531h;

            /* renamed from: i */
            boolean f2532i;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            static class C0663a implements Parcelable.Creator<FullSpanItem> {
                C0663a() {
                }

                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f2529f = parcel.readInt();
                this.f2530g = parcel.readInt();
                this.f2532i = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2531h = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo4080a(int i) {
                int[] iArr = this.f2531h;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2529f + ", mGapDir=" + this.f2530g + ", mHasUnwantedGapAfter=" + this.f2532i + ", mGapPerSpan=" + Arrays.toString(this.f2531h) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2529f);
                parcel.writeInt(this.f2530g);
                parcel.writeInt(this.f2532i ? 1 : 0);
                int[] iArr = this.f2531h;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2531h);
            }

            FullSpanItem() {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4075b(int i, int i2) {
            int[] iArr = this.f2527a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4070a(i3);
                int[] iArr2 = this.f2527a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f2527a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m3138d(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4069a() {
            int[] iArr = this.f2527a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2528b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4071a(int i, int i2) {
            int[] iArr = this.f2527a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4070a(i3);
                int[] iArr2 = this.f2527a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f2527a, i, i3, -1);
                m3137c(i, i2);
            }
        }

        /* renamed from: a */
        public void mo4073a(FullSpanItem fullSpanItem) {
            if (this.f2528b == null) {
                this.f2528b = new ArrayList();
            }
            int size = this.f2528b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f2528b.get(i);
                if (fullSpanItem2.f2529f == fullSpanItem.f2529f) {
                    this.f2528b.remove(i);
                }
                if (fullSpanItem2.f2529f >= fullSpanItem.f2529f) {
                    this.f2528b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f2528b.add(fullSpanItem);
        }

        /* renamed from: a */
        public FullSpanItem mo4068a(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f2528b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f2528b.get(i4);
                int i5 = fullSpanItem.f2529f;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f2530g == i3 || (z && fullSpanItem.f2532i))) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    public RecyclerView.C0649p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0667c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0667c(layoutParams);
    }

    /* renamed from: e */
    private int m3113e(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: f */
    private int m3114f(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: h */
    private int m3116h(int i) {
        int b = this.f2504b[0].mo4106b(i);
        for (int i2 = 1; i2 < this.f2503a; i2++) {
            int b2 = this.f2504b[i2].mo4106b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C0666b {

        /* renamed from: a */
        int f2544a;

        /* renamed from: b */
        int f2545b;

        /* renamed from: c */
        boolean f2546c;

        /* renamed from: d */
        boolean f2547d;

        /* renamed from: e */
        boolean f2548e;

        /* renamed from: f */
        int[] f2549f;

        C0666b() {
            mo4096b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4095a(C0668d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f2549f;
            if (iArr == null || iArr.length < length) {
                this.f2549f = new int[StaggeredGridLayoutManager.this.f2504b.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2549f[i] = dVarArr[i].mo4106b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4096b() {
            this.f2544a = -1;
            this.f2545b = Integer.MIN_VALUE;
            this.f2546c = false;
            this.f2547d = false;
            this.f2548e = false;
            int[] iArr = this.f2549f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4093a() {
            int i;
            if (this.f2546c) {
                i = StaggeredGridLayoutManager.this.f2505c.mo4252b();
            } else {
                i = StaggeredGridLayoutManager.this.f2505c.mo4260f();
            }
            this.f2545b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4094a(int i) {
            if (this.f2546c) {
                this.f2545b = StaggeredGridLayoutManager.this.f2505c.mo4252b() - i;
            } else {
                this.f2545b = StaggeredGridLayoutManager.this.f2505c.mo4260f() + i;
            }
        }
    }

    /* renamed from: d */
    private LazySpanLookup.FullSpanItem m3112d(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f2531h = new int[this.f2503a];
        for (int i2 = 0; i2 < this.f2503a; i2++) {
            fullSpanItem.f2531h[i2] = this.f2504b[i2].mo4106b(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: i */
    private int m3117i(int i) {
        int a = this.f2504b[0].mo4099a(i);
        for (int i2 = 1; i2 < this.f2503a; i2++) {
            int a2 = this.f2504b[i2].mo4099a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: b */
    private int m3104b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo4054b(boolean z) {
        int f = this.f2505c.mo4260f();
        int b = this.f2505c.mo4252b();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int d = this.f2505c.mo4257d(childAt);
            if (this.f2505c.mo4250a(childAt) > f && d < b) {
                if (d >= f || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m3100a(C0666b bVar) {
        int i;
        SavedState savedState = this.f2519q;
        int i2 = savedState.f2535h;
        if (i2 > 0) {
            if (i2 == this.f2503a) {
                for (int i3 = 0; i3 < this.f2503a; i3++) {
                    this.f2504b[i3].mo4109c();
                    SavedState savedState2 = this.f2519q;
                    int i4 = savedState2.f2536i[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.f2541n) {
                            i = this.f2505c.mo4252b();
                        } else {
                            i = this.f2505c.mo4260f();
                        }
                        i4 += i;
                    }
                    this.f2504b[i3].mo4113d(i4);
                }
            } else {
                savedState.mo4087b();
                SavedState savedState3 = this.f2519q;
                savedState3.f2533f = savedState3.f2534g;
            }
        }
        SavedState savedState4 = this.f2519q;
        this.f2518p = savedState4.f2542o;
        setReverseLayout(savedState4.f2540m);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.f2519q;
        int i5 = savedState5.f2533f;
        if (i5 != -1) {
            this.f2513k = i5;
            bVar.f2546c = savedState5.f2541n;
        } else {
            bVar.f2546c = this.f2511i;
        }
        SavedState savedState6 = this.f2519q;
        if (savedState6.f2537j > 1) {
            LazySpanLookup lazySpanLookup = this.f2515m;
            lazySpanLookup.f2527a = savedState6.f2538k;
            lazySpanLookup.f2528b = savedState6.f2539l;
        }
    }

    /* renamed from: b */
    private void m3108b(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, boolean z) {
        int f;
        int j = m3119j(Integer.MAX_VALUE);
        if (j != Integer.MAX_VALUE && (f = j - this.f2505c.mo4260f()) > 0) {
            int scrollBy = f - scrollBy(f, vVar, zVar);
            if (z && scrollBy > 0) {
                this.f2505c.mo4251a(-scrollBy);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3105b(int r5, androidx.recyclerview.widget.RecyclerView.C0662z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.i r0 = r4.f2509g
            r1 = 0
            r0.f2693b = r1
            r0.f2694c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo4044b()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f2511i
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.n r5 = r4.f2505c
            int r5 = r5.mo4262g()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.n r5 = r4.f2505c
            int r5 = r5.mo4262g()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.i r0 = r4.f2509g
            androidx.recyclerview.widget.n r3 = r4.f2505c
            int r3 = r3.mo4260f()
            int r3 = r3 - r6
            r0.f2697f = r3
            androidx.recyclerview.widget.i r6 = r4.f2509g
            androidx.recyclerview.widget.n r0 = r4.f2505c
            int r0 = r0.mo4252b()
            int r0 = r0 + r5
            r6.f2698g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.i r0 = r4.f2509g
            androidx.recyclerview.widget.n r3 = r4.f2505c
            int r3 = r3.mo4249a()
            int r3 = r3 + r5
            r0.f2698g = r3
            androidx.recyclerview.widget.i r5 = r4.f2509g
            int r6 = -r6
            r5.f2697f = r6
        L_0x005d:
            androidx.recyclerview.widget.i r5 = r4.f2509g
            r5.f2699h = r1
            r5.f2692a = r2
            androidx.recyclerview.widget.n r6 = r4.f2505c
            int r6 = r6.mo4256d()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.n r6 = r4.f2505c
            int r6 = r6.mo4249a()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f2700i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3105b(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    /* renamed from: g */
    private int m3115g(int i) {
        int a = this.f2504b[0].mo4099a(i);
        for (int i2 = 1; i2 < this.f2503a; i2++) {
            int a2 = this.f2504b[i2].mo4099a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo4057c() != false) goto L_0x015b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3110c(androidx.recyclerview.widget.RecyclerView.C0656v r9, androidx.recyclerview.widget.RecyclerView.C0662z r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f2522t
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f2519q
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f2513k
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4041a()
            if (r1 != 0) goto L_0x0018
            r8.removeAndRecycleAllViews(r9)
            r0.mo4096b()
            return
        L_0x0018:
            boolean r1 = r0.f2548e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f2513k
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f2519q
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo4096b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f2519q
            if (r5 == 0) goto L_0x0037
            r8.m3100a((androidx.recyclerview.widget.StaggeredGridLayoutManager.C0666b) r0)
            goto L_0x003e
        L_0x0037:
            r8.resolveShouldLayoutReverse()
            boolean r5 = r8.f2511i
            r0.f2546c = r5
        L_0x003e:
            r8.mo4055b((androidx.recyclerview.widget.RecyclerView.C0662z) r10, (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0666b) r0)
            r0.f2548e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f2519q
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f2513k
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f2546c
            boolean r6 = r8.f2517o
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.isLayoutRTL()
            boolean r6 = r8.f2518p
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f2515m
            r5.mo4069a()
            r0.f2547d = r4
        L_0x0060:
            int r5 = r8.getChildCount()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f2519q
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f2535h
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f2547d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f2503a
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f2504b
            r5 = r5[r1]
            r5.mo4109c()
            int r5 = r0.f2545b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r8.f2504b
            r6 = r6[r1]
            r6.mo4113d(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2522t
            int[] r1 = r1.f2549f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f2503a
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f2504b
            r5 = r5[r1]
            r5.mo4109c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f2522t
            int[] r6 = r6.f2549f
            r6 = r6[r1]
            r5.mo4113d(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f2503a
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f2504b
            r5 = r5[r1]
            boolean r6 = r8.f2511i
            int r7 = r0.f2545b
            r5.mo4105a((boolean) r6, (int) r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2522t
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f2504b
            r1.mo4095a((androidx.recyclerview.widget.StaggeredGridLayoutManager.C0668d[]) r5)
        L_0x00c9:
            r8.detachAndScrapAttachedViews(r9)
            androidx.recyclerview.widget.i r1 = r8.f2509g
            r1.f2692a = r3
            r8.f2523u = r3
            androidx.recyclerview.widget.n r1 = r8.f2506d
            int r1 = r1.mo4262g()
            r8.mo4050a((int) r1)
            int r1 = r0.f2544a
            r8.m3105b((int) r1, (androidx.recyclerview.widget.RecyclerView.C0662z) r10)
            boolean r1 = r0.f2546c
            if (r1 == 0) goto L_0x00fc
            r8.m3122l(r2)
            androidx.recyclerview.widget.i r1 = r8.f2509g
            r8.m3090a((androidx.recyclerview.widget.RecyclerView.C0656v) r9, (androidx.recyclerview.widget.C0705i) r1, (androidx.recyclerview.widget.RecyclerView.C0662z) r10)
            r8.m3122l(r4)
            androidx.recyclerview.widget.i r1 = r8.f2509g
            int r2 = r0.f2544a
            int r5 = r1.f2695d
            int r2 = r2 + r5
            r1.f2694c = r2
            r8.m3090a((androidx.recyclerview.widget.RecyclerView.C0656v) r9, (androidx.recyclerview.widget.C0705i) r1, (androidx.recyclerview.widget.RecyclerView.C0662z) r10)
            goto L_0x0113
        L_0x00fc:
            r8.m3122l(r4)
            androidx.recyclerview.widget.i r1 = r8.f2509g
            r8.m3090a((androidx.recyclerview.widget.RecyclerView.C0656v) r9, (androidx.recyclerview.widget.C0705i) r1, (androidx.recyclerview.widget.RecyclerView.C0662z) r10)
            r8.m3122l(r2)
            androidx.recyclerview.widget.i r1 = r8.f2509g
            int r2 = r0.f2544a
            int r5 = r1.f2695d
            int r2 = r2 + r5
            r1.f2694c = r2
            r8.m3090a((androidx.recyclerview.widget.RecyclerView.C0656v) r9, (androidx.recyclerview.widget.C0705i) r1, (androidx.recyclerview.widget.RecyclerView.C0662z) r10)
        L_0x0113:
            r8.m3120j()
            int r1 = r8.getChildCount()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f2511i
            if (r1 == 0) goto L_0x0127
            r8.m3098a((androidx.recyclerview.widget.RecyclerView.C0656v) r9, (androidx.recyclerview.widget.RecyclerView.C0662z) r10, (boolean) r4)
            r8.m3108b((androidx.recyclerview.widget.RecyclerView.C0656v) r9, (androidx.recyclerview.widget.RecyclerView.C0662z) r10, (boolean) r3)
            goto L_0x012d
        L_0x0127:
            r8.m3108b((androidx.recyclerview.widget.RecyclerView.C0656v) r9, (androidx.recyclerview.widget.RecyclerView.C0662z) r10, (boolean) r4)
            r8.m3098a((androidx.recyclerview.widget.RecyclerView.C0656v) r9, (androidx.recyclerview.widget.RecyclerView.C0662z) r10, (boolean) r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo4046d()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f2516n
            if (r11 == 0) goto L_0x014b
            int r11 = r8.getChildCount()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f2523u
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo4061g()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f2526x
            r8.removeCallbacks(r11)
            boolean r11 = r8.mo4057c()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.mo4046d()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2522t
            r11.mo4096b()
        L_0x0166:
            boolean r11 = r0.f2546c
            r8.f2517o = r11
            boolean r11 = r8.isLayoutRTL()
            r8.f2518p = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2522t
            r11.mo4096b()
            r8.m3110c(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3110c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    /* renamed from: j */
    private int m3119j(int i) {
        int b = this.f2504b[0].mo4106b(i);
        for (int i2 = 1; i2 < this.f2503a; i2++) {
            int b2 = this.f2504b[i2].mo4106b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4053a(RecyclerView.C0662z zVar, C0666b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!zVar.mo4046d() && (i = this.f2513k) != -1) {
            if (i < 0 || i >= zVar.mo4041a()) {
                this.f2513k = -1;
                this.f2514l = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.f2519q;
                if (savedState == null || savedState.f2533f == -1 || savedState.f2535h < 1) {
                    View findViewByPosition = findViewByPosition(this.f2513k);
                    if (findViewByPosition != null) {
                        if (this.f2511i) {
                            i2 = mo4060f();
                        } else {
                            i2 = mo4059e();
                        }
                        bVar.f2544a = i2;
                        if (this.f2514l != Integer.MIN_VALUE) {
                            if (bVar.f2546c) {
                                bVar.f2545b = (this.f2505c.mo4252b() - this.f2514l) - this.f2505c.mo4250a(findViewByPosition);
                            } else {
                                bVar.f2545b = (this.f2505c.mo4260f() + this.f2514l) - this.f2505c.mo4257d(findViewByPosition);
                            }
                            return true;
                        } else if (this.f2505c.mo4253b(findViewByPosition) > this.f2505c.mo4262g()) {
                            if (bVar.f2546c) {
                                i3 = this.f2505c.mo4252b();
                            } else {
                                i3 = this.f2505c.mo4260f();
                            }
                            bVar.f2545b = i3;
                            return true;
                        } else {
                            int d = this.f2505c.mo4257d(findViewByPosition) - this.f2505c.mo4260f();
                            if (d < 0) {
                                bVar.f2545b = -d;
                                return true;
                            }
                            int b = this.f2505c.mo4252b() - this.f2505c.mo4250a(findViewByPosition);
                            if (b < 0) {
                                bVar.f2545b = b;
                                return true;
                            }
                            bVar.f2545b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i4 = this.f2513k;
                        bVar.f2544a = i4;
                        int i5 = this.f2514l;
                        if (i5 == Integer.MIN_VALUE) {
                            if (m3103b(i4) == 1) {
                                z = true;
                            }
                            bVar.f2546c = z;
                            bVar.mo4093a();
                        } else {
                            bVar.mo4094a(i5);
                        }
                        bVar.f2547d = true;
                    }
                } else {
                    bVar.f2545b = Integer.MIN_VALUE;
                    bVar.f2544a = this.f2513k;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m3106b(View view) {
        for (int i = this.f2503a - 1; i >= 0; i--) {
            this.f2504b[i].mo4111c(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4056b() {
        int b = this.f2504b[0].mo4106b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2503a; i++) {
            if (this.f2504b[i].mo4106b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m3107b(RecyclerView.C0656v vVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f2505c.mo4250a(childAt) <= i && this.f2505c.mo4259e(childAt) <= i) {
                C0667c cVar = (C0667c) childAt.getLayoutParams();
                if (cVar.f2552f) {
                    int i2 = 0;
                    while (i2 < this.f2503a) {
                        if (this.f2504b[i2].f2553a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2503a; i3++) {
                        this.f2504b[i3].mo4120k();
                    }
                } else if (cVar.f2551e.f2553a.size() != 1) {
                    cVar.f2551e.mo4120k();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private int m3103b(int i) {
        if (getChildCount() != 0) {
            if ((i < mo4059e()) != this.f2511i) {
                return -1;
            }
            return 1;
        } else if (this.f2511i) {
            return 1;
        } else {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4050a(int i) {
        this.f2508f = i / this.f2503a;
        this.f2520r = View.MeasureSpec.makeMeasureSpec(i, this.f2506d.mo4256d());
    }

    /* renamed from: a */
    private void m3096a(View view, C0667c cVar, boolean z) {
        if (cVar.f2552f) {
            if (this.f2507e == 1) {
                measureChildWithDecorationsAndMargin(view, this.f2520r, RecyclerView.C0644o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z);
            } else {
                measureChildWithDecorationsAndMargin(view, RecyclerView.C0644o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), cVar.width, true), this.f2520r, z);
            }
        } else if (this.f2507e == 1) {
            measureChildWithDecorationsAndMargin(view, RecyclerView.C0644o.getChildMeasureSpec(this.f2508f, getWidthMode(), 0, cVar.width, false), RecyclerView.C0644o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z);
        } else {
            measureChildWithDecorationsAndMargin(view, RecyclerView.C0644o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), cVar.width, true), RecyclerView.C0644o.getChildMeasureSpec(this.f2508f, getHeightMode(), 0, cVar.height, false), z);
        }
    }

    /* renamed from: c */
    private boolean m3111c(RecyclerView.C0662z zVar, C0666b bVar) {
        int i;
        if (this.f2517o) {
            i = m3114f(zVar.mo4041a());
        } else {
            i = m3113e(zVar.mo4041a());
        }
        bVar.f2544a = i;
        bVar.f2545b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: c */
    private LazySpanLookup.FullSpanItem m3109c(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f2531h = new int[this.f2503a];
        for (int i2 = 0; i2 < this.f2503a; i2++) {
            fullSpanItem.f2531h[i2] = i - this.f2504b[i2].mo4099a(i);
        }
        return fullSpanItem;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4049a(boolean z) {
        int f = this.f2505c.mo4260f();
        int b = this.f2505c.mo4252b();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int d = this.f2505c.mo4257d(childAt);
            int a = this.f2505c.mo4250a(childAt);
            if (a > f && d < b) {
                if (a <= b || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m3098a(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, boolean z) {
        int b;
        int g = m3115g(Integer.MIN_VALUE);
        if (g != Integer.MIN_VALUE && (b = this.f2505c.mo4252b() - g) > 0) {
            int i = b - (-scrollBy(-b, vVar, zVar));
            if (z && i > 0) {
                this.f2505c.mo4251a(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3093a(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2511i
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo4060f()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo4059e()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f2515m
            r4.mo4078e(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f2515m
            r9.mo4075b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f2515m
            r7.mo4071a((int) r8, (int) r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f2515m
            r9.mo4075b(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f2515m
            r9.mo4071a((int) r7, (int) r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f2511i
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo4059e()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo4060f()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.requestLayout()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3093a(int, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: a */
    private int m3090a(RecyclerView.C0656v vVar, C0705i iVar, RecyclerView.C0662z zVar) {
        int i;
        int i2;
        int i3;
        C0668d dVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        RecyclerView.C0656v vVar2 = vVar;
        C0705i iVar2 = iVar;
        ? r9 = 0;
        this.f2512j.set(0, this.f2503a, true);
        if (this.f2509g.f2700i) {
            i = iVar2.f2696e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (iVar2.f2696e == 1) {
                i12 = iVar2.f2698g + iVar2.f2693b;
            } else {
                i12 = iVar2.f2697f - iVar2.f2693b;
            }
            i = i12;
        }
        m3092a(iVar2.f2696e, i);
        if (this.f2511i) {
            i2 = this.f2505c.mo4252b();
        } else {
            i2 = this.f2505c.mo4260f();
        }
        int i13 = i2;
        boolean z2 = false;
        while (iVar.mo4232a(zVar) && (this.f2509g.f2700i || !this.f2512j.isEmpty())) {
            View a = iVar2.mo4231a(vVar2);
            C0667c cVar = (C0667c) a.getLayoutParams();
            int a2 = cVar.mo3958a();
            int d = this.f2515m.mo4077d(a2);
            boolean z3 = d == -1;
            if (z3) {
                dVar = cVar.f2552f ? this.f2504b[r9] : m3091a(iVar2);
                this.f2515m.mo4072a(a2, dVar);
            } else {
                dVar = this.f2504b[d];
            }
            C0668d dVar2 = dVar;
            cVar.f2551e = dVar2;
            if (iVar2.f2696e == 1) {
                addView(a);
            } else {
                addView(a, r9);
            }
            m3096a(a, cVar, (boolean) r9);
            if (iVar2.f2696e == 1) {
                if (cVar.f2552f) {
                    i11 = m3115g(i13);
                } else {
                    i11 = dVar2.mo4099a(i13);
                }
                int b = this.f2505c.mo4253b(a) + i11;
                if (z3 && cVar.f2552f) {
                    LazySpanLookup.FullSpanItem c = m3109c(i11);
                    c.f2530g = -1;
                    c.f2529f = a2;
                    this.f2515m.mo4073a(c);
                }
                i4 = b;
                i5 = i11;
            } else {
                if (cVar.f2552f) {
                    i10 = m3119j(i13);
                } else {
                    i10 = dVar2.mo4106b(i13);
                }
                i5 = i10 - this.f2505c.mo4253b(a);
                if (z3 && cVar.f2552f) {
                    LazySpanLookup.FullSpanItem d2 = m3112d(i10);
                    d2.f2530g = 1;
                    d2.f2529f = a2;
                    this.f2515m.mo4073a(d2);
                }
                i4 = i10;
            }
            if (cVar.f2552f && iVar2.f2695d == -1) {
                if (z3) {
                    this.f2523u = true;
                } else {
                    if (iVar2.f2696e == 1) {
                        z = mo4052a();
                    } else {
                        z = mo4056b();
                    }
                    if (!z) {
                        LazySpanLookup.FullSpanItem c2 = this.f2515m.mo4076c(a2);
                        if (c2 != null) {
                            c2.f2532i = true;
                        }
                        this.f2523u = true;
                    }
                }
            }
            m3095a(a, cVar, iVar2);
            if (!isLayoutRTL() || this.f2507e != 1) {
                if (cVar.f2552f) {
                    i8 = this.f2506d.mo4260f();
                } else {
                    i8 = (dVar2.f2557e * this.f2508f) + this.f2506d.mo4260f();
                }
                i7 = i8;
                i6 = this.f2506d.mo4253b(a) + i8;
            } else {
                if (cVar.f2552f) {
                    i9 = this.f2506d.mo4252b();
                } else {
                    i9 = this.f2506d.mo4252b() - (((this.f2503a - 1) - dVar2.f2557e) * this.f2508f);
                }
                i6 = i9;
                i7 = i9 - this.f2506d.mo4253b(a);
            }
            if (this.f2507e == 1) {
                layoutDecoratedWithMargins(a, i7, i5, i6, i4);
            } else {
                layoutDecoratedWithMargins(a, i5, i7, i4, i6);
            }
            if (cVar.f2552f) {
                m3092a(this.f2509g.f2696e, i);
            } else {
                m3101a(dVar2, this.f2509g.f2696e, i);
            }
            m3099a(vVar2, this.f2509g);
            if (this.f2509g.f2699h && a.hasFocusable()) {
                if (cVar.f2552f) {
                    this.f2512j.clear();
                } else {
                    this.f2512j.set(dVar2.f2557e, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            m3099a(vVar2, this.f2509g);
        }
        if (this.f2509g.f2696e == -1) {
            i3 = this.f2505c.mo4260f() - m3119j(this.f2505c.mo4260f());
        } else {
            i3 = m3115g(this.f2505c.mo4252b()) - this.f2505c.mo4252b();
        }
        if (i3 > 0) {
            return Math.min(iVar2.f2693b, i3);
        }
        return 0;
    }

    /* renamed from: a */
    private void m3095a(View view, C0667c cVar, C0705i iVar) {
        if (iVar.f2696e == 1) {
            if (cVar.f2552f) {
                m3094a(view);
            } else {
                cVar.f2551e.mo4104a(view);
            }
        } else if (cVar.f2552f) {
            m3106b(view);
        } else {
            cVar.f2551e.mo4111c(view);
        }
    }

    /* renamed from: a */
    private void m3099a(RecyclerView.C0656v vVar, C0705i iVar) {
        int i;
        int i2;
        if (iVar.f2692a && !iVar.f2700i) {
            if (iVar.f2693b == 0) {
                if (iVar.f2696e == -1) {
                    m3097a(vVar, iVar.f2698g);
                } else {
                    m3107b(vVar, iVar.f2697f);
                }
            } else if (iVar.f2696e == -1) {
                int i3 = iVar.f2697f;
                int h = i3 - m3116h(i3);
                if (h < 0) {
                    i2 = iVar.f2698g;
                } else {
                    i2 = iVar.f2698g - Math.min(h, iVar.f2693b);
                }
                m3097a(vVar, i2);
            } else {
                int i4 = m3117i(iVar.f2698g) - iVar.f2698g;
                if (i4 < 0) {
                    i = iVar.f2697f;
                } else {
                    i = Math.min(i4, iVar.f2693b) + iVar.f2697f;
                }
                m3107b(vVar, i);
            }
        }
    }

    /* renamed from: a */
    private void m3094a(View view) {
        for (int i = this.f2503a - 1; i >= 0; i--) {
            this.f2504b[i].mo4104a(view);
        }
    }

    /* renamed from: a */
    private void m3092a(int i, int i2) {
        for (int i3 = 0; i3 < this.f2503a; i3++) {
            if (!this.f2504b[i3].f2553a.isEmpty()) {
                m3101a(this.f2504b[i3], i, i2);
            }
        }
    }

    /* renamed from: a */
    private void m3101a(C0668d dVar, int i, int i2) {
        int f = dVar.mo4115f();
        if (i == -1) {
            if (dVar.mo4117h() + f <= i2) {
                this.f2512j.set(dVar.f2557e, false);
            }
        } else if (dVar.mo4116g() - f >= i2) {
            this.f2512j.set(dVar.f2557e, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4052a() {
        int a = this.f2504b[0].mo4099a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2503a; i++) {
            if (this.f2504b[i].mo4099a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m3097a(RecyclerView.C0656v vVar, int i) {
        int childCount = getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            if (this.f2505c.mo4257d(childAt) >= i && this.f2505c.mo4261f(childAt) >= i) {
                C0667c cVar = (C0667c) childAt.getLayoutParams();
                if (cVar.f2552f) {
                    int i2 = 0;
                    while (i2 < this.f2503a) {
                        if (this.f2504b[i2].f2553a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2503a; i3++) {
                        this.f2504b[i3].mo4119j();
                    }
                } else if (cVar.f2551e.f2553a.size() != 1) {
                    cVar.f2551e.mo4119j();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, vVar);
                childCount--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private C0668d m3091a(C0705i iVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m3121k(iVar.f2696e)) {
            i2 = this.f2503a - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f2503a;
            i = 1;
        }
        C0668d dVar = null;
        if (iVar.f2696e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f = this.f2505c.mo4260f();
            while (i2 != i3) {
                C0668d dVar2 = this.f2504b[i2];
                int a = dVar2.mo4099a(f);
                if (a < i4) {
                    dVar = dVar2;
                    i4 = a;
                }
                i2 += i;
            }
            return dVar;
        }
        int i5 = Integer.MIN_VALUE;
        int b = this.f2505c.mo4252b();
        while (i2 != i3) {
            C0668d dVar3 = this.f2504b[i2];
            int b2 = dVar3.mo4106b(b);
            if (b2 > i5) {
                dVar = dVar3;
                i5 = b2;
            }
            i2 += i;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4051a(int i, RecyclerView.C0662z zVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4060f();
            i2 = 1;
        } else {
            i3 = mo4059e();
            i2 = -1;
        }
        this.f2509g.f2692a = true;
        m3105b(i3, zVar);
        m3122l(i2);
        C0705i iVar = this.f2509g;
        iVar.f2694c = i3 + iVar.f2695d;
        iVar.f2693b = Math.abs(i);
    }
}
