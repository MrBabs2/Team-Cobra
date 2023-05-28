package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C0644o implements RecyclerView.C0659y.C0661b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0620a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0621b mLayoutChunkResult;
    private C0622c mLayoutState;
    int mOrientation;
    C0711n mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0619a();

        /* renamed from: f */
        int f2412f;

        /* renamed from: g */
        int f2413g;

        /* renamed from: h */
        boolean f2414h;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        static class C0619a implements Parcelable.Creator<SavedState> {
            C0619a() {
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
        public boolean mo3484a() {
            return this.f2412f >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3485b() {
            this.f2412f = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2412f);
            parcel.writeInt(this.f2413g);
            parcel.writeInt(this.f2414h ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f2412f = parcel.readInt();
            this.f2413g = parcel.readInt();
            this.f2414h = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f2412f = savedState.f2412f;
            this.f2413g = savedState.f2413g;
            this.f2414h = savedState.f2414h;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C0621b {

        /* renamed from: a */
        public int f2420a;

        /* renamed from: b */
        public boolean f2421b;

        /* renamed from: c */
        public boolean f2422c;

        /* renamed from: d */
        public boolean f2423d;

        protected C0621b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3496a() {
            this.f2420a = 0;
            this.f2421b = false;
            this.f2422c = false;
            this.f2423d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C0622c {

        /* renamed from: a */
        boolean f2424a = true;

        /* renamed from: b */
        int f2425b;

        /* renamed from: c */
        int f2426c;

        /* renamed from: d */
        int f2427d;

        /* renamed from: e */
        int f2428e;

        /* renamed from: f */
        int f2429f;

        /* renamed from: g */
        int f2430g;

        /* renamed from: h */
        int f2431h = 0;

        /* renamed from: i */
        int f2432i = 0;

        /* renamed from: j */
        boolean f2433j;

        /* renamed from: k */
        int f2434k;

        /* renamed from: l */
        List<RecyclerView.C0629c0> f2435l = null;

        /* renamed from: m */
        boolean f2436m;

        C0622c() {
        }

        /* renamed from: b */
        private View m2952b() {
            int size = this.f2435l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2435l.get(i).itemView;
                RecyclerView.C0649p pVar = (RecyclerView.C0649p) view.getLayoutParams();
                if (!pVar.mo3960c() && this.f2427d == pVar.mo3958a()) {
                    mo3499a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3500a(RecyclerView.C0662z zVar) {
            int i = this.f2427d;
            return i >= 0 && i < zVar.mo4041a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo3497a(RecyclerView.C0656v vVar) {
            if (this.f2435l != null) {
                return m2952b();
            }
            View d = vVar.mo4005d(this.f2427d);
            this.f2427d += this.f2428e;
            return d;
        }

        /* renamed from: a */
        public void mo3498a() {
            mo3499a((View) null);
        }

        /* renamed from: a */
        public void mo3499a(View view) {
            View b = mo3501b(view);
            if (b == null) {
                this.f2427d = -1;
            } else {
                this.f2427d = ((RecyclerView.C0649p) b.getLayoutParams()).mo3958a();
            }
        }

        /* renamed from: b */
        public View mo3501b(View view) {
            int a;
            int size = this.f2435l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f2435l.get(i2).itemView;
                RecyclerView.C0649p pVar = (RecyclerView.C0649p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo3960c() && (a = (pVar.mo3958a() - this.f2427d) * this.f2428e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.C0662z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C0711n nVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C0716p.m3400a(zVar, nVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.C0662z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C0711n nVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C0716p.m3401a(zVar, nVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.C0662z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        C0711n nVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return C0716p.m3402b(zVar, nVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findFirstReferenceChild(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        return findReferenceChild(vVar, zVar, 0, getChildCount(), zVar.mo4041a());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findLastReferenceChild(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        return findReferenceChild(vVar, zVar, getChildCount() - 1, -1, zVar.mo4041a());
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private View findReferenceChildClosestToEnd(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        if (this.mShouldReverseLayout) {
            return findFirstReferenceChild(vVar, zVar);
        }
        return findLastReferenceChild(vVar, zVar);
    }

    private View findReferenceChildClosestToStart(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        if (this.mShouldReverseLayout) {
            return findLastReferenceChild(vVar, zVar);
        }
        return findFirstReferenceChild(vVar, zVar);
    }

    private int fixLayoutEndGap(int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, boolean z) {
        int b;
        int b2 = this.mOrientationHelper.mo4252b() - i;
        if (b2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-b2, vVar, zVar);
        int i3 = i + i2;
        if (!z || (b = this.mOrientationHelper.mo4252b() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo4251a(b);
        return b + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, boolean z) {
        int f;
        int f2 = i - this.mOrientationHelper.mo4260f();
        if (f2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(f2, vVar, zVar);
        int i3 = i + i2;
        if (!z || (f = i3 - this.mOrientationHelper.mo4260f()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo4251a(-f);
        return i2 - f;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, int i, int i2) {
        RecyclerView.C0656v vVar2 = vVar;
        RecyclerView.C0662z zVar2 = zVar;
        if (zVar.mo4047e() && getChildCount() != 0 && !zVar.mo4046d() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.C0629c0> f = vVar.mo4010f();
            int size = f.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C0629c0 c0Var = f.get(i5);
                if (!c0Var.isRemoved()) {
                    char c = 1;
                    if ((c0Var.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.mOrientationHelper.mo4253b(c0Var.itemView);
                    } else {
                        i4 += this.mOrientationHelper.mo4253b(c0Var.itemView);
                    }
                }
            }
            this.mLayoutState.f2435l = f;
            if (i3 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                C0622c cVar = this.mLayoutState;
                cVar.f2431h = i3;
                cVar.f2426c = 0;
                cVar.mo3498a();
                fill(vVar2, this.mLayoutState, zVar2, false);
            }
            if (i4 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                C0622c cVar2 = this.mLayoutState;
                cVar2.f2431h = i4;
                cVar2.f2426c = 0;
                cVar2.mo3498a();
                fill(vVar2, this.mLayoutState, zVar2, false);
            }
            this.mLayoutState.f2435l = null;
        }
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo4257d(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.C0656v vVar, C0622c cVar) {
        if (cVar.f2424a && !cVar.f2436m) {
            int i = cVar.f2430g;
            int i2 = cVar.f2432i;
            if (cVar.f2429f == -1) {
                recycleViewsFromEnd(vVar, i, i2);
            } else {
                recycleViewsFromStart(vVar, i, i2);
            }
        }
    }

    private void recycleChildren(RecyclerView.C0656v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, vVar);
                i--;
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.C0656v vVar, int i, int i2) {
        int childCount = getChildCount();
        if (i >= 0) {
            int a = (this.mOrientationHelper.mo4249a() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.mo4257d(childAt) < a || this.mOrientationHelper.mo4261f(childAt) < a) {
                        recycleChildren(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.mo4257d(childAt2) < a || this.mOrientationHelper.mo4261f(childAt2) < a) {
                    recycleChildren(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.C0656v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                int i4 = childCount - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View childAt = getChildAt(i5);
                    if (this.mOrientationHelper.mo4250a(childAt) > i3 || this.mOrientationHelper.mo4259e(childAt) > i3) {
                        recycleChildren(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (this.mOrientationHelper.mo4250a(childAt2) > i3 || this.mOrientationHelper.mo4259e(childAt2) > i3) {
                    recycleChildren(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, C0620a aVar) {
        View view;
        int i;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.mo3492a(focusedChild, zVar)) {
            aVar.mo3494b(focusedChild, getPosition(focusedChild));
            return true;
        } else if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        } else {
            if (aVar.f2418d) {
                view = findReferenceChildClosestToEnd(vVar, zVar);
            } else {
                view = findReferenceChildClosestToStart(vVar, zVar);
            }
            if (view == null) {
                return false;
            }
            aVar.mo3491a(view, getPosition(view));
            if (!zVar.mo4046d() && supportsPredictiveItemAnimations()) {
                if (this.mOrientationHelper.mo4257d(view) >= this.mOrientationHelper.mo4252b() || this.mOrientationHelper.mo4250a(view) < this.mOrientationHelper.mo4260f()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f2418d) {
                        i = this.mOrientationHelper.mo4252b();
                    } else {
                        i = this.mOrientationHelper.mo4260f();
                    }
                    aVar.f2417c = i;
                }
            }
            return true;
        }
    }

    private boolean updateAnchorFromPendingData(RecyclerView.C0662z zVar, C0620a aVar) {
        int i;
        int i2;
        boolean z = false;
        if (!zVar.mo4046d() && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= zVar.mo4041a()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                aVar.f2416b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.mo3484a()) {
                    boolean z2 = this.mPendingSavedState.f2414h;
                    aVar.f2418d = z2;
                    if (z2) {
                        aVar.f2417c = this.mOrientationHelper.mo4252b() - this.mPendingSavedState.f2413g;
                    } else {
                        aVar.f2417c = this.mOrientationHelper.mo4260f() + this.mPendingSavedState.f2413g;
                    }
                    return true;
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition == null) {
                        if (getChildCount() > 0) {
                            if ((this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout) {
                                z = true;
                            }
                            aVar.f2418d = z;
                        }
                        aVar.mo3490a();
                    } else if (this.mOrientationHelper.mo4253b(findViewByPosition) > this.mOrientationHelper.mo4262g()) {
                        aVar.mo3490a();
                        return true;
                    } else if (this.mOrientationHelper.mo4257d(findViewByPosition) - this.mOrientationHelper.mo4260f() < 0) {
                        aVar.f2417c = this.mOrientationHelper.mo4260f();
                        aVar.f2418d = false;
                        return true;
                    } else if (this.mOrientationHelper.mo4252b() - this.mOrientationHelper.mo4250a(findViewByPosition) < 0) {
                        aVar.f2417c = this.mOrientationHelper.mo4252b();
                        aVar.f2418d = true;
                        return true;
                    } else {
                        if (aVar.f2418d) {
                            i2 = this.mOrientationHelper.mo4250a(findViewByPosition) + this.mOrientationHelper.mo4263h();
                        } else {
                            i2 = this.mOrientationHelper.mo4257d(findViewByPosition);
                        }
                        aVar.f2417c = i2;
                    }
                    return true;
                } else {
                    boolean z3 = this.mShouldReverseLayout;
                    aVar.f2418d = z3;
                    if (z3) {
                        aVar.f2417c = this.mOrientationHelper.mo4252b() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f2417c = this.mOrientationHelper.mo4260f() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, C0620a aVar) {
        if (!updateAnchorFromPendingData(zVar, aVar) && !updateAnchorFromChildren(vVar, zVar, aVar)) {
            aVar.mo3490a();
            aVar.f2416b = this.mStackFromEnd ? zVar.mo4041a() - 1 : 0;
        }
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.C0662z zVar) {
        int i3;
        this.mLayoutState.f2436m = resolveIsInfinite();
        this.mLayoutState.f2429f = i;
        int[] iArr = this.mReusableIntPair;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(zVar, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i == 1) {
            z2 = true;
        }
        this.mLayoutState.f2431h = z2 ? max2 : max;
        C0622c cVar = this.mLayoutState;
        if (!z2) {
            max = max2;
        }
        cVar.f2432i = max;
        if (z2) {
            this.mLayoutState.f2431h += this.mOrientationHelper.mo4254c();
            View childClosestToEnd = getChildClosestToEnd();
            C0622c cVar2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i4 = -1;
            }
            cVar2.f2428e = i4;
            C0622c cVar3 = this.mLayoutState;
            int position = getPosition(childClosestToEnd);
            C0622c cVar4 = this.mLayoutState;
            cVar3.f2427d = position + cVar4.f2428e;
            cVar4.f2425b = this.mOrientationHelper.mo4250a(childClosestToEnd);
            i3 = this.mOrientationHelper.mo4250a(childClosestToEnd) - this.mOrientationHelper.mo4252b();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f2431h += this.mOrientationHelper.mo4260f();
            C0622c cVar5 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i4 = -1;
            }
            cVar5.f2428e = i4;
            C0622c cVar6 = this.mLayoutState;
            int position2 = getPosition(childClosestToStart);
            C0622c cVar7 = this.mLayoutState;
            cVar6.f2427d = position2 + cVar7.f2428e;
            cVar7.f2425b = this.mOrientationHelper.mo4257d(childClosestToStart);
            i3 = (-this.mOrientationHelper.mo4257d(childClosestToStart)) + this.mOrientationHelper.mo4260f();
        }
        C0622c cVar8 = this.mLayoutState;
        cVar8.f2426c = i2;
        if (z) {
            cVar8.f2426c = i2 - i3;
        }
        this.mLayoutState.f2430g = i3;
    }

    private void updateLayoutStateToFillEnd(C0620a aVar) {
        updateLayoutStateToFillEnd(aVar.f2416b, aVar.f2417c);
    }

    private void updateLayoutStateToFillStart(C0620a aVar) {
        updateLayoutStateToFillStart(aVar.f2416b, aVar.f2417c);
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* access modifiers changed from: protected */
    public void calculateExtraLayoutSpace(RecyclerView.C0662z zVar, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(zVar);
        if (this.mLayoutState.f2429f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C0662z zVar, RecyclerView.C0644o.C0647c cVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
            collectPrefetchPositionsForLayoutState(zVar, this.mLayoutState, cVar);
        }
    }

    public void collectInitialPrefetchPositions(int i, RecyclerView.C0644o.C0647c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        int i3 = -1;
        if (savedState == null || !savedState.mo3484a()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z = savedState2.f2414h;
            i2 = savedState2.f2412f;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            cVar.mo3957a(i2, 0);
            i2 += i3;
        }
    }

    /* access modifiers changed from: package-private */
    public void collectPrefetchPositionsForLayoutState(RecyclerView.C0662z zVar, C0622c cVar, RecyclerView.C0644o.C0647c cVar2) {
        int i = cVar.f2427d;
        if (i >= 0 && i < zVar.mo4041a()) {
            cVar2.mo3957a(i, Math.max(0, cVar.f2430g));
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
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
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
    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.mOrientation == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.mOrientation == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.mOrientation == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* access modifiers changed from: package-private */
    public C0622c createLayoutState() {
        return new C0622c();
    }

    /* access modifiers changed from: package-private */
    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    /* access modifiers changed from: package-private */
    public int fill(RecyclerView.C0656v vVar, C0622c cVar, RecyclerView.C0662z zVar, boolean z) {
        int i = cVar.f2426c;
        int i2 = cVar.f2430g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f2430g = i2 + i;
            }
            recycleByLayoutState(vVar, cVar);
        }
        int i3 = cVar.f2426c + cVar.f2431h;
        C0621b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f2436m && i3 <= 0) || !cVar.mo3500a(zVar)) {
                break;
            }
            bVar.mo3496a();
            layoutChunk(vVar, zVar, cVar, bVar);
            if (!bVar.f2421b) {
                cVar.f2425b += bVar.f2420a * cVar.f2429f;
                if (!bVar.f2422c || cVar.f2435l != null || !zVar.mo4046d()) {
                    int i4 = cVar.f2426c;
                    int i5 = bVar.f2420a;
                    cVar.f2426c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f2430g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f2420a;
                    cVar.f2430g = i7;
                    int i8 = cVar.f2426c;
                    if (i8 < 0) {
                        cVar.f2430g = i7 + i8;
                    }
                    recycleByLayoutState(vVar, cVar);
                }
                if (z && bVar.f2423d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2426c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    /* access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    /* access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    /* access modifiers changed from: package-private */
    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo4257d(getChildAt(i)) < this.mOrientationHelper.mo4260f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.mo4297a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.mo4297a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.mo4297a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.mo4297a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    public View findReferenceChild(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, int i, int i2, int i3) {
        ensureLayoutState();
        int f = this.mOrientationHelper.mo4260f();
        int b = this.mOrientationHelper.mo4252b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.C0649p) childAt.getLayoutParams()).mo3960c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.mo4257d(childAt) < b && this.mOrientationHelper.mo4250a(childAt) >= f) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public RecyclerView.C0649p generateDefaultLayoutParams() {
        return new RecyclerView.C0649p(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.C0662z zVar) {
        if (zVar.mo4045c()) {
            return this.mOrientationHelper.mo4262g();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* access modifiers changed from: package-private */
    public void layoutChunk(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, C0622c cVar, C0621b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo3497a(vVar);
        if (a == null) {
            bVar.f2421b = true;
            return;
        }
        RecyclerView.C0649p pVar = (RecyclerView.C0649p) a.getLayoutParams();
        if (cVar.f2435l == null) {
            if (this.mShouldReverseLayout == (cVar.f2429f == -1)) {
                addView(a);
            } else {
                addView(a, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f2429f == -1)) {
                addDisappearingView(a);
            } else {
                addDisappearingView(a, 0);
            }
        }
        measureChildWithMargins(a, 0, 0);
        bVar.f2420a = this.mOrientationHelper.mo4253b(a);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                i5 = getWidth() - getPaddingRight();
                i4 = i5 - this.mOrientationHelper.mo4255c(a);
            } else {
                i4 = getPaddingLeft();
                i5 = this.mOrientationHelper.mo4255c(a) + i4;
            }
            if (cVar.f2429f == -1) {
                int i6 = cVar.f2425b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f2420a;
            } else {
                int i7 = cVar.f2425b;
                i3 = i7;
                i2 = i5;
                i = bVar.f2420a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int c = this.mOrientationHelper.mo4255c(a) + paddingTop;
            if (cVar.f2429f == -1) {
                int i8 = cVar.f2425b;
                i2 = i8;
                i3 = paddingTop;
                i = c;
                i4 = i8 - bVar.f2420a;
            } else {
                int i9 = cVar.f2425b;
                i3 = paddingTop;
                i2 = bVar.f2420a + i9;
                i = c;
                i4 = i9;
            }
        }
        layoutDecoratedWithMargins(a, i4, i3, i2, i);
        if (pVar.mo3960c() || pVar.mo3959b()) {
            bVar.f2422c = true;
        }
        bVar.f2423d = a.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    public void onAnchorReady(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar, C0620a aVar, int i) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0656v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(vVar);
            vVar.mo3985a();
        }
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        int convertFocusDirectionToLayoutDirection;
        View view2;
        View view3;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (((float) this.mOrientationHelper.mo4262g()) * MAX_SCROLL_FACTOR), false, zVar);
        C0622c cVar = this.mLayoutState;
        cVar.f2430g = Integer.MIN_VALUE;
        cVar.f2424a = false;
        fill(vVar, cVar, zVar, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            view3 = getChildClosestToStart();
        } else {
            view3 = getChildClosestToEnd();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public void onLayoutChildren(RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View findViewByPosition;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && zVar.mo4041a() == 0) {
            removeAndRecycleAllViews(vVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.mo3484a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f2412f;
        }
        ensureLayoutState();
        this.mLayoutState.f2424a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        if (!this.mAnchorInfo.f2419e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.mo3493b();
            C0620a aVar = this.mAnchorInfo;
            aVar.f2418d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(vVar, zVar, aVar);
            this.mAnchorInfo.f2419e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo4257d(focusedChild) >= this.mOrientationHelper.mo4252b() || this.mOrientationHelper.mo4250a(focusedChild) <= this.mOrientationHelper.mo4260f())) {
            this.mAnchorInfo.mo3494b(focusedChild, getPosition(focusedChild));
        }
        C0622c cVar = this.mLayoutState;
        cVar.f2429f = cVar.f2434k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(zVar, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.mo4260f();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo4254c();
        if (!(!zVar.mo4046d() || (i6 = this.mPendingScrollPosition) == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE || (findViewByPosition = findViewByPosition(i6)) == null)) {
            if (this.mShouldReverseLayout) {
                i7 = this.mOrientationHelper.mo4252b() - this.mOrientationHelper.mo4250a(findViewByPosition);
                i8 = this.mPendingScrollPositionOffset;
            } else {
                i8 = this.mOrientationHelper.mo4257d(findViewByPosition) - this.mOrientationHelper.mo4260f();
                i7 = this.mPendingScrollPositionOffset;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        if (!this.mAnchorInfo.f2418d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i9 = 1;
        }
        onAnchorReady(vVar, zVar, this.mAnchorInfo, i9);
        detachAndScrapAttachedViews(vVar);
        this.mLayoutState.f2436m = resolveIsInfinite();
        this.mLayoutState.f2433j = zVar.mo4046d();
        this.mLayoutState.f2432i = 0;
        C0620a aVar2 = this.mAnchorInfo;
        if (aVar2.f2418d) {
            updateLayoutStateToFillStart(aVar2);
            C0622c cVar2 = this.mLayoutState;
            cVar2.f2431h = max;
            fill(vVar, cVar2, zVar, false);
            C0622c cVar3 = this.mLayoutState;
            i2 = cVar3.f2425b;
            int i11 = cVar3.f2427d;
            int i12 = cVar3.f2426c;
            if (i12 > 0) {
                max2 += i12;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C0622c cVar4 = this.mLayoutState;
            cVar4.f2431h = max2;
            cVar4.f2427d += cVar4.f2428e;
            fill(vVar, cVar4, zVar, false);
            C0622c cVar5 = this.mLayoutState;
            i = cVar5.f2425b;
            int i13 = cVar5.f2426c;
            if (i13 > 0) {
                updateLayoutStateToFillStart(i11, i2);
                C0622c cVar6 = this.mLayoutState;
                cVar6.f2431h = i13;
                fill(vVar, cVar6, zVar, false);
                i2 = this.mLayoutState.f2425b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar2);
            C0622c cVar7 = this.mLayoutState;
            cVar7.f2431h = max2;
            fill(vVar, cVar7, zVar, false);
            C0622c cVar8 = this.mLayoutState;
            i = cVar8.f2425b;
            int i14 = cVar8.f2427d;
            int i15 = cVar8.f2426c;
            if (i15 > 0) {
                max += i15;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C0622c cVar9 = this.mLayoutState;
            cVar9.f2431h = max;
            cVar9.f2427d += cVar9.f2428e;
            fill(vVar, cVar9, zVar, false);
            C0622c cVar10 = this.mLayoutState;
            i2 = cVar10.f2425b;
            int i16 = cVar10.f2426c;
            if (i16 > 0) {
                updateLayoutStateToFillEnd(i14, i);
                C0622c cVar11 = this.mLayoutState;
                cVar11.f2431h = i16;
                fill(vVar, cVar11, zVar, false);
                i = this.mLayoutState.f2425b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap = fixLayoutEndGap(i, vVar, zVar, true);
                i4 = i2 + fixLayoutEndGap;
                i3 = i + fixLayoutEndGap;
                i5 = fixLayoutStartGap(i4, vVar, zVar, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i2, vVar, zVar, true);
                i4 = i2 + fixLayoutStartGap;
                i3 = i + fixLayoutStartGap;
                i5 = fixLayoutEndGap(i3, vVar, zVar, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        layoutForPredictiveAnimations(vVar, zVar, i2, i);
        if (!zVar.mo4046d()) {
            this.mOrientationHelper.mo4264i();
        } else {
            this.mAnchorInfo.mo3493b();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void onLayoutCompleted(RecyclerView.C0662z zVar) {
        super.onLayoutCompleted(zVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.mo3493b();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.f2414h = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.f2413g = this.mOrientationHelper.mo4252b() - this.mOrientationHelper.mo4250a(childClosestToEnd);
                savedState.f2412f = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.f2412f = getPosition(childClosestToStart);
                savedState.f2413g = this.mOrientationHelper.mo4257d(childClosestToStart) - this.mOrientationHelper.mo4260f();
            }
        } else {
            savedState.mo3485b();
        }
        return savedState;
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c = position < position2 ? (char) 1 : 65535;
        if (this.mShouldReverseLayout) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4252b() - (this.mOrientationHelper.mo4257d(view2) + this.mOrientationHelper.mo4253b(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4252b() - this.mOrientationHelper.mo4250a(view2));
            }
        } else if (c == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4257d(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4250a(view2) - this.mOrientationHelper.mo4253b(view));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo4256d() == 0 && this.mOrientationHelper.mo4249a() == 0;
    }

    /* access modifiers changed from: package-private */
    public int scrollBy(int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2424a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, zVar);
        C0622c cVar = this.mLayoutState;
        int fill = cVar.f2430g + fill(vVar, cVar, zVar, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.mo4251a(-i);
        this.mLayoutState.f2434k = i;
        return i;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, vVar, zVar);
    }

    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.mo3485b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.mo3485b();
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.C0656v vVar, RecyclerView.C0662z zVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, vVar, zVar);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i != this.mOrientation || this.mOrientationHelper == null) {
                C0711n a = C0711n.m3338a(this, i);
                this.mOrientationHelper = a;
                this.mAnchorInfo.f2415a = a;
                this.mOrientation = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0662z zVar, int i) {
        C0706j jVar = new C0706j(recyclerView.getContext());
        jVar.setTargetPosition(i);
        startSmoothScroll(jVar);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    /* access modifiers changed from: package-private */
    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        boolean z = true;
        if (getChildCount() >= 1) {
            int position = getPosition(getChildAt(0));
            int d = this.mOrientationHelper.mo4257d(getChildAt(0));
            if (this.mShouldReverseLayout) {
                int i = 1;
                while (i < getChildCount()) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int d2 = this.mOrientationHelper.mo4257d(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder sb = new StringBuilder();
                        sb.append("detected invalid position. loc invalid? ");
                        if (d2 >= d) {
                            z = false;
                        }
                        sb.append(z);
                        throw new RuntimeException(sb.toString());
                    } else if (d2 <= d) {
                        i++;
                    } else {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            int i2 = 1;
            while (i2 < getChildCount()) {
                View childAt2 = getChildAt(i2);
                int position3 = getPosition(childAt2);
                int d3 = this.mOrientationHelper.mo4257d(childAt2);
                if (position3 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    if (d3 >= d) {
                        z = false;
                    }
                    sb2.append(z);
                    throw new RuntimeException(sb2.toString());
                } else if (d3 >= d) {
                    i2++;
                } else {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0620a();
        this.mLayoutChunkResult = new C0621b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.f2426c = this.mOrientationHelper.mo4252b() - i2;
        this.mLayoutState.f2428e = this.mShouldReverseLayout ? -1 : 1;
        C0622c cVar = this.mLayoutState;
        cVar.f2427d = i;
        cVar.f2429f = 1;
        cVar.f2425b = i2;
        cVar.f2430g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.f2426c = i2 - this.mOrientationHelper.mo4260f();
        C0622c cVar = this.mLayoutState;
        cVar.f2427d = i;
        cVar.f2428e = this.mShouldReverseLayout ? 1 : -1;
        C0622c cVar2 = this.mLayoutState;
        cVar2.f2429f = -1;
        cVar2.f2425b = i2;
        cVar2.f2430g = Integer.MIN_VALUE;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C0620a {

        /* renamed from: a */
        C0711n f2415a;

        /* renamed from: b */
        int f2416b;

        /* renamed from: c */
        int f2417c;

        /* renamed from: d */
        boolean f2418d;

        /* renamed from: e */
        boolean f2419e;

        C0620a() {
            mo3493b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3490a() {
            int i;
            if (this.f2418d) {
                i = this.f2415a.mo4252b();
            } else {
                i = this.f2415a.mo4260f();
            }
            this.f2417c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3493b() {
            this.f2416b = -1;
            this.f2417c = Integer.MIN_VALUE;
            this.f2418d = false;
            this.f2419e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2416b + ", mCoordinate=" + this.f2417c + ", mLayoutFromEnd=" + this.f2418d + ", mValid=" + this.f2419e + '}';
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3492a(View view, RecyclerView.C0662z zVar) {
            RecyclerView.C0649p pVar = (RecyclerView.C0649p) view.getLayoutParams();
            return !pVar.mo3960c() && pVar.mo3958a() >= 0 && pVar.mo3958a() < zVar.mo4041a();
        }

        /* renamed from: b */
        public void mo3494b(View view, int i) {
            int h = this.f2415a.mo4263h();
            if (h >= 0) {
                mo3491a(view, i);
                return;
            }
            this.f2416b = i;
            if (this.f2418d) {
                int b = (this.f2415a.mo4252b() - h) - this.f2415a.mo4250a(view);
                this.f2417c = this.f2415a.mo4252b() - b;
                if (b > 0) {
                    int b2 = this.f2417c - this.f2415a.mo4253b(view);
                    int f = this.f2415a.mo4260f();
                    int min = b2 - (f + Math.min(this.f2415a.mo4257d(view) - f, 0));
                    if (min < 0) {
                        this.f2417c += Math.min(b, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int d = this.f2415a.mo4257d(view);
            int f2 = d - this.f2415a.mo4260f();
            this.f2417c = d;
            if (f2 > 0) {
                int b3 = (this.f2415a.mo4252b() - Math.min(0, (this.f2415a.mo4252b() - h) - this.f2415a.mo4250a(view))) - (d + this.f2415a.mo4253b(view));
                if (b3 < 0) {
                    this.f2417c -= Math.min(f2, -b3);
                }
            }
        }

        /* renamed from: a */
        public void mo3491a(View view, int i) {
            if (this.f2418d) {
                this.f2417c = this.f2415a.mo4250a(view) + this.f2415a.mo4263h();
            } else {
                this.f2417c = this.f2415a.mo4257d(view);
            }
            this.f2416b = i;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0620a();
        this.mLayoutChunkResult = new C0621b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.C0644o.C0648d properties = RecyclerView.C0644o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2455a);
        setReverseLayout(properties.f2457c);
        setStackFromEnd(properties.f2458d);
    }
}
