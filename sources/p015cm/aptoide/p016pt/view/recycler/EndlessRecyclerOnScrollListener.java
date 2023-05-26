package p015cm.aptoide.p016pt.view.recycler;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.view.recycler.displayable.ProgressBarDisplayable;
import p123rx.C5375k;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.recycler.EndlessRecyclerOnScrollListener */
public class EndlessRecyclerOnScrollListener extends RecyclerView.C0653t {
    private final BaseAdapter adapter;
    private final boolean bypassCache;
    private final boolean bypassServerCache;
    private boolean endCallbackCalled;
    private final ErrorRequestListener errorRequestListener;
    private boolean firstCallbackCalled;
    private int firstVisibleItem;
    private int lastTotal;
    private boolean loading;
    private final MultiLangPatch multiLangPatch;
    private int offset;
    private C5377a onEndOfListReachedListener;
    private final List<OnEndlessFinish> onEndlessFinishList;
    private BooleanAction onFirstLoadListener;
    private RecyclerViewPositionHelper recyclerViewPositionHelper;
    private boolean stableData;
    private C5375k subscription;
    private C5378b successRequestListener;
    private int total;
    private int totalItemCount;
    private C2185V7<? extends BaseV7EndlessResponse, ? extends Endless> v7request;
    private int visibleItemCount;
    private final int visibleThreshold;

    /* renamed from: cm.aptoide.pt.view.recycler.EndlessRecyclerOnScrollListener$BooleanAction */
    public interface BooleanAction<T extends BaseV7Response> {
        boolean call(T t);
    }

    /* renamed from: cm.aptoide.pt.view.recycler.EndlessRecyclerOnScrollListener$OnEndlessFinish */
    public interface OnEndlessFinish {
        void onEndlessFinish(EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener);
    }

    public <T extends BaseV7EndlessResponse> EndlessRecyclerOnScrollListener(BaseAdapter baseAdapter, C2185V7<T, ? extends Endless> v7, C5378b<T> bVar, ErrorRequestListener errorRequestListener2) {
        this.stableData = false;
        this.adapter = baseAdapter;
        this.v7request = v7;
        this.successRequestListener = bVar;
        this.errorRequestListener = errorRequestListener2;
        this.visibleThreshold = 6;
        this.bypassCache = false;
        this.onFirstLoadListener = null;
        this.onEndOfListReachedListener = null;
        this.endCallbackCalled = false;
        this.firstCallbackCalled = false;
        this.multiLangPatch = new MultiLangPatch();
        this.onEndlessFinishList = new LinkedList();
        this.bypassServerCache = false;
    }

