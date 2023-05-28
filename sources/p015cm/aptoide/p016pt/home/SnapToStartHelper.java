package p015cm.aptoide.p016pt.home;

import android.view.View;
import androidx.recyclerview.widget.C0707k;
import androidx.recyclerview.widget.C0711n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cm.aptoide.pt.home.SnapToStartHelper */
public class SnapToStartHelper extends C0707k {
    private C0711n horizontalHelper;
    private C0711n verticalHelper;

    private int distanceToStart(View view, C0711n nVar) {
        return nVar.mo4257d(view) - nVar.mo4260f();
    }

    private C0711n getHorizontalHelper(RecyclerView.C0644o oVar) {
        if (this.horizontalHelper == null) {
            this.horizontalHelper = C0711n.m3337a(oVar);
        }
        return this.horizontalHelper;
    }

    private View getStartView(RecyclerView.C0644o oVar, C0711n nVar) {
        if (!(oVar instanceof LinearLayoutManager)) {
            return super.findSnapView(oVar);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        boolean z = linearLayoutManager.findLastCompletelyVisibleItemPosition() == oVar.getItemCount() - 1;
        if (findFirstVisibleItemPosition == -1 || z) {
            return null;
        }
        View findViewByPosition = oVar.findViewByPosition(findFirstVisibleItemPosition);
        if (nVar.mo4250a(findViewByPosition) >= nVar.mo4253b(findViewByPosition) / 2 && nVar.mo4250a(findViewByPosition) > 0) {
            return findViewByPosition;
        }
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == oVar.getItemCount() - 1) {
            return null;
        }
        return oVar.findViewByPosition(findFirstVisibleItemPosition + 1);
    }

    private C0711n getVerticalHelper(RecyclerView.C0644o oVar) {
        if (this.verticalHelper == null) {
            this.verticalHelper = C0711n.m3339b(oVar);
        }
        return this.verticalHelper;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        super.attachToRecyclerView(recyclerView);
    }

    public int[] calculateDistanceToFinalSnap(RecyclerView.C0644o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = distanceToStart(view, getHorizontalHelper(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = distanceToStart(view, getVerticalHelper(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View findSnapView(RecyclerView.C0644o oVar) {
        if (!(oVar instanceof LinearLayoutManager)) {
            return super.findSnapView(oVar);
        }
        if (oVar.canScrollHorizontally()) {
            return getStartView(oVar, getHorizontalHelper(oVar));
        }
        return getStartView(oVar, getVerticalHelper(oVar));
    }
}
