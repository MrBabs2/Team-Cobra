package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
/* compiled from: LinearSnapHelper */
public class C0707k extends C0718r {
    private static final float INVALID_DISTANCE = 1.0f;
    private C0711n mHorizontalHelper;
    private C0711n mVerticalHelper;

    private float computeDistancePerChild(RecyclerView.C0644o oVar, C0711n nVar) {
        int max;
        int childCount = oVar.getChildCount();
        if (childCount == 0) {
            return INVALID_DISTANCE;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = oVar.getChildAt(i3);
            int position = oVar.getPosition(childAt);
            if (position != -1) {
                if (position < i) {
                    view = childAt;
                    i = position;
                }
                if (position > i2) {
                    view2 = childAt;
                    i2 = position;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(nVar.mo4250a(view), nVar.mo4250a(view2)) - Math.min(nVar.mo4257d(view), nVar.mo4257d(view2))) == 0) {
            return INVALID_DISTANCE;
        }
        return (((float) max) * INVALID_DISTANCE) / ((float) ((i2 - i) + 1));
    }

    private int distanceToCenter(RecyclerView.C0644o oVar, View view, C0711n nVar) {
        return (nVar.mo4257d(view) + (nVar.mo4253b(view) / 2)) - (nVar.mo4260f() + (nVar.mo4262g() / 2));
    }

    private int estimateNextPositionDiffForFling(RecyclerView.C0644o oVar, C0711n nVar, int i, int i2) {
        int[] calculateScrollDistance = calculateScrollDistance(i, i2);
        float computeDistancePerChild = computeDistancePerChild(oVar, nVar);
        if (computeDistancePerChild <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1]) ? calculateScrollDistance[0] : calculateScrollDistance[1])) / computeDistancePerChild);
    }

    private View findCenterView(RecyclerView.C0644o oVar, C0711n nVar) {
        int childCount = oVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int f = nVar.mo4260f() + (nVar.mo4262g() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = oVar.getChildAt(i2);
            int abs = Math.abs((nVar.mo4257d(childAt) + (nVar.mo4253b(childAt) / 2)) - f);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    private C0711n getHorizontalHelper(RecyclerView.C0644o oVar) {
        C0711n nVar = this.mHorizontalHelper;
        if (nVar == null || nVar.f2702a != oVar) {
            this.mHorizontalHelper = C0711n.m3337a(oVar);
        }
        return this.mHorizontalHelper;
    }

    private C0711n getVerticalHelper(RecyclerView.C0644o oVar) {
        C0711n nVar = this.mVerticalHelper;
        if (nVar == null || nVar.f2702a != oVar) {
            this.mVerticalHelper = C0711n.m3339b(oVar);
        }
        return this.mVerticalHelper;
    }

    public int[] calculateDistanceToFinalSnap(RecyclerView.C0644o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(oVar, view, getHorizontalHelper(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = distanceToCenter(oVar, view, getVerticalHelper(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View findSnapView(RecyclerView.C0644o oVar) {
        if (oVar.canScrollVertically()) {
            return findCenterView(oVar, getVerticalHelper(oVar));
        }
        if (oVar.canScrollHorizontally()) {
            return findCenterView(oVar, getHorizontalHelper(oVar));
        }
        return null;
    }

    public int findTargetSnapPosition(RecyclerView.C0644o oVar, int i, int i2) {
        int itemCount;
        View findSnapView;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.C0659y.C0661b) || (itemCount = oVar.getItemCount()) == 0 || (findSnapView = findSnapView(oVar)) == null || (position = oVar.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.C0659y.C0661b) oVar).computeScrollVectorForPosition(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (oVar.canScrollHorizontally()) {
            i4 = estimateNextPositionDiffForFling(oVar, getHorizontalHelper(oVar), i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.canScrollVertically()) {
            i5 = estimateNextPositionDiffForFling(oVar, getVerticalHelper(oVar), 0, i2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = position + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= itemCount ? itemCount - 1 : i6;
    }
}
