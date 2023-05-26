package p015cm.aptoide.p016pt.store.view;

import android.os.Bundle;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p123rx.C5368e;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.GetStoreEndlessFragment */
public abstract class GetStoreEndlessFragment<T extends BaseV7EndlessResponse> extends StoreTabWidgetsGridRecyclerFragment {
    protected EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private C2185V7<T, ? extends Endless> v7request;

    private void setupEndless(C2185V7<T, ? extends Endless> v7, C5378b<T> bVar, boolean z) {
        getRecyclerView().clearOnScrollListeners();
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2 = this.endlessRecyclerOnScrollListener;
        if (endlessRecyclerOnScrollListener2 != null) {
            endlessRecyclerOnScrollListener2.stopLoading();
        }
        this.endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), v7, bVar, getErrorRequestListener());
        getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
        this.endlessRecyclerOnScrollListener.onLoadMore(z, z);
    }

    /* access modifiers changed from: protected */
    public abstract C5378b<T> buildAction();

    /* access modifiers changed from: protected */
    public C5368e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2) {
        C2185V7<T, ? extends Endless> buildRequest = buildRequest(z, str);
        this.v7request = buildRequest;
        setupEndless(buildRequest, buildAction(), z);
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract C2185V7<T, ? extends Endless> buildRequest(boolean z, String str);

    /* access modifiers changed from: protected */
    public ErrorRequestListener getErrorRequestListener() {
        return new C4268b0(this);
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        if (!z) {
            setupEndless(this.v7request, buildAction(), z2);
        }
    }

    public void onDestroyView() {
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2 = this.endlessRecyclerOnScrollListener;
        if (endlessRecyclerOnScrollListener2 != null) {
            endlessRecyclerOnScrollListener2.stopLoading();
            this.endlessRecyclerOnScrollListener = null;
        }
        super.onDestroyView();
    }
}