    /* access modifiers changed from: private */
    public void handleLoadMoreErrorAfterWebRequest(Throwable th) {
        th.printStackTrace();
        popProgressBarDisplayable();
        this.errorRequestListener.onError(th);
        this.loading = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: handleLoadMoreResponseAfterWebRequest */
    public void mo15656a(boolean z, BaseV7EndlessResponse baseV7EndlessResponse) {
        if (baseV7EndlessResponse.hasData()) {
            boolean hasStableTotal = baseV7EndlessResponse.hasStableTotal();
            this.stableData = hasStableTotal;
            if (hasStableTotal) {
                this.total = baseV7EndlessResponse.getTotal();
                this.offset = baseV7EndlessResponse.getNextSize();
            } else {
                int i = this.total;
                int total2 = baseV7EndlessResponse.getTotal();
                this.lastTotal = total2;
                this.total = i + total2;
                this.offset += baseV7EndlessResponse.getNextSize();
            }
            ((Endless) this.v7request.getBody()).setOffset(this.offset);
        }
        BooleanAction booleanAction = this.onFirstLoadListener;
        if (booleanAction == null || this.firstCallbackCalled) {
            this.successRequestListener.call(baseV7EndlessResponse);
        } else {
            if (!booleanAction.call(baseV7EndlessResponse)) {
                this.successRequestListener.call(baseV7EndlessResponse);
            }
            this.firstCallbackCalled = true;
        }
        this.loading = false;
        RecyclerViewPositionHelper recyclerViewPositionHelper2 = this.recyclerViewPositionHelper;
        if (recyclerViewPositionHelper2 != null) {
            this.totalItemCount = recyclerViewPositionHelper2.getItemCount();
        }
        if (!hasMoreElements()) {
            C5377a aVar = this.onEndOfListReachedListener;
            if (aVar != null && !this.endCallbackCalled) {
                aVar.call();
                this.endCallbackCalled = true;
            }
            List<OnEndlessFinish> list = this.onEndlessFinishList;
            if (list != null) {
                for (OnEndlessFinish next : list) {
                    if (next != null) {
                        next.onEndlessFinish(this);
                    }
                }
            }
        }
        if (shouldLoadMore()) {
            onLoadMore(z, this.bypassServerCache);
        }
    }

    private boolean isNearTheEndOfTheList() {
        return this.totalItemCount - this.visibleItemCount < (this.firstVisibleItem + this.visibleThreshold) - 1;
    }

    private void popProgressBarDisplayable() {
        if (this.adapter.getItemCount() > 0) {
            BaseAdapter baseAdapter = this.adapter;
            if (baseAdapter.getDisplayable(baseAdapter.getItemCount() - 1) instanceof ProgressBarDisplayable) {
                this.adapter.popDisplayable();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.recyclerViewPositionHelper;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean shouldLoadMore() {
        /*
            r1 = this;
            boolean r0 = r1.loading
            if (r0 != 0) goto L_0x001e
            cm.aptoide.pt.view.recycler.RecyclerViewPositionHelper r0 = r1.recyclerViewPositionHelper
            if (r0 == 0) goto L_0x001e
            androidx.recyclerview.widget.RecyclerView r0 = r0.recyclerView
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L_0x001e
            boolean r0 = r1.isNearTheEndOfTheList()
            if (r0 == 0) goto L_0x001e
            boolean r0 = r1.hasMoreElements()
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener.shouldLoadMore():boolean");
    }

    /* renamed from: a */
    public /* synthetic */ void mo15655a(BaseV7EndlessResponse baseV7EndlessResponse) {
        popProgressBarDisplayable();
        this.multiLangPatch.updateTotal(baseV7EndlessResponse);
    }

    public void addOnEndlessFinishListener(OnEndlessFinish onEndlessFinish) {
        this.onEndlessFinishList.add(onEndlessFinish);
    }

    public BaseAdapter getAdapter() {
        return this.adapter;
    }

    /* access modifiers changed from: protected */
    public boolean hasMoreElements() {
        if (this.stableData) {
            if (this.offset < this.total) {
                return true;
            }
        } else if (this.lastTotal != 0) {
            return true;
        }
        return false;
    }

    public void onLoadMore(boolean z, boolean z2) {
        if (!this.loading) {
            this.loading = true;
            this.adapter.addDisplayable(new ProgressBarDisplayable());
            C2185V7<? extends BaseV7EndlessResponse, ? extends Endless> v7 = this.v7request;
            if (v7 != null) {
                this.subscription = v7.observe(z, z2).mo18644a(C5376a.m10346b()).mo18664b(new C4671i(this)).mo18655a(new C4670h(this, z), (C5378b<Throwable>) new C4672j(this));
            }
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        if (this.recyclerViewPositionHelper == null) {
            this.recyclerViewPositionHelper = RecyclerViewPositionHelper.createHelper(recyclerView);
        }
        this.visibleItemCount = recyclerView.getChildCount();
        int findFirstVisibleItemPosition = this.recyclerViewPositionHelper.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1) {
            findFirstVisibleItemPosition = 0;
        }
        this.firstVisibleItem = findFirstVisibleItemPosition;
        if (shouldLoadMore()) {
            onLoadMore(this.bypassCache, this.bypassServerCache);
        }
    }

    public void removeListeners() {
        this.onFirstLoadListener = null;
        this.onEndOfListReachedListener = null;
        this.successRequestListener = null;
    }

    public void reset(C2185V7<? extends BaseV7EndlessResponse, ? extends Endless> v7) {
        this.v7request = v7;
        this.multiLangPatch.updateOffset();
        this.offset = -1;
        this.total = 0;
    }

    public void stopLoading() {
        C5375k kVar = this.subscription;
        if (kVar != null && !kVar.isUnsubscribed()) {
            this.subscription.unsubscribe();
        }
        popProgressBarDisplayable();
    }

    public <T extends BaseV7EndlessResponse> EndlessRecyclerOnScrollListener(BaseAdapter baseAdapter, C2185V7<T, ? extends Endless> v7, C5378b<T> bVar, ErrorRequestListener errorRequestListener2, int i, boolean z, BooleanAction<T> booleanAction, C5377a aVar) {
        this.stableData = false;
        this.multiLangPatch = new MultiLangPatch();
        this.onEndlessFinishList = new LinkedList();
        this.adapter = baseAdapter;
        this.v7request = v7;
        this.successRequestListener = bVar;
        this.errorRequestListener = errorRequestListener2;
        this.visibleThreshold = i;
        this.bypassCache = z;
        this.onFirstLoadListener = booleanAction;
        this.onEndOfListReachedListener = aVar;
        this.endCallbackCalled = false;
        this.firstCallbackCalled = false;
        this.bypassServerCache = false;
    }

    public <T extends BaseV7EndlessResponse> EndlessRecyclerOnScrollListener(BaseAdapter baseAdapter, C2185V7<T, ? extends Endless> v7, C5378b<T> bVar, ErrorRequestListener errorRequestListener2, boolean z, boolean z2) {
        this.stableData = false;
        this.adapter = baseAdapter;
        this.v7request = v7;
        this.successRequestListener = bVar;
        this.errorRequestListener = errorRequestListener2;
        this.bypassServerCache = z2;
        this.visibleThreshold = 6;
        this.bypassCache = z;
        this.onFirstLoadListener = null;
        this.onEndOfListReachedListener = null;
        this.endCallbackCalled = false;
        this.firstCallbackCalled = false;
        this.multiLangPatch = new MultiLangPatch();
        this.onEndlessFinishList = new LinkedList();
    }

    public EndlessRecyclerOnScrollListener(BaseAdapter baseAdapter) {
        this.stableData = false;
        this.adapter = baseAdapter;
        this.v7request = null;
        this.successRequestListener = null;
        this.errorRequestListener = null;
        this.visibleThreshold = 0;
        this.bypassCache = false;
        this.onFirstLoadListener = null;
        this.onEndOfListReachedListener = null;
        this.endCallbackCalled = false;
        this.firstCallbackCalled = false;
        this.multiLangPatch = new MultiLangPatch();
        this.onEndlessFinishList = new LinkedList();
        this.bypassServerCache = false;
    }
}
