package p015cm.aptoide.p016pt.view.recycler;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.C0706j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cm.aptoide.pt.view.recycler.LinearLayoutManagerWithSmoothScroller */
public class LinearLayoutManagerWithSmoothScroller extends LinearLayoutManager {

    /* renamed from: cm.aptoide.pt.view.recycler.LinearLayoutManagerWithSmoothScroller$TopSnappedSmoothScroller */
    private class TopSnappedSmoothScroller extends C0706j {
        TopSnappedSmoothScroller(Context context) {
            super(context);
        }

        public PointF computeScrollVectorForPosition(int i) {
            return LinearLayoutManagerWithSmoothScroller.this.computeScrollVectorForPosition(i);
        }

        /* access modifiers changed from: protected */
        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    public LinearLayoutManagerWithSmoothScroller(Context context) {
        super(context, 1, false);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0662z zVar, int i) {
        TopSnappedSmoothScroller topSnappedSmoothScroller = new TopSnappedSmoothScroller(recyclerView.getContext());
        topSnappedSmoothScroller.setTargetPosition(i);
        startSmoothScroll(topSnappedSmoothScroller);
    }

    public LinearLayoutManagerWithSmoothScroller(Context context, int i, boolean z) {
        super(context, i, z);
    }
}
