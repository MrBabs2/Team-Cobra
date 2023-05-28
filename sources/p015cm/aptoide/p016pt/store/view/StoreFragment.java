package p015cm.aptoide.p016pt.store.view;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0454b;
import androidx.viewpager.widget.C0809a;
import androidx.viewpager.widget.ViewPager;
import com.astuetz.PagerSlidingTabStrip;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV7Exception;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHome;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHomeMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStore;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreTabs;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.StoreUserAbstraction;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetHomeRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.search.SearchNavigator;
import p015cm.aptoide.p016pt.search.SuggestionCursorAdapter;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.suggestions.TrendingManager;
import p015cm.aptoide.p016pt.search.view.AppSearchSuggestionsView;
import p015cm.aptoide.p016pt.search.view.SearchSuggestionsPresenter;
import p015cm.aptoide.p016pt.share.ShareStoreHelper;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.custom.AptoideViewPager;
import p015cm.aptoide.p016pt.view.fragment.BasePagerToolbarFragment;
import p112n.p118g.p301a.p303b.p308c.p309a.C10687e;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.p127s.C12871b;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.store.view.StoreFragment */
public class StoreFragment extends BasePagerToolbarFragment {
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.STORES;
    private final int PRIVATE_STORE_REQUEST_CODE = 20;
    private AptoideAccountManager accountManager;
    @Inject
    AnalyticsManager analyticsManager;
    @Inject
    AppNavigator appNavigator;
    private AppSearchSuggestionsView appSearchSuggestionsView;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private BottomNavigationActivity bottomNavigationActivity;
    private Converter.Factory converterFactory;
    private CrashReport crashReport;
    private Event.Name defaultTab;
    private OkHttpClient httpClient;
    private String iconPath;
    @Inject
    @Named
    String marketName;
    @Inject
    MarketResourceFormatter marketResourceFormatter;
    @Inject
    NavigationTracker navigationTracker;
    private OpenType openType;
    ViewPager.C0807m pageChangeListener = new ViewPager.C0807m() {
        public void onPageSelected(int i) {
            if (i == 0) {
                StoreFragment.this.navigationTracker.registerScreen(ScreenTagHistory.Builder.build(C42581.class.getSimpleName(), "home", StoreFragment.this.storeContext.name()));
            }
        }
    };
    protected PagerSlidingTabStrip pagerSlidingTabStrip;
    private Runnable registerViewpagerCurrentItem;
    private SearchAnalytics searchAnalytics;
    private SearchNavigator searchNavigator;
    private ShareStoreHelper shareStoreHelper;
    private SharedPreferences sharedPreferences;
    /* access modifiers changed from: private */
    public StoreAnalytics storeAnalytics;
    /* access modifiers changed from: private */
    public StoreContext storeContext;
    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private Long storeId;
    /* access modifiers changed from: private */
    public String storeName;
    @Inject
    RoomStoreRepository storeRepository;
    private String storeTheme;
    private String storeUrl;
    private List<GetStoreTabs.Tab> tabs;
    @Inject
    ThemeManager themeManager;
    private String title;
    private TokenInvalidator tokenInvalidator;
    private TrendingManager trendingManager;
    private Long userId;

