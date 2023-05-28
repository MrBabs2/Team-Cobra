package p015cm.aptoide.p016pt.reviews;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.comments.ListFullReviewsSuccessRequestListener;
import p015cm.aptoide.p016pt.comments.view.CommentDisplayable;
import p015cm.aptoide.p016pt.comments.view.CommentsAdapter;
import p015cm.aptoide.p016pt.comments.view.CommentsReadMoreDisplayable;
import p015cm.aptoide.p016pt.comments.view.ItemCommentAdderView;
import p015cm.aptoide.p016pt.comments.view.RateAndReviewCommentDisplayable;
import p015cm.aptoide.p016pt.comments.view.SimpleReviewCommentAdder;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetApp;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Review;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetAppRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListReviewsRequest;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.reviews.LanguageFilterHelper;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.dialog.DialogUtils;
import p015cm.aptoide.p016pt.view.fragment.AptoideBaseFragment;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.ProgressBarDisplayable;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.reviews.RateAndReviewsFragment */
public class RateAndReviewsFragment extends AptoideBaseFragment<CommentsAdapter> implements ItemCommentAdderView<Review, CommentsAdapter> {
    private static final String TAG = RateAndReviewsFragment.class.getSimpleName();
    @Inject
    AppBundlesVisibilityManager appBundlesVisibilityManager;
    private long appId;
    private String appName;
    @Inject
    AppNavigator appNavigator;
    @Inject
    AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private Converter.Factory converterFactory;
    @Inject
    DialogUtils dialogUtils;
    private EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private OkHttpClient httpClient;
    private MenuItem installMenuItem;
    @Inject
    @Named
    String marketName;
    @Inject
    MarketResourceFormatter marketResourceFormatter;
    private String packageName;
    private SharedPreferences preferences;
    private long reviewId;
    private ReviewsLanguageFilterDisplayable reviewsLanguageFilterDisplayable;
    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private String storeName;
    private String storeTheme;
    @Inject
    ThemeManager themeManager;
    private TokenInvalidator tokenInvalidator;
    @Inject
    UserFeedbackAnalytics userFeedbackAnalytics;

    /* renamed from: cm.aptoide.pt.reviews.RateAndReviewsFragment$BundleCons */
    public static class BundleCons {
        public static final String APP_ID = "app_id";
        public static final String APP_NAME = "app_name";
        public static final String PACKAGE_NAME = "package_name";
        public static final String REVIEW_ID = "review_id";
        public static final String STORE_NAME = "store_name";
        public static final String STORE_THEME = "store_theme";
    }

    /* renamed from: a */
    static /* synthetic */ void m7017a(GenericDialogs.EResponse eResponse) {
    }

