package p015cm.aptoide.p016pt.reviews;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.FullReview;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListFullReviews;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListFullReviewsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeFragment;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.reviews.LatestReviewsFragment */
public class LatestReviewsFragment extends GridRecyclerSwipeFragment {
    private static final int REVIEWS_LIMIT = 25;
    private static final String STORE_CONTEXT = "STORE_CONTEXT";
    private static final String STORE_ID = "storeId";
    @Inject
    AnalyticsManager analyticsManager;
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private Converter.Factory converterFactory;
    private List<Displayable> displayables;
    private EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private OkHttpClient httpClient;
    @Inject
    NavigationTracker navigationTracker;
    private StoreAnalytics storeAnalytics;
    private StoreContext storeContext;
    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private long storeId;

    public static LatestReviewsFragment newInstance(long j, StoreContext storeContext2) {
        LatestReviewsFragment latestReviewsFragment = new LatestReviewsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("storeId", j);
        bundle.putSerializable("STORE_CONTEXT", storeContext2);
        latestReviewsFragment.setArguments(bundle);
        return latestReviewsFragment;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14011a(ListFullReviews listFullReviews) {
        List<FullReview> list = listFullReviews.getDataList().getList();
        this.displayables = new LinkedList();
        for (FullReview rowReviewDisplayable : list) {
            this.displayables.add(new RowReviewDisplayable(rowReviewDisplayable, this.storeAnalytics));
        }
        addDisplayables(this.displayables);
    }

    public void bindViews(View view) {
        super.bindViews(view);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public ScreenTagHistory getHistoryTracker() {
        String simpleName = LatestReviewsFragment.class.getSimpleName();
        StoreContext storeContext2 = this.storeContext;
        return ScreenTagHistory.Builder.build(simpleName, "", storeContext2 != null ? storeContext2.name() : null);
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        boolean z3 = z2;
        super.load(z, z2, bundle);
        if (z || z3) {
            long j = this.storeId;
            ListFullReviewsRequest of = ListFullReviewsRequest.m5262of(j, 25, 0, StoreUtils.getStoreCredentials(j, this.storeCredentialsProvider), this.baseBodyInterceptor, this.httpClient, this.converterFactory, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
            C3962c cVar = new C3962c(this);
            getRecyclerView().clearOnScrollListeners();
            this.endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), of, cVar, C3961b.f7052a, true, z2);
            getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
            this.endlessRecyclerOnScrollListener.onLoadMore(z3, z3);
            return;
        }
        getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.storeId = bundle.getLong("storeId", -1);
        this.storeContext = (StoreContext) bundle.getSerializable("STORE_CONTEXT");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.baseBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }
}