    /* renamed from: cm.aptoide.pt.store.view.StoreFragment$3 */
    static /* synthetic */ class C42603 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$store$StoreError;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$store$view$StoreFragment$OpenType;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        static {
            /*
                cm.aptoide.pt.utils.GenericDialogs$EResponse[] r0 = p015cm.aptoide.p016pt.utils.GenericDialogs.EResponse.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse = r0
                r1 = 1
                cm.aptoide.pt.utils.GenericDialogs$EResponse r2 = p015cm.aptoide.p016pt.utils.GenericDialogs.EResponse.NO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.utils.GenericDialogs$EResponse r3 = p015cm.aptoide.p016pt.utils.GenericDialogs.EResponse.YES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.utils.GenericDialogs$EResponse r4 = p015cm.aptoide.p016pt.utils.GenericDialogs.EResponse.CANCEL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                cm.aptoide.pt.store.StoreError[] r3 = p015cm.aptoide.p016pt.store.StoreError.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$cm$aptoide$pt$store$StoreError = r3
                cm.aptoide.pt.store.StoreError r4 = p015cm.aptoide.p016pt.store.StoreError.PRIVATE_STORE_ERROR     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = $SwitchMap$cm$aptoide$pt$store$StoreError     // Catch:{ NoSuchFieldError -> 0x0043 }
                cm.aptoide.pt.store.StoreError r4 = p015cm.aptoide.p016pt.store.StoreError.PRIVATE_STORE_WRONG_CREDENTIALS     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = $SwitchMap$cm$aptoide$pt$store$StoreError     // Catch:{ NoSuchFieldError -> 0x004d }
                cm.aptoide.pt.store.StoreError r4 = p015cm.aptoide.p016pt.store.StoreError.STORE_SUSPENDED     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                cm.aptoide.pt.store.view.StoreFragment$OpenType[] r2 = p015cm.aptoide.p016pt.store.view.StoreFragment.OpenType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$cm$aptoide$pt$store$view$StoreFragment$OpenType = r2
                cm.aptoide.pt.store.view.StoreFragment$OpenType r3 = p015cm.aptoide.p016pt.store.view.StoreFragment.OpenType.GetHome     // Catch:{ NoSuchFieldError -> 0x005e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r1 = $SwitchMap$cm$aptoide$pt$store$view$StoreFragment$OpenType     // Catch:{ NoSuchFieldError -> 0x0068 }
                cm.aptoide.pt.store.view.StoreFragment$OpenType r2 = p015cm.aptoide.p016pt.store.view.StoreFragment.OpenType.GetStore     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.store.view.StoreFragment.C42603.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.store.view.StoreFragment$BundleKeys */
    private enum BundleKeys {
        STORE_NAME,
        STORE_CONTEXT,
        STORE_THEME,
        DEFAULT_TAB_TO_OPEN,
        USER_ID,
        OPEN_TYPE
    }

    /* renamed from: cm.aptoide.pt.store.view.StoreFragment$OpenType */
    public enum OpenType {
        GetHome,
        GetStore
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m7335a(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.RESUME);
    }

    /* renamed from: a */
    static /* synthetic */ C5368e m7336a(C5368e eVar, View.LifecycleEvent lifecycleEvent) {
        return eVar;
    }

    /* renamed from: c */
    static /* synthetic */ void m7338c(MenuItem menuItem) {
    }

    /* access modifiers changed from: private */
    /* renamed from: handleError */
    public void mo14722b(Throwable th) {
        if (th instanceof AptoideWsV7Exception) {
            int i = C42603.$SwitchMap$cm$aptoide$pt$store$StoreError[StoreUtils.getErrorType(((AptoideWsV7Exception) th).getBaseResponse().getError().getCode()).ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    showStoreSuspendedPopup(this.storeName);
                }
                finishLoading(th);
            } else if (((C0454b) getFragmentManager().mo2792a(PrivateStoreDialog.TAG)) == null) {
                PrivateStoreDialog.newInstance(this, 20, this.storeName, true).show(getFragmentManager(), PrivateStoreDialog.TAG);
            }
        } else {
            finishLoading(th);
        }
    }

    private void handleOptionsItemSelected(C5368e<MenuItem> eVar) {
        getLifecycleEvent().mo18681d(C4300k1.f7392f).mo18687f(new C4294i1(eVar)).mo18681d(C4278e1.f7366f).mo18664b(new C4306m1(this)).mo18641a(bindUntilEvent(View.LifecycleEvent.PAUSE)).mo18655a(C4297j1.f7389f, (C5378b<Throwable>) new C4303l1(this));
    }

    private C5368e<String> loadData(boolean z, OpenType openType2) {
        if (C42603.$SwitchMap$cm$aptoide$pt$store$view$StoreFragment$OpenType[openType2.ordinal()] != 1) {
            return GetStoreRequest.m5367of(StoreUtils.getStoreCredentials(this.storeName, this.storeCredentialsProvider), this.storeContext, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, getContext().getResources(), (WindowManager) getContext().getSystemService("window")).observe(z).mo18694j(new C4346p1(this));
        }
        return GetHomeRequest.m5362of(StoreUtils.getStoreCredentials(this.storeName, this.storeCredentialsProvider), this.userId, this.storeContext, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, getContext().getResources(), (WindowManager) getContext().getSystemService("window")).observe(z).mo18694j(new C4340n1(this));
    }

    public static StoreFragment newInstance(long j, String str, OpenType openType2) {
        return newInstance(j, str, (Event.Name) null, openType2);
    }

