package p015cm.aptoide.p016pt.app.view;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.errors.ErrorView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.home.ScrollableView;
import p015cm.aptoide.p016pt.home.bundles.BundlesAdapter;
import p015cm.aptoide.p016pt.home.bundles.ads.AdHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.ads.AdsBundlesViewHolderFactory;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.misc.ErrorHomeBundle;
import p015cm.aptoide.p016pt.home.bundles.misc.ProgressBundle;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.Translator;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;
import p050l.p106r.p107a.C5189c;
import p112n.p118g.p301a.p303b.p306b.p307a.C10677c;
import p112n.p118g.p301a.p303b.p308c.p309a.C10681a;
import p112n.p118g.p301a.p303b.p308c.p309a.C10685c;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.app.view.MoreBundleFragment */
public class MoreBundleFragment extends NavigationTrackFragment implements MoreBundleView, ScrollableView {
    private static final String MORE_LIST_STATE_KEY = "cm.aptoide.pt.more.ListState";
    private static final int VISIBLE_THRESHOLD = 1;
    private C12871b<AdHomeEvent> adClickedEvents;
    private BundlesAdapter adapter;
    private RecyclerView bundlesList;
    @Inject
    CaptionBackgroundPainter captionBackgroundPainter;
    private ErrorView errorView;
    private LinearLayoutManager layoutManager;
    private Parcelable listState;
    @Inject
    @Named
    String marketName;
    private C12871b<Boolean> notifyItemsAdded;
    private DecimalFormat oneDecimalFormatter;
    @Inject
    MoreBundlePresenter presenter;
    private ProgressBar progressBar;
    private C5189c swipeRefreshLayout;
    @Inject
    ThemeManager themeAttributeProvider;
    private Toolbar toolbar;
    private View toolbarElement;
    private C12871b<HomeEvent> uiEventsListener;

    /* renamed from: a */
    static /* synthetic */ Boolean m4997a(Boolean bool) {
        return bool;
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m5000c(HomeEvent homeEvent) {
        return Boolean.valueOf(homeEvent.getType().equals(HomeEvent.Type.MORE) || homeEvent.getType().equals(HomeEvent.Type.MORE_TOP));
    }

    private boolean isEndReached() {
        return this.layoutManager.getItemCount() - this.layoutManager.findLastVisibleItemPosition() <= 1;
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo7538a(C10681a aVar) {
        return Boolean.valueOf(isEndReached());
    }

    public C5368e<AdHomeEvent> adClicked() {
        return this.adClickedEvents;
    }

    public C5368e<AppHomeEvent> appClicked() {
        return this.uiEventsListener.mo18681d(C1695me.f4259f).mo18638a(AppHomeEvent.class);
    }

    public C5368e<HomeEvent> bundleScrolled() {
        return this.uiEventsListener.mo18681d(C1767qe.f4344f).mo18634a(200, TimeUnit.MILLISECONDS);
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(MoreBundleFragment.class.getSimpleName(), "", StoreContext.home.name());
    }

    public void hideLoading() {
        this.bundlesList.setVisibility(0);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(8);
        this.swipeRefreshLayout.setVisibility(0);
    }

    public void hideRefresh() {
        this.swipeRefreshLayout.setRefreshing(false);
    }

    public void hideShowMore() {
        BundlesAdapter bundlesAdapter = this.adapter;
        if (bundlesAdapter != null) {
            bundlesAdapter.removeLoadMore();
        }
    }

    public boolean isAtTop() {
        return ((LinearLayoutManager) this.bundlesList.getLayoutManager()).findFirstVisibleItemPosition() == 0;
    }

    public C5368e<HomeEvent> moreClicked() {
        return this.uiEventsListener.mo18681d(C1731oe.f4301f);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.uiEventsListener = C12871b.m41468p();
        this.adClickedEvents = C12871b.m41468p();
        this.notifyItemsAdded = C12871b.m41468p();
        this.oneDecimalFormatter = new DecimalFormat("0.0");
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.more_bundles_view, viewGroup, false);
    }

    public void onDestroy() {
        this.uiEventsListener = null;
        this.oneDecimalFormatter = null;
        this.adClickedEvents = null;
        super.onDestroy();
    }

    public void onDestroyView() {
        this.listState = this.bundlesList.getLayoutManager().onSaveInstanceState();
        this.bundlesList = null;
        this.adapter = null;
        this.layoutManager = null;
        this.swipeRefreshLayout = null;
        this.errorView = null;
        this.progressBar = null;
        this.toolbar = null;
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.bundlesList;
        if (recyclerView != null) {
            bundle.putParcelable(MORE_LIST_STATE_KEY, recyclerView.getLayoutManager().onSaveInstanceState());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getFragmentComponent(bundle).inject(this);
        if (bundle != null && bundle.containsKey(MORE_LIST_STATE_KEY)) {
            this.listState = bundle.getParcelable(MORE_LIST_STATE_KEY);
            bundle.putParcelable(MORE_LIST_STATE_KEY, (Parcelable) null);
        }
        this.bundlesList = (RecyclerView) view.findViewById(C1086R.C1088id.more_bundles_list);
        this.toolbarElement = view.findViewById(C1086R.C1088id.action_bar);
        this.errorView = (ErrorView) view.findViewById(C1086R.C1088id.error_view);
        this.progressBar = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar);
        this.swipeRefreshLayout = (C5189c) view.findViewById(C1086R.C1088id.more_refresh_layout);
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        ArrayList arrayList = new ArrayList();
        ProgressBundle progressBundle = new ProgressBundle();
        ErrorHomeBundle errorHomeBundle = new ErrorHomeBundle();
        DecimalFormat decimalFormat = this.oneDecimalFormatter;
        C12871b<HomeEvent> bVar = this.uiEventsListener;
        this.adapter = new BundlesAdapter(arrayList, progressBundle, errorHomeBundle, decimalFormat, bVar, new AdsBundlesViewHolderFactory(bVar, this.adClickedEvents, decimalFormat, this.marketName), this.captionBackgroundPainter, this.marketName, this.themeAttributeProvider);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.layoutManager = linearLayoutManager;
        this.bundlesList.setLayoutManager(linearLayoutManager);
        this.bundlesList.setAdapter(this.adapter);
        C0076d dVar = (C0076d) getActivity();
        if (getArguments().getBoolean(StoreTabGridRecyclerFragment.BundleCons.TOOLBAR, true)) {
            dVar.setSupportActionBar(this.toolbar);
            C0069a supportActionBar = dVar.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo188d(true);
            }
        } else {
            this.toolbarElement.setVisibility(8);
        }
        attachPresenter(this.presenter);
    }

