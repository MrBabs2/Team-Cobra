package p015cm.aptoide.p016pt.view.p031rx;

import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.rx.RxEndlessRecyclerView */
public final class RxEndlessRecyclerView {
    private RxEndlessRecyclerView() {
        new AssertionError("No instances!");
    }

    public static C5368e<Integer> loadMore(RecyclerView recyclerView, BaseAdapter baseAdapter) {
        return C5368e.m10241a(new EndlessRecyclerViewLoadMoreOnSubscribe(recyclerView, baseAdapter));
    }
}