    private List<GetStoreTabs.Tab> parseTabs(StoreUserAbstraction<?> storeUserAbstraction) {
        GetStoreTabs.Tab tab = storeUserAbstraction.getNodes().getTabs().getList().get(0);
        if (tab.getEvent().getAction().contains("/getStore/")) {
            tab.getEvent().setName(Event.Name.getStoreWidgets);
            tab.getEvent().setAction(tab.getEvent().getAction().replace("/getStore/", "/getStoreWidgets/"));
        }
        return storeUserAbstraction.getNodes().getTabs().getList();
    }

    private void setupVariables(List<GetStoreTabs.Tab> list, Long l, String str, String str2, String str3) {
        this.tabs = list;
        this.storeId = l;
        this.storeName = str;
        this.storeUrl = str2;
        this.iconPath = str3;
    }

    private void showStoreSuspendedPopup(String str) {
        GenericDialogs.createGenericOkCancelMessage(getContext(), "", C1086R.string.store_suspended_message, 17039370, C1086R.string.unfollow, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18675c(new C4343o1(this, str));
    }

    /* renamed from: b */
    public /* synthetic */ void mo14721b() {
        this.pageChangeListener.onPageSelected(this.viewPager.getCurrentItem());
    }

    /* access modifiers changed from: protected */
    public void changeToTab(Event.Name name) {
        if (name != null) {
            if ((this.viewPager.getAdapter() instanceof StorePagerAdapter ? (StorePagerAdapter) this.viewPager.getAdapter() : null) != null) {
                AptoideViewPager aptoideViewPager = this.viewPager;
                aptoideViewPager.setCurrentItem(((StorePagerAdapter) aptoideViewPager.getAdapter()).getEventNamePosition(name));
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0809a createPagerAdapter() {
        return new StorePagerAdapter(getChildFragmentManager(), this.tabs, this.storeContext, this.storeId, this.storeTheme, getContext().getApplicationContext(), this.marketName);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public int getContentViewId() {
        return C1086R.layout.store_activity;
    }

    public ScreenTagHistory getHistoryTracker() {
        String simpleName = StoreFragment.class.getSimpleName();
        StoreContext storeContext2 = this.storeContext;
        return ScreenTagHistory.Builder.build(simpleName, "", storeContext2 != null ? storeContext2.name() : null);
    }

    /* access modifiers changed from: protected */
    public int getViewToShowAfterLoadingId() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public int[] getViewsToShowAfterLoadingId() {
        return new int[]{C1086R.C1088id.pager, C1086R.C1088id.tabs};
    }

    /* access modifiers changed from: protected */
    public boolean hasSearchFromStoreFragment() {
        return true;
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        if (z || this.tabs == null) {
            loadData(z2, this.openType).mo18644a(C5376a.m10346b()).mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18655a(new C4291h1(this), (C5378b<Throwable>) new C4288g1(this));
        } else {
            setupViewPager();
        }
    }

    public void loadExtras(Bundle bundle) {
        OpenType openType2;
        super.loadExtras(bundle);
        this.storeName = bundle.getString(BundleKeys.STORE_NAME.name());
        this.storeContext = (StoreContext) bundle.get(BundleKeys.STORE_CONTEXT.name());
        if (bundle.containsKey(BundleKeys.OPEN_TYPE.name())) {
            openType2 = (OpenType) bundle.get(BundleKeys.OPEN_TYPE.name());
        } else {
            openType2 = OpenType.GetStore;
        }
        this.openType = openType2;
        this.storeTheme = bundle.getString(BundleKeys.STORE_THEME.name());
        this.defaultTab = (Event.Name) bundle.get(BundleKeys.DEFAULT_TAB_TO_OPEN.name());
        if (bundle.containsKey(BundleKeys.USER_ID.name())) {
            this.userId = Long.valueOf(bundle.getLong(BundleKeys.USER_ID.name()));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 20 && i2 == -1) {
            load(true, true, (Bundle) null);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.tokenInvalidator = aptoideApplication.getTokenInvalidator();
        this.accountManager = aptoideApplication.getAccountManager();
        this.bodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.sharedPreferences = aptoideApplication.getDefaultSharedPreferences();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        this.shareStoreHelper = new ShareStoreHelper(getActivity(), this.marketResourceFormatter);
        if (hasSearchFromStoreFragment()) {
            this.searchAnalytics = new SearchAnalytics(this.analyticsManager, this.navigationTracker);
            this.searchNavigator = new SearchNavigator(getFragmentNavigator(), this.storeName, this.storeTheme, this.appNavigator);
            this.trendingManager = aptoideApplication.getTrendingManager();
            this.crashReport = CrashReport.getInstance();
        }
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (hasSearchFromStoreFragment()) {
            menuInflater.inflate(C1086R.C1089menu.fragment_store, menu);
            MenuItem findItem = menu.findItem(C1086R.C1088id.menu_item_search);
            AppSearchSuggestionsView appSearchSuggestionsView2 = this.appSearchSuggestionsView;
            if (appSearchSuggestionsView2 != null && findItem != null) {
                appSearchSuggestionsView2.initialize(findItem);
            } else if (findItem != null) {
                findItem.setVisible(false);
            } else {
                menu.removeItem(C1086R.C1088id.menu_item_search);
            }
        }
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str = this.storeTheme;
        if (str != null) {
            this.themeManager.setTheme(str);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        this.themeManager.resetToBaseTheme();
        PagerSlidingTabStrip pagerSlidingTabStrip2 = this.pagerSlidingTabStrip;
        if (pagerSlidingTabStrip2 != null) {
            pagerSlidingTabStrip2.setOnTabReselectedListener((PagerSlidingTabStrip.C5865d) null);
            this.pagerSlidingTabStrip = null;
        }
        this.viewPager.removeCallbacks(this.registerViewpagerCurrentItem);
        this.viewPager.removeOnPageChangeListener(this.pageChangeListener);
        super.onDestroyView();
    }

    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    public void onViewCreated(android.view.View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity2 = this.bottomNavigationActivity;
        if (bottomNavigationActivity2 != null) {
            bottomNavigationActivity2.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        SuggestionCursorAdapter suggestionCursorAdapter = new SuggestionCursorAdapter(getContext());
        if (hasSearchFromStoreFragment()) {
            Toolbar toolbar = getToolbar();
            C5368e<MenuItem> o = C10687e.m36213a(toolbar).mo18685e().mo41037o();
            SuggestionCursorAdapter suggestionCursorAdapter2 = suggestionCursorAdapter;
            this.appSearchSuggestionsView = new AppSearchSuggestionsView(this, C10695a.m36221a(toolbar), this.crashReport, suggestionCursorAdapter2, C12871b.m41468p(), o, this.searchAnalytics);
            attachPresenter(new SearchSuggestionsPresenter(this.appSearchSuggestionsView, ((AptoideApplication) getContext().getApplicationContext()).getSearchSuggestionManager(), C5376a.m10346b(), suggestionCursorAdapter2, this.crashReport, this.trendingManager, this.searchNavigator, false, this.searchAnalytics));
            handleOptionsItemSelected(o);
        }
    }

    public void setupToolbar() {
        super.setupToolbar();
    }

    /* access modifiers changed from: protected */
    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle((CharSequence) this.title);
        toolbar.setBackgroundResource(this.themeManager.getAttributeForTheme(this.storeTheme, C1086R.attr.toolbarBackground).resourceId);
        if (this.userId != null) {
            toolbar.setLogo((int) C1086R.C1087drawable.ic_user_shape_white);
        } else {
            toolbar.setLogo((int) C1086R.C1087drawable.ic_store_white);
        }
    }

    /* access modifiers changed from: protected */
    public void setupViewPager() {
        super.setupViewPager();
        PagerSlidingTabStrip pagerSlidingTabStrip2 = (PagerSlidingTabStrip) getView().findViewById(C1086R.C1088id.tabs);
        this.pagerSlidingTabStrip = pagerSlidingTabStrip2;
        pagerSlidingTabStrip2.setBackgroundResource(this.themeManager.getAttributeForTheme(this.storeTheme, C1086R.attr.toolbarBackground).resourceId);
        PagerSlidingTabStrip pagerSlidingTabStrip3 = this.pagerSlidingTabStrip;
        if (pagerSlidingTabStrip3 != null) {
            pagerSlidingTabStrip3.setViewPager(this.viewPager);
        }
        this.viewPager.addOnPageChangeListener(new ViewPager.C0807m() {
            public void onPageSelected(int i) {
                StorePagerAdapter storePagerAdapter = (StorePagerAdapter) StoreFragment.this.viewPager.getAdapter();
                if (StoreFragment.this.storeContext.equals(StoreContext.meta)) {
                    StoreFragment.this.storeAnalytics.sendStoreInteractEvent("Open Tab", storePagerAdapter.getPageTitle(i).toString(), StoreFragment.this.storeName);
                }
            }
        });
        this.viewPager.addOnPageChangeListener(this.pageChangeListener);
        C4281f1 f1Var = new C4281f1(this);
        this.registerViewpagerCurrentItem = f1Var;
        this.viewPager.post(f1Var);
        changeToTab(this.defaultTab);
        finishLoading();
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m7337b(MenuItem menuItem) {
        return Boolean.valueOf(menuItem != null && menuItem.getItemId() == C1086R.C1088id.menu_item_share);
    }

    public static StoreFragment newInstance(long j, String str, Event.Name name, OpenType openType2) {
        Bundle bundle = new Bundle();
        bundle.putLong(BundleKeys.USER_ID.name(), j);
        bundle.putSerializable(BundleKeys.STORE_CONTEXT.name(), StoreContext.meta);
        bundle.putSerializable(BundleKeys.OPEN_TYPE.name(), openType2);
        bundle.putString(BundleKeys.STORE_THEME.name(), str);
        bundle.putSerializable(BundleKeys.DEFAULT_TAB_TO_OPEN.name(), name);
        StoreFragment storeFragment = new StoreFragment();
        storeFragment.setArguments(bundle);
        return storeFragment;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14717a(MenuItem menuItem) {
        this.shareStoreHelper.shareStore(this.storeUrl);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14720a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14718a(String str) {
        this.title = str;
        if (this.storeContext != StoreContext.home) {
            setupToolbarDetails(getToolbar());
        }
        setupViewPager();
    }

    /* renamed from: a */
    public /* synthetic */ String mo14715a(GetHome getHome) {
        Store store = ((GetHomeMeta) getHome.getNodes().getMeta()).getData().getStore();
        String str = null;
        String name = store != null ? store.getName() : null;
        Long valueOf = store != null ? Long.valueOf(store.getId()) : null;
        if (store != null) {
            str = store.getAvatar();
        }
        setupVariables(parseTabs(getHome), valueOf, name, this.storeUrl, str);
        return TextUtils.isEmpty(name) ? ((GetHomeMeta) getHome.getNodes().getMeta()).getData().getUser().getName() : name;
    }

    public static StoreFragment newInstance(String str, String str2, Event.Name name, OpenType openType2) {
        StoreFragment newInstance = newInstance(str, str2, openType2);
        newInstance.getArguments().putSerializable(BundleKeys.DEFAULT_TAB_TO_OPEN.name(), name);
        return newInstance;
    }

    public static StoreFragment newInstance(String str, String str2, OpenType openType2) {
        Bundle bundle = new Bundle();
        bundle.putString(BundleKeys.STORE_NAME.name(), str);
        bundle.putSerializable(BundleKeys.OPEN_TYPE.name(), openType2);
        bundle.putSerializable(BundleKeys.STORE_CONTEXT.name(), StoreContext.meta);
        bundle.putString(BundleKeys.STORE_THEME.name(), str2);
        StoreFragment storeFragment = new StoreFragment();
        storeFragment.setArguments(bundle);
        return storeFragment;
    }

    public static StoreFragment newInstance(String str, String str2) {
        return newInstance(str, str2, OpenType.GetStore);
    }

    /* renamed from: a */
    public /* synthetic */ String mo14716a(GetStore getStore) {
        setupVariables(parseTabs(getStore), Long.valueOf(((GetStoreMeta) getStore.getNodes().getMeta()).getData().getId()), ((GetStoreMeta) getStore.getNodes().getMeta()).getData().getName(), ((GetStoreMeta) getStore.getNodes().getMeta()).getData().getUrls().getMobile(), ((GetStoreMeta) getStore.getNodes().getMeta()).getData().getAvatar());
        return ((GetStoreMeta) getStore.getNodes().getMeta()).getData().getName();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14719a(String str, GenericDialogs.EResponse eResponse) {
        int i = C42603.$SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse[eResponse.ordinal()];
        if (i == 1) {
            StoreUtils.unSubscribeStore(str, this.accountManager, this.storeCredentialsProvider, this.storeRepository);
        } else if (!(i == 2 || i == 3)) {
            return;
        }
        getActivity().onBackPressed();
    }
}
