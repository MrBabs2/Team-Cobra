package p015cm.aptoide.p016pt.view.p031rx;

import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: cm.aptoide.pt.view.rx.EndlessRecyclerViewLoadMoreOnSubscribe */
public class EndlessRecyclerViewLoadMoreOnSubscribe implements C5368e.C5370a<Integer> {
    private final BaseAdapter adapter;
    /* access modifiers changed from: private */
    public final RecyclerView recyclerView;

    public EndlessRecyclerViewLoadMoreOnSubscribe(RecyclerView recyclerView2, BaseAdapter baseAdapter) {
        this.recyclerView = recyclerView2;
        this.adapter = baseAdapter;
    }

    public void call(final C12475j<? super Integer> jVar) {
        C12476a.verifyMainThread();
        final C46791 r0 = new EndlessRecyclerOnScrollListener(this.adapter) {
            /* access modifiers changed from: protected */
            public boolean hasMoreElements() {
                return true;
            }

            public void onLoadMore(boolean z, boolean z2) {
                if (!jVar.isUnsubscribed()) {
                    jVar.onNext(Integer.valueOf(getAdapter().getItemCount()));
                }
            }
        };
        this.recyclerView.addOnScrollListener(r0);
        jVar.add(new C12476a() {
            /* access modifiers changed from: protected */
            public void onUnsubscribe() {
                EndlessRecyclerViewLoadMoreOnSubscribe.this.recyclerView.removeOnScrollListener(r0);
            }
        });
    }
}
