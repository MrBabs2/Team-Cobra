package p015cm.aptoide.p016pt.view.app;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.errors.ErrorView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.BackButtonFragment;
import p050l.p106r.p107a.C5189c;
import p112n.p118g.p301a.p303b.p308c.p309a.C10681a;
import p112n.p118g.p301a.p303b.p308c.p309a.C10685c;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.view.app.ListStoreAppsFragment */
public class ListStoreAppsFragment extends BackButtonFragment implements ListStoreAppsView {
    private static final String LIST_STATE_KEY = "cm.aptoide.pt.ListStoreAppsFragment.ListState";
    public static final int LOAD_THRESHOLD = 5;
    public static final String STORE_ID = "cm.aptoide.pt.ListStoreAppsFragment.storeId";
    /* access modifiers changed from: private */
    public ListStoreAppsAdapter adapter;
    @Inject
    AppCenter appCenter;
    private C12871b<Application> appClicks;
    private ErrorView errorView;
    private GridLayoutManager layoutManager;
    private Parcelable listState;
    @Inject
    ListStoreAppsNavigator listStoreAppsNavigator;
    private RecyclerView recyclerView;
    private C12871b<Void> refreshEvent;
    private ProgressBar startingLoadingLayout;
    private long storeId;
    private C5189c swipeRefreshLayout;

    private boolean isEndReached() {
        return this.layoutManager.getItemCount() - this.layoutManager.findLastVisibleItemPosition() <= 5;
    }

    public static Fragment newInstance(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(STORE_ID, j);
        ListStoreAppsFragment listStoreAppsFragment = new ListStoreAppsFragment();
        listStoreAppsFragment.setArguments(bundle);
        return listStoreAppsFragment;
    }

    private void showApps() {
        this.recyclerView.setVisibility(0);
        this.startingLoadingLayout.setVisibility(8);
        this.errorView.setVisibility(8);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo15456a(C10681a aVar) {
        return Boolean.valueOf(isEndReached());
    }

    public void addApps(List<Application> list) {
        this.adapter.addApps(list);
        showApps();
    }

    /* renamed from: b */
    public /* synthetic */ void mo15458b() {
        this.refreshEvent.onNext(null);
    }

    public C5368e<Application> getAppClick() {
        return this.appClicks;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(ListStoreAppsFragment.class.getSimpleName());
    }

    public C12871b<Void> getRefreshEvent() {
        return this.refreshEvent;
    }

    public C5368e<Void> getRetryEvent() {
        return this.errorView.retryClick();
    }

    public int getSpanSize(int i) {
        return (int) ((AptoideUtils.ScreenU.getScreenWidthInDip((WindowManager) getContext().getSystemService("window"), getContext().getResources()) / 360.0f) * ((float) i));
    }

    public void hideLoading() {
        this.adapter.hideLoading();
    }

    public void hideRefreshLoading() {
        this.swipeRefreshLayout.setRefreshing(false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.storeId = getArguments().getLong(STORE_ID);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        return layoutInflater.inflate(C1086R.layout.list_store_apps_fragment_layout, viewGroup, false);
    }

    public void onDestroyView() {
        this.listState = this.layoutManager.onSaveInstanceState();
        this.recyclerView = null;
        this.adapter = null;
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.C0616a());
        this.layoutManager = null;
        this.startingLoadingLayout = null;
        this.swipeRefreshLayout = null;
        this.appClicks = null;
        this.refreshEvent = null;
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.adapter != null) {
            bundle.putParcelable(LIST_STATE_KEY, this.layoutManager.onSaveInstanceState());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.containsKey(LIST_STATE_KEY)) {
            this.listState = bundle.getParcelable(LIST_STATE_KEY);
            bundle.putParcelable(LIST_STATE_KEY, (Parcelable) null);
        }
        this.appClicks = C12871b.m41468p();
        this.refreshEvent = C12871b.m41468p();
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(C1086R.C1088id.recycler_view);
        this.recyclerView = recyclerView2;
        recyclerView2.setVisibility(8);
        this.swipeRefreshLayout = (C5189c) view.findViewById(C1086R.C1088id.swipe_container);
        this.errorView = (ErrorView) view.findViewById(C1086R.C1088id.error_view);
        this.swipeRefreshLayout.setOnRefreshListener(new C4509b1(this));
        setupToolbar(view);
        ListStoreAppsAdapter listStoreAppsAdapter = new ListStoreAppsAdapter(new ArrayList(), this.appClicks);
        this.adapter = listStoreAppsAdapter;
        this.recyclerView.setAdapter(listStoreAppsAdapter);
        final int spanSize = getSpanSize(3);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), spanSize);
        this.layoutManager = gridLayoutManager;
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.C0618c() {
            public int getSpanSize(int i) {
                if (ListStoreAppsFragment.this.adapter == null || !(ListStoreAppsFragment.this.adapter.getItem(i) instanceof AppLoading)) {
                    return 1;
                }
                return spanSize;
            }
        });
        this.recyclerView.setLayoutManager(this.layoutManager);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar);
        this.startingLoadingLayout = progressBar;
        progressBar.setVisibility(0);
        this.recyclerView.addItemDecoration(new RecyclerView.C0643n() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
                if (ListStoreAppsFragment.this.getHost() != null) {
                    int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, ListStoreAppsFragment.this.getResources());
                    rect.set(pixelsForDip, pixelsForDip, pixelsForDip, pixelsForDip);
                }
            }
        });
        attachPresenter(new ListStoreAppsPresenter(this, this.storeId, C5376a.m10346b(), this.appCenter, CrashReport.getInstance(), this.listStoreAppsNavigator, spanSize * 10));
    }

    public C5368e<Object> reachesBottom() {
        return C10685c.m36211a(this.recyclerView).mo18656b().mo18681d(new C4513c1(this)).mo18638a(Object.class);
    }

    public void setApps(List<Application> list) {
        this.adapter.setApps(list);
        Parcelable parcelable = this.listState;
        if (parcelable != null) {
            this.layoutManager.onRestoreInstanceState(parcelable);
            this.listState = null;
        }
        showApps();
    }

    public void setupToolbar(View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        ((C0076d) getActivity()).setSupportActionBar(toolbar);
        C0069a supportActionBar = ((C0076d) getActivity()).getSupportActionBar();
        supportActionBar.mo188d(true);
        toolbar.setTitle((int) C1086R.string.list_store_apps_fragment_title);
        supportActionBar.mo182a(toolbar.getTitle());
    }

    public void showGenericError() {
        this.errorView.setError(ErrorView.Error.GENERIC);
        this.errorView.setVisibility(0);
        this.startingLoadingLayout.setVisibility(8);
        this.recyclerView.setVisibility(8);
    }

    public void showLoading() {
        this.adapter.showLoading();
    }

    public void showNetworkError() {
        this.errorView.setError(ErrorView.Error.NO_NETWORK);
        this.errorView.setVisibility(0);
        this.startingLoadingLayout.setVisibility(8);
        this.recyclerView.setVisibility(8);
    }

    public void showStartingLoading() {
        this.startingLoadingLayout.setVisibility(0);
        this.recyclerView.setVisibility(8);
        this.errorView.setVisibility(8);
    }
}