    private ListReviewsRequest createListReviewsRequest(String str) {
        String str2 = this.storeName;
        return ListReviewsRequest.m5265of(str2, this.packageName, this.storeCredentialsProvider.get(str2), this.baseBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), str);
    }

    private void fetchRating(boolean z) {
        GetAppRequest.m5251of(this.packageName, this.baseBodyInterceptor, this.appId, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), this.appBundlesVisibilityManager).observe(z, ManagerPreferences.getAndResetForceServerRefresh(this.preferences)).mo18662b(Schedulers.m10352io()).mo18644a(C5376a.m10346b()).mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18655a(new C3968i(this), (C5378b<Throwable>) C3965f.f7056f);
    }

    public static RateAndReviewsFragment newInstance(long j, String str, String str2, String str3, String str4) {
        RateAndReviewsFragment rateAndReviewsFragment = new RateAndReviewsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong(BundleCons.APP_ID, j);
        bundle.putString("app_name", str);
        bundle.putString("store_name", str2);
        bundle.putString("package_name", str3);
        bundle.putString(BundleCons.STORE_THEME, str4);
        rateAndReviewsFragment.setArguments(bundle);
        return rateAndReviewsFragment;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14015a(RoomInstalled roomInstalled) {
        if (roomInstalled != null) {
            this.installMenuItem.setTitle(C1086R.string.reviewappview_button_open);
        }
    }

    public void bindViews(View view) {
        super.bindViews(view);
        C10695a.m36221a((FloatingActionButton) view.findViewById(C1086R.C1088id.fab)).mo18687f(new C3967h(this)).mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18655a(C3963d.f7054f, (C5378b<Throwable>) C3969j.f7061f);
    }

    public void checkAndRemoveProgressBarDisplayable() {
        for (int i = 0; i < ((CommentsAdapter) getAdapter()).getItemCount(); i++) {
            if (((CommentsAdapter) getAdapter()).getDisplayable(i) instanceof ProgressBarDisplayable) {
                ((CommentsAdapter) getAdapter()).removeDisplayable(i);
                ((CommentsAdapter) getAdapter()).notifyItemRemoved(i);
            }
        }
    }

    public void createDisplayableComments(List<Comment> list, List<Displayable> list2) {
        for (Comment commentDisplayable : list) {
            FragmentNavigator fragmentNavigator = getFragmentNavigator();
            AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
            list2.add(new CommentDisplayable(commentDisplayable, fragmentNavigator, AptoideApplication.getFragmentProvider()));
        }
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void fetchReviews(LanguageFilterHelper.LanguageFilter languageFilter) {
        addDisplayable(this.reviewsLanguageFilterDisplayable);
        ListReviewsRequest createListReviewsRequest = createListReviewsRequest(languageFilter.getValue());
        getRecyclerView().removeOnScrollListener(this.endlessRecyclerOnScrollListener);
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2 = new EndlessRecyclerOnScrollListener(getAdapter(), createListReviewsRequest, new ListFullReviewsSuccessRequestListener(this, this.storeCredentialsProvider, this.baseBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), this.userFeedbackAnalytics), C3964e.f7055a);
        this.endlessRecyclerOnScrollListener = endlessRecyclerOnScrollListener2;
        endlessRecyclerOnScrollListener2.addOnEndlessFinishListener(new C3966g(this, languageFilter));
        getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
        this.endlessRecyclerOnScrollListener.onLoadMore(false, false);
    }

    public /* bridge */ /* synthetic */ CommentsAdapter getAdapter() {
        return (CommentsAdapter) super.getAdapter();
    }

    public String getAppName() {
        return this.appName;
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_rate_and_reviews;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(RateAndReviewsFragment.class.getSimpleName());
    }

    public long getReviewId() {
        return this.reviewId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12975d(str, "Other versions should refresh? " + z);
        fetchRating(z2);
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.appId = bundle.getLong(BundleCons.APP_ID);
        this.reviewId = bundle.getLong(BundleCons.REVIEW_ID);
        this.packageName = bundle.getString("package_name");
        this.storeName = bundle.getString("store_name");
        this.appName = bundle.getString("app_name");
        this.storeTheme = bundle.getString(BundleCons.STORE_THEME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.preferences = ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences();
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.baseBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_install, menu);
        this.installMenuItem = menu.findItem(C1086R.C1088id.menu_install);
        this.aptoideInstalledAppsRepository.getInstalled(this.packageName).mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18655a(new C3971l(this), (C5378b<Throwable>) C3972m.f7064f);
    }

    public void onDestroyView() {
        this.themeManager.resetToBaseTheme();
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            getActivity().onBackPressed();
            return true;
        } else if (itemId != C1086R.C1088id.menu_install) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.appNavigator.navigateWithPackageAndStoreNames(this.packageName, this.storeName, AppViewFragment.OpenType.OPEN_AND_INSTALL);
            return true;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String str = this.storeTheme;
        if (str != null) {
            this.themeManager.setTheme(str);
        }
    }

    public void setupTitle(String str) {
        if (hasToolbar()) {
            getToolbar().setTitle((CharSequence) str);
        }
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14014a(Void voidR) {
        return this.dialogUtils.showRateDialog(getActivity(), this.appName, this.packageName, this.storeName);
    }

    /* access modifiers changed from: protected */
    public CommentsAdapter createAdapter() {
        return new CommentsAdapter(RateAndReviewCommentDisplayable.class);
    }

    public CommentsReadMoreDisplayable createReadMoreDisplayable(int i, Review review) {
        return new CommentsReadMoreDisplayable(review.getId(), true, review.getCommentList().getDataList().getNext(), new SimpleReviewCommentAdder(i, this));
    }

    public void onViewCreated() {
        super.onViewCreated();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14016a(GetApp getApp) {
        if (getApp.isOk()) {
            GetAppMeta.App data = getApp.getNodes().getMeta().getData();
            setupTitle(data.getName());
            addDisplayable(0, (Displayable) new ReviewsRatingDisplayable(data), true);
            ReviewsLanguageFilterDisplayable reviewsLanguageFilterDisplayable2 = new ReviewsLanguageFilterDisplayable(new C3970k(this));
            this.reviewsLanguageFilterDisplayable = reviewsLanguageFilterDisplayable2;
            addDisplayable(reviewsLanguageFilterDisplayable2);
        }
        finishLoading();
    }

    public static RateAndReviewsFragment newInstance(long j, String str, String str2, String str3, long j2) {
        RateAndReviewsFragment rateAndReviewsFragment = new RateAndReviewsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong(BundleCons.APP_ID, j);
        bundle.putString("app_name", str);
        bundle.putString("store_name", str2);
        bundle.putString("package_name", str3);
        bundle.putLong(BundleCons.REVIEW_ID, j2);
        rateAndReviewsFragment.setArguments(bundle);
        return rateAndReviewsFragment;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14017a(LanguageFilterHelper.LanguageFilter languageFilter) {
        removeDisplayables(1, getDisplayablesSize() - 1);
        fetchReviews(languageFilter);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14018a(LanguageFilterHelper.LanguageFilter languageFilter, EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2) {
        if (languageFilter.hasMoreCountryCodes()) {
            this.endlessRecyclerOnScrollListener.reset(createListReviewsRequest(languageFilter.inc().getValue()));
        }
    }
}
