package p015cm.aptoide.p016pt.store.view;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerFragmentWithDecorator;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p123rx.C5368e;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.TopStoresFragment */
public class TopStoresFragment extends GridRecyclerFragmentWithDecorator<BaseAdapter> implements Endless {
    public static final int STORES_LIMIT_PER_REQUEST = 10;
    public static String TAG = TopStoresFragment.class.getSimpleName();
    @Inject
    AnalyticsManager analyticsManager;
    private SuccessRequestListener<ListStores> listener = new C4383x1(this);
    @Inject
    NavigationTracker navigationTracker;
    private int offset = 0;
    private StoreAnalytics storeAnalytics;

    /* access modifiers changed from: private */
    /* renamed from: createDisplayables */
    public List<Displayable> mo14759a(ListStores listStores) {
        ArrayList arrayList = new ArrayList();
        for (Store gridStoreDisplayable : listStores.getDataList().getList()) {
            arrayList.add(new GridStoreDisplayable(gridStoreDisplayable, "Add Store Dialog Top Stores", this.storeAnalytics));
        }
        return arrayList;
    }

    private void fetchStores() {
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), this.requestFactoryCdnPool.newListStoresRequest(this.offset, 10), this.listener, C4380w1.f7531a);
        getRecyclerView().addOnScrollListener(endlessRecyclerOnScrollListener);
        endlessRecyclerOnScrollListener.onLoadMore(false, false);
    }

    public static TopStoresFragment newInstance() {
        return new TopStoresFragment();
    }

    /* renamed from: b */
    public /* synthetic */ void mo14761b(ListStores listStores) {
        C5368e.m10240a(new C4374u1(this, listStores)).mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18655a(new C4386y1(this), (C5378b<Throwable>) C4377v1.f7523f);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_with_toolbar_no_theme;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(TopStoresFragment.class.getSimpleName());
    }

    public Integer getLimit() {
        return 10;
    }

    public int getOffset() {
        return this.offset;
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        fetchStores();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        setHasOptionsMenu(true);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle((int) C1086R.string.top_stores_fragment_title);
        toolbar.setLogo((int) C1086R.C1087drawable.logo_toolbar);
    }

    public void setupViews() {
        super.setupViews();
        setupToolbar();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14760a(List list) {
        addDisplayables(list);
    }
}
