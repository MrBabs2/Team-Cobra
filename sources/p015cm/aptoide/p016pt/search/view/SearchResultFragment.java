package p015cm.aptoide.p016pt.search.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.AutoCompleteTextView;
import android.widget.ProgressBar;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.C0414a;
import androidx.recyclerview.widget.C0677e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import org.parceler.C12420e;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.errors.ErrorView;
import p015cm.aptoide.aptoideviews.filters.Filter;
import p015cm.aptoide.aptoideviews.filters.FiltersView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenShotClickEvent;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.download.view.DownloadClick;
import p015cm.aptoide.p016pt.search.model.SearchAppResult;
import p015cm.aptoide.p016pt.search.model.SearchAppResultWrapper;
import p015cm.aptoide.p016pt.search.model.SearchFilterType;
import p015cm.aptoide.p016pt.search.model.SearchQueryModel;
import p015cm.aptoide.p016pt.search.model.SearchResultError;
import p015cm.aptoide.p016pt.search.model.SearchViewModel;
import p015cm.aptoide.p016pt.search.model.Suggestion;
import p015cm.aptoide.p016pt.search.suggestions.SearchQueryEvent;
import p015cm.aptoide.p016pt.search.view.SearchResultView;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.BackButtonFragment;
import p015cm.aptoide.p016pt.view.p031rx.RxAlertDialog;
import p015cm.aptoide.p016pt.view.settings.InputDialog;
import p050l.p075h.p083k.C5004d;
import p050l.p075h.p084l.C5055h;
import p112n.p118g.p301a.p303b.p308c.p309a.C10681a;
import p112n.p118g.p301a.p303b.p308c.p309a.C10685c;
import p112n.p118g.p301a.p303b.p308c.p309a.C10686d;
import p112n.p118g.p301a.p303b.p308c.p309a.C10687e;
import p112n.p118g.p301a.p303b.p308c.p309a.C10691g;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.search.view.SearchResultFragment */
public class SearchResultFragment extends BackButtonFragment implements SearchResultView, SearchSuggestionsView {
    private static final String ALL_STORES_SEARCH_LIST_STATE = "all_stores_search_list_state";
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.SEARCH;
    private static final int COMPLETION_THRESHOLD = 0;
    private static final String FOCUS_IN_SEARCH = "focus_in_search";
    private static final int LAYOUT = 2131493058;
    private static final String UNSUBMITTED_QUERY = "unsubmitted_query";
    private static final String VIEW_MODEL = "view_model";
    private static final int VISIBLE_THRESHOLD = 2;
    private C0069a actionBar;
    private BottomNavigationActivity bottomNavigationActivity;
    private String currentQuery;
    private C12871b<DownloadClick> downloadClickPublishSubject;
    private RxAlertDialog enableAdultContentDialog;
    private InputDialog enableAdultContentDialogWithPin;
    private ErrorView errorView;
    private CardView filtersCardView;
    private C12871b<Void> filtersChanged;
    private FiltersView filtersView;
    private boolean focusInSearchBar;
    private boolean isFreshLoading = false;
    /* access modifiers changed from: private */
    public boolean isSearchExpanded;
    /* access modifiers changed from: private */
    public boolean networkError;
    /* access modifiers changed from: private */
    public boolean noResults;
    private C12871b<Boolean> noResultsAdultContentSubject;
    private C12871b<Void> noResultsPublishSubject;
    private SwitchCompat noSearchAdultContentSwitch;
    private View noSearchLayout;
    private C12871b<SearchAppResultWrapper> onItemViewClickSubject;
    private ProgressBar progressBar;
    /* access modifiers changed from: private */
    public ProgressBar progressBarResults;
    private C12871b<SearchQueryEvent> queryTextChangedPublisher;
    private C12871b<ScreenShotClickEvent> screenShotClick;
    private C12871b<Void> searchHasNoResults;
    private MenuItem searchMenuItem;
    /* access modifiers changed from: private */
    public RecyclerView searchResultList;
    @Inject
    SearchResultPresenter searchResultPresenter;
    private SearchResultAdapter searchResultsAdapter;
    private View searchResultsLayout;
    private C12871b<Void> searchSetupPublishSubject;
    private SearchSuggestionsAdapter searchSuggestionsAdapter;
    private SearchSuggestionsAdapter searchTrendingAdapter;
    private SearchView searchView;
    private C12871b<SearchQueryEvent> suggestionClickedPublishSubject;
    private RecyclerView suggestionsResultList;
    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;
    private RecyclerView trendingResultList;
    private String unsubmittedQuery;
    private SearchViewModel viewModel;

