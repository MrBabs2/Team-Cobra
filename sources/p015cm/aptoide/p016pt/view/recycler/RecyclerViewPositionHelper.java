package p015cm.aptoide.p016pt.view.recycler;

import android.view.View;
import androidx.recyclerview.widget.C0711n;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cm.aptoide.pt.view.recycler.RecyclerViewPositionHelper */
public class RecyclerViewPositionHelper {
    final RecyclerView.C0644o layoutManager;
    final RecyclerView recyclerView;

    RecyclerViewPositionHelper(RecyclerView recyclerView2) {
        this.recyclerView = recyclerView2;
        this.layoutManager = recyclerView2.getLayoutManager();
    }

    public static RecyclerViewPositionHelper createHelper(RecyclerView recyclerView2) {
        if (recyclerView2 != null) {
            return new RecyclerViewPositionHelper(recyclerView2);
        }
        throw new NullPointerException("Recycler View is null");
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, this.layoutManager.getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(findOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, this.layoutManager.getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(this.layoutManager.getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(this.layoutManager.getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(findOneVisibleChild);
    }

    /* access modifiers changed from: package-private */
    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        C0711n nVar;
        if (this.layoutManager.canScrollVertically()) {
            nVar = C0711n.m3339b(this.layoutManager);
        } else {
            nVar = C0711n.m3337a(this.layoutManager);
        }
        int f = nVar.mo4260f();
        int b = nVar.mo4252b();
        int i3 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = this.layoutManager.getChildAt(i);
            int d = nVar.mo4257d(childAt);
            int a = nVar.mo4250a(childAt);
            if (d < b && a > f) {
                if (!z) {
                    return childAt;
                }
                if (d >= f && a <= b) {
                    return childAt;
                }
                if (z2 && view == null) {
                    view = childAt;
                }
            }
            i += i3;
        }
        return view;
    }

    public int getChildCount() {
        RecyclerView.C0644o oVar = this.layoutManager;
        if (oVar == null) {
            return 0;
        }
        return oVar.getChildCount();
    }

    public int getItemCount() {
        RecyclerView.C0644o oVar = this.layoutManager;
        if (oVar == null) {
            return 0;
        }
        return oVar.getItemCount();
    }
}