    public C5368e<Object> reachesBottom() {
        return C5368e.m10254b(C10685c.m36211a(this.bundlesList).mo18694j(new C1659ke(this)), (C5368e<R>) this.notifyItemsAdded).mo18656b().mo18681d(C1713ne.f4280f).mo18638a(Object.class);
    }

    public C5368e<Void> refreshes() {
        return C10677c.m36206a(this.swipeRefreshLayout);
    }

    public C5368e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    public void scrollToTop() {
        if (((LinearLayoutManager) this.bundlesList.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            this.bundlesList.scrollToPosition(10);
        }
        this.bundlesList.smoothScrollToPosition(0);
    }

    public void setToolbarInfo(String str) {
        this.toolbar.setTitle((CharSequence) Translator.translate(str, getContext(), ""));
        this.toolbar.setLogo((int) C1086R.C1087drawable.logo_toolbar);
    }

    public void showBundles(List<HomeBundle> list) {
        this.adapter.update(list);
        if (this.listState != null) {
            this.bundlesList.getLayoutManager().onRestoreInstanceState(this.listState);
            this.listState = null;
        }
    }

    public void showGenericError() {
        this.errorView.setError(ErrorView.Error.GENERIC);
        this.errorView.setVisibility(0);
        this.bundlesList.setVisibility(8);
        this.progressBar.setVisibility(8);
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    public void showLoadMore() {
        this.adapter.addLoadMore();
    }

    public void showLoading() {
        this.bundlesList.setVisibility(8);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(0);
    }

    public void showMoreHomeBundles(List<HomeBundle> list) {
        this.adapter.add(list);
        this.notifyItemsAdded.onNext(false);
    }

    public void showNetworkError() {
        this.errorView.setError(ErrorView.Error.NO_NETWORK);
        this.errorView.setVisibility(0);
        this.bundlesList.setVisibility(8);
        this.progressBar.setVisibility(8);
        if (this.swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    public void updateEditorialCards() {
        this.adapter.updateEditorials();
        if (this.listState != null) {
            this.bundlesList.getLayoutManager().onRestoreInstanceState(this.listState);
            this.listState = null;
        }
    }

    public C5368e<HomeEvent> visibleBundles() {
        return C10685c.m36211a(this.bundlesList).mo18662b(C5376a.m10346b()).mo18694j(new C1785re(this)).mo18681d(C1677le.f4232f).mo18656b().mo18694j(new C1749pe(this));
    }

    /* renamed from: b */
    public /* synthetic */ Integer mo7541b(C10681a aVar) {
        return Integer.valueOf(this.layoutManager.findFirstVisibleItemPosition());
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m4999b(Integer num) {
        return Boolean.valueOf(num.intValue() != -1);
    }

    /* renamed from: a */
    public /* synthetic */ HomeEvent mo7537a(Integer num) {
        return new HomeEvent(this.adapter.getBundle(num.intValue()), num.intValue(), (HomeEvent.Type) null);
    }
}