    /* renamed from: a */
    static /* synthetic */ Boolean m7059a(Boolean bool) {
        return bool;
    }

    private void attachAllStoresResultListDependencies() {
        this.searchResultList.setAdapter(this.searchResultsAdapter);
        this.searchResultList.setLayoutManager(getDefaultLayoutManager());
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m7062b(Void voidR) {
        return true;
    }

    /* renamed from: b */
    static /* synthetic */ Void m7063b(Boolean bool) {
        return null;
    }

    private C5368e<Void> filtersChanged() {
        return this.filtersChanged;
    }

    private void findChildViews(View view) {
        this.filtersCardView = (CardView) view.findViewById(C1086R.C1088id.filters_card_view);
        this.searchResultList = (RecyclerView) view.findViewById(C1086R.C1088id.fragment_search_result_all_stores_app_list);
        this.suggestionsResultList = (RecyclerView) view.findViewById(C1086R.C1088id.suggestions_list);
        this.trendingResultList = (RecyclerView) view.findViewById(C1086R.C1088id.trending_list);
        this.searchResultsLayout = view.findViewById(C1086R.C1088id.fragment_search_result_layout);
        this.noSearchLayout = view.findViewById(C1086R.C1088id.no_search_results_layout);
        this.noSearchAdultContentSwitch = (SwitchCompat) view.findViewById(C1086R.C1088id.no_search_adult_switch);
        this.progressBar = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar);
        this.progressBarResults = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar_results);
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        this.errorView = (ErrorView) view.findViewById(C1086R.C1088id.error_view);
        this.filtersView = (FiltersView) view.findViewById(C1086R.C1088id.filters_view);
        this.noSearchAdultContentSwitch.setOnClickListener(new C4219y(this));
    }

    /* access modifiers changed from: private */
    public void forceSuggestions() {
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
        this.trendingResultList.setVisibility(0);
        this.suggestionsResultList.setVisibility(8);
    }

    private LinearLayoutManager getDefaultLayoutManager() {
        return new LinearLayoutManager(getContext(), 1, false);
    }

    /* access modifiers changed from: private */
    public boolean hasSearchResults() {
        return this.searchResultsAdapter.getItemCount() > 0;
    }

    /* access modifiers changed from: private */
    public boolean isEndReached(C10681a aVar) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) aVar.mo36350a()).getLayoutManager();
        return linearLayoutManager.getItemCount() - linearLayoutManager.findLastVisibleItemPosition() <= 2;
    }

    public static SearchResultFragment newInstance(SearchQueryModel searchQueryModel) {
        return newInstance(searchQueryModel, false);
    }

    private C5368e<Void> recyclerViewReachedBottom(RecyclerView recyclerView) {
        return C5368e.m10243a(C10685c.m36211a(recyclerView).mo18694j(new C4227z(this)), filtersChanged().mo18694j(C4011a0.f7090f), searchHasNoResults().mo18694j(C4203w.f7286f)).mo18656b().mo18681d(C4029c0.f7108f).mo18694j(C4020b0.f7099f);
    }

    private void restoreViewState(Parcelable parcelable) {
        if (parcelable != null) {
            RecyclerView.C0644o layoutManager = this.searchResultList.getLayoutManager();
            if (layoutManager == null) {
                layoutManager = getDefaultLayoutManager();
                this.searchResultList.setLayoutManager(layoutManager);
            }
            layoutManager.onRestoreInstanceState(parcelable);
        }
        showResultsView();
    }

    private C5368e<Void> searchHasNoResults() {
        return this.searchHasNoResults;
    }

    private void setupDefaultTheme() {
        this.themeManager.resetToBaseTheme();
    }

    private void setupFilters() {
        List list;
        SearchViewModel searchViewModel = this.viewModel;
        if (searchViewModel == null || searchViewModel.getStoreName() == null || this.viewModel.getStoreName().isEmpty()) {
            list = Arrays.asList(new Filter[]{new Filter(getString(C1086R.string.search_filters_followed_stores), false, SearchFilterType.FOLLOWED_STORES.name()), new Filter(getString(C1086R.string.search_filters_trusted), false, SearchFilterType.TRUSTED.name()), new Filter(getString(C1086R.string.search_filters_beta), false, SearchFilterType.BETA.name()), new Filter(getString(C1086R.string.search_filters_appcoins), false, SearchFilterType.APPC.name())});
        } else {
            list = Arrays.asList(new Filter[]{new Filter(getString(C1086R.string.search_filters_trusted), false, SearchFilterType.TRUSTED.name()), new Filter(getString(C1086R.string.search_filters_beta), false, SearchFilterType.BETA.name()), new Filter(getString(C1086R.string.search_filters_appcoins), false, SearchFilterType.APPC.name())});
        }
        this.filtersView.setFilters(list);
    }

    private void setupTheme() {
        SearchViewModel searchViewModel = this.viewModel;
        if (searchViewModel == null || !storeThemeExists(searchViewModel.getStoreTheme())) {
            this.themeManager.resetToBaseTheme();
            String themeName = this.themeManager.getBaseTheme().getThemeName();
            this.filtersView.setFiltersBackgroundRes(this.themeManager.getAttributeForTheme(themeName, C1086R.attr.homeChips).resourceId);
            this.filtersView.setFiltersTextColorStateList(this.themeManager.getAttributeForTheme(themeName, C1086R.attr.homeChipsTextColorSelector).resourceId);
            return;
        }
        String storeTheme = this.viewModel.getStoreTheme();
        this.themeManager.setTheme(storeTheme);
        this.toolbar.setBackgroundResource(this.themeManager.getAttributeForTheme(storeTheme, C1086R.attr.toolbarBackground).resourceId);
        if (Build.VERSION.SDK_INT < 21) {
            Drawable i = C0414a.m2029i(this.progressBar.getIndeterminateDrawable());
            C0414a.m2022b(i, this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).data);
            this.progressBar.setIndeterminateDrawable(C0414a.m2028h(i));
        } else {
            this.progressBar.getIndeterminateDrawable().setColorFilter(this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).data, PorterDuff.Mode.SRC_IN);
        }
        this.filtersView.setFiltersBackgroundRes(this.themeManager.getAttributeForTheme(storeTheme, C1086R.attr.homeChips).resourceId);
        this.filtersView.setFiltersTextColorStateList(this.themeManager.getAttributeForTheme(storeTheme, C1086R.attr.homeChipsTextColorSelector).resourceId);
    }

    private void setupToolbar() {
        String finalQuery = this.viewModel.getSearchQueryModel().getFinalQuery();
        if (finalQuery.isEmpty() && !this.noResults) {
            this.toolbar.setTitle((int) C1086R.string.search_hint_title);
            this.toolbar.setTitleMarginStart(100);
        } else if (finalQuery.isEmpty()) {
            this.toolbar.setTitle((int) C1086R.string.search_hint_title);
        } else {
            this.toolbar.setTitle((CharSequence) finalQuery);
        }
        C0076d dVar = (C0076d) getActivity();
        dVar.setSupportActionBar(this.toolbar);
        C0069a supportActionBar = dVar.getSupportActionBar();
        this.actionBar = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.mo188d(true);
            this.actionBar.mo182a(this.toolbar.getTitle());
        }
    }

    private boolean storeThemeExists(String str) {
        return str != null && str.length() > 0;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14320a(View view) {
        this.noResultsAdultContentSubject.onNext(Boolean.valueOf(this.noSearchAdultContentSwitch.isChecked()));
    }

    public void addAllStoresResult(String str, List<SearchAppResult> list, boolean z, boolean z2, boolean z3, SearchResultError searchResultError) {
        if (z) {
            this.isFreshLoading = false;
            this.searchResultsAdapter.setResultForSearch(this.searchResultList, str, list, z2);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1086R.anim.slide_up_disappear);
            loadAnimation.setFillAfter(true);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    SearchResultFragment.this.progressBarResults.setVisibility(8);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
            this.progressBarResults.startAnimation(loadAnimation);
            this.searchResultList.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), C1086R.anim.list_apps_anim));
            this.searchResultList.scheduleLayoutAnimation();
        } else {
            this.searchResultsAdapter.addResultForSearch(str, list, z2);
        }
        this.viewModel.setLoadedResults(true);
        hideLoading();
        if (z3) {
            if (searchResultError == SearchResultError.NO_NETWORK) {
                showNoNetworkView();
            } else {
                showGenericErrorView();
            }
        } else if (list.size() <= 0) {
            showNoResultsView();
        } else {
            showResultsView();
        }
    }

    public C5368e<DialogInterface> adultContentDialogNegativeClick() {
        return this.enableAdultContentDialog.negativeClicks();
    }

    public C5368e<DialogInterface> adultContentDialogPositiveClick() {
        return this.enableAdultContentDialog.positiveClicks();
    }

    public C5368e<DialogInterface> adultContentPinDialogNegativeClick() {
        return this.enableAdultContentDialogWithPin.negativeClicks();
    }

    public C5368e<CharSequence> adultContentWithPinDialogPositiveClick() {
        return this.enableAdultContentDialogWithPin.positiveClicks();
    }

    public void clearUnsubmittedQuery() {
        this.unsubmittedQuery = "";
    }

    public C5368e<Boolean> clickAdultContentSwitch() {
        return this.noResultsAdultContentSubject;
    }

    public void collapseSearchBar(boolean z) {
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
        if (!hasResults()) {
            this.toolbar.setTitle((int) C1086R.string.search_hint_title);
        }
    }

    public void disableAdultContent() {
        this.noSearchAdultContentSwitch.setChecked(false);
    }

    public void disableUpNavigation() {
        C0069a aVar = this.actionBar;
        if (aVar != null) {
            aVar.mo191f(false);
            this.actionBar.mo188d(false);
            this.actionBar.mo189e(false);
        }
    }

    public void enableAdultContent() {
        this.noSearchAdultContentSwitch.setChecked(true);
    }

    public void enableUpNavigation() {
        C0069a aVar = this.actionBar;
        if (aVar != null) {
            aVar.mo191f(true);
            this.actionBar.mo188d(true);
            this.actionBar.mo189e(true);
        }
    }

    public C5368e<List<Filter>> filtersChangeEvents() {
        return this.filtersView.filtersChangedEvents().mo18664b(new C4187u(this)).mo18664b(new C4195v(this));
    }

    public void focusInSearchBar() {
        String str;
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem != null) {
            menuItem.expandActionView();
        }
        SearchView searchView2 = this.searchView;
        if (searchView2 != null && (str = this.unsubmittedQuery) != null) {
            searchView2.mo1161a((CharSequence) str, false);
        } else if (this.searchView != null && !getCurrentQuery().isEmpty()) {
            this.searchView.mo1161a((CharSequence) getCurrentQuery(), false);
        }
        showSuggestionsView();
    }

    public String getCurrentQuery() {
        String str = this.currentQuery;
        return str != null ? str : "";
    }

    public C5368e<DownloadClick> getDownloadClickEvents() {
        return this.downloadClickPublishSubject;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(SearchResultFragment.class.getSimpleName());
    }

    public C5368e<ScreenShotClickEvent> getScreenshotClickEvent() {
        return this.screenShotClick;
    }

    public SearchResultView.Model getViewModel() {
        return this.viewModel;
    }

    public boolean hasResults() {
        return this.searchResultsAdapter.getItemCount() != 0 && !this.searchMenuItem.isActionViewExpanded();
    }

    public void hideLoading() {
        this.progressBar.setVisibility(8);
    }

    public void hideSuggestionsViews() {
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
    }

    public boolean isSearchViewExpanded() {
        return this.searchMenuItem.isActionViewExpanded();
    }

    public C5368e<C5004d<String, SearchQueryEvent>> listenToSuggestionClick() {
        return this.suggestionClickedPublishSubject.mo18694j(new C4211x(this));
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
        CrashReport instance = CrashReport.getInstance();
        if (this.viewModel == null && bundle != null && bundle.containsKey(VIEW_MODEL)) {
            this.viewModel = (SearchViewModel) C12420e.m40844a(bundle.getParcelable(VIEW_MODEL));
        } else if (this.viewModel == null && getArguments().containsKey(VIEW_MODEL)) {
            this.viewModel = (SearchViewModel) C12420e.m40844a(getArguments().getParcelable(VIEW_MODEL));
        }
        if (bundle != null && bundle.containsKey(FOCUS_IN_SEARCH)) {
            this.focusInSearchBar = bundle.getBoolean(FOCUS_IN_SEARCH);
        } else if (getArguments().containsKey(FOCUS_IN_SEARCH) && bundle == null) {
            this.focusInSearchBar = getArguments().getBoolean(FOCUS_IN_SEARCH);
        }
        SearchViewModel searchViewModel = this.viewModel;
        if (searchViewModel != null) {
            this.currentQuery = searchViewModel.getSearchQueryModel().getFinalQuery();
        }
        this.noResults = false;
        this.networkError = false;
        this.onItemViewClickSubject = C12871b.m41468p();
        this.downloadClickPublishSubject = C12871b.m41468p();
        this.screenShotClick = C12871b.m41468p();
        this.suggestionClickedPublishSubject = C12871b.m41468p();
        this.searchSetupPublishSubject = C12871b.m41468p();
        this.queryTextChangedPublisher = C12871b.m41468p();
        this.noResultsAdultContentSubject = C12871b.m41468p();
        this.noResultsPublishSubject = C12871b.m41468p();
        this.filtersChanged = C12871b.m41468p();
        this.searchHasNoResults = C12871b.m41468p();
        SearchResultAdapter searchResultAdapter = new SearchResultAdapter(this.onItemViewClickSubject, this.downloadClickPublishSubject, this.screenShotClick, new ArrayList(), instance);
        this.searchResultsAdapter = searchResultAdapter;
        searchResultAdapter.registerAdapterDataObserver(new RecyclerView.C0635i() {
            public void onItemRangeInserted(int i, int i2) {
                RecyclerView.C0644o layoutManager;
                if (i == 0 && (layoutManager = SearchResultFragment.this.searchResultList.getLayoutManager()) != null) {
                    layoutManager.scrollToPosition(0);
                }
            }
        });
        this.searchSuggestionsAdapter = new SearchSuggestionsAdapter(new ArrayList(), this.suggestionClickedPublishSubject);
        this.searchTrendingAdapter = new SearchSuggestionsAdapter(new ArrayList(), this.suggestionClickedPublishSubject);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.fragment_search_result, menu);
        MenuItem findItem = menu.findItem(C1086R.C1088id.menu_item_search);
        this.searchMenuItem = findItem;
        SearchView searchView2 = (SearchView) findItem.getActionView();
        this.searchView = searchView2;
        searchView2.setMaxWidth(Integer.MAX_VALUE);
        boolean z = false;
        ((AutoCompleteTextView) this.searchView.findViewById(C1086R.C1088id.search_src_text)).setThreshold(0);
        C5055h.m9093a(this.searchMenuItem, (C5055h.C5057b) new C5055h.C5057b() {
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                if (SearchResultFragment.this.hasSearchResults()) {
                    SearchResultFragment.this.showResultsView();
                } else if (SearchResultFragment.this.networkError) {
                    SearchResultFragment.this.showNoNetworkView();
                } else if (SearchResultFragment.this.noResults) {
                    SearchResultFragment.this.showNoResultsView();
                } else {
                    SearchResultFragment.this.forceSuggestions();
                }
                if (SearchResultFragment.this.shouldHideUpNavigation()) {
                    SearchResultFragment.this.disableUpNavigation();
                }
                boolean unused = SearchResultFragment.this.isSearchExpanded = false;
                return true;
            }

            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                SearchResultFragment.this.enableUpNavigation();
                boolean unused = SearchResultFragment.this.isSearchExpanded = true;
                return true;
            }
        });
        if (this.currentQuery.isEmpty() && !this.noResults) {
            z = true;
        }
        this.focusInSearchBar = z;
        this.searchSetupPublishSubject.onNext(null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.global_search_fragment, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.noResultsAdultContentSubject = null;
        this.noResultsPublishSubject = null;
    }

    public void onDestroyView() {
        this.searchResultList.clearAnimation();
        setupDefaultTheme();
        super.onDestroyView();
    }

    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    public C5368e<SearchQueryEvent> onQueryTextChanged() {
        return this.queryTextChangedPublisher;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(VIEW_MODEL, C12420e.m40843a(this.viewModel));
        RecyclerView recyclerView = this.searchResultList;
        if (!(recyclerView == null || recyclerView.getLayoutManager() == null)) {
            bundle.putParcelable(ALL_STORES_SEARCH_LIST_STATE, this.searchResultList.getLayoutManager().onSaveInstanceState());
        }
        bundle.putString(UNSUBMITTED_QUERY, this.unsubmittedQuery);
        if (this.isSearchExpanded) {
            bundle.putBoolean(FOCUS_IN_SEARCH, true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity2 = this.bottomNavigationActivity;
        if (bottomNavigationActivity2 != null) {
            bottomNavigationActivity2.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        findChildViews(view);
        attachAllStoresResultListDependencies();
        setupToolbar();
        setupTheme();
        setupFilters();
        this.searchResultList.setItemAnimator(new C0677e() {
            public boolean canReuseUpdatedViewHolder(RecyclerView.C0629c0 c0Var) {
                return true;
            }
        });
        this.suggestionsResultList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.trendingResultList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.suggestionsResultList.setAdapter(this.searchSuggestionsAdapter);
        this.trendingResultList.setAdapter(this.searchTrendingAdapter);
        if (this.viewModel != null) {
            restoreViewState(bundle != null ? bundle.getParcelable(ALL_STORES_SEARCH_LIST_STATE) : null);
        }
        SearchViewModel searchViewModel = this.viewModel;
        if (searchViewModel != null) {
            if (searchViewModel.getFilters() != null) {
                this.filtersView.setFilters(this.viewModel.getFilters());
            } else {
                this.viewModel.setFilters(this.filtersView.getFilters());
            }
        }
        if (bundle != null) {
            this.unsubmittedQuery = bundle.containsKey(UNSUBMITTED_QUERY) ? bundle.getString(UNSUBMITTED_QUERY) : "";
        }
        this.enableAdultContentDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setMessage(C1086R.string.are_you_adult).setPositiveButton(C1086R.string.yes).setNegativeButton(C1086R.string.f3457no).build();
        this.enableAdultContentDialogWithPin = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1086R.string.request_adult_pin).setPositiveButton(C1086R.string.all_button_ok).setNegativeButton(C1086R.string.cancel).setView(C1086R.layout.dialog_request_input).setEditText(C1086R.C1088id.input).build();
        attachPresenter(this.searchResultPresenter);
    }

    public C5368e<SearchAppResultWrapper> onViewItemClicked() {
        return this.onItemViewClickSubject;
    }

    public C5368e<C10691g> queryChanged() {
        return C10686d.m36212a(this.searchView);
    }

    public void queryEvent(C10691g gVar) {
        this.queryTextChangedPublisher.onNext(new SearchQueryEvent(gVar.mo36343c().toString(), gVar.mo36342b()));
    }

    public C5368e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    public void scrollToTop() {
        RecyclerView recyclerView = this.searchResultList;
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            recyclerView.scrollToPosition(10);
        }
        recyclerView.smoothScrollToPosition(0);
    }

    public C5368e<MenuItem> searchMenuItemClick() {
        return C10687e.m36213a(this.toolbar).mo18681d(new C4179t(this));
    }

    public C5368e<Void> searchResultsReachedBottom() {
        return recyclerViewReachedBottom(this.searchResultList);
    }

    public C5368e<Void> searchSetup() {
        return this.searchSetupPublishSubject;
    }

    public void setAdultContentSwitch(Boolean bool) {
        this.noSearchAdultContentSwitch.setChecked(bool.booleanValue());
    }

    public void setSuggestionsList(List<String> list) {
        this.searchSuggestionsAdapter.addSuggestionsFromString(list);
    }

    public void setTrendingCursor(List<String> list) {
    }

    public void setTrendingList(List<Suggestion> list) {
        this.searchTrendingAdapter.addSuggestions(list);
    }

    public void setUnsubmittedQuery(String str) {
        this.unsubmittedQuery = str;
    }

    public void setVisibilityOnRestore() {
        if (this.focusInSearchBar) {
            return;
        }
        if (hasSearchResults()) {
            showResultsView();
        } else {
            showSuggestionsView();
        }
    }

    public boolean shouldFocusInSearchBar() {
        return this.focusInSearchBar;
    }

    public boolean shouldHideUpNavigation() {
        return this.searchResultsAdapter.getItemCount() == 0 && !(this.noSearchLayout.getVisibility() == 0 && this.errorView.getVisibility() == 0);
    }

    public boolean shouldShowSuggestions() {
        return this.toolbar.getTitle().equals(getResources().getString(C1086R.string.search_hint_title));
    }

    public void showAdultContentConfirmationDialog() {
        this.enableAdultContentDialog.show();
    }

    public void showAdultContentConfirmationDialogWithPin() {
        this.enableAdultContentDialogWithPin.show();
    }

    public void showBannerAd() {
    }

    public void showGenericErrorView() {
        this.errorView.setError(ErrorView.Error.GENERIC);
        this.errorView.setVisibility(0);
        this.noSearchLayout.setVisibility(8);
        this.searchResultsLayout.setVisibility(0);
        this.filtersCardView.setVisibility(0);
        this.searchResultList.setVisibility(8);
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
        this.networkError = true;
        this.noResults = true;
    }

    public void showLoading() {
        this.progressBar.setVisibility(0);
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
    }

    public void showMoreLoading() {
        this.searchResultsAdapter.setMoreLoading();
    }

    public void showNativeAds() {
    }

    public void showNoNetworkView() {
        this.errorView.setError(ErrorView.Error.NO_NETWORK);
        this.errorView.setVisibility(0);
        this.noSearchLayout.setVisibility(8);
        this.searchResultsLayout.setVisibility(0);
        this.filtersCardView.setVisibility(0);
        this.searchResultList.setVisibility(8);
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
        this.networkError = true;
        this.noResults = true;
    }

    public void showNoResultsView() {
        this.searchHasNoResults.onNext(null);
        this.noSearchLayout.setVisibility(0);
        this.searchResultsLayout.setVisibility(0);
        this.filtersCardView.setVisibility(0);
        this.searchResultList.setVisibility(8);
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
        this.noResults = true;
        this.noResultsPublishSubject.onNext(null);
    }

    public void showResultsLoading() {
        this.errorView.setVisibility(8);
        this.noSearchLayout.setVisibility(8);
        if (!this.isFreshLoading) {
            this.isFreshLoading = true;
            LayoutAnimationController loadLayoutAnimation = AnimationUtils.loadLayoutAnimation(getContext(), C1086R.anim.exit_list_apps_anim);
            loadLayoutAnimation.getAnimation().setFillAfter(true);
            this.searchResultList.setLayoutAnimation(loadLayoutAnimation);
            this.searchResultList.scheduleLayoutAnimation();
            this.progressBarResults.setVisibility(0);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1086R.anim.slide_down_appear);
            loadAnimation.setFillAfter(true);
            this.progressBarResults.startAnimation(loadAnimation);
        }
    }

    public void showResultsView() {
        this.noResults = false;
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
        this.searchResultList.setVisibility(0);
        this.searchResultsLayout.setVisibility(0);
    }

    public void showSuggestionsView() {
        if (this.searchView.getQuery().toString().isEmpty()) {
            this.noSearchLayout.setVisibility(8);
            this.errorView.setVisibility(8);
            this.searchResultsLayout.setVisibility(8);
            this.trendingResultList.setVisibility(0);
            this.suggestionsResultList.setVisibility(8);
            return;
        }
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
        this.suggestionsResultList.setVisibility(0);
        this.trendingResultList.setVisibility(8);
    }

    public void showWrongPinErrorMessage() {
        Snackbar.m28075a(getView(), (int) C1086R.string.adult_pin_wrong, 0);
        this.noSearchAdultContentSwitch.setChecked(false);
    }

    public void toggleSuggestionsView() {
        this.suggestionsResultList.setVisibility(0);
        this.trendingResultList.setVisibility(8);
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultList.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
    }

    public void toggleTrendingView() {
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(0);
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultList.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
    }

    public C5368e<Void> toolbarClick() {
        return C10695a.m36221a(this.toolbar);
    }

    public C5368e<Void> viewHasNoResults() {
        return this.noResultsPublishSubject;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m7060a(Void voidR) {
        return false;
    }

    public static SearchResultFragment newInstance(boolean z) {
        return newInstance(new SearchQueryModel(), false, z);
    }

    /* renamed from: b */
    public /* synthetic */ void mo14327b(List list) {
        this.filtersChanged.onNext(null);
    }

    public static SearchResultFragment newInstance(SearchQueryModel searchQueryModel, boolean z) {
        SearchViewModel searchViewModel = new SearchViewModel(searchQueryModel, z);
        Bundle bundle = new Bundle();
        bundle.putParcelable(VIEW_MODEL, C12420e.m40843a(searchViewModel));
        SearchResultFragment searchResultFragment = new SearchResultFragment();
        searchResultFragment.setArguments(bundle);
        return searchResultFragment;
    }

    /* renamed from: a */
    public /* synthetic */ C5004d mo14319a(SearchQueryEvent searchQueryEvent) {
        return new C5004d(this.unsubmittedQuery, searchQueryEvent);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo14318a(MenuItem menuItem) {
        return Boolean.valueOf(menuItem.getItemId() == this.searchMenuItem.getItemId());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14321a(List list) {
        this.viewModel.setFilters(list);
    }

    public static SearchResultFragment newInstance(SearchQueryModel searchQueryModel, boolean z, boolean z2) {
        SearchViewModel searchViewModel = new SearchViewModel(searchQueryModel, z);
        Bundle bundle = new Bundle();
        bundle.putParcelable(VIEW_MODEL, C12420e.m40843a(searchViewModel));
        bundle.putBoolean(FOCUS_IN_SEARCH, z2);
        SearchResultFragment searchResultFragment = new SearchResultFragment();
        searchResultFragment.setArguments(bundle);
        return searchResultFragment;
    }

    public static SearchResultFragment newInstance(SearchQueryModel searchQueryModel, String str, String str2) {
        SearchViewModel searchViewModel = new SearchViewModel(searchQueryModel, str, str2);
        Bundle bundle = new Bundle();
        bundle.putParcelable(VIEW_MODEL, C12420e.m40843a(searchViewModel));
        SearchResultFragment searchResultFragment = new SearchResultFragment();
        searchResultFragment.setArguments(bundle);
        return searchResultFragment;
    }
}
